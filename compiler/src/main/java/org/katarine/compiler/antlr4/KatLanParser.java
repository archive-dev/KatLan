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
		T__24=25, T__25=26, AS_KEYWORD=27, FOR_KEYWORD=28, IF_KEYWORD=29, SWITCH_KEYWORD=30, 
		STR=31, BOOL=32, INT=33, FLOAT=34, DOUBLE=35, LONG=36, SHORT=37, BYTE=38, 
		OBJ=39, VOID=40, NULL=41, DIV=42, MOD=43, PLUS=44, MINUS=45, MULTIPLY=46, 
		DIVIDE=47, POWER=48, PUBLIC=49, PRIVATE=50, PROTECTED=51, STATIC=52, FINAL=53, 
		TRUE=54, FALSE=55, AND=56, OR=57, NOT=58, XOR=59, CLASS_KEYWORD=60, ABSTRACT_KEYWORD=61, 
		INTERFACE_KEYWORD=62, ENUM_KEYWORD=63, NUMERIC_VALUE=64, INT_VAL=65, FLOAT_VAL=66, 
		NAME0=67, STRING_VAL=68, ENDLINE=69, WS=70, COMMENT=71;
	public static final int
		RULE_class = 0, RULE_package = 1, RULE_importBlock = 2, RULE_importStatement = 3, 
		RULE_unnamedClassDef = 4, RULE_classDef = 5, RULE_interfaceDef = 6, RULE_classBlock = 7, 
		RULE_block = 8, RULE_lineBlock = 9, RULE_value = 10, RULE_bool = 11, RULE_varAssignment = 12, 
		RULE_varAccess = 13, RULE_arrayAccess = 14, RULE_arrayAccess0 = 15, RULE_methodDef = 16, 
		RULE_constructorDef = 17, RULE_parameters = 18, RULE_parameter = 19, RULE_var = 20, 
		RULE_constDef = 21, RULE_constDef0 = 22, RULE_constDef1 = 23, RULE_varDef = 24, 
		RULE_varDef0 = 25, RULE_varDef1 = 26, RULE_statement = 27, RULE_returnStatement = 28, 
		RULE_switchStatement = 29, RULE_tryCatchFinally = 30, RULE_ifStatement = 31, 
		RULE_whileLoopStatement = 32, RULE_foriLoop = 33, RULE_foriLoop0 = 34, 
		RULE_access = 35, RULE_type = 36, RULE_anyType = 37, RULE_linkType = 38, 
		RULE_primitiveType = 39, RULE_nullType = 40, RULE_arguments = 41, RULE_argument = 42, 
		RULE_methodCall0 = 43, RULE_methodCall = 44, RULE_constructorCall = 45, 
		RULE_expression = 46, RULE_logicalOr = 47, RULE_logicalAnd = 48, RULE_logicalXor = 49, 
		RULE_logicalNot = 50, RULE_primaryExpresion = 51, RULE_arithmeticExpression = 52, 
		RULE_addSubExpression = 53, RULE_modDivExpression = 54, RULE_mulDivExpression = 55, 
		RULE_powerExpression = 56, RULE_numberExpression = 57, RULE_incrExpression = 58, 
		RULE_name = 59, RULE_dot_name = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"class", "package", "importBlock", "importStatement", "unnamedClassDef", 
			"classDef", "interfaceDef", "classBlock", "block", "lineBlock", "value", 
			"bool", "varAssignment", "varAccess", "arrayAccess", "arrayAccess0", 
			"methodDef", "constructorDef", "parameters", "parameter", "var", "constDef", 
			"constDef0", "constDef1", "varDef", "varDef0", "varDef1", "statement", 
			"returnStatement", "switchStatement", "tryCatchFinally", "ifStatement", 
			"whileLoopStatement", "foriLoop", "foriLoop0", "access", "type", "anyType", 
			"linkType", "primitiveType", "nullType", "arguments", "argument", "methodCall0", 
			"methodCall", "constructorCall", "expression", "logicalOr", "logicalAnd", 
			"logicalXor", "logicalNot", "primaryExpresion", "arithmeticExpression", 
			"addSubExpression", "modDivExpression", "mulDivExpression", "powerExpression", 
			"numberExpression", "incrExpression", "name", "dot_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'import'", "'extends'", "','", "':'", "'{'", "'}'", 
			"'='", "'.'", "'['", "']'", "'def'", "'('", "')'", "'const'", "'var'", 
			"'return'", "'default'", "'->'", "'try'", "'catch'", "'finally'", "'while'", 
			"'..'", "'@'", "'new'", "'as'", "'for'", "'if'", "'switch'", "'str'", 
			"'bool'", "'int'", "'float'", "'double'", "'long'", "'short'", "'byte'", 
			"'obj'", "'void'", "'null'", "'div'", "'%'", "'+'", "'-'", "'*'", "'/'", 
			"'**'", null, null, null, "'static'", null, "'true'", "'false'", null, 
			null, null, null, "'class'", "'abstract'", "'interface'", "'enum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "AS_KEYWORD", "FOR_KEYWORD", "IF_KEYWORD", "SWITCH_KEYWORD", 
			"STR", "BOOL", "INT", "FLOAT", "DOUBLE", "LONG", "SHORT", "BYTE", "OBJ", 
			"VOID", "NULL", "DIV", "MOD", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"POWER", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL", "TRUE", 
			"FALSE", "AND", "OR", "NOT", "XOR", "CLASS_KEYWORD", "ABSTRACT_KEYWORD", 
			"INTERFACE_KEYWORD", "ENUM_KEYWORD", "NUMERIC_VALUE", "INT_VAL", "FLOAT_VAL", 
			"NAME0", "STRING_VAL", "ENDLINE", "WS", "COMMENT"
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
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(122);
				package_();
				}
			}

			setState(125);
			importBlock();
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(126);
				classDef();
				}
				break;
			case 2:
				{
				setState(127);
				interfaceDef();
				}
				break;
			case 3:
				{
				setState(128);
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
			setState(131);
			match(T__0);
			setState(132);
			name();
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133);
				match(ENDLINE);
				}
				}
				setState(136); 
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
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(138);
				importStatement();
				}
				}
				setState(143);
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
			setState(144);
			match(T__1);
			setState(145);
			name();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_KEYWORD) {
				{
				setState(146);
				match(AS_KEYWORD);
				setState(147);
				name();
				}
			}

			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				match(ENDLINE);
				}
				}
				setState(153); 
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
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(155);
				match(T__2);
				setState(156);
				name();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(157);
					match(T__3);
					setState(158);
					name();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164);
					match(ENDLINE);
					}
					}
					setState(167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ENDLINE );
				}
			}

			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(171);
				classBlock();
				}
				break;
			}
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(174);
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
			setState(177);
			access();
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_KEYWORD:
			case ABSTRACT_KEYWORD:
				{
				{
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABSTRACT_KEYWORD) {
					{
					setState(178);
					match(ABSTRACT_KEYWORD);
					}
				}

				setState(181);
				match(CLASS_KEYWORD);
				}
				}
				break;
			case ENUM_KEYWORD:
				{
				setState(182);
				match(ENUM_KEYWORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185);
			name();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(186);
				match(T__4);
				setState(187);
				name();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(188);
					match(T__3);
					setState(189);
					name();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(197);
			match(T__5);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					match(ENDLINE);
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2323294457769857024L) != 0)) {
				{
				setState(204);
				classBlock();
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(207);
				match(ENDLINE);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
			setState(215);
			access();
			setState(216);
			match(INTERFACE_KEYWORD);
			setState(217);
			name();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(218);
				match(T__4);
				setState(219);
				name();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(220);
					match(T__3);
					setState(221);
					name();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(229);
			match(T__5);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					match(ENDLINE);
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2323294457769857024L) != 0)) {
				{
				setState(236);
				classBlock();
				}
			}

			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(239);
				match(ENDLINE);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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
			setState(257); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(247);
						var();
						}
						break;
					case 2:
						{
						setState(248);
						methodDef();
						}
						break;
					case 3:
						{
						setState(249);
						constructorDef();
						}
						break;
					}
					setState(253); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(252);
							match(ENDLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(255); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(259); 
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
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & 4504133813985575L) != 0)) {
				{
				{
				setState(261);
				lineBlock();
				}
				}
				setState(266);
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
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public ConstDefContext constDef() {
			return getRuleContext(ConstDefContext.class,0);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(267);
				varDef();
				}
				break;
			case 2:
				{
				setState(268);
				constDef();
				}
				break;
			case 3:
				{
				setState(269);
				varAssignment();
				}
				break;
			case 4:
				{
				setState(270);
				methodCall();
				}
				break;
			case 5:
				{
				setState(271);
				statement();
				}
				break;
			}
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDLINE:
				{
				setState(275); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(274);
						match(ENDLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(277); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(279);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				arithmeticExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(STRING_VAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				anyType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
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
			setState(291);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(293);
				varAccess();
				setState(294);
				match(T__7);
				setState(295);
				value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(NAME0);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(301);
				match(T__8);
				setState(302);
				varAccess();
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
			setState(305);
			varAccess();
			setState(307); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				arrayAccess0();
				}
				}
				setState(309); 
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
			setState(311);
			match(T__9);
			setState(312);
			arithmeticExpression();
			setState(313);
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
			setState(315);
			access();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT_KEYWORD) {
				{
				setState(316);
				match(ABSTRACT_KEYWORD);
				}
			}

			setState(319);
			match(T__11);
			setState(320);
			name();
			setState(321);
			match(T__12);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME0) {
				{
				setState(322);
				parameters();
				}
			}

			setState(325);
			match(T__13);
			setState(326);
			match(T__4);
			setState(327);
			type();
			setState(328);
			match(T__5);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(329);
					match(ENDLINE);
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(335);
			block();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(336);
				match(ENDLINE);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
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
			setState(344);
			access();
			setState(345);
			match(T__11);
			setState(346);
			name();
			setState(347);
			match(T__12);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME0) {
				{
				setState(348);
				parameters();
				}
			}

			setState(351);
			match(T__13);
			setState(352);
			match(T__5);
			setState(353);
			block();
			setState(354);
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
			setState(356);
			parameter();
			}
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(357);
				match(T__3);
				setState(358);
				parameter();
				}
				}
				setState(363);
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
			setState(364);
			name();
			setState(365);
			match(T__4);
			setState(366);
			type();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(367);
				match(T__7);
				setState(368);
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
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
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
			setState(375);
			access();
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(376);
				constDef0();
				}
				break;
			case 2:
				{
				setState(377);
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
			setState(380);
			match(T__14);
			setState(381);
			name();
			setState(382);
			match(T__4);
			setState(383);
			type();
			setState(384);
			match(T__7);
			setState(385);
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
			setState(387);
			match(T__14);
			{
			setState(388);
			name();
			setState(389);
			match(T__7);
			setState(390);
			value();
			}
			setState(397); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(392);
				match(T__3);
				setState(393);
				name();
				setState(394);
				match(T__7);
				setState(395);
				value();
				}
				}
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(401);
			match(T__4);
			setState(402);
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
			setState(404);
			access();
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(405);
				varDef0();
				}
				break;
			case 2:
				{
				setState(406);
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
			setState(409);
			match(T__15);
			setState(410);
			name();
			setState(411);
			match(T__4);
			setState(412);
			type();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(413);
				match(T__7);
				setState(414);
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
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
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
			setState(417);
			match(T__15);
			setState(418);
			name();
			setState(421); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(419);
				match(T__3);
				setState(420);
				name();
				}
				}
				setState(423); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(425);
			match(T__4);
			setState(426);
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
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				switchStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				foriLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				foriLoop0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				whileLoopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(434);
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
		enterRule(_localctx, 56, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__16);
			setState(438);
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
		enterRule(_localctx, 58, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(SWITCH_KEYWORD);
			setState(441);
			match(T__12);
			setState(442);
			expression();
			setState(443);
			match(T__13);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(444);
				match(ENDLINE);
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(450);
			match(T__5);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(451);
				match(ENDLINE);
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(459);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__25:
				case TRUE:
				case FALSE:
				case NOT:
				case NAME0:
					{
					setState(457);
					expression();
					}
					break;
				case T__17:
					{
					setState(458);
					match(T__17);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(461);
				match(T__18);
				setState(467);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					{
					setState(462);
					match(T__5);
					setState(463);
					block();
					setState(464);
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
					setState(466);
					lineBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(469);
					match(ENDLINE);
					}
					}
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(477); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 18056179951345697L) != 0) );
			setState(479);
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
		enterRule(_localctx, 60, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T__19);
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(482);
				varAssignment();
				}
				break;
			}
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(485);
				match(T__5);
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(486);
						match(ENDLINE);
						}
						} 
					}
					setState(491);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(492);
				block();
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(493);
					match(ENDLINE);
					}
					}
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(499);
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
				setState(501);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(504);
				match(ENDLINE);
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
			match(T__20);
			setState(511);
			match(T__12);
			setState(512);
			parameter();
			setState(513);
			match(T__13);
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(514);
				match(T__5);
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(515);
						match(ENDLINE);
						}
						} 
					}
					setState(520);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(521);
				block();
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(522);
					match(ENDLINE);
					}
					}
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(528);
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
				setState(530);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(533);
					match(ENDLINE);
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(539);
				match(T__21);
				setState(557);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					{
					setState(540);
					match(T__5);
					setState(544);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(541);
							match(ENDLINE);
							}
							} 
						}
						setState(546);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
					}
					setState(547);
					block();
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ENDLINE) {
						{
						{
						setState(548);
						match(ENDLINE);
						}
						}
						setState(553);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(554);
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
					setState(556);
					lineBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(559);
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
		enterRule(_localctx, 62, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(IF_KEYWORD);
			setState(564);
			match(T__12);
			setState(565);
			expression();
			setState(566);
			match(T__13);
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
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(573);
				match(T__5);
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(574);
						match(ENDLINE);
						}
						} 
					}
					setState(579);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(580);
				block();
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(581);
					match(ENDLINE);
					}
					}
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(587);
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
				setState(589);
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
		enterRule(_localctx, 64, RULE_whileLoopStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(T__22);
			setState(593);
			match(T__12);
			setState(594);
			expression();
			setState(595);
			match(T__13);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(596);
				match(ENDLINE);
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(602);
				match(T__5);
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(603);
						match(ENDLINE);
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(609);
				block();
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(610);
					match(ENDLINE);
					}
					}
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(616);
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
				setState(618);
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
		enterRule(_localctx, 66, RULE_foriLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(FOR_KEYWORD);
			setState(622);
			match(T__12);
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451448556126208L) != 0)) {
				{
				setState(623);
				varDef();
				}
			}

			setState(626);
			match(ENDLINE);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 18056179951345665L) != 0)) {
				{
				setState(627);
				expression();
				}
			}

			setState(630);
			match(ENDLINE);
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 8388611L) != 0)) {
				{
				setState(631);
				varAssignment();
				}
			}

			setState(634);
			match(T__13);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(635);
				match(ENDLINE);
				}
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(641);
				match(T__5);
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(642);
					match(ENDLINE);
					}
					}
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(648);
				block();
				setState(649);
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
				setState(651);
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
		enterRule(_localctx, 68, RULE_foriLoop0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(FOR_KEYWORD);
			setState(655);
			match(T__12);
			setState(656);
			name();
			setState(657);
			match(T__4);
			setState(658);
			type();
			setState(659);
			match(T__3);
			setState(660);
			value();
			setState(661);
			match(T__23);
			setState(662);
			value();
			setState(663);
			match(T__13);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(664);
				match(ENDLINE);
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(670);
				match(T__5);
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(671);
					match(ENDLINE);
					}
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(677);
				block();
				setState(678);
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
				setState(680);
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
		enterRule(_localctx, 70, RULE_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) {
				{
				setState(683);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(686);
				match(STATIC);
				}
			}

			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(689);
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
		enterRule(_localctx, 72, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
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
				setState(692);
				anyType();
				}
				break;
			case T__24:
				{
				setState(693);
				linkType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(696);
				match(T__9);
				setState(697);
				match(T__10);
				}
				}
				setState(702);
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
		enterRule(_localctx, 74, RULE_anyType);
		try {
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME0:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
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
				setState(704);
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
		enterRule(_localctx, 76, RULE_linkType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(T__24);
			setState(712);
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
				setState(708);
				anyType();
				}
				break;
			case CLASS_KEYWORD:
				{
				setState(709);
				match(CLASS_KEYWORD);
				}
				break;
			case INTERFACE_KEYWORD:
				{
				setState(710);
				match(INTERFACE_KEYWORD);
				}
				break;
			case ENUM_KEYWORD:
				{
				setState(711);
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
		enterRule(_localctx, 78, RULE_primitiveType);
		try {
			setState(724);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				match(STR);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				match(BOOL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(716);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(718);
				match(DOUBLE);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(719);
				match(LONG);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(720);
				match(SHORT);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(721);
				match(BYTE);
				}
				break;
			case OBJ:
				enterOuterAlt(_localctx, 9);
				{
				setState(722);
				match(OBJ);
				}
				break;
			case VOID:
			case NULL:
				enterOuterAlt(_localctx, 10);
				{
				setState(723);
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
		enterRule(_localctx, 80, RULE_nullType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
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
		enterRule(_localctx, 82, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			argument();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(729);
				match(T__3);
				setState(730);
				argument();
				}
				}
				setState(735);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
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
		enterRule(_localctx, 84, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(736);
				name();
				}
				break;
			case 2:
				{
				setState(737);
				value();
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
	public static class MethodCall0Context extends ParserRuleContext {
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
		enterRule(_localctx, 86, RULE_methodCall0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			varAccess();
			setState(741);
			match(T__12);
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 56336783763054593L) != 0)) {
				{
				setState(742);
				arguments();
				}
			}

			setState(745);
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
		enterRule(_localctx, 88, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			methodCall0();
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(748);
				match(T__8);
				setState(749);
				methodCall0();
				}
				}
				setState(754);
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
		enterRule(_localctx, 90, RULE_constructorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(T__25);
			setState(756);
			name();
			setState(757);
			match(T__12);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 56336783763054593L) != 0)) {
				{
				setState(758);
				arguments();
				}
			}

			setState(761);
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
		enterRule(_localctx, 92, RULE_expression);
		try {
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				primaryExpresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				logicalOr();
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
		enterRule(_localctx, 94, RULE_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(767);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(768);
				logicalAnd();
				}
				break;
			}
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(771);
				match(OR);
				setState(775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(772);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(773);
					logicalAnd();
					}
					break;
				case 3:
					{
					setState(774);
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
		enterRule(_localctx, 96, RULE_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(779);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(780);
				logicalXor();
				}
				break;
			}
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(783);
				match(AND);
				setState(787);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(784);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(785);
					logicalXor();
					}
					break;
				case 3:
					{
					setState(786);
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
		enterRule(_localctx, 98, RULE_logicalXor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(791);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(792);
				logicalNot();
				}
				break;
			}
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XOR) {
				{
				setState(795);
				match(XOR);
				setState(799);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(796);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(797);
					logicalNot();
					}
					break;
				case 3:
					{
					setState(798);
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
		enterRule(_localctx, 100, RULE_logicalNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(803);
				match(NOT);
				}
			}

			setState(806);
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
		enterRule(_localctx, 102, RULE_primaryExpresion);
		try {
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(811);
				varAccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(812);
				match(T__12);
				setState(813);
				expression();
				setState(814);
				match(T__13);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(816);
				constructorCall();
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
		enterRule(_localctx, 104, RULE_arithmeticExpression);
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				numberExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
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
		enterRule(_localctx, 106, RULE_addSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			modDivExpression();
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(824);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(827);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(825);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(826);
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
		enterRule(_localctx, 108, RULE_modDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			mulDivExpression();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIV || _la==MOD) {
				{
				setState(832);
				_la = _input.LA(1);
				if ( !(_la==DIV || _la==MOD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(835);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(833);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(834);
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
		enterRule(_localctx, 110, RULE_mulDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			powerExpression();
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLY || _la==DIVIDE) {
				{
				setState(840);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(843);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(841);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(842);
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
		enterRule(_localctx, 112, RULE_powerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			numberExpression();
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(848);
				match(POWER);
				setState(851);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(849);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(850);
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
		public TerminalNode NUMERIC_VALUE() { return getToken(KatLanParser.NUMERIC_VALUE, 0); }
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
		enterRule(_localctx, 114, RULE_numberExpression);
		int _la;
		try {
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(855);
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

				setState(865);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(858);
					methodCall();
					}
					break;
				case 2:
					{
					setState(859);
					name();
					}
					break;
				case 3:
					{
					setState(860);
					match(NUMERIC_VALUE);
					}
					break;
				case 4:
					{
					{
					setState(861);
					match(T__12);
					setState(862);
					arithmeticExpression();
					setState(863);
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
				setState(867);
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
		enterRule(_localctx, 116, RULE_incrExpression);
		try {
			setState(890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(874);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(870);
					match(PLUS);
					setState(871);
					match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(872);
					match(MINUS);
					setState(873);
					match(MINUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(876);
					name();
					}
					break;
				case 2:
					{
					setState(877);
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
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(880);
					name();
					}
					break;
				case 2:
					{
					setState(881);
					varAccess();
					}
					break;
				}
				setState(888);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(884);
					match(PLUS);
					setState(885);
					match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(886);
					match(MINUS);
					setState(887);
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
		enterRule(_localctx, 118, RULE_name);
		try {
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				dot_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
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
		enterRule(_localctx, 120, RULE_dot_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(NAME0);
			setState(899); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(897);
				match(T__8);
				setState(898);
				match(NAME0);
				}
				}
				setState(901); 
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

	public static final String _serializedATN =
		"\u0004\u0001G\u0388\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"<\u0007<\u0001\u0000\u0003\u0000|\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u0082\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001\u0087\b\u0001\u000b\u0001\f\u0001\u0088\u0001\u0002"+
		"\u0005\u0002\u008c\b\u0002\n\u0002\f\u0002\u008f\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0095\b\u0003\u0001\u0003\u0004"+
		"\u0003\u0098\b\u0003\u000b\u0003\f\u0003\u0099\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u00a0\b\u0004\n\u0004\f\u0004\u00a3"+
		"\t\u0004\u0001\u0004\u0004\u0004\u00a6\b\u0004\u000b\u0004\f\u0004\u00a7"+
		"\u0003\u0004\u00aa\b\u0004\u0001\u0004\u0003\u0004\u00ad\b\u0004\u0001"+
		"\u0004\u0003\u0004\u00b0\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u00b4"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b8\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00bf\b\u0005"+
		"\n\u0005\f\u0005\u00c2\t\u0005\u0003\u0005\u00c4\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00c8\b\u0005\n\u0005\f\u0005\u00cb\t\u0005\u0001\u0005"+
		"\u0003\u0005\u00ce\b\u0005\u0001\u0005\u0005\u0005\u00d1\b\u0005\n\u0005"+
		"\f\u0005\u00d4\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00df\b\u0006\n\u0006\f\u0006\u00e2\t\u0006\u0003\u0006\u00e4\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00e8\b\u0006\n\u0006\f\u0006\u00eb"+
		"\t\u0006\u0001\u0006\u0003\u0006\u00ee\b\u0006\u0001\u0006\u0005\u0006"+
		"\u00f1\b\u0006\n\u0006\f\u0006\u00f4\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00fb\b\u0007\u0001\u0007\u0004"+
		"\u0007\u00fe\b\u0007\u000b\u0007\f\u0007\u00ff\u0004\u0007\u0102\b\u0007"+
		"\u000b\u0007\f\u0007\u0103\u0001\b\u0005\b\u0107\b\b\n\b\f\b\u010a\t\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0111\b\t\u0001\t\u0004"+
		"\t\u0114\b\t\u000b\t\f\t\u0115\u0001\t\u0003\t\u0119\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0122\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u012b\b\f"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u0130\b\r\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u0134\b\u000e\u000b\u000e\f\u000e\u0135\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u013e\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0144\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u014b\b\u0010\n\u0010\f\u0010\u014e\t\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0152\b\u0010\n\u0010\f\u0010\u0155\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u015e\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0168\b\u0012\n\u0012"+
		"\f\u0012\u016b\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0172\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0176\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u017b\b"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004"+
		"\u0017\u018e\b\u0017\u000b\u0017\f\u0017\u018f\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0198\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u01a0\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0004\u001a\u01a6\b\u001a\u000b\u001a\f\u001a\u01a7\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01b4\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u01be\b\u001d\n\u001d\f\u001d\u01c1\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u01c5\b\u001d\n\u001d\f\u001d\u01c8\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01cc\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01d4\b\u001d\u0001"+
		"\u001d\u0005\u001d\u01d7\b\u001d\n\u001d\f\u001d\u01da\t\u001d\u0004\u001d"+
		"\u01dc\b\u001d\u000b\u001d\f\u001d\u01dd\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01e4\b\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u01e8\b\u001e\n\u001e\f\u001e\u01eb\t\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u01ef\b\u001e\n\u001e\f\u001e\u01f2\t\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01f7\b\u001e\u0001\u001e\u0005\u001e\u01fa"+
		"\b\u001e\n\u001e\f\u001e\u01fd\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0205\b\u001e\n\u001e"+
		"\f\u001e\u0208\t\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u020c\b\u001e"+
		"\n\u001e\f\u001e\u020f\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0214\b\u001e\u0001\u001e\u0005\u001e\u0217\b\u001e\n\u001e\f\u001e"+
		"\u021a\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u021f\b"+
		"\u001e\n\u001e\f\u001e\u0222\t\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0226\b\u001e\n\u001e\f\u001e\u0229\t\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u022e\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0232"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u0239\b\u001f\n\u001f\f\u001f\u023c\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0240\b\u001f\n\u001f\f\u001f\u0243\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u0247\b\u001f\n\u001f\f\u001f\u024a\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u024f\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0005 \u0256\b \n \f \u0259\t \u0001 \u0001 \u0005 \u025d"+
		"\b \n \f \u0260\t \u0001 \u0001 \u0005 \u0264\b \n \f \u0267\t \u0001"+
		" \u0001 \u0001 \u0003 \u026c\b \u0001!\u0001!\u0001!\u0003!\u0271\b!\u0001"+
		"!\u0001!\u0003!\u0275\b!\u0001!\u0001!\u0003!\u0279\b!\u0001!\u0001!\u0005"+
		"!\u027d\b!\n!\f!\u0280\t!\u0001!\u0001!\u0005!\u0284\b!\n!\f!\u0287\t"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u028d\b!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u029a\b\"\n\"\f\"\u029d\t\"\u0001\"\u0001\"\u0005\"\u02a1\b\"\n\"\f"+
		"\"\u02a4\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02aa\b\"\u0001#"+
		"\u0003#\u02ad\b#\u0001#\u0003#\u02b0\b#\u0001#\u0003#\u02b3\b#\u0001$"+
		"\u0001$\u0003$\u02b7\b$\u0001$\u0001$\u0005$\u02bb\b$\n$\f$\u02be\t$\u0001"+
		"%\u0001%\u0003%\u02c2\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02c9"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u02d5\b\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0005"+
		")\u02dc\b)\n)\f)\u02df\t)\u0001*\u0001*\u0003*\u02e3\b*\u0001+\u0001+"+
		"\u0001+\u0003+\u02e8\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0005,\u02ef"+
		"\b,\n,\f,\u02f2\t,\u0001-\u0001-\u0001-\u0001-\u0003-\u02f8\b-\u0001-"+
		"\u0001-\u0001.\u0001.\u0003.\u02fe\b.\u0001/\u0001/\u0003/\u0302\b/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u0308\b/\u0003/\u030a\b/\u00010\u00010\u0003"+
		"0\u030e\b0\u00010\u00010\u00010\u00010\u00030\u0314\b0\u00030\u0316\b"+
		"0\u00011\u00011\u00031\u031a\b1\u00011\u00011\u00011\u00011\u00031\u0320"+
		"\b1\u00031\u0322\b1\u00012\u00032\u0325\b2\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u0332\b3\u0001"+
		"4\u00014\u00034\u0336\b4\u00015\u00015\u00015\u00015\u00035\u033c\b5\u0003"+
		"5\u033e\b5\u00016\u00016\u00016\u00016\u00036\u0344\b6\u00036\u0346\b"+
		"6\u00017\u00017\u00017\u00017\u00037\u034c\b7\u00037\u034e\b7\u00018\u0001"+
		"8\u00018\u00018\u00038\u0354\b8\u00038\u0356\b8\u00019\u00039\u0359\b"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u0362\b9\u0001"+
		"9\u00039\u0365\b9\u0001:\u0001:\u0001:\u0001:\u0003:\u036b\b:\u0001:\u0001"+
		":\u0003:\u036f\b:\u0001:\u0001:\u0003:\u0373\b:\u0001:\u0001:\u0001:\u0001"+
		":\u0003:\u0379\b:\u0003:\u037b\b:\u0001;\u0001;\u0003;\u037f\b;\u0001"+
		"<\u0001<\u0001<\u0004<\u0384\b<\u000b<\f<\u0385\u0001<\u0000\u0000=\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\u0000\u0006\u0001"+
		"\u000067\u0001\u000013\u0001\u0000()\u0001\u0000,-\u0001\u0000*+\u0001"+
		"\u0000./\u03ec\u0000{\u0001\u0000\u0000\u0000\u0002\u0083\u0001\u0000"+
		"\u0000\u0000\u0004\u008d\u0001\u0000\u0000\u0000\u0006\u0090\u0001\u0000"+
		"\u0000\u0000\b\u00a9\u0001\u0000\u0000\u0000\n\u00b1\u0001\u0000\u0000"+
		"\u0000\f\u00d7\u0001\u0000\u0000\u0000\u000e\u0101\u0001\u0000\u0000\u0000"+
		"\u0010\u0108\u0001\u0000\u0000\u0000\u0012\u0110\u0001\u0000\u0000\u0000"+
		"\u0014\u0121\u0001\u0000\u0000\u0000\u0016\u0123\u0001\u0000\u0000\u0000"+
		"\u0018\u012a\u0001\u0000\u0000\u0000\u001a\u012c\u0001\u0000\u0000\u0000"+
		"\u001c\u0131\u0001\u0000\u0000\u0000\u001e\u0137\u0001\u0000\u0000\u0000"+
		" \u013b\u0001\u0000\u0000\u0000\"\u0158\u0001\u0000\u0000\u0000$\u0164"+
		"\u0001\u0000\u0000\u0000&\u016c\u0001\u0000\u0000\u0000(\u0175\u0001\u0000"+
		"\u0000\u0000*\u0177\u0001\u0000\u0000\u0000,\u017c\u0001\u0000\u0000\u0000"+
		".\u0183\u0001\u0000\u0000\u00000\u0194\u0001\u0000\u0000\u00002\u0199"+
		"\u0001\u0000\u0000\u00004\u01a1\u0001\u0000\u0000\u00006\u01b3\u0001\u0000"+
		"\u0000\u00008\u01b5\u0001\u0000\u0000\u0000:\u01b8\u0001\u0000\u0000\u0000"+
		"<\u01e1\u0001\u0000\u0000\u0000>\u0233\u0001\u0000\u0000\u0000@\u0250"+
		"\u0001\u0000\u0000\u0000B\u026d\u0001\u0000\u0000\u0000D\u028e\u0001\u0000"+
		"\u0000\u0000F\u02ac\u0001\u0000\u0000\u0000H\u02b6\u0001\u0000\u0000\u0000"+
		"J\u02c1\u0001\u0000\u0000\u0000L\u02c3\u0001\u0000\u0000\u0000N\u02d4"+
		"\u0001\u0000\u0000\u0000P\u02d6\u0001\u0000\u0000\u0000R\u02d8\u0001\u0000"+
		"\u0000\u0000T\u02e2\u0001\u0000\u0000\u0000V\u02e4\u0001\u0000\u0000\u0000"+
		"X\u02eb\u0001\u0000\u0000\u0000Z\u02f3\u0001\u0000\u0000\u0000\\\u02fd"+
		"\u0001\u0000\u0000\u0000^\u0301\u0001\u0000\u0000\u0000`\u030d\u0001\u0000"+
		"\u0000\u0000b\u0319\u0001\u0000\u0000\u0000d\u0324\u0001\u0000\u0000\u0000"+
		"f\u0331\u0001\u0000\u0000\u0000h\u0335\u0001\u0000\u0000\u0000j\u0337"+
		"\u0001\u0000\u0000\u0000l\u033f\u0001\u0000\u0000\u0000n\u0347\u0001\u0000"+
		"\u0000\u0000p\u034f\u0001\u0000\u0000\u0000r\u0364\u0001\u0000\u0000\u0000"+
		"t\u037a\u0001\u0000\u0000\u0000v\u037e\u0001\u0000\u0000\u0000x\u0380"+
		"\u0001\u0000\u0000\u0000z|\u0003\u0002\u0001\u0000{z\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0081\u0003"+
		"\u0004\u0002\u0000~\u0082\u0003\n\u0005\u0000\u007f\u0082\u0003\f\u0006"+
		"\u0000\u0080\u0082\u0003\b\u0004\u0000\u0081~\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0001\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0001\u0000\u0000"+
		"\u0084\u0086\u0003v;\u0000\u0085\u0087\u0005E\u0000\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0003"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0003\u0006\u0003\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0005"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u0002\u0000\u0000\u0091\u0094\u0003v;\u0000\u0092\u0093\u0005\u001b"+
		"\u0000\u0000\u0093\u0095\u0003v;\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000"+
		"\u0096\u0098\u0005E\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u0007\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005\u0003\u0000\u0000\u009c\u00a1\u0003v;\u0000\u009d\u009e\u0005"+
		"\u0004\u0000\u0000\u009e\u00a0\u0003v;\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005E\u0000\u0000"+
		"\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u009b\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ad\u0003\u000e\u0007\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0003\u0010\b\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\t\u0001\u0000\u0000\u0000\u00b1\u00b7"+
		"\u0003F#\u0000\u00b2\u00b4\u0005=\u0000\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0005<\u0000\u0000\u00b6\u00b8\u0005?\u0000\u0000"+
		"\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00c3\u0003v;\u0000\u00ba\u00bb"+
		"\u0005\u0005\u0000\u0000\u00bb\u00c0\u0003v;\u0000\u00bc\u00bd\u0005\u0004"+
		"\u0000\u0000\u00bd\u00bf\u0003v;\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00ba\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c9\u0005\u0006\u0000\u0000\u00c6\u00c8\u0005E\u0000\u0000\u00c7"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0003\u000e\u0007\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d2\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d1\u0005E\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0007\u0000\u0000\u00d6\u000b"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003F#\u0000\u00d8\u00d9\u0005>"+
		"\u0000\u0000\u00d9\u00e3\u0003v;\u0000\u00da\u00db\u0005\u0005\u0000\u0000"+
		"\u00db\u00e0\u0003v;\u0000\u00dc\u00dd\u0005\u0004\u0000\u0000\u00dd\u00df"+
		"\u0003v;\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00da\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e9\u0005\u0006"+
		"\u0000\u0000\u00e6\u00e8\u0005E\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ee\u0003\u000e\u0007"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f2\u0001\u0000\u0000\u0000\u00ef\u00f1\u0005E\u0000\u0000"+
		"\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0005\u0007\u0000\u0000\u00f6\r\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fb\u0003(\u0014\u0000\u00f8\u00fb\u0003 \u0010\u0000\u00f9\u00fb\u0003"+
		"\"\u0011\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fe\u0005E\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000"+
		"\u0000\u0101\u00fa\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u000f\u0001\u0000\u0000\u0000\u0105\u0107\u0003\u0012\t\u0000"+
		"\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109\u0011\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010b\u0111\u00030\u0018\u0000\u010c\u0111\u0003*\u0015\u0000\u010d\u0111"+
		"\u0003\u0018\f\u0000\u010e\u0111\u0003X,\u0000\u010f\u0111\u00036\u001b"+
		"\u0000\u0110\u010b\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000"+
		"\u0000\u0110\u010d\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0118\u0001\u0000\u0000"+
		"\u0000\u0112\u0114\u0005E\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000"+
		"\u0117\u0119\u0005\u0000\u0000\u0001\u0118\u0113\u0001\u0000\u0000\u0000"+
		"\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u0013\u0001\u0000\u0000\u0000"+
		"\u011a\u0122\u0003\u0016\u000b\u0000\u011b\u0122\u0003\\.\u0000\u011c"+
		"\u0122\u0003h4\u0000\u011d\u0122\u0003v;\u0000\u011e\u0122\u0005D\u0000"+
		"\u0000\u011f\u0122\u0003J%\u0000\u0120\u0122\u0003\u001c\u000e\u0000\u0121"+
		"\u011a\u0001\u0000\u0000\u0000\u0121\u011b\u0001\u0000\u0000\u0000\u0121"+
		"\u011c\u0001\u0000\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0121"+
		"\u011e\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u0120\u0001\u0000\u0000\u0000\u0122\u0015\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0007\u0000\u0000\u0000\u0124\u0017\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0003\u001a\r\u0000\u0126\u0127\u0005\b\u0000\u0000\u0127\u0128"+
		"\u0003\u0014\n\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u012b\u0003"+
		"t:\u0000\u012a\u0125\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u0019\u0001\u0000\u0000\u0000\u012c\u012f\u0005C\u0000\u0000"+
		"\u012d\u012e\u0005\t\u0000\u0000\u012e\u0130\u0003\u001a\r\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u001b\u0001\u0000\u0000\u0000\u0131\u0133\u0003\u001a\r\u0000\u0132\u0134"+
		"\u0003\u001e\u000f\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136\u001d\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0005\n\u0000\u0000\u0138\u0139\u0003h4\u0000\u0139\u013a\u0005\u000b"+
		"\u0000\u0000\u013a\u001f\u0001\u0000\u0000\u0000\u013b\u013d\u0003F#\u0000"+
		"\u013c\u013e\u0005=\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0005\f\u0000\u0000\u0140\u0141\u0003v;\u0000\u0141\u0143\u0005"+
		"\r\u0000\u0000\u0142\u0144\u0003$\u0012\u0000\u0143\u0142\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0005\u000e\u0000\u0000\u0146\u0147\u0005\u0005"+
		"\u0000\u0000\u0147\u0148\u0003H$\u0000\u0148\u014c\u0005\u0006\u0000\u0000"+
		"\u0149\u014b\u0005E\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b"+
		"\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e"+
		"\u014c\u0001\u0000\u0000\u0000\u014f\u0153\u0003\u0010\b\u0000\u0150\u0152"+
		"\u0005E\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0155\u0001"+
		"\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0153\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0005\u0007\u0000\u0000\u0157!\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0003F#\u0000\u0159\u015a\u0005\f\u0000\u0000"+
		"\u015a\u015b\u0003v;\u0000\u015b\u015d\u0005\r\u0000\u0000\u015c\u015e"+
		"\u0003$\u0012\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"\u000e\u0000\u0000\u0160\u0161\u0005\u0006\u0000\u0000\u0161\u0162\u0003"+
		"\u0010\b\u0000\u0162\u0163\u0005\u0007\u0000\u0000\u0163#\u0001\u0000"+
		"\u0000\u0000\u0164\u0169\u0003&\u0013\u0000\u0165\u0166\u0005\u0004\u0000"+
		"\u0000\u0166\u0168\u0003&\u0013\u0000\u0167\u0165\u0001\u0000\u0000\u0000"+
		"\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0001\u0000\u0000\u0000\u016a%\u0001\u0000\u0000\u0000\u016b"+
		"\u0169\u0001\u0000\u0000\u0000\u016c\u016d\u0003v;\u0000\u016d\u016e\u0005"+
		"\u0005\u0000\u0000\u016e\u0171\u0003H$\u0000\u016f\u0170\u0005\b\u0000"+
		"\u0000\u0170\u0172\u0003\u0014\n\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0001\u0000\u0000\u0000\u0172\'\u0001\u0000\u0000\u0000\u0173"+
		"\u0176\u00030\u0018\u0000\u0174\u0176\u0003*\u0015\u0000\u0175\u0173\u0001"+
		"\u0000\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176)\u0001\u0000"+
		"\u0000\u0000\u0177\u017a\u0003F#\u0000\u0178\u017b\u0003,\u0016\u0000"+
		"\u0179\u017b\u0003.\u0017\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a"+
		"\u0179\u0001\u0000\u0000\u0000\u017b+\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0005\u000f\u0000\u0000\u017d\u017e\u0003v;\u0000\u017e\u017f\u0005\u0005"+
		"\u0000\u0000\u017f\u0180\u0003H$\u0000\u0180\u0181\u0005\b\u0000\u0000"+
		"\u0181\u0182\u0003\u0014\n\u0000\u0182-\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0005\u000f\u0000\u0000\u0184\u0185\u0003v;\u0000\u0185\u0186\u0005"+
		"\b\u0000\u0000\u0186\u0187\u0003\u0014\n\u0000\u0187\u018d\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0005\u0004\u0000\u0000\u0189\u018a\u0003v;\u0000"+
		"\u018a\u018b\u0005\b\u0000\u0000\u018b\u018c\u0003\u0014\n\u0000\u018c"+
		"\u018e\u0001\u0000\u0000\u0000\u018d\u0188\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f"+
		"\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0005\u0005\u0000\u0000\u0192\u0193\u0003H$\u0000\u0193/\u0001"+
		"\u0000\u0000\u0000\u0194\u0197\u0003F#\u0000\u0195\u0198\u00032\u0019"+
		"\u0000\u0196\u0198\u00034\u001a\u0000\u0197\u0195\u0001\u0000\u0000\u0000"+
		"\u0197\u0196\u0001\u0000\u0000\u0000\u01981\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0005\u0010\u0000\u0000\u019a\u019b\u0003v;\u0000\u019b\u019c\u0005"+
		"\u0005\u0000\u0000\u019c\u019f\u0003H$\u0000\u019d\u019e\u0005\b\u0000"+
		"\u0000\u019e\u01a0\u0003\u0014\n\u0000\u019f\u019d\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0001\u0000\u0000\u0000\u01a03\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0005\u0010\u0000\u0000\u01a2\u01a5\u0003v;\u0000\u01a3\u01a4\u0005"+
		"\u0004\u0000\u0000\u01a4\u01a6\u0003v;\u0000\u01a5\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a9\u01aa\u0005\u0005\u0000\u0000\u01aa\u01ab\u0003H$\u0000\u01ab"+
		"5\u0001\u0000\u0000\u0000\u01ac\u01b4\u0003>\u001f\u0000\u01ad\u01b4\u0003"+
		":\u001d\u0000\u01ae\u01b4\u0003B!\u0000\u01af\u01b4\u0003D\"\u0000\u01b0"+
		"\u01b4\u00038\u001c\u0000\u01b1\u01b4\u0003@ \u0000\u01b2\u01b4\u0003"+
		"<\u001e\u0000\u01b3\u01ac\u0001\u0000\u0000\u0000\u01b3\u01ad\u0001\u0000"+
		"\u0000\u0000\u01b3\u01ae\u0001\u0000\u0000\u0000\u01b3\u01af\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b47\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0005\u0011\u0000\u0000\u01b6\u01b7\u0003\u0014\n\u0000"+
		"\u01b79\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u001e\u0000\u0000\u01b9"+
		"\u01ba\u0005\r\u0000\u0000\u01ba\u01bb\u0003\\.\u0000\u01bb\u01bf\u0005"+
		"\u000e\u0000\u0000\u01bc\u01be\u0005E\u0000\u0000\u01bd\u01bc\u0001\u0000"+
		"\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c6\u0005\u0006"+
		"\u0000\u0000\u01c3\u01c5\u0005E\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01db\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01cc\u0003\\.\u0000"+
		"\u01ca\u01cc\u0005\u0012\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000"+
		"\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cd\u01d3\u0005\u0013\u0000\u0000\u01ce\u01cf\u0005\u0006\u0000\u0000"+
		"\u01cf\u01d0\u0003\u0010\b\u0000\u01d0\u01d1\u0005\u0007\u0000\u0000\u01d1"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d2\u01d4\u0003\u0012\t\u0000\u01d3\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d7\u0005E\u0000\u0000\u01d6\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001"+
		"\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db\u01cb\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01db\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01df\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0005\u0007\u0000\u0000\u01e0;\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e3\u0005\u0014\u0000\u0000\u01e2\u01e4\u0003\u0018"+
		"\f\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e4\u01f6\u0001\u0000\u0000\u0000\u01e5\u01e9\u0005\u0006\u0000"+
		"\u0000\u01e6\u01e8\u0005E\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01ec\u0001\u0000\u0000\u0000"+
		"\u01eb\u01e9\u0001\u0000\u0000\u0000\u01ec\u01f0\u0003\u0010\b\u0000\u01ed"+
		"\u01ef\u0005E\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f3\u0001\u0000\u0000\u0000\u01f2\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005\u0007\u0000\u0000\u01f4\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f7\u0003\u0012\t\u0000\u01f6\u01e5\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f7\u01fb\u0001"+
		"\u0000\u0000\u0000\u01f8\u01fa\u0005E\u0000\u0000\u01f9\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005\u0015"+
		"\u0000\u0000\u01ff\u0200\u0005\r\u0000\u0000\u0200\u0201\u0003&\u0013"+
		"\u0000\u0201\u0213\u0005\u000e\u0000\u0000\u0202\u0206\u0005\u0006\u0000"+
		"\u0000\u0203\u0205\u0005E\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000"+
		"\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0209\u0001\u0000\u0000\u0000"+
		"\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020d\u0003\u0010\b\u0000\u020a"+
		"\u020c\u0005E\u0000\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020c\u020f"+
		"\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020e"+
		"\u0001\u0000\u0000\u0000\u020e\u0210\u0001\u0000\u0000\u0000\u020f\u020d"+
		"\u0001\u0000\u0000\u0000\u0210\u0211\u0005\u0007\u0000\u0000\u0211\u0214"+
		"\u0001\u0000\u0000\u0000\u0212\u0214\u0003\u0012\t\u0000\u0213\u0202\u0001"+
		"\u0000\u0000\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0214\u0218\u0001"+
		"\u0000\u0000\u0000\u0215\u0217\u0005E\u0000\u0000\u0216\u0215\u0001\u0000"+
		"\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u0231\u0001\u0000"+
		"\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021b\u022d\u0005\u0016"+
		"\u0000\u0000\u021c\u0220\u0005\u0006\u0000\u0000\u021d\u021f\u0005E\u0000"+
		"\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021f\u0222\u0001\u0000\u0000"+
		"\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000"+
		"\u0000\u0221\u0223\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000"+
		"\u0000\u0223\u0227\u0003\u0010\b\u0000\u0224\u0226\u0005E\u0000\u0000"+
		"\u0225\u0224\u0001\u0000\u0000\u0000\u0226\u0229\u0001\u0000\u0000\u0000"+
		"\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000"+
		"\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0005\u0007\u0000\u0000\u022b\u022e\u0001\u0000\u0000\u0000"+
		"\u022c\u022e\u0003\u0012\t\u0000\u022d\u021c\u0001\u0000\u0000\u0000\u022d"+
		"\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0005E\u0000\u0000\u0230\u0232\u0001\u0000\u0000\u0000\u0231\u021b"+
		"\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232=\u0001"+
		"\u0000\u0000\u0000\u0233\u0234\u0005\u001d\u0000\u0000\u0234\u0235\u0005"+
		"\r\u0000\u0000\u0235\u0236\u0003\\.\u0000\u0236\u023a\u0005\u000e\u0000"+
		"\u0000\u0237\u0239\u0005E\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000"+
		"\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u024e\u0001\u0000\u0000\u0000"+
		"\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u0241\u0005\u0006\u0000\u0000"+
		"\u023e\u0240\u0005E\u0000\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u0240"+
		"\u0243\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241"+
		"\u0242\u0001\u0000\u0000\u0000\u0242\u0244\u0001\u0000\u0000\u0000\u0243"+
		"\u0241\u0001\u0000\u0000\u0000\u0244\u0248\u0003\u0010\b\u0000\u0245\u0247"+
		"\u0005E\u0000\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0247\u024a\u0001"+
		"\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0249\u0001"+
		"\u0000\u0000\u0000\u0249\u024b\u0001\u0000\u0000\u0000\u024a\u0248\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0005\u0007\u0000\u0000\u024c\u024f\u0001"+
		"\u0000\u0000\u0000\u024d\u024f\u0003\u0012\t\u0000\u024e\u023d\u0001\u0000"+
		"\u0000\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024f?\u0001\u0000\u0000"+
		"\u0000\u0250\u0251\u0005\u0017\u0000\u0000\u0251\u0252\u0005\r\u0000\u0000"+
		"\u0252\u0253\u0003\\.\u0000\u0253\u0257\u0005\u000e\u0000\u0000\u0254"+
		"\u0256\u0005E\u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0256\u0259"+
		"\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0001\u0000\u0000\u0000\u0258\u026b\u0001\u0000\u0000\u0000\u0259\u0257"+
		"\u0001\u0000\u0000\u0000\u025a\u025e\u0005\u0006\u0000\u0000\u025b\u025d"+
		"\u0005E\u0000\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025d\u0260\u0001"+
		"\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025f\u0001"+
		"\u0000\u0000\u0000\u025f\u0261\u0001\u0000\u0000\u0000\u0260\u025e\u0001"+
		"\u0000\u0000\u0000\u0261\u0265\u0003\u0010\b\u0000\u0262\u0264\u0005E"+
		"\u0000\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0264\u0267\u0001\u0000"+
		"\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000"+
		"\u0000\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000"+
		"\u0000\u0000\u0268\u0269\u0005\u0007\u0000\u0000\u0269\u026c\u0001\u0000"+
		"\u0000\u0000\u026a\u026c\u0003\u0012\t\u0000\u026b\u025a\u0001\u0000\u0000"+
		"\u0000\u026b\u026a\u0001\u0000\u0000\u0000\u026cA\u0001\u0000\u0000\u0000"+
		"\u026d\u026e\u0005\u001c\u0000\u0000\u026e\u0270\u0005\r\u0000\u0000\u026f"+
		"\u0271\u00030\u0018\u0000\u0270\u026f\u0001\u0000\u0000\u0000\u0270\u0271"+
		"\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0274"+
		"\u0005E\u0000\u0000\u0273\u0275\u0003\\.\u0000\u0274\u0273\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000"+
		"\u0000\u0000\u0276\u0278\u0005E\u0000\u0000\u0277\u0279\u0003\u0018\f"+
		"\u0000\u0278\u0277\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000"+
		"\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027e\u0005\u000e\u0000"+
		"\u0000\u027b\u027d\u0005E\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000"+
		"\u027d\u0280\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000"+
		"\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u028c\u0001\u0000\u0000\u0000"+
		"\u0280\u027e\u0001\u0000\u0000\u0000\u0281\u0285\u0005\u0006\u0000\u0000"+
		"\u0282\u0284\u0005E\u0000\u0000\u0283\u0282\u0001\u0000\u0000\u0000\u0284"+
		"\u0287\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u0001\u0000\u0000\u0000\u0286\u0288\u0001\u0000\u0000\u0000\u0287"+
		"\u0285\u0001\u0000\u0000\u0000\u0288\u0289\u0003\u0010\b\u0000\u0289\u028a"+
		"\u0005\u0007\u0000\u0000\u028a\u028d\u0001\u0000\u0000\u0000\u028b\u028d"+
		"\u0003\u0012\t\u0000\u028c\u0281\u0001\u0000\u0000\u0000\u028c\u028b\u0001"+
		"\u0000\u0000\u0000\u028dC\u0001\u0000\u0000\u0000\u028e\u028f\u0005\u001c"+
		"\u0000\u0000\u028f\u0290\u0005\r\u0000\u0000\u0290\u0291\u0003v;\u0000"+
		"\u0291\u0292\u0005\u0005\u0000\u0000\u0292\u0293\u0003H$\u0000\u0293\u0294"+
		"\u0005\u0004\u0000\u0000\u0294\u0295\u0003\u0014\n\u0000\u0295\u0296\u0005"+
		"\u0018\u0000\u0000\u0296\u0297\u0003\u0014\n\u0000\u0297\u029b\u0005\u000e"+
		"\u0000\u0000\u0298\u029a\u0005E\u0000\u0000\u0299\u0298\u0001\u0000\u0000"+
		"\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000"+
		"\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u02a9\u0001\u0000\u0000"+
		"\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u02a2\u0005\u0006\u0000"+
		"\u0000\u029f\u02a1\u0005E\u0000\u0000\u02a0\u029f\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a4\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a5\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a5\u02a6\u0003\u0010\b\u0000\u02a6"+
		"\u02a7\u0005\u0007\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8"+
		"\u02aa\u0003\u0012\t\u0000\u02a9\u029e\u0001\u0000\u0000\u0000\u02a9\u02a8"+
		"\u0001\u0000\u0000\u0000\u02aaE\u0001\u0000\u0000\u0000\u02ab\u02ad\u0007"+
		"\u0001\u0000\u0000\u02ac\u02ab\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001"+
		"\u0000\u0000\u0000\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae\u02b0\u0005"+
		"4\u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b2\u0001\u0000\u0000\u0000\u02b1\u02b3\u00055\u0000"+
		"\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b3G\u0001\u0000\u0000\u0000\u02b4\u02b7\u0003J%\u0000\u02b5"+
		"\u02b7\u0003L&\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b6\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b7\u02bc\u0001\u0000\u0000\u0000\u02b8\u02b9\u0005"+
		"\n\u0000\u0000\u02b9\u02bb\u0005\u000b\u0000\u0000\u02ba\u02b8\u0001\u0000"+
		"\u0000\u0000\u02bb\u02be\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000"+
		"\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bdI\u0001\u0000\u0000"+
		"\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf\u02c2\u0003v;\u0000\u02c0"+
		"\u02c2\u0003N\'\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c0"+
		"\u0001\u0000\u0000\u0000\u02c2K\u0001\u0000\u0000\u0000\u02c3\u02c8\u0005"+
		"\u0019\u0000\u0000\u02c4\u02c9\u0003J%\u0000\u02c5\u02c9\u0005<\u0000"+
		"\u0000\u02c6\u02c9\u0005>\u0000\u0000\u02c7\u02c9\u0005?\u0000\u0000\u02c8"+
		"\u02c4\u0001\u0000\u0000\u0000\u02c8\u02c5\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c9"+
		"M\u0001\u0000\u0000\u0000\u02ca\u02d5\u0005\u001f\u0000\u0000\u02cb\u02d5"+
		"\u0005 \u0000\u0000\u02cc\u02d5\u0005!\u0000\u0000\u02cd\u02d5\u0005\""+
		"\u0000\u0000\u02ce\u02d5\u0005#\u0000\u0000\u02cf\u02d5\u0005$\u0000\u0000"+
		"\u02d0\u02d5\u0005%\u0000\u0000\u02d1\u02d5\u0005&\u0000\u0000\u02d2\u02d5"+
		"\u0005\'\u0000\u0000\u02d3\u02d5\u0003P(\u0000\u02d4\u02ca\u0001\u0000"+
		"\u0000\u0000\u02d4\u02cb\u0001\u0000\u0000\u0000\u02d4\u02cc\u0001\u0000"+
		"\u0000\u0000\u02d4\u02cd\u0001\u0000\u0000\u0000\u02d4\u02ce\u0001\u0000"+
		"\u0000\u0000\u02d4\u02cf\u0001\u0000\u0000\u0000\u02d4\u02d0\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d1\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d5O\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d7\u0007\u0002\u0000\u0000\u02d7Q\u0001\u0000\u0000\u0000"+
		"\u02d8\u02dd\u0003T*\u0000\u02d9\u02da\u0005\u0004\u0000\u0000\u02da\u02dc"+
		"\u0003T*\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02dc\u02df\u0001\u0000"+
		"\u0000\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000"+
		"\u0000\u0000\u02deS\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e3\u0003v;\u0000\u02e1\u02e3\u0003\u0014\n\u0000\u02e2"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3"+
		"U\u0001\u0000\u0000\u0000\u02e4\u02e5\u0003\u001a\r\u0000\u02e5\u02e7"+
		"\u0005\r\u0000\u0000\u02e6\u02e8\u0003R)\u0000\u02e7\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000"+
		"\u0000\u0000\u02e9\u02ea\u0005\u000e\u0000\u0000\u02eaW\u0001\u0000\u0000"+
		"\u0000\u02eb\u02f0\u0003V+\u0000\u02ec\u02ed\u0005\t\u0000\u0000\u02ed"+
		"\u02ef\u0003V+\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ef\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f1Y\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000"+
		"\u0000\u0000\u02f3\u02f4\u0005\u001a\u0000\u0000\u02f4\u02f5\u0003v;\u0000"+
		"\u02f5\u02f7\u0005\r\u0000\u0000\u02f6\u02f8\u0003R)\u0000\u02f7\u02f6"+
		"\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02f9"+
		"\u0001\u0000\u0000\u0000\u02f9\u02fa\u0005\u000e\u0000\u0000\u02fa[\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fe\u0003f3\u0000\u02fc\u02fe\u0003^/\u0000"+
		"\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000"+
		"\u02fe]\u0001\u0000\u0000\u0000\u02ff\u0302\u0003f3\u0000\u0300\u0302"+
		"\u0003`0\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0301\u0300\u0001\u0000"+
		"\u0000\u0000\u0302\u0309\u0001\u0000\u0000\u0000\u0303\u0307\u00059\u0000"+
		"\u0000\u0304\u0308\u0003f3\u0000\u0305\u0308\u0003`0\u0000\u0306\u0308"+
		"\u0003^/\u0000\u0307\u0304\u0001\u0000\u0000\u0000\u0307\u0305\u0001\u0000"+
		"\u0000\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0308\u030a\u0001\u0000"+
		"\u0000\u0000\u0309\u0303\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000"+
		"\u0000\u0000\u030a_\u0001\u0000\u0000\u0000\u030b\u030e\u0003f3\u0000"+
		"\u030c\u030e\u0003b1\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030d\u030c"+
		"\u0001\u0000\u0000\u0000\u030e\u0315\u0001\u0000\u0000\u0000\u030f\u0313"+
		"\u00058\u0000\u0000\u0310\u0314\u0003f3\u0000\u0311\u0314\u0003b1\u0000"+
		"\u0312\u0314\u0003`0\u0000\u0313\u0310\u0001\u0000\u0000\u0000\u0313\u0311"+
		"\u0001\u0000\u0000\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0314\u0316"+
		"\u0001\u0000\u0000\u0000\u0315\u030f\u0001\u0000\u0000\u0000\u0315\u0316"+
		"\u0001\u0000\u0000\u0000\u0316a\u0001\u0000\u0000\u0000\u0317\u031a\u0003"+
		"f3\u0000\u0318\u031a\u0003d2\u0000\u0319\u0317\u0001\u0000\u0000\u0000"+
		"\u0319\u0318\u0001\u0000\u0000\u0000\u031a\u0321\u0001\u0000\u0000\u0000"+
		"\u031b\u031f\u0005;\u0000\u0000\u031c\u0320\u0003f3\u0000\u031d\u0320"+
		"\u0003d2\u0000\u031e\u0320\u0003b1\u0000\u031f\u031c\u0001\u0000\u0000"+
		"\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u031f\u031e\u0001\u0000\u0000"+
		"\u0000\u0320\u0322\u0001\u0000\u0000\u0000\u0321\u031b\u0001\u0000\u0000"+
		"\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322c\u0001\u0000\u0000\u0000"+
		"\u0323\u0325\u0005:\u0000\u0000\u0324\u0323\u0001\u0000\u0000\u0000\u0324"+
		"\u0325\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326"+
		"\u0327\u0003f3\u0000\u0327e\u0001\u0000\u0000\u0000\u0328\u0332\u0003"+
		"\u0016\u000b\u0000\u0329\u0332\u0003X,\u0000\u032a\u0332\u0003v;\u0000"+
		"\u032b\u0332\u0003\u001a\r\u0000\u032c\u032d\u0005\r\u0000\u0000\u032d"+
		"\u032e\u0003\\.\u0000\u032e\u032f\u0005\u000e\u0000\u0000\u032f\u0332"+
		"\u0001\u0000\u0000\u0000\u0330\u0332\u0003Z-\u0000\u0331\u0328\u0001\u0000"+
		"\u0000\u0000\u0331\u0329\u0001\u0000\u0000\u0000\u0331\u032a\u0001\u0000"+
		"\u0000\u0000\u0331\u032b\u0001\u0000\u0000\u0000\u0331\u032c\u0001\u0000"+
		"\u0000\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0332g\u0001\u0000\u0000"+
		"\u0000\u0333\u0336\u0003r9\u0000\u0334\u0336\u0003j5\u0000\u0335\u0333"+
		"\u0001\u0000\u0000\u0000\u0335\u0334\u0001\u0000\u0000\u0000\u0336i\u0001"+
		"\u0000\u0000\u0000\u0337\u033d\u0003l6\u0000\u0338\u033b\u0007\u0003\u0000"+
		"\u0000\u0339\u033c\u0003r9\u0000\u033a\u033c\u0003j5\u0000\u033b\u0339"+
		"\u0001\u0000\u0000\u0000\u033b\u033a\u0001\u0000\u0000\u0000\u033c\u033e"+
		"\u0001\u0000\u0000\u0000\u033d\u0338\u0001\u0000\u0000\u0000\u033d\u033e"+
		"\u0001\u0000\u0000\u0000\u033ek\u0001\u0000\u0000\u0000\u033f\u0345\u0003"+
		"n7\u0000\u0340\u0343\u0007\u0004\u0000\u0000\u0341\u0344\u0003r9\u0000"+
		"\u0342\u0344\u0003l6\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0343\u0342"+
		"\u0001\u0000\u0000\u0000\u0344\u0346\u0001\u0000\u0000\u0000\u0345\u0340"+
		"\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346m\u0001"+
		"\u0000\u0000\u0000\u0347\u034d\u0003p8\u0000\u0348\u034b\u0007\u0005\u0000"+
		"\u0000\u0349\u034c\u0003r9\u0000\u034a\u034c\u0003n7\u0000\u034b\u0349"+
		"\u0001\u0000\u0000\u0000\u034b\u034a\u0001\u0000\u0000\u0000\u034c\u034e"+
		"\u0001\u0000\u0000\u0000\u034d\u0348\u0001\u0000\u0000\u0000\u034d\u034e"+
		"\u0001\u0000\u0000\u0000\u034eo\u0001\u0000\u0000\u0000\u034f\u0355\u0003"+
		"r9\u0000\u0350\u0353\u00050\u0000\u0000\u0351\u0354\u0003r9\u0000\u0352"+
		"\u0354\u0003p8\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0353\u0352\u0001"+
		"\u0000\u0000\u0000\u0354\u0356\u0001\u0000\u0000\u0000\u0355\u0350\u0001"+
		"\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356q\u0001\u0000"+
		"\u0000\u0000\u0357\u0359\u0007\u0003\u0000\u0000\u0358\u0357\u0001\u0000"+
		"\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000\u0359\u0361\u0001\u0000"+
		"\u0000\u0000\u035a\u0362\u0003X,\u0000\u035b\u0362\u0003v;\u0000\u035c"+
		"\u0362\u0005@\u0000\u0000\u035d\u035e\u0005\r\u0000\u0000\u035e\u035f"+
		"\u0003h4\u0000\u035f\u0360\u0005\u000e\u0000\u0000\u0360\u0362\u0001\u0000"+
		"\u0000\u0000\u0361\u035a\u0001\u0000\u0000\u0000\u0361\u035b\u0001\u0000"+
		"\u0000\u0000\u0361\u035c\u0001\u0000\u0000\u0000\u0361\u035d\u0001\u0000"+
		"\u0000\u0000\u0362\u0365\u0001\u0000\u0000\u0000\u0363\u0365\u0003t:\u0000"+
		"\u0364\u0358\u0001\u0000\u0000\u0000\u0364\u0363\u0001\u0000\u0000\u0000"+
		"\u0365s\u0001\u0000\u0000\u0000\u0366\u0367\u0005,\u0000\u0000\u0367\u036b"+
		"\u0005,\u0000\u0000\u0368\u0369\u0005-\u0000\u0000\u0369\u036b\u0005-"+
		"\u0000\u0000\u036a\u0366\u0001\u0000\u0000\u0000\u036a\u0368\u0001\u0000"+
		"\u0000\u0000\u036b\u036e\u0001\u0000\u0000\u0000\u036c\u036f\u0003v;\u0000"+
		"\u036d\u036f\u0003\u001a\r\u0000\u036e\u036c\u0001\u0000\u0000\u0000\u036e"+
		"\u036d\u0001\u0000\u0000\u0000\u036f\u037b\u0001\u0000\u0000\u0000\u0370"+
		"\u0373\u0003v;\u0000\u0371\u0373\u0003\u001a\r\u0000\u0372\u0370\u0001"+
		"\u0000\u0000\u0000\u0372\u0371\u0001\u0000\u0000\u0000\u0373\u0378\u0001"+
		"\u0000\u0000\u0000\u0374\u0375\u0005,\u0000\u0000\u0375\u0379\u0005,\u0000"+
		"\u0000\u0376\u0377\u0005-\u0000\u0000\u0377\u0379\u0005-\u0000\u0000\u0378"+
		"\u0374\u0001\u0000\u0000\u0000\u0378\u0376\u0001\u0000\u0000\u0000\u0379"+
		"\u037b\u0001\u0000\u0000\u0000\u037a\u036a\u0001\u0000\u0000\u0000\u037a"+
		"\u0372\u0001\u0000\u0000\u0000\u037bu\u0001\u0000\u0000\u0000\u037c\u037f"+
		"\u0003x<\u0000\u037d\u037f\u0005C\u0000\u0000\u037e\u037c\u0001\u0000"+
		"\u0000\u0000\u037e\u037d\u0001\u0000\u0000\u0000\u037fw\u0001\u0000\u0000"+
		"\u0000\u0380\u0383\u0005C\u0000\u0000\u0381\u0382\u0005\t\u0000\u0000"+
		"\u0382\u0384\u0005C\u0000\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0384"+
		"\u0385\u0001\u0000\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0385"+
		"\u0386\u0001\u0000\u0000\u0000\u0386y\u0001\u0000\u0000\u0000\u0080{\u0081"+
		"\u0088\u008d\u0094\u0099\u00a1\u00a7\u00a9\u00ac\u00af\u00b3\u00b7\u00c0"+
		"\u00c3\u00c9\u00cd\u00d2\u00e0\u00e3\u00e9\u00ed\u00f2\u00fa\u00ff\u0103"+
		"\u0108\u0110\u0115\u0118\u0121\u012a\u012f\u0135\u013d\u0143\u014c\u0153"+
		"\u015d\u0169\u0171\u0175\u017a\u018f\u0197\u019f\u01a7\u01b3\u01bf\u01c6"+
		"\u01cb\u01d3\u01d8\u01dd\u01e3\u01e9\u01f0\u01f6\u01fb\u0206\u020d\u0213"+
		"\u0218\u0220\u0227\u022d\u0231\u023a\u0241\u0248\u024e\u0257\u025e\u0265"+
		"\u026b\u0270\u0274\u0278\u027e\u0285\u028c\u029b\u02a2\u02a9\u02ac\u02af"+
		"\u02b2\u02b6\u02bc\u02c1\u02c8\u02d4\u02dd\u02e2\u02e7\u02f0\u02f7\u02fd"+
		"\u0301\u0307\u0309\u030d\u0313\u0315\u0319\u031f\u0321\u0324\u0331\u0335"+
		"\u033b\u033d\u0343\u0345\u034b\u034d\u0353\u0355\u0358\u0361\u0364\u036a"+
		"\u036e\u0372\u0378\u037a\u037e\u0385";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}