#!/usr/bin/env perl

#This script runs all scripts for statistics files creation

`perl stop_list.pl > stop_list.txt `;
`perl newcreeFiltre.pl ./stop_list.txt > remove_stop_words.pl`;
`perl remove_stop_words.pl ../../preparation_corpus/corpus_P17_ss_balise.xml > corpus_without_stop_words.xml`;
`perl segmente_TT.pl corpus_without_stop_words.xml > tokens_without_swords.txt`;
`sort -u tokens_without_swords.txt > words_without_swords.txt`;
`sed -i '1,83d' words_without_swords.txt`;