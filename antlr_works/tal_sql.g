grammar tal_sql;

SELECT : 'vouloir' ;

SELECT_COUNT : 'combien' ;

ARTICLE : 'article' ;

BULLETIN : 'bulletin' ;

AND : 'et' ;

OR : 'ou' ;

SANS 	: 'sans' ;

POINT : '.';

VIRGULE : ',' ;

MOT : 'mot' ;

AUTEUR 	: 'auteur' ;

DATE_EN	: 'date en' ;

DATE_AVANT : 'date avant';

DATE_APRES : 'date apres';

DATE_ENTRE : 'date entre';

JOUR 	: 'jour' ;
MOIS 	: 'mois' ;
ANNEE 	: 'annee' ;

RUBRIQUE : 'rubrique' ;

TITRE 	: 'titre' ;
 
STRING 	: ('A'..'Z' | 'a'..'z') ('a'..'z' | '.' | '@')+ ;

NUMERO 	: ('0'..'9')+ ;

GUILLEMET : '"' ;

WS  : (' ' |'\t' | '\r') {skip();} ;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;} : 
		(SELECT 
			{
			req_arbre.ajouteFils(new Arbre("","select distinct"));
			} 
		| SELECT_COUNT
			{
			req_arbre.ajouteFils(new Arbre("","select count(*)"));
			}
		)
		(ARTICLE
			{
			req_arbre.ajouteFils(new Arbre("","fichier"));
			}
		| BULLETIN
			{
			req_arbre.ajouteFils(new Arbre("","bulletin"));
			}
		| NUMERO
			{
			req_arbre.ajouteFils(new Arbre("","numero"));
			}
		| AUTEUR 
			{
			req_arbre.ajouteFils(new Arbre("","email.email"));
			}
		| DATE_EN
			{
			req_arbre.ajouteFils(new Arbre("","date.jour, date.mois, date.annee"));
			}
		)(MOT
			{
				req_arbre.ajouteFils(new Arbre("","from titretexte"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		| SANS MOT
			{
				req_arbre.ajouteFils(new Arbre("","from titretexte"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		ps = params_sans_mot 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		| TITRE MOT
			{
				req_arbre.ajouteFils(new Arbre("","from titre"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		ps = params_titre
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		| RUBRIQUE
			{
				req_arbre.ajouteFils(new Arbre("","from titretexte"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		ps = params_rubrique 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		| SANS RUBRIQUE
			{
				req_arbre.ajouteFils(new Arbre("","from titretexte"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		ps = params_sans_rubrique
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		| AUTEUR 
			{
				req_arbre.ajouteFils(new Arbre("","from email"));
				req_arbre.ajouteFils(new Arbre("","where"));			
			}
		ps = params_auteurs
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		| SANS AUTEUR 
			{
				req_arbre.ajouteFils(new Arbre("","from email"));
				req_arbre.ajouteFils(new Arbre("","where"));			
			}
		ps = params_sans_auteur
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		| DATE_EN
			{
				req_arbre.ajouteFils(new Arbre("","from date"));
				req_arbre.ajouteFils(new Arbre("","where"));			
			}
		ps = params_date
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);		
			}
		| DATE_AVANT 
			{
				req_arbre.ajouteFils(new Arbre("","from date"));
				req_arbre.ajouteFils(new Arbre("","where"));			
			}
		ps = params_date_avant
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);		
			}
		| DATE_APRES
			{
				req_arbre.ajouteFils(new Arbre("","from date"));
				req_arbre.ajouteFils(new Arbre("","where"));			
			}
		ps = params_date_apres
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);		
			}
		| DATE_ENTRE
			{
				req_arbre.ajouteFils(new Arbre("","from date"));
				req_arbre.ajouteFils(new Arbre("","where"));			
			}
		ps = params_date_entre
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);		
			})+


;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre, par3_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(OR par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		| AND par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		| SANS par2 = param_sans_mot
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

params_titre returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre, par3_arbre;} : 
		par1 = param_titre
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(OR par2 = param_titre
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		| AND par2 = param_titre
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		| SANS par2 = param_sans_titre
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

params_sans_mot returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre, par3_arbre;} : 
		par1 = param_sans_mot
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
;

params_rubrique returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param_rubrique 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(OR par2 = param_rubrique
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		| AND par2 = param_rubrique
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		| SANS par2 = param_sans_rubrique
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

params_sans_rubrique returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre, par3_arbre;} : 
		par1 = param_sans_rubrique
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
;

params_auteurs returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param_auteur
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(par2 = param_auteur
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			})*
;

params_sans_auteur returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre, par3_arbre;} : 
		par1 = param_sans_auteur
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
;


params_date returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param_date
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
;

params_date_avant returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param_date_avant
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
;

params_date_apres returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param_date_apres
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
;

params_date_entre returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param_date_apres
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		par2 = param_date_avant
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(par2_arbre);
			}
;

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("titretexte.mot =", "'"+a.getText()+"'"));}
;

param_titre returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("titre.mot =", "'"+a.getText()+"'"));}
;

param_sans_titre returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("titre.mot NOT LIKE", "'"+a.getText()+"'"));}
;

param_sans_mot returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("titretexte.mot NOT LIKE", "'"+a.getText()+"'"));}
;

param_rubrique returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("titretexte.rubrique =", "'"+a.getText()+"'"));}
	| GUILLEMET (a = STRING) GUILLEMET
		{ lepar_arbre.ajouteFils(new Arbre("titretexte.rubrique =", "'"+a.getText()+"'"));}
		
;

param_sans_rubrique returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("titretexte.rubrique NOT LIKE", "'"+a.getText()+"'"));}
;

param_auteur returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("email.email =", "'"+a.getText()+"'"));}
;

param_sans_auteur returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("email.email NOT LIKE", "'"+a.getText()+"'"));}
;

param_date returns [Arbre lepar_arbre = new Arbre("")] :
	(ANNEE a = NUMERO
		{ lepar_arbre.ajouteFils(new Arbre("date.annee =", "'"+a.getText()+"'"));}
	)
	| 
	(JOUR a = NUMERO
		{ lepar_arbre.ajouteFils(new Arbre("date.jour =", "'"+a.getText()+"' AND "));}
	MOIS a = NUMERO
		{ lepar_arbre.ajouteFils(new Arbre("date.mois =", "'"+a.getText()+"'"));}
	)
	|
	(JOUR a = NUMERO
		{ lepar_arbre.ajouteFils(new Arbre("date.jour =", "'"+a.getText()+"' AND "));}
	MOIS a = NUMERO
		{ lepar_arbre.ajouteFils(new Arbre("date.mois =", "'"+a.getText()+"' AND "));}
	ANNEE a = NUMERO
		{ lepar_arbre.ajouteFils(new Arbre("date.annee =", "'"+a.getText()+"'"));}
	)
	|
	(MOIS a = NUMERO
		{ lepar_arbre.ajouteFils(new Arbre("date.mois =", "'"+a.getText()+"' AND "));}
	ANNEE a = NUMERO
		{ lepar_arbre.ajouteFils(new Arbre("date.annee =", "'"+a.getText()+"'"));}
	)
;

param_date_avant returns [Arbre lepar_arbre = new Arbre("")] : 
	(ANNEE a = NUMERO
		{ lepar_arbre.ajouteFils(new Arbre("date.annee <", "'"+a.getText()+"'"));}
	)
;

param_date_apres returns [Arbre lepar_arbre = new Arbre("")] :
	(ANNEE a = NUMERO
		{ lepar_arbre.ajouteFils(new Arbre("date.annee >", "'"+a.getText()+"'"));}
	)
;
