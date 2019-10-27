#!/usr/bin/env perl

open($fd,'<','../statistics/df_perc.txt') or die("open: $!");

use Scalar::Util qw(looks_like_number);

# The threshould 35.4 has been tuned manually
# We looked at sorted df_percentage and noticed that the first valuable word is before 35.4%
# We don't consider "recherche" and "chercheurs" as valuable words because all articles are about research. 
# We also put numbers into the stop list.

while(<$fd>) {
    if($_ =~ /(.*)\t(.*)/) {
        if(looks_like_number($1) || $2 >= 35.4) { 
            print("$1\n");
        }
    }
}