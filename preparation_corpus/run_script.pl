#!/usr/bin/env perl

#This script runs all scripts for corpus preparation without UTF8 problems

`perl prep_corpus.pl > test2.xml`;
`perl convert.pl test2.xml > testF.xml`;