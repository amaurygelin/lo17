#!/usr/bin/env perl

open($fd,'<','./tf.txt') or die("open: $!");

my %df;

while(<$fd>) {
    if($_ =~ /(.*)\t(.*)\t(.*)/) {
        $df{$2} += 1;
    }
}

while( my ($key,$value) = each(%df) ) {
    print "$key\t$df{$key}\n";
}