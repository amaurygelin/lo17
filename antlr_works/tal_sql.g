grammar tal_sql;

SELECT : 'vouloir' ;

SELECT_COUNT : 'combien' | 'nombre' ;	

ARTICLE : 'article' ;

BULLETIN : 'bulletin' ;

AND : 'et' ;

OR : 'ou' ;

SANS 	: 'sans' | 'sauf' ;

POINT : '.';

VIRGULE : ',' ;

MOT : 'mot' ;

AUTEUR 	: 'auteur' | 'écrire' ;

DATE 	: 'date' ;

DATE_AVANT : 'date avant';

DATE_APRES : 'date apres';

RUBRIQUE : 'rubrique' ;
 
STRING 	: ('A'..'Z' | 'a'..'z') ('a'..'z')+ ;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
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
			})
		(ARTICLE
			{
			req_arbre.ajouteFils(new Arbre("","article"));
			}
		| BULLETIN
			{
			req_arbre.ajouteFils(new Arbre("","bulletin"));
			}
		| AUTEUR 
			{
			req_arbre.ajouteFils(new Arbre("","auteur"));
			}
		| DATE
			{
			req_arbre.ajouteFils(new Arbre("","date"));
			})
		(MOT
			{
				req_arbre.ajouteFils(new Arbre("","from titre, texte"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		| RUBRIQUE
			{
				req_arbre.ajouteFils(new Arbre("","from rubrique"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		ps = params_rubrique 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		| AUTEUR 
			{
				req_arbre.ajouteFils(new Arbre("","from auteur"));
				req_arbre.ajouteFils(new Arbre("","where"));			
			}
		ps = params_auteurs
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		| DATE 
			{
				req_arbre.ajouteFils(new Arbre("","from article"));
				req_arbre.ajouteFils(new Arbre("","where"));			
			}
		ps = params_date
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);		
			}
		| DATE_AVANT 
			{
				req_arbre.ajouteFils(new Arbre("","from article"));
				req_arbre.ajouteFils(new Arbre("","where"));			
			}
		ps = params_date_avant
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);		
			}
		| DATE_APRES
			{
				req_arbre.ajouteFils(new Arbre("","from article"));
				req_arbre.ajouteFils(new Arbre("","where"));			
			}
		ps = params_date_apres
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
			})*
			
		(SANS par3 = param
			{
				par3_arbre = $par3.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND NOT"));
				les_pars_arbre.ajouteFils(par3_arbre);
			}
		)?	
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
			})*
;

params_auteurs returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param_auteur
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(OR par2 = param_auteur
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		| AND par2 = param_auteur
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			})*
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

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));}
;

param_rubrique returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("rubrique =", "'"+a.getText()+"'"));}
;

param_auteur returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("auteur =", "'"+a.getText()+"'"));}
;

param_date returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("date =", "'"+a.getText()+"'"));}
;

param_date_avant returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("date <", "'"+a.getText()+"'"));}
;

param_date_apres returns [Arbre lepar_arbre = new Arbre("")] :
	a = STRING
		{ lepar_arbre.ajouteFils(new Arbre("date >", "'"+a.getText()+"'"));}
;

