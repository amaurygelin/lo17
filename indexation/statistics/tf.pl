#!/usr/bin/env perl

open($fd,'<','../tokensFiles.txt') or die("open: $!"); 

my %tf;

# we compute the TF of each pair Token/Document in an hash table
while(<$fd>) {
    if($_ =~ /(.*)\t(.*)/) {
        $tf{"$2\t$1"} += 1;
    }
}

# we loop over the hash table to print 3 columns - File,Token,TF
while( my ($key,$value) = each(%tf) ) {
    # key is composed of the File and the Token
    # value is the TF
    my @splitted_key = split("\t", $key);
    print "$splitted_key[0]\t$splitted_key[1]\t$value\n";
}

close($fd);