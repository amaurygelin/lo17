#!/usr/bin/env perl

#This script runs all scripts for statistics files creation

`perl tf.pl > tf.txt`;
`perl df.pl > df.txt`;
`perl df_perc.pl > df_perc.txt`;
`perl idf.pl > idf.txt`;
`perl tfidf.pl > tfidf.txt`;