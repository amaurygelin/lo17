#!/usr/bin/env perl

# This script goes through a file of from the corpus "BULLETINS" and creates an XML that gathers the information of the file in a structure that will be easily indexable
# The regular expressions that let us find elements in the file are proved to be sound (see commandes_unix.txt)

# TO DO
# vérifier qu'on a bien récupéré tout le texte

sub remove_html_tags {
    $html_text = $_[0]; # passing argument
    ($plain_text = $html_text) =~ s/<[^>]*>//gs;
    return $plain_text;
}

open($fd,'<',$ARGV[0]) or die("open: $!"); # open the file passed as an argument in READ mode 
open(my $logFile,'>>',"prep_corpus.log") or die "Impossible d'ouvrir le fichier prep_corpus.log\n";

$flag_image = 0; #flag to deal with images that don't have a legend
$flag_credit = 0; #flag to check if there are credits to an image
$flag_multiline_text = 0;
$texte = '';

# loop over each line of the file
while(<$fd>) { 
    if($_ =~ /<span class="style95" style="color:inherit">(\d+)/) {
        $fichier = $1;
    }
    if($_ =~ /<span class="style32">BE France (\d+)/) {
        $numero = $1;
    }
    if($_ =~ /<span class="style42">.*(\d+\/\d+\/\d+)/) {
        $date = $1;
    }
    if($_ =~ /<p class="style96"><span class="style42">(.*)<br><\/span>/) {
        $rubrique = $1;
    }
    if($_ =~ /<span class="style17">(.*)<\/span>/) {
        $titre = $1;
    }

    if($_ =~ /<p class="style96"><span class="style95">(.*)<\/span>/) { # full text on one line
        $texte = $1;
    }

    if($_ =~ /<p class="style96"><span class="style95">(.*)<br \/>/) { # multi-line text
        $flag_multiline_text = 1;
    }
    if($flag_multiline_text && $_ =~ /<\/p>/) { #to do : vérifier que balise p est partout pour le texte
        $flag_multiline_text = 0; # end of multi-line text
    }
    if($flag_multiline_text && $_ !=~ /\\n/) {
        if($flag_multiline_text && $_ =~ /<div style="text-align: center"><img src="(.*\.\w{3,4})/) {
            $url_image = $1;
            $images{$1} = "";  # in case the image doesn't have a legend, still in the hashtable
            $flag_image = 1;
            $flag_credit = 1;
        } elsif($flag_image && $_ =~ /<span class="style21"><strong>(.*)<\/strong>/){
            $images{$url_image} = $1;
            $flag_image = 0;
        } elsif($flag_credit && $_ =~ /<span class="style88">(.*)<\/span>/){ 
            $flag_credit = 0;
            next; # remove credits to image if there are
        } else {
            $texte = $texte.$_; # add full line to the text
        }
    }  
    if($_ =~ /<p class="style44"><span class="style85">(.*)<\/span>/){
        $contact = $1;
    }
}

print("<bulletin>\n");
print("<fichier>$fichier</fichier>\n");
print("<numero>$numero</numero>\n");
print("<date>$date</date>\n");
print("<rubrique>$rubrique</rubrique>\n");
print("<titre>$titre</titre>\n");
$texte = remove_html_tags($texte);
print("<texte>$texte</texte>\n");
while(($url, $legende) = each(%images)) {
    $balisesImages = $balisesImages."<image><urlImage>$url</urlImage><legendeImage>$legende</legendeImage></image>";
}
print("<images>$balisesImages</images>\n");
print("<contact>$contact</contact>\n");
print("</bulletin>\n");

if ($fichier eq "" || $numero eq "" || $date eq "" || $rubrique eq "" || $titre eq "" || $texte eq ""){
    print($logFile "Problem with file $ARGV[0] - missing information\n");
} else {
    print($logFile "OK - $ARGV[0]\n");
}

close($fd);
close($logFile) ;
