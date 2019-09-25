#!/usr/bin/env perl

$Path = "OLD_BULLETINS_LO17";

opendir(my $rep, $Path) or die "Impossible d'ouvrir le repertoire $Path\n";
#my @files = grep { !/^\.\.?$/ } readdir($rep);
my @files = grep { $_ =~ /\d{5}/ } readdir($rep);
closedir ($rep);

print("<corpus>\n");

foreach my $file(@files) {
    if ( -f "$Path/$file") {
        #`prep_bulletin.pl $file`;
        `prep_bulletin.pl`;
    }
}

print("</corpus>\n");


