#!/usr/bin/env perl

#fournir des preuves qu'on a bien choppé toutes les balises
#convertir le texte avec entités html en texte avec la fonction convert.pl fournie
#pour le texte, virer toutes les balises à l'intérieur + extraire les images
    #recupérer tout le bloc de texte
    #boucler sur le texte pour enlever chaque image

open($fd,'<','OLD_BULLETINS_LO17/75458.htm') or die("open: $!");
#open($fd,'<',$ARGV[1]) or die("open: $!");

$flag_image = 0;
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
    if($_ =~ /<p class="style96"><span class="style95">(.*)<\/span>/) {
        $texte = $1;
    }
    if($_ =~ /<div style="text-align: center"><img src="(.*\.\w{3,4})/){
        $flag_image = 1 ;
        $url_image = $1 ;
        #$images{$1} = $2;
    }
    if ($flag_image && $_ =~ /<span class="style21"><strong>(.*)<\/strong>/){
        $images{$url_image} = $1;
        #print("legende: $1");
        $flag_image = 0 ;
    }
    if ($_ =~ /<p class="style44"><span class="style85">(.*)<\/span>/){
        $contact = $1;
    }
}
print("<bulletin>\n");
print("<fichier>$fichier</fichier>\n");
print("<numero>$numero</numero>\n");
print("<date>$date</date>\n");
print("<rubrique>$rubrique</rubrique>\n");
print("<titre>$titre</titre>\n");
#print("<texte>$texte<texte>\n");
while (($url, $legende) = each(%images)) {
    $balisesImages = $balisesImages."<image><urlImage>$url</urlImage><legendeImage>$legende</legendeImage></image>";
}
print("<images>$balisesImages</images>\n");
print("<contact>$contact</contact>\n");
print("</bulletin>\n");


close($fd);