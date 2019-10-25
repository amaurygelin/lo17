#!/bin/bash

./index.pl date ./corpus_indexation.xml > inverse_file_date.txt
./index.pl rubrique ./corpus_indexation.xml > inverse_file_rubrique.txt
./index.pl urlImage ./corpus_indexation.xml > inverse_file_urlImage.txt
./index.pl email ./corpus_indexation.xml > inverse_file_email.txt
./segmente_texte.pl -f -r -n corpus_indexation.xml > lemmes_texte.txt
./segmente_titre.pl -f -r -n corpus_indexation.xml > lemmes_titre.txt
./indexTexte.pl lemmes_texte.txt > inverse_file_texte.txt
./indexTexte.pl lemmes_titre.txt > inverse_file_titre.txt