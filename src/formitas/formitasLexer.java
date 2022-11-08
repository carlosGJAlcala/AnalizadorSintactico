// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl2Compiladores/AnalizadorSintactico/src/formitas\formitas.g4 by ANTLR 4.10.1
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
		T__0=1, FIGURA=2, APERTURA=3, CERRADURA=4, IMGDIM=5, SHPDIM=6, SEPARADOR=7, 
		NUMERO=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "FIGURA", "APERTURA", "CERRADURA", "IMGDIM", "SHPDIM", "SEPARADOR", 
			"NUMERO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", null, "'>>>'", "'<<<'", null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "FIGURA", "APERTURA", "CERRADURA", "IMGDIM", "SHPDIM", "SEPARADOR", 
			"NUMERO"
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
		"\u0004\u0000\b\u0094\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"p\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0004\u0007\u0091\b\u0007\u000b\u0007\f\u0007"+
		"\u0092\u0000\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0001\u0000\u0001\u0001\u000009\u009e"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0011"+
		"\u0001\u0000\u0000\u0000\u0003o\u0001\u0000\u0000\u0000\u0005q\u0001\u0000"+
		"\u0000\u0000\u0007u\u0001\u0000\u0000\u0000\ty\u0001\u0000\u0000\u0000"+
		"\u000b\u0083\u0001\u0000\u0000\u0000\r\u008d\u0001\u0000\u0000\u0000\u000f"+
		"\u0090\u0001\u0000\u0000\u0000\u0011\u0012\u0005|\u0000\u0000\u0012\u0002"+
		"\u0001\u0000\u0000\u0000\u0013\u0014\u0005c\u0000\u0000\u0014\u0015\u0005"+
		"i\u0000\u0000\u0015\u0016\u0005r\u0000\u0000\u0016\u0017\u0005c\u0000"+
		"\u0000\u0017\u0018\u0005u\u0000\u0000\u0018\u0019\u0005l\u0000\u0000\u0019"+
		"p\u0005o\u0000\u0000\u001a\u001b\u0005t\u0000\u0000\u001b\u001c\u0005"+
		"r\u0000\u0000\u001c\u001d\u0005i\u0000\u0000\u001d\u001e\u0005a\u0000"+
		"\u0000\u001e\u001f\u0005n\u0000\u0000\u001f \u0005g\u0000\u0000 !\u0005"+
		"u\u0000\u0000!\"\u0005l\u0000\u0000\"p\u0005o\u0000\u0000#$\u0005t\u0000"+
		"\u0000$%\u0005r\u0000\u0000%&\u0005a\u0000\u0000&\'\u0005p\u0000\u0000"+
		"\'(\u0005e\u0000\u0000()\u0005c\u0000\u0000)*\u0005i\u0000\u0000*p\u0005"+
		"o\u0000\u0000+,\u0005t\u0000\u0000,-\u0005r\u0000\u0000-.\u0005a\u0000"+
		"\u0000./\u0005p\u0000\u0000/0\u0005e\u0000\u000001\u0005z\u0000\u0000"+
		"12\u0005o\u0000\u000023\u0005i\u0000\u000034\u0005d\u0000\u00004p\u0005"+
		"e\u0000\u000056\u0005c\u0000\u000067\u0005u\u0000\u000078\u0005a\u0000"+
		"\u000089\u0005d\u0000\u00009:\u0005r\u0000\u0000:;\u0005a\u0000\u0000"+
		";<\u0005d\u0000\u0000<p\u0005o\u0000\u0000=>\u0005P\u0000\u0000>?\u0005"+
		"e\u0000\u0000?@\u0005n\u0000\u0000@A\u0005t\u0000\u0000AB\u0005a\u0000"+
		"\u0000BC\u0005g\u0000\u0000CD\u0005o\u0000\u0000DE\u0005n\u0000\u0000"+
		"Ep\u0005o\u0000\u0000FG\u0005H\u0000\u0000GH\u0005e\u0000\u0000HI\u0005"+
		"x\u0000\u0000IJ\u0005a\u0000\u0000JK\u0005g\u0000\u0000KL\u0005o\u0000"+
		"\u0000LM\u0005n\u0000\u0000Mp\u0005o\u0000\u0000NO\u0005h\u0000\u0000"+
		"OP\u0005e\u0000\u0000PQ\u0005p\u0000\u0000QR\u0005t\u0000\u0000RS\u0005"+
		"a\u0000\u0000ST\u0005g\u0000\u0000TU\u0005o\u0000\u0000UV\u0005n\u0000"+
		"\u0000Vp\u0005o\u0000\u0000WX\u0005o\u0000\u0000XY\u0005c\u0000\u0000"+
		"YZ\u0005t\u0000\u0000Z[\u0005o\u0000\u0000[\\\u0005g\u0000\u0000\\]\u0005"+
		"o\u0000\u0000]^\u0005n\u0000\u0000^p\u0005o\u0000\u0000_`\u0005e\u0000"+
		"\u0000`a\u0005n\u0000\u0000ab\u0005e\u0000\u0000bc\u0005a\u0000\u0000"+
		"cd\u0005g\u0000\u0000de\u0005o\u0000\u0000ef\u0005n\u0000\u0000fp\u0005"+
		"o\u0000\u0000gh\u0005d\u0000\u0000hi\u0005e\u0000\u0000ij\u0005c\u0000"+
		"\u0000jk\u0005a\u0000\u0000kl\u0005g\u0000\u0000lm\u0005o\u0000\u0000"+
		"mn\u0005n\u0000\u0000np\u0005o\u0000\u0000o\u0013\u0001\u0000\u0000\u0000"+
		"o\u001a\u0001\u0000\u0000\u0000o#\u0001\u0000\u0000\u0000o+\u0001\u0000"+
		"\u0000\u0000o5\u0001\u0000\u0000\u0000o=\u0001\u0000\u0000\u0000oF\u0001"+
		"\u0000\u0000\u0000oN\u0001\u0000\u0000\u0000oW\u0001\u0000\u0000\u0000"+
		"o_\u0001\u0000\u0000\u0000og\u0001\u0000\u0000\u0000p\u0004\u0001\u0000"+
		"\u0000\u0000qr\u0005>\u0000\u0000rs\u0005>\u0000\u0000st\u0005>\u0000"+
		"\u0000t\u0006\u0001\u0000\u0000\u0000uv\u0005<\u0000\u0000vw\u0005<\u0000"+
		"\u0000wx\u0005<\u0000\u0000x\b\u0001\u0000\u0000\u0000yz\u0005i\u0000"+
		"\u0000z{\u0005m\u0000\u0000{|\u0005g\u0000\u0000|}\u0005d\u0000\u0000"+
		"}~\u0005i\u0000\u0000~\u007f\u0005m\u0000\u0000\u007f\u0080\u0005:\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0003\u000f\u0007"+
		"\u0000\u0082\n\u0001\u0000\u0000\u0000\u0083\u0084\u0005s\u0000\u0000"+
		"\u0084\u0085\u0005h\u0000\u0000\u0085\u0086\u0005p\u0000\u0000\u0086\u0087"+
		"\u0005d\u0000\u0000\u0087\u0088\u0005i\u0000\u0000\u0088\u0089\u0005m"+
		"\u0000\u0000\u0089\u008a\u0005:\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0003\u000f\u0007\u0000\u008c\f\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005,\u0000\u0000\u008e\u000e\u0001\u0000\u0000\u0000\u008f"+
		"\u0091\u0007\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0010\u0001\u0000\u0000\u0000\u0003"+
		"\u0000o\u0092\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}