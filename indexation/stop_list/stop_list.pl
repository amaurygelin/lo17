#!/usr/bin/env perl

open($fd,'<','./df_perc.txt') or die("open: $!");

while(<$fd>) {
    if($_ =~ /(.*)\t(.*)/) {
        if($2 >= 50) { 
            # if the word appears in at least 50% of the documents, add it to the stop list
            print("$1\n");
        }
    }
}