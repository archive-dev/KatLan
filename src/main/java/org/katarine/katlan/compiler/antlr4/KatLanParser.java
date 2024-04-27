// Generated from C:/Users/Egor/Documents/Java/gdx/KatLan/compiler/src/main/resources/KatLan.g4 by ANTLR 4.13.1
package org.katarine.katlan.compiler.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class KatLanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, AS_KEYWORD=29, FOR_KEYWORD=30, 
		IF_KEYWORD=31, ELSE_KEYWORD=32, SWITCH_KEYWORD=33, STR=34, BOOL=35, INT=36, 
		FLOAT=37, DOUBLE=38, LONG=39, SHORT=40, BYTE=41, OBJ=42, VOID=43, NULL=44, 
		DIV=45, MOD=46, PLUS=47, MINUS=48, MULTIPLY=49, DIVIDE=50, POWER=51, PUBLIC=52, 
		PRIVATE=53, PROTECTED=54, STATIC=55, FINAL=56, TRUE=57, FALSE=58, AND=59, 
		OR=60, NOT=61, XOR=62, BT=63, LT=64, EQ=65, NE=66, LE=67, BE=68, CLASS_KEYWORD=69, 
		ABSTRACT_KEYWORD=70, INTERFACE_KEYWORD=71, ENUM_KEYWORD=72, INT_VAL=73, 
		FLOAT_VAL=74, NAME0=75, STRING_VAL=76, ENDLINE=77, WS=78, COMMENT=79;
	public static final int
		RULE_class = 0, RULE_package = 1, RULE_importBlock = 2, RULE_importStatement = 3, 
		RULE_unnamedClassDef = 4, RULE_classDef = 5, RULE_interfaceDef = 6, RULE_classBlock = 7, 
		RULE_block = 8, RULE_lineBlock = 9, RULE_value = 10, RULE_bool = 11, RULE_varAssignment = 12, 
		RULE_varAccess = 13, RULE_arrayAccess = 14, RULE_arrayAccess0 = 15, RULE_methodDef = 16, 
		RULE_constructorDef = 17, RULE_parameters = 18, RULE_parameter = 19, RULE_var = 20, 
		RULE_constDef = 21, RULE_constDef0 = 22, RULE_constDef1 = 23, RULE_varDef = 24, 
		RULE_varDef0 = 25, RULE_varDef1 = 26, RULE_subVD1 = 27, RULE_annotationCall = 28, 
		RULE_statement = 29, RULE_returnStatement = 30, RULE_switchStatement = 31, 
		RULE_subSwitch0 = 32, RULE_tryCatchFinally = 33, RULE_ifStatement = 34, 
		RULE_ifStatement0 = 35, RULE_whileLoopStatement = 36, RULE_foriLoop = 37, 
		RULE_foriLoop0 = 38, RULE_access = 39, RULE_type = 40, RULE_anyType = 41, 
		RULE_linkType = 42, RULE_primitiveType = 43, RULE_nullType = 44, RULE_arguments = 45, 
		RULE_argument = 46, RULE_methodCall0 = 47, RULE_methodCall = 48, RULE_constructorCall = 49, 
		RULE_expression = 50, RULE_logicalOr = 51, RULE_logicalAnd = 52, RULE_logicalXor = 53, 
		RULE_logicalNot = 54, RULE_primaryExpresion = 55, RULE_arithCondExpression = 56, 
		RULE_arithmeticExpression = 57, RULE_addSubExpression = 58, RULE_modDivExpression = 59, 
		RULE_mulDivExpression = 60, RULE_powerExpression = 61, RULE_numberExpression = 62, 
		RULE_incrExpression = 63, RULE_name = 64, RULE_dot_name = 65, RULE_numeric_value = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"class", "package", "importBlock", "importStatement", "unnamedClassDef", 
			"classDef", "interfaceDef", "classBlock", "block", "lineBlock", "value", 
			"bool", "varAssignment", "varAccess", "arrayAccess", "arrayAccess0", 
			"methodDef", "constructorDef", "parameters", "parameter", "var", "constDef", 
			"constDef0", "constDef1", "varDef", "varDef0", "varDef1", "subVD1", "annotationCall", 
			"statement", "returnStatement", "switchStatement", "subSwitch0", "tryCatchFinally", 
			"ifStatement", "ifStatement0", "whileLoopStatement", "foriLoop", "foriLoop0", 
			"access", "type", "anyType", "linkType", "primitiveType", "nullType", 
			"arguments", "argument", "methodCall0", "methodCall", "constructorCall", 
			"expression", "logicalOr", "logicalAnd", "logicalXor", "logicalNot", 
			"primaryExpresion", "arithCondExpression", "arithmeticExpression", "addSubExpression", 
			"modDivExpression", "mulDivExpression", "powerExpression", "numberExpression", 
			"incrExpression", "name", "dot_name", "numeric_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'import'", "'extends'", "','", "':'", "'{'", "'}'", 
			"'='", "'.'", "'['", "']'", "'def'", "'('", "')'", "'new'", "'const'", 
			"'var'", "'$'", "'return'", "'default'", "'->'", "'try'", "'catch'", 
			"'finally'", "'while'", "'..'", "'@'", "'field'", "'as'", "'for'", "'if'", 
			"'else'", "'switch'", "'str'", "'bool'", "'int'", "'float'", "'double'", 
			"'long'", "'short'", "'byte'", "'obj'", "'void'", "'null'", "'div'", 
			"'%'", "'+'", "'-'", "'*'", "'/'", "'**'", null, null, null, "'static'", 
			null, "'true'", "'false'", null, null, null, null, "'>'", "'<'", "'=='", 
			"'!='", "'<='", "'>='", "'class'", "'abstract'", "'interface'", "'enum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "AS_KEYWORD", "FOR_KEYWORD", "IF_KEYWORD", 
			"ELSE_KEYWORD", "SWITCH_KEYWORD", "STR", "BOOL", "INT", "FLOAT", "DOUBLE", 
			"LONG", "SHORT", "BYTE", "OBJ", "VOID", "NULL", "DIV", "MOD", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "POWER", "PUBLIC", "PRIVATE", "PROTECTED", 
			"STATIC", "FINAL", "TRUE", "FALSE", "AND", "OR", "NOT", "XOR", "BT", 
			"LT", "EQ", "NE", "LE", "BE", "CLASS_KEYWORD", "ABSTRACT_KEYWORD", "INTERFACE_KEYWORD", 
			"ENUM_KEYWORD", "INT_VAL", "FLOAT_VAL", "NAME0", "STRING_VAL", "ENDLINE", 
			"WS", "COMMENT"
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
	public String getGrammarFileName() { return "KatLan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KatLanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public ImportBlockContext importBlock() {
			return getRuleContext(ImportBlockContext.class,0);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public InterfaceDefContext interfaceDef() {
			return getRuleContext(InterfaceDefContext.class,0);
		}
		public UnnamedClassDefContext unnamedClassDef() {
			return getRuleContext(UnnamedClassDefContext.class,0);
		}
		public PackageContext package_() {
			return getRuleContext(PackageContext.class,0);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(134);
				package_();
				}
			}

			setState(137);
			importBlock();
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(138);
				classDef();
				}
				break;
			case 2:
				{
				setState(139);
				interfaceDef();
				}
				break;
			case 3:
				{
				setState(140);
				unnamedClassDef();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PackageContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public PackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageContext package_() throws RecognitionException {
		PackageContext _localctx = new PackageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_package);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__0);
			setState(144);
			name();
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				match(ENDLINE);
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENDLINE );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportBlockContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public ImportBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterImportBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitImportBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitImportBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportBlockContext importBlock() throws RecognitionException {
		ImportBlockContext _localctx = new ImportBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(150);
				importStatement();
				}
				}
				setState(155);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode AS_KEYWORD() { return getToken(KatLanParser.AS_KEYWORD, 0); }
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__1);
			setState(157);
			name();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_KEYWORD) {
				{
				setState(158);
				match(AS_KEYWORD);
				setState(159);
				name();
				}
			}

			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				match(ENDLINE);
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENDLINE );
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnnamedClassDefContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public UnnamedClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamedClassDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterUnnamedClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitUnnamedClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitUnnamedClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnnamedClassDefContext unnamedClassDef() throws RecognitionException {
		UnnamedClassDefContext _localctx = new UnnamedClassDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unnamedClassDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(167);
				match(T__2);
				setState(168);
				name();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(169);
					match(T__3);
					setState(170);
					name();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					match(ENDLINE);
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ENDLINE );
				}
			}

			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(183);
				classBlock();
				}
				break;
			}
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(186);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode ENUM_KEYWORD() { return getToken(KatLanParser.ENUM_KEYWORD, 0); }
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public TerminalNode CLASS_KEYWORD() { return getToken(KatLanParser.CLASS_KEYWORD, 0); }
		public TerminalNode ABSTRACT_KEYWORD() { return getToken(KatLanParser.ABSTRACT_KEYWORD, 0); }
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(189);
				annotationCall();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			access();
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_KEYWORD:
			case ABSTRACT_KEYWORD:
				{
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABSTRACT_KEYWORD) {
					{
					setState(196);
					match(ABSTRACT_KEYWORD);
					}
				}

				setState(199);
				match(CLASS_KEYWORD);
				}
				}
				break;
			case ENUM_KEYWORD:
				{
				setState(200);
				match(ENUM_KEYWORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(203);
			name();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(204);
				match(T__4);
				setState(205);
				name();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(206);
					match(T__3);
					setState(207);
					name();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(215);
			match(T__5);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					match(ENDLINE);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & 288264461012172921L) != 0)) {
				{
				setState(222);
				classBlock();
				}
			}

			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(225);
				match(ENDLINE);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode INTERFACE_KEYWORD() { return getToken(KatLanParser.INTERFACE_KEYWORD, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public InterfaceDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterInterfaceDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitInterfaceDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitInterfaceDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDefContext interfaceDef() throws RecognitionException {
		InterfaceDefContext _localctx = new InterfaceDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfaceDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(233);
				annotationCall();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			access();
			setState(240);
			match(INTERFACE_KEYWORD);
			setState(241);
			name();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(242);
				match(T__4);
				setState(243);
				name();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(244);
					match(T__3);
					setState(245);
					name();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(253);
			match(T__5);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
					match(ENDLINE);
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & 288264461012172921L) != 0)) {
				{
				setState(260);
				classBlock();
				}
			}

			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(263);
				match(ENDLINE);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBlockContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<MethodDefContext> methodDef() {
			return getRuleContexts(MethodDefContext.class);
		}
		public MethodDefContext methodDef(int i) {
			return getRuleContext(MethodDefContext.class,i);
		}
		public List<ConstructorDefContext> constructorDef() {
			return getRuleContexts(ConstructorDefContext.class);
		}
		public ConstructorDefContext constructorDef(int i) {
			return getRuleContext(ConstructorDefContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public ClassBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterClassBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitClassBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitClassBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBlockContext classBlock() throws RecognitionException {
		ClassBlockContext _localctx = new ClassBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(274);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(271);
						var();
						}
						break;
					case 2:
						{
						setState(272);
						methodDef();
						}
						break;
					case 3:
						{
						setState(273);
						constructorDef();
						}
						break;
					}
					setState(277); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(276);
							match(ENDLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(279); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(283); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<LineBlockContext> lineBlock() {
			return getRuleContexts(LineBlockContext.class);
		}
		public LineBlockContext lineBlock(int i) {
			return getRuleContext(LineBlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 576462889049834063L) != 0)) {
				{
				{
				setState(285);
				lineBlock();
				}
				}
				setState(290);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineBlockContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KatLanParser.EOF, 0); }
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public LineBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterLineBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitLineBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitLineBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineBlockContext lineBlock() throws RecognitionException {
		LineBlockContext _localctx = new LineBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lineBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(291);
				var();
				}
				break;
			case 2:
				{
				setState(292);
				varAssignment();
				}
				break;
			case 3:
				{
				setState(293);
				methodCall();
				}
				break;
			case 4:
				{
				setState(294);
				statement();
				}
				break;
			}
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDLINE:
				{
				setState(298); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(297);
						match(ENDLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(300); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case Recognizer.EOF:
				{
				setState(302);
				match(Recognizer.EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode STRING_VAL() { return getToken(KatLanParser.STRING_VAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AnyTypeContext anyType() {
			return getRuleContext(AnyTypeContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(STRING_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				arithmeticExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				anyType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				arrayAccess();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(KatLanParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KatLanParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarAssignmentContext extends ParserRuleContext {
		public VarAccessContext varAccess() {
			return getRuleContext(VarAccessContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IncrExpressionContext incrExpression() {
			return getRuleContext(IncrExpressionContext.class,0);
		}
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varAssignment);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(316);
				varAccess();
				setState(317);
				match(T__7);
				setState(318);
				value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				incrExpression();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarAccessContext extends ParserRuleContext {
		public TerminalNode NAME0() { return getToken(KatLanParser.NAME0, 0); }
		public VarAccessContext varAccess() {
			return getRuleContext(VarAccessContext.class,0);
		}
		public VarAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterVarAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitVarAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitVarAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAccessContext varAccess() throws RecognitionException {
		VarAccessContext _localctx = new VarAccessContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(NAME0);
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(324);
				match(T__8);
				setState(325);
				varAccess();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ParserRuleContext {
		public VarAccessContext varAccess() {
			return getRuleContext(VarAccessContext.class,0);
		}
		public List<ArrayAccess0Context> arrayAccess0() {
			return getRuleContexts(ArrayAccess0Context.class);
		}
		public ArrayAccess0Context arrayAccess0(int i) {
			return getRuleContext(ArrayAccess0Context.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			varAccess();
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329);
				arrayAccess0();
				}
				}
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccess0Context extends ParserRuleContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public ArrayAccess0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterArrayAccess0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitArrayAccess0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitArrayAccess0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess0Context arrayAccess0() throws RecognitionException {
		ArrayAccess0Context _localctx = new ArrayAccess0Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayAccess0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(334);
			match(T__9);
			setState(335);
			arithmeticExpression();
			setState(336);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
		}
		public TerminalNode ABSTRACT_KEYWORD() { return getToken(KatLanParser.ABSTRACT_KEYWORD, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public MethodDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterMethodDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitMethodDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitMethodDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefContext methodDef() throws RecognitionException {
		MethodDefContext _localctx = new MethodDefContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(338);
				annotationCall();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			access();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT_KEYWORD) {
				{
				setState(345);
				match(ABSTRACT_KEYWORD);
				}
			}

			setState(348);
			match(T__11);
			setState(349);
			name();
			setState(350);
			match(T__12);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17 || _la==NAME0) {
				{
				setState(351);
				parameters();
				}
			}

			setState(354);
			match(T__13);
			setState(355);
			match(T__4);
			setState(356);
			type();
			setState(357);
			match(T__5);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					match(ENDLINE);
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(364);
			block();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(365);
				match(ENDLINE);
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public ConstructorDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterConstructorDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitConstructorDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitConstructorDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDefContext constructorDef() throws RecognitionException {
		ConstructorDefContext _localctx = new ConstructorDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constructorDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(373);
				annotationCall();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			access();
			setState(380);
			match(T__14);
			setState(381);
			name();
			setState(382);
			match(T__12);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17 || _la==NAME0) {
				{
				setState(383);
				parameters();
				}
			}

			setState(386);
			match(T__13);
			setState(387);
			match(T__5);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					match(ENDLINE);
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(394);
			block();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(395);
				match(ENDLINE);
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(403);
			parameter();
			}
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(404);
				match(T__3);
				setState(405);
				parameter();
				}
				}
				setState(410);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(411);
				annotationCall();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			name();
			setState(418);
			match(T__4);
			setState(419);
			type();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(420);
				match(T__7);
				setState(421);
				value();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
		}
		public ConstDefContext constDef() {
			return getRuleContext(ConstDefContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(424);
					annotationCall();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				constDef();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public ConstDef0Context constDef0() {
			return getRuleContext(ConstDef0Context.class,0);
		}
		public ConstDef1Context constDef1() {
			return getRuleContext(ConstDef1Context.class,0);
		}
		public ConstDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterConstDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitConstDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitConstDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDefContext constDef() throws RecognitionException {
		ConstDefContext _localctx = new ConstDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			access();
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(435);
				constDef0();
				}
				break;
			case 2:
				{
				setState(436);
				constDef1();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDef0Context extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConstDef0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDef0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterConstDef0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitConstDef0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitConstDef0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDef0Context constDef0() throws RecognitionException {
		ConstDef0Context _localctx = new ConstDef0Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_constDef0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__15);
			setState(440);
			name();
			setState(441);
			match(T__4);
			setState(442);
			type();
			setState(443);
			match(T__7);
			setState(444);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDef1Context extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ConstDef1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDef1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterConstDef1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitConstDef1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitConstDef1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDef1Context constDef1() throws RecognitionException {
		ConstDef1Context _localctx = new ConstDef1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_constDef1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(T__15);
			{
			setState(447);
			name();
			setState(448);
			match(T__7);
			setState(449);
			value();
			}
			setState(456); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(451);
				match(T__3);
				setState(452);
				name();
				setState(453);
				match(T__7);
				setState(454);
				value();
				}
				}
				setState(458); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(460);
			match(T__4);
			setState(461);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public VarDef0Context varDef0() {
			return getRuleContext(VarDef0Context.class,0);
		}
		public VarDef1Context varDef1() {
			return getRuleContext(VarDef1Context.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			access();
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(464);
				varDef0();
				}
				break;
			case 2:
				{
				setState(465);
				varDef1();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDef0Context extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarDef0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterVarDef0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitVarDef0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitVarDef0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDef0Context varDef0() throws RecognitionException {
		VarDef0Context _localctx = new VarDef0Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_varDef0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__16);
			setState(469);
			name();
			setState(470);
			match(T__4);
			setState(471);
			type();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(472);
				match(T__7);
				setState(473);
				value();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDef1Context extends ParserRuleContext {
		public List<SubVD1Context> subVD1() {
			return getRuleContexts(SubVD1Context.class);
		}
		public SubVD1Context subVD1(int i) {
			return getRuleContext(SubVD1Context.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDef1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterVarDef1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitVarDef1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitVarDef1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDef1Context varDef1() throws RecognitionException {
		VarDef1Context _localctx = new VarDef1Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_varDef1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__16);
			setState(477);
			subVD1();
			setState(480); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(478);
				match(T__3);
				setState(479);
				subVD1();
				}
				}
				setState(482); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(484);
			match(T__4);
			setState(485);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubVD1Context extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SubVD1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subVD1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterSubVD1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitSubVD1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitSubVD1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubVD1Context subVD1() throws RecognitionException {
		SubVD1Context _localctx = new SubVD1Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_subVD1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			name();
			{
			setState(488);
			match(T__7);
			setState(489);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationCallContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AnnotationCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterAnnotationCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitAnnotationCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitAnnotationCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationCallContext annotationCall() throws RecognitionException {
		AnnotationCallContext _localctx = new AnnotationCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_annotationCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(T__17);
			setState(492);
			name();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(493);
				match(T__12);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & -1152587197239525339L) != 0)) {
					{
					setState(494);
					arguments();
					}
				}

				setState(497);
				match(T__13);
				}
			}

			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(500);
				match(ENDLINE);
				}
				}
				setState(505);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ForiLoopContext foriLoop() {
			return getRuleContext(ForiLoopContext.class,0);
		}
		public ForiLoop0Context foriLoop0() {
			return getRuleContext(ForiLoop0Context.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WhileLoopStatementContext whileLoopStatement() {
			return getRuleContext(WhileLoopStatementContext.class,0);
		}
		public TryCatchFinallyContext tryCatchFinally() {
			return getRuleContext(TryCatchFinallyContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				switchStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				foriLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(509);
				foriLoop0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(510);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(511);
				whileLoopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(512);
				tryCatchFinally();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__18);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & -1152587197239525339L) != 0)) {
				{
				setState(516);
				value();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH_KEYWORD() { return getToken(KatLanParser.SWITCH_KEYWORD, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public List<SubSwitch0Context> subSwitch0() {
			return getRuleContexts(SubSwitch0Context.class);
		}
		public SubSwitch0Context subSwitch0(int i) {
			return getRuleContext(SubSwitch0Context.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(SWITCH_KEYWORD);
			setState(520);
			match(T__12);
			setState(521);
			value();
			setState(522);
			match(T__13);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(523);
				match(ENDLINE);
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			match(T__5);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(530);
				match(ENDLINE);
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(537); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(536);
				subSwitch0();
				}
				}
				setState(539); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & -1152587197239525211L) != 0) );
			setState(541);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubSwitch0Context extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LineBlockContext lineBlock() {
			return getRuleContext(LineBlockContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SubSwitch0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subSwitch0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterSubSwitch0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitSubSwitch0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitSubSwitch0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubSwitch0Context subSwitch0() throws RecognitionException {
		SubSwitch0Context _localctx = new SubSwitch0Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_subSwitch0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__14:
			case T__17:
			case STR:
			case BOOL:
			case INT:
			case FLOAT:
			case DOUBLE:
			case LONG:
			case SHORT:
			case BYTE:
			case OBJ:
			case VOID:
			case NULL:
			case PLUS:
			case MINUS:
			case TRUE:
			case FALSE:
			case NOT:
			case INT_VAL:
			case FLOAT_VAL:
			case NAME0:
			case STRING_VAL:
				{
				setState(543);
				value();
				}
				break;
			case T__19:
				{
				setState(544);
				match(T__19);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(547);
			match(T__20);
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(548);
				match(T__5);
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(549);
						match(ENDLINE);
						}
						} 
					}
					setState(554);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(555);
				block();
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(556);
					match(ENDLINE);
					}
					}
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(562);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__24:
			case FOR_KEYWORD:
			case IF_KEYWORD:
			case SWITCH_KEYWORD:
			case PLUS:
			case MINUS:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case STATIC:
			case FINAL:
			case NAME0:
			case ENDLINE:
				{
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(564);
					match(ENDLINE);
					}
					}
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(570);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(573);
				match(ENDLINE);
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchFinallyContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<LineBlockContext> lineBlock() {
			return getRuleContexts(LineBlockContext.class);
		}
		public LineBlockContext lineBlock(int i) {
			return getRuleContext(LineBlockContext.class,i);
		}
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TryCatchFinallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchFinally; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterTryCatchFinally(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitTryCatchFinally(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitTryCatchFinally(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchFinallyContext tryCatchFinally() throws RecognitionException {
		TryCatchFinallyContext _localctx = new TryCatchFinallyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(T__21);
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(580);
				varAssignment();
				}
				break;
			}
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(583);
				match(T__5);
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(584);
						match(ENDLINE);
						}
						} 
					}
					setState(589);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(590);
				block();
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(591);
					match(ENDLINE);
					}
					}
					setState(596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(597);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__24:
			case FOR_KEYWORD:
			case IF_KEYWORD:
			case SWITCH_KEYWORD:
			case PLUS:
			case MINUS:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case STATIC:
			case FINAL:
			case NAME0:
				{
				setState(599);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(602);
				match(ENDLINE);
				}
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(608);
			match(T__22);
			setState(609);
			match(T__12);
			setState(610);
			parameter();
			setState(611);
			match(T__13);
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(612);
				match(T__5);
				setState(616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(613);
						match(ENDLINE);
						}
						} 
					}
					setState(618);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(619);
				block();
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(620);
					match(ENDLINE);
					}
					}
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(626);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__24:
			case FOR_KEYWORD:
			case IF_KEYWORD:
			case SWITCH_KEYWORD:
			case PLUS:
			case MINUS:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case STATIC:
			case FINAL:
			case NAME0:
				{
				setState(628);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(631);
					match(ENDLINE);
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(637);
				match(T__23);
				setState(655);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					{
					setState(638);
					match(T__5);
					setState(642);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(639);
							match(ENDLINE);
							}
							} 
						}
						setState(644);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
					}
					setState(645);
					block();
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ENDLINE) {
						{
						{
						setState(646);
						match(ENDLINE);
						}
						}
						setState(651);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(652);
					match(T__6);
					}
					}
					break;
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__21:
				case T__24:
				case FOR_KEYWORD:
				case IF_KEYWORD:
				case SWITCH_KEYWORD:
				case PLUS:
				case MINUS:
				case PUBLIC:
				case PRIVATE:
				case PROTECTED:
				case STATIC:
				case FINAL:
				case NAME0:
					{
					setState(654);
					lineBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(657);
				match(ENDLINE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF_KEYWORD() { return getToken(KatLanParser.IF_KEYWORD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<IfStatement0Context> ifStatement0() {
			return getRuleContexts(IfStatement0Context.class);
		}
		public IfStatement0Context ifStatement0(int i) {
			return getRuleContext(IfStatement0Context.class,i);
		}
		public TerminalNode ELSE_KEYWORD() { return getToken(KatLanParser.ELSE_KEYWORD, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(IF_KEYWORD);
			setState(662);
			match(T__12);
			setState(663);
			expression();
			setState(664);
			match(T__13);
			setState(665);
			ifStatement0();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KEYWORD) {
				{
				setState(666);
				match(ELSE_KEYWORD);
				setState(667);
				ifStatement0();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatement0Context extends ParserRuleContext {
		public LineBlockContext lineBlock() {
			return getRuleContext(LineBlockContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatement0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterIfStatement0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitIfStatement0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitIfStatement0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatement0Context ifStatement0() throws RecognitionException {
		IfStatement0Context _localctx = new IfStatement0Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStatement0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(670);
				match(ENDLINE);
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(676);
				match(T__5);
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(677);
						match(ENDLINE);
						}
						} 
					}
					setState(682);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(683);
				block();
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(684);
					match(ENDLINE);
					}
					}
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(690);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__24:
			case FOR_KEYWORD:
			case IF_KEYWORD:
			case SWITCH_KEYWORD:
			case PLUS:
			case MINUS:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case STATIC:
			case FINAL:
			case NAME0:
				{
				setState(692);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LineBlockContext lineBlock() {
			return getRuleContext(LineBlockContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopStatementContext whileLoopStatement() throws RecognitionException {
		WhileLoopStatementContext _localctx = new WhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whileLoopStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(T__24);
			setState(696);
			match(T__12);
			setState(697);
			expression();
			setState(698);
			match(T__13);
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(699);
				match(ENDLINE);
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(705);
				match(T__5);
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(706);
						match(ENDLINE);
						}
						} 
					}
					setState(711);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				setState(712);
				block();
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(713);
					match(ENDLINE);
					}
					}
					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(719);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__24:
			case FOR_KEYWORD:
			case IF_KEYWORD:
			case SWITCH_KEYWORD:
			case PLUS:
			case MINUS:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case STATIC:
			case FINAL:
			case NAME0:
				{
				setState(721);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForiLoopContext extends ParserRuleContext {
		public TerminalNode FOR_KEYWORD() { return getToken(KatLanParser.FOR_KEYWORD, 0); }
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public LineBlockContext lineBlock() {
			return getRuleContext(LineBlockContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForiLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foriLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterForiLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitForiLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitForiLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForiLoopContext foriLoop() throws RecognitionException {
		ForiLoopContext _localctx = new ForiLoopContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_foriLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(FOR_KEYWORD);
			setState(725);
			match(T__12);
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 139611588448616448L) != 0)) {
				{
				setState(726);
				varDef();
				}
			}

			setState(729);
			match(ENDLINE);
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 8070784835322380325L) != 0)) {
				{
				setState(730);
				expression();
				}
			}

			setState(733);
			match(ENDLINE);
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 268435459L) != 0)) {
				{
				setState(734);
				varAssignment();
				}
			}

			setState(737);
			match(T__13);
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(738);
				match(ENDLINE);
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(744);
				match(T__5);
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(745);
					match(ENDLINE);
					}
					}
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(751);
				block();
				setState(752);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__24:
			case FOR_KEYWORD:
			case IF_KEYWORD:
			case SWITCH_KEYWORD:
			case PLUS:
			case MINUS:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case STATIC:
			case FINAL:
			case NAME0:
				{
				setState(754);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForiLoop0Context extends ParserRuleContext {
		public TerminalNode FOR_KEYWORD() { return getToken(KatLanParser.FOR_KEYWORD, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public LineBlockContext lineBlock() {
			return getRuleContext(LineBlockContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForiLoop0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foriLoop0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterForiLoop0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitForiLoop0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitForiLoop0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForiLoop0Context foriLoop0() throws RecognitionException {
		ForiLoop0Context _localctx = new ForiLoop0Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_foriLoop0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(FOR_KEYWORD);
			setState(758);
			match(T__12);
			setState(759);
			name();
			setState(760);
			match(T__4);
			setState(761);
			type();
			setState(762);
			match(T__3);
			setState(763);
			value();
			setState(764);
			match(T__25);
			setState(765);
			value();
			setState(766);
			match(T__13);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(767);
				match(ENDLINE);
				}
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(773);
				match(T__5);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(774);
					match(ENDLINE);
					}
					}
					setState(779);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(780);
				block();
				setState(781);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__24:
			case FOR_KEYWORD:
			case IF_KEYWORD:
			case SWITCH_KEYWORD:
			case PLUS:
			case MINUS:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case STATIC:
			case FINAL:
			case NAME0:
				{
				setState(783);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccessContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(KatLanParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(KatLanParser.FINAL, 0); }
		public TerminalNode PUBLIC() { return getToken(KatLanParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(KatLanParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(KatLanParser.PRIVATE, 0); }
		public AccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessContext access() throws RecognitionException {
		AccessContext _localctx = new AccessContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
				{
				setState(786);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(789);
				match(STATIC);
				}
			}

			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(792);
				match(FINAL);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public AnyTypeContext anyType() {
			return getRuleContext(AnyTypeContext.class,0);
		}
		public LinkTypeContext linkType() {
			return getRuleContext(LinkTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
			case BOOL:
			case INT:
			case FLOAT:
			case DOUBLE:
			case LONG:
			case SHORT:
			case BYTE:
			case OBJ:
			case VOID:
			case NULL:
			case NAME0:
				{
				setState(795);
				anyType();
				}
				break;
			case T__26:
				{
				setState(796);
				linkType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(799);
				match(T__9);
				setState(800);
				match(T__10);
				}
				}
				setState(805);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnyTypeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public AnyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitAnyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitAnyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyTypeContext anyType() throws RecognitionException {
		AnyTypeContext _localctx = new AnyTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_anyType);
		try {
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME0:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				name();
				}
				break;
			case STR:
			case BOOL:
			case INT:
			case FLOAT:
			case DOUBLE:
			case LONG:
			case SHORT:
			case BYTE:
			case OBJ:
			case VOID:
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				primitiveType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LinkTypeContext extends ParserRuleContext {
		public AnyTypeContext anyType() {
			return getRuleContext(AnyTypeContext.class,0);
		}
		public TerminalNode CLASS_KEYWORD() { return getToken(KatLanParser.CLASS_KEYWORD, 0); }
		public TerminalNode INTERFACE_KEYWORD() { return getToken(KatLanParser.INTERFACE_KEYWORD, 0); }
		public TerminalNode ENUM_KEYWORD() { return getToken(KatLanParser.ENUM_KEYWORD, 0); }
		public LinkTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterLinkType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitLinkType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitLinkType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkTypeContext linkType() throws RecognitionException {
		LinkTypeContext _localctx = new LinkTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_linkType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(T__26);
			setState(816);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
			case BOOL:
			case INT:
			case FLOAT:
			case DOUBLE:
			case LONG:
			case SHORT:
			case BYTE:
			case OBJ:
			case VOID:
			case NULL:
			case NAME0:
				{
				setState(811);
				anyType();
				}
				break;
			case CLASS_KEYWORD:
				{
				setState(812);
				match(CLASS_KEYWORD);
				}
				break;
			case INTERFACE_KEYWORD:
				{
				setState(813);
				match(INTERFACE_KEYWORD);
				}
				break;
			case ENUM_KEYWORD:
				{
				setState(814);
				match(ENUM_KEYWORD);
				}
				break;
			case T__27:
				{
				setState(815);
				match(T__27);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(KatLanParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(KatLanParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(KatLanParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(KatLanParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(KatLanParser.DOUBLE, 0); }
		public TerminalNode LONG() { return getToken(KatLanParser.LONG, 0); }
		public TerminalNode SHORT() { return getToken(KatLanParser.SHORT, 0); }
		public TerminalNode BYTE() { return getToken(KatLanParser.BYTE, 0); }
		public TerminalNode OBJ() { return getToken(KatLanParser.OBJ, 0); }
		public NullTypeContext nullType() {
			return getRuleContext(NullTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_primitiveType);
		try {
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				match(STR);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				match(BOOL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(821);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(822);
				match(DOUBLE);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(823);
				match(LONG);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(824);
				match(SHORT);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(825);
				match(BYTE);
				}
				break;
			case OBJ:
				enterOuterAlt(_localctx, 9);
				{
				setState(826);
				match(OBJ);
				}
				break;
			case VOID:
			case NULL:
				enterOuterAlt(_localctx, 10);
				{
				setState(827);
				nullType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NullTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(KatLanParser.VOID, 0); }
		public TerminalNode NULL() { return getToken(KatLanParser.NULL, 0); }
		public NullTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterNullType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitNullType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitNullType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullTypeContext nullType() throws RecognitionException {
		NullTypeContext _localctx = new NullTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nullType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==NULL) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			argument();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(833);
				match(T__3);
				setState(834);
				argument();
				}
				}
				setState(839);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCall0Context extends ParserRuleContext {
		public TerminalNode NAME0() { return getToken(KatLanParser.NAME0, 0); }
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
		}
		public VarAccessContext varAccess() {
			return getRuleContext(VarAccessContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodCall0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterMethodCall0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitMethodCall0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitMethodCall0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCall0Context methodCall0() throws RecognitionException {
		MethodCall0Context _localctx = new MethodCall0Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_methodCall0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(842);
				annotationCall();
				}
				}
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(848);
				varAccess();
				setState(849);
				match(T__8);
				}
				break;
			}
			setState(853);
			match(NAME0);
			setState(854);
			match(T__12);
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & -1152587197239525339L) != 0)) {
				{
				setState(855);
				arguments();
				}
			}

			setState(858);
			match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public List<MethodCall0Context> methodCall0() {
			return getRuleContexts(MethodCall0Context.class);
		}
		public MethodCall0Context methodCall0(int i) {
			return getRuleContext(MethodCall0Context.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			methodCall0();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(861);
				match(T__8);
				setState(862);
				methodCall0();
				}
				}
				setState(867);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorCallContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitConstructorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorCallContext constructorCall() throws RecognitionException {
		ConstructorCallContext _localctx = new ConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constructorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			match(T__14);
			setState(869);
			name();
			setState(870);
			match(T__12);
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & -1152587197239525339L) != 0)) {
				{
				setState(871);
				arguments();
				}
			}

			setState(874);
			match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryExpresionContext primaryExpresion() {
			return getRuleContext(PrimaryExpresionContext.class,0);
		}
		public LogicalOrContext logicalOr() {
			return getRuleContext(LogicalOrContext.class,0);
		}
		public ArithCondExpressionContext arithCondExpression() {
			return getRuleContext(ArithCondExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expression);
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				primaryExpresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				logicalOr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				arithCondExpression();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrContext extends ParserRuleContext {
		public List<PrimaryExpresionContext> primaryExpresion() {
			return getRuleContexts(PrimaryExpresionContext.class);
		}
		public PrimaryExpresionContext primaryExpresion(int i) {
			return getRuleContext(PrimaryExpresionContext.class,i);
		}
		public List<LogicalAndContext> logicalAnd() {
			return getRuleContexts(LogicalAndContext.class);
		}
		public LogicalAndContext logicalAnd(int i) {
			return getRuleContext(LogicalAndContext.class,i);
		}
		public TerminalNode OR() { return getToken(KatLanParser.OR, 0); }
		public LogicalOrContext logicalOr() {
			return getRuleContext(LogicalOrContext.class,0);
		}
		public LogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrContext logicalOr() throws RecognitionException {
		LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(881);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(882);
				logicalAnd();
				}
				break;
			}
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(885);
				match(OR);
				setState(889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(886);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(887);
					logicalAnd();
					}
					break;
				case 3:
					{
					setState(888);
					logicalOr();
					}
					break;
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndContext extends ParserRuleContext {
		public List<PrimaryExpresionContext> primaryExpresion() {
			return getRuleContexts(PrimaryExpresionContext.class);
		}
		public PrimaryExpresionContext primaryExpresion(int i) {
			return getRuleContext(PrimaryExpresionContext.class,i);
		}
		public List<LogicalXorContext> logicalXor() {
			return getRuleContexts(LogicalXorContext.class);
		}
		public LogicalXorContext logicalXor(int i) {
			return getRuleContext(LogicalXorContext.class,i);
		}
		public TerminalNode AND() { return getToken(KatLanParser.AND, 0); }
		public LogicalAndContext logicalAnd() {
			return getRuleContext(LogicalAndContext.class,0);
		}
		public LogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndContext logicalAnd() throws RecognitionException {
		LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(893);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(894);
				logicalXor();
				}
				break;
			}
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(897);
				match(AND);
				setState(901);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(898);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(899);
					logicalXor();
					}
					break;
				case 3:
					{
					setState(900);
					logicalAnd();
					}
					break;
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalXorContext extends ParserRuleContext {
		public List<PrimaryExpresionContext> primaryExpresion() {
			return getRuleContexts(PrimaryExpresionContext.class);
		}
		public PrimaryExpresionContext primaryExpresion(int i) {
			return getRuleContext(PrimaryExpresionContext.class,i);
		}
		public List<LogicalNotContext> logicalNot() {
			return getRuleContexts(LogicalNotContext.class);
		}
		public LogicalNotContext logicalNot(int i) {
			return getRuleContext(LogicalNotContext.class,i);
		}
		public TerminalNode XOR() { return getToken(KatLanParser.XOR, 0); }
		public LogicalXorContext logicalXor() {
			return getRuleContext(LogicalXorContext.class,0);
		}
		public LogicalXorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalXor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterLogicalXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitLogicalXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitLogicalXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalXorContext logicalXor() throws RecognitionException {
		LogicalXorContext _localctx = new LogicalXorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_logicalXor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(905);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(906);
				logicalNot();
				}
				break;
			}
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XOR) {
				{
				setState(909);
				match(XOR);
				setState(913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(910);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(911);
					logicalNot();
					}
					break;
				case 3:
					{
					setState(912);
					logicalXor();
					}
					break;
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNotContext extends ParserRuleContext {
		public PrimaryExpresionContext primaryExpresion() {
			return getRuleContext(PrimaryExpresionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(KatLanParser.NOT, 0); }
		public LogicalNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalNotContext logicalNot() throws RecognitionException {
		LogicalNotContext _localctx = new LogicalNotContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_logicalNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(917);
				match(NOT);
				}
			}

			setState(920);
			primaryExpresion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpresionContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VarAccessContext varAccess() {
			return getRuleContext(VarAccessContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstructorCallContext constructorCall() {
			return getRuleContext(ConstructorCallContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public PrimaryExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterPrimaryExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitPrimaryExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitPrimaryExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpresionContext primaryExpresion() throws RecognitionException {
		PrimaryExpresionContext _localctx = new PrimaryExpresionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_primaryExpresion);
		try {
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(924);
				name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(925);
				varAccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(926);
				match(T__12);
				setState(927);
				expression();
				setState(928);
				match(T__13);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(930);
				constructorCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(931);
				arrayAccess();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithCondExpressionContext extends ParserRuleContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode BT() { return getToken(KatLanParser.BT, 0); }
		public TerminalNode LT() { return getToken(KatLanParser.LT, 0); }
		public TerminalNode EQ() { return getToken(KatLanParser.EQ, 0); }
		public TerminalNode NE() { return getToken(KatLanParser.NE, 0); }
		public TerminalNode LE() { return getToken(KatLanParser.LE, 0); }
		public TerminalNode BE() { return getToken(KatLanParser.BE, 0); }
		public ArithCondExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithCondExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterArithCondExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitArithCondExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitArithCondExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithCondExpressionContext arithCondExpression() throws RecognitionException {
		ArithCondExpressionContext _localctx = new ArithCondExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arithCondExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			arithmeticExpression();
			setState(935);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(936);
			arithmeticExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public NumberExpressionContext numberExpression() {
			return getRuleContext(NumberExpressionContext.class,0);
		}
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arithmeticExpression);
		try {
			setState(940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				numberExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				addSubExpression();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionContext extends ParserRuleContext {
		public ModDivExpressionContext modDivExpression() {
			return getRuleContext(ModDivExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(KatLanParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(KatLanParser.MINUS, 0); }
		public NumberExpressionContext numberExpression() {
			return getRuleContext(NumberExpressionContext.class,0);
		}
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public AddSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExpressionContext addSubExpression() throws RecognitionException {
		AddSubExpressionContext _localctx = new AddSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_addSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			modDivExpression();
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(943);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(946);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(944);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(945);
					addSubExpression();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModDivExpressionContext extends ParserRuleContext {
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public TerminalNode MOD() { return getToken(KatLanParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(KatLanParser.DIV, 0); }
		public NumberExpressionContext numberExpression() {
			return getRuleContext(NumberExpressionContext.class,0);
		}
		public ModDivExpressionContext modDivExpression() {
			return getRuleContext(ModDivExpressionContext.class,0);
		}
		public ModDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterModDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitModDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitModDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModDivExpressionContext modDivExpression() throws RecognitionException {
		ModDivExpressionContext _localctx = new ModDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_modDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			mulDivExpression();
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIV || _la==MOD) {
				{
				setState(951);
				_la = _input.LA(1);
				if ( !(_la==DIV || _la==MOD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(954);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(952);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(953);
					modDivExpression();
					}
					break;
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExpressionContext extends ParserRuleContext {
		public PowerExpressionContext powerExpression() {
			return getRuleContext(PowerExpressionContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(KatLanParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(KatLanParser.DIVIDE, 0); }
		public NumberExpressionContext numberExpression() {
			return getRuleContext(NumberExpressionContext.class,0);
		}
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public MulDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitMulDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitMulDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivExpressionContext mulDivExpression() throws RecognitionException {
		MulDivExpressionContext _localctx = new MulDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_mulDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			powerExpression();
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLY || _la==DIVIDE) {
				{
				setState(959);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(962);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(960);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(961);
					mulDivExpression();
					}
					break;
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PowerExpressionContext extends ParserRuleContext {
		public List<NumberExpressionContext> numberExpression() {
			return getRuleContexts(NumberExpressionContext.class);
		}
		public NumberExpressionContext numberExpression(int i) {
			return getRuleContext(NumberExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(KatLanParser.POWER, 0); }
		public PowerExpressionContext powerExpression() {
			return getRuleContext(PowerExpressionContext.class,0);
		}
		public PowerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerExpressionContext powerExpression() throws RecognitionException {
		PowerExpressionContext _localctx = new PowerExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_powerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			numberExpression();
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(967);
				match(POWER);
				setState(970);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(968);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(969);
					powerExpression();
					}
					break;
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberExpressionContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Numeric_valueContext numeric_value() {
			return getRuleContext(Numeric_valueContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(KatLanParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(KatLanParser.PLUS, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public IncrExpressionContext incrExpression() {
			return getRuleContext(IncrExpressionContext.class,0);
		}
		public NumberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberExpressionContext numberExpression() throws RecognitionException {
		NumberExpressionContext _localctx = new NumberExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_numberExpression);
		int _la;
		try {
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(974);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(977);
					methodCall();
					}
					break;
				case 2:
					{
					setState(978);
					name();
					}
					break;
				case 3:
					{
					setState(979);
					numeric_value();
					}
					break;
				case 4:
					{
					{
					setState(980);
					match(T__12);
					setState(981);
					arithmeticExpression();
					setState(982);
					match(T__13);
					}
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				incrExpression();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncrExpressionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VarAccessContext varAccess() {
			return getRuleContext(VarAccessContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(KatLanParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(KatLanParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(KatLanParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(KatLanParser.MINUS, i);
		}
		public IncrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterIncrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitIncrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitIncrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrExpressionContext incrExpression() throws RecognitionException {
		IncrExpressionContext _localctx = new IncrExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_incrExpression);
		try {
			setState(1009);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(993);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(989);
					match(PLUS);
					setState(990);
					match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(991);
					match(MINUS);
					setState(992);
					match(MINUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(997);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(995);
					name();
					}
					break;
				case 2:
					{
					setState(996);
					varAccess();
					}
					break;
				}
				}
				}
				break;
			case NAME0:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1001);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(999);
					name();
					}
					break;
				case 2:
					{
					setState(1000);
					varAccess();
					}
					break;
				}
				setState(1007);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(1003);
					match(PLUS);
					setState(1004);
					match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(1005);
					match(MINUS);
					setState(1006);
					match(MINUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public Dot_nameContext dot_name() {
			return getRuleContext(Dot_nameContext.class,0);
		}
		public TerminalNode NAME0() { return getToken(KatLanParser.NAME0, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_name);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				dot_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				match(NAME0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dot_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME0() { return getTokens(KatLanParser.NAME0); }
		public TerminalNode NAME0(int i) {
			return getToken(KatLanParser.NAME0, i);
		}
		public Dot_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterDot_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitDot_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitDot_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_nameContext dot_name() throws RecognitionException {
		Dot_nameContext _localctx = new Dot_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_dot_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(NAME0);
			setState(1018); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1016);
				match(T__8);
				setState(1017);
				match(NAME0);
				}
				}
				setState(1020); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_valueContext extends ParserRuleContext {
		public TerminalNode FLOAT_VAL() { return getToken(KatLanParser.FLOAT_VAL, 0); }
		public TerminalNode INT_VAL() { return getToken(KatLanParser.INT_VAL, 0); }
		public Numeric_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterNumeric_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitNumeric_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitNumeric_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_valueContext numeric_value() throws RecognitionException {
		Numeric_valueContext _localctx = new Numeric_valueContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_numeric_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			_la = _input.LA(1);
			if ( !(_la==INT_VAL || _la==FLOAT_VAL) ) {
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
		"\u0004\u0001O\u0401\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0001\u0000\u0003\u0000\u0088\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u008e\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001\u0093\b\u0001\u000b\u0001\f\u0001"+
		"\u0094\u0001\u0002\u0005\u0002\u0098\b\u0002\n\u0002\f\u0002\u009b\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a1\b\u0003"+
		"\u0001\u0003\u0004\u0003\u00a4\b\u0003\u000b\u0003\f\u0003\u00a5\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00ac\b\u0004\n"+
		"\u0004\f\u0004\u00af\t\u0004\u0001\u0004\u0004\u0004\u00b2\b\u0004\u000b"+
		"\u0004\f\u0004\u00b3\u0003\u0004\u00b6\b\u0004\u0001\u0004\u0003\u0004"+
		"\u00b9\b\u0004\u0001\u0004\u0003\u0004\u00bc\b\u0004\u0001\u0005\u0005"+
		"\u0005\u00bf\b\u0005\n\u0005\f\u0005\u00c2\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00c6\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ca\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00d1\b\u0005\n\u0005\f\u0005\u00d4\t\u0005\u0003\u0005\u00d6\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00da\b\u0005\n\u0005\f\u0005"+
		"\u00dd\t\u0005\u0001\u0005\u0003\u0005\u00e0\b\u0005\u0001\u0005\u0005"+
		"\u0005\u00e3\b\u0005\n\u0005\f\u0005\u00e6\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0005\u0006\u00eb\b\u0006\n\u0006\f\u0006\u00ee\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00f7\b\u0006\n\u0006\f\u0006\u00fa\t\u0006\u0003\u0006"+
		"\u00fc\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0100\b\u0006\n\u0006"+
		"\f\u0006\u0103\t\u0006\u0001\u0006\u0003\u0006\u0106\b\u0006\u0001\u0006"+
		"\u0005\u0006\u0109\b\u0006\n\u0006\f\u0006\u010c\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0113\b\u0007\u0001"+
		"\u0007\u0004\u0007\u0116\b\u0007\u000b\u0007\f\u0007\u0117\u0004\u0007"+
		"\u011a\b\u0007\u000b\u0007\f\u0007\u011b\u0001\b\u0005\b\u011f\b\b\n\b"+
		"\f\b\u0122\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0128\b\t\u0001"+
		"\t\u0004\t\u012b\b\t\u000b\t\f\t\u012c\u0001\t\u0003\t\u0130\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0139\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0142"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u0147\b\r\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\u014b\b\u000e\u000b\u000e\f\u000e\u014c\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0005\u0010\u0154\b\u0010\n"+
		"\u0010\f\u0010\u0157\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u015b"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0161"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0168\b\u0010\n\u0010\f\u0010\u016b\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u016f\b\u0010\n\u0010\f\u0010\u0172\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0005\u0011\u0177\b\u0011\n\u0011\f\u0011\u017a\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0181\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0186\b"+
		"\u0011\n\u0011\f\u0011\u0189\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u018d\b\u0011\n\u0011\f\u0011\u0190\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0197\b\u0012\n\u0012\f\u0012"+
		"\u019a\t\u0012\u0001\u0013\u0005\u0013\u019d\b\u0013\n\u0013\f\u0013\u01a0"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u01a7\b\u0013\u0001\u0014\u0005\u0014\u01aa\b\u0014\n\u0014\f\u0014"+
		"\u01ad\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01b1\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01b6\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u01c9\b\u0017\u000b"+
		"\u0017\f\u0017\u01ca\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01d3\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01db\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u01e1\b\u001a\u000b"+
		"\u001a\f\u001a\u01e2\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01f0\b\u001c\u0001\u001c\u0003\u001c\u01f3\b\u001c"+
		"\u0001\u001c\u0005\u001c\u01f6\b\u001c\n\u001c\f\u001c\u01f9\t\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0202\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0206"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u020d\b\u001f\n\u001f\f\u001f\u0210\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0214\b\u001f\n\u001f\f\u001f\u0217\t\u001f\u0001\u001f\u0004"+
		"\u001f\u021a\b\u001f\u000b\u001f\f\u001f\u021b\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0003 \u0222\b \u0001 \u0001 \u0001 \u0005 \u0227\b \n"+
		" \f \u022a\t \u0001 \u0001 \u0005 \u022e\b \n \f \u0231\t \u0001 \u0001"+
		" \u0001 \u0005 \u0236\b \n \f \u0239\t \u0001 \u0003 \u023c\b \u0001 "+
		"\u0005 \u023f\b \n \f \u0242\t \u0001!\u0001!\u0003!\u0246\b!\u0001!\u0001"+
		"!\u0005!\u024a\b!\n!\f!\u024d\t!\u0001!\u0001!\u0005!\u0251\b!\n!\f!\u0254"+
		"\t!\u0001!\u0001!\u0001!\u0003!\u0259\b!\u0001!\u0005!\u025c\b!\n!\f!"+
		"\u025f\t!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0267\b!\n"+
		"!\f!\u026a\t!\u0001!\u0001!\u0005!\u026e\b!\n!\f!\u0271\t!\u0001!\u0001"+
		"!\u0001!\u0003!\u0276\b!\u0001!\u0005!\u0279\b!\n!\f!\u027c\t!\u0001!"+
		"\u0001!\u0001!\u0005!\u0281\b!\n!\f!\u0284\t!\u0001!\u0001!\u0005!\u0288"+
		"\b!\n!\f!\u028b\t!\u0001!\u0001!\u0001!\u0003!\u0290\b!\u0001!\u0001!"+
		"\u0003!\u0294\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u029d\b\"\u0001#\u0005#\u02a0\b#\n#\f#\u02a3\t#\u0001#\u0001"+
		"#\u0005#\u02a7\b#\n#\f#\u02aa\t#\u0001#\u0001#\u0005#\u02ae\b#\n#\f#\u02b1"+
		"\t#\u0001#\u0001#\u0001#\u0003#\u02b6\b#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0005$\u02bd\b$\n$\f$\u02c0\t$\u0001$\u0001$\u0005$\u02c4\b$\n$\f$\u02c7"+
		"\t$\u0001$\u0001$\u0005$\u02cb\b$\n$\f$\u02ce\t$\u0001$\u0001$\u0001$"+
		"\u0003$\u02d3\b$\u0001%\u0001%\u0001%\u0003%\u02d8\b%\u0001%\u0001%\u0003"+
		"%\u02dc\b%\u0001%\u0001%\u0003%\u02e0\b%\u0001%\u0001%\u0005%\u02e4\b"+
		"%\n%\f%\u02e7\t%\u0001%\u0001%\u0005%\u02eb\b%\n%\f%\u02ee\t%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u02f4\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u0301\b&\n&\f&\u0304\t&\u0001"+
		"&\u0001&\u0005&\u0308\b&\n&\f&\u030b\t&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u0311\b&\u0001\'\u0003\'\u0314\b\'\u0001\'\u0003\'\u0317\b\'\u0001\'"+
		"\u0003\'\u031a\b\'\u0001(\u0001(\u0003(\u031e\b(\u0001(\u0001(\u0005("+
		"\u0322\b(\n(\f(\u0325\t(\u0001)\u0001)\u0003)\u0329\b)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u0331\b*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u033d\b+\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0005-\u0344\b-\n-\f-\u0347\t-\u0001.\u0001.\u0001/\u0005"+
		"/\u034c\b/\n/\f/\u034f\t/\u0001/\u0001/\u0001/\u0003/\u0354\b/\u0001/"+
		"\u0001/\u0001/\u0003/\u0359\b/\u0001/\u0001/\u00010\u00010\u00010\u0005"+
		"0\u0360\b0\n0\f0\u0363\t0\u00011\u00011\u00011\u00011\u00031\u0369\b1"+
		"\u00011\u00011\u00012\u00012\u00012\u00032\u0370\b2\u00013\u00013\u0003"+
		"3\u0374\b3\u00013\u00013\u00013\u00013\u00033\u037a\b3\u00033\u037c\b"+
		"3\u00014\u00014\u00034\u0380\b4\u00014\u00014\u00014\u00014\u00034\u0386"+
		"\b4\u00034\u0388\b4\u00015\u00015\u00035\u038c\b5\u00015\u00015\u0001"+
		"5\u00015\u00035\u0392\b5\u00035\u0394\b5\u00016\u00036\u0397\b6\u0001"+
		"6\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00037\u03a5\b7\u00018\u00018\u00018\u00018\u00019\u00019\u0003"+
		"9\u03ad\b9\u0001:\u0001:\u0001:\u0001:\u0003:\u03b3\b:\u0003:\u03b5\b"+
		":\u0001;\u0001;\u0001;\u0001;\u0003;\u03bb\b;\u0003;\u03bd\b;\u0001<\u0001"+
		"<\u0001<\u0001<\u0003<\u03c3\b<\u0003<\u03c5\b<\u0001=\u0001=\u0001=\u0001"+
		"=\u0003=\u03cb\b=\u0003=\u03cd\b=\u0001>\u0003>\u03d0\b>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u03d9\b>\u0001>\u0003>\u03dc"+
		"\b>\u0001?\u0001?\u0001?\u0001?\u0003?\u03e2\b?\u0001?\u0001?\u0003?\u03e6"+
		"\b?\u0001?\u0001?\u0003?\u03ea\b?\u0001?\u0001?\u0001?\u0001?\u0003?\u03f0"+
		"\b?\u0003?\u03f2\b?\u0001@\u0001@\u0003@\u03f6\b@\u0001A\u0001A\u0001"+
		"A\u0004A\u03fb\bA\u000bA\fA\u03fc\u0001B\u0001B\u0001B\u0000\u0000C\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0000\b\u0001\u00009:\u0001\u000046\u0001\u0000+,\u0001\u0000?D\u0001"+
		"\u0000/0\u0001\u0000-.\u0001\u000012\u0001\u0000IJ\u0472\u0000\u0087\u0001"+
		"\u0000\u0000\u0000\u0002\u008f\u0001\u0000\u0000\u0000\u0004\u0099\u0001"+
		"\u0000\u0000\u0000\u0006\u009c\u0001\u0000\u0000\u0000\b\u00b5\u0001\u0000"+
		"\u0000\u0000\n\u00c0\u0001\u0000\u0000\u0000\f\u00ec\u0001\u0000\u0000"+
		"\u0000\u000e\u0119\u0001\u0000\u0000\u0000\u0010\u0120\u0001\u0000\u0000"+
		"\u0000\u0012\u0127\u0001\u0000\u0000\u0000\u0014\u0138\u0001\u0000\u0000"+
		"\u0000\u0016\u013a\u0001\u0000\u0000\u0000\u0018\u0141\u0001\u0000\u0000"+
		"\u0000\u001a\u0143\u0001\u0000\u0000\u0000\u001c\u0148\u0001\u0000\u0000"+
		"\u0000\u001e\u014e\u0001\u0000\u0000\u0000 \u0155\u0001\u0000\u0000\u0000"+
		"\"\u0178\u0001\u0000\u0000\u0000$\u0193\u0001\u0000\u0000\u0000&\u019e"+
		"\u0001\u0000\u0000\u0000(\u01b0\u0001\u0000\u0000\u0000*\u01b2\u0001\u0000"+
		"\u0000\u0000,\u01b7\u0001\u0000\u0000\u0000.\u01be\u0001\u0000\u0000\u0000"+
		"0\u01cf\u0001\u0000\u0000\u00002\u01d4\u0001\u0000\u0000\u00004\u01dc"+
		"\u0001\u0000\u0000\u00006\u01e7\u0001\u0000\u0000\u00008\u01eb\u0001\u0000"+
		"\u0000\u0000:\u0201\u0001\u0000\u0000\u0000<\u0203\u0001\u0000\u0000\u0000"+
		">\u0207\u0001\u0000\u0000\u0000@\u0221\u0001\u0000\u0000\u0000B\u0243"+
		"\u0001\u0000\u0000\u0000D\u0295\u0001\u0000\u0000\u0000F\u02a1\u0001\u0000"+
		"\u0000\u0000H\u02b7\u0001\u0000\u0000\u0000J\u02d4\u0001\u0000\u0000\u0000"+
		"L\u02f5\u0001\u0000\u0000\u0000N\u0313\u0001\u0000\u0000\u0000P\u031d"+
		"\u0001\u0000\u0000\u0000R\u0328\u0001\u0000\u0000\u0000T\u032a\u0001\u0000"+
		"\u0000\u0000V\u033c\u0001\u0000\u0000\u0000X\u033e\u0001\u0000\u0000\u0000"+
		"Z\u0340\u0001\u0000\u0000\u0000\\\u0348\u0001\u0000\u0000\u0000^\u034d"+
		"\u0001\u0000\u0000\u0000`\u035c\u0001\u0000\u0000\u0000b\u0364\u0001\u0000"+
		"\u0000\u0000d\u036f\u0001\u0000\u0000\u0000f\u0373\u0001\u0000\u0000\u0000"+
		"h\u037f\u0001\u0000\u0000\u0000j\u038b\u0001\u0000\u0000\u0000l\u0396"+
		"\u0001\u0000\u0000\u0000n\u03a4\u0001\u0000\u0000\u0000p\u03a6\u0001\u0000"+
		"\u0000\u0000r\u03ac\u0001\u0000\u0000\u0000t\u03ae\u0001\u0000\u0000\u0000"+
		"v\u03b6\u0001\u0000\u0000\u0000x\u03be\u0001\u0000\u0000\u0000z\u03c6"+
		"\u0001\u0000\u0000\u0000|\u03db\u0001\u0000\u0000\u0000~\u03f1\u0001\u0000"+
		"\u0000\u0000\u0080\u03f5\u0001\u0000\u0000\u0000\u0082\u03f7\u0001\u0000"+
		"\u0000\u0000\u0084\u03fe\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0002"+
		"\u0001\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008d\u0003\u0004"+
		"\u0002\u0000\u008a\u008e\u0003\n\u0005\u0000\u008b\u008e\u0003\f\u0006"+
		"\u0000\u008c\u008e\u0003\b\u0004\u0000\u008d\u008a\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u0001\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0001\u0000\u0000"+
		"\u0090\u0092\u0003\u0080@\u0000\u0091\u0093\u0005M\u0000\u0000\u0092\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0003"+
		"\u0001\u0000\u0000\u0000\u0096\u0098\u0003\u0006\u0003\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0005"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005\u0002\u0000\u0000\u009d\u00a0\u0003\u0080@\u0000\u009e\u009f\u0005"+
		"\u001d\u0000\u0000\u009f\u00a1\u0003\u0080@\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a4\u0005M\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u0007\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005\u0003\u0000\u0000\u00a8\u00ad\u0003\u0080@\u0000"+
		"\u00a9\u00aa\u0005\u0004\u0000\u0000\u00aa\u00ac\u0003\u0080@\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b2\u0005M\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00a7"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003\u000e\u0007\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bc\u0003\u0010\b\u0000\u00bb\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\t\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bf\u00038\u001c\u0000\u00be\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c9\u0003N\'\u0000"+
		"\u00c4\u00c6\u0005F\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00ca\u0005E\u0000\u0000\u00c8\u00ca\u0005H\u0000\u0000\u00c9\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00d5\u0003\u0080@\u0000\u00cc\u00cd\u0005\u0005"+
		"\u0000\u0000\u00cd\u00d2\u0003\u0080@\u0000\u00ce\u00cf\u0005\u0004\u0000"+
		"\u0000\u00cf\u00d1\u0003\u0080@\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u00db\u0005\u0006\u0000\u0000\u00d8\u00da\u0005M\u0000\u0000\u00d9"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de"+
		"\u00e0\u0003\u000e\u0007\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e4\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e3\u0005M\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0007\u0000\u0000\u00e8\u000b"+
		"\u0001\u0000\u0000\u0000\u00e9\u00eb\u00038\u001c\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003"+
		"N\'\u0000\u00f0\u00f1\u0005G\u0000\u0000\u00f1\u00fb\u0003\u0080@\u0000"+
		"\u00f2\u00f3\u0005\u0005\u0000\u0000\u00f3\u00f8\u0003\u0080@\u0000\u00f4"+
		"\u00f5\u0005\u0004\u0000\u0000\u00f5\u00f7\u0003\u0080@\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f2"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fd\u0101\u0005\u0006\u0000\u0000\u00fe\u0100"+
		"\u0005M\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0103\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0104\u0106\u0003\u000e\u0007\u0000\u0105\u0104\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u010a\u0001"+
		"\u0000\u0000\u0000\u0107\u0109\u0005M\u0000\u0000\u0108\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0007"+
		"\u0000\u0000\u010e\r\u0001\u0000\u0000\u0000\u010f\u0113\u0003(\u0014"+
		"\u0000\u0110\u0113\u0003 \u0010\u0000\u0111\u0113\u0003\"\u0011\u0000"+
		"\u0112\u010f\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000"+
		"\u0114\u0116\u0005M\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119"+
		"\u0112\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u000f\u0001\u0000\u0000\u0000\u011d\u011f\u0003\u0012\t\u0000\u011e\u011d"+
		"\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0011"+
		"\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0128"+
		"\u0003(\u0014\u0000\u0124\u0128\u0003\u0018\f\u0000\u0125\u0128\u0003"+
		"`0\u0000\u0126\u0128\u0003:\u001d\u0000\u0127\u0123\u0001\u0000\u0000"+
		"\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u012f\u0001\u0000\u0000"+
		"\u0000\u0129\u012b\u0005M\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000"+
		"\u012e\u0130\u0005\u0000\u0000\u0001\u012f\u012a\u0001\u0000\u0000\u0000"+
		"\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0013\u0001\u0000\u0000\u0000"+
		"\u0131\u0139\u0003\u0016\u000b\u0000\u0132\u0139\u0005L\u0000\u0000\u0133"+
		"\u0139\u0003d2\u0000\u0134\u0139\u0003r9\u0000\u0135\u0139\u0003\u0080"+
		"@\u0000\u0136\u0139\u0003R)\u0000\u0137\u0139\u0003\u001c\u000e\u0000"+
		"\u0138\u0131\u0001\u0000\u0000\u0000\u0138\u0132\u0001\u0000\u0000\u0000"+
		"\u0138\u0133\u0001\u0000\u0000\u0000\u0138\u0134\u0001\u0000\u0000\u0000"+
		"\u0138\u0135\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000"+
		"\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u0015\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0007\u0000\u0000\u0000\u013b\u0017\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0003\u001a\r\u0000\u013d\u013e\u0005\b\u0000\u0000\u013e"+
		"\u013f\u0003\u0014\n\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u0142"+
		"\u0003~?\u0000\u0141\u013c\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000"+
		"\u0000\u0000\u0142\u0019\u0001\u0000\u0000\u0000\u0143\u0146\u0005K\u0000"+
		"\u0000\u0144\u0145\u0005\t\u0000\u0000\u0145\u0147\u0003\u001a\r\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000"+
		"\u0147\u001b\u0001\u0000\u0000\u0000\u0148\u014a\u0003\u001a\r\u0000\u0149"+
		"\u014b\u0003\u001e\u000f\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0001\u0000\u0000\u0000\u014d\u001d\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0005\n\u0000\u0000\u014f\u0150\u0003r9\u0000\u0150\u0151\u0005"+
		"\u000b\u0000\u0000\u0151\u001f\u0001\u0000\u0000\u0000\u0152\u0154\u0003"+
		"8\u001c\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000"+
		"\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000"+
		"\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0158\u015a\u0003N\'\u0000\u0159\u015b\u0005F\u0000\u0000"+
		"\u015a\u0159\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0005\f\u0000\u0000\u015d"+
		"\u015e\u0003\u0080@\u0000\u015e\u0160\u0005\r\u0000\u0000\u015f\u0161"+
		"\u0003$\u0012\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0160\u0161\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0005"+
		"\u000e\u0000\u0000\u0163\u0164\u0005\u0005\u0000\u0000\u0164\u0165\u0003"+
		"P(\u0000\u0165\u0169\u0005\u0006\u0000\u0000\u0166\u0168\u0005M\u0000"+
		"\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000"+
		"\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000"+
		"\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016c\u0170\u0003\u0010\b\u0000\u016d\u016f\u0005M\u0000\u0000"+
		"\u016e\u016d\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000"+
		"\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000"+
		"\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0005\u0007\u0000\u0000\u0174!\u0001\u0000\u0000\u0000\u0175"+
		"\u0177\u00038\u001c\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u017a"+
		"\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179"+
		"\u0001\u0000\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u0178"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0003N\'\u0000\u017c\u017d\u0005"+
		"\u000f\u0000\u0000\u017d\u017e\u0003\u0080@\u0000\u017e\u0180\u0005\r"+
		"\u0000\u0000\u017f\u0181\u0003$\u0012\u0000\u0180\u017f\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0005\u000e\u0000\u0000\u0183\u0187\u0005\u0006\u0000"+
		"\u0000\u0184\u0186\u0005M\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000"+
		"\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000"+
		"\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018e\u0003\u0010\b\u0000\u018b"+
		"\u018d\u0005M\u0000\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018d\u0190"+
		"\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0001\u0000\u0000\u0000\u018f\u0191\u0001\u0000\u0000\u0000\u0190\u018e"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u0005\u0007\u0000\u0000\u0192#\u0001"+
		"\u0000\u0000\u0000\u0193\u0198\u0003&\u0013\u0000\u0194\u0195\u0005\u0004"+
		"\u0000\u0000\u0195\u0197\u0003&\u0013\u0000\u0196\u0194\u0001\u0000\u0000"+
		"\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199%\u0001\u0000\u0000\u0000"+
		"\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019d\u00038\u001c\u0000\u019c"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0003\u0080@\u0000\u01a2\u01a3\u0005\u0005\u0000\u0000\u01a3\u01a6"+
		"\u0003P(\u0000\u01a4\u01a5\u0005\b\u0000\u0000\u01a5\u01a7\u0003\u0014"+
		"\n\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7\'\u0001\u0000\u0000\u0000\u01a8\u01aa\u00038\u001c\u0000"+
		"\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000"+
		"\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ae\u01b1\u00030\u0018\u0000\u01af\u01b1\u0003*\u0015\u0000\u01b0\u01ab"+
		"\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1)\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b5\u0003N\'\u0000\u01b3\u01b6\u0003,\u0016"+
		"\u0000\u01b4\u01b6\u0003.\u0017\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6+\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0005\u0010\u0000\u0000\u01b8\u01b9\u0003\u0080@\u0000\u01b9\u01ba"+
		"\u0005\u0005\u0000\u0000\u01ba\u01bb\u0003P(\u0000\u01bb\u01bc\u0005\b"+
		"\u0000\u0000\u01bc\u01bd\u0003\u0014\n\u0000\u01bd-\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0005\u0010\u0000\u0000\u01bf\u01c0\u0003\u0080@\u0000"+
		"\u01c0\u01c1\u0005\b\u0000\u0000\u01c1\u01c2\u0003\u0014\n\u0000\u01c2"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\u0004\u0000\u0000\u01c4"+
		"\u01c5\u0003\u0080@\u0000\u01c5\u01c6\u0005\b\u0000\u0000\u01c6\u01c7"+
		"\u0003\u0014\n\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0005\u0005\u0000\u0000\u01cd\u01ce\u0003"+
		"P(\u0000\u01ce/\u0001\u0000\u0000\u0000\u01cf\u01d2\u0003N\'\u0000\u01d0"+
		"\u01d3\u00032\u0019\u0000\u01d1\u01d3\u00034\u001a\u0000\u01d2\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d31\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u0005\u0011\u0000\u0000\u01d5\u01d6\u0003\u0080"+
		"@\u0000\u01d6\u01d7\u0005\u0005\u0000\u0000\u01d7\u01da\u0003P(\u0000"+
		"\u01d8\u01d9\u0005\b\u0000\u0000\u01d9\u01db\u0003\u0014\n\u0000\u01da"+
		"\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db"+
		"3\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005\u0011\u0000\u0000\u01dd\u01e0"+
		"\u00036\u001b\u0000\u01de\u01df\u0005\u0004\u0000\u0000\u01df\u01e1\u0003"+
		"6\u001b\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u0005"+
		"\u0000\u0000\u01e5\u01e6\u0003P(\u0000\u01e65\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0003\u0080@\u0000\u01e8\u01e9\u0005\b\u0000\u0000\u01e9"+
		"\u01ea\u0003\u0014\n\u0000\u01ea7\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0005\u0012\u0000\u0000\u01ec\u01f2\u0003\u0080@\u0000\u01ed\u01ef\u0005"+
		"\r\u0000\u0000\u01ee\u01f0\u0003Z-\u0000\u01ef\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f3\u0005\u000e\u0000\u0000\u01f2\u01ed\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f6\u0005M\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f89\u0001\u0000\u0000\u0000\u01f9"+
		"\u01f7\u0001\u0000\u0000\u0000\u01fa\u0202\u0003D\"\u0000\u01fb\u0202"+
		"\u0003>\u001f\u0000\u01fc\u0202\u0003J%\u0000\u01fd\u0202\u0003L&\u0000"+
		"\u01fe\u0202\u0003<\u001e\u0000\u01ff\u0202\u0003H$\u0000\u0200\u0202"+
		"\u0003B!\u0000\u0201\u01fa\u0001\u0000\u0000\u0000\u0201\u01fb\u0001\u0000"+
		"\u0000\u0000\u0201\u01fc\u0001\u0000\u0000\u0000\u0201\u01fd\u0001\u0000"+
		"\u0000\u0000\u0201\u01fe\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000"+
		"\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202;\u0001\u0000\u0000"+
		"\u0000\u0203\u0205\u0005\u0013\u0000\u0000\u0204\u0206\u0003\u0014\n\u0000"+
		"\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000"+
		"\u0206=\u0001\u0000\u0000\u0000\u0207\u0208\u0005!\u0000\u0000\u0208\u0209"+
		"\u0005\r\u0000\u0000\u0209\u020a\u0003\u0014\n\u0000\u020a\u020e\u0005"+
		"\u000e\u0000\u0000\u020b\u020d\u0005M\u0000\u0000\u020c\u020b\u0001\u0000"+
		"\u0000\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000"+
		"\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0211\u0001\u0000"+
		"\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0215\u0005\u0006"+
		"\u0000\u0000\u0212\u0214\u0005M\u0000\u0000\u0213\u0212\u0001\u0000\u0000"+
		"\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000\u0000"+
		"\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218\u021a\u0003@ \u0000\u0219"+
		"\u0218\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b"+
		"\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0005\u0007\u0000\u0000\u021e"+
		"?\u0001\u0000\u0000\u0000\u021f\u0222\u0003\u0014\n\u0000\u0220\u0222"+
		"\u0005\u0014\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0221\u0220"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u023b"+
		"\u0005\u0015\u0000\u0000\u0224\u0228\u0005\u0006\u0000\u0000\u0225\u0227"+
		"\u0005M\u0000\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227\u022a\u0001"+
		"\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001"+
		"\u0000\u0000\u0000\u0229\u022b\u0001\u0000\u0000\u0000\u022a\u0228\u0001"+
		"\u0000\u0000\u0000\u022b\u022f\u0003\u0010\b\u0000\u022c\u022e\u0005M"+
		"\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022e\u0231\u0001\u0000"+
		"\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000"+
		"\u0000\u0000\u0230\u0232\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0005\u0007\u0000\u0000\u0233\u023c\u0001\u0000"+
		"\u0000\u0000\u0234\u0236\u0005M\u0000\u0000\u0235\u0234\u0001\u0000\u0000"+
		"\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000"+
		"\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u023a\u0001\u0000\u0000"+
		"\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023c\u0003\u0012\t\u0000"+
		"\u023b\u0224\u0001\u0000\u0000\u0000\u023b\u0237\u0001\u0000\u0000\u0000"+
		"\u023c\u0240\u0001\u0000\u0000\u0000\u023d\u023f\u0005M\u0000\u0000\u023e"+
		"\u023d\u0001\u0000\u0000\u0000\u023f\u0242\u0001\u0000\u0000\u0000\u0240"+
		"\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241"+
		"A\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0243\u0245"+
		"\u0005\u0016\u0000\u0000\u0244\u0246\u0003\u0018\f\u0000\u0245\u0244\u0001"+
		"\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0258\u0001"+
		"\u0000\u0000\u0000\u0247\u024b\u0005\u0006\u0000\u0000\u0248\u024a\u0005"+
		"M\u0000\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000"+
		"\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000"+
		"\u0000\u0000\u024c\u024e\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000"+
		"\u0000\u0000\u024e\u0252\u0003\u0010\b\u0000\u024f\u0251\u0005M\u0000"+
		"\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000"+
		"\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000"+
		"\u0000\u0253\u0255\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000"+
		"\u0000\u0255\u0256\u0005\u0007\u0000\u0000\u0256\u0259\u0001\u0000\u0000"+
		"\u0000\u0257\u0259\u0003\u0012\t\u0000\u0258\u0247\u0001\u0000\u0000\u0000"+
		"\u0258\u0257\u0001\u0000\u0000\u0000\u0259\u025d\u0001\u0000\u0000\u0000"+
		"\u025a\u025c\u0005M\u0000\u0000\u025b\u025a\u0001\u0000\u0000\u0000\u025c"+
		"\u025f\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0001\u0000\u0000\u0000\u025e\u0260\u0001\u0000\u0000\u0000\u025f"+
		"\u025d\u0001\u0000\u0000\u0000\u0260\u0261\u0005\u0017\u0000\u0000\u0261"+
		"\u0262\u0005\r\u0000\u0000\u0262\u0263\u0003&\u0013\u0000\u0263\u0275"+
		"\u0005\u000e\u0000\u0000\u0264\u0268\u0005\u0006\u0000\u0000\u0265\u0267"+
		"\u0005M\u0000\u0000\u0266\u0265\u0001\u0000\u0000\u0000\u0267\u026a\u0001"+
		"\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0268\u0269\u0001"+
		"\u0000\u0000\u0000\u0269\u026b\u0001\u0000\u0000\u0000\u026a\u0268\u0001"+
		"\u0000\u0000\u0000\u026b\u026f\u0003\u0010\b\u0000\u026c\u026e\u0005M"+
		"\u0000\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026e\u0271\u0001\u0000"+
		"\u0000\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000"+
		"\u0000\u0000\u0270\u0272\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000"+
		"\u0000\u0000\u0272\u0273\u0005\u0007\u0000\u0000\u0273\u0276\u0001\u0000"+
		"\u0000\u0000\u0274\u0276\u0003\u0012\t\u0000\u0275\u0264\u0001\u0000\u0000"+
		"\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0276\u027a\u0001\u0000\u0000"+
		"\u0000\u0277\u0279\u0005M\u0000\u0000\u0278\u0277\u0001\u0000\u0000\u0000"+
		"\u0279\u027c\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u0293\u0001\u0000\u0000\u0000"+
		"\u027c\u027a\u0001\u0000\u0000\u0000\u027d\u028f\u0005\u0018\u0000\u0000"+
		"\u027e\u0282\u0005\u0006\u0000\u0000\u027f\u0281\u0005M\u0000\u0000\u0280"+
		"\u027f\u0001\u0000\u0000\u0000\u0281\u0284\u0001\u0000\u0000\u0000\u0282"+
		"\u0280\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283"+
		"\u0285\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0285"+
		"\u0289\u0003\u0010\b\u0000\u0286\u0288\u0005M\u0000\u0000\u0287\u0286"+
		"\u0001\u0000\u0000\u0000\u0288\u028b\u0001\u0000\u0000\u0000\u0289\u0287"+
		"\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028c"+
		"\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028c\u028d"+
		"\u0005\u0007\u0000\u0000\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u0290"+
		"\u0003\u0012\t\u0000\u028f\u027e\u0001\u0000\u0000\u0000\u028f\u028e\u0001"+
		"\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0292\u0005"+
		"M\u0000\u0000\u0292\u0294\u0001\u0000\u0000\u0000\u0293\u027d\u0001\u0000"+
		"\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294C\u0001\u0000\u0000"+
		"\u0000\u0295\u0296\u0005\u001f\u0000\u0000\u0296\u0297\u0005\r\u0000\u0000"+
		"\u0297\u0298\u0003d2\u0000\u0298\u0299\u0005\u000e\u0000\u0000\u0299\u029c"+
		"\u0003F#\u0000\u029a\u029b\u0005 \u0000\u0000\u029b\u029d\u0003F#\u0000"+
		"\u029c\u029a\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000"+
		"\u029dE\u0001\u0000\u0000\u0000\u029e\u02a0\u0005M\u0000\u0000\u029f\u029e"+
		"\u0001\u0000\u0000\u0000\u02a0\u02a3\u0001\u0000\u0000\u0000\u02a1\u029f"+
		"\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02b5"+
		"\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a4\u02a8"+
		"\u0005\u0006\u0000\u0000\u02a5\u02a7\u0005M\u0000\u0000\u02a6\u02a5\u0001"+
		"\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02ab\u0001"+
		"\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab\u02af\u0003"+
		"\u0010\b\u0000\u02ac\u02ae\u0005M\u0000\u0000\u02ad\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ae\u02b1\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000"+
		"\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b2\u0001\u0000"+
		"\u0000\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005\u0007"+
		"\u0000\u0000\u02b3\u02b6\u0001\u0000\u0000\u0000\u02b4\u02b6\u0003\u0012"+
		"\t\u0000\u02b5\u02a4\u0001\u0000\u0000\u0000\u02b5\u02b4\u0001\u0000\u0000"+
		"\u0000\u02b6G\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005\u0019\u0000\u0000"+
		"\u02b8\u02b9\u0005\r\u0000\u0000\u02b9\u02ba\u0003d2\u0000\u02ba\u02be"+
		"\u0005\u000e\u0000\u0000\u02bb\u02bd\u0005M\u0000\u0000\u02bc\u02bb\u0001"+
		"\u0000\u0000\u0000\u02bd\u02c0\u0001\u0000\u0000\u0000\u02be\u02bc\u0001"+
		"\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02d2\u0001"+
		"\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c1\u02c5\u0005"+
		"\u0006\u0000\u0000\u02c2\u02c4\u0005M\u0000\u0000\u02c3\u02c2\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c7\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c8\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c8\u02cc\u0003\u0010"+
		"\b\u0000\u02c9\u02cb\u0005M\u0000\u0000\u02ca\u02c9\u0001\u0000\u0000"+
		"\u0000\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02cf\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005\u0007\u0000"+
		"\u0000\u02d0\u02d3\u0001\u0000\u0000\u0000\u02d1\u02d3\u0003\u0012\t\u0000"+
		"\u02d2\u02c1\u0001\u0000\u0000\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000"+
		"\u02d3I\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005\u001e\u0000\u0000\u02d5"+
		"\u02d7\u0005\r\u0000\u0000\u02d6\u02d8\u00030\u0018\u0000\u02d7\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02d9"+
		"\u0001\u0000\u0000\u0000\u02d9\u02db\u0005M\u0000\u0000\u02da\u02dc\u0003"+
		"d2\u0000\u02db\u02da\u0001\u0000\u0000\u0000\u02db\u02dc\u0001\u0000\u0000"+
		"\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02df\u0005M\u0000\u0000"+
		"\u02de\u02e0\u0003\u0018\f\u0000\u02df\u02de\u0001\u0000\u0000\u0000\u02df"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e5\u0005\u000e\u0000\u0000\u02e2\u02e4\u0005M\u0000\u0000\u02e3\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e7\u0001\u0000\u0000\u0000\u02e5\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02f3"+
		"\u0001\u0000\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e8\u02ec"+
		"\u0005\u0006\u0000\u0000\u02e9\u02eb\u0005M\u0000\u0000\u02ea\u02e9\u0001"+
		"\u0000\u0000\u0000\u02eb\u02ee\u0001\u0000\u0000\u0000\u02ec\u02ea\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02ef\u0001"+
		"\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ef\u02f0\u0003"+
		"\u0010\b\u0000\u02f0\u02f1\u0005\u0007\u0000\u0000\u02f1\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f2\u02f4\u0003\u0012\t\u0000\u02f3\u02e8\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f4K\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f6\u0005\u001e\u0000\u0000\u02f6\u02f7\u0005\r\u0000\u0000\u02f7"+
		"\u02f8\u0003\u0080@\u0000\u02f8\u02f9\u0005\u0005\u0000\u0000\u02f9\u02fa"+
		"\u0003P(\u0000\u02fa\u02fb\u0005\u0004\u0000\u0000\u02fb\u02fc\u0003\u0014"+
		"\n\u0000\u02fc\u02fd\u0005\u001a\u0000\u0000\u02fd\u02fe\u0003\u0014\n"+
		"\u0000\u02fe\u0302\u0005\u000e\u0000\u0000\u02ff\u0301\u0005M\u0000\u0000"+
		"\u0300\u02ff\u0001\u0000\u0000\u0000\u0301\u0304\u0001\u0000\u0000\u0000"+
		"\u0302\u0300\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000"+
		"\u0303\u0310\u0001\u0000\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000"+
		"\u0305\u0309\u0005\u0006\u0000\u0000\u0306\u0308\u0005M\u0000\u0000\u0307"+
		"\u0306\u0001\u0000\u0000\u0000\u0308\u030b\u0001\u0000\u0000\u0000\u0309"+
		"\u0307\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a"+
		"\u030c\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030c"+
		"\u030d\u0003\u0010\b\u0000\u030d\u030e\u0005\u0007\u0000\u0000\u030e\u0311"+
		"\u0001\u0000\u0000\u0000\u030f\u0311\u0003\u0012\t\u0000\u0310\u0305\u0001"+
		"\u0000\u0000\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0311M\u0001\u0000"+
		"\u0000\u0000\u0312\u0314\u0007\u0001\u0000\u0000\u0313\u0312\u0001\u0000"+
		"\u0000\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0316\u0001\u0000"+
		"\u0000\u0000\u0315\u0317\u00057\u0000\u0000\u0316\u0315\u0001\u0000\u0000"+
		"\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0319\u0001\u0000\u0000"+
		"\u0000\u0318\u031a\u00058\u0000\u0000\u0319\u0318\u0001\u0000\u0000\u0000"+
		"\u0319\u031a\u0001\u0000\u0000\u0000\u031aO\u0001\u0000\u0000\u0000\u031b"+
		"\u031e\u0003R)\u0000\u031c\u031e\u0003T*\u0000\u031d\u031b\u0001\u0000"+
		"\u0000\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031e\u0323\u0001\u0000"+
		"\u0000\u0000\u031f\u0320\u0005\n\u0000\u0000\u0320\u0322\u0005\u000b\u0000"+
		"\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0322\u0325\u0001\u0000\u0000"+
		"\u0000\u0323\u0321\u0001\u0000\u0000\u0000\u0323\u0324\u0001\u0000\u0000"+
		"\u0000\u0324Q\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000"+
		"\u0326\u0329\u0003\u0080@\u0000\u0327\u0329\u0003V+\u0000\u0328\u0326"+
		"\u0001\u0000\u0000\u0000\u0328\u0327\u0001\u0000\u0000\u0000\u0329S\u0001"+
		"\u0000\u0000\u0000\u032a\u0330\u0005\u001b\u0000\u0000\u032b\u0331\u0003"+
		"R)\u0000\u032c\u0331\u0005E\u0000\u0000\u032d\u0331\u0005G\u0000\u0000"+
		"\u032e\u0331\u0005H\u0000\u0000\u032f\u0331\u0005\u001c\u0000\u0000\u0330"+
		"\u032b\u0001\u0000\u0000\u0000\u0330\u032c\u0001\u0000\u0000\u0000\u0330"+
		"\u032d\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0330"+
		"\u032f\u0001\u0000\u0000\u0000\u0331U\u0001\u0000\u0000\u0000\u0332\u033d"+
		"\u0005\"\u0000\u0000\u0333\u033d\u0005#\u0000\u0000\u0334\u033d\u0005"+
		"$\u0000\u0000\u0335\u033d\u0005%\u0000\u0000\u0336\u033d\u0005&\u0000"+
		"\u0000\u0337\u033d\u0005\'\u0000\u0000\u0338\u033d\u0005(\u0000\u0000"+
		"\u0339\u033d\u0005)\u0000\u0000\u033a\u033d\u0005*\u0000\u0000\u033b\u033d"+
		"\u0003X,\u0000\u033c\u0332\u0001\u0000\u0000\u0000\u033c\u0333\u0001\u0000"+
		"\u0000\u0000\u033c\u0334\u0001\u0000\u0000\u0000\u033c\u0335\u0001\u0000"+
		"\u0000\u0000\u033c\u0336\u0001\u0000\u0000\u0000\u033c\u0337\u0001\u0000"+
		"\u0000\u0000\u033c\u0338\u0001\u0000\u0000\u0000\u033c\u0339\u0001\u0000"+
		"\u0000\u0000\u033c\u033a\u0001\u0000\u0000\u0000\u033c\u033b\u0001\u0000"+
		"\u0000\u0000\u033dW\u0001\u0000\u0000\u0000\u033e\u033f\u0007\u0002\u0000"+
		"\u0000\u033fY\u0001\u0000\u0000\u0000\u0340\u0345\u0003\\.\u0000\u0341"+
		"\u0342\u0005\u0004\u0000\u0000\u0342\u0344\u0003\\.\u0000\u0343\u0341"+
		"\u0001\u0000\u0000\u0000\u0344\u0347\u0001\u0000\u0000\u0000\u0345\u0343"+
		"\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346[\u0001"+
		"\u0000\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0348\u0349\u0003"+
		"\u0014\n\u0000\u0349]\u0001\u0000\u0000\u0000\u034a\u034c\u00038\u001c"+
		"\u0000\u034b\u034a\u0001\u0000\u0000\u0000\u034c\u034f\u0001\u0000\u0000"+
		"\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000"+
		"\u0000\u034e\u0353\u0001\u0000\u0000\u0000\u034f\u034d\u0001\u0000\u0000"+
		"\u0000\u0350\u0351\u0003\u001a\r\u0000\u0351\u0352\u0005\t\u0000\u0000"+
		"\u0352\u0354\u0001\u0000\u0000\u0000\u0353\u0350\u0001\u0000\u0000\u0000"+
		"\u0353\u0354\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000"+
		"\u0355\u0356\u0005K\u0000\u0000\u0356\u0358\u0005\r\u0000\u0000\u0357"+
		"\u0359\u0003Z-\u0000\u0358\u0357\u0001\u0000\u0000\u0000\u0358\u0359\u0001"+
		"\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u035b\u0005"+
		"\u000e\u0000\u0000\u035b_\u0001\u0000\u0000\u0000\u035c\u0361\u0003^/"+
		"\u0000\u035d\u035e\u0005\t\u0000\u0000\u035e\u0360\u0003^/\u0000\u035f"+
		"\u035d\u0001\u0000\u0000\u0000\u0360\u0363\u0001\u0000\u0000\u0000\u0361"+
		"\u035f\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362"+
		"a\u0001\u0000\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u0365"+
		"\u0005\u000f\u0000\u0000\u0365\u0366\u0003\u0080@\u0000\u0366\u0368\u0005"+
		"\r\u0000\u0000\u0367\u0369\u0003Z-\u0000\u0368\u0367\u0001\u0000\u0000"+
		"\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000\u0000"+
		"\u0000\u036a\u036b\u0005\u000e\u0000\u0000\u036bc\u0001\u0000\u0000\u0000"+
		"\u036c\u0370\u0003n7\u0000\u036d\u0370\u0003f3\u0000\u036e\u0370\u0003"+
		"p8\u0000\u036f\u036c\u0001\u0000\u0000\u0000\u036f\u036d\u0001\u0000\u0000"+
		"\u0000\u036f\u036e\u0001\u0000\u0000\u0000\u0370e\u0001\u0000\u0000\u0000"+
		"\u0371\u0374\u0003n7\u0000\u0372\u0374\u0003h4\u0000\u0373\u0371\u0001"+
		"\u0000\u0000\u0000\u0373\u0372\u0001\u0000\u0000\u0000\u0374\u037b\u0001"+
		"\u0000\u0000\u0000\u0375\u0379\u0005<\u0000\u0000\u0376\u037a\u0003n7"+
		"\u0000\u0377\u037a\u0003h4\u0000\u0378\u037a\u0003f3\u0000\u0379\u0376"+
		"\u0001\u0000\u0000\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u0378"+
		"\u0001\u0000\u0000\u0000\u037a\u037c\u0001\u0000\u0000\u0000\u037b\u0375"+
		"\u0001\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037cg\u0001"+
		"\u0000\u0000\u0000\u037d\u0380\u0003n7\u0000\u037e\u0380\u0003j5\u0000"+
		"\u037f\u037d\u0001\u0000\u0000\u0000\u037f\u037e\u0001\u0000\u0000\u0000"+
		"\u0380\u0387\u0001\u0000\u0000\u0000\u0381\u0385\u0005;\u0000\u0000\u0382"+
		"\u0386\u0003n7\u0000\u0383\u0386\u0003j5\u0000\u0384\u0386\u0003h4\u0000"+
		"\u0385\u0382\u0001\u0000\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000"+
		"\u0385\u0384\u0001\u0000\u0000\u0000\u0386\u0388\u0001\u0000\u0000\u0000"+
		"\u0387\u0381\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000"+
		"\u0388i\u0001\u0000\u0000\u0000\u0389\u038c\u0003n7\u0000\u038a\u038c"+
		"\u0003l6\u0000\u038b\u0389\u0001\u0000\u0000\u0000\u038b\u038a\u0001\u0000"+
		"\u0000\u0000\u038c\u0393\u0001\u0000\u0000\u0000\u038d\u0391\u0005>\u0000"+
		"\u0000\u038e\u0392\u0003n7\u0000\u038f\u0392\u0003l6\u0000\u0390\u0392"+
		"\u0003j5\u0000\u0391\u038e\u0001\u0000\u0000\u0000\u0391\u038f\u0001\u0000"+
		"\u0000\u0000\u0391\u0390\u0001\u0000\u0000\u0000\u0392\u0394\u0001\u0000"+
		"\u0000\u0000\u0393\u038d\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000"+
		"\u0000\u0000\u0394k\u0001\u0000\u0000\u0000\u0395\u0397\u0005=\u0000\u0000"+
		"\u0396\u0395\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000\u0000"+
		"\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u0399\u0003n7\u0000\u0399m"+
		"\u0001\u0000\u0000\u0000\u039a\u03a5\u0003\u0016\u000b\u0000\u039b\u03a5"+
		"\u0003`0\u0000\u039c\u03a5\u0003\u0080@\u0000\u039d\u03a5\u0003\u001a"+
		"\r\u0000\u039e\u039f\u0005\r\u0000\u0000\u039f\u03a0\u0003d2\u0000\u03a0"+
		"\u03a1\u0005\u000e\u0000\u0000\u03a1\u03a5\u0001\u0000\u0000\u0000\u03a2"+
		"\u03a5\u0003b1\u0000\u03a3\u03a5\u0003\u001c\u000e\u0000\u03a4\u039a\u0001"+
		"\u0000\u0000\u0000\u03a4\u039b\u0001\u0000\u0000\u0000\u03a4\u039c\u0001"+
		"\u0000\u0000\u0000\u03a4\u039d\u0001\u0000\u0000\u0000\u03a4\u039e\u0001"+
		"\u0000\u0000\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a4\u03a3\u0001"+
		"\u0000\u0000\u0000\u03a5o\u0001\u0000\u0000\u0000\u03a6\u03a7\u0003r9"+
		"\u0000\u03a7\u03a8\u0007\u0003\u0000\u0000\u03a8\u03a9\u0003r9\u0000\u03a9"+
		"q\u0001\u0000\u0000\u0000\u03aa\u03ad\u0003|>\u0000\u03ab\u03ad\u0003"+
		"t:\u0000\u03ac\u03aa\u0001\u0000\u0000\u0000\u03ac\u03ab\u0001\u0000\u0000"+
		"\u0000\u03ads\u0001\u0000\u0000\u0000\u03ae\u03b4\u0003v;\u0000\u03af"+
		"\u03b2\u0007\u0004\u0000\u0000\u03b0\u03b3\u0003|>\u0000\u03b1\u03b3\u0003"+
		"t:\u0000\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b2\u03b1\u0001\u0000\u0000"+
		"\u0000\u03b3\u03b5\u0001\u0000\u0000\u0000\u03b4\u03af\u0001\u0000\u0000"+
		"\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5u\u0001\u0000\u0000\u0000"+
		"\u03b6\u03bc\u0003x<\u0000\u03b7\u03ba\u0007\u0005\u0000\u0000\u03b8\u03bb"+
		"\u0003|>\u0000\u03b9\u03bb\u0003v;\u0000\u03ba\u03b8\u0001\u0000\u0000"+
		"\u0000\u03ba\u03b9\u0001\u0000\u0000\u0000\u03bb\u03bd\u0001\u0000\u0000"+
		"\u0000\u03bc\u03b7\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000"+
		"\u0000\u03bdw\u0001\u0000\u0000\u0000\u03be\u03c4\u0003z=\u0000\u03bf"+
		"\u03c2\u0007\u0006\u0000\u0000\u03c0\u03c3\u0003|>\u0000\u03c1\u03c3\u0003"+
		"x<\u0000\u03c2\u03c0\u0001\u0000\u0000\u0000\u03c2\u03c1\u0001\u0000\u0000"+
		"\u0000\u03c3\u03c5\u0001\u0000\u0000\u0000\u03c4\u03bf\u0001\u0000\u0000"+
		"\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5y\u0001\u0000\u0000\u0000"+
		"\u03c6\u03cc\u0003|>\u0000\u03c7\u03ca\u00053\u0000\u0000\u03c8\u03cb"+
		"\u0003|>\u0000\u03c9\u03cb\u0003z=\u0000\u03ca\u03c8\u0001\u0000\u0000"+
		"\u0000\u03ca\u03c9\u0001\u0000\u0000\u0000\u03cb\u03cd\u0001\u0000\u0000"+
		"\u0000\u03cc\u03c7\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000"+
		"\u0000\u03cd{\u0001\u0000\u0000\u0000\u03ce\u03d0\u0007\u0004\u0000\u0000"+
		"\u03cf\u03ce\u0001\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000"+
		"\u03d0\u03d8\u0001\u0000\u0000\u0000\u03d1\u03d9\u0003`0\u0000\u03d2\u03d9"+
		"\u0003\u0080@\u0000\u03d3\u03d9\u0003\u0084B\u0000\u03d4\u03d5\u0005\r"+
		"\u0000\u0000\u03d5\u03d6\u0003r9\u0000\u03d6\u03d7\u0005\u000e\u0000\u0000"+
		"\u03d7\u03d9\u0001\u0000\u0000\u0000\u03d8\u03d1\u0001\u0000\u0000\u0000"+
		"\u03d8\u03d2\u0001\u0000\u0000\u0000\u03d8\u03d3\u0001\u0000\u0000\u0000"+
		"\u03d8\u03d4\u0001\u0000\u0000\u0000\u03d9\u03dc\u0001\u0000\u0000\u0000"+
		"\u03da\u03dc\u0003~?\u0000\u03db\u03cf\u0001\u0000\u0000\u0000\u03db\u03da"+
		"\u0001\u0000\u0000\u0000\u03dc}\u0001\u0000\u0000\u0000\u03dd\u03de\u0005"+
		"/\u0000\u0000\u03de\u03e2\u0005/\u0000\u0000\u03df\u03e0\u00050\u0000"+
		"\u0000\u03e0\u03e2\u00050\u0000\u0000\u03e1\u03dd\u0001\u0000\u0000\u0000"+
		"\u03e1\u03df\u0001\u0000\u0000\u0000\u03e2\u03e5\u0001\u0000\u0000\u0000"+
		"\u03e3\u03e6\u0003\u0080@\u0000\u03e4\u03e6\u0003\u001a\r\u0000\u03e5"+
		"\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000\u03e6"+
		"\u03f2\u0001\u0000\u0000\u0000\u03e7\u03ea\u0003\u0080@\u0000\u03e8\u03ea"+
		"\u0003\u001a\r\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000\u03e9\u03e8\u0001"+
		"\u0000\u0000\u0000\u03ea\u03ef\u0001\u0000\u0000\u0000\u03eb\u03ec\u0005"+
		"/\u0000\u0000\u03ec\u03f0\u0005/\u0000\u0000\u03ed\u03ee\u00050\u0000"+
		"\u0000\u03ee\u03f0\u00050\u0000\u0000\u03ef\u03eb\u0001\u0000\u0000\u0000"+
		"\u03ef\u03ed\u0001\u0000\u0000\u0000\u03f0\u03f2\u0001\u0000\u0000\u0000"+
		"\u03f1\u03e1\u0001\u0000\u0000\u0000\u03f1\u03e9\u0001\u0000\u0000\u0000"+
		"\u03f2\u007f\u0001\u0000\u0000\u0000\u03f3\u03f6\u0003\u0082A\u0000\u03f4"+
		"\u03f6\u0005K\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f5\u03f4"+
		"\u0001\u0000\u0000\u0000\u03f6\u0081\u0001\u0000\u0000\u0000\u03f7\u03fa"+
		"\u0005K\u0000\u0000\u03f8\u03f9\u0005\t\u0000\u0000\u03f9\u03fb\u0005"+
		"K\u0000\u0000\u03fa\u03f8\u0001\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000"+
		"\u0000\u0000\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000"+
		"\u0000\u0000\u03fd\u0083\u0001\u0000\u0000\u0000\u03fe\u03ff\u0007\u0007"+
		"\u0000\u0000\u03ff\u0085\u0001\u0000\u0000\u0000\u0091\u0087\u008d\u0094"+
		"\u0099\u00a0\u00a5\u00ad\u00b3\u00b5\u00b8\u00bb\u00c0\u00c5\u00c9\u00d2"+
		"\u00d5\u00db\u00df\u00e4\u00ec\u00f8\u00fb\u0101\u0105\u010a\u0112\u0117"+
		"\u011b\u0120\u0127\u012c\u012f\u0138\u0141\u0146\u014c\u0155\u015a\u0160"+
		"\u0169\u0170\u0178\u0180\u0187\u018e\u0198\u019e\u01a6\u01ab\u01b0\u01b5"+
		"\u01ca\u01d2\u01da\u01e2\u01ef\u01f2\u01f7\u0201\u0205\u020e\u0215\u021b"+
		"\u0221\u0228\u022f\u0237\u023b\u0240\u0245\u024b\u0252\u0258\u025d\u0268"+
		"\u026f\u0275\u027a\u0282\u0289\u028f\u0293\u029c\u02a1\u02a8\u02af\u02b5"+
		"\u02be\u02c5\u02cc\u02d2\u02d7\u02db\u02df\u02e5\u02ec\u02f3\u0302\u0309"+
		"\u0310\u0313\u0316\u0319\u031d\u0323\u0328\u0330\u033c\u0345\u034d\u0353"+
		"\u0358\u0361\u0368\u036f\u0373\u0379\u037b\u037f\u0385\u0387\u038b\u0391"+
		"\u0393\u0396\u03a4\u03ac\u03b2\u03b4\u03ba\u03bc\u03c2\u03c4\u03ca\u03cc"+
		"\u03cf\u03d8\u03db\u03e1\u03e5\u03e9\u03ef\u03f1\u03f5\u03fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}