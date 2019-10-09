#!/usr/bin/env perl

open($fd,'<','df.txt') or die("open: $!");

while(<$fd>) {
    if($_ =~ /(.*)\t(.*)/) {
        $df_perc = $2/362*100; 
        print "$1\t$df_perc\n";
    }
}