// $ANTLR 3.5.1 C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g 2019-12-18 22:31:48

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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:56:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT | SELECT_COUNT ) ( ( ARTICLE | BULLETIN | NUMERO ) ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ | ( AUTEUR ( MOT ps= params_mot_auteur | SANS MOT ps= params_sans_mot_auteur | RUBRIQUE ps= params_rubrique_auteur | SANS RUBRIQUE ps= params_sans_rubrique_auteur | AUTEUR ps= params_auteurs_auteur | SANS AUTEUR ps= params_sans_auteur_auteur | DATE_EN ps= params_date_auteur | DATE_AVANT ps= params_date_avant_auteur | DATE_APRES ps= params_date_apres_auteur | DATE_ENTRE ps= params_date_entre_auteur )+ ) | ( DATE_EN ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ ) )+ ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:57:26: ( ( SELECT | SELECT_COUNT ) ( ( ARTICLE | BULLETIN | NUMERO ) ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ | ( AUTEUR ( MOT ps= params_mot_auteur | SANS MOT ps= params_sans_mot_auteur | RUBRIQUE ps= params_rubrique_auteur | SANS RUBRIQUE ps= params_sans_rubrique_auteur | AUTEUR ps= params_auteurs_auteur | SANS AUTEUR ps= params_sans_auteur_auteur | DATE_EN ps= params_date_auteur | DATE_AVANT ps= params_date_avant_auteur | DATE_APRES ps= params_date_apres_auteur | DATE_ENTRE ps= params_date_entre_auteur )+ ) | ( DATE_EN ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ ) )+ )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:58:3: ( SELECT | SELECT_COUNT ) ( ( ARTICLE | BULLETIN | NUMERO ) ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ | ( AUTEUR ( MOT ps= params_mot_auteur | SANS MOT ps= params_sans_mot_auteur | RUBRIQUE ps= params_rubrique_auteur | SANS RUBRIQUE ps= params_sans_rubrique_auteur | AUTEUR ps= params_auteurs_auteur | SANS AUTEUR ps= params_sans_auteur_auteur | DATE_EN ps= params_date_auteur | DATE_AVANT ps= params_date_avant_auteur | DATE_APRES ps= params_date_apres_auteur | DATE_ENTRE ps= params_date_entre_auteur )+ ) | ( DATE_EN ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ ) )+
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

			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:66:3: ( ( ARTICLE | BULLETIN | NUMERO ) ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ | ( AUTEUR ( MOT ps= params_mot_auteur | SANS MOT ps= params_sans_mot_auteur | RUBRIQUE ps= params_rubrique_auteur | SANS RUBRIQUE ps= params_sans_rubrique_auteur | AUTEUR ps= params_auteurs_auteur | SANS AUTEUR ps= params_sans_auteur_auteur | DATE_EN ps= params_date_auteur | DATE_AVANT ps= params_date_avant_auteur | DATE_APRES ps= params_date_apres_auteur | DATE_ENTRE ps= params_date_entre_auteur )+ ) | ( DATE_EN ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ ) )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=4;
				switch ( input.LA(1) ) {
				case ARTICLE:
				case BULLETIN:
				case NUMERO:
					{
					alt6=1;
					}
					break;
				case AUTEUR:
					{
					alt6=2;
					}
					break;
				case DATE_EN:
					{
					alt6=3;
					}
					break;
				}
				switch (alt6) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:66:5: ( ARTICLE | BULLETIN | NUMERO ) ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:66:5: ( ARTICLE | BULLETIN | NUMERO )
					int alt2=3;
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
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:66:6: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete331); 

										req_arbre.ajouteFils(new Arbre("","fichier"));
										
							}
							break;
						case 2 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:70:5: BULLETIN
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_requete342); 

										req_arbre.ajouteFils(new Arbre("","bulletin"));
										
							}
							break;
						case 3 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:74:5: NUMERO
							{
							match(input,NUMERO,FOLLOW_NUMERO_in_requete353); 

										req_arbre.ajouteFils(new Arbre("","numero"));
										
							}
							break;

					}

					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:78:4: ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=11;
						switch ( input.LA(1) ) {
						case AUTEUR:
							{
							int LA3_2 = input.LA(2);
							if ( (LA3_2==STRING) ) {
								alt3=5;
							}

							}
							break;
						case DATE_EN:
							{
							int LA3_3 = input.LA(2);
							if ( ((LA3_3 >= JOUR && LA3_3 <= MOIS)) ) {
								alt3=7;
							}

							}
							break;
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
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:78:5: MOT ps= params
							{
							match(input,MOT,FOLLOW_MOT_in_requete364); 

											req_arbre.ajouteFils(new Arbre("","from titretexte"));
											req_arbre.ajouteFils(new Arbre("","where"));
										
							pushFollow(FOLLOW_params_in_requete377);
							ps=params();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 2 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:88:5: SANS MOT ps= params_sans_mot
							{
							match(input,SANS,FOLLOW_SANS_in_requete389); 
							match(input,MOT,FOLLOW_MOT_in_requete391); 

											req_arbre.ajouteFils(new Arbre("","from titretexte"));
											req_arbre.ajouteFils(new Arbre("","where"));
										
							pushFollow(FOLLOW_params_sans_mot_in_requete404);
							ps=params_sans_mot();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 3 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:98:5: RUBRIQUE ps= params_rubrique
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete416); 

											req_arbre.ajouteFils(new Arbre("","from rubrique"));
											req_arbre.ajouteFils(new Arbre("","where"));
										
							pushFollow(FOLLOW_params_rubrique_in_requete429);
							ps=params_rubrique();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 4 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:108:5: SANS RUBRIQUE ps= params_sans_rubrique
							{
							match(input,SANS,FOLLOW_SANS_in_requete441); 
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete443); 

											req_arbre.ajouteFils(new Arbre("","from rubrique"));
											req_arbre.ajouteFils(new Arbre("","where"));
										
							pushFollow(FOLLOW_params_sans_rubrique_in_requete456);
							ps=params_sans_rubrique();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 5 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:118:5: AUTEUR ps= params_auteurs
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete467); 

											req_arbre.ajouteFils(new Arbre("","from email"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_auteurs_in_requete481);
							ps=params_auteurs();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 6 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:128:5: SANS AUTEUR ps= params_sans_auteur
							{
							match(input,SANS,FOLLOW_SANS_in_requete492); 
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete494); 

											req_arbre.ajouteFils(new Arbre("","from email"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_sans_auteur_in_requete508);
							ps=params_sans_auteur();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 7 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:138:5: DATE_EN ps= params_date
							{
							match(input,DATE_EN,FOLLOW_DATE_EN_in_requete519); 

											req_arbre.ajouteFils(new Arbre("","from date"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_date_in_requete532);
							ps=params_date();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);		
										
							}
							break;
						case 8 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:148:5: DATE_AVANT ps= params_date_avant
							{
							match(input,DATE_AVANT,FOLLOW_DATE_AVANT_in_requete543); 

											req_arbre.ajouteFils(new Arbre("","from date"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_date_avant_in_requete557);
							ps=params_date_avant();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);		
										
							}
							break;
						case 9 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:158:5: DATE_APRES ps= params_date_apres
							{
							match(input,DATE_APRES,FOLLOW_DATE_APRES_in_requete568); 

											req_arbre.ajouteFils(new Arbre("","from date"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_date_apres_in_requete581);
							ps=params_date_apres();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);		
										
							}
							break;
						case 10 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:168:5: DATE_ENTRE ps= params_date_entre
							{
							match(input,DATE_ENTRE,FOLLOW_DATE_ENTRE_in_requete592); 

											req_arbre.ajouteFils(new Arbre("","from date"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_date_entre_in_requete605);
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
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:178:5: ( AUTEUR ( MOT ps= params_mot_auteur | SANS MOT ps= params_sans_mot_auteur | RUBRIQUE ps= params_rubrique_auteur | SANS RUBRIQUE ps= params_sans_rubrique_auteur | AUTEUR ps= params_auteurs_auteur | SANS AUTEUR ps= params_sans_auteur_auteur | DATE_EN ps= params_date_auteur | DATE_AVANT ps= params_date_avant_auteur | DATE_APRES ps= params_date_apres_auteur | DATE_ENTRE ps= params_date_entre_auteur )+ )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:178:5: ( AUTEUR ( MOT ps= params_mot_auteur | SANS MOT ps= params_sans_mot_auteur | RUBRIQUE ps= params_rubrique_auteur | SANS RUBRIQUE ps= params_sans_rubrique_auteur | AUTEUR ps= params_auteurs_auteur | SANS AUTEUR ps= params_sans_auteur_auteur | DATE_EN ps= params_date_auteur | DATE_AVANT ps= params_date_avant_auteur | DATE_APRES ps= params_date_apres_auteur | DATE_ENTRE ps= params_date_entre_auteur )+ )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:178:6: AUTEUR ( MOT ps= params_mot_auteur | SANS MOT ps= params_sans_mot_auteur | RUBRIQUE ps= params_rubrique_auteur | SANS RUBRIQUE ps= params_sans_rubrique_auteur | AUTEUR ps= params_auteurs_auteur | SANS AUTEUR ps= params_sans_auteur_auteur | DATE_EN ps= params_date_auteur | DATE_AVANT ps= params_date_avant_auteur | DATE_APRES ps= params_date_apres_auteur | DATE_ENTRE ps= params_date_entre_auteur )+
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete619); 

								req_arbre.ajouteFils(new Arbre("","email"));
								
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:182:3: ( MOT ps= params_mot_auteur | SANS MOT ps= params_sans_mot_auteur | RUBRIQUE ps= params_rubrique_auteur | SANS RUBRIQUE ps= params_sans_rubrique_auteur | AUTEUR ps= params_auteurs_auteur | SANS AUTEUR ps= params_sans_auteur_auteur | DATE_EN ps= params_date_auteur | DATE_AVANT ps= params_date_avant_auteur | DATE_APRES ps= params_date_apres_auteur | DATE_ENTRE ps= params_date_entre_auteur )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=11;
						switch ( input.LA(1) ) {
						case AUTEUR:
							{
							int LA4_2 = input.LA(2);
							if ( (LA4_2==STRING) ) {
								alt4=5;
							}

							}
							break;
						case DATE_EN:
							{
							int LA4_3 = input.LA(2);
							if ( ((LA4_3 >= JOUR && LA4_3 <= MOIS)) ) {
								alt4=7;
							}

							}
							break;
						case MOT:
							{
							alt4=1;
							}
							break;
						case SANS:
							{
							switch ( input.LA(2) ) {
							case MOT:
								{
								alt4=2;
								}
								break;
							case RUBRIQUE:
								{
								alt4=4;
								}
								break;
							case AUTEUR:
								{
								alt4=6;
								}
								break;
							}
							}
							break;
						case RUBRIQUE:
							{
							alt4=3;
							}
							break;
						case DATE_AVANT:
							{
							alt4=8;
							}
							break;
						case DATE_APRES:
							{
							alt4=9;
							}
							break;
						case DATE_ENTRE:
							{
							alt4=10;
							}
							break;
						}
						switch (alt4) {
						case 1 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:182:4: MOT ps= params_mot_auteur
							{
							match(input,MOT,FOLLOW_MOT_in_requete630); 

											req_arbre.ajouteFils(new Arbre("","from titretexte, email"));
											req_arbre.ajouteFils(new Arbre("","where"));
										
							pushFollow(FOLLOW_params_mot_auteur_in_requete643);
							ps=params_mot_auteur();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 2 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:192:5: SANS MOT ps= params_sans_mot_auteur
							{
							match(input,SANS,FOLLOW_SANS_in_requete655); 
							match(input,MOT,FOLLOW_MOT_in_requete657); 

											req_arbre.ajouteFils(new Arbre("","from titretexte, email"));
											req_arbre.ajouteFils(new Arbre("","where"));
										
							pushFollow(FOLLOW_params_sans_mot_auteur_in_requete670);
							ps=params_sans_mot_auteur();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 3 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:202:5: RUBRIQUE ps= params_rubrique_auteur
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete682); 

											req_arbre.ajouteFils(new Arbre("","from rubrique, email"));
											req_arbre.ajouteFils(new Arbre("","where"));
										
							pushFollow(FOLLOW_params_rubrique_auteur_in_requete695);
							ps=params_rubrique_auteur();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 4 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:212:5: SANS RUBRIQUE ps= params_sans_rubrique_auteur
							{
							match(input,SANS,FOLLOW_SANS_in_requete707); 
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete709); 

											req_arbre.ajouteFils(new Arbre("","from rubrique, email"));
											req_arbre.ajouteFils(new Arbre("","where"));
										
							pushFollow(FOLLOW_params_sans_rubrique_auteur_in_requete722);
							ps=params_sans_rubrique_auteur();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 5 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:222:5: AUTEUR ps= params_auteurs_auteur
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete733); 

											req_arbre.ajouteFils(new Arbre("","from email"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_auteurs_auteur_in_requete747);
							ps=params_auteurs_auteur();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 6 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:232:5: SANS AUTEUR ps= params_sans_auteur_auteur
							{
							match(input,SANS,FOLLOW_SANS_in_requete758); 
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete760); 

											req_arbre.ajouteFils(new Arbre("","from email"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_sans_auteur_auteur_in_requete774);
							ps=params_sans_auteur_auteur();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 7 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:242:5: DATE_EN ps= params_date_auteur
							{
							match(input,DATE_EN,FOLLOW_DATE_EN_in_requete785); 

											req_arbre.ajouteFils(new Arbre("","from date, email"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_date_auteur_in_requete798);
							ps=params_date_auteur();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);		
										
							}
							break;
						case 8 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:252:5: DATE_AVANT ps= params_date_avant_auteur
							{
							match(input,DATE_AVANT,FOLLOW_DATE_AVANT_in_requete809); 

											req_arbre.ajouteFils(new Arbre("","from date, email"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_date_avant_auteur_in_requete823);
							ps=params_date_avant_auteur();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);		
										
							}
							break;
						case 9 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:262:5: DATE_APRES ps= params_date_apres_auteur
							{
							match(input,DATE_APRES,FOLLOW_DATE_APRES_in_requete834); 

											req_arbre.ajouteFils(new Arbre("","from date, email"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_date_apres_auteur_in_requete847);
							ps=params_date_apres_auteur();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);		
										
							}
							break;
						case 10 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:272:5: DATE_ENTRE ps= params_date_entre_auteur
							{
							match(input,DATE_ENTRE,FOLLOW_DATE_ENTRE_in_requete858); 

											req_arbre.ajouteFils(new Arbre("","from date, email"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_date_entre_auteur_in_requete871);
							ps=params_date_entre_auteur();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);		
										
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}

					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:283:5: ( DATE_EN ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:283:5: ( DATE_EN ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+ )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:283:6: DATE_EN ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+
					{
					match(input,DATE_EN,FOLLOW_DATE_EN_in_requete889); 

								req_arbre.ajouteFils(new Arbre("","jour, mois, annee"));
								
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:287:5: ( MOT ps= params | SANS MOT ps= params_sans_mot | RUBRIQUE ps= params_rubrique | SANS RUBRIQUE ps= params_sans_rubrique | AUTEUR ps= params_auteurs | SANS AUTEUR ps= params_sans_auteur | DATE_EN ps= params_date | DATE_AVANT ps= params_date_avant | DATE_APRES ps= params_date_apres | DATE_ENTRE ps= params_date_entre )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=11;
						switch ( input.LA(1) ) {
						case AUTEUR:
							{
							int LA5_2 = input.LA(2);
							if ( (LA5_2==STRING) ) {
								alt5=5;
							}

							}
							break;
						case DATE_EN:
							{
							int LA5_3 = input.LA(2);
							if ( ((LA5_3 >= JOUR && LA5_3 <= MOIS)) ) {
								alt5=7;
							}

							}
							break;
						case MOT:
							{
							alt5=1;
							}
							break;
						case SANS:
							{
							switch ( input.LA(2) ) {
							case MOT:
								{
								alt5=2;
								}
								break;
							case RUBRIQUE:
								{
								alt5=4;
								}
								break;
							case AUTEUR:
								{
								alt5=6;
								}
								break;
							}
							}
							break;
						case RUBRIQUE:
							{
							alt5=3;
							}
							break;
						case DATE_AVANT:
							{
							alt5=8;
							}
							break;
						case DATE_APRES:
							{
							alt5=9;
							}
							break;
						case DATE_ENTRE:
							{
							alt5=10;
							}
							break;
						}
						switch (alt5) {
						case 1 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:287:6: MOT ps= params
							{
							match(input,MOT,FOLLOW_MOT_in_requete901); 

											req_arbre.ajouteFils(new Arbre("","from titretexte"));
											req_arbre.ajouteFils(new Arbre("","where"));
										
							pushFollow(FOLLOW_params_in_requete914);
							ps=params();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 2 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:297:5: SANS MOT ps= params_sans_mot
							{
							match(input,SANS,FOLLOW_SANS_in_requete926); 
							match(input,MOT,FOLLOW_MOT_in_requete928); 

											req_arbre.ajouteFils(new Arbre("","from titretexte"));
											req_arbre.ajouteFils(new Arbre("","where"));
										
							pushFollow(FOLLOW_params_sans_mot_in_requete941);
							ps=params_sans_mot();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 3 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:307:5: RUBRIQUE ps= params_rubrique
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete953); 

											req_arbre.ajouteFils(new Arbre("","from rubrique"));
											req_arbre.ajouteFils(new Arbre("","where"));
										
							pushFollow(FOLLOW_params_rubrique_in_requete966);
							ps=params_rubrique();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 4 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:317:5: SANS RUBRIQUE ps= params_sans_rubrique
							{
							match(input,SANS,FOLLOW_SANS_in_requete978); 
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete980); 

											req_arbre.ajouteFils(new Arbre("","from rubrique"));
											req_arbre.ajouteFils(new Arbre("","where"));
										
							pushFollow(FOLLOW_params_sans_rubrique_in_requete993);
							ps=params_sans_rubrique();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 5 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:327:5: AUTEUR ps= params_auteurs
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1004); 

											req_arbre.ajouteFils(new Arbre("","from titretexte, auteur"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_auteurs_in_requete1018);
							ps=params_auteurs();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 6 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:337:5: SANS AUTEUR ps= params_sans_auteur
							{
							match(input,SANS,FOLLOW_SANS_in_requete1029); 
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1031); 

											req_arbre.ajouteFils(new Arbre("","from email"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_sans_auteur_in_requete1045);
							ps=params_sans_auteur();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 7 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:347:5: DATE_EN ps= params_date
							{
							match(input,DATE_EN,FOLLOW_DATE_EN_in_requete1056); 

											req_arbre.ajouteFils(new Arbre("","from date"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_date_in_requete1069);
							ps=params_date();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);		
										
							}
							break;
						case 8 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:357:5: DATE_AVANT ps= params_date_avant
							{
							match(input,DATE_AVANT,FOLLOW_DATE_AVANT_in_requete1080); 

											req_arbre.ajouteFils(new Arbre("","from date"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_date_avant_in_requete1094);
							ps=params_date_avant();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);		
										
							}
							break;
						case 9 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:367:5: DATE_APRES ps= params_date_apres
							{
							match(input,DATE_APRES,FOLLOW_DATE_APRES_in_requete1105); 

											req_arbre.ajouteFils(new Arbre("","from date"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_date_apres_in_requete1118);
							ps=params_date_apres();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);		
										
							}
							break;
						case 10 :
							// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:377:5: DATE_ENTRE ps= params_date_entre
							{
							match(input,DATE_ENTRE,FOLLOW_DATE_ENTRE_in_requete1129); 

											req_arbre.ajouteFils(new Arbre("","from date"));
											req_arbre.ajouteFils(new Arbre("","where"));			
										
							pushFollow(FOLLOW_params_date_entre_in_requete1142);
							ps=params_date_entre();
							state._fsp--;


											ps_arbre = ps;
											req_arbre.ajouteFils(ps_arbre);		
										
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					}

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:393:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:394:52: (par1= param (par2= param )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:395:3: par1= param (par2= param )*
			{
			pushFollow(FOLLOW_param_in_params1186);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:400:3: (par2= param )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==STRING) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:400:4: par2= param
					{
					pushFollow(FOLLOW_param_in_params1201);
					par2=param();
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
	// $ANTLR end "params"



	// $ANTLR start "params_sans_mot"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:408:1: params_sans_mot returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_sans_mot ;
	public final Arbre params_sans_mot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:409:52: (par1= param_sans_mot )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:410:3: par1= param_sans_mot
			{
			pushFollow(FOLLOW_param_sans_mot_in_params_sans_mot1234);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:417:1: params_rubrique returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_rubrique (par2= param_rubrique )* ;
	public final Arbre params_rubrique() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:418:40: (par1= param_rubrique (par2= param_rubrique )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:419:3: par1= param_rubrique (par2= param_rubrique )*
			{
			pushFollow(FOLLOW_param_rubrique_in_params_rubrique1265);
			par1=param_rubrique();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:424:3: (par2= param_rubrique )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==GUILLEMET||LA8_0==STRING) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:424:4: par2= param_rubrique
					{
					pushFollow(FOLLOW_param_rubrique_in_params_rubrique1280);
					par2=param_rubrique();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop8;
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:433:1: params_sans_rubrique returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_sans_rubrique ;
	public final Arbre params_sans_rubrique() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:434:52: (par1= param_sans_rubrique )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:435:3: par1= param_sans_rubrique
			{
			pushFollow(FOLLOW_param_sans_rubrique_in_params_sans_rubrique1316);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:442:1: params_auteurs returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_auteur (par2= param_auteur )* ;
	public final Arbre params_auteurs() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:443:40: (par1= param_auteur (par2= param_auteur )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:444:3: par1= param_auteur (par2= param_auteur )*
			{
			pushFollow(FOLLOW_param_auteur_in_params_auteurs1347);
			par1=param_auteur();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:449:3: (par2= param_auteur )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==STRING) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:449:4: par2= param_auteur
					{
					pushFollow(FOLLOW_param_auteur_in_params_auteurs1361);
					par2=param_auteur();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop9;
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:457:1: params_sans_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_sans_auteur ;
	public final Arbre params_sans_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:458:52: (par1= param_sans_auteur )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:459:3: par1= param_sans_auteur
			{
			pushFollow(FOLLOW_param_sans_auteur_in_params_sans_auteur1394);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:467:1: params_date returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date ;
	public final Arbre params_date() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:468:40: (par1= param_date )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:469:3: par1= param_date
			{
			pushFollow(FOLLOW_param_date_in_params_date1426);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:476:1: params_date_avant returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_avant ;
	public final Arbre params_date_avant() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:477:40: (par1= param_date_avant )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:478:3: par1= param_date_avant
			{
			pushFollow(FOLLOW_param_date_avant_in_params_date_avant1457);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:485:1: params_date_apres returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_apres ;
	public final Arbre params_date_apres() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:486:40: (par1= param_date_apres )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:487:3: par1= param_date_apres
			{
			pushFollow(FOLLOW_param_date_apres_in_params_date_apres1488);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:494:1: params_date_entre returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_apres par2= param_date_avant ;
	public final Arbre params_date_entre() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:495:40: (par1= param_date_apres par2= param_date_avant )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:496:3: par1= param_date_apres par2= param_date_avant
			{
			pushFollow(FOLLOW_param_date_apres_in_params_date_entre1519);
			par1=param_date_apres();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			pushFollow(FOLLOW_param_date_avant_in_params_date_entre1532);
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:508:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:508:51: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:509:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param1555); 
			 lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:513:1: param_sans_mot returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_mot() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:513:60: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:514:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_mot1577); 
			 lepar_arbre.ajouteFils(new Arbre("mot NOT LIKE", "'"+a.getText()+"'"));
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:518:1: param_rubrique returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= STRING | GUILLEMET (a= STRING ) GUILLEMET );
	public final Arbre param_rubrique() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:518:60: (a= STRING | GUILLEMET (a= STRING ) GUILLEMET )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==STRING) ) {
				alt10=1;
			}
			else if ( (LA10_0==GUILLEMET) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:519:2: a= STRING
					{
					a=(Token)match(input,STRING,FOLLOW_STRING_in_param_rubrique1599); 
					 lepar_arbre.ajouteFils(new Arbre("rubrique =", "'"+a.getText()+"'"));
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:521:4: GUILLEMET (a= STRING ) GUILLEMET
					{
					match(input,GUILLEMET,FOLLOW_GUILLEMET_in_param_rubrique1608); 
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:521:14: (a= STRING )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:521:15: a= STRING
					{
					a=(Token)match(input,STRING,FOLLOW_STRING_in_param_rubrique1615); 
					}

					match(input,GUILLEMET,FOLLOW_GUILLEMET_in_param_rubrique1618); 
					 lepar_arbre.ajouteFils(new Arbre("rubrique =", "'"+a.getText()+"'"));
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:526:1: param_sans_rubrique returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_rubrique() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:526:65: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:527:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_rubrique1643); 
			 lepar_arbre.ajouteFils(new Arbre("rubrique NOT LIKE", "'"+a.getText()+"'"));
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:531:1: param_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:531:58: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:532:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_auteur1665); 
			 lepar_arbre.ajouteFils(new Arbre("auteur.email =", "'"+a.getText()+"'"));
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:536:1: param_sans_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:536:63: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:537:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_auteur1687); 
			 lepar_arbre.ajouteFils(new Arbre("email NOT LIKE", "'"+a.getText()+"'"));
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:541:1: param_date returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ( JOUR a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) );
	public final Arbre param_date() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:541:56: ( ( JOUR a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) )
			int alt11=4;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==JOUR) ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1==NUMERO) ) {
					int LA11_3 = input.LA(3);
					if ( (LA11_3==EOF||(LA11_3 >= ARTICLE && LA11_3 <= DATE_ENTRE)||(LA11_3 >= MOT && LA11_3 <= NUMERO)||(LA11_3 >= RUBRIQUE && LA11_3 <= SANS)) ) {
						alt11=1;
					}
					else if ( (LA11_3==MOIS) ) {
						int LA11_5 = input.LA(4);
						if ( (LA11_5==NUMERO) ) {
							int LA11_6 = input.LA(5);
							if ( (LA11_6==EOF||(LA11_6 >= ARTICLE && LA11_6 <= DATE_ENTRE)||(LA11_6 >= MOT && LA11_6 <= NUMERO)||(LA11_6 >= RUBRIQUE && LA11_6 <= SANS)) ) {
								alt11=2;
							}
							else if ( (LA11_6==ANNEE) ) {
								alt11=3;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 6, input);
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
									new NoViableAltException("", 11, 5, input);
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
								new NoViableAltException("", 11, 3, input);
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
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA11_0==MOIS) ) {
				alt11=4;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:542:2: ( JOUR a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:542:2: ( JOUR a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:542:3: JOUR a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date1706); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1712); 
					 lepar_arbre.ajouteFils(new Arbre("jour =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:546:2: ( JOUR a= NUMERO MOIS a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:546:2: ( JOUR a= NUMERO MOIS a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:546:3: JOUR a= NUMERO MOIS a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date1727); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1733); 
					 lepar_arbre.ajouteFils(new Arbre("jour =", "'"+a.getText()+"' AND "));
					match(input,MOIS,FOLLOW_MOIS_in_param_date1740); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1746); 
					 lepar_arbre.ajouteFils(new Arbre("mois =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:552:2: ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:552:2: ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:552:3: JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date1760); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1766); 
					 lepar_arbre.ajouteFils(new Arbre("jour =", "'"+a.getText()+"' AND "));
					match(input,MOIS,FOLLOW_MOIS_in_param_date1773); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1779); 
					 lepar_arbre.ajouteFils(new Arbre("mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date1786); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1792); 
					 lepar_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 4 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:560:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:560:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:560:3: MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,MOIS,FOLLOW_MOIS_in_param_date1806); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1812); 
					 lepar_arbre.ajouteFils(new Arbre("mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date1819); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date1825); 
					 lepar_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:567:1: param_date_avant returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) );
	public final Arbre param_date_avant() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:567:62: ( ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==JOUR) ) {
				alt12=1;
			}
			else if ( (LA12_0==MOIS) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:568:2: ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:568:2: ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:568:3: JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date_avant1848); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant1854); 
					 lepar_arbre.ajouteFils(new Arbre("jour =", "'"+a.getText()+"' AND "));
					match(input,MOIS,FOLLOW_MOIS_in_param_date_avant1861); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant1867); 
					 lepar_arbre.ajouteFils(new Arbre("mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date_avant1874); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant1880); 
					 lepar_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:576:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:576:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:576:3: MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,MOIS,FOLLOW_MOIS_in_param_date_avant1894); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant1900); 
					 lepar_arbre.ajouteFils(new Arbre("mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date_avant1907); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant1913); 
					 lepar_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
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
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:583:1: param_date_apres returns [Arbre lepar_arbre = new Arbre(\"\")] : ( JOUR a= NUMERO | MOIS a= NUMERO | ANNEE a= NUMERO )+ ;
	public final Arbre param_date_apres() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:583:62: ( ( JOUR a= NUMERO | MOIS a= NUMERO | ANNEE a= NUMERO )+ )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:584:2: ( JOUR a= NUMERO | MOIS a= NUMERO | ANNEE a= NUMERO )+
			{
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:584:2: ( JOUR a= NUMERO | MOIS a= NUMERO | ANNEE a= NUMERO )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=4;
				switch ( input.LA(1) ) {
				case JOUR:
					{
					int LA13_2 = input.LA(2);
					if ( (LA13_2==NUMERO) ) {
						int LA13_5 = input.LA(3);
						if ( (LA13_5==MOIS) ) {
							int LA13_7 = input.LA(4);
							if ( (LA13_7==NUMERO) ) {
								int LA13_11 = input.LA(5);
								if ( (LA13_11==ANNEE) ) {
									int LA13_13 = input.LA(6);
									if ( (LA13_13==NUMERO) ) {
										alt13=1;
									}

								}
								else if ( (LA13_11==EOF||(LA13_11 >= ARTICLE && LA13_11 <= DATE_ENTRE)||(LA13_11 >= JOUR && LA13_11 <= NUMERO)||(LA13_11 >= RUBRIQUE && LA13_11 <= SANS)) ) {
									alt13=1;
								}

							}

						}
						else if ( (LA13_5==EOF||(LA13_5 >= ANNEE && LA13_5 <= DATE_ENTRE)||LA13_5==JOUR||(LA13_5 >= MOT && LA13_5 <= NUMERO)||(LA13_5 >= RUBRIQUE && LA13_5 <= SANS)) ) {
							alt13=1;
						}

					}

					}
					break;
				case MOIS:
					{
					int LA13_3 = input.LA(2);
					if ( (LA13_3==NUMERO) ) {
						int LA13_6 = input.LA(3);
						if ( (LA13_6==ANNEE) ) {
							int LA13_9 = input.LA(4);
							if ( (LA13_9==NUMERO) ) {
								alt13=2;
							}

						}
						else if ( (LA13_6==EOF||(LA13_6 >= ARTICLE && LA13_6 <= DATE_ENTRE)||(LA13_6 >= JOUR && LA13_6 <= NUMERO)||(LA13_6 >= RUBRIQUE && LA13_6 <= SANS)) ) {
							alt13=2;
						}

					}

					}
					break;
				case ANNEE:
					{
					alt13=3;
					}
					break;
				}
				switch (alt13) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:584:3: JOUR a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date_apres1935); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_apres1941); 
					 lepar_arbre.ajouteFils(new Arbre("date.jour <", "'"+a.getText()+"'"));
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:586:4: MOIS a= NUMERO
					{
					match(input,MOIS,FOLLOW_MOIS_in_param_date_apres1950); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_apres1956); 
					 lepar_arbre.ajouteFils(new Arbre("date.mois <", "'"+a.getText()+"'"));
					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:588:4: ANNEE a= NUMERO
					{
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date_apres1965); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_apres1971); 
					 lepar_arbre.ajouteFils(new Arbre("date.annee <", "'"+a.getText()+"'"));
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
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



	// $ANTLR start "params_mot_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:593:1: params_mot_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_mot_auteur (par2= param_mot_auteur )* ;
	public final Arbre params_mot_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:594:52: (par1= param_mot_auteur (par2= param_mot_auteur )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:595:3: par1= param_mot_auteur (par2= param_mot_auteur )*
			{
			pushFollow(FOLLOW_param_mot_auteur_in_params_mot_auteur2005);
			par1=param_mot_auteur();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:600:3: (par2= param_mot_auteur )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==STRING) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:600:4: par2= param_mot_auteur
					{
					pushFollow(FOLLOW_param_mot_auteur_in_params_mot_auteur2020);
					par2=param_mot_auteur();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop14;
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
	// $ANTLR end "params_mot_auteur"



	// $ANTLR start "params_sans_mot_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:608:1: params_sans_mot_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_sans_mot_auteur ;
	public final Arbre params_sans_mot_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:609:52: (par1= param_sans_mot_auteur )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:610:3: par1= param_sans_mot_auteur
			{
			pushFollow(FOLLOW_param_sans_mot_auteur_in_params_sans_mot_auteur2053);
			par1=param_sans_mot_auteur();
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
	// $ANTLR end "params_sans_mot_auteur"



	// $ANTLR start "params_rubrique_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:617:1: params_rubrique_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_rubrique_auteur (par2= param_rubrique_auteur )* ;
	public final Arbre params_rubrique_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:618:40: (par1= param_rubrique_auteur (par2= param_rubrique_auteur )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:619:3: par1= param_rubrique_auteur (par2= param_rubrique_auteur )*
			{
			pushFollow(FOLLOW_param_rubrique_auteur_in_params_rubrique_auteur2084);
			par1=param_rubrique_auteur();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:624:3: (par2= param_rubrique_auteur )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==GUILLEMET||LA15_0==STRING) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:624:4: par2= param_rubrique_auteur
					{
					pushFollow(FOLLOW_param_rubrique_auteur_in_params_rubrique_auteur2099);
					par2=param_rubrique_auteur();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop15;
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
	// $ANTLR end "params_rubrique_auteur"



	// $ANTLR start "params_sans_rubrique_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:633:1: params_sans_rubrique_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_sans_rubrique_auteur ;
	public final Arbre params_sans_rubrique_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:634:52: (par1= param_sans_rubrique_auteur )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:635:3: par1= param_sans_rubrique_auteur
			{
			pushFollow(FOLLOW_param_sans_rubrique_auteur_in_params_sans_rubrique_auteur2135);
			par1=param_sans_rubrique_auteur();
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
	// $ANTLR end "params_sans_rubrique_auteur"



	// $ANTLR start "params_auteurs_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:642:1: params_auteurs_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_auteur_auteur (par2= param_auteur_auteur )* ;
	public final Arbre params_auteurs_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:643:40: (par1= param_auteur_auteur (par2= param_auteur_auteur )* )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:644:3: par1= param_auteur_auteur (par2= param_auteur_auteur )*
			{
			pushFollow(FOLLOW_param_auteur_auteur_in_params_auteurs_auteur2166);
			par1=param_auteur_auteur();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:649:3: (par2= param_auteur_auteur )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==STRING) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:649:4: par2= param_auteur_auteur
					{
					pushFollow(FOLLOW_param_auteur_auteur_in_params_auteurs_auteur2180);
					par2=param_auteur_auteur();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop16;
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
	// $ANTLR end "params_auteurs_auteur"



	// $ANTLR start "params_sans_auteur_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:657:1: params_sans_auteur_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_sans_auteur_auteur ;
	public final Arbre params_sans_auteur_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:658:52: (par1= param_sans_auteur_auteur )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:659:3: par1= param_sans_auteur_auteur
			{
			pushFollow(FOLLOW_param_sans_auteur_auteur_in_params_sans_auteur_auteur2213);
			par1=param_sans_auteur_auteur();
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
	// $ANTLR end "params_sans_auteur_auteur"



	// $ANTLR start "params_date_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:667:1: params_date_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_auteur ;
	public final Arbre params_date_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:668:40: (par1= param_date_auteur )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:669:3: par1= param_date_auteur
			{
			pushFollow(FOLLOW_param_date_auteur_in_params_date_auteur2245);
			par1=param_date_auteur();
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
	// $ANTLR end "params_date_auteur"



	// $ANTLR start "params_date_avant_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:676:1: params_date_avant_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_avant_auteur ;
	public final Arbre params_date_avant_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:677:40: (par1= param_date_avant_auteur )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:678:3: par1= param_date_avant_auteur
			{
			pushFollow(FOLLOW_param_date_avant_auteur_in_params_date_avant_auteur2276);
			par1=param_date_avant_auteur();
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
	// $ANTLR end "params_date_avant_auteur"



	// $ANTLR start "params_date_apres_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:685:1: params_date_apres_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_apres_auteur ;
	public final Arbre params_date_apres_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:686:40: (par1= param_date_apres_auteur )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:687:3: par1= param_date_apres_auteur
			{
			pushFollow(FOLLOW_param_date_apres_auteur_in_params_date_apres_auteur2307);
			par1=param_date_apres_auteur();
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
	// $ANTLR end "params_date_apres_auteur"



	// $ANTLR start "params_date_entre_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:694:1: params_date_entre_auteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_date_apres_auteur par2= param_date_avant_auteur ;
	public final Arbre params_date_entre_auteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:695:40: (par1= param_date_apres_auteur par2= param_date_avant_auteur )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:696:3: par1= param_date_apres_auteur par2= param_date_avant_auteur
			{
			pushFollow(FOLLOW_param_date_apres_auteur_in_params_date_entre_auteur2338);
			par1=param_date_apres_auteur();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			pushFollow(FOLLOW_param_date_avant_auteur_in_params_date_entre_auteur2351);
			par2=param_date_avant_auteur();
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
	// $ANTLR end "params_date_entre_auteur"



	// $ANTLR start "param_mot_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:708:1: param_mot_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_mot_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:708:62: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:709:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_mot_auteur2374); 
			 lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"' AND titretexte.fichier = email.fichier"));
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
	// $ANTLR end "param_mot_auteur"



	// $ANTLR start "param_sans_mot_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:713:1: param_sans_mot_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_mot_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:713:67: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:714:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_mot_auteur2396); 
			 lepar_arbre.ajouteFils(new Arbre("mot NOT LIKE", "'"+a.getText()+"' AND titretexte.fichier = email.fichier"));
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
	// $ANTLR end "param_sans_mot_auteur"



	// $ANTLR start "param_rubrique_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:718:1: param_rubrique_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= STRING | GUILLEMET (a= STRING ) GUILLEMET );
	public final Arbre param_rubrique_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:718:67: (a= STRING | GUILLEMET (a= STRING ) GUILLEMET )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==STRING) ) {
				alt17=1;
			}
			else if ( (LA17_0==GUILLEMET) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:719:2: a= STRING
					{
					a=(Token)match(input,STRING,FOLLOW_STRING_in_param_rubrique_auteur2418); 
					 lepar_arbre.ajouteFils(new Arbre("rubrique =", "'"+a.getText()+"' AND rubrique.fichier = email.fichier"));
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:721:4: GUILLEMET (a= STRING ) GUILLEMET
					{
					match(input,GUILLEMET,FOLLOW_GUILLEMET_in_param_rubrique_auteur2427); 
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:721:14: (a= STRING )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:721:15: a= STRING
					{
					a=(Token)match(input,STRING,FOLLOW_STRING_in_param_rubrique_auteur2434); 
					}

					match(input,GUILLEMET,FOLLOW_GUILLEMET_in_param_rubrique_auteur2437); 
					 lepar_arbre.ajouteFils(new Arbre("rubrique =", "'"+a.getText()+"' AND rubrique.fichier = email.fichier"));
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
	// $ANTLR end "param_rubrique_auteur"



	// $ANTLR start "param_sans_rubrique_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:726:1: param_sans_rubrique_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_rubrique_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:726:72: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:727:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_rubrique_auteur2462); 
			 lepar_arbre.ajouteFils(new Arbre("rubrique NOT LIKE", "'"+a.getText()+"' AND rubrique.fichier = email.fichier"));
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
	// $ANTLR end "param_sans_rubrique_auteur"



	// $ANTLR start "param_auteur_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:731:1: param_auteur_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_auteur_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:731:65: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:732:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_auteur_auteur2484); 
			 lepar_arbre.ajouteFils(new Arbre("auteur.email =", "'"+a.getText()+"'"));
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
	// $ANTLR end "param_auteur_auteur"



	// $ANTLR start "param_sans_auteur_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:736:1: param_sans_auteur_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : a= STRING ;
	public final Arbre param_sans_auteur_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:736:70: (a= STRING )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:737:2: a= STRING
			{
			a=(Token)match(input,STRING,FOLLOW_STRING_in_param_sans_auteur_auteur2506); 
			 lepar_arbre.ajouteFils(new Arbre("email NOT LIKE", "'"+a.getText()+"'"));
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
	// $ANTLR end "param_sans_auteur_auteur"



	// $ANTLR start "param_date_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:741:1: param_date_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ( JOUR a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) );
	public final Arbre param_date_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:741:63: ( ( JOUR a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ) | ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) )
			int alt18=4;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==JOUR) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==NUMERO) ) {
					int LA18_3 = input.LA(3);
					if ( (LA18_3==EOF||(LA18_3 >= ARTICLE && LA18_3 <= DATE_ENTRE)||(LA18_3 >= MOT && LA18_3 <= NUMERO)||(LA18_3 >= RUBRIQUE && LA18_3 <= SANS)) ) {
						alt18=1;
					}
					else if ( (LA18_3==MOIS) ) {
						int LA18_5 = input.LA(4);
						if ( (LA18_5==NUMERO) ) {
							int LA18_6 = input.LA(5);
							if ( (LA18_6==EOF||(LA18_6 >= ARTICLE && LA18_6 <= DATE_ENTRE)||(LA18_6 >= MOT && LA18_6 <= NUMERO)||(LA18_6 >= RUBRIQUE && LA18_6 <= SANS)) ) {
								alt18=2;
							}
							else if ( (LA18_6==ANNEE) ) {
								alt18=3;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 18, 6, input);
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
									new NoViableAltException("", 18, 5, input);
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
								new NoViableAltException("", 18, 3, input);
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
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA18_0==MOIS) ) {
				alt18=4;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:742:2: ( JOUR a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:742:2: ( JOUR a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:742:3: JOUR a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date_auteur2525); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_auteur2531); 
					 lepar_arbre.ajouteFils(new Arbre("jour =", "'"+a.getText()+"' AND date.fichier = email.fichier"));
					}

					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:746:2: ( JOUR a= NUMERO MOIS a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:746:2: ( JOUR a= NUMERO MOIS a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:746:3: JOUR a= NUMERO MOIS a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date_auteur2546); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_auteur2552); 
					 lepar_arbre.ajouteFils(new Arbre("jour =", "'"+a.getText()+"' AND "));
					match(input,MOIS,FOLLOW_MOIS_in_param_date_auteur2559); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_auteur2565); 
					 lepar_arbre.ajouteFils(new Arbre("mois =", "'"+a.getText()+"' AND date.fichier = email.fichier"));
					}

					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:752:2: ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:752:2: ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:752:3: JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date_auteur2579); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_auteur2585); 
					 lepar_arbre.ajouteFils(new Arbre("jour =", "'"+a.getText()+"' AND "));
					match(input,MOIS,FOLLOW_MOIS_in_param_date_auteur2592); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_auteur2598); 
					 lepar_arbre.ajouteFils(new Arbre("mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date_auteur2605); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_auteur2611); 
					 lepar_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"' AND date.fichier = email.fichier"));
					}

					}
					break;
				case 4 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:760:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:760:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:760:3: MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,MOIS,FOLLOW_MOIS_in_param_date_auteur2625); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_auteur2631); 
					 lepar_arbre.ajouteFils(new Arbre("mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date_auteur2638); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_auteur2644); 
					 lepar_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"' AND date.fichier = email.fichier"));
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
	// $ANTLR end "param_date_auteur"



	// $ANTLR start "param_date_avant_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:767:1: param_date_avant_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : ( ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) );
	public final Arbre param_date_avant_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:767:69: ( ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO ) | ( MOIS a= NUMERO ANNEE a= NUMERO ) )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==JOUR) ) {
				alt19=1;
			}
			else if ( (LA19_0==MOIS) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:768:2: ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:768:2: ( JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:768:3: JOUR a= NUMERO MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date_avant_auteur2667); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant_auteur2673); 
					 lepar_arbre.ajouteFils(new Arbre("jour =", "'"+a.getText()+"' AND "));
					match(input,MOIS,FOLLOW_MOIS_in_param_date_avant_auteur2680); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant_auteur2686); 
					 lepar_arbre.ajouteFils(new Arbre("mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date_avant_auteur2693); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant_auteur2699); 
					 lepar_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
					}

					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:776:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					{
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:776:2: ( MOIS a= NUMERO ANNEE a= NUMERO )
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:776:3: MOIS a= NUMERO ANNEE a= NUMERO
					{
					match(input,MOIS,FOLLOW_MOIS_in_param_date_avant_auteur2713); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant_auteur2719); 
					 lepar_arbre.ajouteFils(new Arbre("mois =", "'"+a.getText()+"' AND "));
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date_avant_auteur2726); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_avant_auteur2732); 
					 lepar_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
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
	// $ANTLR end "param_date_avant_auteur"



	// $ANTLR start "param_date_apres_auteur"
	// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:783:1: param_date_apres_auteur returns [Arbre lepar_arbre = new Arbre(\"\")] : ( JOUR a= NUMERO | MOIS a= NUMERO | ANNEE a= NUMERO )+ ;
	public final Arbre param_date_apres_auteur() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:783:69: ( ( JOUR a= NUMERO | MOIS a= NUMERO | ANNEE a= NUMERO )+ )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:784:2: ( JOUR a= NUMERO | MOIS a= NUMERO | ANNEE a= NUMERO )+
			{
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:784:2: ( JOUR a= NUMERO | MOIS a= NUMERO | ANNEE a= NUMERO )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=4;
				switch ( input.LA(1) ) {
				case JOUR:
					{
					int LA20_2 = input.LA(2);
					if ( (LA20_2==NUMERO) ) {
						int LA20_5 = input.LA(3);
						if ( (LA20_5==MOIS) ) {
							int LA20_7 = input.LA(4);
							if ( (LA20_7==NUMERO) ) {
								int LA20_11 = input.LA(5);
								if ( (LA20_11==ANNEE) ) {
									int LA20_13 = input.LA(6);
									if ( (LA20_13==NUMERO) ) {
										alt20=1;
									}

								}
								else if ( (LA20_11==EOF||(LA20_11 >= ARTICLE && LA20_11 <= DATE_ENTRE)||(LA20_11 >= JOUR && LA20_11 <= NUMERO)||(LA20_11 >= RUBRIQUE && LA20_11 <= SANS)) ) {
									alt20=1;
								}

							}

						}
						else if ( (LA20_5==EOF||(LA20_5 >= ANNEE && LA20_5 <= DATE_ENTRE)||LA20_5==JOUR||(LA20_5 >= MOT && LA20_5 <= NUMERO)||(LA20_5 >= RUBRIQUE && LA20_5 <= SANS)) ) {
							alt20=1;
						}

					}

					}
					break;
				case MOIS:
					{
					int LA20_3 = input.LA(2);
					if ( (LA20_3==NUMERO) ) {
						int LA20_6 = input.LA(3);
						if ( (LA20_6==ANNEE) ) {
							int LA20_9 = input.LA(4);
							if ( (LA20_9==NUMERO) ) {
								alt20=2;
							}

						}
						else if ( (LA20_6==EOF||(LA20_6 >= ARTICLE && LA20_6 <= DATE_ENTRE)||(LA20_6 >= JOUR && LA20_6 <= NUMERO)||(LA20_6 >= RUBRIQUE && LA20_6 <= SANS)) ) {
							alt20=2;
						}

					}

					}
					break;
				case ANNEE:
					{
					alt20=3;
					}
					break;
				}
				switch (alt20) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:784:3: JOUR a= NUMERO
					{
					match(input,JOUR,FOLLOW_JOUR_in_param_date_apres_auteur2754); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_apres_auteur2760); 
					 lepar_arbre.ajouteFils(new Arbre("date.jour <", "'"+a.getText()+"'"));
					}
					break;
				case 2 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:786:4: MOIS a= NUMERO
					{
					match(input,MOIS,FOLLOW_MOIS_in_param_date_apres_auteur2769); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_apres_auteur2775); 
					 lepar_arbre.ajouteFils(new Arbre("date.mois <", "'"+a.getText()+"'"));
					}
					break;
				case 3 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:788:4: ANNEE a= NUMERO
					{
					match(input,ANNEE,FOLLOW_ANNEE_in_param_date_apres_auteur2784); 
					a=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_param_date_apres_auteur2790); 
					 lepar_arbre.ajouteFils(new Arbre("date.annee <", "'"+a.getText()+"'"));
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
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
	// $ANTLR end "param_date_apres_auteur"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete305 = new BitSet(new long[]{0x00000000000209C0L});
	public static final BitSet FOLLOW_SELECT_COUNT_in_requete318 = new BitSet(new long[]{0x00000000000209C0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete331 = new BitSet(new long[]{0x0000000000311E80L});
	public static final BitSet FOLLOW_BULLETIN_in_requete342 = new BitSet(new long[]{0x0000000000311E80L});
	public static final BitSet FOLLOW_NUMERO_in_requete353 = new BitSet(new long[]{0x0000000000311E80L});
	public static final BitSet FOLLOW_MOT_in_requete364 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_in_requete377 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_SANS_in_requete389 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_requete391 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_mot_in_requete404 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete416 = new BitSet(new long[]{0x0000000001002000L});
	public static final BitSet FOLLOW_params_rubrique_in_requete429 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_SANS_in_requete441 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete443 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_rubrique_in_requete456 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_AUTEUR_in_requete467 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_auteurs_in_requete481 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_SANS_in_requete492 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AUTEUR_in_requete494 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_auteur_in_requete508 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_EN_in_requete519 = new BitSet(new long[]{0x000000000000C000L});
	public static final BitSet FOLLOW_params_date_in_requete532 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_AVANT_in_requete543 = new BitSet(new long[]{0x000000000000C000L});
	public static final BitSet FOLLOW_params_date_avant_in_requete557 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_APRES_in_requete568 = new BitSet(new long[]{0x000000000000C020L});
	public static final BitSet FOLLOW_params_date_apres_in_requete581 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_ENTRE_in_requete592 = new BitSet(new long[]{0x000000000000C020L});
	public static final BitSet FOLLOW_params_date_entre_in_requete605 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_AUTEUR_in_requete619 = new BitSet(new long[]{0x0000000000311E80L});
	public static final BitSet FOLLOW_MOT_in_requete630 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_mot_auteur_in_requete643 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_SANS_in_requete655 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_requete657 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_mot_auteur_in_requete670 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete682 = new BitSet(new long[]{0x0000000001002000L});
	public static final BitSet FOLLOW_params_rubrique_auteur_in_requete695 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_SANS_in_requete707 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete709 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_rubrique_auteur_in_requete722 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_AUTEUR_in_requete733 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_auteurs_auteur_in_requete747 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_SANS_in_requete758 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AUTEUR_in_requete760 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_auteur_auteur_in_requete774 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_EN_in_requete785 = new BitSet(new long[]{0x000000000000C000L});
	public static final BitSet FOLLOW_params_date_auteur_in_requete798 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_AVANT_in_requete809 = new BitSet(new long[]{0x000000000000C000L});
	public static final BitSet FOLLOW_params_date_avant_auteur_in_requete823 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_APRES_in_requete834 = new BitSet(new long[]{0x000000000000C020L});
	public static final BitSet FOLLOW_params_date_apres_auteur_in_requete847 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_ENTRE_in_requete858 = new BitSet(new long[]{0x000000000000C020L});
	public static final BitSet FOLLOW_params_date_entre_auteur_in_requete871 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_EN_in_requete889 = new BitSet(new long[]{0x0000000000311E80L});
	public static final BitSet FOLLOW_MOT_in_requete901 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_in_requete914 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_SANS_in_requete926 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_requete928 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_mot_in_requete941 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete953 = new BitSet(new long[]{0x0000000001002000L});
	public static final BitSet FOLLOW_params_rubrique_in_requete966 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_SANS_in_requete978 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete980 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_rubrique_in_requete993 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1004 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_auteurs_in_requete1018 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_SANS_in_requete1029 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1031 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_sans_auteur_in_requete1045 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_EN_in_requete1056 = new BitSet(new long[]{0x000000000000C000L});
	public static final BitSet FOLLOW_params_date_in_requete1069 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_AVANT_in_requete1080 = new BitSet(new long[]{0x000000000000C000L});
	public static final BitSet FOLLOW_params_date_avant_in_requete1094 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_APRES_in_requete1105 = new BitSet(new long[]{0x000000000000C020L});
	public static final BitSet FOLLOW_params_date_apres_in_requete1118 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_DATE_ENTRE_in_requete1129 = new BitSet(new long[]{0x000000000000C020L});
	public static final BitSet FOLLOW_params_date_entre_in_requete1142 = new BitSet(new long[]{0x0000000000331FC2L});
	public static final BitSet FOLLOW_param_in_params1186 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_param_in_params1201 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_param_sans_mot_in_params_sans_mot1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_rubrique_in_params_rubrique1265 = new BitSet(new long[]{0x0000000001002002L});
	public static final BitSet FOLLOW_param_rubrique_in_params_rubrique1280 = new BitSet(new long[]{0x0000000001002002L});
	public static final BitSet FOLLOW_param_sans_rubrique_in_params_sans_rubrique1316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_auteur_in_params_auteurs1347 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_param_auteur_in_params_auteurs1361 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_param_sans_auteur_in_params_sans_auteur1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_in_params_date1426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_avant_in_params_date_avant1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_apres_in_params_date_apres1488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_apres_in_params_date_entre1519 = new BitSet(new long[]{0x000000000000C000L});
	public static final BitSet FOLLOW_param_date_avant_in_params_date_entre1532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param1555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_mot1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_rubrique1599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GUILLEMET_in_param_rubrique1608 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_STRING_in_param_rubrique1615 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_GUILLEMET_in_param_rubrique1618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_rubrique1643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_auteur1665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_auteur1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date1706 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date1727 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1733 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param_date1740 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date1760 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1766 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param_date1773 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1779 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date1786 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_param_date1806 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1812 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date1819 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date1825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date_avant1848 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant1854 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param_date_avant1861 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant1867 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_avant1874 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant1880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_param_date_avant1894 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant1900 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_avant1907 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant1913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date_apres1935 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_apres1941 = new BitSet(new long[]{0x000000000000C022L});
	public static final BitSet FOLLOW_MOIS_in_param_date_apres1950 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_apres1956 = new BitSet(new long[]{0x000000000000C022L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_apres1965 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_apres1971 = new BitSet(new long[]{0x000000000000C022L});
	public static final BitSet FOLLOW_param_mot_auteur_in_params_mot_auteur2005 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_param_mot_auteur_in_params_mot_auteur2020 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_param_sans_mot_auteur_in_params_sans_mot_auteur2053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_rubrique_auteur_in_params_rubrique_auteur2084 = new BitSet(new long[]{0x0000000001002002L});
	public static final BitSet FOLLOW_param_rubrique_auteur_in_params_rubrique_auteur2099 = new BitSet(new long[]{0x0000000001002002L});
	public static final BitSet FOLLOW_param_sans_rubrique_auteur_in_params_sans_rubrique_auteur2135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_auteur_auteur_in_params_auteurs_auteur2166 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_param_auteur_auteur_in_params_auteurs_auteur2180 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_param_sans_auteur_auteur_in_params_sans_auteur_auteur2213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_auteur_in_params_date_auteur2245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_avant_auteur_in_params_date_avant_auteur2276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_apres_auteur_in_params_date_apres_auteur2307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_date_apres_auteur_in_params_date_entre_auteur2338 = new BitSet(new long[]{0x000000000000C000L});
	public static final BitSet FOLLOW_param_date_avant_auteur_in_params_date_entre_auteur2351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_mot_auteur2374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_mot_auteur2396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_rubrique_auteur2418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GUILLEMET_in_param_rubrique_auteur2427 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_STRING_in_param_rubrique_auteur2434 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_GUILLEMET_in_param_rubrique_auteur2437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_rubrique_auteur2462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_auteur_auteur2484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_param_sans_auteur_auteur2506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date_auteur2525 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_auteur2531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date_auteur2546 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_auteur2552 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param_date_auteur2559 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_auteur2565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date_auteur2579 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_auteur2585 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param_date_auteur2592 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_auteur2598 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_auteur2605 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_auteur2611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_param_date_auteur2625 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_auteur2631 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_auteur2638 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_auteur2644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date_avant_auteur2667 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant_auteur2673 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param_date_avant_auteur2680 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant_auteur2686 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_avant_auteur2693 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant_auteur2699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_param_date_avant_auteur2713 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant_auteur2719 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_avant_auteur2726 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_avant_auteur2732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_date_apres_auteur2754 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_apres_auteur2760 = new BitSet(new long[]{0x000000000000C022L});
	public static final BitSet FOLLOW_MOIS_in_param_date_apres_auteur2769 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_apres_auteur2775 = new BitSet(new long[]{0x000000000000C022L});
	public static final BitSet FOLLOW_ANNEE_in_param_date_apres_auteur2784 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_param_date_apres_auteur2790 = new BitSet(new long[]{0x000000000000C022L});
}
