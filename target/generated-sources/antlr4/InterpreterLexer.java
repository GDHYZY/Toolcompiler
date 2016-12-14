// Generated from Interpreter.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpreterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, Whitespace=19, Newline=20, ID=21, NUM=22, Eq=23, Assign=24, 
		Mul=25, Div=26, Add=27, Sub=28, Inc=29, Dec=30, Ne=31, Le=32, Shl=33, 
		Lt=34, Ge=35, Shr=36, Gt=37, Lor=38, Or=39, Lan=40, And=41, Xor=42, Mod=43, 
		Brak=44, Cond=45, Til=46, Not=47, BCMT=48, LCMT=49, CODING=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "Whitespace", "Newline", "ID", "NUM", "Eq", "Assign", "Mul", 
		"Div", "Add", "Sub", "Inc", "Dec", "Ne", "Le", "Shl", "Lt", "Ge", "Shr", 
		"Gt", "Lor", "Or", "Lan", "And", "Xor", "Mod", "Brak", "Cond", "Til", 
		"Not", "BCMT", "LCMT", "CODING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "']'", "'('", "','", "')'", "'.'", "'->'", "'''", "'\"'", "'int'", 
		"'char'", "'enum'", "'{'", "'}'", "';'", "'return'", "'if'", "'else'", 
		"'while'", null, null, null, null, "'=='", "'='", "'*'", "'/'", "'+'", 
		"'-'", "'++'", "'--'", "'!='", "'<='", "'<<'", "'<'", "'>='", "'>>'", 
		"'>'", "'||'", "'|'", "'&&'", "'&'", "'^'", "'%'", "'['", "'?'", "'~'", 
		"'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Whitespace", "Newline", "ID", 
		"NUM", "Eq", "Assign", "Mul", "Div", "Add", "Sub", "Inc", "Dec", "Ne", 
		"Le", "Shl", "Lt", "Ge", "Shr", "Gt", "Lor", "Or", "Lan", "And", "Xor", 
		"Mod", "Brak", "Cond", "Til", "Not", "BCMT", "LCMT", "CODING"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public InterpreterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u011d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u00a3\n\24"+
		"\r\24\16\24\u00a4\3\24\3\24\3\25\3\25\5\25\u00ab\n\25\3\25\5\25\u00ae"+
		"\n\25\3\25\3\25\3\26\3\26\7\26\u00b4\n\26\f\26\16\26\u00b7\13\26\3\27"+
		"\6\27\u00ba\n\27\r\27\16\27\u00bb\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3"+
		")\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\7\61\u00fe\n\61\f\61\16\61\u0101\13\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\7\62\u010c\n\62\f\62\16\62\u010f\13\62\3\62\5\62\u0112"+
		"\n\62\3\62\3\62\3\62\3\62\3\63\7\63\u0119\n\63\f\63\16\63\u011c\13\63"+
		"\4\u00ff\u011a\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64\3\2\7\4\2\13\13\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\f\f\17"+
		"\17\u0125\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2"+
		"\tm\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2"+
		"\25|\3\2\2\2\27\u0081\3\2\2\2\31\u0086\3\2\2\2\33\u0088\3\2\2\2\35\u008a"+
		"\3\2\2\2\37\u008c\3\2\2\2!\u0093\3\2\2\2#\u0096\3\2\2\2%\u009b\3\2\2\2"+
		"\'\u00a2\3\2\2\2)\u00ad\3\2\2\2+\u00b1\3\2\2\2-\u00b9\3\2\2\2/\u00bd\3"+
		"\2\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2\2\65\u00c4\3\2\2\2\67\u00c6\3\2"+
		"\2\29\u00c8\3\2\2\2;\u00ca\3\2\2\2=\u00cd\3\2\2\2?\u00d0\3\2\2\2A\u00d3"+
		"\3\2\2\2C\u00d6\3\2\2\2E\u00d9\3\2\2\2G\u00db\3\2\2\2I\u00de\3\2\2\2K"+
		"\u00e1\3\2\2\2M\u00e3\3\2\2\2O\u00e6\3\2\2\2Q\u00e8\3\2\2\2S\u00eb\3\2"+
		"\2\2U\u00ed\3\2\2\2W\u00ef\3\2\2\2Y\u00f1\3\2\2\2[\u00f3\3\2\2\2]\u00f5"+
		"\3\2\2\2_\u00f7\3\2\2\2a\u00f9\3\2\2\2c\u0107\3\2\2\2e\u011a\3\2\2\2g"+
		"h\7_\2\2h\4\3\2\2\2ij\7*\2\2j\6\3\2\2\2kl\7.\2\2l\b\3\2\2\2mn\7+\2\2n"+
		"\n\3\2\2\2op\7\60\2\2p\f\3\2\2\2qr\7/\2\2rs\7@\2\2s\16\3\2\2\2tu\7)\2"+
		"\2u\20\3\2\2\2vw\7$\2\2w\22\3\2\2\2xy\7k\2\2yz\7p\2\2z{\7v\2\2{\24\3\2"+
		"\2\2|}\7e\2\2}~\7j\2\2~\177\7c\2\2\177\u0080\7t\2\2\u0080\26\3\2\2\2\u0081"+
		"\u0082\7g\2\2\u0082\u0083\7p\2\2\u0083\u0084\7w\2\2\u0084\u0085\7o\2\2"+
		"\u0085\30\3\2\2\2\u0086\u0087\7}\2\2\u0087\32\3\2\2\2\u0088\u0089\7\177"+
		"\2\2\u0089\34\3\2\2\2\u008a\u008b\7=\2\2\u008b\36\3\2\2\2\u008c\u008d"+
		"\7t\2\2\u008d\u008e\7g\2\2\u008e\u008f\7v\2\2\u008f\u0090\7w\2\2\u0090"+
		"\u0091\7t\2\2\u0091\u0092\7p\2\2\u0092 \3\2\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7h\2\2\u0095\"\3\2\2\2\u0096\u0097\7g\2\2\u0097\u0098\7n\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a$\3\2\2\2\u009b\u009c\7y\2\2\u009c"+
		"\u009d\7j\2\2\u009d\u009e\7k\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7g\2\2"+
		"\u00a0&\3\2\2\2\u00a1\u00a3\t\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\b\24\2\2\u00a7(\3\2\2\2\u00a8\u00aa\7\17\2\2\u00a9\u00ab\7\f\2"+
		"\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ae"+
		"\7\f\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\b\25\2\2\u00b0*\3\2\2\2\u00b1\u00b5\t\3\2\2\u00b2\u00b4\t\4\2\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6,\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\t\5\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc.\3\2\2\2\u00bd\u00be\7?\2\2\u00be\u00bf\7?\2\2\u00bf\60\3\2"+
		"\2\2\u00c0\u00c1\7?\2\2\u00c1\62\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3\64\3"+
		"\2\2\2\u00c4\u00c5\7\61\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7"+
		"8\3\2\2\2\u00c8\u00c9\7/\2\2\u00c9:\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb\u00cc"+
		"\7-\2\2\u00cc<\3\2\2\2\u00cd\u00ce\7/\2\2\u00ce\u00cf\7/\2\2\u00cf>\3"+
		"\2\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d2\7?\2\2\u00d2@\3\2\2\2\u00d3\u00d4"+
		"\7>\2\2\u00d4\u00d5\7?\2\2\u00d5B\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7\u00d8"+
		"\7>\2\2\u00d8D\3\2\2\2\u00d9\u00da\7>\2\2\u00daF\3\2\2\2\u00db\u00dc\7"+
		"@\2\2\u00dc\u00dd\7?\2\2\u00ddH\3\2\2\2\u00de\u00df\7@\2\2\u00df\u00e0"+
		"\7@\2\2\u00e0J\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2L\3\2\2\2\u00e3\u00e4\7"+
		"~\2\2\u00e4\u00e5\7~\2\2\u00e5N\3\2\2\2\u00e6\u00e7\7~\2\2\u00e7P\3\2"+
		"\2\2\u00e8\u00e9\7(\2\2\u00e9\u00ea\7(\2\2\u00eaR\3\2\2\2\u00eb\u00ec"+
		"\7(\2\2\u00ecT\3\2\2\2\u00ed\u00ee\7`\2\2\u00eeV\3\2\2\2\u00ef\u00f0\7"+
		"\'\2\2\u00f0X\3\2\2\2\u00f1\u00f2\7]\2\2\u00f2Z\3\2\2\2\u00f3\u00f4\7"+
		"A\2\2\u00f4\\\3\2\2\2\u00f5\u00f6\7\u0080\2\2\u00f6^\3\2\2\2\u00f7\u00f8"+
		"\7#\2\2\u00f8`\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\7,\2\2\u00fb\u00ff"+
		"\3\2\2\2\u00fc\u00fe\13\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2"+
		"\u00ff\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0103\7,\2\2\u0103\u0104\7\61\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\b\61\2\2\u0106b\3\2\2\2\u0107\u0108\7\61\2\2\u0108\u0109\7\61\2"+
		"\2\u0109\u010d\3\2\2\2\u010a\u010c\n\6\2\2\u010b\u010a\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0112\7\17\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3"+
		"\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\f\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\b\62\2\2\u0116d\3\2\2\2\u0117\u0119\13\2\2\2\u0118\u0117\3\2\2"+
		"\2\u0119\u011c\3\2\2\2\u011a\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011bf"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\f\2\u00a4\u00aa\u00ad\u00b5\u00bb\u00ff\u010d"+
		"\u0111\u011a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}