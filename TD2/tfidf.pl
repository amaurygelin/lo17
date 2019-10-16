#!/usr/bin/env perl

open($fd_tf,'<','./tf.txt') or die("open: $!");
open($fd_idf,'<','./idf.txt') or die("open: $!");

my %idf; # remake the idf hash table so that we go through it once only

while(<$fd_idf>) {
    my @splitted_line = split(' ', $_);
    $word = $splitted_line[0];
    $freq = $splitted_line[1];
    $idf{$word} = $freq;
}

while(<$fd_tf>) {
    my @splitted_line = split(' ', $_);
    $file = $splitted_line[0];
    print "file=$file";
    $word = $splitted_line[1];
    print "word=$word";
    $freq = $splitted_line[2];
    print "freq=$freq";
    $tfidf = $freq * $idf{$word};
    print "$file $word idf=$idf tfidf=$tfidf\n";
}

close($fd);