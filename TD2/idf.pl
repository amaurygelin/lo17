#!/usr/bin/env perl

open($fd,'<',$ARGV[0]) or die("open: $!"); # open the file passed an an argument in READ mode 

sub log10 {
    my $n = shift;
    return log($n)/log(10);
}

my %idf;

while(<$fd>) {
    chomp; #by annly
    $idf{$_} += 1;
}

while( my ($key,$value) = each(%idf) ) {
    $idft = log10(326 / $value); # there are 326 documents (proven with a grep)
    print "$key $idft\n";
}

close($fd);