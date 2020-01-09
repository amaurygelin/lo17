// $ANTLR 3.5.1 C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g 2020-01-09 16:09:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ANNEE", "ARTICLE", "AUTEUR", 
		"BULLETIN", "DATE_APRES", "DATE_AVANT", "DATE_EN", "DATE_ENTRE", "GUILLEMET", 
		"JOUR", "MOIS", "MOT", "NUMERO", "OR", "POINT", "RUBRIQUE", "SANS", "SELECT", 
		"SELECT_COUNT", "STRING", "VIRGULE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ANNEE=5;
	public static final int ARTICLE=6;
	public static final int AUTEUR=7;
	public static final int BULLETIN=8;
	public static final int DATE_APRES=9;
	public static final int DATE_AVANT=10;
	public static final int DATE_EN=11;
	public static final int DATE_ENTRE=12;
	public static final int GUILLEMET=13;
	public static final int JOUR=14;
	public static final int MOIS=15;
	public static final int MOT=16;
	public static final int NUMERO=17;
	public static final int OR=18;
	public static final int POINT=19;
	public static final int RUBRIQUE=20;
	public static final int SANS=21;
	public static final int SELECT=22;
	public static final int SELECT_COUNT=23;
	public static final int STRING=24;
	public static final int VIRGULE=25;
	public static final int WS=26;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:47:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:48:25: (r= requete )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:49:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes277);
			r=requete();
			state._fsp--;


							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:56:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT | SELECT_COUNT ) ( ARTICLE | BULLETIN | NUMERO | AUTEUR | DATE_EN ) ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:57:26: ( ( SELECT | SELECT_COUNT ) ( ARTICLE | BULLETIN | NUMERO | AUTEUR | DATE_EN ) ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:58:3: ( SELECT | SELECT_COUNT ) ( ARTICLE | BULLETIN | NUMERO | AUTEUR | DATE_EN ) ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+
			{
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:58:3: ( SELECT | SELECT_COUNT )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SELECT) ) {
				alt1=1;
			}
			else if ( (LA1_0==SELECT_COUNT) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:58:4: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete305); 

								req_arbre.ajouteFils(new Arbre("","select distinct"));
								
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:62:5: SELECT_COUNT
					{
					match(input,SELECT_COUNT,FOLLOW_SELECT_COUNT_in_requete318); 

								req_arbre.ajouteFils(new Arbre("","select count(*)"));
								
					}
					break;

			}

			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:66:3: ( ARTICLE | BULLETIN | NUMERO | AUTEUR | DATE_EN )
			int alt2=5;
			switch ( input.LA(1) ) {
			case ARTICLE:
				{
				alt2=1;
				}
				break;
			case BULLETIN:
				{
				alt2=2;
				}
				break;
			case NUMERO:
				{
				alt2=3;
				}
				break;
			case AUTEUR:
				{
				alt2=4;
				}
				break;
			case DATE_EN:
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:66:4: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete329); 

								req_arbre.ajouteFils(new Arbre("","fichier"));
								
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:70:5: BULLETIN
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete340); 

								req_arbre.ajouteFils(new Arbre("","bulletin"));
								
					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:74:5: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_requete351); 

								req_arbre.ajouteFils(new Arbre("","numero"));
								
					}
					break;
				case 4 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:78:5: AUTEUR
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete362); 

								req_arbre.ajouteFils(new Arbre("","email.email"));
								
					}
					break;
				case 5 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:82:5: DATE_EN
					{
					match(input,DATE_EN,FOLLOW_DATE_EN_in_requete374); 

								req_arbre.ajouteFils(new Arbre("","date.jour, date.mois, date.annee"));
								
					}
					break;

			}

			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:86:4: ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=11;
				switch ( input.LA(1) ) {
				case MOT:
					{
					alt3=1;
					}
					break;
				case SANS:
					{
					switch ( input.LA(2) ) {
					case MOT:
						{
						alt3=2;
						}
						break;
					case RUBRIQUE:
						{
						alt3=4;
						}
						break;
					case AUTEUR:
						{
						alt3=6;
						}
						break;
					}
					}
					break;
				case RUBRIQUE:
					{
					alt3=3;
					}
					break;
				case AUTEUR:
					{
					alt3=5;
					}
					break;
				case DATE_EN:
					{
					alt3=7;
					}
					break;
				case DATE_AVANT:
					{
					alt3=8;
					}
					break;
				case DATE_APRES:
					{
					alt3=9;
					}
					break;
				case DATE_ENTRE:
					{
					alt3=10;
					}
					break;
				}
				switch (alt3) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:86:5: MOT ps= params
					{
					match(input,MOT,FOLLOW_MOT_in_requete385); 

									req_arbre.ajouteFils(new Arbre("","from titretexte"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_params_in_requete398);
					ps=params();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:96:5: SANS MOT ps= params_sans_mot
					{
					match(input,SANS,FOLLOW_SANS_in_requete410); 
					match(input,MOT,FOLLOW_MOT_in_requete412); 

									req_arbre.ajouteFils(new Arbre("","from titretexte"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_params_sans_mot_in_requete425);
					ps=params_sans_mot();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:106:5: RUBRIQUE ps= params_rubrique
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete437); 

									req_arbre.ajouteFils(new Arbre("","from titretexte"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_params_rubrique_in_requete450);
					ps=params_rubrique();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 4 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:116:5: SANS RUBRIQUE ps= params_sans_rubrique
					{
					match(input,SANS,FOLLOW_SANS_in_requete462); 
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete464); 

									req_arbre.ajouteFils(new Arbre("","from titretexte"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_params_sans_rubrique_in_requete477);
					ps=params_sans_rubrique();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 5 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:126:5: AUTEUR ps= params_auteurs
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete488); 

									req_arbre.ajouteFils(new Arbre("","from email"));
									req_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_params_auteurs_in_requete502);
					ps=params_auteurs();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 6 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:136:5: SANS AUTEUR ps= params_sans_auteur
					{
					match(input,SANS,FOLLOW_SANS_in_requete513); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete515); 

									req_arbre.ajouteFils(new Arbre("","from email"));
									req_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_params_sans_auteur_in_requete529);
					ps=params_sans_auteur();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 7 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:146:5: DATE_EN ps= params_date
					{
					match(input,DATE_EN,FOLLOW_DATE_EN_in_requete540); 

									req_arbre.ajouteFils(new Arbre("","from date"));
									req_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_params_date_in_requete553);
					ps=params_date();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);		
								
					}
					break;
				case 8 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:156:5: DATE_AVANT ps= params_date_avant
					{
					match(input,DATE_AVANT,FOLLOW_DATE_AVANT_in_requete564); 

									req_arbre.ajouteFils(new Arbre("","from date"));
									req_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_params_date_avant_in_requete578);
					ps=params_date_avant();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);		
								
					}
					break;
				case 9 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:166:5: DATE_APRES ps= params_date_apres
					{
					match(input,DATE_APRES,FOLLOW_DATE_APRES_in_requete589); 

									req_arbre.ajouteFils(new Arbre("","from date"));
									req_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_params_date_apres_in_requete602);
					ps=params_date_apres();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);		
								
					}
					break;
				case 10 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:176:5: DATE_ENTRE ps= params_date_entre
					{
					match(input,DATE_ENTRE,FOLLOW_DATE_ENTRE_in_requete613); 

									req_arbre.ajouteFils(new Arbre("","from date"));
									req_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_params_date_entre_in_requete626);
					ps=params_date_entre();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);		
								
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "params"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:190:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( OR par2= param | AND par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:191:52: (par1= param ( OR par2= param | AND par2= param )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:192:3: par1= param ( OR par2= param | AND par2= param )*
			{
			pushFollow(FOLLOW_param_in_params661);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:197:3: ( OR par2= param | AND par2= param )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==OR) ) {
					alt4=1;
				}
				else if ( (LA4_0==AND) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:197:4: OR par2= param
					{
					match(input,OR,FOLLOW_OR_in_params672); 
					pushFollow(FOLLOW_param_in_params678);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:203:5: AND par2= param
					{
					match(input,AND,FOLLOW_AND_in_params689); 
					pushFollow(FOLLOW_param_in_params695);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "params_sans_mot"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:211:1: params_sans_mot returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_sans_mot ;
	public final Arbre params_sans_mot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:212:52: (par1= param_sans_mot )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:213:3: par1= param_sans_mot
			{
			pushFollow(FOLLOW_param_sans_mot_in_params_sans_mot728);
			par1=param_sans_mot();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_sans_mot"



	// $ANTLR start "params_rubrique"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:220:1: params_rubrique returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_rubrique ( OR par2= param_rubrique | AND par2= param_rubrique )* ;
	public final Arbre params_rubrique() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:221:40: (par1= param_rubrique ( OR par2= param_rubrique | AND par2= param_rubrique )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:222:3: par1= param_rubrique ( OR par2= param_rubrique | AND par2= param_rubrique )*
			{
			pushFollow(FOLLOW_param_rubrique_in_params_rubrique759);
			par1=param_rubrique();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:227:3: ( OR par2= param_rubrique | AND par2= param_rubrique )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==OR) ) {
					alt5=1;
				}
				else if ( (LA5_0==AND) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:227:4: OR par2= param_rubrique
					{
					match(input,OR,FOLLOW_OR_in_params_rubrique770); 
					pushFollow(FOLLOW_param_rubrique_in_params_rubrique776);
					par2=param_rubrique();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:233:5: AND par2= param_rubrique
					{
					match(input,AND,FOLLOW_AND_in_params_rubrique787); 
					pushFollow(FOLLOW_param_rubrique_in_params_rubrique793);
					par2=param_rubrique();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_rubrique"



	// $ANTLR start "params_sans_rubrique"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:242:1: params_sans_rubrique returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_sans_rubrique ;
	public final Arbre params_sans_rubrique() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:243:52: (par1= param_sans_rubrique )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:244:3: par1= param_sans_rubrique
			{
			pushFollow(FOLLOW_param_sans_rubrique_in_params_sans_rubrique829);
			par1=param_sans_rubrique();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_sans_rubrique"



	// $ANTLR start "params_auteurs"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:251:1: params_auteurs returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_auteur (par2= param_auteur )* ;
	public final Arbre params_auteurs() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:252:40: (par1= param_auteur (par2= param_auteur )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:253:3: par1= param_auteur (par2= param_auteur )*
			{
			pushFollow(FOLLOW_param_auteur_in_params_auteurs860);
			par1=param_auteur();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:258:3: (par2= param_auteur )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==STRING) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:258:4: par2= param_auteur
					{
					pushFollow(FOLLOW_param_auteur_in_params_auteurs874);
					par2=param_auteur();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_auteurs"



	// $ANTLR start "params_sans_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:266:1: params_sans_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_sans_auteur ;
	public final Arbre params_sans_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:267:52: (par1= param_sans_auteur )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:268:3: par1= param_sans_auteur
			{
			pushFollow(FOLLOW_param_sans_auteur_in_params_sans_auteur907);
			par1=param_sans_auteur();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_sans_auteur"



	// $ANTLR start "params_date"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:276:1: params_date returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date ;
	public final Arbre params_date() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:277:40: (par1= param_date )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:278:3: par1= param_date
			{
			pushFollow(FOLLOW_param_date_in_params_date939);
			par1=param_date();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_date"



	// $ANTLR start "params_date_avant"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:285:1: params_date_avant returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_avant ;
	public final Arbre params_date_avant() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:286:40: (par1= param_date_avant )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:287:3: par1= param_date_avant
			{
			pushFollow(FOLLOW_param_date_avant_in_params_date_avant970);
			par1=param_date_avant();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_date_avant"



	// $ANTLR start "params_date_apres"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:294:1: params_date_apres returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_apres ;
	public final Arbre params_date_apres() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:295:40: (par1= param_date_apres )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:296:3: par1= param_date_apres
			{
			pushFollow(FOLLOW_param_date_apres_in_params_date_apres1001);
			par1=param_date_apres();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_date_apres"



	// $ANTLR start "params_date_entre"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:303:1: params_date_entre returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_apres par2= param_date_avant ;
	public final Arbre params_date_entre() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:304:40: (par1= param_date_apres par2= param_date_avant )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:305:3: par1= param_date_apres par2= param_date_avant
			{
			pushFollow(FOLLOW_param_date_apres_in_params_date_entre1032);
			par1=param_date_apres();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			pushFollow(FOLLOW_param_date_avant_in_params_date_entre1045);
			par2=param_date_avant();
			state._fsp--;


							par2_arbre = par2;
							les_pars_arbre.ajouteFils(par2_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_date_entre"



	// $ANTLR start "param"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:317:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:317:51: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:318:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param1068); 
			 lepar_arbre.ajouteFils(new Arbre("titretexte.mot =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param"



	// $ANTLR start "param_sans_mot"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:322:1: param_sans_mot returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_mot() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:322:60: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:323:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_mot1090); 
			 lepar_arbre.ajouteFils(new Arbre("titretexte.mot NOT LIKE", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_sans_mot"



	// $ANTLR start "param_rubrique"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:327:1: param_rubrique returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= STRING | GUILLEMET (a= STRING ) GUILLEMET );
	public final Arbre param_rubrique() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:327:60: (a= STRING | GUILLEMET (a= STRING ) GUILLEMET )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==STRING) ) {
				alt7=1;
			}
			else if ( (LA7_0==GUILLEMET) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:328:2: a= STRING
					{
					a=(Token)match(input,STRING,FOLLOW_STRING_in_param_rubrique1112); 
					 lepar_arbre.ajouteFils(new Arbre("titretexte.rubrique =", "'"+a.getText()+"'"));
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:330:4: GUILLEMET (a= STRING ) GUILLEMET
					{
					match(input,GUILLEMET,FOLLOW_GUILLEMET_in_param_rubrique1121); 
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:330:14: (a= STRING )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:330:15: a= STRING
					{
					a=(Token)match(input,STRING,FOLLOW_STRING_in_param_rubrique1128); 
					}

					match(input,GUILLEMET,FOLLOW_GUILLEMET_in_param_rubrique1131); 
					 lepar_arbre.ajouteFils(new Arbre("titretexte.rubrique =", "'"+a.getText()+"'"));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_rubrique"



	// $ANTLR start "param_sans_rubrique"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:335:1: param_sans_rubrique returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_rubrique() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:335:65: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:336:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_rubrique1156); 
			 lepar_arbre.ajouteFils(new Arbre("titretexte.rubrique NOT LIKE", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_sans_rubrique"



	// $ANTLR start "param_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:340:1: param_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:340:58: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:341:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_auteur1178); 
			 lepar_arbre.ajouteFils(new Arbre("email.email =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_auteur"



	// $ANTLR start "param_sans_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:345:1: param_sans_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:345:63: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:346:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_auteur1200); 
			 lepar_arbre.ajouteFils(new Arbre("email.email NOT LIKE", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_sans_auteur"



	// $ANTLR start "param_date"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:350:1: param_date returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ( ANNEE a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) );
	public final Arbre param_date() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:350:56: ( ( ANNEE a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) )
			int alt8=4;
			switch ( input.LA(1) ) {
			case ANNEE:
				{
				alt8=1;
				}
				break;
			case JOUR:
				{
				int LA8_2 = input.LA(2);
				if ( (LA8_2==NUMERO) ) {
					int LA8_4 = input.LA(3);
					if ( (LA8_4==MOIS) ) {
						int LA8_5 = input.LA(4);
						if ( (LA8_5==NUMERO) ) {
							int LA8_6 = input.LA(5);
							if ( (LA8_6==EOF||LA8_6==AUTEUR||(LA8_6 >= DATE_APRES && LA8_6 <= DATE_ENTRE)||LA8_6==MOT||(LA8_6 >= RUBRIQUE && LA8_6 <= SANS)) ) {
								alt8=2;
							}
							else if ( (LA8_6==ANNEE) ) {
								alt8=3;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 8, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MOIS:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:351:2: ( ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:351:2: ( ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:351:3: ANNEE a= NUMERO
					{
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date1219); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1225); 
					 lepar_arbre.ajouteFils(new Arbre("date.annee =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:355:2: ( JOUR a= NUMERO MOIS a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:355:2: ( JOUR a= NUMERO MOIS a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:355:3: JOUR a= NUMERO MOIS a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date1240); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1246); 
					 lepar_arbre.ajouteFils(new Arbre("date.jour =", "'"+a.getText()+"' AND "));
					match(input,MOIS,FOLLOW_MOIS_in_param_date1253); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1259); 
					 lepar_arbre.ajouteFils(new Arbre("date.mois =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:361:2: ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:361:2: ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:361:3: JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date1273); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1279); 
					 lepar_arbre.ajouteFils(new Arbre("date.jour =", "'"+a.getText()+"' AND "));
					match(input,MOIS,FOLLOW_MOIS_in_param_date1286); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1292); 
					 lepar_arbre.ajouteFils(new Arbre("date.mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date1299); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1305); 
					 lepar_arbre.ajouteFils(new Arbre("date.annee =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 4 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:369:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:369:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:369:3: MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,MOIS,FOLLOW_MOIS_in_param_date1319); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1325); 
					 lepar_arbre.ajouteFils(new Arbre("date.mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date1332); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1338); 
					 lepar_arbre.ajouteFils(new Arbre("date.annee =", "'"+a.getText()+"'"));
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_date"



	// $ANTLR start "param_date_avant"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:376:1: param_date_avant returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ( ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) );
	public final Arbre param_date_avant() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:376:62: ( ( ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ANNEE) ) {
				alt9=1;
			}
			else if ( (LA9_0==MOIS) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:377:2: ( ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:377:2: ( ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:377:3: ANNEE a= NUMERO
					{
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date_avant1361); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant1367); 
					 lepar_arbre.ajouteFils(new Arbre("date.annee <", "'"+a.getText()+"'"));
					}

					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:380:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:380:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:380:3: MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,MOIS,FOLLOW_MOIS_in_param_date_avant1379); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant1385); 
					 lepar_arbre.ajouteFils(new Arbre("date.mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date_avant1392); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant1398); 
					 lepar_arbre.ajouteFils(new Arbre("date.annee =", "'"+a.getText()+"'"));
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_date_avant"



	// $ANTLR start "param_date_apres"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:387:1: param_date_apres returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ANNEE a= NUMERO ) ;
	public final Arbre param_date_apres() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:387:62: ( ( ANNEE a= NUMERO ) )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:388:2: ( ANNEE a= NUMERO )
			{
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:388:2: ( ANNEE a= NUMERO )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:388:3: ANNEE a= NUMERO
			{
			match(input,ANNEE,FOLLOW_ANNEE_in_param_date_apres1420); 
			a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_apres1426); 
			 lepar_arbre.ajouteFils(new Arbre("date.annee >", "'"+a.getText()+"'"));
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_date_apres"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete305 = new BitSet(new long[]{0x00000000000209C0L});
	public static final BitSet FOLLOW_SELECT_COUNT_in_requete318 = new BitSet(new long[]{0x00000000000209C0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete329 = new BitSet(new long[]{0x0000000000311E80L});
	public static final BitSet FOLLOW_BULLETIN_in_requete340 = new BitSet(new long[]{0x0000000000311E80L});
	public static final BitSet FOLLOW_NUMERO_in_requete351 = new BitSet(new long[]{0x0000000000311E80L});
	public static final BitSet FOLLOW_AUTEUR_in_requete362 = new BitSet(new long[]{0x0000000000311E80L});
	public static final BitSet FOLLOW_DATE_EN_in_requete374 = new BitSet(new long[]{0x0000000000311E80L});
	public static final BitSet FOLLOW_MOT_in_requete385 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_in_requete398 = new BitSet(new long[]{0x0000000000311E82L});
	public static final BitSet FOLLOW_SANS_in_requete410 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_requete412 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_mot_in_requete425 = new BitSet(new long[]{0x0000000000311E82L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete437 = new BitSet(new long[]{0x0000000001002000L});
	public static final BitSet FOLLOW_params_rubrique_in_requete450 = new BitSet(new long[]{0x0000000000311E82L});
	public static final BitSet FOLLOW_SANS_in_requete462 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete464 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_rubrique_in_requete477 = new BitSet(new long[]{0x0000000000311E82L});
	public static final BitSet FOLLOW_AUTEUR_in_requete488 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_auteurs_in_requete502 = new BitSet(new long[]{0x0000000000311E82L});
	public static final BitSet FOLLOW_SANS_in_requete513 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AUTEUR_in_requete515 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_auteur_in_requete529 = new BitSet(new long[]{0x0000000000311E82L});
	public static final BitSet FOLLOW_DATE_EN_in_requete540 = new BitSet(new long[]{0x000000000000C020L});
	public static final BitSet FOLLOW_params_date_in_requete553 = new BitSet(new long[]{0x0000000000311E82L});
	public static final BitSet FOLLOW_DATE_AVANT_in_requete564 = new BitSet(new long[]{0x0000000000008020L});
	public static final BitSet FOLLOW_params_date_avant_in_requete578 = new BitSet(new long[]{0x0000000000311E82L});
	public static final BitSet FOLLOW_DATE_APRES_in_requete589 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_params_date_apres_in_requete602 = new BitSet(new long[]{0x0000000000311E82L});
	public static final BitSet FOLLOW_DATE_ENTRE_in_requete613 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_params_date_entre_in_requete626 = new BitSet(new long[]{0x0000000000311E82L});
	public static final BitSet FOLLOW_param_in_params661 = new BitSet(new long[]{0x0000000000040012L});
	public static final BitSet FOLLOW_OR_in_params672 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_param_in_params678 = new BitSet(new long[]{0x0000000000040012L});
	public static final BitSet FOLLOW_AND_in_params689 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_param_in_params695 = new BitSet(new long[]{0x0000000000040012L});
	public static final BitSet FOLLOW_param_sans_mot_in_params_sans_mot728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_rubrique_in_params_rubrique759 = new BitSet(new long[]{0x0000000000040012L});
	public static final BitSet FOLLOW_OR_in_params_rubrique770 = new BitSet(new long[]{0x0000000001002000L});
	public static final BitSet FOLLOW_param_rubrique_in_params_rubrique776 = new BitSet(new long[]{0x0000000000040012L});
	public static final BitSet FOLLOW_AND_in_params_rubrique787 = new BitSet(new long[]{0x0000000001002000L});
	public static final BitSet FOLLOW_param_rubrique_in_params_rubrique793 = new BitSet(new long[]{0x0000000000040012L});
	public static final BitSet FOLLOW_param_sans_rubrique_in_params_sans_rubrique829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_auteur_in_params_auteurs860 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_param_auteur_in_params_auteurs874 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_param_sans_auteur_in_params_sans_auteur907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_in_params_date939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_avant_in_params_date_avant970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_apres_in_params_date_apres1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_apres_in_params_date_entre1032 = new BitSet(new long[]{0x0000000000008020L});
	public static final BitSet FOLLOW_param_date_avant_in_params_date_entre1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param1068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_mot1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_rubrique1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GUILLEMET_in_param_rubrique1121 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_STRING_in_param_rubrique1128 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_GUILLEMET_in_param_rubrique1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_rubrique1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_auteur1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_auteur1200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_param_date1219 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date1240 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1246 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param_date1253 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date1273 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1279 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param_date1286 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1292 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date1299 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_param_date1319 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1325 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date1332 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_avant1361 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_param_date_avant1379 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant1385 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_avant1392 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant1398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_apres1420 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_apres1426 = new BitSet(new long[]{0x0000000000000002L});
}
