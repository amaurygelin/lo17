#!/usr/bin/perl

$separ = "[ \\t',.;:?\\/\"`+*^\\(\\)\\[\\]<>-]";
$nonsepar = "[^ \\t',.;:?\\/\"`+*^\\(\\)\\[\\]<>-]";
print "#!/usr/bin/perl\n\n";
print "while (<>) {\n";
# print "\tif (/<resumeArticle>/ || /<titreArticle>/) {\n";	
print "\tif (/<texte>/ || /<titre>/) {\n";
print "\t\ttr/A-Z/a-z/;\n"; # uppercase characters replaced by lowercase
# Translation works on a per character basis, replacing each item in the first list with the character at the same position in the second list. 
#print "\t\ts/($separ)$nonsepar$nonsepar?($separ)/\$1\$2/g;\n";
while (<>) {
	chop;
	s/ //g;
	($mot,$remp) = split (/\t/);
	if ($mot ne $remp) {
		print "\t\ts/($separ)$mot($separ)/\$1$remp\$2/g;\n";
		}
	}
#print "\t\ts/resumearticle/resumeArticle/g;\n";
#print "\t\ts/titrearticle/titreArticle/g;\n";
#print "\t\ts/titrebreve/titreBreve/g;\n";
print "\t\t}\n\tprint \$_\n";
print "\t}\n";
