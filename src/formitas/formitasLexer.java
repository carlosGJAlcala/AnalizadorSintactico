// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl2Compiladoresfinal/AnalizadorSintactico/src/formitas\formitas.g4 by ANTLR 4.10.1
package formitas;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class formitasLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CONTRASTE=2, TAMANIO=3, ESPACIO=4, NEWLINE=5, FIGURA=6, APERTURA=7, 
		CERRADURA=8, IMGDIM=9, SHPDIM=10, SEPARADOR=11, NUMERO=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "CONTRASTE", "TAMANIO", "ESPACIO", "NEWLINE", "FIGURA", "APERTURA", 
			"CERRADURA", "IMGDIM", "SHPDIM", "SEPARADOR", "NUMERO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", null, null, null, null, null, "'>>>'", "'<<<'", null, null, 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CONTRASTE", "TAMANIO", "ESPACIO", "NEWLINE", "FIGURA", "APERTURA", 
			"CERRADURA", "IMGDIM", "SHPDIM", "SEPARADOR", "NUMERO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public formitasLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "formitas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\f\u00d9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00029\b\u0002\u0001\u0002\u0003\u0002"+
		"<\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002E\b\u0002\u0001\u0003\u0004\u0003"+
		"H\b\u0003\u000b\u0003\f\u0003I\u0001\u0003\u0001\u0003\u0001\u0004\u0003"+
		"\u0004O\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004S\b\u0004\u000b\u0004"+
		"\f\u0004T\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00b5\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000b\u00d6\b\u000b\u000b\u000b\f\u000b\u00d7\u0000\u0000"+
		"\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u0003"+
		"\u0001\u000001\u0001\u000009\u0002\u0000\t\t  \u00ea\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000"+
		"\u0000\u0003\u001b\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000"+
		"\u0007G\u0001\u0000\u0000\u0000\tR\u0001\u0000\u0000\u0000\u000b\u00b4"+
		"\u0001\u0000\u0000\u0000\r\u00b6\u0001\u0000\u0000\u0000\u000f\u00ba\u0001"+
		"\u0000\u0000\u0000\u0011\u00be\u0001\u0000\u0000\u0000\u0013\u00c8\u0001"+
		"\u0000\u0000\u0000\u0015\u00d2\u0001\u0000\u0000\u0000\u0017\u00d5\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005|\u0000\u0000\u001a\u0002\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\u0005(\u0000\u0000\u001c\u001d\u0005c\u0000\u0000"+
		"\u001d\u001e\u0005o\u0000\u0000\u001e\u001f\u0005n\u0000\u0000\u001f "+
		"\u0005t\u0000\u0000 !\u0005r\u0000\u0000!\"\u0005a\u0000\u0000\"#\u0005"+
		"s\u0000\u0000#$\u0005t\u0000\u0000$%\u0005e\u0000\u0000%&\u0005:\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'(\u0007\u0000\u0000\u0000()\u0007\u0001"+
		"\u0000\u0000)*\u0007\u0001\u0000\u0000*+\u0005%\u0000\u0000+,\u0005)\u0000"+
		"\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000./\u0005t\u0000"+
		"\u0000/0\u0005a\u0000\u000001\u0005m\u0000\u000012\u0005a\u0000\u0000"+
		"23\u0005n\u0000\u000034\u0005i\u0000\u000045\u0005o\u0000\u000056\u0005"+
		":\u0000\u000068\u0001\u0000\u0000\u000079\u0007\u0001\u0000\u000087\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000"+
		":<\u0007\u0001\u0000\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=D\u0007\u0001\u0000\u0000>?\u0005p\u0000"+
		"\u0000?@\u0005x\u0000\u0000@E\u0005)\u0000\u0000AB\u0005e\u0000\u0000"+
		"BC\u0005m\u0000\u0000CE\u0005)\u0000\u0000D>\u0001\u0000\u0000\u0000D"+
		"A\u0001\u0000\u0000\u0000E\u0006\u0001\u0000\u0000\u0000FH\u0007\u0002"+
		"\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KL\u0006\u0003\u0000\u0000L\b\u0001\u0000\u0000\u0000MO\u0005\r\u0000"+
		"\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PS\u0005\n\u0000\u0000QS\u0005\r\u0000\u0000RN\u0001\u0000"+
		"\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VW\u0006\u0004\u0000\u0000W\n\u0001\u0000\u0000\u0000XY\u0005c\u0000\u0000"+
		"YZ\u0005i\u0000\u0000Z[\u0005r\u0000\u0000[\\\u0005c\u0000\u0000\\]\u0005"+
		"u\u0000\u0000]^\u0005l\u0000\u0000^\u00b5\u0005o\u0000\u0000_`\u0005t"+
		"\u0000\u0000`a\u0005r\u0000\u0000ab\u0005i\u0000\u0000bc\u0005a\u0000"+
		"\u0000cd\u0005n\u0000\u0000de\u0005g\u0000\u0000ef\u0005u\u0000\u0000"+
		"fg\u0005l\u0000\u0000g\u00b5\u0005o\u0000\u0000hi\u0005t\u0000\u0000i"+
		"j\u0005r\u0000\u0000jk\u0005a\u0000\u0000kl\u0005p\u0000\u0000lm\u0005"+
		"e\u0000\u0000mn\u0005c\u0000\u0000no\u0005i\u0000\u0000o\u00b5\u0005o"+
		"\u0000\u0000pq\u0005t\u0000\u0000qr\u0005r\u0000\u0000rs\u0005a\u0000"+
		"\u0000st\u0005p\u0000\u0000tu\u0005e\u0000\u0000uv\u0005z\u0000\u0000"+
		"vw\u0005o\u0000\u0000wx\u0005i\u0000\u0000xy\u0005d\u0000\u0000y\u00b5"+
		"\u0005e\u0000\u0000z{\u0005c\u0000\u0000{|\u0005u\u0000\u0000|}\u0005"+
		"a\u0000\u0000}~\u0005d\u0000\u0000~\u007f\u0005r\u0000\u0000\u007f\u0080"+
		"\u0005a\u0000\u0000\u0080\u0081\u0005d\u0000\u0000\u0081\u00b5\u0005o"+
		"\u0000\u0000\u0082\u0083\u0005P\u0000\u0000\u0083\u0084\u0005e\u0000\u0000"+
		"\u0084\u0085\u0005n\u0000\u0000\u0085\u0086\u0005t\u0000\u0000\u0086\u0087"+
		"\u0005a\u0000\u0000\u0087\u0088\u0005g\u0000\u0000\u0088\u0089\u0005o"+
		"\u0000\u0000\u0089\u008a\u0005n\u0000\u0000\u008a\u00b5\u0005o\u0000\u0000"+
		"\u008b\u008c\u0005H\u0000\u0000\u008c\u008d\u0005e\u0000\u0000\u008d\u008e"+
		"\u0005x\u0000\u0000\u008e\u008f\u0005a\u0000\u0000\u008f\u0090\u0005g"+
		"\u0000\u0000\u0090\u0091\u0005o\u0000\u0000\u0091\u0092\u0005n\u0000\u0000"+
		"\u0092\u00b5\u0005o\u0000\u0000\u0093\u0094\u0005h\u0000\u0000\u0094\u0095"+
		"\u0005e\u0000\u0000\u0095\u0096\u0005p\u0000\u0000\u0096\u0097\u0005t"+
		"\u0000\u0000\u0097\u0098\u0005a\u0000\u0000\u0098\u0099\u0005g\u0000\u0000"+
		"\u0099\u009a\u0005o\u0000\u0000\u009a\u009b\u0005n\u0000\u0000\u009b\u00b5"+
		"\u0005o\u0000\u0000\u009c\u009d\u0005o\u0000\u0000\u009d\u009e\u0005c"+
		"\u0000\u0000\u009e\u009f\u0005t\u0000\u0000\u009f\u00a0\u0005o\u0000\u0000"+
		"\u00a0\u00a1\u0005g\u0000\u0000\u00a1\u00a2\u0005o\u0000\u0000\u00a2\u00a3"+
		"\u0005n\u0000\u0000\u00a3\u00b5\u0005o\u0000\u0000\u00a4\u00a5\u0005e"+
		"\u0000\u0000\u00a5\u00a6\u0005n\u0000\u0000\u00a6\u00a7\u0005e\u0000\u0000"+
		"\u00a7\u00a8\u0005a\u0000\u0000\u00a8\u00a9\u0005g\u0000\u0000\u00a9\u00aa"+
		"\u0005o\u0000\u0000\u00aa\u00ab\u0005n\u0000\u0000\u00ab\u00b5\u0005o"+
		"\u0000\u0000\u00ac\u00ad\u0005d\u0000\u0000\u00ad\u00ae\u0005e\u0000\u0000"+
		"\u00ae\u00af\u0005c\u0000\u0000\u00af\u00b0\u0005a\u0000\u0000\u00b0\u00b1"+
		"\u0005g\u0000\u0000\u00b1\u00b2\u0005o\u0000\u0000\u00b2\u00b3\u0005n"+
		"\u0000\u0000\u00b3\u00b5\u0005o\u0000\u0000\u00b4X\u0001\u0000\u0000\u0000"+
		"\u00b4_\u0001\u0000\u0000\u0000\u00b4h\u0001\u0000\u0000\u0000\u00b4p"+
		"\u0001\u0000\u0000\u0000\u00b4z\u0001\u0000\u0000\u0000\u00b4\u0082\u0001"+
		"\u0000\u0000\u0000\u00b4\u008b\u0001\u0000\u0000\u0000\u00b4\u0093\u0001"+
		"\u0000\u0000\u0000\u00b4\u009c\u0001\u0000\u0000\u0000\u00b4\u00a4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00ac\u0001\u0000\u0000\u0000\u00b5\f\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005>\u0000\u0000\u00b7\u00b8\u0005>\u0000\u0000"+
		"\u00b8\u00b9\u0005>\u0000\u0000\u00b9\u000e\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0005<\u0000\u0000\u00bb\u00bc\u0005<\u0000\u0000\u00bc\u00bd\u0005"+
		"<\u0000\u0000\u00bd\u0010\u0001\u0000\u0000\u0000\u00be\u00bf\u0005i\u0000"+
		"\u0000\u00bf\u00c0\u0005m\u0000\u0000\u00c0\u00c1\u0005g\u0000\u0000\u00c1"+
		"\u00c2\u0005d\u0000\u0000\u00c2\u00c3\u0005i\u0000\u0000\u00c3\u00c4\u0005"+
		"m\u0000\u0000\u00c4\u00c5\u0005:\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0003\u0017\u000b\u0000\u00c7\u0012\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0005s\u0000\u0000\u00c9\u00ca\u0005h\u0000\u0000\u00ca"+
		"\u00cb\u0005p\u0000\u0000\u00cb\u00cc\u0005d\u0000\u0000\u00cc\u00cd\u0005"+
		"i\u0000\u0000\u00cd\u00ce\u0005m\u0000\u0000\u00ce\u00cf\u0005:\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003\u0017\u000b"+
		"\u0000\u00d1\u0014\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005,\u0000\u0000"+
		"\u00d3\u0016\u0001\u0000\u0000\u0000\u00d4\u00d6\u0007\u0001\u0000\u0000"+
		"\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u0018\u0001\u0000\u0000\u0000\n\u00008;DINRT\u00b4\u00d7\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}