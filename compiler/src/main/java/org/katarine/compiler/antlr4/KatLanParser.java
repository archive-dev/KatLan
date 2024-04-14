// Generated from C:/Users/Egor/Documents/Java/gdx/KatLan/compiler/src/main/resources/KatLan.g4 by ANTLR 4.13.1
package org.katarine.compiler.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		T__24=25, T__25=26, AS_KEYWORD=27, FOR_KEYWORD=28, IF_KEYWORD=29, ELSE_KEYWORD=30, 
		SWITCH_KEYWORD=31, STR=32, BOOL=33, INT=34, FLOAT=35, DOUBLE=36, LONG=37, 
		SHORT=38, BYTE=39, OBJ=40, VOID=41, NULL=42, DIV=43, MOD=44, PLUS=45, 
		MINUS=46, MULTIPLY=47, DIVIDE=48, POWER=49, PUBLIC=50, PRIVATE=51, PROTECTED=52, 
		STATIC=53, FINAL=54, TRUE=55, FALSE=56, AND=57, OR=58, NOT=59, XOR=60, 
		BT=61, LT=62, EQ=63, NE=64, LE=65, BE=66, CLASS_KEYWORD=67, ABSTRACT_KEYWORD=68, 
		INTERFACE_KEYWORD=69, ENUM_KEYWORD=70, INT_VAL=71, FLOAT_VAL=72, NAME0=73, 
		STRING_VAL=74, ENDLINE=75, WS=76, COMMENT=77;
	public static final int
		RULE_class = 0, RULE_package = 1, RULE_importBlock = 2, RULE_importStatement = 3, 
		RULE_unnamedClassDef = 4, RULE_classDef = 5, RULE_interfaceDef = 6, RULE_classBlock = 7, 
		RULE_block = 8, RULE_lineBlock = 9, RULE_value = 10, RULE_bool = 11, RULE_varAssignment = 12, 
		RULE_varAccess = 13, RULE_arrayAccess = 14, RULE_arrayAccess0 = 15, RULE_methodDef = 16, 
		RULE_constructorDef = 17, RULE_parameters = 18, RULE_parameter = 19, RULE_var = 20, 
		RULE_constDef = 21, RULE_constDef0 = 22, RULE_constDef1 = 23, RULE_varDef = 24, 
		RULE_varDef0 = 25, RULE_varDef1 = 26, RULE_subVD1 = 27, RULE_statement = 28, 
		RULE_returnStatement = 29, RULE_switchStatement = 30, RULE_tryCatchFinally = 31, 
		RULE_ifStatement = 32, RULE_ifStatement0 = 33, RULE_whileLoopStatement = 34, 
		RULE_foriLoop = 35, RULE_foriLoop0 = 36, RULE_access = 37, RULE_type = 38, 
		RULE_anyType = 39, RULE_linkType = 40, RULE_primitiveType = 41, RULE_nullType = 42, 
		RULE_arguments = 43, RULE_argument = 44, RULE_methodCall0 = 45, RULE_methodCall = 46, 
		RULE_constructorCall = 47, RULE_expression = 48, RULE_logicalOr = 49, 
		RULE_logicalAnd = 50, RULE_logicalXor = 51, RULE_logicalNot = 52, RULE_primaryExpresion = 53, 
		RULE_arithCondExpression = 54, RULE_arithmeticExpression = 55, RULE_addSubExpression = 56, 
		RULE_modDivExpression = 57, RULE_mulDivExpression = 58, RULE_powerExpression = 59, 
		RULE_numberExpression = 60, RULE_incrExpression = 61, RULE_name = 62, 
		RULE_dot_name = 63, RULE_numeric_value = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"class", "package", "importBlock", "importStatement", "unnamedClassDef", 
			"classDef", "interfaceDef", "classBlock", "block", "lineBlock", "value", 
			"bool", "varAssignment", "varAccess", "arrayAccess", "arrayAccess0", 
			"methodDef", "constructorDef", "parameters", "parameter", "var", "constDef", 
			"constDef0", "constDef1", "varDef", "varDef0", "varDef1", "subVD1", "statement", 
			"returnStatement", "switchStatement", "tryCatchFinally", "ifStatement", 
			"ifStatement0", "whileLoopStatement", "foriLoop", "foriLoop0", "access", 
			"type", "anyType", "linkType", "primitiveType", "nullType", "arguments", 
			"argument", "methodCall0", "methodCall", "constructorCall", "expression", 
			"logicalOr", "logicalAnd", "logicalXor", "logicalNot", "primaryExpresion", 
			"arithCondExpression", "arithmeticExpression", "addSubExpression", "modDivExpression", 
			"mulDivExpression", "powerExpression", "numberExpression", "incrExpression", 
			"name", "dot_name", "numeric_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'import'", "'extends'", "','", "':'", "'{'", "'}'", 
			"'='", "'.'", "'['", "']'", "'def'", "'('", "')'", "'const'", "'var'", 
			"'return'", "'default'", "'->'", "'try'", "'catch'", "'finally'", "'while'", 
			"'..'", "'@'", "'new'", "'as'", "'for'", "'if'", "'else'", "'switch'", 
			"'str'", "'bool'", "'int'", "'float'", "'double'", "'long'", "'short'", 
			"'byte'", "'obj'", "'void'", "'null'", "'div'", "'%'", "'+'", "'-'", 
			"'*'", "'/'", "'**'", null, null, null, "'static'", null, "'true'", "'false'", 
			null, null, null, null, "'>'", "'<'", "'=='", "'!='", "'<='", "'>='", 
			"'class'", "'abstract'", "'interface'", "'enum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "AS_KEYWORD", "FOR_KEYWORD", "IF_KEYWORD", "ELSE_KEYWORD", 
			"SWITCH_KEYWORD", "STR", "BOOL", "INT", "FLOAT", "DOUBLE", "LONG", "SHORT", 
			"BYTE", "OBJ", "VOID", "NULL", "DIV", "MOD", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "POWER", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL", 
			"TRUE", "FALSE", "AND", "OR", "NOT", "XOR", "BT", "LT", "EQ", "NE", "LE", 
			"BE", "CLASS_KEYWORD", "ABSTRACT_KEYWORD", "INTERFACE_KEYWORD", "ENUM_KEYWORD", 
			"INT_VAL", "FLOAT_VAL", "NAME0", "STRING_VAL", "ENDLINE", "WS", "COMMENT"
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
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(130);
				package_();
				}
			}

			setState(133);
			importBlock();
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(134);
				classDef();
				}
				break;
			case 2:
				{
				setState(135);
				interfaceDef();
				}
				break;
			case 3:
				{
				setState(136);
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
			setState(139);
			match(T__0);
			setState(140);
			name();
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				match(ENDLINE);
				}
				}
				setState(144); 
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
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(146);
				importStatement();
				}
				}
				setState(151);
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
			setState(152);
			match(T__1);
			setState(153);
			name();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_KEYWORD) {
				{
				setState(154);
				match(AS_KEYWORD);
				setState(155);
				name();
				}
			}

			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				match(ENDLINE);
				}
				}
				setState(161); 
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
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(163);
				match(T__2);
				setState(164);
				name();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(165);
					match(T__3);
					setState(166);
					name();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(172);
					match(ENDLINE);
					}
					}
					setState(175); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ENDLINE );
				}
			}

			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(179);
				classBlock();
				}
				break;
			}
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(182);
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
			setState(185);
			access();
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_KEYWORD:
			case ABSTRACT_KEYWORD:
				{
				{
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABSTRACT_KEYWORD) {
					{
					setState(186);
					match(ABSTRACT_KEYWORD);
					}
				}

				setState(189);
				match(CLASS_KEYWORD);
				}
				}
				break;
			case ENUM_KEYWORD:
				{
				setState(190);
				match(ENUM_KEYWORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(193);
			name();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(194);
				match(T__4);
				setState(195);
				name();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(196);
					match(T__3);
					setState(197);
					name();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(205);
			match(T__5);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					match(ENDLINE);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & 72066115253043225L) != 0)) {
				{
				setState(212);
				classBlock();
				}
			}

			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(215);
				match(ENDLINE);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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
			setState(223);
			access();
			setState(224);
			match(INTERFACE_KEYWORD);
			setState(225);
			name();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(226);
				match(T__4);
				setState(227);
				name();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(228);
					match(T__3);
					setState(229);
					name();
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(237);
			match(T__5);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					match(ENDLINE);
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & 72066115253043225L) != 0)) {
				{
				setState(244);
				classBlock();
				}
			}

			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(247);
				match(ENDLINE);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
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
			setState(265); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(255);
						var();
						}
						break;
					case 2:
						{
						setState(256);
						methodDef();
						}
						break;
					case 3:
						{
						setState(257);
						constructorDef();
						}
						break;
					}
					setState(261); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(260);
							match(ENDLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(263); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(267); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & 288231444524917031L) != 0)) {
				{
				{
				setState(269);
				lineBlock();
				}
				}
				setState(274);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(275);
				var();
				}
				break;
			case 2:
				{
				setState(276);
				varAssignment();
				}
				break;
			case 3:
				{
				setState(277);
				methodCall();
				}
				break;
			case 4:
				{
				setState(278);
				statement();
				}
				break;
			}
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDLINE:
				{
				setState(282); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(281);
						match(ENDLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(284); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(286);
				match(EOF);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_VAL() { return getToken(KatLanParser.STRING_VAL, 0); }
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
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				arithmeticExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				match(STRING_VAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				anyType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(295);
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
			setState(298);
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
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(300);
				varAccess();
				setState(301);
				match(T__7);
				setState(302);
				value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
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
			setState(307);
			match(NAME0);
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(308);
				match(T__8);
				setState(309);
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
			setState(312);
			varAccess();
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(313);
				arrayAccess0();
				}
				}
				setState(316); 
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
			setState(318);
			match(T__9);
			setState(319);
			arithmeticExpression();
			setState(320);
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
			setState(322);
			access();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT_KEYWORD) {
				{
				setState(323);
				match(ABSTRACT_KEYWORD);
				}
			}

			setState(326);
			match(T__11);
			setState(327);
			name();
			setState(328);
			match(T__12);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME0) {
				{
				setState(329);
				parameters();
				}
			}

			setState(332);
			match(T__13);
			setState(333);
			match(T__4);
			setState(334);
			type();
			setState(335);
			match(T__5);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(336);
					match(ENDLINE);
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(342);
			block();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(343);
				match(ENDLINE);
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
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
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			access();
			setState(352);
			match(T__11);
			setState(353);
			name();
			setState(354);
			match(T__12);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME0) {
				{
				setState(355);
				parameters();
				}
			}

			setState(358);
			match(T__13);
			setState(359);
			match(T__5);
			setState(360);
			block();
			setState(361);
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
			setState(363);
			parameter();
			}
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(364);
				match(T__3);
				setState(365);
				parameter();
				}
				}
				setState(370);
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
			setState(371);
			name();
			setState(372);
			match(T__4);
			setState(373);
			type();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(374);
				match(T__7);
				setState(375);
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
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
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
			setState(382);
			access();
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(383);
				constDef0();
				}
				break;
			case 2:
				{
				setState(384);
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
			setState(387);
			match(T__14);
			setState(388);
			name();
			setState(389);
			match(T__4);
			setState(390);
			type();
			setState(391);
			match(T__7);
			setState(392);
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
			setState(394);
			match(T__14);
			{
			setState(395);
			name();
			setState(396);
			match(T__7);
			setState(397);
			value();
			}
			setState(404); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(399);
				match(T__3);
				setState(400);
				name();
				setState(401);
				match(T__7);
				setState(402);
				value();
				}
				}
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(408);
			match(T__4);
			setState(409);
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
			setState(411);
			access();
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(412);
				varDef0();
				}
				break;
			case 2:
				{
				setState(413);
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
			setState(416);
			match(T__15);
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
			setState(424);
			match(T__15);
			setState(425);
			subVD1();
			setState(428); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(426);
				match(T__3);
				setState(427);
				subVD1();
				}
				}
				setState(430); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(432);
			match(T__4);
			setState(433);
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
			setState(435);
			name();
			{
			setState(436);
			match(T__7);
			setState(437);
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
		enterRule(_localctx, 56, RULE_statement);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				switchStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				foriLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				foriLoop0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
				whileLoopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(445);
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
		enterRule(_localctx, 58, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__16);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 4323539219117514753L) != 0)) {
				{
				setState(449);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public List<LineBlockContext> lineBlock() {
			return getRuleContexts(LineBlockContext.class);
		}
		public LineBlockContext lineBlock(int i) {
			return getRuleContext(LineBlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
		enterRule(_localctx, 60, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(SWITCH_KEYWORD);
			setState(453);
			match(T__12);
			setState(454);
			expression();
			setState(455);
			match(T__13);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(456);
				match(ENDLINE);
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
			match(T__5);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(463);
				match(ENDLINE);
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(487); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(471);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__25:
				case PLUS:
				case MINUS:
				case TRUE:
				case FALSE:
				case NOT:
				case INT_VAL:
				case FLOAT_VAL:
				case NAME0:
					{
					setState(469);
					expression();
					}
					break;
				case T__17:
					{
					setState(470);
					match(T__17);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(473);
				match(T__18);
				setState(479);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					{
					setState(474);
					match(T__5);
					setState(475);
					block();
					setState(476);
					match(T__6);
					}
					}
					break;
				case T__14:
				case T__15:
				case T__16:
				case T__19:
				case T__22:
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
					setState(478);
					lineBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(481);
					match(ENDLINE);
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(489); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 2017696208830603297L) != 0) );
			setState(491);
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
		enterRule(_localctx, 62, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__19);
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(494);
				varAssignment();
				}
				break;
			}
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(497);
				match(T__5);
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(498);
						match(ENDLINE);
						}
						} 
					}
					setState(503);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(504);
				block();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(505);
					match(ENDLINE);
					}
					}
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(511);
				match(T__6);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
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
				setState(513);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(516);
				match(ENDLINE);
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522);
			match(T__20);
			setState(523);
			match(T__12);
			setState(524);
			parameter();
			setState(525);
			match(T__13);
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(526);
				match(T__5);
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(527);
						match(ENDLINE);
						}
						} 
					}
					setState(532);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(533);
				block();
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(534);
					match(ENDLINE);
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(540);
				match(T__6);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
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
				setState(542);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(545);
					match(ENDLINE);
					}
					} 
				}
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(551);
				match(T__21);
				setState(569);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					{
					setState(552);
					match(T__5);
					setState(556);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(553);
							match(ENDLINE);
							}
							} 
						}
						setState(558);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					}
					setState(559);
					block();
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ENDLINE) {
						{
						{
						setState(560);
						match(ENDLINE);
						}
						}
						setState(565);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(566);
					match(T__6);
					}
					}
					break;
				case T__14:
				case T__15:
				case T__16:
				case T__19:
				case T__22:
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
					setState(568);
					lineBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(571);
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
		enterRule(_localctx, 64, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(IF_KEYWORD);
			setState(576);
			match(T__12);
			setState(577);
			expression();
			setState(578);
			match(T__13);
			setState(579);
			ifStatement0();
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KEYWORD) {
				{
				setState(580);
				match(ELSE_KEYWORD);
				setState(581);
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
		enterRule(_localctx, 66, RULE_ifStatement0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(584);
				match(ENDLINE);
				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(590);
				match(T__5);
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(591);
						match(ENDLINE);
						}
						} 
					}
					setState(596);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(597);
				block();
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(598);
					match(ENDLINE);
					}
					}
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(604);
				match(T__6);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
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
				setState(606);
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
		enterRule(_localctx, 68, RULE_whileLoopStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(T__22);
			setState(610);
			match(T__12);
			setState(611);
			expression();
			setState(612);
			match(T__13);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(613);
				match(ENDLINE);
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(619);
				match(T__5);
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(620);
						match(ENDLINE);
						}
						} 
					}
					setState(625);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(626);
				block();
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(627);
					match(ENDLINE);
					}
					}
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(633);
				match(T__6);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
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
				setState(635);
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
		enterRule(_localctx, 70, RULE_foriLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(FOR_KEYWORD);
			setState(639);
			match(T__12);
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902897112186880L) != 0)) {
				{
				setState(640);
				varDef();
				}
			}

			setState(643);
			match(ENDLINE);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 2017696208830603265L) != 0)) {
				{
				setState(644);
				expression();
				}
			}

			setState(647);
			match(ENDLINE);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 268435459L) != 0)) {
				{
				setState(648);
				varAssignment();
				}
			}

			setState(651);
			match(T__13);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(652);
				match(ENDLINE);
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(658);
				match(T__5);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(659);
					match(ENDLINE);
					}
					}
					setState(664);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(665);
				block();
				setState(666);
				match(T__6);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
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
				setState(668);
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
		enterRule(_localctx, 72, RULE_foriLoop0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(FOR_KEYWORD);
			setState(672);
			match(T__12);
			setState(673);
			name();
			setState(674);
			match(T__4);
			setState(675);
			type();
			setState(676);
			match(T__3);
			setState(677);
			value();
			setState(678);
			match(T__23);
			setState(679);
			value();
			setState(680);
			match(T__13);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(681);
				match(ENDLINE);
				}
				}
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(687);
				match(T__5);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(688);
					match(ENDLINE);
					}
					}
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(694);
				block();
				setState(695);
				match(T__6);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
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
				setState(697);
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
		enterRule(_localctx, 74, RULE_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) {
				{
				setState(700);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(703);
				match(STATIC);
				}
			}

			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(706);
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
		enterRule(_localctx, 76, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
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
				setState(709);
				anyType();
				}
				break;
			case T__24:
				{
				setState(710);
				linkType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(713);
				match(T__9);
				setState(714);
				match(T__10);
				}
				}
				setState(719);
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
		enterRule(_localctx, 78, RULE_anyType);
		try {
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME0:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
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
				setState(721);
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
		enterRule(_localctx, 80, RULE_linkType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(T__24);
			setState(729);
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
				setState(725);
				anyType();
				}
				break;
			case CLASS_KEYWORD:
				{
				setState(726);
				match(CLASS_KEYWORD);
				}
				break;
			case INTERFACE_KEYWORD:
				{
				setState(727);
				match(INTERFACE_KEYWORD);
				}
				break;
			case ENUM_KEYWORD:
				{
				setState(728);
				match(ENUM_KEYWORD);
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
		enterRule(_localctx, 82, RULE_primitiveType);
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				match(STR);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				match(BOOL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(733);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(734);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(735);
				match(DOUBLE);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(736);
				match(LONG);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(737);
				match(SHORT);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(738);
				match(BYTE);
				}
				break;
			case OBJ:
				enterOuterAlt(_localctx, 9);
				{
				setState(739);
				match(OBJ);
				}
				break;
			case VOID:
			case NULL:
				enterOuterAlt(_localctx, 10);
				{
				setState(740);
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
		enterRule(_localctx, 84, RULE_nullType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
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
		enterRule(_localctx, 86, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			argument();
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(746);
				match(T__3);
				setState(747);
				argument();
				}
				}
				setState(752);
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
		enterRule(_localctx, 88, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
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
		enterRule(_localctx, 90, RULE_methodCall0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(755);
				varAccess();
				setState(756);
				match(T__8);
				}
				break;
			}
			setState(760);
			match(NAME0);
			setState(761);
			match(T__12);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 4323539219117514753L) != 0)) {
				{
				setState(762);
				arguments();
				}
			}

			setState(765);
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
		enterRule(_localctx, 92, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			methodCall0();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(768);
				match(T__8);
				setState(769);
				methodCall0();
				}
				}
				setState(774);
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
		enterRule(_localctx, 94, RULE_constructorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(T__25);
			setState(776);
			name();
			setState(777);
			match(T__12);
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 4323539219117514753L) != 0)) {
				{
				setState(778);
				arguments();
				}
			}

			setState(781);
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
		enterRule(_localctx, 96, RULE_expression);
		try {
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				primaryExpresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				logicalOr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
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
		enterRule(_localctx, 98, RULE_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(788);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(789);
				logicalAnd();
				}
				break;
			}
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(792);
				match(OR);
				setState(796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(793);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(794);
					logicalAnd();
					}
					break;
				case 3:
					{
					setState(795);
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
		enterRule(_localctx, 100, RULE_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(800);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(801);
				logicalXor();
				}
				break;
			}
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(804);
				match(AND);
				setState(808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(805);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(806);
					logicalXor();
					}
					break;
				case 3:
					{
					setState(807);
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
		enterRule(_localctx, 102, RULE_logicalXor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(812);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(813);
				logicalNot();
				}
				break;
			}
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XOR) {
				{
				setState(816);
				match(XOR);
				setState(820);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(817);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(818);
					logicalNot();
					}
					break;
				case 3:
					{
					setState(819);
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
		enterRule(_localctx, 104, RULE_logicalNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(824);
				match(NOT);
				}
			}

			setState(827);
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
		enterRule(_localctx, 106, RULE_primaryExpresion);
		try {
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(831);
				name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(832);
				varAccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(833);
				match(T__12);
				setState(834);
				expression();
				setState(835);
				match(T__13);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(837);
				constructorCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(838);
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
		enterRule(_localctx, 108, RULE_arithCondExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			arithmeticExpression();
			setState(842);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(843);
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
		enterRule(_localctx, 110, RULE_arithmeticExpression);
		try {
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				numberExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
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
		enterRule(_localctx, 112, RULE_addSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			modDivExpression();
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(850);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(851);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(852);
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
		enterRule(_localctx, 114, RULE_modDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			mulDivExpression();
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIV || _la==MOD) {
				{
				setState(858);
				_la = _input.LA(1);
				if ( !(_la==DIV || _la==MOD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(859);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(860);
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
		enterRule(_localctx, 116, RULE_mulDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			powerExpression();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLY || _la==DIVIDE) {
				{
				setState(866);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(867);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(868);
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
		enterRule(_localctx, 118, RULE_powerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			numberExpression();
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(874);
				match(POWER);
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(875);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(876);
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
		enterRule(_localctx, 120, RULE_numberExpression);
		int _la;
		try {
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(881);
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

				setState(891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(884);
					methodCall();
					}
					break;
				case 2:
					{
					setState(885);
					name();
					}
					break;
				case 3:
					{
					setState(886);
					numeric_value();
					}
					break;
				case 4:
					{
					{
					setState(887);
					match(T__12);
					setState(888);
					arithmeticExpression();
					setState(889);
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
				setState(893);
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
		enterRule(_localctx, 122, RULE_incrExpression);
		try {
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(900);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(896);
					match(PLUS);
					setState(897);
					match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(898);
					match(MINUS);
					setState(899);
					match(MINUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(902);
					name();
					}
					break;
				case 2:
					{
					setState(903);
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
				setState(908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(906);
					name();
					}
					break;
				case 2:
					{
					setState(907);
					varAccess();
					}
					break;
				}
				setState(914);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(910);
					match(PLUS);
					setState(911);
					match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(912);
					match(MINUS);
					setState(913);
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
		enterRule(_localctx, 124, RULE_name);
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				dot_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
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
		enterRule(_localctx, 126, RULE_dot_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(NAME0);
			setState(925); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(923);
				match(T__8);
				setState(924);
				match(NAME0);
				}
				}
				setState(927); 
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
		enterRule(_localctx, 128, RULE_numeric_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
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
		"\u0004\u0001M\u03a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0001"+
		"\u0000\u0003\u0000\u0084\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u008a\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001\u008f\b\u0001\u000b\u0001\f\u0001\u0090\u0001\u0002\u0005\u0002"+
		"\u0094\b\u0002\n\u0002\f\u0002\u0097\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u009d\b\u0003\u0001\u0003\u0004\u0003\u00a0"+
		"\b\u0003\u000b\u0003\f\u0003\u00a1\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00a8\b\u0004\n\u0004\f\u0004\u00ab\t\u0004\u0001"+
		"\u0004\u0004\u0004\u00ae\b\u0004\u000b\u0004\f\u0004\u00af\u0003\u0004"+
		"\u00b2\b\u0004\u0001\u0004\u0003\u0004\u00b5\b\u0004\u0001\u0004\u0003"+
		"\u0004\u00b8\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u00bc\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00c0\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00c7\b\u0005\n\u0005"+
		"\f\u0005\u00ca\t\u0005\u0003\u0005\u00cc\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00d0\b\u0005\n\u0005\f\u0005\u00d3\t\u0005\u0001\u0005\u0003"+
		"\u0005\u00d6\b\u0005\u0001\u0005\u0005\u0005\u00d9\b\u0005\n\u0005\f\u0005"+
		"\u00dc\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00e7\b\u0006"+
		"\n\u0006\f\u0006\u00ea\t\u0006\u0003\u0006\u00ec\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00f0\b\u0006\n\u0006\f\u0006\u00f3\t\u0006\u0001\u0006"+
		"\u0003\u0006\u00f6\b\u0006\u0001\u0006\u0005\u0006\u00f9\b\u0006\n\u0006"+
		"\f\u0006\u00fc\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0103\b\u0007\u0001\u0007\u0004\u0007\u0106\b"+
		"\u0007\u000b\u0007\f\u0007\u0107\u0004\u0007\u010a\b\u0007\u000b\u0007"+
		"\f\u0007\u010b\u0001\b\u0005\b\u010f\b\b\n\b\f\b\u0112\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0118\b\t\u0001\t\u0004\t\u011b\b\t\u000b\t"+
		"\f\t\u011c\u0001\t\u0003\t\u0120\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0129\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0132\b\f\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0137\b\r\u0001\u000e\u0001\u000e\u0004\u000e\u013b\b\u000e\u000b\u000e"+
		"\f\u000e\u013c\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0145\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u014b\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0152\b\u0010\n\u0010\f\u0010\u0155"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0159\b\u0010\n\u0010\f\u0010"+
		"\u015c\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0165\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u016f\b\u0012\n\u0012\f\u0012\u0172\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0179\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u017d\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0182\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0004\u0017\u0195\b\u0017\u000b\u0017\f\u0017\u0196"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u019f\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u01a7\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0004\u001a\u01ad\b\u001a\u000b\u001a\f\u001a"+
		"\u01ae\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01bf\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u01c3\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u01ca\b\u001e\n\u001e\f\u001e\u01cd\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u01d1\b\u001e\n\u001e\f\u001e\u01d4"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01d8\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01e0\b\u001e\u0001\u001e\u0005\u001e\u01e3\b\u001e\n\u001e\f\u001e\u01e6"+
		"\t\u001e\u0004\u001e\u01e8\b\u001e\u000b\u001e\f\u001e\u01e9\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u01f0\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u01f4\b\u001f\n\u001f\f\u001f\u01f7\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u01fb\b\u001f\n\u001f\f\u001f\u01fe\t\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0203\b\u001f\u0001\u001f"+
		"\u0005\u001f\u0206\b\u001f\n\u001f\f\u001f\u0209\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0211"+
		"\b\u001f\n\u001f\f\u001f\u0214\t\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u0218\b\u001f\n\u001f\f\u001f\u021b\t\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0220\b\u001f\u0001\u001f\u0005\u001f\u0223\b\u001f"+
		"\n\u001f\f\u001f\u0226\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u022b\b\u001f\n\u001f\f\u001f\u022e\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0232\b\u001f\n\u001f\f\u001f\u0235\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u023a\b\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u023e\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0003 \u0247\b \u0001!\u0005!\u024a\b!\n!\f!\u024d\t!\u0001!\u0001!\u0005"+
		"!\u0251\b!\n!\f!\u0254\t!\u0001!\u0001!\u0005!\u0258\b!\n!\f!\u025b\t"+
		"!\u0001!\u0001!\u0001!\u0003!\u0260\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0005\"\u0267\b\"\n\"\f\"\u026a\t\"\u0001\"\u0001\"\u0005\"\u026e"+
		"\b\"\n\"\f\"\u0271\t\"\u0001\"\u0001\"\u0005\"\u0275\b\"\n\"\f\"\u0278"+
		"\t\"\u0001\"\u0001\"\u0001\"\u0003\"\u027d\b\"\u0001#\u0001#\u0001#\u0003"+
		"#\u0282\b#\u0001#\u0001#\u0003#\u0286\b#\u0001#\u0001#\u0003#\u028a\b"+
		"#\u0001#\u0001#\u0005#\u028e\b#\n#\f#\u0291\t#\u0001#\u0001#\u0005#\u0295"+
		"\b#\n#\f#\u0298\t#\u0001#\u0001#\u0001#\u0001#\u0003#\u029e\b#\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0005$\u02ab\b$\n$\f$\u02ae\t$\u0001$\u0001$\u0005$\u02b2\b$\n$\f$\u02b5"+
		"\t$\u0001$\u0001$\u0001$\u0001$\u0003$\u02bb\b$\u0001%\u0003%\u02be\b"+
		"%\u0001%\u0003%\u02c1\b%\u0001%\u0003%\u02c4\b%\u0001&\u0001&\u0003&\u02c8"+
		"\b&\u0001&\u0001&\u0005&\u02cc\b&\n&\f&\u02cf\t&\u0001\'\u0001\'\u0003"+
		"\'\u02d3\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u02da\b(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u02e6\b)\u0001*\u0001*\u0001+\u0001+\u0001+\u0005+\u02ed\b+\n+\f+\u02f0"+
		"\t+\u0001,\u0001,\u0001-\u0001-\u0001-\u0003-\u02f7\b-\u0001-\u0001-\u0001"+
		"-\u0003-\u02fc\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0005.\u0303\b.\n"+
		".\f.\u0306\t.\u0001/\u0001/\u0001/\u0001/\u0003/\u030c\b/\u0001/\u0001"+
		"/\u00010\u00010\u00010\u00030\u0313\b0\u00011\u00011\u00031\u0317\b1\u0001"+
		"1\u00011\u00011\u00011\u00031\u031d\b1\u00031\u031f\b1\u00012\u00012\u0003"+
		"2\u0323\b2\u00012\u00012\u00012\u00012\u00032\u0329\b2\u00032\u032b\b"+
		"2\u00013\u00013\u00033\u032f\b3\u00013\u00013\u00013\u00013\u00033\u0335"+
		"\b3\u00033\u0337\b3\u00014\u00034\u033a\b4\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u0348"+
		"\b5\u00016\u00016\u00016\u00016\u00017\u00017\u00037\u0350\b7\u00018\u0001"+
		"8\u00018\u00018\u00038\u0356\b8\u00038\u0358\b8\u00019\u00019\u00019\u0001"+
		"9\u00039\u035e\b9\u00039\u0360\b9\u0001:\u0001:\u0001:\u0001:\u0003:\u0366"+
		"\b:\u0003:\u0368\b:\u0001;\u0001;\u0001;\u0001;\u0003;\u036e\b;\u0003"+
		";\u0370\b;\u0001<\u0003<\u0373\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0003<\u037c\b<\u0001<\u0003<\u037f\b<\u0001=\u0001=\u0001=\u0001"+
		"=\u0003=\u0385\b=\u0001=\u0001=\u0003=\u0389\b=\u0001=\u0001=\u0003=\u038d"+
		"\b=\u0001=\u0001=\u0001=\u0001=\u0003=\u0393\b=\u0003=\u0395\b=\u0001"+
		">\u0001>\u0003>\u0399\b>\u0001?\u0001?\u0001?\u0004?\u039e\b?\u000b?\f"+
		"?\u039f\u0001@\u0001@\u0001@\u0000\u0000A\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0000\b\u0001\u000078\u0001"+
		"\u000024\u0001\u0000)*\u0001\u0000=B\u0001\u0000-.\u0001\u0000+,\u0001"+
		"\u0000/0\u0001\u0000GH\u0407\u0000\u0083\u0001\u0000\u0000\u0000\u0002"+
		"\u008b\u0001\u0000\u0000\u0000\u0004\u0095\u0001\u0000\u0000\u0000\u0006"+
		"\u0098\u0001\u0000\u0000\u0000\b\u00b1\u0001\u0000\u0000\u0000\n\u00b9"+
		"\u0001\u0000\u0000\u0000\f\u00df\u0001\u0000\u0000\u0000\u000e\u0109\u0001"+
		"\u0000\u0000\u0000\u0010\u0110\u0001\u0000\u0000\u0000\u0012\u0117\u0001"+
		"\u0000\u0000\u0000\u0014\u0128\u0001\u0000\u0000\u0000\u0016\u012a\u0001"+
		"\u0000\u0000\u0000\u0018\u0131\u0001\u0000\u0000\u0000\u001a\u0133\u0001"+
		"\u0000\u0000\u0000\u001c\u0138\u0001\u0000\u0000\u0000\u001e\u013e\u0001"+
		"\u0000\u0000\u0000 \u0142\u0001\u0000\u0000\u0000\"\u015f\u0001\u0000"+
		"\u0000\u0000$\u016b\u0001\u0000\u0000\u0000&\u0173\u0001\u0000\u0000\u0000"+
		"(\u017c\u0001\u0000\u0000\u0000*\u017e\u0001\u0000\u0000\u0000,\u0183"+
		"\u0001\u0000\u0000\u0000.\u018a\u0001\u0000\u0000\u00000\u019b\u0001\u0000"+
		"\u0000\u00002\u01a0\u0001\u0000\u0000\u00004\u01a8\u0001\u0000\u0000\u0000"+
		"6\u01b3\u0001\u0000\u0000\u00008\u01be\u0001\u0000\u0000\u0000:\u01c0"+
		"\u0001\u0000\u0000\u0000<\u01c4\u0001\u0000\u0000\u0000>\u01ed\u0001\u0000"+
		"\u0000\u0000@\u023f\u0001\u0000\u0000\u0000B\u024b\u0001\u0000\u0000\u0000"+
		"D\u0261\u0001\u0000\u0000\u0000F\u027e\u0001\u0000\u0000\u0000H\u029f"+
		"\u0001\u0000\u0000\u0000J\u02bd\u0001\u0000\u0000\u0000L\u02c7\u0001\u0000"+
		"\u0000\u0000N\u02d2\u0001\u0000\u0000\u0000P\u02d4\u0001\u0000\u0000\u0000"+
		"R\u02e5\u0001\u0000\u0000\u0000T\u02e7\u0001\u0000\u0000\u0000V\u02e9"+
		"\u0001\u0000\u0000\u0000X\u02f1\u0001\u0000\u0000\u0000Z\u02f6\u0001\u0000"+
		"\u0000\u0000\\\u02ff\u0001\u0000\u0000\u0000^\u0307\u0001\u0000\u0000"+
		"\u0000`\u0312\u0001\u0000\u0000\u0000b\u0316\u0001\u0000\u0000\u0000d"+
		"\u0322\u0001\u0000\u0000\u0000f\u032e\u0001\u0000\u0000\u0000h\u0339\u0001"+
		"\u0000\u0000\u0000j\u0347\u0001\u0000\u0000\u0000l\u0349\u0001\u0000\u0000"+
		"\u0000n\u034f\u0001\u0000\u0000\u0000p\u0351\u0001\u0000\u0000\u0000r"+
		"\u0359\u0001\u0000\u0000\u0000t\u0361\u0001\u0000\u0000\u0000v\u0369\u0001"+
		"\u0000\u0000\u0000x\u037e\u0001\u0000\u0000\u0000z\u0394\u0001\u0000\u0000"+
		"\u0000|\u0398\u0001\u0000\u0000\u0000~\u039a\u0001\u0000\u0000\u0000\u0080"+
		"\u03a1\u0001\u0000\u0000\u0000\u0082\u0084\u0003\u0002\u0001\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0089\u0003\u0004\u0002\u0000\u0086"+
		"\u008a\u0003\n\u0005\u0000\u0087\u008a\u0003\f\u0006\u0000\u0088\u008a"+
		"\u0003\b\u0004\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0001\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\u0001\u0000\u0000\u008c\u008e\u0003"+
		"|>\u0000\u008d\u008f\u0005K\u0000\u0000\u008e\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0003\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0003\u0006\u0003\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0005\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0002\u0000"+
		"\u0000\u0099\u009c\u0003|>\u0000\u009a\u009b\u0005\u001b\u0000\u0000\u009b"+
		"\u009d\u0003|>\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u00a0\u0005"+
		"K\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u0007\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0003"+
		"\u0000\u0000\u00a4\u00a9\u0003|>\u0000\u00a5\u00a6\u0005\u0004\u0000\u0000"+
		"\u00a6\u00a8\u0003|>\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ae\u0005K\u0000\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b1\u00a3\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b5\u0003"+
		"\u000e\u0007\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003"+
		"\u0010\b\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\t\u0001\u0000\u0000\u0000\u00b9\u00bf\u0003J%\u0000"+
		"\u00ba\u00bc\u0005D\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0005C\u0000\u0000\u00be\u00c0\u0005F\u0000\u0000\u00bf\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00cb\u0003|>\u0000\u00c2\u00c3\u0005\u0005\u0000"+
		"\u0000\u00c3\u00c8\u0003|>\u0000\u00c4\u00c5\u0005\u0004\u0000\u0000\u00c5"+
		"\u00c7\u0003|>\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c2\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d1\u0005"+
		"\u0006\u0000\u0000\u00ce\u00d0\u0005K\u0000\u0000\u00cf\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d6\u0003\u000e"+
		"\u0007\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00da\u0001\u0000\u0000\u0000\u00d7\u00d9\u0005K\u0000"+
		"\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000"+
		"\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0005\u0007\u0000\u0000\u00de\u000b\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0003J%\u0000\u00e0\u00e1\u0005E\u0000\u0000\u00e1"+
		"\u00eb\u0003|>\u0000\u00e2\u00e3\u0005\u0005\u0000\u0000\u00e3\u00e8\u0003"+
		"|>\u0000\u00e4\u00e5\u0005\u0004\u0000\u0000\u00e5\u00e7\u0003|>\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00eb\u00e2\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f1\u0005\u0006\u0000\u0000"+
		"\u00ee\u00f0\u0005K\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f6\u0003\u000e\u0007\u0000\u00f5"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f7\u00f9\u0005K\u0000\u0000\u00f8\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0005\u0007\u0000\u0000\u00fe\r\u0001\u0000\u0000\u0000\u00ff\u0103\u0003"+
		"(\u0014\u0000\u0100\u0103\u0003 \u0010\u0000\u0101\u0103\u0003\"\u0011"+
		"\u0000\u0102\u00ff\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000"+
		"\u0000\u0104\u0106\u0005K\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000"+
		"\u0109\u0102\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u000f\u0001\u0000\u0000\u0000\u010d\u010f\u0003\u0012\t\u0000\u010e"+
		"\u010d\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110"+
		"\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111"+
		"\u0011\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113"+
		"\u0118\u0003(\u0014\u0000\u0114\u0118\u0003\u0018\f\u0000\u0115\u0118"+
		"\u0003\\.\u0000\u0116\u0118\u00038\u001c\u0000\u0117\u0113\u0001\u0000"+
		"\u0000\u0000\u0117\u0114\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u011f\u0001\u0000"+
		"\u0000\u0000\u0119\u011b\u0005K\u0000\u0000\u011a\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000"+
		"\u0000\u011e\u0120\u0005\u0000\u0000\u0001\u011f\u011a\u0001\u0000\u0000"+
		"\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0013\u0001\u0000\u0000"+
		"\u0000\u0121\u0129\u0003\u0016\u000b\u0000\u0122\u0129\u0003`0\u0000\u0123"+
		"\u0129\u0003n7\u0000\u0124\u0129\u0003|>\u0000\u0125\u0129\u0005J\u0000"+
		"\u0000\u0126\u0129\u0003N\'\u0000\u0127\u0129\u0003\u001c\u000e\u0000"+
		"\u0128\u0121\u0001\u0000\u0000\u0000\u0128\u0122\u0001\u0000\u0000\u0000"+
		"\u0128\u0123\u0001\u0000\u0000\u0000\u0128\u0124\u0001\u0000\u0000\u0000"+
		"\u0128\u0125\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000"+
		"\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u0015\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0007\u0000\u0000\u0000\u012b\u0017\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0003\u001a\r\u0000\u012d\u012e\u0005\b\u0000\u0000\u012e"+
		"\u012f\u0003\u0014\n\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u0132"+
		"\u0003z=\u0000\u0131\u012c\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000"+
		"\u0000\u0000\u0132\u0019\u0001\u0000\u0000\u0000\u0133\u0136\u0005I\u0000"+
		"\u0000\u0134\u0135\u0005\t\u0000\u0000\u0135\u0137\u0003\u001a\r\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u001b\u0001\u0000\u0000\u0000\u0138\u013a\u0003\u001a\r\u0000\u0139"+
		"\u013b\u0003\u001e\u000f\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0001\u0000\u0000\u0000\u013d\u001d\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0005\n\u0000\u0000\u013f\u0140\u0003n7\u0000\u0140\u0141\u0005"+
		"\u000b\u0000\u0000\u0141\u001f\u0001\u0000\u0000\u0000\u0142\u0144\u0003"+
		"J%\u0000\u0143\u0145\u0005D\u0000\u0000\u0144\u0143\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0005\f\u0000\u0000\u0147\u0148\u0003|>\u0000\u0148"+
		"\u014a\u0005\r\u0000\u0000\u0149\u014b\u0003$\u0012\u0000\u014a\u0149"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u000e\u0000\u0000\u014d\u014e"+
		"\u0005\u0005\u0000\u0000\u014e\u014f\u0003L&\u0000\u014f\u0153\u0005\u0006"+
		"\u0000\u0000\u0150\u0152\u0005K\u0000\u0000\u0151\u0150\u0001\u0000\u0000"+
		"\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000"+
		"\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u015a\u0003\u0010\b\u0000"+
		"\u0157\u0159\u0005K\u0000\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159"+
		"\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c"+
		"\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0007\u0000\u0000\u015e"+
		"!\u0001\u0000\u0000\u0000\u015f\u0160\u0003J%\u0000\u0160\u0161\u0005"+
		"\f\u0000\u0000\u0161\u0162\u0003|>\u0000\u0162\u0164\u0005\r\u0000\u0000"+
		"\u0163\u0165\u0003$\u0012\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0005\u000e\u0000\u0000\u0167\u0168\u0005\u0006\u0000\u0000\u0168"+
		"\u0169\u0003\u0010\b\u0000\u0169\u016a\u0005\u0007\u0000\u0000\u016a#"+
		"\u0001\u0000\u0000\u0000\u016b\u0170\u0003&\u0013\u0000\u016c\u016d\u0005"+
		"\u0004\u0000\u0000\u016d\u016f\u0003&\u0013\u0000\u016e\u016c\u0001\u0000"+
		"\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171%\u0001\u0000\u0000"+
		"\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0174\u0003|>\u0000\u0174"+
		"\u0175\u0005\u0005\u0000\u0000\u0175\u0178\u0003L&\u0000\u0176\u0177\u0005"+
		"\b\u0000\u0000\u0177\u0179\u0003\u0014\n\u0000\u0178\u0176\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\'\u0001\u0000\u0000"+
		"\u0000\u017a\u017d\u00030\u0018\u0000\u017b\u017d\u0003*\u0015\u0000\u017c"+
		"\u017a\u0001\u0000\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d"+
		")\u0001\u0000\u0000\u0000\u017e\u0181\u0003J%\u0000\u017f\u0182\u0003"+
		",\u0016\u0000\u0180\u0182\u0003.\u0017\u0000\u0181\u017f\u0001\u0000\u0000"+
		"\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182+\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0005\u000f\u0000\u0000\u0184\u0185\u0003|>\u0000\u0185\u0186"+
		"\u0005\u0005\u0000\u0000\u0186\u0187\u0003L&\u0000\u0187\u0188\u0005\b"+
		"\u0000\u0000\u0188\u0189\u0003\u0014\n\u0000\u0189-\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0005\u000f\u0000\u0000\u018b\u018c\u0003|>\u0000\u018c"+
		"\u018d\u0005\b\u0000\u0000\u018d\u018e\u0003\u0014\n\u0000\u018e\u0194"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u0004\u0000\u0000\u0190\u0191"+
		"\u0003|>\u0000\u0191\u0192\u0005\b\u0000\u0000\u0192\u0193\u0003\u0014"+
		"\n\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194\u018f\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0005\u0005\u0000\u0000\u0199\u019a\u0003L&\u0000\u019a"+
		"/\u0001\u0000\u0000\u0000\u019b\u019e\u0003J%\u0000\u019c\u019f\u0003"+
		"2\u0019\u0000\u019d\u019f\u00034\u001a\u0000\u019e\u019c\u0001\u0000\u0000"+
		"\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f1\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0005\u0010\u0000\u0000\u01a1\u01a2\u0003|>\u0000\u01a2\u01a3"+
		"\u0005\u0005\u0000\u0000\u01a3\u01a6\u0003L&\u0000\u01a4\u01a5\u0005\b"+
		"\u0000\u0000\u01a5\u01a7\u0003\u0014\n\u0000\u01a6\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a73\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0005\u0010\u0000\u0000\u01a9\u01ac\u00036\u001b\u0000\u01aa"+
		"\u01ab\u0005\u0004\u0000\u0000\u01ab\u01ad\u00036\u001b\u0000\u01ac\u01aa"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005\u0005\u0000\u0000\u01b1\u01b2"+
		"\u0003L&\u0000\u01b25\u0001\u0000\u0000\u0000\u01b3\u01b4\u0003|>\u0000"+
		"\u01b4\u01b5\u0005\b\u0000\u0000\u01b5\u01b6\u0003\u0014\n\u0000\u01b6"+
		"7\u0001\u0000\u0000\u0000\u01b7\u01bf\u0003@ \u0000\u01b8\u01bf\u0003"+
		"<\u001e\u0000\u01b9\u01bf\u0003F#\u0000\u01ba\u01bf\u0003H$\u0000\u01bb"+
		"\u01bf\u0003:\u001d\u0000\u01bc\u01bf\u0003D\"\u0000\u01bd\u01bf\u0003"+
		">\u001f\u0000\u01be\u01b7\u0001\u0000\u0000\u0000\u01be\u01b8\u0001\u0000"+
		"\u0000\u0000\u01be\u01b9\u0001\u0000\u0000\u0000\u01be\u01ba\u0001\u0000"+
		"\u0000\u0000\u01be\u01bb\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000"+
		"\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf9\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c2\u0005\u0011\u0000\u0000\u01c1\u01c3\u0003\u0014\n\u0000"+
		"\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c3;\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005\u001f\u0000\u0000\u01c5"+
		"\u01c6\u0005\r\u0000\u0000\u01c6\u01c7\u0003`0\u0000\u01c7\u01cb\u0005"+
		"\u000e\u0000\u0000\u01c8\u01ca\u0005K\u0000\u0000\u01c9\u01c8\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce\u0001\u0000"+
		"\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01d2\u0005\u0006"+
		"\u0000\u0000\u01cf\u01d1\u0005K\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01e7\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d8\u0003`0\u0000\u01d6"+
		"\u01d8\u0005\u0012\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"\u01df\u0005\u0013\u0000\u0000\u01da\u01db\u0005\u0006\u0000\u0000\u01db"+
		"\u01dc\u0003\u0010\b\u0000\u01dc\u01dd\u0005\u0007\u0000\u0000\u01dd\u01e0"+
		"\u0001\u0000\u0000\u0000\u01de\u01e0\u0003\u0012\t\u0000\u01df\u01da\u0001"+
		"\u0000\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e3\u0005K\u0000\u0000\u01e2\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01d7\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ec\u0005\u0007\u0000\u0000\u01ec=\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ef\u0005\u0014\u0000\u0000\u01ee\u01f0\u0003\u0018\f\u0000"+
		"\u01ef\u01ee\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f0\u0202\u0001\u0000\u0000\u0000\u01f1\u01f5\u0005\u0006\u0000\u0000"+
		"\u01f2\u01f4\u0005K\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f8\u01fc\u0003\u0010\b\u0000\u01f9\u01fb"+
		"\u0005K\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001"+
		"\u0000\u0000\u0000\u01fd\u01ff\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001"+
		"\u0000\u0000\u0000\u01ff\u0200\u0005\u0007\u0000\u0000\u0200\u0203\u0001"+
		"\u0000\u0000\u0000\u0201\u0203\u0003\u0012\t\u0000\u0202\u01f1\u0001\u0000"+
		"\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203\u0207\u0001\u0000"+
		"\u0000\u0000\u0204\u0206\u0005K\u0000\u0000\u0205\u0204\u0001\u0000\u0000"+
		"\u0000\u0206\u0209\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000"+
		"\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u020a\u0001\u0000\u0000"+
		"\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u020a\u020b\u0005\u0015\u0000"+
		"\u0000\u020b\u020c\u0005\r\u0000\u0000\u020c\u020d\u0003&\u0013\u0000"+
		"\u020d\u021f\u0005\u000e\u0000\u0000\u020e\u0212\u0005\u0006\u0000\u0000"+
		"\u020f\u0211\u0005K\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0211"+
		"\u0214\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0001\u0000\u0000\u0000\u0213\u0215\u0001\u0000\u0000\u0000\u0214"+
		"\u0212\u0001\u0000\u0000\u0000\u0215\u0219\u0003\u0010\b\u0000\u0216\u0218"+
		"\u0005K\u0000\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0218\u021b\u0001"+
		"\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u021a\u0001"+
		"\u0000\u0000\u0000\u021a\u021c\u0001\u0000\u0000\u0000\u021b\u0219\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\u0005\u0007\u0000\u0000\u021d\u0220\u0001"+
		"\u0000\u0000\u0000\u021e\u0220\u0003\u0012\t\u0000\u021f\u020e\u0001\u0000"+
		"\u0000\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220\u0224\u0001\u0000"+
		"\u0000\u0000\u0221\u0223\u0005K\u0000\u0000\u0222\u0221\u0001\u0000\u0000"+
		"\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u023d\u0001\u0000\u0000"+
		"\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0227\u0239\u0005\u0016\u0000"+
		"\u0000\u0228\u022c\u0005\u0006\u0000\u0000\u0229\u022b\u0005K\u0000\u0000"+
		"\u022a\u0229\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000\u0000\u0000"+
		"\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000"+
		"\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000"+
		"\u022f\u0233\u0003\u0010\b\u0000\u0230\u0232\u0005K\u0000\u0000\u0231"+
		"\u0230\u0001\u0000\u0000\u0000\u0232\u0235\u0001\u0000\u0000\u0000\u0233"+
		"\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234"+
		"\u0236\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0236"+
		"\u0237\u0005\u0007\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238"+
		"\u023a\u0003\u0012\t\u0000\u0239\u0228\u0001\u0000\u0000\u0000\u0239\u0238"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c"+
		"\u0005K\u0000\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u0227\u0001"+
		"\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e?\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\u0005\u001d\u0000\u0000\u0240\u0241\u0005\r\u0000"+
		"\u0000\u0241\u0242\u0003`0\u0000\u0242\u0243\u0005\u000e\u0000\u0000\u0243"+
		"\u0246\u0003B!\u0000\u0244\u0245\u0005\u001e\u0000\u0000\u0245\u0247\u0003"+
		"B!\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000"+
		"\u0000\u0247A\u0001\u0000\u0000\u0000\u0248\u024a\u0005K\u0000\u0000\u0249"+
		"\u0248\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000\u0000\u0000\u024b"+
		"\u0249\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c"+
		"\u025f\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024e"+
		"\u0252\u0005\u0006\u0000\u0000\u024f\u0251\u0005K\u0000\u0000\u0250\u024f"+
		"\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250"+
		"\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0255"+
		"\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0259"+
		"\u0003\u0010\b\u0000\u0256\u0258\u0005K\u0000\u0000\u0257\u0256\u0001"+
		"\u0000\u0000\u0000\u0258\u025b\u0001\u0000\u0000\u0000\u0259\u0257\u0001"+
		"\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025c\u0001"+
		"\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025c\u025d\u0005"+
		"\u0007\u0000\u0000\u025d\u0260\u0001\u0000\u0000\u0000\u025e\u0260\u0003"+
		"\u0012\t\u0000\u025f\u024e\u0001\u0000\u0000\u0000\u025f\u025e\u0001\u0000"+
		"\u0000\u0000\u0260C\u0001\u0000\u0000\u0000\u0261\u0262\u0005\u0017\u0000"+
		"\u0000\u0262\u0263\u0005\r\u0000\u0000\u0263\u0264\u0003`0\u0000\u0264"+
		"\u0268\u0005\u000e\u0000\u0000\u0265\u0267\u0005K\u0000\u0000\u0266\u0265"+
		"\u0001\u0000\u0000\u0000\u0267\u026a\u0001\u0000\u0000\u0000\u0268\u0266"+
		"\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u027c"+
		"\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026b\u026f"+
		"\u0005\u0006\u0000\u0000\u026c\u026e\u0005K\u0000\u0000\u026d\u026c\u0001"+
		"\u0000\u0000\u0000\u026e\u0271\u0001\u0000\u0000\u0000\u026f\u026d\u0001"+
		"\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0272\u0001"+
		"\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0272\u0276\u0003"+
		"\u0010\b\u0000\u0273\u0275\u0005K\u0000\u0000\u0274\u0273\u0001\u0000"+
		"\u0000\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0279\u0001\u0000"+
		"\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027a\u0005\u0007"+
		"\u0000\u0000\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u027d\u0003\u0012"+
		"\t\u0000\u027c\u026b\u0001\u0000\u0000\u0000\u027c\u027b\u0001\u0000\u0000"+
		"\u0000\u027dE\u0001\u0000\u0000\u0000\u027e\u027f\u0005\u001c\u0000\u0000"+
		"\u027f\u0281\u0005\r\u0000\u0000\u0280\u0282\u00030\u0018\u0000\u0281"+
		"\u0280\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282"+
		"\u0283\u0001\u0000\u0000\u0000\u0283\u0285\u0005K\u0000\u0000\u0284\u0286"+
		"\u0003`0\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000"+
		"\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0289\u0005K\u0000"+
		"\u0000\u0288\u028a\u0003\u0018\f\u0000\u0289\u0288\u0001\u0000\u0000\u0000"+
		"\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000"+
		"\u028b\u028f\u0005\u000e\u0000\u0000\u028c\u028e\u0005K\u0000\u0000\u028d"+
		"\u028c\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f"+
		"\u028d\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290"+
		"\u029d\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292"+
		"\u0296\u0005\u0006\u0000\u0000\u0293\u0295\u0005K\u0000\u0000\u0294\u0293"+
		"\u0001\u0000\u0000\u0000\u0295\u0298\u0001\u0000\u0000\u0000\u0296\u0294"+
		"\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0299"+
		"\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0299\u029a"+
		"\u0003\u0010\b\u0000\u029a\u029b\u0005\u0007\u0000\u0000\u029b\u029e\u0001"+
		"\u0000\u0000\u0000\u029c\u029e\u0003\u0012\t\u0000\u029d\u0292\u0001\u0000"+
		"\u0000\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029eG\u0001\u0000\u0000"+
		"\u0000\u029f\u02a0\u0005\u001c\u0000\u0000\u02a0\u02a1\u0005\r\u0000\u0000"+
		"\u02a1\u02a2\u0003|>\u0000\u02a2\u02a3\u0005\u0005\u0000\u0000\u02a3\u02a4"+
		"\u0003L&\u0000\u02a4\u02a5\u0005\u0004\u0000\u0000\u02a5\u02a6\u0003\u0014"+
		"\n\u0000\u02a6\u02a7\u0005\u0018\u0000\u0000\u02a7\u02a8\u0003\u0014\n"+
		"\u0000\u02a8\u02ac\u0005\u000e\u0000\u0000\u02a9\u02ab\u0005K\u0000\u0000"+
		"\u02aa\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ae\u0001\u0000\u0000\u0000"+
		"\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000"+
		"\u02ad\u02ba\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000"+
		"\u02af\u02b3\u0005\u0006\u0000\u0000\u02b0\u02b2\u0005K\u0000\u0000\u02b1"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b5\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b6\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b7\u0003\u0010\b\u0000\u02b7\u02b8\u0005\u0007\u0000\u0000\u02b8\u02bb"+
		"\u0001\u0000\u0000\u0000\u02b9\u02bb\u0003\u0012\t\u0000\u02ba\u02af\u0001"+
		"\u0000\u0000\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02bbI\u0001\u0000"+
		"\u0000\u0000\u02bc\u02be\u0007\u0001\u0000\u0000\u02bd\u02bc\u0001\u0000"+
		"\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02c0\u0001\u0000"+
		"\u0000\u0000\u02bf\u02c1\u00055\u0000\u0000\u02c0\u02bf\u0001\u0000\u0000"+
		"\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c2\u02c4\u00056\u0000\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000"+
		"\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4K\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c8\u0003N\'\u0000\u02c6\u02c8\u0003P(\u0000\u02c7\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8\u02cd\u0001\u0000"+
		"\u0000\u0000\u02c9\u02ca\u0005\n\u0000\u0000\u02ca\u02cc\u0005\u000b\u0000"+
		"\u0000\u02cb\u02c9\u0001\u0000\u0000\u0000\u02cc\u02cf\u0001\u0000\u0000"+
		"\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000"+
		"\u0000\u02ceM\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000"+
		"\u02d0\u02d3\u0003|>\u0000\u02d1\u02d3\u0003R)\u0000\u02d2\u02d0\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d3O\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d9\u0005\u0019\u0000\u0000\u02d5\u02da\u0003N\'"+
		"\u0000\u02d6\u02da\u0005C\u0000\u0000\u02d7\u02da\u0005E\u0000\u0000\u02d8"+
		"\u02da\u0005F\u0000\u0000\u02d9\u02d5\u0001\u0000\u0000\u0000\u02d9\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02d8"+
		"\u0001\u0000\u0000\u0000\u02daQ\u0001\u0000\u0000\u0000\u02db\u02e6\u0005"+
		" \u0000\u0000\u02dc\u02e6\u0005!\u0000\u0000\u02dd\u02e6\u0005\"\u0000"+
		"\u0000\u02de\u02e6\u0005#\u0000\u0000\u02df\u02e6\u0005$\u0000\u0000\u02e0"+
		"\u02e6\u0005%\u0000\u0000\u02e1\u02e6\u0005&\u0000\u0000\u02e2\u02e6\u0005"+
		"\'\u0000\u0000\u02e3\u02e6\u0005(\u0000\u0000\u02e4\u02e6\u0003T*\u0000"+
		"\u02e5\u02db\u0001\u0000\u0000\u0000\u02e5\u02dc\u0001\u0000\u0000\u0000"+
		"\u02e5\u02dd\u0001\u0000\u0000\u0000\u02e5\u02de\u0001\u0000\u0000\u0000"+
		"\u02e5\u02df\u0001\u0000\u0000\u0000\u02e5\u02e0\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e1\u0001\u0000\u0000\u0000\u02e5\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e6S\u0001\u0000\u0000\u0000\u02e7\u02e8\u0007\u0002\u0000\u0000\u02e8"+
		"U\u0001\u0000\u0000\u0000\u02e9\u02ee\u0003X,\u0000\u02ea\u02eb\u0005"+
		"\u0004\u0000\u0000\u02eb\u02ed\u0003X,\u0000\u02ec\u02ea\u0001\u0000\u0000"+
		"\u0000\u02ed\u02f0\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02efW\u0001\u0000\u0000\u0000"+
		"\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f1\u02f2\u0003\u0014\n\u0000\u02f2"+
		"Y\u0001\u0000\u0000\u0000\u02f3\u02f4\u0003\u001a\r\u0000\u02f4\u02f5"+
		"\u0005\t\u0000\u0000\u02f5\u02f7\u0001\u0000\u0000\u0000\u02f6\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f9\u0005I\u0000\u0000\u02f9\u02fb\u0005\r"+
		"\u0000\u0000\u02fa\u02fc\u0003V+\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000"+
		"\u02fd\u02fe\u0005\u000e\u0000\u0000\u02fe[\u0001\u0000\u0000\u0000\u02ff"+
		"\u0304\u0003Z-\u0000\u0300\u0301\u0005\t\u0000\u0000\u0301\u0303\u0003"+
		"Z-\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000"+
		"\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000"+
		"\u0000\u0305]\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000"+
		"\u0307\u0308\u0005\u001a\u0000\u0000\u0308\u0309\u0003|>\u0000\u0309\u030b"+
		"\u0005\r\u0000\u0000\u030a\u030c\u0003V+\u0000\u030b\u030a\u0001\u0000"+
		"\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000"+
		"\u0000\u0000\u030d\u030e\u0005\u000e\u0000\u0000\u030e_\u0001\u0000\u0000"+
		"\u0000\u030f\u0313\u0003j5\u0000\u0310\u0313\u0003b1\u0000\u0311\u0313"+
		"\u0003l6\u0000\u0312\u030f\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000"+
		"\u0000\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0313a\u0001\u0000\u0000"+
		"\u0000\u0314\u0317\u0003j5\u0000\u0315\u0317\u0003d2\u0000\u0316\u0314"+
		"\u0001\u0000\u0000\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0317\u031e"+
		"\u0001\u0000\u0000\u0000\u0318\u031c\u0005:\u0000\u0000\u0319\u031d\u0003"+
		"j5\u0000\u031a\u031d\u0003d2\u0000\u031b\u031d\u0003b1\u0000\u031c\u0319"+
		"\u0001\u0000\u0000\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031c\u031b"+
		"\u0001\u0000\u0000\u0000\u031d\u031f\u0001\u0000\u0000\u0000\u031e\u0318"+
		"\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031fc\u0001"+
		"\u0000\u0000\u0000\u0320\u0323\u0003j5\u0000\u0321\u0323\u0003f3\u0000"+
		"\u0322\u0320\u0001\u0000\u0000\u0000\u0322\u0321\u0001\u0000\u0000\u0000"+
		"\u0323\u032a\u0001\u0000\u0000\u0000\u0324\u0328\u00059\u0000\u0000\u0325"+
		"\u0329\u0003j5\u0000\u0326\u0329\u0003f3\u0000\u0327\u0329\u0003d2\u0000"+
		"\u0328\u0325\u0001\u0000\u0000\u0000\u0328\u0326\u0001\u0000\u0000\u0000"+
		"\u0328\u0327\u0001\u0000\u0000\u0000\u0329\u032b\u0001\u0000\u0000\u0000"+
		"\u032a\u0324\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000"+
		"\u032be\u0001\u0000\u0000\u0000\u032c\u032f\u0003j5\u0000\u032d\u032f"+
		"\u0003h4\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032d\u0001\u0000"+
		"\u0000\u0000\u032f\u0336\u0001\u0000\u0000\u0000\u0330\u0334\u0005<\u0000"+
		"\u0000\u0331\u0335\u0003j5\u0000\u0332\u0335\u0003h4\u0000\u0333\u0335"+
		"\u0003f3\u0000\u0334\u0331\u0001\u0000\u0000\u0000\u0334\u0332\u0001\u0000"+
		"\u0000\u0000\u0334\u0333\u0001\u0000\u0000\u0000\u0335\u0337\u0001\u0000"+
		"\u0000\u0000\u0336\u0330\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000"+
		"\u0000\u0000\u0337g\u0001\u0000\u0000\u0000\u0338\u033a\u0005;\u0000\u0000"+
		"\u0339\u0338\u0001\u0000\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000"+
		"\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u033c\u0003j5\u0000\u033ci"+
		"\u0001\u0000\u0000\u0000\u033d\u0348\u0003\u0016\u000b\u0000\u033e\u0348"+
		"\u0003\\.\u0000\u033f\u0348\u0003|>\u0000\u0340\u0348\u0003\u001a\r\u0000"+
		"\u0341\u0342\u0005\r\u0000\u0000\u0342\u0343\u0003`0\u0000\u0343\u0344"+
		"\u0005\u000e\u0000\u0000\u0344\u0348\u0001\u0000\u0000\u0000\u0345\u0348"+
		"\u0003^/\u0000\u0346\u0348\u0003\u001c\u000e\u0000\u0347\u033d\u0001\u0000"+
		"\u0000\u0000\u0347\u033e\u0001\u0000\u0000\u0000\u0347\u033f\u0001\u0000"+
		"\u0000\u0000\u0347\u0340\u0001\u0000\u0000\u0000\u0347\u0341\u0001\u0000"+
		"\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0347\u0346\u0001\u0000"+
		"\u0000\u0000\u0348k\u0001\u0000\u0000\u0000\u0349\u034a\u0003n7\u0000"+
		"\u034a\u034b\u0007\u0003\u0000\u0000\u034b\u034c\u0003n7\u0000\u034cm"+
		"\u0001\u0000\u0000\u0000\u034d\u0350\u0003x<\u0000\u034e\u0350\u0003p"+
		"8\u0000\u034f\u034d\u0001\u0000\u0000\u0000\u034f\u034e\u0001\u0000\u0000"+
		"\u0000\u0350o\u0001\u0000\u0000\u0000\u0351\u0357\u0003r9\u0000\u0352"+
		"\u0355\u0007\u0004\u0000\u0000\u0353\u0356\u0003x<\u0000\u0354\u0356\u0003"+
		"p8\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0354\u0001\u0000\u0000"+
		"\u0000\u0356\u0358\u0001\u0000\u0000\u0000\u0357\u0352\u0001\u0000\u0000"+
		"\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358q\u0001\u0000\u0000\u0000"+
		"\u0359\u035f\u0003t:\u0000\u035a\u035d\u0007\u0005\u0000\u0000\u035b\u035e"+
		"\u0003x<\u0000\u035c\u035e\u0003r9\u0000\u035d\u035b\u0001\u0000\u0000"+
		"\u0000\u035d\u035c\u0001\u0000\u0000\u0000\u035e\u0360\u0001\u0000\u0000"+
		"\u0000\u035f\u035a\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000"+
		"\u0000\u0360s\u0001\u0000\u0000\u0000\u0361\u0367\u0003v;\u0000\u0362"+
		"\u0365\u0007\u0006\u0000\u0000\u0363\u0366\u0003x<\u0000\u0364\u0366\u0003"+
		"t:\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0365\u0364\u0001\u0000\u0000"+
		"\u0000\u0366\u0368\u0001\u0000\u0000\u0000\u0367\u0362\u0001\u0000\u0000"+
		"\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368u\u0001\u0000\u0000\u0000"+
		"\u0369\u036f\u0003x<\u0000\u036a\u036d\u00051\u0000\u0000\u036b\u036e"+
		"\u0003x<\u0000\u036c\u036e\u0003v;\u0000\u036d\u036b\u0001\u0000\u0000"+
		"\u0000\u036d\u036c\u0001\u0000\u0000\u0000\u036e\u0370\u0001\u0000\u0000"+
		"\u0000\u036f\u036a\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000"+
		"\u0000\u0370w\u0001\u0000\u0000\u0000\u0371\u0373\u0007\u0004\u0000\u0000"+
		"\u0372\u0371\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000\u0000\u0000"+
		"\u0373\u037b\u0001\u0000\u0000\u0000\u0374\u037c\u0003\\.\u0000\u0375"+
		"\u037c\u0003|>\u0000\u0376\u037c\u0003\u0080@\u0000\u0377\u0378\u0005"+
		"\r\u0000\u0000\u0378\u0379\u0003n7\u0000\u0379\u037a\u0005\u000e\u0000"+
		"\u0000\u037a\u037c\u0001\u0000\u0000\u0000\u037b\u0374\u0001\u0000\u0000"+
		"\u0000\u037b\u0375\u0001\u0000\u0000\u0000\u037b\u0376\u0001\u0000\u0000"+
		"\u0000\u037b\u0377\u0001\u0000\u0000\u0000\u037c\u037f\u0001\u0000\u0000"+
		"\u0000\u037d\u037f\u0003z=\u0000\u037e\u0372\u0001\u0000\u0000\u0000\u037e"+
		"\u037d\u0001\u0000\u0000\u0000\u037fy\u0001\u0000\u0000\u0000\u0380\u0381"+
		"\u0005-\u0000\u0000\u0381\u0385\u0005-\u0000\u0000\u0382\u0383\u0005."+
		"\u0000\u0000\u0383\u0385\u0005.\u0000\u0000\u0384\u0380\u0001\u0000\u0000"+
		"\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0385\u0388\u0001\u0000\u0000"+
		"\u0000\u0386\u0389\u0003|>\u0000\u0387\u0389\u0003\u001a\r\u0000\u0388"+
		"\u0386\u0001\u0000\u0000\u0000\u0388\u0387\u0001\u0000\u0000\u0000\u0389"+
		"\u0395\u0001\u0000\u0000\u0000\u038a\u038d\u0003|>\u0000\u038b\u038d\u0003"+
		"\u001a\r\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038c\u038b\u0001\u0000"+
		"\u0000\u0000\u038d\u0392\u0001\u0000\u0000\u0000\u038e\u038f\u0005-\u0000"+
		"\u0000\u038f\u0393\u0005-\u0000\u0000\u0390\u0391\u0005.\u0000\u0000\u0391"+
		"\u0393\u0005.\u0000\u0000\u0392\u038e\u0001\u0000\u0000\u0000\u0392\u0390"+
		"\u0001\u0000\u0000\u0000\u0393\u0395\u0001\u0000\u0000\u0000\u0394\u0384"+
		"\u0001\u0000\u0000\u0000\u0394\u038c\u0001\u0000\u0000\u0000\u0395{\u0001"+
		"\u0000\u0000\u0000\u0396\u0399\u0003~?\u0000\u0397\u0399\u0005I\u0000"+
		"\u0000\u0398\u0396\u0001\u0000\u0000\u0000\u0398\u0397\u0001\u0000\u0000"+
		"\u0000\u0399}\u0001\u0000\u0000\u0000\u039a\u039d\u0005I\u0000\u0000\u039b"+
		"\u039c\u0005\t\u0000\u0000\u039c\u039e\u0005I\u0000\u0000\u039d\u039b"+
		"\u0001\u0000\u0000\u0000\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u039d"+
		"\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000\u0000\u0000\u03a0\u007f"+
		"\u0001\u0000\u0000\u0000\u03a1\u03a2\u0007\u0007\u0000\u0000\u03a2\u0081"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0089\u0090\u0095\u009c\u00a1\u00a9"+
		"\u00af\u00b1\u00b4\u00b7\u00bb\u00bf\u00c8\u00cb\u00d1\u00d5\u00da\u00e8"+
		"\u00eb\u00f1\u00f5\u00fa\u0102\u0107\u010b\u0110\u0117\u011c\u011f\u0128"+
		"\u0131\u0136\u013c\u0144\u014a\u0153\u015a\u0164\u0170\u0178\u017c\u0181"+
		"\u0196\u019e\u01a6\u01ae\u01be\u01c2\u01cb\u01d2\u01d7\u01df\u01e4\u01e9"+
		"\u01ef\u01f5\u01fc\u0202\u0207\u0212\u0219\u021f\u0224\u022c\u0233\u0239"+
		"\u023d\u0246\u024b\u0252\u0259\u025f\u0268\u026f\u0276\u027c\u0281\u0285"+
		"\u0289\u028f\u0296\u029d\u02ac\u02b3\u02ba\u02bd\u02c0\u02c3\u02c7\u02cd"+
		"\u02d2\u02d9\u02e5\u02ee\u02f6\u02fb\u0304\u030b\u0312\u0316\u031c\u031e"+
		"\u0322\u0328\u032a\u032e\u0334\u0336\u0339\u0347\u034f\u0355\u0357\u035d"+
		"\u035f\u0365\u0367\u036d\u036f\u0372\u037b\u037e\u0384\u0388\u038c\u0392"+
		"\u0394\u0398\u039f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}