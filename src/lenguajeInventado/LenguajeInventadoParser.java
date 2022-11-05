// Generated from /Users/david/IdeaProjects/prueba2/src/lenguajeInventado/LenguajeInventado.g4 by ANTLR 4.10.1
package lenguajeInventado;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeInventadoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, FLOAT=12, NUMERO=13, VARIABLE=14, FINLINEA=15, STRING=16, 
		COMENTARIOABRIR=17, COMENTARIOCERRAR=18, COMENTARIOLINEA=19, COMENTARIOALMOHADILLA=20, 
		SEPARADOR=21, OPERACION=22, INTRO=23, NEWLINE=24, OPERADORESCOND=25, FINCONDICION=26, 
		IF=27, ELSE=28, FINCOND=29, VALORES=30, ESPACIO=31, TEXTO=32;
	public static final int
		RULE_prog = 0, RULE_fila = 1, RULE_campo = 2, RULE_asignacion = 3, RULE_expr = 4, 
		RULE_comentario = 5, RULE_textos = 6, RULE_exprcond = 7, RULE_condicion = 8, 
		RULE_mostrar = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fila", "campo", "asignacion", "expr", "comentario", "textos", 
			"exprcond", "condicion", "mostrar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'asignar'", "'='", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'si ->'", 
			"'no ->'", "'mostrar'", null, null, null, "';P'", null, "'/*'", "'*/'", 
			"'//'", "'#'", "','", null, "'\\r\\n'", null, null, "'???'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"FLOAT", "NUMERO", "VARIABLE", "FINLINEA", "STRING", "COMENTARIOABRIR", 
			"COMENTARIOCERRAR", "COMENTARIOLINEA", "COMENTARIOALMOHADILLA", "SEPARADOR", 
			"OPERACION", "INTRO", "NEWLINE", "OPERADORESCOND", "FINCONDICION", "IF", 
			"ELSE", "FINCOND", "VALORES", "ESPACIO", "TEXTO"
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
	public String getGrammarFileName() { return "LenguajeInventado.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeInventadoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LenguajeInventadoParser.EOF, 0); }
		public List<FilaContext> fila() {
			return getRuleContexts(FilaContext.class);
		}
		public FilaContext fila(int i) {
			return getRuleContext(FilaContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				fila();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << VARIABLE) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << COMENTARIOALMOHADILLA))) != 0) );
			setState(25);
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

	public static class FilaContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LenguajeInventadoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LenguajeInventadoParser.NEWLINE, i);
		}
		public FilaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fila; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterFila(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitFila(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitFila(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilaContext fila() throws RecognitionException {
		FilaContext _localctx = new FilaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fila);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			campo();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(28);
				match(NEWLINE);
				setState(29);
				campo();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CampoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public ExprcondContext exprcond() {
			return getRuleContext(ExprcondContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitCampo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitCampo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_campo);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				asignacion();
				}
				break;
			case COMENTARIOABRIR:
			case COMENTARIOLINEA:
			case COMENTARIOALMOHADILLA:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				comentario();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				exprcond();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				mostrar();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FINLINEA() { return getToken(LenguajeInventadoParser.FINLINEA, 0); }
		public TerminalNode NEWLINE() { return getToken(LenguajeInventadoParser.NEWLINE, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			match(VARIABLE);
			setState(43);
			match(T__1);
			setState(44);
			expr(0);
			setState(45);
			match(FINLINEA);
			setState(46);
			match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPERACION() { return getToken(LenguajeInventadoParser.OPERACION, 0); }
		public List<TerminalNode> SEPARADOR() { return getTokens(LenguajeInventadoParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(LenguajeInventadoParser.SEPARADOR, i);
		}
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(49);
				match(NUMERO);
				}
				break;
			case T__6:
				{
				setState(50);
				match(T__6);
				setState(51);
				expr(0);
				setState(52);
				match(T__7);
				}
				break;
			case OPERACION:
				{
				setState(54);
				match(OPERACION);
				setState(55);
				match(T__6);
				{
				setState(56);
				expr(0);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARADOR) {
					{
					{
					setState(57);
					match(SEPARADOR);
					setState(58);
					expr(0);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(64);
				match(T__7);
				}
				break;
			case VARIABLE:
				{
				setState(66);
				match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(70);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(71);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(72);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(73);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(74);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(75);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(76);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(77);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIOABRIR() { return getToken(LenguajeInventadoParser.COMENTARIOABRIR, 0); }
		public TerminalNode COMENTARIOCERRAR() { return getToken(LenguajeInventadoParser.COMENTARIOCERRAR, 0); }
		public List<TextosContext> textos() {
			return getRuleContexts(TextosContext.class);
		}
		public TextosContext textos(int i) {
			return getRuleContext(TextosContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LenguajeInventadoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LenguajeInventadoParser.NEWLINE, i);
		}
		public TerminalNode COMENTARIOLINEA() { return getToken(LenguajeInventadoParser.COMENTARIOLINEA, 0); }
		public TerminalNode COMENTARIOALMOHADILLA() { return getToken(LenguajeInventadoParser.COMENTARIOALMOHADILLA, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comentario);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(COMENTARIOABRIR);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << NEWLINE) | (1L << TEXTO))) != 0)) {
					{
					setState(86);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__5:
					case TEXTO:
						{
						setState(84);
						textos();
						}
						break;
					case NEWLINE:
						{
						setState(85);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(COMENTARIOLINEA);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5 || _la==TEXTO) {
					{
					{
					setState(93);
					textos();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(NEWLINE);
				}
				break;
			case COMENTARIOALMOHADILLA:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(COMENTARIOALMOHADILLA);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5 || _la==TEXTO) {
					{
					{
					setState(101);
					textos();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TextosContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO() { return getTokens(LenguajeInventadoParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(LenguajeInventadoParser.TEXTO, i);
		}
		public TextosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterTextos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitTextos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitTextos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_textos);
		try {
			int _alt;
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(110);
						match(TEXTO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(113); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprcondContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LenguajeInventadoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LenguajeInventadoParser.NEWLINE, i);
		}
		public TerminalNode FINCOND() { return getToken(LenguajeInventadoParser.FINCOND, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(LenguajeInventadoParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(LenguajeInventadoParser.VARIABLE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> FINLINEA() { return getTokens(LenguajeInventadoParser.FINLINEA); }
		public TerminalNode FINLINEA(int i) {
			return getToken(LenguajeInventadoParser.FINLINEA, i);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ExprcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterExprcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitExprcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitExprcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprcondContext exprcond() throws RecognitionException {
		ExprcondContext _localctx = new ExprcondContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			condicion();
			setState(119);
			match(NEWLINE);
			setState(120);
			match(T__8);
			setState(121);
			match(NEWLINE);
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				match(VARIABLE);
				setState(123);
				match(T__1);
				setState(124);
				expr(0);
				setState(125);
				match(FINLINEA);
				setState(126);
				match(NEWLINE);
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(132);
				match(T__9);
				setState(133);
				match(NEWLINE);
				{
				setState(134);
				asignacion();
				setState(135);
				match(FINLINEA);
				setState(136);
				match(NEWLINE);
				}
				}
			}

			setState(140);
			match(FINCOND);
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

	public static class CondicionContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(LenguajeInventadoParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(LenguajeInventadoParser.VARIABLE, i);
		}
		public TerminalNode OPERADORESCOND() { return getToken(LenguajeInventadoParser.OPERADORESCOND, 0); }
		public TerminalNode FINCONDICION() { return getToken(LenguajeInventadoParser.FINCONDICION, 0); }
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public TerminalNode STRING() { return getToken(LenguajeInventadoParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(LenguajeInventadoParser.FLOAT, 0); }
		public TerminalNode FINLINEA() { return getToken(LenguajeInventadoParser.FINLINEA, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(VARIABLE);
			setState(143);
			match(OPERADORESCOND);
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(144);
				match(NUMERO);
				}
				break;
			case STRING:
				{
				setState(145);
				match(STRING);
				}
				break;
			case FLOAT:
				{
				setState(146);
				match(FLOAT);
				}
				break;
			case VARIABLE:
				{
				setState(147);
				match(VARIABLE);
				setState(148);
				match(FINLINEA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(151);
			match(FINCONDICION);
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

	public static class MostrarContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(LenguajeInventadoParser.NUMERO, 0); }
		public TerminalNode STRING() { return getToken(LenguajeInventadoParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(LenguajeInventadoParser.FLOAT, 0); }
		public TerminalNode VARIABLE() { return getToken(LenguajeInventadoParser.VARIABLE, 0); }
		public TerminalNode FINLINEA() { return getToken(LenguajeInventadoParser.FINLINEA, 0); }
		public TerminalNode NEWLINE() { return getToken(LenguajeInventadoParser.NEWLINE, 0); }
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).enterMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeInventadoListener ) ((LenguajeInventadoListener)listener).exitMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeInventadoVisitor ) return ((LenguajeInventadoVisitor<? extends T>)visitor).visitMostrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__10);
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(154);
				match(NUMERO);
				}
				break;
			case STRING:
				{
				setState(155);
				match(STRING);
				}
				break;
			case FLOAT:
				{
				setState(156);
				match(FLOAT);
				}
				break;
			case VARIABLE:
				{
				setState(157);
				match(VARIABLE);
				setState(158);
				match(FINLINEA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(161);
				match(NEWLINE);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u00a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b"+
		"\u0000\f\u0000\u0017\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002(\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"<\b\u0004\n\u0004\f\u0004?\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004D\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"O\b\u0004\n\u0004\f\u0004R\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005W\b\u0005\n\u0005\f\u0005Z\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005_\b\u0005\n\u0005\f\u0005b\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005g\b\u0005\n\u0005\f\u0005j\t\u0005"+
		"\u0001\u0005\u0003\u0005m\b\u0005\u0001\u0006\u0004\u0006p\b\u0006\u000b"+
		"\u0006\f\u0006q\u0001\u0006\u0003\u0006u\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u0081\b\u0007\u000b\u0007\f\u0007"+
		"\u0082\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u008b\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0096\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a0\b\t\u0001"+
		"\t\u0003\t\u00a3\b\t\u0001\t\u0000\u0001\b\n\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0000\u0003\u0001\u0000\u0003\u0004\u0001\u0000"+
		"\u0004\u0005\u0002\u0000\u0004\u0004\u0006\u0006\u00b7\u0000\u0015\u0001"+
		"\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000"+
		"\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000"+
		"\nl\u0001\u0000\u0000\u0000\ft\u0001\u0000\u0000\u0000\u000ev\u0001\u0000"+
		"\u0000\u0000\u0010\u008e\u0001\u0000\u0000\u0000\u0012\u0099\u0001\u0000"+
		"\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000"+
		"\u0000\u0000\u001b \u0003\u0004\u0002\u0000\u001c\u001d\u0005\u0018\u0000"+
		"\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001c\u0001\u0000\u0000"+
		"\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000#(\u0003\u0006\u0003\u0000$(\u0003\n\u0005\u0000%(\u0003\u000e"+
		"\u0007\u0000&(\u0003\u0012\t\u0000\'#\u0001\u0000\u0000\u0000\'$\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000"+
		"(\u0005\u0001\u0000\u0000\u0000)*\u0005\u0001\u0000\u0000*+\u0005\u000e"+
		"\u0000\u0000+,\u0005\u0002\u0000\u0000,-\u0003\b\u0004\u0000-.\u0005\u000f"+
		"\u0000\u0000./\u0005\u0018\u0000\u0000/\u0007\u0001\u0000\u0000\u0000"+
		"01\u0006\u0004\uffff\uffff\u00001D\u0005\r\u0000\u000023\u0005\u0007\u0000"+
		"\u000034\u0003\b\u0004\u000045\u0005\b\u0000\u00005D\u0001\u0000\u0000"+
		"\u000067\u0005\u0016\u0000\u000078\u0005\u0007\u0000\u00008=\u0003\b\u0004"+
		"\u00009:\u0005\u0015\u0000\u0000:<\u0003\b\u0004\u0000;9\u0001\u0000\u0000"+
		"\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005"+
		"\b\u0000\u0000AD\u0001\u0000\u0000\u0000BD\u0005\u000e\u0000\u0000C0\u0001"+
		"\u0000\u0000\u0000C2\u0001\u0000\u0000\u0000C6\u0001\u0000\u0000\u0000"+
		"CB\u0001\u0000\u0000\u0000DP\u0001\u0000\u0000\u0000EF\n\u0007\u0000\u0000"+
		"FG\u0007\u0000\u0000\u0000GO\u0003\b\u0004\bHI\n\u0006\u0000\u0000IJ\u0007"+
		"\u0001\u0000\u0000JO\u0003\b\u0004\u0007KL\n\u0005\u0000\u0000LM\u0007"+
		"\u0002\u0000\u0000MO\u0003\b\u0004\u0006NE\u0001\u0000\u0000\u0000NH\u0001"+
		"\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\t\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000SX\u0005\u0011\u0000\u0000TW\u0003\f\u0006"+
		"\u0000UW\u0005\u0018\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[m\u0005\u0012\u0000\u0000\\`\u0005\u0013\u0000\u0000]_\u0003\f\u0006"+
		"\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000cm\u0005\u0018\u0000\u0000dh\u0005\u0014\u0000\u0000"+
		"eg\u0003\f\u0006\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000km\u0005\u0018\u0000\u0000lS\u0001\u0000"+
		"\u0000\u0000l\\\u0001\u0000\u0000\u0000ld\u0001\u0000\u0000\u0000m\u000b"+
		"\u0001\u0000\u0000\u0000np\u0005 \u0000\u0000on\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000ru\u0001\u0000\u0000\u0000su\u0005\u0006\u0000\u0000to\u0001\u0000"+
		"\u0000\u0000ts\u0001\u0000\u0000\u0000u\r\u0001\u0000\u0000\u0000vw\u0003"+
		"\u0010\b\u0000wx\u0005\u0018\u0000\u0000xy\u0005\t\u0000\u0000y\u0080"+
		"\u0005\u0018\u0000\u0000z{\u0005\u000e\u0000\u0000{|\u0005\u0002\u0000"+
		"\u0000|}\u0003\b\u0004\u0000}~\u0005\u000f\u0000\u0000~\u007f\u0005\u0018"+
		"\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080z\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u008a\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005\n\u0000\u0000\u0085\u0086\u0005\u0018\u0000\u0000"+
		"\u0086\u0087\u0003\u0006\u0003\u0000\u0087\u0088\u0005\u000f\u0000\u0000"+
		"\u0088\u0089\u0005\u0018\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000"+
		"\u008a\u0084\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u001d\u0000\u0000"+
		"\u008d\u000f\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u000e\u0000\u0000"+
		"\u008f\u0095\u0005\u0019\u0000\u0000\u0090\u0096\u0005\r\u0000\u0000\u0091"+
		"\u0096\u0005\u0010\u0000\u0000\u0092\u0096\u0005\f\u0000\u0000\u0093\u0094"+
		"\u0005\u000e\u0000\u0000\u0094\u0096\u0005\u000f\u0000\u0000\u0095\u0090"+
		"\u0001\u0000\u0000\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0095\u0092"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u001a\u0000\u0000\u0098\u0011"+
		"\u0001\u0000\u0000\u0000\u0099\u009f\u0005\u000b\u0000\u0000\u009a\u00a0"+
		"\u0005\r\u0000\u0000\u009b\u00a0\u0005\u0010\u0000\u0000\u009c\u00a0\u0005"+
		"\f\u0000\u0000\u009d\u009e\u0005\u000e\u0000\u0000\u009e\u00a0\u0005\u000f"+
		"\u0000\u0000\u009f\u009a\u0001\u0000\u0000\u0000\u009f\u009b\u0001\u0000"+
		"\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u00a3\u0005\u0018"+
		"\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u0013\u0001\u0000\u0000\u0000\u0013\u0017 \'=CNPVX"+
		"`hlqt\u0082\u008a\u0095\u009f\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}