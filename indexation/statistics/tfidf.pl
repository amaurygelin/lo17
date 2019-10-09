#!/usr/bin/env perl

open($fd_tf,'<','tf.txt') or die("open: $!");
open($fd_idf,'<','idf.txt') or die("open: $!");

my %idf; # remake the idf hash table so that we go through it once only

while(<$fd_idf>) {
    my @splitted_line = split("\t", $_);
    $word = $splitted_line[0];
    $freq = $splitted_line[1];
    $idf{$word} = $freq;
}

while(<$fd_tf>) {
    my @splitted_line = split("\t", $_);
    $file = $splitted_line[0];
    $word = $splitted_line[1];
    $freq = $splitted_line[2];
    $tfidf = $freq * $idf{$word};
    print "$file\t$word\t$tfidf\n";
}

close($fd);