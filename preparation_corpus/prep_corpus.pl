#!/usr/bin/env perl

# This script goes through all the files of from the corpus "BULLETINS" and call prep_bulletin.pl for each of them

$Path = "OLD_BULLETINS_LO17";

open(my $logFile,'>>',"prep_corpus.log") or die "Impossible d'ouvrir le fichier prep_corpus.log\n";
my $timestamp = localtime(time);
print($logFile "--- Corpus preparetion run on $timestamp ---\n");
close($logFile) ;

opendir(my $rep, $Path) or die "Impossible d'ouvrir le répertoire $Path\n";
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

