#!/usr/bin/env perl

open($fd,'<','../stemming/corpus_with_lemmes.xml') or die("open: $!"); 

while(<$fd>) {
    print($_);
    if($_ =~ /<contact>(.*)mailto:(.*?)">(.*?)<\/a>/) {
        if($2) {print("<email>$2</email>\n");}
        # If no email, we don't put an email tag
    }

}

close($fd);