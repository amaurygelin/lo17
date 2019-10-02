#!/usr/bin/env perl

open($fd,'<',$ARGV[0]) or die("open: $!"); # open the file passed an an argument in READ mode 

my %tf;

while(<$fd>) {
    if($_ =~ /(.*)\t(.*)/) {
        $tf{$2.' '.$1} += 1;
    }
}

while( my ($key,$value) = each(%tf) ) {
    my @splitted_key = split(' ', $key);
    print "$splitted_key[0] $splitted_key[1] $value\n";
}

close($fd);