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
		RULE_returnStatement = 29, RULE_switchStatement = 30, RULE_subSwitch0 = 31, 
		RULE_tryCatchFinally = 32, RULE_ifStatement = 33, RULE_ifStatement0 = 34, 
		RULE_whileLoopStatement = 35, RULE_foriLoop = 36, RULE_foriLoop0 = 37, 
		RULE_access = 38, RULE_type = 39, RULE_anyType = 40, RULE_linkType = 41, 
		RULE_primitiveType = 42, RULE_nullType = 43, RULE_arguments = 44, RULE_argument = 45, 
		RULE_methodCall0 = 46, RULE_methodCall = 47, RULE_constructorCall = 48, 
		RULE_expression = 49, RULE_logicalOr = 50, RULE_logicalAnd = 51, RULE_logicalXor = 52, 
		RULE_logicalNot = 53, RULE_primaryExpresion = 54, RULE_arithCondExpression = 55, 
		RULE_arithmeticExpression = 56, RULE_addSubExpression = 57, RULE_modDivExpression = 58, 
		RULE_mulDivExpression = 59, RULE_powerExpression = 60, RULE_numberExpression = 61, 
		RULE_incrExpression = 62, RULE_name = 63, RULE_dot_name = 64, RULE_numeric_value = 65;
	private static String[] makeRuleNames() {
		return new String[] {
			"class", "package", "importBlock", "importStatement", "unnamedClassDef", 
			"classDef", "interfaceDef", "classBlock", "block", "lineBlock", "value", 
			"bool", "varAssignment", "varAccess", "arrayAccess", "arrayAccess0", 
			"methodDef", "constructorDef", "parameters", "parameter", "var", "constDef", 
			"constDef0", "constDef1", "varDef", "varDef0", "varDef1", "subVD1", "statement", 
			"returnStatement", "switchStatement", "subSwitch0", "tryCatchFinally", 
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
			"'var'", "'return'", "'default'", "'->'", "'try'", "'catch'", "'finally'", 
			"'while'", "'..'", "'@'", "'as'", "'for'", "'if'", "'else'", "'switch'", 
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
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(132);
				package_();
				}
			}

			setState(135);
			importBlock();
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(136);
				classDef();
				}
				break;
			case 2:
				{
				setState(137);
				interfaceDef();
				}
				break;
			case 3:
				{
				setState(138);
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
			setState(141);
			match(T__0);
			setState(142);
			name();
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				match(ENDLINE);
				}
				}
				setState(146); 
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
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(148);
				importStatement();
				}
				}
				setState(153);
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
			setState(154);
			match(T__1);
			setState(155);
			name();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_KEYWORD) {
				{
				setState(156);
				match(AS_KEYWORD);
				setState(157);
				name();
				}
			}

			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				match(ENDLINE);
				}
				}
				setState(163); 
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
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(165);
				match(T__2);
				setState(166);
				name();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(167);
					match(T__3);
					setState(168);
					name();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(174);
					match(ENDLINE);
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ENDLINE );
				}
			}

			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(181);
				classBlock();
				}
				break;
			}
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(184);
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
			setState(187);
			access();
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_KEYWORD:
			case ABSTRACT_KEYWORD:
				{
				{
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABSTRACT_KEYWORD) {
					{
					setState(188);
					match(ABSTRACT_KEYWORD);
					}
				}

				setState(191);
				match(CLASS_KEYWORD);
				}
				}
				break;
			case ENUM_KEYWORD:
				{
				setState(192);
				match(ENUM_KEYWORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(195);
			name();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(196);
				match(T__4);
				setState(197);
				name();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(198);
					match(T__3);
					setState(199);
					name();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(207);
			match(T__5);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(ENDLINE);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & 72066115253043257L) != 0)) {
				{
				setState(214);
				classBlock();
				}
			}

			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(217);
				match(ENDLINE);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
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
			setState(225);
			access();
			setState(226);
			match(INTERFACE_KEYWORD);
			setState(227);
			name();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(228);
				match(T__4);
				setState(229);
				name();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(230);
					match(T__3);
					setState(231);
					name();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(239);
			match(T__5);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					match(ENDLINE);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & 72066115253043257L) != 0)) {
				{
				setState(246);
				classBlock();
				}
			}

			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(249);
				match(ENDLINE);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
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
			setState(267); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(257);
						var();
						}
						break;
					case 2:
						{
						setState(258);
						methodDef();
						}
						break;
					case 3:
						{
						setState(259);
						constructorDef();
						}
						break;
					}
					setState(263); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(262);
							match(ENDLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(265); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(269); 
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
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 144115722262458663L) != 0)) {
				{
				{
				setState(271);
				lineBlock();
				}
				}
				setState(276);
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
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(277);
				var();
				}
				break;
			case 2:
				{
				setState(278);
				varAssignment();
				}
				break;
			case 3:
				{
				setState(279);
				methodCall();
				}
				break;
			case 4:
				{
				setState(280);
				statement();
				}
				break;
			}
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDLINE:
				{
				setState(284); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(283);
						match(ENDLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(286); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(288);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(STRING_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				arithmeticExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				anyType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
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
			setState(300);
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
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(302);
				varAccess();
				setState(303);
				match(T__7);
				setState(304);
				value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
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
			setState(309);
			match(NAME0);
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(310);
				match(T__8);
				setState(311);
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
			setState(314);
			varAccess();
			setState(316); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(315);
				arrayAccess0();
				}
				}
				setState(318); 
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
			setState(320);
			match(T__9);
			setState(321);
			arithmeticExpression();
			setState(322);
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
			setState(324);
			access();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT_KEYWORD) {
				{
				setState(325);
				match(ABSTRACT_KEYWORD);
				}
			}

			setState(328);
			match(T__11);
			setState(329);
			name();
			setState(330);
			match(T__12);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME0) {
				{
				setState(331);
				parameters();
				}
			}

			setState(334);
			match(T__13);
			setState(335);
			match(T__4);
			setState(336);
			type();
			setState(337);
			match(T__5);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(338);
					match(ENDLINE);
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(344);
			block();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(345);
				match(ENDLINE);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
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
			setState(353);
			access();
			setState(354);
			match(T__14);
			setState(355);
			name();
			setState(356);
			match(T__12);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME0) {
				{
				setState(357);
				parameters();
				}
			}

			setState(360);
			match(T__13);
			setState(361);
			match(T__5);
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					match(ENDLINE);
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(368);
			block();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(369);
				match(ENDLINE);
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
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
			setState(377);
			parameter();
			}
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(378);
				match(T__3);
				setState(379);
				parameter();
				}
				}
				setState(384);
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
			setState(385);
			name();
			setState(386);
			match(T__4);
			setState(387);
			type();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(388);
				match(T__7);
				setState(389);
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
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
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
			setState(396);
			access();
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(397);
				constDef0();
				}
				break;
			case 2:
				{
				setState(398);
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
			setState(401);
			match(T__15);
			setState(402);
			name();
			setState(403);
			match(T__4);
			setState(404);
			type();
			setState(405);
			match(T__7);
			setState(406);
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
			setState(408);
			match(T__15);
			{
			setState(409);
			name();
			setState(410);
			match(T__7);
			setState(411);
			value();
			}
			setState(418); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(413);
				match(T__3);
				setState(414);
				name();
				setState(415);
				match(T__7);
				setState(416);
				value();
				}
				}
				setState(420); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(422);
			match(T__4);
			setState(423);
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
			setState(425);
			access();
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(426);
				varDef0();
				}
				break;
			case 2:
				{
				setState(427);
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
			setState(430);
			match(T__16);
			setState(431);
			name();
			setState(432);
			match(T__4);
			setState(433);
			type();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(434);
				match(T__7);
				setState(435);
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
			setState(438);
			match(T__16);
			setState(439);
			subVD1();
			setState(442); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(440);
				match(T__3);
				setState(441);
				subVD1();
				}
				}
				setState(444); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(446);
			match(T__4);
			setState(447);
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
			setState(449);
			name();
			{
			setState(450);
			match(T__7);
			setState(451);
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
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				switchStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				foriLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				foriLoop0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(457);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(458);
				whileLoopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(459);
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
			setState(462);
			match(T__17);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 4323539219117506565L) != 0)) {
				{
				setState(463);
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
		enterRule(_localctx, 60, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(SWITCH_KEYWORD);
			setState(467);
			match(T__12);
			setState(468);
			value();
			setState(469);
			match(T__13);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(470);
				match(ENDLINE);
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			match(T__5);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(477);
				match(ENDLINE);
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(483);
				subSwitch0();
				}
				}
				setState(486); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 4323539219117506629L) != 0) );
			setState(488);
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
		enterRule(_localctx, 62, RULE_subSwitch0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__14:
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
				setState(490);
				value();
				}
				break;
			case T__18:
				{
				setState(491);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(494);
			match(T__19);
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(495);
				match(T__5);
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(496);
						match(ENDLINE);
						}
						} 
					}
					setState(501);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(502);
				block();
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(503);
					match(ENDLINE);
					}
					}
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(509);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case T__23:
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
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(511);
					match(ENDLINE);
					}
					}
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(517);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(520);
				match(ENDLINE);
				}
				}
				setState(525);
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
		enterRule(_localctx, 64, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(T__20);
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(527);
				varAssignment();
				}
				break;
			}
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(530);
				match(T__5);
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(531);
						match(ENDLINE);
						}
						} 
					}
					setState(536);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(537);
				block();
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(538);
					match(ENDLINE);
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(544);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case T__23:
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
				setState(546);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(549);
				match(ENDLINE);
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
			match(T__21);
			setState(556);
			match(T__12);
			setState(557);
			parameter();
			setState(558);
			match(T__13);
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(559);
				match(T__5);
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(560);
						match(ENDLINE);
						}
						} 
					}
					setState(565);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(566);
				block();
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(567);
					match(ENDLINE);
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(573);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case T__23:
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
				setState(575);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(581);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(578);
					match(ENDLINE);
					}
					} 
				}
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(584);
				match(T__22);
				setState(602);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					{
					setState(585);
					match(T__5);
					setState(589);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(586);
							match(ENDLINE);
							}
							} 
						}
						setState(591);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
					}
					setState(592);
					block();
					setState(596);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ENDLINE) {
						{
						{
						setState(593);
						match(ENDLINE);
						}
						}
						setState(598);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(599);
					match(T__6);
					}
					}
					break;
				case T__15:
				case T__16:
				case T__17:
				case T__20:
				case T__23:
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
					setState(601);
					lineBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(604);
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
		enterRule(_localctx, 66, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(IF_KEYWORD);
			setState(609);
			match(T__12);
			setState(610);
			expression();
			setState(611);
			match(T__13);
			setState(612);
			ifStatement0();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KEYWORD) {
				{
				setState(613);
				match(ELSE_KEYWORD);
				setState(614);
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
		enterRule(_localctx, 68, RULE_ifStatement0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(617);
				match(ENDLINE);
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(623);
				match(T__5);
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						match(ENDLINE);
						}
						} 
					}
					setState(629);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(630);
				block();
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(631);
					match(ENDLINE);
					}
					}
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(637);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case T__23:
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
				setState(639);
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
		enterRule(_localctx, 70, RULE_whileLoopStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(T__23);
			setState(643);
			match(T__12);
			setState(644);
			expression();
			setState(645);
			match(T__13);
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
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(652);
				match(T__5);
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(653);
						match(ENDLINE);
						}
						} 
					}
					setState(658);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(659);
				block();
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(660);
					match(ENDLINE);
					}
					}
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(666);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case T__23:
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
		enterRule(_localctx, 72, RULE_foriLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(FOR_KEYWORD);
			setState(672);
			match(T__12);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902897112252416L) != 0)) {
				{
				setState(673);
				varDef();
				}
			}

			setState(676);
			match(ENDLINE);
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 2017696208830595077L) != 0)) {
				{
				setState(677);
				expression();
				}
			}

			setState(680);
			match(ENDLINE);
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 268435459L) != 0)) {
				{
				setState(681);
				varAssignment();
				}
			}

			setState(684);
			match(T__13);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(685);
				match(ENDLINE);
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(691);
				match(T__5);
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(692);
					match(ENDLINE);
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(698);
				block();
				setState(699);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case T__23:
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
				setState(701);
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
		enterRule(_localctx, 74, RULE_foriLoop0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(FOR_KEYWORD);
			setState(705);
			match(T__12);
			setState(706);
			name();
			setState(707);
			match(T__4);
			setState(708);
			type();
			setState(709);
			match(T__3);
			setState(710);
			value();
			setState(711);
			match(T__24);
			setState(712);
			value();
			setState(713);
			match(T__13);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(714);
				match(ENDLINE);
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(720);
				match(T__5);
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(721);
					match(ENDLINE);
					}
					}
					setState(726);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(727);
				block();
				setState(728);
				match(T__6);
				}
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case T__23:
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
				setState(730);
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
		enterRule(_localctx, 76, RULE_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) {
				{
				setState(733);
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

			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(736);
				match(STATIC);
				}
			}

			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(739);
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
		enterRule(_localctx, 78, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
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
				setState(742);
				anyType();
				}
				break;
			case T__25:
				{
				setState(743);
				linkType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(746);
				match(T__9);
				setState(747);
				match(T__10);
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
		enterRule(_localctx, 80, RULE_anyType);
		try {
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME0:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
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
				setState(754);
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
		enterRule(_localctx, 82, RULE_linkType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(T__25);
			setState(762);
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
				setState(758);
				anyType();
				}
				break;
			case CLASS_KEYWORD:
				{
				setState(759);
				match(CLASS_KEYWORD);
				}
				break;
			case INTERFACE_KEYWORD:
				{
				setState(760);
				match(INTERFACE_KEYWORD);
				}
				break;
			case ENUM_KEYWORD:
				{
				setState(761);
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
		enterRule(_localctx, 84, RULE_primitiveType);
		try {
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				match(STR);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				match(BOOL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(767);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(768);
				match(DOUBLE);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(769);
				match(LONG);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(770);
				match(SHORT);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(771);
				match(BYTE);
				}
				break;
			case OBJ:
				enterOuterAlt(_localctx, 9);
				{
				setState(772);
				match(OBJ);
				}
				break;
			case VOID:
			case NULL:
				enterOuterAlt(_localctx, 10);
				{
				setState(773);
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
		enterRule(_localctx, 86, RULE_nullType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
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
		enterRule(_localctx, 88, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			argument();
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(779);
				match(T__3);
				setState(780);
				argument();
				}
				}
				setState(785);
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
		enterRule(_localctx, 90, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
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
		enterRule(_localctx, 92, RULE_methodCall0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(788);
				varAccess();
				setState(789);
				match(T__8);
				}
				break;
			}
			setState(793);
			match(NAME0);
			setState(794);
			match(T__12);
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 4323539219117506565L) != 0)) {
				{
				setState(795);
				arguments();
				}
			}

			setState(798);
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
		enterRule(_localctx, 94, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			methodCall0();
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(801);
				match(T__8);
				setState(802);
				methodCall0();
				}
				}
				setState(807);
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
		enterRule(_localctx, 96, RULE_constructorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(T__14);
			setState(809);
			name();
			setState(810);
			match(T__12);
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 4323539219117506565L) != 0)) {
				{
				setState(811);
				arguments();
				}
			}

			setState(814);
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
		enterRule(_localctx, 98, RULE_expression);
		try {
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				primaryExpresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				logicalOr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
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
		enterRule(_localctx, 100, RULE_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(821);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(822);
				logicalAnd();
				}
				break;
			}
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(825);
				match(OR);
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(826);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(827);
					logicalAnd();
					}
					break;
				case 3:
					{
					setState(828);
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
		enterRule(_localctx, 102, RULE_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(833);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(834);
				logicalXor();
				}
				break;
			}
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(837);
				match(AND);
				setState(841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(838);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(839);
					logicalXor();
					}
					break;
				case 3:
					{
					setState(840);
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
		enterRule(_localctx, 104, RULE_logicalXor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(845);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(846);
				logicalNot();
				}
				break;
			}
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XOR) {
				{
				setState(849);
				match(XOR);
				setState(853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(850);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(851);
					logicalNot();
					}
					break;
				case 3:
					{
					setState(852);
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
		enterRule(_localctx, 106, RULE_logicalNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(857);
				match(NOT);
				}
			}

			setState(860);
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
		enterRule(_localctx, 108, RULE_primaryExpresion);
		try {
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(865);
				varAccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(866);
				match(T__12);
				setState(867);
				expression();
				setState(868);
				match(T__13);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(870);
				constructorCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(871);
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
		enterRule(_localctx, 110, RULE_arithCondExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			arithmeticExpression();
			setState(875);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(876);
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
		enterRule(_localctx, 112, RULE_arithmeticExpression);
		try {
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				numberExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
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
		enterRule(_localctx, 114, RULE_addSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			modDivExpression();
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(883);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(884);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(885);
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
		enterRule(_localctx, 116, RULE_modDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			mulDivExpression();
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIV || _la==MOD) {
				{
				setState(891);
				_la = _input.LA(1);
				if ( !(_la==DIV || _la==MOD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(892);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(893);
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
		enterRule(_localctx, 118, RULE_mulDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			powerExpression();
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLY || _la==DIVIDE) {
				{
				setState(899);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(900);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(901);
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
		enterRule(_localctx, 120, RULE_powerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			numberExpression();
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(907);
				match(POWER);
				setState(910);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(908);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(909);
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
		enterRule(_localctx, 122, RULE_numberExpression);
		int _la;
		try {
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(914);
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

				setState(924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(917);
					methodCall();
					}
					break;
				case 2:
					{
					setState(918);
					name();
					}
					break;
				case 3:
					{
					setState(919);
					numeric_value();
					}
					break;
				case 4:
					{
					{
					setState(920);
					match(T__12);
					setState(921);
					arithmeticExpression();
					setState(922);
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
				setState(926);
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
		enterRule(_localctx, 124, RULE_incrExpression);
		try {
			setState(949);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(933);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(929);
					match(PLUS);
					setState(930);
					match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(931);
					match(MINUS);
					setState(932);
					match(MINUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(937);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(935);
					name();
					}
					break;
				case 2:
					{
					setState(936);
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
				setState(941);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(939);
					name();
					}
					break;
				case 2:
					{
					setState(940);
					varAccess();
					}
					break;
				}
				setState(947);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(943);
					match(PLUS);
					setState(944);
					match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(945);
					match(MINUS);
					setState(946);
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
		enterRule(_localctx, 126, RULE_name);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				dot_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
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
		enterRule(_localctx, 128, RULE_dot_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(NAME0);
			setState(958); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(956);
				match(T__8);
				setState(957);
				match(NAME0);
				}
				}
				setState(960); 
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
		enterRule(_localctx, 130, RULE_numeric_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
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
		"\u0004\u0001M\u03c5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0001\u0000\u0003\u0000\u0086\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u008c\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001\u0091\b\u0001\u000b\u0001\f\u0001\u0092\u0001"+
		"\u0002\u0005\u0002\u0096\b\u0002\n\u0002\f\u0002\u0099\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009f\b\u0003\u0001\u0003"+
		"\u0004\u0003\u00a2\b\u0003\u000b\u0003\f\u0003\u00a3\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00aa\b\u0004\n\u0004\f\u0004"+
		"\u00ad\t\u0004\u0001\u0004\u0004\u0004\u00b0\b\u0004\u000b\u0004\f\u0004"+
		"\u00b1\u0003\u0004\u00b4\b\u0004\u0001\u0004\u0003\u0004\u00b7\b\u0004"+
		"\u0001\u0004\u0003\u0004\u00ba\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00be\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c2\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00c9"+
		"\b\u0005\n\u0005\f\u0005\u00cc\t\u0005\u0003\u0005\u00ce\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00d2\b\u0005\n\u0005\f\u0005\u00d5\t\u0005"+
		"\u0001\u0005\u0003\u0005\u00d8\b\u0005\u0001\u0005\u0005\u0005\u00db\b"+
		"\u0005\n\u0005\f\u0005\u00de\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00e9\b\u0006\n\u0006\f\u0006\u00ec\t\u0006\u0003\u0006\u00ee"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00f2\b\u0006\n\u0006\f\u0006"+
		"\u00f5\t\u0006\u0001\u0006\u0003\u0006\u00f8\b\u0006\u0001\u0006\u0005"+
		"\u0006\u00fb\b\u0006\n\u0006\f\u0006\u00fe\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0105\b\u0007\u0001\u0007"+
		"\u0004\u0007\u0108\b\u0007\u000b\u0007\f\u0007\u0109\u0004\u0007\u010c"+
		"\b\u0007\u000b\u0007\f\u0007\u010d\u0001\b\u0005\b\u0111\b\b\n\b\f\b\u0114"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u011a\b\t\u0001\t\u0004\t"+
		"\u011d\b\t\u000b\t\f\t\u011e\u0001\t\u0003\t\u0122\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u012b\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0134\b\f"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u0139\b\r\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u013d\b\u000e\u000b\u000e\f\u000e\u013e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0147\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u014d\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0154\b\u0010\n\u0010\f\u0010\u0157\t\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u015b\b\u0010\n\u0010\f\u0010\u015e\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0167\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u016c\b"+
		"\u0011\n\u0011\f\u0011\u016f\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0173\b\u0011\n\u0011\f\u0011\u0176\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u017d\b\u0012\n\u0012\f\u0012"+
		"\u0180\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0187\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u018b\b"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0190\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u01a3"+
		"\b\u0017\u000b\u0017\f\u0017\u01a4\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01ad\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u01b5\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0004\u001a"+
		"\u01bb\b\u001a\u000b\u001a\f\u001a\u01bc\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01cd\b\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u01d1\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u01d8\b\u001e\n\u001e\f\u001e\u01db\t\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u01df\b\u001e\n\u001e\f\u001e\u01e2\t\u001e\u0001\u001e\u0004\u001e"+
		"\u01e5\b\u001e\u000b\u001e\f\u001e\u01e6\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01ed\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u01f2\b\u001f\n\u001f\f\u001f\u01f5\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u01f9\b\u001f\n\u001f\f\u001f\u01fc\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0201\b\u001f\n\u001f\f\u001f"+
		"\u0204\t\u001f\u0001\u001f\u0003\u001f\u0207\b\u001f\u0001\u001f\u0005"+
		"\u001f\u020a\b\u001f\n\u001f\f\u001f\u020d\t\u001f\u0001 \u0001 \u0003"+
		" \u0211\b \u0001 \u0001 \u0005 \u0215\b \n \f \u0218\t \u0001 \u0001 "+
		"\u0005 \u021c\b \n \f \u021f\t \u0001 \u0001 \u0001 \u0003 \u0224\b \u0001"+
		" \u0005 \u0227\b \n \f \u022a\t \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0005 \u0232\b \n \f \u0235\t \u0001 \u0001 \u0005 \u0239\b \n \f \u023c"+
		"\t \u0001 \u0001 \u0001 \u0003 \u0241\b \u0001 \u0005 \u0244\b \n \f "+
		"\u0247\t \u0001 \u0001 \u0001 \u0005 \u024c\b \n \f \u024f\t \u0001 \u0001"+
		" \u0005 \u0253\b \n \f \u0256\t \u0001 \u0001 \u0001 \u0003 \u025b\b "+
		"\u0001 \u0001 \u0003 \u025f\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u0268\b!\u0001\"\u0005\"\u026b\b\"\n\"\f\"\u026e\t\"\u0001"+
		"\"\u0001\"\u0005\"\u0272\b\"\n\"\f\"\u0275\t\"\u0001\"\u0001\"\u0005\""+
		"\u0279\b\"\n\"\f\"\u027c\t\"\u0001\"\u0001\"\u0001\"\u0003\"\u0281\b\""+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0288\b#\n#\f#\u028b\t#\u0001"+
		"#\u0001#\u0005#\u028f\b#\n#\f#\u0292\t#\u0001#\u0001#\u0005#\u0296\b#"+
		"\n#\f#\u0299\t#\u0001#\u0001#\u0001#\u0003#\u029e\b#\u0001$\u0001$\u0001"+
		"$\u0003$\u02a3\b$\u0001$\u0001$\u0003$\u02a7\b$\u0001$\u0001$\u0003$\u02ab"+
		"\b$\u0001$\u0001$\u0005$\u02af\b$\n$\f$\u02b2\t$\u0001$\u0001$\u0005$"+
		"\u02b6\b$\n$\f$\u02b9\t$\u0001$\u0001$\u0001$\u0001$\u0003$\u02bf\b$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0005%\u02cc\b%\n%\f%\u02cf\t%\u0001%\u0001%\u0005%\u02d3\b%\n%\f%\u02d6"+
		"\t%\u0001%\u0001%\u0001%\u0001%\u0003%\u02dc\b%\u0001&\u0003&\u02df\b"+
		"&\u0001&\u0003&\u02e2\b&\u0001&\u0003&\u02e5\b&\u0001\'\u0001\'\u0003"+
		"\'\u02e9\b\'\u0001\'\u0001\'\u0005\'\u02ed\b\'\n\'\f\'\u02f0\t\'\u0001"+
		"(\u0001(\u0003(\u02f4\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u02fb"+
		"\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u0307\b*\u0001+\u0001+\u0001,\u0001,\u0001,\u0005,\u030e\b,\n"+
		",\f,\u0311\t,\u0001-\u0001-\u0001.\u0001.\u0001.\u0003.\u0318\b.\u0001"+
		".\u0001.\u0001.\u0003.\u031d\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0005"+
		"/\u0324\b/\n/\f/\u0327\t/\u00010\u00010\u00010\u00010\u00030\u032d\b0"+
		"\u00010\u00010\u00011\u00011\u00011\u00031\u0334\b1\u00012\u00012\u0003"+
		"2\u0338\b2\u00012\u00012\u00012\u00012\u00032\u033e\b2\u00032\u0340\b"+
		"2\u00013\u00013\u00033\u0344\b3\u00013\u00013\u00013\u00013\u00033\u034a"+
		"\b3\u00033\u034c\b3\u00014\u00014\u00034\u0350\b4\u00014\u00014\u0001"+
		"4\u00014\u00034\u0356\b4\u00034\u0358\b4\u00015\u00035\u035b\b5\u0001"+
		"5\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00036\u0369\b6\u00017\u00017\u00017\u00017\u00018\u00018\u0003"+
		"8\u0371\b8\u00019\u00019\u00019\u00019\u00039\u0377\b9\u00039\u0379\b"+
		"9\u0001:\u0001:\u0001:\u0001:\u0003:\u037f\b:\u0003:\u0381\b:\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u0387\b;\u0003;\u0389\b;\u0001<\u0001<\u0001<\u0001"+
		"<\u0003<\u038f\b<\u0003<\u0391\b<\u0001=\u0003=\u0394\b=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u039d\b=\u0001=\u0003=\u03a0"+
		"\b=\u0001>\u0001>\u0001>\u0001>\u0003>\u03a6\b>\u0001>\u0001>\u0003>\u03aa"+
		"\b>\u0001>\u0001>\u0003>\u03ae\b>\u0001>\u0001>\u0001>\u0001>\u0003>\u03b4"+
		"\b>\u0003>\u03b6\b>\u0001?\u0001?\u0003?\u03ba\b?\u0001@\u0001@\u0001"+
		"@\u0004@\u03bf\b@\u000b@\f@\u03c0\u0001A\u0001A\u0001A\u0000\u0000B\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0000"+
		"\b\u0001\u000078\u0001\u000024\u0001\u0000)*\u0001\u0000=B\u0001\u0000"+
		"-.\u0001\u0000+,\u0001\u0000/0\u0001\u0000GH\u042c\u0000\u0085\u0001\u0000"+
		"\u0000\u0000\u0002\u008d\u0001\u0000\u0000\u0000\u0004\u0097\u0001\u0000"+
		"\u0000\u0000\u0006\u009a\u0001\u0000\u0000\u0000\b\u00b3\u0001\u0000\u0000"+
		"\u0000\n\u00bb\u0001\u0000\u0000\u0000\f\u00e1\u0001\u0000\u0000\u0000"+
		"\u000e\u010b\u0001\u0000\u0000\u0000\u0010\u0112\u0001\u0000\u0000\u0000"+
		"\u0012\u0119\u0001\u0000\u0000\u0000\u0014\u012a\u0001\u0000\u0000\u0000"+
		"\u0016\u012c\u0001\u0000\u0000\u0000\u0018\u0133\u0001\u0000\u0000\u0000"+
		"\u001a\u0135\u0001\u0000\u0000\u0000\u001c\u013a\u0001\u0000\u0000\u0000"+
		"\u001e\u0140\u0001\u0000\u0000\u0000 \u0144\u0001\u0000\u0000\u0000\""+
		"\u0161\u0001\u0000\u0000\u0000$\u0179\u0001\u0000\u0000\u0000&\u0181\u0001"+
		"\u0000\u0000\u0000(\u018a\u0001\u0000\u0000\u0000*\u018c\u0001\u0000\u0000"+
		"\u0000,\u0191\u0001\u0000\u0000\u0000.\u0198\u0001\u0000\u0000\u00000"+
		"\u01a9\u0001\u0000\u0000\u00002\u01ae\u0001\u0000\u0000\u00004\u01b6\u0001"+
		"\u0000\u0000\u00006\u01c1\u0001\u0000\u0000\u00008\u01cc\u0001\u0000\u0000"+
		"\u0000:\u01ce\u0001\u0000\u0000\u0000<\u01d2\u0001\u0000\u0000\u0000>"+
		"\u01ec\u0001\u0000\u0000\u0000@\u020e\u0001\u0000\u0000\u0000B\u0260\u0001"+
		"\u0000\u0000\u0000D\u026c\u0001\u0000\u0000\u0000F\u0282\u0001\u0000\u0000"+
		"\u0000H\u029f\u0001\u0000\u0000\u0000J\u02c0\u0001\u0000\u0000\u0000L"+
		"\u02de\u0001\u0000\u0000\u0000N\u02e8\u0001\u0000\u0000\u0000P\u02f3\u0001"+
		"\u0000\u0000\u0000R\u02f5\u0001\u0000\u0000\u0000T\u0306\u0001\u0000\u0000"+
		"\u0000V\u0308\u0001\u0000\u0000\u0000X\u030a\u0001\u0000\u0000\u0000Z"+
		"\u0312\u0001\u0000\u0000\u0000\\\u0317\u0001\u0000\u0000\u0000^\u0320"+
		"\u0001\u0000\u0000\u0000`\u0328\u0001\u0000\u0000\u0000b\u0333\u0001\u0000"+
		"\u0000\u0000d\u0337\u0001\u0000\u0000\u0000f\u0343\u0001\u0000\u0000\u0000"+
		"h\u034f\u0001\u0000\u0000\u0000j\u035a\u0001\u0000\u0000\u0000l\u0368"+
		"\u0001\u0000\u0000\u0000n\u036a\u0001\u0000\u0000\u0000p\u0370\u0001\u0000"+
		"\u0000\u0000r\u0372\u0001\u0000\u0000\u0000t\u037a\u0001\u0000\u0000\u0000"+
		"v\u0382\u0001\u0000\u0000\u0000x\u038a\u0001\u0000\u0000\u0000z\u039f"+
		"\u0001\u0000\u0000\u0000|\u03b5\u0001\u0000\u0000\u0000~\u03b9\u0001\u0000"+
		"\u0000\u0000\u0080\u03bb\u0001\u0000\u0000\u0000\u0082\u03c2\u0001\u0000"+
		"\u0000\u0000\u0084\u0086\u0003\u0002\u0001\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u008b\u0003\u0004\u0002\u0000\u0088\u008c\u0003\n\u0005"+
		"\u0000\u0089\u008c\u0003\f\u0006\u0000\u008a\u008c\u0003\b\u0004\u0000"+
		"\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0001\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\u0001\u0000\u0000\u008e\u0090\u0003~?\u0000\u008f\u0091"+
		"\u0005K\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0003\u0001\u0000\u0000\u0000\u0094\u0096\u0003"+
		"\u0006\u0003\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0005\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\u0002\u0000\u0000\u009b\u009e\u0003"+
		"~?\u0000\u009c\u009d\u0005\u001b\u0000\u0000\u009d\u009f\u0003~?\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005K\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u0007\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0003\u0000\u0000\u00a6"+
		"\u00ab\u0003~?\u0000\u00a7\u00a8\u0005\u0004\u0000\u0000\u00a8\u00aa\u0003"+
		"~?\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b0\u0005K\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b3\u00a5\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b7\u0003\u000e\u0007\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00ba\u0003\u0010\b\u0000\u00b9"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\t\u0001\u0000\u0000\u0000\u00bb\u00c1\u0003L&\u0000\u00bc\u00be\u0005"+
		"D\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c2\u0005C\u0000"+
		"\u0000\u00c0\u00c2\u0005F\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u00cd\u0003~?\u0000\u00c4\u00c5\u0005\u0005\u0000\u0000\u00c5\u00ca"+
		"\u0003~?\u0000\u00c6\u00c7\u0005\u0004\u0000\u0000\u00c7\u00c9\u0003~"+
		"?\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cd\u00c4\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d3\u0005\u0006\u0000"+
		"\u0000\u00d0\u00d2\u0005K\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d8\u0003\u000e\u0007\u0000"+
		"\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00dc\u0001\u0000\u0000\u0000\u00d9\u00db\u0005K\u0000\u0000\u00da"+
		"\u00d9\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"\u00df\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005\u0007\u0000\u0000\u00e0\u000b\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0003L&\u0000\u00e2\u00e3\u0005E\u0000\u0000\u00e3\u00ed\u0003"+
		"~?\u0000\u00e4\u00e5\u0005\u0005\u0000\u0000\u00e5\u00ea\u0003~?\u0000"+
		"\u00e6\u00e7\u0005\u0004\u0000\u0000\u00e7\u00e9\u0003~?\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00e4"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f3\u0005\u0006\u0000\u0000\u00f0\u00f2"+
		"\u0005K\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f8\u0003\u000e\u0007\u0000\u00f7\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fc\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fb\u0005K\u0000\u0000\u00fa\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0007"+
		"\u0000\u0000\u0100\r\u0001\u0000\u0000\u0000\u0101\u0105\u0003(\u0014"+
		"\u0000\u0102\u0105\u0003 \u0010\u0000\u0103\u0105\u0003\"\u0011\u0000"+
		"\u0104\u0101\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000"+
		"\u0106\u0108\u0005K\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0001\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b"+
		"\u0104\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e"+
		"\u000f\u0001\u0000\u0000\u0000\u010f\u0111\u0003\u0012\t\u0000\u0110\u010f"+
		"\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0011"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u011a"+
		"\u0003(\u0014\u0000\u0116\u011a\u0003\u0018\f\u0000\u0117\u011a\u0003"+
		"^/\u0000\u0118\u011a\u00038\u001c\u0000\u0119\u0115\u0001\u0000\u0000"+
		"\u0000\u0119\u0116\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u0121\u0001\u0000\u0000"+
		"\u0000\u011b\u011d\u0005K\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000"+
		"\u0120\u0122\u0005\u0000\u0000\u0001\u0121\u011c\u0001\u0000\u0000\u0000"+
		"\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0013\u0001\u0000\u0000\u0000"+
		"\u0123\u012b\u0003\u0016\u000b\u0000\u0124\u012b\u0005J\u0000\u0000\u0125"+
		"\u012b\u0003b1\u0000\u0126\u012b\u0003p8\u0000\u0127\u012b\u0003~?\u0000"+
		"\u0128\u012b\u0003P(\u0000\u0129\u012b\u0003\u001c\u000e\u0000\u012a\u0123"+
		"\u0001\u0000\u0000\u0000\u012a\u0124\u0001\u0000\u0000\u0000\u012a\u0125"+
		"\u0001\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012a\u0127"+
		"\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129"+
		"\u0001\u0000\u0000\u0000\u012b\u0015\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0007\u0000\u0000\u0000\u012d\u0017\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0003\u001a\r\u0000\u012f\u0130\u0005\b\u0000\u0000\u0130\u0131\u0003"+
		"\u0014\n\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0134\u0003|"+
		">\u0000\u0133\u012e\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000"+
		"\u0000\u0134\u0019\u0001\u0000\u0000\u0000\u0135\u0138\u0005I\u0000\u0000"+
		"\u0136\u0137\u0005\t\u0000\u0000\u0137\u0139\u0003\u001a\r\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139"+
		"\u001b\u0001\u0000\u0000\u0000\u013a\u013c\u0003\u001a\r\u0000\u013b\u013d"+
		"\u0003\u001e\u000f\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u001d\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0005\n\u0000\u0000\u0141\u0142\u0003p8\u0000\u0142\u0143\u0005\u000b"+
		"\u0000\u0000\u0143\u001f\u0001\u0000\u0000\u0000\u0144\u0146\u0003L&\u0000"+
		"\u0145\u0147\u0005D\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0005\f\u0000\u0000\u0149\u014a\u0003~?\u0000\u014a\u014c\u0005"+
		"\r\u0000\u0000\u014b\u014d\u0003$\u0012\u0000\u014c\u014b\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0005\u000e\u0000\u0000\u014f\u0150\u0005\u0005"+
		"\u0000\u0000\u0150\u0151\u0003N\'\u0000\u0151\u0155\u0005\u0006\u0000"+
		"\u0000\u0152\u0154\u0005K\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000"+
		"\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015c\u0003\u0010\b\u0000\u0159"+
		"\u015b\u0005K\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b\u015e"+
		"\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e\u015c"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0007\u0000\u0000\u0160!\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0003L&\u0000\u0162\u0163\u0005\u000f\u0000"+
		"\u0000\u0163\u0164\u0003~?\u0000\u0164\u0166\u0005\r\u0000\u0000\u0165"+
		"\u0167\u0003$\u0012\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169"+
		"\u0005\u000e\u0000\u0000\u0169\u016d\u0005\u0006\u0000\u0000\u016a\u016c"+
		"\u0005K\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016f\u0001"+
		"\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001"+
		"\u0000\u0000\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u016d\u0001"+
		"\u0000\u0000\u0000\u0170\u0174\u0003\u0010\b\u0000\u0171\u0173\u0005K"+
		"\u0000\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000"+
		"\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000"+
		"\u0000\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0005\u0007\u0000\u0000\u0178#\u0001\u0000\u0000"+
		"\u0000\u0179\u017e\u0003&\u0013\u0000\u017a\u017b\u0005\u0004\u0000\u0000"+
		"\u017b\u017d\u0003&\u0013\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d"+
		"\u0180\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f%\u0001\u0000\u0000\u0000\u0180\u017e"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0003~?\u0000\u0182\u0183\u0005\u0005"+
		"\u0000\u0000\u0183\u0186\u0003N\'\u0000\u0184\u0185\u0005\b\u0000\u0000"+
		"\u0185\u0187\u0003\u0014\n\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u0187\'\u0001\u0000\u0000\u0000\u0188\u018b"+
		"\u00030\u0018\u0000\u0189\u018b\u0003*\u0015\u0000\u018a\u0188\u0001\u0000"+
		"\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b)\u0001\u0000\u0000"+
		"\u0000\u018c\u018f\u0003L&\u0000\u018d\u0190\u0003,\u0016\u0000\u018e"+
		"\u0190\u0003.\u0017\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u018e"+
		"\u0001\u0000\u0000\u0000\u0190+\u0001\u0000\u0000\u0000\u0191\u0192\u0005"+
		"\u0010\u0000\u0000\u0192\u0193\u0003~?\u0000\u0193\u0194\u0005\u0005\u0000"+
		"\u0000\u0194\u0195\u0003N\'\u0000\u0195\u0196\u0005\b\u0000\u0000\u0196"+
		"\u0197\u0003\u0014\n\u0000\u0197-\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0005\u0010\u0000\u0000\u0199\u019a\u0003~?\u0000\u019a\u019b\u0005\b"+
		"\u0000\u0000\u019b\u019c\u0003\u0014\n\u0000\u019c\u01a2\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0005\u0004\u0000\u0000\u019e\u019f\u0003~?\u0000\u019f"+
		"\u01a0\u0005\b\u0000\u0000\u01a0\u01a1\u0003\u0014\n\u0000\u01a1\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a2\u019d\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0005\u0005\u0000\u0000\u01a7\u01a8\u0003N\'\u0000\u01a8/\u0001\u0000"+
		"\u0000\u0000\u01a9\u01ac\u0003L&\u0000\u01aa\u01ad\u00032\u0019\u0000"+
		"\u01ab\u01ad\u00034\u001a\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ad1\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0005\u0011\u0000\u0000\u01af\u01b0\u0003~?\u0000\u01b0\u01b1\u0005\u0005"+
		"\u0000\u0000\u01b1\u01b4\u0003N\'\u0000\u01b2\u01b3\u0005\b\u0000\u0000"+
		"\u01b3\u01b5\u0003\u0014\n\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b53\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0005\u0011\u0000\u0000\u01b7\u01ba\u00036\u001b\u0000\u01b8\u01b9\u0005"+
		"\u0004\u0000\u0000\u01b9\u01bb\u00036\u001b\u0000\u01ba\u01b8\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0005\u0005\u0000\u0000\u01bf\u01c0\u0003N\'"+
		"\u0000\u01c05\u0001\u0000\u0000\u0000\u01c1\u01c2\u0003~?\u0000\u01c2"+
		"\u01c3\u0005\b\u0000\u0000\u01c3\u01c4\u0003\u0014\n\u0000\u01c47\u0001"+
		"\u0000\u0000\u0000\u01c5\u01cd\u0003B!\u0000\u01c6\u01cd\u0003<\u001e"+
		"\u0000\u01c7\u01cd\u0003H$\u0000\u01c8\u01cd\u0003J%\u0000\u01c9\u01cd"+
		"\u0003:\u001d\u0000\u01ca\u01cd\u0003F#\u0000\u01cb\u01cd\u0003@ \u0000"+
		"\u01cc\u01c5\u0001\u0000\u0000\u0000\u01cc\u01c6\u0001\u0000\u0000\u0000"+
		"\u01cc\u01c7\u0001\u0000\u0000\u0000\u01cc\u01c8\u0001\u0000\u0000\u0000"+
		"\u01cc\u01c9\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd9\u0001\u0000\u0000\u0000\u01ce"+
		"\u01d0\u0005\u0012\u0000\u0000\u01cf\u01d1\u0003\u0014\n\u0000\u01d0\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1;\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0005\u001f\u0000\u0000\u01d3\u01d4\u0005"+
		"\r\u0000\u0000\u01d4\u01d5\u0003\u0014\n\u0000\u01d5\u01d9\u0005\u000e"+
		"\u0000\u0000\u01d6\u01d8\u0005K\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001\u0000\u0000"+
		"\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01e0\u0005\u0006\u0000"+
		"\u0000\u01dd\u01df\u0005K\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000"+
		"\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e5\u0003>\u001f\u0000\u01e4"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005\u0007\u0000\u0000\u01e9"+
		"=\u0001\u0000\u0000\u0000\u01ea\u01ed\u0003\u0014\n\u0000\u01eb\u01ed"+
		"\u0005\u0013\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u0206"+
		"\u0005\u0014\u0000\u0000\u01ef\u01f3\u0005\u0006\u0000\u0000\u01f0\u01f2"+
		"\u0005K\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f6\u01fa\u0003\u0010\b\u0000\u01f7\u01f9\u0005K"+
		"\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fe\u0005\u0007\u0000\u0000\u01fe\u0207\u0001\u0000"+
		"\u0000\u0000\u01ff\u0201\u0005K\u0000\u0000\u0200\u01ff\u0001\u0000\u0000"+
		"\u0000\u0201\u0204\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u0001\u0000\u0000"+
		"\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0207\u0003\u0012\t\u0000"+
		"\u0206\u01ef\u0001\u0000\u0000\u0000\u0206\u0202\u0001\u0000\u0000\u0000"+
		"\u0207\u020b\u0001\u0000\u0000\u0000\u0208\u020a\u0005K\u0000\u0000\u0209"+
		"\u0208\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000\u0000\u020b"+
		"\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c"+
		"?\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0210"+
		"\u0005\u0015\u0000\u0000\u020f\u0211\u0003\u0018\f\u0000\u0210\u020f\u0001"+
		"\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0223\u0001"+
		"\u0000\u0000\u0000\u0212\u0216\u0005\u0006\u0000\u0000\u0213\u0215\u0005"+
		"K\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0215\u0218\u0001\u0000"+
		"\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000"+
		"\u0000\u0000\u0217\u0219\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000"+
		"\u0000\u0000\u0219\u021d\u0003\u0010\b\u0000\u021a\u021c\u0005K\u0000"+
		"\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021c\u021f\u0001\u0000\u0000"+
		"\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000"+
		"\u0000\u021e\u0220\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000"+
		"\u0000\u0220\u0221\u0005\u0007\u0000\u0000\u0221\u0224\u0001\u0000\u0000"+
		"\u0000\u0222\u0224\u0003\u0012\t\u0000\u0223\u0212\u0001\u0000\u0000\u0000"+
		"\u0223\u0222\u0001\u0000\u0000\u0000\u0224\u0228\u0001\u0000\u0000\u0000"+
		"\u0225\u0227\u0005K\u0000\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227"+
		"\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0001\u0000\u0000\u0000\u0229\u022b\u0001\u0000\u0000\u0000\u022a"+
		"\u0228\u0001\u0000\u0000\u0000\u022b\u022c\u0005\u0016\u0000\u0000\u022c"+
		"\u022d\u0005\r\u0000\u0000\u022d\u022e\u0003&\u0013\u0000\u022e\u0240"+
		"\u0005\u000e\u0000\u0000\u022f\u0233\u0005\u0006\u0000\u0000\u0230\u0232"+
		"\u0005K\u0000\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0232\u0235\u0001"+
		"\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001"+
		"\u0000\u0000\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235\u0233\u0001"+
		"\u0000\u0000\u0000\u0236\u023a\u0003\u0010\b\u0000\u0237\u0239\u0005K"+
		"\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239\u023c\u0001\u0000"+
		"\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000"+
		"\u0000\u0000\u023b\u023d\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0005\u0007\u0000\u0000\u023e\u0241\u0001\u0000"+
		"\u0000\u0000\u023f\u0241\u0003\u0012\t\u0000\u0240\u022f\u0001\u0000\u0000"+
		"\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241\u0245\u0001\u0000\u0000"+
		"\u0000\u0242\u0244\u0005K\u0000\u0000\u0243\u0242\u0001\u0000\u0000\u0000"+
		"\u0244\u0247\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u025e\u0001\u0000\u0000\u0000"+
		"\u0247\u0245\u0001\u0000\u0000\u0000\u0248\u025a\u0005\u0017\u0000\u0000"+
		"\u0249\u024d\u0005\u0006\u0000\u0000\u024a\u024c\u0005K\u0000\u0000\u024b"+
		"\u024a\u0001\u0000\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000\u024d"+
		"\u024b\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e"+
		"\u0250\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250"+
		"\u0254\u0003\u0010\b\u0000\u0251\u0253\u0005K\u0000\u0000\u0252\u0251"+
		"\u0001\u0000\u0000\u0000\u0253\u0256\u0001\u0000\u0000\u0000\u0254\u0252"+
		"\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0257"+
		"\u0001\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0005\u0007\u0000\u0000\u0258\u025b\u0001\u0000\u0000\u0000\u0259\u025b"+
		"\u0003\u0012\t\u0000\u025a\u0249\u0001\u0000\u0000\u0000\u025a\u0259\u0001"+
		"\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025d\u0005"+
		"K\u0000\u0000\u025d\u025f\u0001\u0000\u0000\u0000\u025e\u0248\u0001\u0000"+
		"\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025fA\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u0005\u001d\u0000\u0000\u0261\u0262\u0005\r\u0000\u0000"+
		"\u0262\u0263\u0003b1\u0000\u0263\u0264\u0005\u000e\u0000\u0000\u0264\u0267"+
		"\u0003D\"\u0000\u0265\u0266\u0005\u001e\u0000\u0000\u0266\u0268\u0003"+
		"D\"\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000"+
		"\u0000\u0000\u0268C\u0001\u0000\u0000\u0000\u0269\u026b\u0005K\u0000\u0000"+
		"\u026a\u0269\u0001\u0000\u0000\u0000\u026b\u026e\u0001\u0000\u0000\u0000"+
		"\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000"+
		"\u026d\u0280\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000"+
		"\u026f\u0273\u0005\u0006\u0000\u0000\u0270\u0272\u0005K\u0000\u0000\u0271"+
		"\u0270\u0001\u0000\u0000\u0000\u0272\u0275\u0001\u0000\u0000\u0000\u0273"+
		"\u0271\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274"+
		"\u0276\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0276"+
		"\u027a\u0003\u0010\b\u0000\u0277\u0279\u0005K\u0000\u0000\u0278\u0277"+
		"\u0001\u0000\u0000\u0000\u0279\u027c\u0001\u0000\u0000\u0000\u027a\u0278"+
		"\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027d"+
		"\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027d\u027e"+
		"\u0005\u0007\u0000\u0000\u027e\u0281\u0001\u0000\u0000\u0000\u027f\u0281"+
		"\u0003\u0012\t\u0000\u0280\u026f\u0001\u0000\u0000\u0000\u0280\u027f\u0001"+
		"\u0000\u0000\u0000\u0281E\u0001\u0000\u0000\u0000\u0282\u0283\u0005\u0018"+
		"\u0000\u0000\u0283\u0284\u0005\r\u0000\u0000\u0284\u0285\u0003b1\u0000"+
		"\u0285\u0289\u0005\u000e\u0000\u0000\u0286\u0288\u0005K\u0000\u0000\u0287"+
		"\u0286\u0001\u0000\u0000\u0000\u0288\u028b\u0001\u0000\u0000\u0000\u0289"+
		"\u0287\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a"+
		"\u029d\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028c"+
		"\u0290\u0005\u0006\u0000\u0000\u028d\u028f\u0005K\u0000\u0000\u028e\u028d"+
		"\u0001\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000\u0000\u0290\u028e"+
		"\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0293"+
		"\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0293\u0297"+
		"\u0003\u0010\b\u0000\u0294\u0296\u0005K\u0000\u0000\u0295\u0294\u0001"+
		"\u0000\u0000\u0000\u0296\u0299\u0001\u0000\u0000\u0000\u0297\u0295\u0001"+
		"\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u029a\u0001"+
		"\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u029a\u029b\u0005"+
		"\u0007\u0000\u0000\u029b\u029e\u0001\u0000\u0000\u0000\u029c\u029e\u0003"+
		"\u0012\t\u0000\u029d\u028c\u0001\u0000\u0000\u0000\u029d\u029c\u0001\u0000"+
		"\u0000\u0000\u029eG\u0001\u0000\u0000\u0000\u029f\u02a0\u0005\u001c\u0000"+
		"\u0000\u02a0\u02a2\u0005\r\u0000\u0000\u02a1\u02a3\u00030\u0018\u0000"+
		"\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a6\u0005K\u0000\u0000\u02a5"+
		"\u02a7\u0003b1\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02aa\u0005"+
		"K\u0000\u0000\u02a9\u02ab\u0003\u0018\f\u0000\u02aa\u02a9\u0001\u0000"+
		"\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ac\u02b0\u0005\u000e\u0000\u0000\u02ad\u02af\u0005K\u0000"+
		"\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02af\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b1\u02be\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b7\u0005\u0006\u0000\u0000\u02b4\u02b6\u0005K\u0000\u0000"+
		"\u02b5\u02b4\u0001\u0000\u0000\u0000\u02b6\u02b9\u0001\u0000\u0000\u0000"+
		"\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000"+
		"\u02b8\u02ba\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bb\u0003\u0010\b\u0000\u02bb\u02bc\u0005\u0007\u0000\u0000\u02bc"+
		"\u02bf\u0001\u0000\u0000\u0000\u02bd\u02bf\u0003\u0012\t\u0000\u02be\u02b3"+
		"\u0001\u0000\u0000\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02bfI\u0001"+
		"\u0000\u0000\u0000\u02c0\u02c1\u0005\u001c\u0000\u0000\u02c1\u02c2\u0005"+
		"\r\u0000\u0000\u02c2\u02c3\u0003~?\u0000\u02c3\u02c4\u0005\u0005\u0000"+
		"\u0000\u02c4\u02c5\u0003N\'\u0000\u02c5\u02c6\u0005\u0004\u0000\u0000"+
		"\u02c6\u02c7\u0003\u0014\n\u0000\u02c7\u02c8\u0005\u0019\u0000\u0000\u02c8"+
		"\u02c9\u0003\u0014\n\u0000\u02c9\u02cd\u0005\u000e\u0000\u0000\u02ca\u02cc"+
		"\u0005K\u0000\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000\u02cc\u02cf\u0001"+
		"\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001"+
		"\u0000\u0000\u0000\u02ce\u02db\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001"+
		"\u0000\u0000\u0000\u02d0\u02d4\u0005\u0006\u0000\u0000\u02d1\u02d3\u0005"+
		"K\u0000\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d6\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d7\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d7\u02d8\u0003\u0010\b\u0000\u02d8\u02d9\u0005\u0007\u0000"+
		"\u0000\u02d9\u02dc\u0001\u0000\u0000\u0000\u02da\u02dc\u0003\u0012\t\u0000"+
		"\u02db\u02d0\u0001\u0000\u0000\u0000\u02db\u02da\u0001\u0000\u0000\u0000"+
		"\u02dcK\u0001\u0000\u0000\u0000\u02dd\u02df\u0007\u0001\u0000\u0000\u02de"+
		"\u02dd\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02df"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e0\u02e2\u00055\u0000\u0000\u02e1\u02e0"+
		"\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e5\u00056\u0000\u0000\u02e4\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5M\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e9\u0003P(\u0000\u02e7\u02e9\u0003R)\u0000\u02e8"+
		"\u02e6\u0001\u0000\u0000\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e9"+
		"\u02ee\u0001\u0000\u0000\u0000\u02ea\u02eb\u0005\n\u0000\u0000\u02eb\u02ed"+
		"\u0005\u000b\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ed\u02f0"+
		"\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ef"+
		"\u0001\u0000\u0000\u0000\u02efO\u0001\u0000\u0000\u0000\u02f0\u02ee\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f4\u0003~?\u0000\u02f2\u02f4\u0003T*\u0000"+
		"\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f4Q\u0001\u0000\u0000\u0000\u02f5\u02fa\u0005\u001a\u0000\u0000\u02f6"+
		"\u02fb\u0003P(\u0000\u02f7\u02fb\u0005C\u0000\u0000\u02f8\u02fb\u0005"+
		"E\u0000\u0000\u02f9\u02fb\u0005F\u0000\u0000\u02fa\u02f6\u0001\u0000\u0000"+
		"\u0000\u02fa\u02f7\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000"+
		"\u0000\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fbS\u0001\u0000\u0000\u0000"+
		"\u02fc\u0307\u0005 \u0000\u0000\u02fd\u0307\u0005!\u0000\u0000\u02fe\u0307"+
		"\u0005\"\u0000\u0000\u02ff\u0307\u0005#\u0000\u0000\u0300\u0307\u0005"+
		"$\u0000\u0000\u0301\u0307\u0005%\u0000\u0000\u0302\u0307\u0005&\u0000"+
		"\u0000\u0303\u0307\u0005\'\u0000\u0000\u0304\u0307\u0005(\u0000\u0000"+
		"\u0305\u0307\u0003V+\u0000\u0306\u02fc\u0001\u0000\u0000\u0000\u0306\u02fd"+
		"\u0001\u0000\u0000\u0000\u0306\u02fe\u0001\u0000\u0000\u0000\u0306\u02ff"+
		"\u0001\u0000\u0000\u0000\u0306\u0300\u0001\u0000\u0000\u0000\u0306\u0301"+
		"\u0001\u0000\u0000\u0000\u0306\u0302\u0001\u0000\u0000\u0000\u0306\u0303"+
		"\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0305"+
		"\u0001\u0000\u0000\u0000\u0307U\u0001\u0000\u0000\u0000\u0308\u0309\u0007"+
		"\u0002\u0000\u0000\u0309W\u0001\u0000\u0000\u0000\u030a\u030f\u0003Z-"+
		"\u0000\u030b\u030c\u0005\u0004\u0000\u0000\u030c\u030e\u0003Z-\u0000\u030d"+
		"\u030b\u0001\u0000\u0000\u0000\u030e\u0311\u0001\u0000\u0000\u0000\u030f"+
		"\u030d\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310"+
		"Y\u0001\u0000\u0000\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0312\u0313"+
		"\u0003\u0014\n\u0000\u0313[\u0001\u0000\u0000\u0000\u0314\u0315\u0003"+
		"\u001a\r\u0000\u0315\u0316\u0005\t\u0000\u0000\u0316\u0318\u0001\u0000"+
		"\u0000\u0000\u0317\u0314\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000"+
		"\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u031a\u0005I\u0000"+
		"\u0000\u031a\u031c\u0005\r\u0000\u0000\u031b\u031d\u0003X,\u0000\u031c"+
		"\u031b\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d"+
		"\u031e\u0001\u0000\u0000\u0000\u031e\u031f\u0005\u000e\u0000\u0000\u031f"+
		"]\u0001\u0000\u0000\u0000\u0320\u0325\u0003\\.\u0000\u0321\u0322\u0005"+
		"\t\u0000\u0000\u0322\u0324\u0003\\.\u0000\u0323\u0321\u0001\u0000\u0000"+
		"\u0000\u0324\u0327\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000"+
		"\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326_\u0001\u0000\u0000\u0000"+
		"\u0327\u0325\u0001\u0000\u0000\u0000\u0328\u0329\u0005\u000f\u0000\u0000"+
		"\u0329\u032a\u0003~?\u0000\u032a\u032c\u0005\r\u0000\u0000\u032b\u032d"+
		"\u0003X,\u0000\u032c\u032b\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000"+
		"\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u032f\u0005\u000e"+
		"\u0000\u0000\u032fa\u0001\u0000\u0000\u0000\u0330\u0334\u0003l6\u0000"+
		"\u0331\u0334\u0003d2\u0000\u0332\u0334\u0003n7\u0000\u0333\u0330\u0001"+
		"\u0000\u0000\u0000\u0333\u0331\u0001\u0000\u0000\u0000\u0333\u0332\u0001"+
		"\u0000\u0000\u0000\u0334c\u0001\u0000\u0000\u0000\u0335\u0338\u0003l6"+
		"\u0000\u0336\u0338\u0003f3\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0337"+
		"\u0336\u0001\u0000\u0000\u0000\u0338\u033f\u0001\u0000\u0000\u0000\u0339"+
		"\u033d\u0005:\u0000\u0000\u033a\u033e\u0003l6\u0000\u033b\u033e\u0003"+
		"f3\u0000\u033c\u033e\u0003d2\u0000\u033d\u033a\u0001\u0000\u0000\u0000"+
		"\u033d\u033b\u0001\u0000\u0000\u0000\u033d\u033c\u0001\u0000\u0000\u0000"+
		"\u033e\u0340\u0001\u0000\u0000\u0000\u033f\u0339\u0001\u0000\u0000\u0000"+
		"\u033f\u0340\u0001\u0000\u0000\u0000\u0340e\u0001\u0000\u0000\u0000\u0341"+
		"\u0344\u0003l6\u0000\u0342\u0344\u0003h4\u0000\u0343\u0341\u0001\u0000"+
		"\u0000\u0000\u0343\u0342\u0001\u0000\u0000\u0000\u0344\u034b\u0001\u0000"+
		"\u0000\u0000\u0345\u0349\u00059\u0000\u0000\u0346\u034a\u0003l6\u0000"+
		"\u0347\u034a\u0003h4\u0000\u0348\u034a\u0003f3\u0000\u0349\u0346\u0001"+
		"\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u0349\u0348\u0001"+
		"\u0000\u0000\u0000\u034a\u034c\u0001\u0000\u0000\u0000\u034b\u0345\u0001"+
		"\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034cg\u0001\u0000"+
		"\u0000\u0000\u034d\u0350\u0003l6\u0000\u034e\u0350\u0003j5\u0000\u034f"+
		"\u034d\u0001\u0000\u0000\u0000\u034f\u034e\u0001\u0000\u0000\u0000\u0350"+
		"\u0357\u0001\u0000\u0000\u0000\u0351\u0355\u0005<\u0000\u0000\u0352\u0356"+
		"\u0003l6\u0000\u0353\u0356\u0003j5\u0000\u0354\u0356\u0003h4\u0000\u0355"+
		"\u0352\u0001\u0000\u0000\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355"+
		"\u0354\u0001\u0000\u0000\u0000\u0356\u0358\u0001\u0000\u0000\u0000\u0357"+
		"\u0351\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358"+
		"i\u0001\u0000\u0000\u0000\u0359\u035b\u0005;\u0000\u0000\u035a\u0359\u0001"+
		"\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u035c\u0001"+
		"\u0000\u0000\u0000\u035c\u035d\u0003l6\u0000\u035dk\u0001\u0000\u0000"+
		"\u0000\u035e\u0369\u0003\u0016\u000b\u0000\u035f\u0369\u0003^/\u0000\u0360"+
		"\u0369\u0003~?\u0000\u0361\u0369\u0003\u001a\r\u0000\u0362\u0363\u0005"+
		"\r\u0000\u0000\u0363\u0364\u0003b1\u0000\u0364\u0365\u0005\u000e\u0000"+
		"\u0000\u0365\u0369\u0001\u0000\u0000\u0000\u0366\u0369\u0003`0\u0000\u0367"+
		"\u0369\u0003\u001c\u000e\u0000\u0368\u035e\u0001\u0000\u0000\u0000\u0368"+
		"\u035f\u0001\u0000\u0000\u0000\u0368\u0360\u0001\u0000\u0000\u0000\u0368"+
		"\u0361\u0001\u0000\u0000\u0000\u0368\u0362\u0001\u0000\u0000\u0000\u0368"+
		"\u0366\u0001\u0000\u0000\u0000\u0368\u0367\u0001\u0000\u0000\u0000\u0369"+
		"m\u0001\u0000\u0000\u0000\u036a\u036b\u0003p8\u0000\u036b\u036c\u0007"+
		"\u0003\u0000\u0000\u036c\u036d\u0003p8\u0000\u036do\u0001\u0000\u0000"+
		"\u0000\u036e\u0371\u0003z=\u0000\u036f\u0371\u0003r9\u0000\u0370\u036e"+
		"\u0001\u0000\u0000\u0000\u0370\u036f\u0001\u0000\u0000\u0000\u0371q\u0001"+
		"\u0000\u0000\u0000\u0372\u0378\u0003t:\u0000\u0373\u0376\u0007\u0004\u0000"+
		"\u0000\u0374\u0377\u0003z=\u0000\u0375\u0377\u0003r9\u0000\u0376\u0374"+
		"\u0001\u0000\u0000\u0000\u0376\u0375\u0001\u0000\u0000\u0000\u0377\u0379"+
		"\u0001\u0000\u0000\u0000\u0378\u0373\u0001\u0000\u0000\u0000\u0378\u0379"+
		"\u0001\u0000\u0000\u0000\u0379s\u0001\u0000\u0000\u0000\u037a\u0380\u0003"+
		"v;\u0000\u037b\u037e\u0007\u0005\u0000\u0000\u037c\u037f\u0003z=\u0000"+
		"\u037d\u037f\u0003t:\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037e\u037d"+
		"\u0001\u0000\u0000\u0000\u037f\u0381\u0001\u0000\u0000\u0000\u0380\u037b"+
		"\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381u\u0001"+
		"\u0000\u0000\u0000\u0382\u0388\u0003x<\u0000\u0383\u0386\u0007\u0006\u0000"+
		"\u0000\u0384\u0387\u0003z=\u0000\u0385\u0387\u0003v;\u0000\u0386\u0384"+
		"\u0001\u0000\u0000\u0000\u0386\u0385\u0001\u0000\u0000\u0000\u0387\u0389"+
		"\u0001\u0000\u0000\u0000\u0388\u0383\u0001\u0000\u0000\u0000\u0388\u0389"+
		"\u0001\u0000\u0000\u0000\u0389w\u0001\u0000\u0000\u0000\u038a\u0390\u0003"+
		"z=\u0000\u038b\u038e\u00051\u0000\u0000\u038c\u038f\u0003z=\u0000\u038d"+
		"\u038f\u0003x<\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038e\u038d\u0001"+
		"\u0000\u0000\u0000\u038f\u0391\u0001\u0000\u0000\u0000\u0390\u038b\u0001"+
		"\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391y\u0001\u0000"+
		"\u0000\u0000\u0392\u0394\u0007\u0004\u0000\u0000\u0393\u0392\u0001\u0000"+
		"\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u039c\u0001\u0000"+
		"\u0000\u0000\u0395\u039d\u0003^/\u0000\u0396\u039d\u0003~?\u0000\u0397"+
		"\u039d\u0003\u0082A\u0000\u0398\u0399\u0005\r\u0000\u0000\u0399\u039a"+
		"\u0003p8\u0000\u039a\u039b\u0005\u000e\u0000\u0000\u039b\u039d\u0001\u0000"+
		"\u0000\u0000\u039c\u0395\u0001\u0000\u0000\u0000\u039c\u0396\u0001\u0000"+
		"\u0000\u0000\u039c\u0397\u0001\u0000\u0000\u0000\u039c\u0398\u0001\u0000"+
		"\u0000\u0000\u039d\u03a0\u0001\u0000\u0000\u0000\u039e\u03a0\u0003|>\u0000"+
		"\u039f\u0393\u0001\u0000\u0000\u0000\u039f\u039e\u0001\u0000\u0000\u0000"+
		"\u03a0{\u0001\u0000\u0000\u0000\u03a1\u03a2\u0005-\u0000\u0000\u03a2\u03a6"+
		"\u0005-\u0000\u0000\u03a3\u03a4\u0005.\u0000\u0000\u03a4\u03a6\u0005."+
		"\u0000\u0000\u03a5\u03a1\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a9\u0001\u0000\u0000\u0000\u03a7\u03aa\u0003~?\u0000"+
		"\u03a8\u03aa\u0003\u001a\r\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03a9"+
		"\u03a8\u0001\u0000\u0000\u0000\u03aa\u03b6\u0001\u0000\u0000\u0000\u03ab"+
		"\u03ae\u0003~?\u0000\u03ac\u03ae\u0003\u001a\r\u0000\u03ad\u03ab\u0001"+
		"\u0000\u0000\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ae\u03b3\u0001"+
		"\u0000\u0000\u0000\u03af\u03b0\u0005-\u0000\u0000\u03b0\u03b4\u0005-\u0000"+
		"\u0000\u03b1\u03b2\u0005.\u0000\u0000\u03b2\u03b4\u0005.\u0000\u0000\u03b3"+
		"\u03af\u0001\u0000\u0000\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b4"+
		"\u03b6\u0001\u0000\u0000\u0000\u03b5\u03a5\u0001\u0000\u0000\u0000\u03b5"+
		"\u03ad\u0001\u0000\u0000\u0000\u03b6}\u0001\u0000\u0000\u0000\u03b7\u03ba"+
		"\u0003\u0080@\u0000\u03b8\u03ba\u0005I\u0000\u0000\u03b9\u03b7\u0001\u0000"+
		"\u0000\u0000\u03b9\u03b8\u0001\u0000\u0000\u0000\u03ba\u007f\u0001\u0000"+
		"\u0000\u0000\u03bb\u03be\u0005I\u0000\u0000\u03bc\u03bd\u0005\t\u0000"+
		"\u0000\u03bd\u03bf\u0005I\u0000\u0000\u03be\u03bc\u0001\u0000\u0000\u0000"+
		"\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0\u03be\u0001\u0000\u0000\u0000"+
		"\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u0081\u0001\u0000\u0000\u0000"+
		"\u03c2\u03c3\u0007\u0007\u0000\u0000\u03c3\u0083\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u008b\u0092\u0097\u009e\u00a3\u00ab\u00b1\u00b3\u00b6\u00b9"+
		"\u00bd\u00c1\u00ca\u00cd\u00d3\u00d7\u00dc\u00ea\u00ed\u00f3\u00f7\u00fc"+
		"\u0104\u0109\u010d\u0112\u0119\u011e\u0121\u012a\u0133\u0138\u013e\u0146"+
		"\u014c\u0155\u015c\u0166\u016d\u0174\u017e\u0186\u018a\u018f\u01a4\u01ac"+
		"\u01b4\u01bc\u01cc\u01d0\u01d9\u01e0\u01e6\u01ec\u01f3\u01fa\u0202\u0206"+
		"\u020b\u0210\u0216\u021d\u0223\u0228\u0233\u023a\u0240\u0245\u024d\u0254"+
		"\u025a\u025e\u0267\u026c\u0273\u027a\u0280\u0289\u0290\u0297\u029d\u02a2"+
		"\u02a6\u02aa\u02b0\u02b7\u02be\u02cd\u02d4\u02db\u02de\u02e1\u02e4\u02e8"+
		"\u02ee\u02f3\u02fa\u0306\u030f\u0317\u031c\u0325\u032c\u0333\u0337\u033d"+
		"\u033f\u0343\u0349\u034b\u034f\u0355\u0357\u035a\u0368\u0370\u0376\u0378"+
		"\u037e\u0380\u0386\u0388\u038e\u0390\u0393\u039c\u039f\u03a5\u03a9\u03ad"+
		"\u03b3\u03b5\u03b9\u03c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}