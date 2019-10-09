#!/usr/bin/env perl

# This script goes through all the files of from the corpus "BULLETINS" and call prep_bulletin.pl for each of them
# ./prep_corpus > SomeFile.xml (to create an XML file that contains the ouput) 
# ./convert.pl test.xml > FinalFile.xml (to remove the HTML special characters of the output)

$Path = "OLD_BULLETINS_LO17";

opendir(my $rep, $Path) or die "Impossible d'ouvrir le repertoire $Path\n";
my @files = grep { $_ =~ /\d{5}/ } readdir($rep);
closedir ($rep);

print("<corpus>\n");

foreach my $file(@files) {
    if ( -f "$Path/$file") {
        $filePath = "$Path/$file";
        system($^X, "prep_bulletin.pl", ($filePath));
    }
}

print("</corpus>\n");
