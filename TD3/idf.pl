#!/usr/bin/env perl

open($fd,'<','./df.txt') or die("open: $!"); 

sub log10 {
    my $n = shift;
    return log($n)/log(10);
}

while(<$fd>) {
    if($_ =~ /(.*)\t(.*)/) {
        $idf = log10(326 / $2);
        print "$1\t$idf\n";
    }
}

close($fd);