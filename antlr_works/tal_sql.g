grammar tal_sql;

SELECT : 'vouloir' | 'aimer' | 'souhaiter' | 'donner' | 'afficher' | 'trouver' | 'lister' | 'chercher' | 'retourner' | 'retrouver' | 'quel' | 'qui' ;

SELECT_COUNT : 'combien' | 'nombre' | 'le plus' ;	

ARTICLE : 'article'
;

BULLETIN : 'bulletin'
;

CONJ : 'et' | 'ou'
;

POINT : '.'
;

MOT : 'mot' | 'contenir' | 'parler' | 'traiter' | 'citer' | 'concerner' | 'sur' | 'posséder' | 'sujet'
;

AUTEUR 	: 'auteur' | 'écrire' ;

DATE 	: 'date' ;

RUBRIQUE : 'rubrique' ;
 
WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

STRING 	: ('A'..'Z' | 'a'..'z') ('a'..'z')+
;

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
			} )?
		(RUBRIQUE
			{
				req_arbre.ajouteFils(new Arbre("","from rubrique"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		ps = params_rubrique 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			} )?
		(AUTEUR 
			{
				req_arbre.ajouteFils(new Arbre("","from auteur"));
				req_arbre.ajouteFils(new Arbre("","where"));			
			}
		ps = params_auteurs
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			})?

;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(CONJ par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

params_rubrique returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param_rubrique 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(CONJ par2 = param_rubrique
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

params_auteurs returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param_auteur
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(CONJ par2 = param_auteur
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
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



