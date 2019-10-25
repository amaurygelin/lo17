#!/usr/bin/env perl

open($fd,'<','../statistics/df_perc.txt') or die("open: $!");

while(<$fd>) {
    if($_ =~ /(.*)\t(.*)/) {
        if($2 >= 50) { 
            #TODO: remplacer le 50% de seuil en regardant à l'oeil le premier mot qui a l'air interessant dans la liste décroissante de df
            # if the word appears in at least 50% of the documents, add it to the stop list
            print("$1\n");
        }
    }
}