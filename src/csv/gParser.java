package csv;// Generated from C:/Users/carlo/OneDrive - Universidad de Alcala/3anyo/1cuatri/Compiladores/LABORATORIO/Pl2Compiladores/PL2Compiladores\g.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SEPARADOR=3, TEXTO=4, STRING=5;
	public static final int
		RULE_csvFile = 0, RULE_hdr = 1, RULE_row = 2, RULE_field = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"csvFile", "hdr", "row", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\r'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SEPARADOR", "TEXTO", "STRING"
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

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CsvFileContext extends ParserRuleContext {
		public HdrContext hdr() {
			return getRuleContext(HdrContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public CsvFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csvFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCsvFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCsvFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCsvFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsvFileContext csvFile() throws RecognitionException {
		CsvFileContext _localctx = new CsvFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_csvFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			hdr();
			setState(10); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(9);
				row();
				}
				}
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXTO || _la==STRING );
			setState(14);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HdrContext extends ParserRuleContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public HdrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterHdr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitHdr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitHdr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HdrContext hdr() throws RecognitionException {
		HdrContext _localctx = new HdrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hdr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			row();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> SEPARADOR() { return getTokens(gParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(gParser.SEPARADOR, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			field();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR) {
				{
				{
				setState(19);
				match(SEPARADOR);
				setState(20);
				field();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(26);
				match(T__0);
				}
			}

			setState(29);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(gParser.TEXTO, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !(_la==TEXTO || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0005\"\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u000b\b\u0000\u000b\u0000\f\u0000\f\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0016"+
		"\b\u0002\n\u0002\f\u0002\u0019\t\u0002\u0001\u0002\u0003\u0002\u001c\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0000"+
		"\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000\u0004\u0005"+
		" \u0000\b\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000"+
		"\u0004\u0012\u0001\u0000\u0000\u0000\u0006\u001f\u0001\u0000\u0000\u0000"+
		"\b\n\u0003\u0002\u0001\u0000\t\u000b\u0003\u0004\u0002\u0000\n\t\u0001"+
		"\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\n\u0001\u0000\u0000"+
		"\u0000\f\r\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0005\u0000\u0000\u0001\u000f\u0001\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0003\u0004\u0002\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0012"+
		"\u0017\u0003\u0006\u0003\u0000\u0013\u0014\u0005\u0003\u0000\u0000\u0014"+
		"\u0016\u0003\u0006\u0003\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016"+
		"\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u001a\u001c\u0005\u0001\u0000\u0000\u001b"+
		"\u001a\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e"+
		"\u0005\u0001\u0000\u0000\u0000\u001f \u0007\u0000\u0000\u0000 \u0007\u0001"+
		"\u0000\u0000\u0000\u0003\f\u0017\u001b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}