#!/usr/bin/env perl

#This script runs all scripts for statistics files creation

`perl successeurs_P16.pl ../stop_list/words_without_swords.txt > successors.txt`;
`perl filtronc_P16.pl -v successors.txt stemming.txt`;