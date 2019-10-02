#!/usr/bin/env perl

# This script goes through a file of from the corpus "BULLETINS" and creates an XML that gathers the information of the file in a structure that will be easily indexable
# The regular expressions that let us find elements in the file are proved to be sound (see commandes_unix.txt)

sub remove_html_tags {
    $html_text = $_[0]; # passing argument
    ($plain_text = $html_text) =~ s/<[^>]*>//gs;
    return $plain_text;
}

open($fd,'<',$ARGV[0]) or die("open: $!"); # open the file passed an an argument in READ mode 

$flag_image = 0; # flag to deal with images that don't have a legend
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
        $texte = $1;
    }
    if($flag_multiline_text && $_ =~ /<\/span>/) {
        $flag_multiline_text = 0; # end of multi-line text
    }
    if($flag_multiline_text && $_ !=~ /\\n/) {
        $texte = $texte.$_; # add full line to the text
    }

    if($_ =~ /<div style="text-align: center"><img src="(.*\.\w{3,4})/){
        $flag_image = 1;
        $url_image = $1;
    }
    if($flag_image && $_ =~ /<span class="style21"><strong>(.*)<\/strong>/){
        $images{$url_image} = $1;
        $flag_image = 0;
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
$size = length $balisesImages;
if($size > 0) { # if there is no images, we don't display the tag <images>
    print("<images>$balisesImages</images>\n");

}
print("<contact>$contact</contact>\n");
print("</bulletin>\n");

close($fd);