// $ANTLR 3.5.1 C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g 2020-01-13 18:07:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:3:8: ( 'vouloir' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:3:10: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "SELECT_COUNT"
	public final void mSELECT_COUNT() throws RecognitionException {
		try {
			int _type = SELECT_COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:5:14: ( 'combien' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:5:16: 'combien'
			{
			match("combien"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT_COUNT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:7:9: ( 'article' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:7:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:9:10: ( 'bulletin' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:9:12: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:11:5: ( 'et' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:11:7: 'et'
			{
			match("et"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:13:4: ( 'ou' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:13:6: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "SANS"
	public final void mSANS() throws RecognitionException {
		try {
			int _type = SANS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:15:7: ( 'sans' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:15:9: 'sans'
			{
			match("sans"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SANS"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:17:7: ( '.' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:17:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "VIRGULE"
	public final void mVIRGULE() throws RecognitionException {
		try {
			int _type = VIRGULE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:19:9: ( ',' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:19:11: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VIRGULE"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:21:5: ( 'mot' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:21:7: 'mot'
			{
			match("mot"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:23:9: ( 'auteur' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:23:11: 'auteur'
			{
			match("auteur"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTEUR"

	// $ANTLR start "DATE_EN"
	public final void mDATE_EN() throws RecognitionException {
		try {
			int _type = DATE_EN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:25:9: ( 'date en' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:25:11: 'date en'
			{
			match("date en"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_EN"

	// $ANTLR start "DATE_AVANT"
	public final void mDATE_AVANT() throws RecognitionException {
		try {
			int _type = DATE_AVANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:27:12: ( 'date avant' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:27:14: 'date avant'
			{
			match("date avant"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_AVANT"

	// $ANTLR start "DATE_APRES"
	public final void mDATE_APRES() throws RecognitionException {
		try {
			int _type = DATE_APRES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:29:12: ( 'date apres' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:29:14: 'date apres'
			{
			match("date apres"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_APRES"

	// $ANTLR start "DATE_ENTRE"
	public final void mDATE_ENTRE() throws RecognitionException {
		try {
			int _type = DATE_ENTRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:31:12: ( 'date entre' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:31:14: 'date entre'
			{
			match("date entre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_ENTRE"

	// $ANTLR start "JOUR"
	public final void mJOUR() throws RecognitionException {
		try {
			int _type = JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:33:7: ( 'jour' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:33:9: 'jour'
			{
			match("jour"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOUR"

	// $ANTLR start "MOIS"
	public final void mMOIS() throws RecognitionException {
		try {
			int _type = MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:34:7: ( 'mois' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:34:9: 'mois'
			{
			match("mois"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOIS"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:35:8: ( 'annee' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:35:10: 'annee'
			{
			match("annee"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNEE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:37:10: ( 'rubrique' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:37:12: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:39:8: ( 'titre' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:39:10: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:41:9: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '.' | '@' )+ )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:41:11: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '.' | '@' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:41:33: ( 'a' .. 'z' | '.' | '@' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='.'||LA1_0=='@'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:
					{
					if ( input.LA(1)=='.'||input.LA(1)=='@'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "NUMERO"
	public final void mNUMERO() throws RecognitionException {
		try {
			int _type = NUMERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:43:9: ( ( '0' .. '9' )+ )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:43:11: ( '0' .. '9' )+
			{
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:43:11: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERO"

	// $ANTLR start "GUILLEMET"
	public final void mGUILLEMET() throws RecognitionException {
		try {
			int _type = GUILLEMET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:45:11: ( '\"' )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:45:13: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GUILLEMET"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:47:5: ( ( ' ' | '\\t' | '\\r' ) )
			// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:47:7: ( ' ' | '\\t' | '\\r' )
			{
			if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:8: ( SELECT | SELECT_COUNT | ARTICLE | BULLETIN | AND | OR | SANS | POINT | VIRGULE | MOT | AUTEUR | DATE_EN | DATE_AVANT | DATE_APRES | DATE_ENTRE | JOUR | MOIS | ANNEE | RUBRIQUE | TITRE | STRING | NUMERO | GUILLEMET | WS )
		int alt3=24;
		alt3 = dfa3.predict(input);
		switch (alt3) {
			case 1 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:17: SELECT_COUNT
				{
				mSELECT_COUNT(); 

				}
				break;
			case 3 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:30: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 4 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:38: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 5 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:47: AND
				{
				mAND(); 

				}
				break;
			case 6 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:51: OR
				{
				mOR(); 

				}
				break;
			case 7 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:54: SANS
				{
				mSANS(); 

				}
				break;
			case 8 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:59: POINT
				{
				mPOINT(); 

				}
				break;
			case 9 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:65: VIRGULE
				{
				mVIRGULE(); 

				}
				break;
			case 10 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:73: MOT
				{
				mMOT(); 

				}
				break;
			case 11 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:77: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 12 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:84: DATE_EN
				{
				mDATE_EN(); 

				}
				break;
			case 13 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:92: DATE_AVANT
				{
				mDATE_AVANT(); 

				}
				break;
			case 14 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:103: DATE_APRES
				{
				mDATE_APRES(); 

				}
				break;
			case 15 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:114: DATE_ENTRE
				{
				mDATE_ENTRE(); 

				}
				break;
			case 16 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:125: JOUR
				{
				mJOUR(); 

				}
				break;
			case 17 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:130: MOIS
				{
				mMOIS(); 

				}
				break;
			case 18 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:135: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 19 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:141: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 20 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:150: TITRE
				{
				mTITRE(); 

				}
				break;
			case 21 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:156: STRING
				{
				mSTRING(); 

				}
				break;
			case 22 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:163: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 23 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:170: GUILLEMET
				{
				mGUILLEMET(); 

				}
				break;
			case 24 :
				// C:\\Users\\annly\\Documents\\UTC\\GI04\\LO17\\TD\\lo17\\antlr_works\\tal_sql.g:1:180: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\23\uffff\6\17\1\47\1\50\14\17\2\uffff\1\17\1\67\13\17\1\103\1\uffff\1"+
		"\104\1\17\1\106\6\17\1\115\1\17\4\uffff\1\17\1\122\3\17\1\126\1\uffff"+
		"\1\17\2\uffff\1\17\1\uffff\1\134\1\135\1\136\1\uffff\1\17\1\141\2\uffff"+
		"\1\17\3\uffff\1\143\2\uffff\1\144\2\uffff";
	static final String DFA3_eofS =
		"\145\uffff";
	static final String DFA3_minS =
		"\1\11\7\56\2\uffff\5\56\4\uffff\1\165\1\155\2\164\1\156\1\154\2\56\1\156"+
		"\1\151\1\164\1\165\1\142\1\164\1\154\1\142\1\151\2\145\1\154\2\uffff\1"+
		"\163\1\56\1\163\1\145\3\162\1\157\1\151\1\143\1\165\2\145\1\56\1\uffff"+
		"\1\56\1\40\1\56\1\151\1\145\1\151\1\145\1\154\1\162\1\56\1\164\2\uffff"+
		"\1\141\1\uffff\1\161\1\56\1\162\1\156\1\145\1\56\1\uffff\1\151\1\156\1"+
		"\160\1\165\1\uffff\3\56\1\uffff\1\156\1\164\2\uffff\1\145\3\uffff\1\56"+
		"\2\uffff\1\56\2\uffff";
	static final String DFA3_maxS =
		"\10\172\2\uffff\5\172\4\uffff\1\165\1\155\2\164\1\156\1\154\2\172\1\156"+
		"\2\164\1\165\1\142\1\164\1\154\1\142\1\151\2\145\1\154\2\uffff\1\163\1"+
		"\172\1\163\1\145\3\162\1\157\1\151\1\143\1\165\2\145\1\172\1\uffff\1\172"+
		"\1\40\1\172\1\151\1\145\1\151\1\145\1\154\1\162\1\172\1\164\2\uffff\1"+
		"\145\1\uffff\1\161\1\172\1\162\1\156\1\145\1\172\1\uffff\1\151\1\156\1"+
		"\166\1\165\1\uffff\3\172\1\uffff\1\156\1\164\2\uffff\1\145\3\uffff\1\172"+
		"\2\uffff\1\172\2\uffff";
	static final String DFA3_acceptS =
		"\10\uffff\1\10\1\11\5\uffff\1\25\1\26\1\27\1\30\24\uffff\1\5\1\6\16\uffff"+
		"\1\12\13\uffff\1\7\1\21\1\uffff\1\20\6\uffff\1\22\4\uffff\1\24\3\uffff"+
		"\1\13\2\uffff\1\15\1\16\1\uffff\1\1\1\2\1\3\1\uffff\1\17\1\14\1\uffff"+
		"\1\4\1\23";
	static final String DFA3_specialS =
		"\145\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\22\3\uffff\1\22\22\uffff\1\22\1\uffff\1\21\11\uffff\1\11\1\uffff\1"+
			"\10\1\uffff\12\20\7\uffff\32\17\6\uffff\1\3\1\4\1\2\1\13\1\5\4\17\1\14"+
			"\2\17\1\12\1\17\1\6\2\17\1\15\1\7\1\16\1\17\1\1\4\17",
			"\1\17\21\uffff\1\17\40\uffff\16\17\1\23\13\17",
			"\1\17\21\uffff\1\17\40\uffff\16\17\1\24\13\17",
			"\1\17\21\uffff\1\17\40\uffff\15\17\1\27\3\17\1\25\2\17\1\26\5\17",
			"\1\17\21\uffff\1\17\40\uffff\24\17\1\30\5\17",
			"\1\17\21\uffff\1\17\40\uffff\23\17\1\31\6\17",
			"\1\17\21\uffff\1\17\40\uffff\24\17\1\32\5\17",
			"\1\17\21\uffff\1\17\40\uffff\1\33\31\17",
			"",
			"",
			"\1\17\21\uffff\1\17\40\uffff\16\17\1\34\13\17",
			"\1\17\21\uffff\1\17\40\uffff\1\35\31\17",
			"\1\17\21\uffff\1\17\40\uffff\16\17\1\36\13\17",
			"\1\17\21\uffff\1\17\40\uffff\24\17\1\37\5\17",
			"\1\17\21\uffff\1\17\40\uffff\10\17\1\40\21\17",
			"",
			"",
			"",
			"",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"\1\51",
			"\1\53\12\uffff\1\52",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"",
			"",
			"\1\66",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"\1\105",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"\1\116",
			"",
			"",
			"\1\120\3\uffff\1\117",
			"",
			"\1\121",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"",
			"\1\127",
			"\1\130",
			"\1\132\5\uffff\1\131",
			"\1\133",
			"",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"",
			"\1\137",
			"\1\140",
			"",
			"",
			"\1\142",
			"",
			"",
			"",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"",
			"",
			"\1\17\21\uffff\1\17\40\uffff\32\17",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | SELECT_COUNT | ARTICLE | BULLETIN | AND | OR | SANS | POINT | VIRGULE | MOT | AUTEUR | DATE_EN | DATE_AVANT | DATE_APRES | DATE_ENTRE | JOUR | MOIS | ANNEE | RUBRIQUE | TITRE | STRING | NUMERO | GUILLEMET | WS );";
		}
	}

}
