// $ANTLR 3.5.1 C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g 2020-01-14 15:36:52

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
		"SELECT_COUNT", "STRING", "TITRE", "VIRGULE", "WS"
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
	public static final int TITRE=25;
	public static final int VIRGULE=26;
	public static final int WS=27;

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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:49:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:50:25: (r= requete )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:51:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes287);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:58:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT | SELECT_COUNT ) ( ARTICLE | BULLETIN | NUMERO | RUBRIQUE | AUTEUR | DATE_EN ) ( MOT ps= params | SANS MOT ps= params_sans_mot | TITRE MOT ps= params_titre | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:59:26: ( ( SELECT | SELECT_COUNT ) ( ARTICLE | BULLETIN | NUMERO | RUBRIQUE | AUTEUR | DATE_EN ) ( MOT ps= params | SANS MOT ps= params_sans_mot | TITRE MOT ps= params_titre | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:60:3: ( SELECT | SELECT_COUNT ) ( ARTICLE | BULLETIN | NUMERO | RUBRIQUE | AUTEUR | DATE_EN ) ( MOT ps= params | SANS MOT ps= params_sans_mot | TITRE MOT ps= params_titre | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+
			{
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:60:3: ( SELECT | SELECT_COUNT )
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
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:60:4: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete315); 

								req_arbre.ajouteFils(new Arbre("","select distinct"));
								
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:64:5: SELECT_COUNT
					{
					match(input,SELECT_COUNT,FOLLOW_SELECT_COUNT_in_requete328); 

								req_arbre.ajouteFils(new Arbre("","select count(distinct "));
								
					}
					break;

			}

			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:69:3: ( ARTICLE | BULLETIN | NUMERO | RUBRIQUE | AUTEUR | DATE_EN )
			int alt2=6;
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
			case RUBRIQUE:
				{
				alt2=4;
				}
				break;
			case AUTEUR:
				{
				alt2=5;
				}
				break;
			case DATE_EN:
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:69:4: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete342); 

								req_arbre.ajouteFils(new Arbre("","fichier"));
								
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:73:5: BULLETIN
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete353); 

								req_arbre.ajouteFils(new Arbre("","bulletin"));
								
					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:77:5: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_requete364); 

								req_arbre.ajouteFils(new Arbre("","numero"));
								
					}
					break;
				case 4 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:81:5: RUBRIQUE
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete375); 

								req_arbre.ajouteFils(new Arbre("","rubrique"));
								
					}
					break;
				case 5 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:85:5: AUTEUR
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete387); 

								req_arbre.ajouteFils(new Arbre("","email.email"));
								
					}
					break;
				case 6 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:89:5: DATE_EN
					{
					match(input,DATE_EN,FOLLOW_DATE_EN_in_requete399); 

								req_arbre.ajouteFils(new Arbre("","date.jour, date.mois, date.annee"));
								
					}
					break;

			}

			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:93:4: ( MOT ps= params | SANS MOT ps= params_sans_mot | TITRE MOT ps= params_titre | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=12;
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
						alt3=5;
						}
						break;
					case AUTEUR:
						{
						alt3=7;
						}
						break;
					}
					}
					break;
				case TITRE:
					{
					alt3=3;
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
				case DATE_EN:
					{
					alt3=8;
					}
					break;
				case DATE_AVANT:
					{
					alt3=9;
					}
					break;
				case DATE_APRES:
					{
					alt3=10;
					}
					break;
				case DATE_ENTRE:
					{
					alt3=11;
					}
					break;
				}
				switch (alt3) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:93:5: MOT ps= params
					{
					match(input,MOT,FOLLOW_MOT_in_requete410); 

									req_arbre.ajouteFils(new Arbre("","from titretexte"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_params_in_requete423);
					ps=params();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:103:5: SANS MOT ps= params_sans_mot
					{
					match(input,SANS,FOLLOW_SANS_in_requete435); 
					match(input,MOT,FOLLOW_MOT_in_requete437); 

									req_arbre.ajouteFils(new Arbre("","from titretexte"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_params_sans_mot_in_requete450);
					ps=params_sans_mot();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:113:5: TITRE MOT ps= params_titre
					{
					match(input,TITRE,FOLLOW_TITRE_in_requete462); 
					match(input,MOT,FOLLOW_MOT_in_requete464); 

									req_arbre.ajouteFils(new Arbre("","from titre"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_params_titre_in_requete477);
					ps=params_titre();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 4 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:123:5: RUBRIQUE ps= params_rubrique
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete488); 

									req_arbre.ajouteFils(new Arbre("","from titretexte"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_params_rubrique_in_requete501);
					ps=params_rubrique();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 5 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:133:5: SANS RUBRIQUE ps= params_sans_rubrique
					{
					match(input,SANS,FOLLOW_SANS_in_requete513); 
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete515); 

									req_arbre.ajouteFils(new Arbre("","from titretexte"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_params_sans_rubrique_in_requete528);
					ps=params_sans_rubrique();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 6 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:143:5: AUTEUR ps= params_auteurs
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete539); 

									req_arbre.ajouteFils(new Arbre("","from email"));
									req_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_params_auteurs_in_requete553);
					ps=params_auteurs();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 7 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:153:5: SANS AUTEUR ps= params_sans_auteur
					{
					match(input,SANS,FOLLOW_SANS_in_requete564); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete566); 

									req_arbre.ajouteFils(new Arbre("","from email"));
									req_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_params_sans_auteur_in_requete580);
					ps=params_sans_auteur();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 8 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:163:5: DATE_EN ps= params_date
					{
					match(input,DATE_EN,FOLLOW_DATE_EN_in_requete591); 

									req_arbre.ajouteFils(new Arbre("","from date"));
									req_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_params_date_in_requete604);
					ps=params_date();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);		
								
					}
					break;
				case 9 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:173:5: DATE_AVANT ps= params_date_avant
					{
					match(input,DATE_AVANT,FOLLOW_DATE_AVANT_in_requete615); 

									req_arbre.ajouteFils(new Arbre("","from date"));
									req_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_params_date_avant_in_requete629);
					ps=params_date_avant();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);		
								
					}
					break;
				case 10 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:183:5: DATE_APRES ps= params_date_apres
					{
					match(input,DATE_APRES,FOLLOW_DATE_APRES_in_requete640); 

									req_arbre.ajouteFils(new Arbre("","from date"));
									req_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_params_date_apres_in_requete653);
					ps=params_date_apres();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);		
								
					}
					break;
				case 11 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:193:5: DATE_ENTRE ps= params_date_entre
					{
					match(input,DATE_ENTRE,FOLLOW_DATE_ENTRE_in_requete664); 

									req_arbre.ajouteFils(new Arbre("","from date"));
									req_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_params_date_entre_in_requete677);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:207:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( OR par2= param | AND par2= param | SANS par2= param_sans_mot )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:208:52: (par1= param ( OR par2= param | AND par2= param | SANS par2= param_sans_mot )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:209:3: par1= param ( OR par2= param | AND par2= param | SANS par2= param_sans_mot )*
			{
			pushFollow(FOLLOW_param_in_params712);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:214:3: ( OR par2= param | AND par2= param | SANS par2= param_sans_mot )*
			loop4:
			while (true) {
				int alt4=4;
				switch ( input.LA(1) ) {
				case SANS:
					{
					int LA4_2 = input.LA(2);
					if ( (LA4_2==STRING) ) {
						alt4=3;
					}

					}
					break;
				case OR:
					{
					alt4=1;
					}
					break;
				case AND:
					{
					alt4=2;
					}
					break;
				}
				switch (alt4) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:214:4: OR par2= param
					{
					match(input,OR,FOLLOW_OR_in_params723); 
					pushFollow(FOLLOW_param_in_params729);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:220:5: AND par2= param
					{
					match(input,AND,FOLLOW_AND_in_params740); 
					pushFollow(FOLLOW_param_in_params746);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:226:5: SANS par2= param_sans_mot
					{
					match(input,SANS,FOLLOW_SANS_in_params757); 
					pushFollow(FOLLOW_param_sans_mot_in_params763);
					par2=param_sans_mot();
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



	// $ANTLR start "params_titre"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:235:1: params_titre returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_titre ( OR par2= param_titre | AND par2= param_titre | SANS par2= param_sans_titre )* ;
	public final Arbre params_titre() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:236:52: (par1= param_titre ( OR par2= param_titre | AND par2= param_titre | SANS par2= param_sans_titre )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:237:3: par1= param_titre ( OR par2= param_titre | AND par2= param_titre | SANS par2= param_sans_titre )*
			{
			pushFollow(FOLLOW_param_titre_in_params_titre799);
			par1=param_titre();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:242:3: ( OR par2= param_titre | AND par2= param_titre | SANS par2= param_sans_titre )*
			loop5:
			while (true) {
				int alt5=4;
				switch ( input.LA(1) ) {
				case SANS:
					{
					int LA5_2 = input.LA(2);
					if ( (LA5_2==STRING) ) {
						alt5=3;
					}

					}
					break;
				case OR:
					{
					alt5=1;
					}
					break;
				case AND:
					{
					alt5=2;
					}
					break;
				}
				switch (alt5) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:242:4: OR par2= param_titre
					{
					match(input,OR,FOLLOW_OR_in_params_titre809); 
					pushFollow(FOLLOW_param_titre_in_params_titre815);
					par2=param_titre();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:248:5: AND par2= param_titre
					{
					match(input,AND,FOLLOW_AND_in_params_titre826); 
					pushFollow(FOLLOW_param_titre_in_params_titre832);
					par2=param_titre();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:254:5: SANS par2= param_sans_titre
					{
					match(input,SANS,FOLLOW_SANS_in_params_titre843); 
					pushFollow(FOLLOW_param_sans_titre_in_params_titre849);
					par2=param_sans_titre();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
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
	// $ANTLR end "params_titre"



	// $ANTLR start "params_sans_mot"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:263:1: params_sans_mot returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_sans_mot ;
	public final Arbre params_sans_mot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:264:52: (par1= param_sans_mot )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:265:3: par1= param_sans_mot
			{
			pushFollow(FOLLOW_param_sans_mot_in_params_sans_mot885);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:272:1: params_rubrique returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_rubrique ( OR par2= param_rubrique | AND par2= param_rubrique | SANS par2= param_sans_rubrique )* ;
	public final Arbre params_rubrique() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:273:40: (par1= param_rubrique ( OR par2= param_rubrique | AND par2= param_rubrique | SANS par2= param_sans_rubrique )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:274:3: par1= param_rubrique ( OR par2= param_rubrique | AND par2= param_rubrique | SANS par2= param_sans_rubrique )*
			{
			pushFollow(FOLLOW_param_rubrique_in_params_rubrique916);
			par1=param_rubrique();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:279:3: ( OR par2= param_rubrique | AND par2= param_rubrique | SANS par2= param_sans_rubrique )*
			loop6:
			while (true) {
				int alt6=4;
				switch ( input.LA(1) ) {
				case SANS:
					{
					int LA6_2 = input.LA(2);
					if ( (LA6_2==STRING) ) {
						alt6=3;
					}

					}
					break;
				case OR:
					{
					alt6=1;
					}
					break;
				case AND:
					{
					alt6=2;
					}
					break;
				}
				switch (alt6) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:279:4: OR par2= param_rubrique
					{
					match(input,OR,FOLLOW_OR_in_params_rubrique927); 
					pushFollow(FOLLOW_param_rubrique_in_params_rubrique933);
					par2=param_rubrique();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:285:5: AND par2= param_rubrique
					{
					match(input,AND,FOLLOW_AND_in_params_rubrique944); 
					pushFollow(FOLLOW_param_rubrique_in_params_rubrique950);
					par2=param_rubrique();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:291:5: SANS par2= param_sans_rubrique
					{
					match(input,SANS,FOLLOW_SANS_in_params_rubrique961); 
					pushFollow(FOLLOW_param_sans_rubrique_in_params_rubrique967);
					par2=param_sans_rubrique();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
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
	// $ANTLR end "params_rubrique"



	// $ANTLR start "params_sans_rubrique"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:300:1: params_sans_rubrique returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_sans_rubrique ;
	public final Arbre params_sans_rubrique() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:301:52: (par1= param_sans_rubrique )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:302:3: par1= param_sans_rubrique
			{
			pushFollow(FOLLOW_param_sans_rubrique_in_params_sans_rubrique1003);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:309:1: params_auteurs returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_auteur (par2= param_auteur )* ;
	public final Arbre params_auteurs() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:310:40: (par1= param_auteur (par2= param_auteur )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:311:3: par1= param_auteur (par2= param_auteur )*
			{
			pushFollow(FOLLOW_param_auteur_in_params_auteurs1034);
			par1=param_auteur();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:316:3: (par2= param_auteur )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==STRING) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:316:4: par2= param_auteur
					{
					pushFollow(FOLLOW_param_auteur_in_params_auteurs1048);
					par2=param_auteur();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop7;
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:324:1: params_sans_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_sans_auteur ;
	public final Arbre params_sans_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:325:52: (par1= param_sans_auteur )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:326:3: par1= param_sans_auteur
			{
			pushFollow(FOLLOW_param_sans_auteur_in_params_sans_auteur1081);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:334:1: params_date returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date ;
	public final Arbre params_date() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:335:40: (par1= param_date )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:336:3: par1= param_date
			{
			pushFollow(FOLLOW_param_date_in_params_date1113);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:343:1: params_date_avant returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_avant ;
	public final Arbre params_date_avant() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:344:40: (par1= param_date_avant )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:345:3: par1= param_date_avant
			{
			pushFollow(FOLLOW_param_date_avant_in_params_date_avant1144);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:352:1: params_date_apres returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_apres ;
	public final Arbre params_date_apres() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:353:40: (par1= param_date_apres )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:354:3: par1= param_date_apres
			{
			pushFollow(FOLLOW_param_date_apres_in_params_date_apres1175);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:361:1: params_date_entre returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_apres par2= param_date_avant ;
	public final Arbre params_date_entre() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:362:40: (par1= param_date_apres par2= param_date_avant )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:363:3: par1= param_date_apres par2= param_date_avant
			{
			pushFollow(FOLLOW_param_date_apres_in_params_date_entre1206);
			par1=param_date_apres();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			pushFollow(FOLLOW_param_date_avant_in_params_date_entre1219);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:375:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:375:51: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:376:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param1242); 
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



	// $ANTLR start "param_titre"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:380:1: param_titre returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_titre() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:380:57: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:381:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_titre1264); 
			 lepar_arbre.ajouteFils(new Arbre("titre.mot =", "'"+a.getText()+"'"));
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
	// $ANTLR end "param_titre"



	// $ANTLR start "param_sans_titre"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:385:1: param_sans_titre returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_titre() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:385:62: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:386:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_titre1286); 
			 lepar_arbre.ajouteFils(new Arbre("titre.mot NOT LIKE", "'"+a.getText()+"'"));
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
	// $ANTLR end "param_sans_titre"



	// $ANTLR start "param_sans_mot"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:390:1: param_sans_mot returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_mot() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:390:60: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:391:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_mot1308); 
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:395:1: param_rubrique returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= STRING | GUILLEMET (a= STRING ) GUILLEMET );
	public final Arbre param_rubrique() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:395:60: (a= STRING | GUILLEMET (a= STRING ) GUILLEMET )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==STRING) ) {
				alt8=1;
			}
			else if ( (LA8_0==GUILLEMET) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:396:2: a= STRING
					{
					a=(Token)match(input,STRING,FOLLOW_STRING_in_param_rubrique1330); 
					 lepar_arbre.ajouteFils(new Arbre("titretexte.rubrique =", "'"+a.getText()+"'"));
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:398:4: GUILLEMET (a= STRING ) GUILLEMET
					{
					match(input,GUILLEMET,FOLLOW_GUILLEMET_in_param_rubrique1339); 
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:398:14: (a= STRING )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:398:15: a= STRING
					{
					a=(Token)match(input,STRING,FOLLOW_STRING_in_param_rubrique1346); 
					}

					match(input,GUILLEMET,FOLLOW_GUILLEMET_in_param_rubrique1349); 
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:403:1: param_sans_rubrique returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_rubrique() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:403:65: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:404:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_rubrique1374); 
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:408:1: param_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:408:58: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:409:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_auteur1396); 
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:413:1: param_sans_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:413:63: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:414:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_auteur1418); 
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:418:1: param_date returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ( ANNEE a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) );
	public final Arbre param_date() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:418:56: ( ( ANNEE a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) )
			int alt9=4;
			switch ( input.LA(1) ) {
			case ANNEE:
				{
				alt9=1;
				}
				break;
			case JOUR:
				{
				int LA9_2 = input.LA(2);
				if ( (LA9_2==NUMERO) ) {
					int LA9_4 = input.LA(3);
					if ( (LA9_4==MOIS) ) {
						int LA9_5 = input.LA(4);
						if ( (LA9_5==NUMERO) ) {
							int LA9_6 = input.LA(5);
							if ( (LA9_6==EOF||LA9_6==AUTEUR||(LA9_6 >= DATE_APRES && LA9_6 <= DATE_ENTRE)||LA9_6==MOT||(LA9_6 >= RUBRIQUE && LA9_6 <= SANS)||LA9_6==TITRE) ) {
								alt9=2;
							}
							else if ( (LA9_6==ANNEE) ) {
								alt9=3;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 6, input);
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
									new NoViableAltException("", 9, 5, input);
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
								new NoViableAltException("", 9, 4, input);
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
							new NoViableAltException("", 9, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MOIS:
				{
				alt9=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:419:2: ( ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:419:2: ( ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:419:3: ANNEE a= NUMERO
					{
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date1437); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1443); 
					 lepar_arbre.ajouteFils(new Arbre("date.annee =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:423:2: ( JOUR a= NUMERO MOIS a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:423:2: ( JOUR a= NUMERO MOIS a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:423:3: JOUR a= NUMERO MOIS a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date1458); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1464); 
					 lepar_arbre.ajouteFils(new Arbre("date.jour =", "'"+a.getText()+"' AND "));
					match(input,MOIS,FOLLOW_MOIS_in_param_date1471); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1477); 
					 lepar_arbre.ajouteFils(new Arbre("date.mois =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:429:2: ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:429:2: ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:429:3: JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date1491); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1497); 
					 lepar_arbre.ajouteFils(new Arbre("date.jour =", "'"+a.getText()+"' AND "));
					match(input,MOIS,FOLLOW_MOIS_in_param_date1504); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1510); 
					 lepar_arbre.ajouteFils(new Arbre("date.mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date1517); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1523); 
					 lepar_arbre.ajouteFils(new Arbre("date.annee =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 4 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:437:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:437:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:437:3: MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,MOIS,FOLLOW_MOIS_in_param_date1537); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1543); 
					 lepar_arbre.ajouteFils(new Arbre("date.mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date1550); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1556); 
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:444:1: param_date_avant returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ANNEE a= NUMERO ) ;
	public final Arbre param_date_avant() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:444:62: ( ( ANNEE a= NUMERO ) )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:445:2: ( ANNEE a= NUMERO )
			{
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:445:2: ( ANNEE a= NUMERO )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:445:3: ANNEE a= NUMERO
			{
			match(input,ANNEE,FOLLOW_ANNEE_in_param_date_avant1579); 
			a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant1585); 
			 lepar_arbre.ajouteFils(new Arbre("date.annee <", "'"+a.getText()+"'"));
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
	// $ANTLR end "param_date_avant"



	// $ANTLR start "param_date_apres"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:450:1: param_date_apres returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ANNEE a= NUMERO ) ;
	public final Arbre param_date_apres() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:450:62: ( ( ANNEE a= NUMERO ) )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:451:2: ( ANNEE a= NUMERO )
			{
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:451:2: ( ANNEE a= NUMERO )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:451:3: ANNEE a= NUMERO
			{
			match(input,ANNEE,FOLLOW_ANNEE_in_param_date_apres1607); 
			a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_apres1613); 
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



	public static final BitSet FOLLOW_requete_in_listerequetes287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete315 = new BitSet(new long[]{0x00000000001209C0L});
	public static final BitSet FOLLOW_SELECT_COUNT_in_requete328 = new BitSet(new long[]{0x00000000001209C0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete342 = new BitSet(new long[]{0x0000000002311E80L});
	public static final BitSet FOLLOW_BULLETIN_in_requete353 = new BitSet(new long[]{0x0000000002311E80L});
	public static final BitSet FOLLOW_NUMERO_in_requete364 = new BitSet(new long[]{0x0000000002311E80L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete375 = new BitSet(new long[]{0x0000000002311E80L});
	public static final BitSet FOLLOW_AUTEUR_in_requete387 = new BitSet(new long[]{0x0000000002311E80L});
	public static final BitSet FOLLOW_DATE_EN_in_requete399 = new BitSet(new long[]{0x0000000002311E80L});
	public static final BitSet FOLLOW_MOT_in_requete410 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_in_requete423 = new BitSet(new long[]{0x0000000002311E82L});
	public static final BitSet FOLLOW_SANS_in_requete435 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_requete437 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_mot_in_requete450 = new BitSet(new long[]{0x0000000002311E82L});
	public static final BitSet FOLLOW_TITRE_in_requete462 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_requete464 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_titre_in_requete477 = new BitSet(new long[]{0x0000000002311E82L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete488 = new BitSet(new long[]{0x0000000001002000L});
	public static final BitSet FOLLOW_params_rubrique_in_requete501 = new BitSet(new long[]{0x0000000002311E82L});
	public static final BitSet FOLLOW_SANS_in_requete513 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete515 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_rubrique_in_requete528 = new BitSet(new long[]{0x0000000002311E82L});
	public static final BitSet FOLLOW_AUTEUR_in_requete539 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_auteurs_in_requete553 = new BitSet(new long[]{0x0000000002311E82L});
	public static final BitSet FOLLOW_SANS_in_requete564 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AUTEUR_in_requete566 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_auteur_in_requete580 = new BitSet(new long[]{0x0000000002311E82L});
	public static final BitSet FOLLOW_DATE_EN_in_requete591 = new BitSet(new long[]{0x000000000000C020L});
	public static final BitSet FOLLOW_params_date_in_requete604 = new BitSet(new long[]{0x0000000002311E82L});
	public static final BitSet FOLLOW_DATE_AVANT_in_requete615 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_params_date_avant_in_requete629 = new BitSet(new long[]{0x0000000002311E82L});
	public static final BitSet FOLLOW_DATE_APRES_in_requete640 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_params_date_apres_in_requete653 = new BitSet(new long[]{0x0000000002311E82L});
	public static final BitSet FOLLOW_DATE_ENTRE_in_requete664 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_params_date_entre_in_requete677 = new BitSet(new long[]{0x0000000002311E82L});
	public static final BitSet FOLLOW_param_in_params712 = new BitSet(new long[]{0x0000000000240012L});
	public static final BitSet FOLLOW_OR_in_params723 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_param_in_params729 = new BitSet(new long[]{0x0000000000240012L});
	public static final BitSet FOLLOW_AND_in_params740 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_param_in_params746 = new BitSet(new long[]{0x0000000000240012L});
	public static final BitSet FOLLOW_SANS_in_params757 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_param_sans_mot_in_params763 = new BitSet(new long[]{0x0000000000240012L});
	public static final BitSet FOLLOW_param_titre_in_params_titre799 = new BitSet(new long[]{0x0000000000240012L});
	public static final BitSet FOLLOW_OR_in_params_titre809 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_param_titre_in_params_titre815 = new BitSet(new long[]{0x0000000000240012L});
	public static final BitSet FOLLOW_AND_in_params_titre826 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_param_titre_in_params_titre832 = new BitSet(new long[]{0x0000000000240012L});
	public static final BitSet FOLLOW_SANS_in_params_titre843 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_param_sans_titre_in_params_titre849 = new BitSet(new long[]{0x0000000000240012L});
	public static final BitSet FOLLOW_param_sans_mot_in_params_sans_mot885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_rubrique_in_params_rubrique916 = new BitSet(new long[]{0x0000000000240012L});
	public static final BitSet FOLLOW_OR_in_params_rubrique927 = new BitSet(new long[]{0x0000000001002000L});
	public static final BitSet FOLLOW_param_rubrique_in_params_rubrique933 = new BitSet(new long[]{0x0000000000240012L});
	public static final BitSet FOLLOW_AND_in_params_rubrique944 = new BitSet(new long[]{0x0000000001002000L});
	public static final BitSet FOLLOW_param_rubrique_in_params_rubrique950 = new BitSet(new long[]{0x0000000000240012L});
	public static final BitSet FOLLOW_SANS_in_params_rubrique961 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_param_sans_rubrique_in_params_rubrique967 = new BitSet(new long[]{0x0000000000240012L});
	public static final BitSet FOLLOW_param_sans_rubrique_in_params_sans_rubrique1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_auteur_in_params_auteurs1034 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_param_auteur_in_params_auteurs1048 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_param_sans_auteur_in_params_sans_auteur1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_in_params_date1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_avant_in_params_date_avant1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_apres_in_params_date_apres1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_apres_in_params_date_entre1206 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_param_date_avant_in_params_date_entre1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param1242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_titre1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_titre1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_mot1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_rubrique1330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GUILLEMET_in_param_rubrique1339 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_STRING_in_param_rubrique1346 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_GUILLEMET_in_param_rubrique1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_rubrique1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_auteur1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_auteur1418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_param_date1437 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date1458 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1464 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param_date1471 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date1491 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1497 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param_date1504 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1510 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date1517 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_param_date1537 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1543 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date1550 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_avant1579 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant1585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_apres1607 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_apres1613 = new BitSet(new long[]{0x0000000000000002L});
}
