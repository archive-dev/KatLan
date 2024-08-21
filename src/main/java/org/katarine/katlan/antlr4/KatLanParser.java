// Generated from C:/Users/Egor/Documents/Java/gdx/KatLan/src/main/resources/KatLan.g4 by ANTLR 4.13.1
package org.katarine.katlan.antlr4;
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
		T__24=25, T__25=26, T__26=27, AS_KEYWORD=28, FOR_KEYWORD=29, IF_KEYWORD=30, 
		ELSE_KEYWORD=31, SWITCH_KEYWORD=32, STR=33, BOOL=34, INT=35, FLOAT=36, 
		DOUBLE=37, LONG=38, SHORT=39, BYTE=40, OBJ=41, VOID=42, NULL=43, DIV=44, 
		MOD=45, PLUS=46, MINUS=47, MULTIPLY=48, DIVIDE=49, POWER=50, PUBLIC=51, 
		PRIVATE=52, PROTECTED=53, STATIC=54, FINAL=55, OVERRIDE=56, TRUE=57, FALSE=58, 
		POST_MOD=59, PRE_MOD=60, OP_OV_MOD=61, NNULL_OP=62, NULL_OP=63, AND=64, 
		OR=65, NOT=66, XOR=67, BT=68, LT=69, EQ=70, NEQ=71, NE=72, LE=73, BE=74, 
		QUESTION_MARK=75, COLON=76, EXTENDS=77, CLASS_KEYWORD=78, ABSTRACT_KEYWORD=79, 
		INTERFACE_KEYWORD=80, ANNOTATION_KEYWORD=81, ENUM_KEYWORD=82, INT_VAL=83, 
		FLOAT_VAL=84, NAME0=85, STRING_VAL=86, ENDLINE=87, WS=88, COMMENT=89;
	public static final int
		RULE_class = 0, RULE_package = 1, RULE_importBlock = 2, RULE_importStatement = 3, 
		RULE_importStatic = 4, RULE_unnamedClassDef = 5, RULE_classDef = 6, RULE_interfaceDef = 7, 
		RULE_annotationDef = 8, RULE_packageBlock = 9, RULE_classBlock = 10, RULE_annotationClassBlock = 11, 
		RULE_block = 12, RULE_lineBlock = 13, RULE_value = 14, RULE_bool = 15, 
		RULE_genericTypeName = 16, RULE_genericDef = 17, RULE_genericTypeUse = 18, 
		RULE_genericExtendsStatement = 19, RULE_varAssignment = 20, RULE_varAccess = 21, 
		RULE_arrayAccess = 22, RULE_arrayAccess0 = 23, RULE_methodDef = 24, RULE_constructorDef = 25, 
		RULE_operatorOverDef = 26, RULE_parameters = 27, RULE_parameter = 28, 
		RULE_var = 29, RULE_constDef = 30, RULE_constDef0 = 31, RULE_constDef1 = 32, 
		RULE_varDef = 33, RULE_varDef0 = 34, RULE_varDef1 = 35, RULE_subVD1 = 36, 
		RULE_statement = 37, RULE_returnStatement = 38, RULE_switchStatement = 39, 
		RULE_subSwitch0 = 40, RULE_tryCatchFinally = 41, RULE_ifStatement = 42, 
		RULE_ifStatement0 = 43, RULE_whileLoopStatement = 44, RULE_forEachLoop = 45, 
		RULE_foriLoop = 46, RULE_foriLoop0 = 47, RULE_access = 48, RULE_methodModifier = 49, 
		RULE_modifier = 50, RULE_operator = 51, RULE_type = 52, RULE_anyType = 53, 
		RULE_linkType = 54, RULE_primitiveType = 55, RULE_nullType = 56, RULE_arguments = 57, 
		RULE_argument = 58, RULE_methodCall0 = 59, RULE_methodCall = 60, RULE_annotationCall = 61, 
		RULE_constructorCall = 62, RULE_expression = 63, RULE_logicalOr = 64, 
		RULE_logicalAnd = 65, RULE_logicalXor = 66, RULE_logicalNot = 67, RULE_primaryExpresion = 68, 
		RULE_arithCondExpression = 69, RULE_arithmeticExpression = 70, RULE_addSubExpression = 71, 
		RULE_modDivExpression = 72, RULE_mulDivExpression = 73, RULE_powerExpression = 74, 
		RULE_numberExpression = 75, RULE_incrExpression = 76, RULE_name = 77, 
		RULE_dot_name = 78, RULE_numeric_value = 79, RULE_extends = 80;
	private static String[] makeRuleNames() {
		return new String[] {
			"class", "package", "importBlock", "importStatement", "importStatic", 
			"unnamedClassDef", "classDef", "interfaceDef", "annotationDef", "packageBlock", 
			"classBlock", "annotationClassBlock", "block", "lineBlock", "value", 
			"bool", "genericTypeName", "genericDef", "genericTypeUse", "genericExtendsStatement", 
			"varAssignment", "varAccess", "arrayAccess", "arrayAccess0", "methodDef", 
			"constructorDef", "operatorOverDef", "parameters", "parameter", "var", 
			"constDef", "constDef0", "constDef1", "varDef", "varDef0", "varDef1", 
			"subVD1", "statement", "returnStatement", "switchStatement", "subSwitch0", 
			"tryCatchFinally", "ifStatement", "ifStatement0", "whileLoopStatement", 
			"forEachLoop", "foriLoop", "foriLoop0", "access", "methodModifier", "modifier", 
			"operator", "type", "anyType", "linkType", "primitiveType", "nullType", 
			"arguments", "argument", "methodCall0", "methodCall", "annotationCall", 
			"constructorCall", "expression", "logicalOr", "logicalAnd", "logicalXor", 
			"logicalNot", "primaryExpresion", "arithCondExpression", "arithmeticExpression", 
			"addSubExpression", "modDivExpression", "mulDivExpression", "powerExpression", 
			"numberExpression", "incrExpression", "name", "dot_name", "numeric_value", 
			"extends"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'import'", "'import static'", "','", "'{'", "'}'", 
			"'='", "'.'", "'['", "']'", "'def'", "'('", "')'", "'new'", "'const'", 
			"'var'", "'return'", "'default'", "'->'", "'try'", "'catch'", "'finally'", 
			"'while'", "'in'", "'..'", "'@'", "'$'", "'as'", "'for'", "'if'", "'else'", 
			"'switch'", "'str'", "'bool'", "'int'", "'float'", "'double'", "'long'", 
			"'short'", "'byte'", "'obj'", "'void'", "'null'", "'div'", "'%'", "'+'", 
			"'-'", "'*'", "'/'", "'**'", null, null, null, "'static'", null, "'override'", 
			"'true'", "'false'", "'post'", "'pre'", null, "'!!'", "'??'", null, null, 
			null, null, "'>'", "'<'", "'=='", "'==='", "'!='", "'<='", "'>='", "'?'", 
			"':'", null, "'class'", "'abstract'", "'interface'", "'annotation'", 
			"'enum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "AS_KEYWORD", "FOR_KEYWORD", "IF_KEYWORD", "ELSE_KEYWORD", 
			"SWITCH_KEYWORD", "STR", "BOOL", "INT", "FLOAT", "DOUBLE", "LONG", "SHORT", 
			"BYTE", "OBJ", "VOID", "NULL", "DIV", "MOD", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "POWER", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL", 
			"OVERRIDE", "TRUE", "FALSE", "POST_MOD", "PRE_MOD", "OP_OV_MOD", "NNULL_OP", 
			"NULL_OP", "AND", "OR", "NOT", "XOR", "BT", "LT", "EQ", "NEQ", "NE", 
			"LE", "BE", "QUESTION_MARK", "COLON", "EXTENDS", "CLASS_KEYWORD", "ABSTRACT_KEYWORD", 
			"INTERFACE_KEYWORD", "ANNOTATION_KEYWORD", "ENUM_KEYWORD", "INT_VAL", 
			"FLOAT_VAL", "NAME0", "STRING_VAL", "ENDLINE", "WS", "COMMENT"
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
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public InterfaceDefContext interfaceDef() {
			return getRuleContext(InterfaceDefContext.class,0);
		}
		public UnnamedClassDefContext unnamedClassDef() {
			return getRuleContext(UnnamedClassDefContext.class,0);
		}
		public AnnotationDefContext annotationDef() {
			return getRuleContext(AnnotationDefContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public PackageContext package_() {
			return getRuleContext(PackageContext.class,0);
		}
		public ImportBlockContext importBlock() {
			return getRuleContext(ImportBlockContext.class,0);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					match(ENDLINE);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(168);
				package_();
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__2) {
				{
				setState(171);
				importBlock();
				}
			}

			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(174);
				classDef();
				}
				break;
			case 2:
				{
				setState(175);
				interfaceDef();
				}
				break;
			case 3:
				{
				setState(176);
				unnamedClassDef();
				}
				break;
			case 4:
				{
				setState(177);
				annotationDef();
				}
				break;
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(180);
				match(ENDLINE);
				}
				}
				setState(185);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__0);
			setState(187);
			name();
			setState(189); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(188);
					match(ENDLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class ImportBlockContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<ImportStaticContext> importStatic() {
			return getRuleContexts(ImportStaticContext.class);
		}
		public ImportStaticContext importStatic(int i) {
			return getRuleContext(ImportStaticContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(193);
					importStatement();
					}
					break;
				case T__2:
					{
					setState(194);
					importStatic();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(197);
						match(ENDLINE);
						}
						} 
					}
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==T__2 );
			}
		}
		catch (RecognitionException re) {
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
			setState(207);
			match(T__1);
			setState(208);
			name();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_KEYWORD) {
				{
				setState(209);
				match(AS_KEYWORD);
				setState(210);
				name();
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
	public static class ImportStaticContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode AS_KEYWORD() { return getToken(KatLanParser.AS_KEYWORD, 0); }
		public ImportStaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterImportStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitImportStatic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitImportStatic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStaticContext importStatic() throws RecognitionException {
		ImportStaticContext _localctx = new ImportStaticContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importStatic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__2);
			setState(214);
			name();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_KEYWORD) {
				{
				setState(215);
				match(AS_KEYWORD);
				setState(216);
				name();
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
	public static class UnnamedClassDefContext extends ParserRuleContext {
		public List<PackageBlockContext> packageBlock() {
			return getRuleContexts(PackageBlockContext.class);
		}
		public PackageBlockContext packageBlock(int i) {
			return getRuleContext(PackageBlockContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public ExtendsContext extends_() {
			return getRuleContext(ExtendsContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
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
		enterRule(_localctx, 10, RULE_unnamedClassDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(219);
				packageBlock();
				}
				break;
			}
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					match(ENDLINE);
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==EXTENDS) {
				{
				setState(228);
				extends_();
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
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(237);
						match(ENDLINE);
						}
						} 
					}
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
			}

			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(245);
				match(T__4);
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(246);
						match(ENDLINE);
						}
						} 
					}
					setState(251);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4177088654520469504L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 159L) != 0)) {
					{
					setState(252);
					classBlock();
					}
				}

				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(255);
					match(ENDLINE);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				match(T__5);
				}
			}

			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264);
					match(ENDLINE);
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1871245645306759168L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 159L) != 0)) {
				{
				setState(270);
				packageBlock();
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
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ExtendsContext extends_() {
			return getRuleContext(ExtendsContext.class,0);
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
		enterRule(_localctx, 12, RULE_classDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(273);
				annotationCall();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME0) {
				{
				setState(279);
				modifier();
				}
			}

			setState(282);
			access();
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_KEYWORD:
			case ABSTRACT_KEYWORD:
				{
				{
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABSTRACT_KEYWORD) {
					{
					setState(283);
					match(ABSTRACT_KEYWORD);
					}
				}

				setState(286);
				match(CLASS_KEYWORD);
				}
				}
				break;
			case ENUM_KEYWORD:
				{
				setState(287);
				match(ENUM_KEYWORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(290);
			name();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==EXTENDS) {
				{
				setState(291);
				extends_();
				setState(292);
				name();
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(293);
					match(T__3);
					setState(294);
					name();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(302);
			match(T__4);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					match(ENDLINE);
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4177088654520469504L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 159L) != 0)) {
				{
				setState(309);
				classBlock();
				}
			}

			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(312);
				match(ENDLINE);
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
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
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ExtendsContext extends_() {
			return getRuleContext(ExtendsContext.class,0);
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
		enterRule(_localctx, 14, RULE_interfaceDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(320);
				annotationCall();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME0) {
				{
				setState(326);
				modifier();
				}
			}

			setState(329);
			access();
			setState(330);
			match(INTERFACE_KEYWORD);
			setState(331);
			name();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==EXTENDS) {
				{
				setState(332);
				extends_();
				setState(333);
				name();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(334);
					match(T__3);
					setState(335);
					name();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(343);
			match(T__4);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344);
					match(ENDLINE);
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4177088654520469504L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 159L) != 0)) {
				{
				setState(350);
				classBlock();
				}
			}

			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(353);
				match(ENDLINE);
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
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
	public static class AnnotationDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode ANNOTATION_KEYWORD() { return getToken(KatLanParser.ANNOTATION_KEYWORD, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public AnnotationClassBlockContext annotationClassBlock() {
			return getRuleContext(AnnotationClassBlockContext.class,0);
		}
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ExtendsContext extends_() {
			return getRuleContext(ExtendsContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public AnnotationDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterAnnotationDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitAnnotationDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitAnnotationDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationDefContext annotationDef() throws RecognitionException {
		AnnotationDefContext _localctx = new AnnotationDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_annotationDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(361);
				annotationCall();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME0) {
				{
				setState(367);
				modifier();
				}
			}

			setState(370);
			access();
			setState(371);
			match(ANNOTATION_KEYWORD);
			setState(372);
			name();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==EXTENDS) {
				{
				setState(373);
				extends_();
				setState(374);
				name();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(375);
					match(T__3);
					setState(376);
					name();
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(384);
			match(T__4);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(385);
				match(ENDLINE);
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			annotationClassBlock();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(392);
				match(ENDLINE);
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
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
	public static class PackageBlockContext extends ParserRuleContext {
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
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public List<InterfaceDefContext> interfaceDef() {
			return getRuleContexts(InterfaceDefContext.class);
		}
		public InterfaceDefContext interfaceDef(int i) {
			return getRuleContext(InterfaceDefContext.class,i);
		}
		public List<AnnotationDefContext> annotationDef() {
			return getRuleContexts(AnnotationDefContext.class);
		}
		public AnnotationDefContext annotationDef(int i) {
			return getRuleContext(AnnotationDefContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public PackageBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterPackageBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitPackageBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitPackageBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageBlockContext packageBlock() throws RecognitionException {
		PackageBlockContext _localctx = new PackageBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_packageBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(405);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(400);
						var();
						}
						break;
					case 2:
						{
						setState(401);
						methodDef();
						}
						break;
					case 3:
						{
						setState(402);
						classDef();
						}
						break;
					case 4:
						{
						setState(403);
						interfaceDef();
						}
						break;
					case 5:
						{
						setState(404);
						annotationDef();
						}
						break;
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(407);
							match(ENDLINE);
							}
							} 
						}
						setState(412);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(415); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		public List<OperatorOverDefContext> operatorOverDef() {
			return getRuleContexts(OperatorOverDefContext.class);
		}
		public OperatorOverDefContext operatorOverDef(int i) {
			return getRuleContext(OperatorOverDefContext.class,i);
		}
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public List<InterfaceDefContext> interfaceDef() {
			return getRuleContexts(InterfaceDefContext.class);
		}
		public InterfaceDefContext interfaceDef(int i) {
			return getRuleContext(InterfaceDefContext.class,i);
		}
		public List<AnnotationDefContext> annotationDef() {
			return getRuleContexts(AnnotationDefContext.class);
		}
		public AnnotationDefContext annotationDef(int i) {
			return getRuleContext(AnnotationDefContext.class,i);
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
		enterRule(_localctx, 20, RULE_classBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(417);
					var();
					}
					break;
				case 2:
					{
					setState(418);
					methodDef();
					}
					break;
				case 3:
					{
					setState(419);
					constructorDef();
					}
					break;
				case 4:
					{
					setState(420);
					operatorOverDef();
					}
					break;
				case 5:
					{
					setState(421);
					classDef();
					}
					break;
				case 6:
					{
					setState(422);
					interfaceDef();
					}
					break;
				case 7:
					{
					setState(423);
					annotationDef();
					}
					break;
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(426);
						match(ENDLINE);
						}
						} 
					}
					setState(431);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				}
				}
				setState(434); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4177088654520469504L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 159L) != 0) );
			}
		}
		catch (RecognitionException re) {
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
	public static class AnnotationClassBlockContext extends ParserRuleContext {
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
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public List<InterfaceDefContext> interfaceDef() {
			return getRuleContexts(InterfaceDefContext.class);
		}
		public InterfaceDefContext interfaceDef(int i) {
			return getRuleContext(InterfaceDefContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public AnnotationClassBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationClassBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterAnnotationClassBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitAnnotationClassBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitAnnotationClassBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationClassBlockContext annotationClassBlock() throws RecognitionException {
		AnnotationClassBlockContext _localctx = new AnnotationClassBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_annotationClassBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(448); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(436);
					var();
					}
					break;
				case 2:
					{
					setState(437);
					methodDef();
					}
					break;
				case 3:
					{
					setState(438);
					classDef();
					}
					break;
				case 4:
					{
					setState(439);
					interfaceDef();
					}
					break;
				}
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(442);
						match(ENDLINE);
						}
						} 
					}
					setState(447);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				}
				setState(450); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1871245645306759168L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 151L) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70016906506240000L) != 0) || _la==NAME0) {
				{
				{
				setState(452);
				lineBlock();
				}
				}
				setState(457);
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
		enterRule(_localctx, 26, RULE_lineBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(458);
				var();
				}
				break;
			case 2:
				{
				setState(459);
				varAssignment();
				}
				break;
			case 3:
				{
				setState(460);
				methodCall();
				}
				break;
			case 4:
				{
				setState(461);
				statement();
				}
				break;
			}
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDLINE:
				{
				setState(465); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(464);
						match(ENDLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(467); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(469);
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
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(STRING_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				arithmeticExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
				name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(477);
				anyType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(478);
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
		enterRule(_localctx, 30, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
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
	public static class GenericTypeNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode QUESTION_MARK() { return getToken(KatLanParser.QUESTION_MARK, 0); }
		public GenericTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterGenericTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitGenericTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitGenericTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeNameContext genericTypeName() throws RecognitionException {
		GenericTypeNameContext _localctx = new GenericTypeNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_genericTypeName);
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME0:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				name();
				}
				break;
			case QUESTION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(QUESTION_MARK);
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
	public static class GenericDefContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(KatLanParser.LT, 0); }
		public List<GenericTypeUseContext> genericTypeUse() {
			return getRuleContexts(GenericTypeUseContext.class);
		}
		public GenericTypeUseContext genericTypeUse(int i) {
			return getRuleContext(GenericTypeUseContext.class,i);
		}
		public TerminalNode BT() { return getToken(KatLanParser.BT, 0); }
		public GenericDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterGenericDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitGenericDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitGenericDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericDefContext genericDef() throws RecognitionException {
		GenericDefContext _localctx = new GenericDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_genericDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(487);
			match(LT);
			setState(488);
			genericTypeUse();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(489);
				match(T__3);
				setState(490);
				genericTypeUse();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			match(BT);
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
	public static class GenericTypeUseContext extends ParserRuleContext {
		public GenericTypeNameContext genericTypeName() {
			return getRuleContext(GenericTypeNameContext.class,0);
		}
		public GenericExtendsStatementContext genericExtendsStatement() {
			return getRuleContext(GenericExtendsStatementContext.class,0);
		}
		public GenericTypeUseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeUse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterGenericTypeUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitGenericTypeUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitGenericTypeUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeUseContext genericTypeUse() throws RecognitionException {
		GenericTypeUseContext _localctx = new GenericTypeUseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_genericTypeUse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			genericTypeName();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==EXTENDS) {
				{
				setState(499);
				genericExtendsStatement();
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
	public static class GenericExtendsStatementContext extends ParserRuleContext {
		public AnyTypeContext anyType() {
			return getRuleContext(AnyTypeContext.class,0);
		}
		public ExtendsContext extends_() {
			return getRuleContext(ExtendsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KatLanParser.COLON, 0); }
		public GenericExtendsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericExtendsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterGenericExtendsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitGenericExtendsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitGenericExtendsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericExtendsStatementContext genericExtendsStatement() throws RecognitionException {
		GenericExtendsStatementContext _localctx = new GenericExtendsStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_genericExtendsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(502);
				extends_();
				}
				break;
			case 2:
				{
				setState(503);
				match(COLON);
				}
				break;
			}
			setState(506);
			anyType();
			}
		}
		catch (RecognitionException re) {
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
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
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
		enterRule(_localctx, 40, RULE_varAssignment);
		try {
			int _alt;
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(508);
						annotationCall();
						}
						} 
					}
					setState(513);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				{
				setState(514);
				varAccess();
				setState(515);
				match(T__6);
				setState(516);
				value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
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
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
		}
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
		enterRule(_localctx, 42, RULE_varAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(521);
				annotationCall();
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			match(NAME0);
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(528);
				match(T__7);
				setState(529);
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
		enterRule(_localctx, 44, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			varAccess();
			setState(534); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(533);
				arrayAccess0();
				}
				}
				setState(536); 
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
		enterRule(_localctx, 46, RULE_arrayAccess0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(538);
			match(T__8);
			setState(539);
			arithmeticExpression();
			setState(540);
			match(T__9);
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
		public MethodModifierContext methodModifier() {
			return getRuleContext(MethodModifierContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KatLanParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LineBlockContext lineBlock() {
			return getRuleContext(LineBlockContext.class,0);
		}
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public GenericDefContext genericDef() {
			return getRuleContext(GenericDefContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 48, RULE_methodDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(542);
				annotationCall();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME0) {
				{
				setState(548);
				modifier();
				}
			}

			setState(551);
			access();
			setState(552);
			methodModifier();
			setState(553);
			match(T__10);
			setState(554);
			name();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(555);
				genericDef();
				}
			}

			setState(558);
			match(T__11);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==NAME0) {
				{
				setState(559);
				parameters();
				}
			}

			setState(562);
			match(T__12);
			setState(563);
			match(COLON);
			setState(564);
			type();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(565);
				match(ENDLINE);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(571);
				match(T__4);
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(572);
						match(ENDLINE);
						}
						} 
					}
					setState(577);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(578);
				block();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(579);
					match(ENDLINE);
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(585);
				match(T__5);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
			case T__26:
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
				setState(587);
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
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
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
		enterRule(_localctx, 50, RULE_constructorDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(590);
				annotationCall();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME0) {
				{
				setState(596);
				modifier();
				}
			}

			setState(599);
			access();
			setState(600);
			match(T__13);
			setState(601);
			name();
			setState(602);
			match(T__11);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==NAME0) {
				{
				setState(603);
				parameters();
				}
			}

			setState(606);
			match(T__12);
			setState(607);
			match(T__4);
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(608);
					match(ENDLINE);
					}
					} 
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(614);
			block();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(615);
				match(ENDLINE);
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
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
	public static class OperatorOverDefContext extends ParserRuleContext {
		public TerminalNode OP_OV_MOD() { return getToken(KatLanParser.OP_OV_MOD, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
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
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
		}
		public OperatorOverDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorOverDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterOperatorOverDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitOperatorOverDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitOperatorOverDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorOverDefContext operatorOverDef() throws RecognitionException {
		OperatorOverDefContext _localctx = new OperatorOverDefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operatorOverDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(623);
				annotationCall();
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			match(OP_OV_MOD);
			setState(630);
			operator();
			setState(631);
			match(T__11);
			setState(632);
			parameter();
			setState(633);
			match(T__12);
			setState(634);
			match(T__4);
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(635);
					match(ENDLINE);
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(641);
			block();
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
			match(T__5);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 54, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(650);
			parameter();
			}
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(651);
				match(T__3);
				setState(652);
				parameter();
				}
				}
				setState(657);
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
		public TerminalNode COLON() { return getToken(KatLanParser.COLON, 0); }
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
		enterRule(_localctx, 56, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(658);
				annotationCall();
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(664);
			name();
			setState(665);
			match(COLON);
			setState(666);
			type();
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(667);
				match(T__6);
				setState(668);
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
		enterRule(_localctx, 58, RULE_var);
		try {
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
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
		enterRule(_localctx, 60, RULE_constDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			access();
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(676);
				constDef0();
				}
				break;
			case 2:
				{
				setState(677);
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
		public TerminalNode COLON() { return getToken(KatLanParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
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
		enterRule(_localctx, 62, RULE_constDef0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(680);
				annotationCall();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
			match(T__14);
			setState(687);
			name();
			setState(688);
			match(COLON);
			setState(689);
			type();
			setState(690);
			match(T__6);
			setState(691);
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
		public TerminalNode COLON() { return getToken(KatLanParser.COLON, 0); }
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
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
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
		enterRule(_localctx, 64, RULE_constDef1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(693);
				annotationCall();
				}
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(699);
			match(T__14);
			{
			setState(700);
			name();
			setState(701);
			match(T__6);
			setState(702);
			value();
			}
			setState(709); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(704);
				match(T__3);
				setState(705);
				name();
				setState(706);
				match(T__6);
				setState(707);
				value();
				}
				}
				setState(711); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(713);
			match(COLON);
			setState(714);
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
		enterRule(_localctx, 66, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			access();
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(717);
				varDef0();
				}
				break;
			case 2:
				{
				setState(718);
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
		public TerminalNode COLON() { return getToken(KatLanParser.COLON, 0); }
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
		enterRule(_localctx, 68, RULE_varDef0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(721);
				annotationCall();
				}
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(727);
			match(T__15);
			setState(728);
			name();
			setState(729);
			match(COLON);
			setState(730);
			type();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(731);
				match(T__6);
				setState(732);
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
		public TerminalNode COLON() { return getToken(KatLanParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<AnnotationCallContext> annotationCall() {
			return getRuleContexts(AnnotationCallContext.class);
		}
		public AnnotationCallContext annotationCall(int i) {
			return getRuleContext(AnnotationCallContext.class,i);
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
		enterRule(_localctx, 70, RULE_varDef1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(735);
				annotationCall();
				}
				}
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(741);
			match(T__15);
			setState(742);
			subVD1();
			setState(745); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(743);
				match(T__3);
				setState(744);
				subVD1();
				}
				}
				setState(747); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(749);
			match(COLON);
			setState(750);
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
		enterRule(_localctx, 72, RULE_subVD1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			name();
			{
			setState(753);
			match(T__6);
			setState(754);
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
		enterRule(_localctx, 74, RULE_statement);
		try {
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				switchStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(758);
				foriLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(759);
				foriLoop0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(760);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(761);
				whileLoopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(762);
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
		enterRule(_localctx, 76, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(T__16);
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432574254190448640L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1966081L) != 0)) {
				{
				setState(766);
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
		enterRule(_localctx, 78, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(SWITCH_KEYWORD);
			setState(770);
			match(T__11);
			setState(771);
			value();
			setState(772);
			match(T__12);
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(773);
				match(ENDLINE);
				}
				}
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(779);
			match(T__4);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(780);
				match(ENDLINE);
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(787); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(786);
				subSwitch0();
				}
				}
				setState(789); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 432574254190710784L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1966081L) != 0) );
			setState(791);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_subSwitch0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__13:
			case T__26:
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
				setState(793);
				value();
				}
				break;
			case T__17:
				{
				setState(794);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(797);
			match(T__18);
			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(798);
				match(T__4);
				setState(802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(799);
						match(ENDLINE);
						}
						} 
					}
					setState(804);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(805);
				block();
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(806);
					match(ENDLINE);
					}
					}
					setState(811);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(812);
				match(T__5);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
			case T__26:
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
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(814);
					match(ENDLINE);
					}
					}
					setState(819);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(820);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(823);
				match(ENDLINE);
				}
				}
				setState(828);
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
		enterRule(_localctx, 82, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(T__19);
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(830);
				varAssignment();
				}
				break;
			}
			setState(850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(833);
				match(T__4);
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(834);
						match(ENDLINE);
						}
						} 
					}
					setState(839);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				setState(840);
				block();
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(841);
					match(ENDLINE);
					}
					}
					setState(846);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(847);
				match(T__5);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
			case T__26:
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
				setState(849);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(852);
				match(ENDLINE);
				}
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(858);
			match(T__20);
			setState(859);
			match(T__11);
			setState(860);
			parameter();
			setState(861);
			match(T__12);
			setState(879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(862);
				match(T__4);
				setState(866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(863);
						match(ENDLINE);
						}
						} 
					}
					setState(868);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				setState(869);
				block();
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(870);
					match(ENDLINE);
					}
					}
					setState(875);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(876);
				match(T__5);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
			case T__26:
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
				setState(878);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(884);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(881);
					match(ENDLINE);
					}
					} 
				}
				setState(886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(887);
				match(T__21);
				setState(905);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(888);
					match(T__4);
					setState(892);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(889);
							match(ENDLINE);
							}
							} 
						}
						setState(894);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
					}
					setState(895);
					block();
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ENDLINE) {
						{
						{
						setState(896);
						match(ENDLINE);
						}
						}
						setState(901);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(902);
					match(T__5);
					}
					}
					break;
				case T__14:
				case T__15:
				case T__16:
				case T__19:
				case T__22:
				case T__26:
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
					setState(904);
					lineBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(907);
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
		enterRule(_localctx, 84, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(IF_KEYWORD);
			setState(912);
			match(T__11);
			setState(913);
			expression();
			setState(914);
			match(T__12);
			setState(915);
			ifStatement0();
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KEYWORD) {
				{
				setState(916);
				match(ELSE_KEYWORD);
				setState(917);
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
		enterRule(_localctx, 86, RULE_ifStatement0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(920);
				match(ENDLINE);
				}
				}
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(926);
				match(T__4);
				setState(930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(927);
						match(ENDLINE);
						}
						} 
					}
					setState(932);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				}
				setState(933);
				block();
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(934);
					match(ENDLINE);
					}
					}
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(940);
				match(T__5);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
			case T__26:
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
				setState(942);
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
		enterRule(_localctx, 88, RULE_whileLoopStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(T__22);
			setState(946);
			match(T__11);
			setState(947);
			expression();
			setState(948);
			match(T__12);
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(949);
				match(ENDLINE);
				}
				}
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(955);
				match(T__4);
				setState(959);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(956);
						match(ENDLINE);
						}
						} 
					}
					setState(961);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				}
				setState(962);
				block();
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(963);
					match(ENDLINE);
					}
					}
					setState(968);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(969);
				match(T__5);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
			case T__26:
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
				setState(971);
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
	public static class ForEachLoopContext extends ParserRuleContext {
		public TerminalNode FOR_KEYWORD() { return getToken(KatLanParser.FOR_KEYWORD, 0); }
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public VarAccessContext varAccess() {
			return getRuleContext(VarAccessContext.class,0);
		}
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
		public ForEachLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterForEachLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitForEachLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitForEachLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachLoopContext forEachLoop() throws RecognitionException {
		ForEachLoopContext _localctx = new ForEachLoopContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_forEachLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(FOR_KEYWORD);
			setState(975);
			match(T__11);
			setState(976);
			varDef();
			setState(977);
			match(T__23);
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(978);
				varAccess();
				}
				break;
			case 2:
				{
				setState(979);
				value();
				}
				break;
			}
			setState(982);
			match(T__12);
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(983);
				match(ENDLINE);
				}
				}
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(989);
				match(T__4);
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(990);
					match(ENDLINE);
					}
					}
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(996);
				block();
				setState(997);
				match(T__5);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
			case T__26:
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
				setState(999);
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
		enterRule(_localctx, 92, RULE_foriLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			match(FOR_KEYWORD);
			setState(1003);
			match(T__11);
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805794358525952L) != 0)) {
				{
				setState(1004);
				varDef();
				}
			}

			setState(1007);
			match(ENDLINE);
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432556670594338816L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 917505L) != 0)) {
				{
				setState(1008);
				expression();
				}
			}

			setState(1011);
			match(ENDLINE);
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & 288230376153284609L) != 0)) {
				{
				setState(1012);
				varAssignment();
				}
			}

			setState(1015);
			match(T__12);
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(1016);
				match(ENDLINE);
				}
				}
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(1022);
				match(T__4);
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(1023);
					match(ENDLINE);
					}
					}
					setState(1028);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1029);
				block();
				setState(1030);
				match(T__5);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
			case T__26:
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
				setState(1032);
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
		public TerminalNode COLON() { return getToken(KatLanParser.COLON, 0); }
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
		enterRule(_localctx, 94, RULE_foriLoop0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(FOR_KEYWORD);
			setState(1036);
			match(T__11);
			setState(1037);
			name();
			setState(1038);
			match(COLON);
			setState(1039);
			type();
			setState(1040);
			match(T__3);
			setState(1041);
			value();
			setState(1042);
			match(T__24);
			setState(1043);
			value();
			setState(1044);
			match(T__12);
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(1045);
				match(ENDLINE);
				}
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1062);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(1051);
				match(T__4);
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(1052);
					match(ENDLINE);
					}
					}
					setState(1057);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1058);
				block();
				setState(1059);
				match(T__5);
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__22:
			case T__26:
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
				setState(1061);
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
		enterRule(_localctx, 96, RULE_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598695796736L) != 0)) {
				{
				setState(1064);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598695796736L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1067);
				match(STATIC);
				}
			}

			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(1070);
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
	public static class MethodModifierContext extends ParserRuleContext {
		public TerminalNode OVERRIDE() { return getToken(KatLanParser.OVERRIDE, 0); }
		public TerminalNode ABSTRACT_KEYWORD() { return getToken(KatLanParser.ABSTRACT_KEYWORD, 0); }
		public TerminalNode PRE_MOD() { return getToken(KatLanParser.PRE_MOD, 0); }
		public TerminalNode POST_MOD() { return getToken(KatLanParser.POST_MOD, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(1073);
				match(OVERRIDE);
				}
			}

			setState(1078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT_KEYWORD:
				{
				setState(1076);
				match(ABSTRACT_KEYWORD);
				}
				break;
			case POST_MOD:
			case PRE_MOD:
				{
				setState(1077);
				_la = _input.LA(1);
				if ( !(_la==POST_MOD || _la==PRE_MOD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__10:
				break;
			default:
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
	public static class ModifierContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			name();
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME0) {
				{
				{
				setState(1081);
				name();
				}
				}
				setState(1086);
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
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(KatLanParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(KatLanParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(KatLanParser.DIV, 0); }
		public TerminalNode DIVIDE() { return getToken(KatLanParser.DIVIDE, 0); }
		public TerminalNode MULTIPLY() { return getToken(KatLanParser.MULTIPLY, 0); }
		public TerminalNode POWER() { return getToken(KatLanParser.POWER, 0); }
		public TerminalNode MOD() { return getToken(KatLanParser.MOD, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234207627640832L) != 0)) ) {
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
	public static class TypeContext extends ParserRuleContext {
		public AnyTypeContext anyType() {
			return getRuleContext(AnyTypeContext.class,0);
		}
		public LinkTypeContext linkType() {
			return getRuleContext(LinkTypeContext.class,0);
		}
		public TerminalNode NNULL_OP() { return getToken(KatLanParser.NNULL_OP, 0); }
		public TerminalNode NULL_OP() { return getToken(KatLanParser.NULL_OP, 0); }
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
		enterRule(_localctx, 104, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
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
				setState(1089);
				anyType();
				}
				break;
			case T__25:
				{
				setState(1090);
				linkType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(1093);
				match(T__8);
				setState(1094);
				match(T__9);
				}
				}
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NNULL_OP || _la==NULL_OP) {
				{
				setState(1100);
				_la = _input.LA(1);
				if ( !(_la==NNULL_OP || _la==NULL_OP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
		enterRule(_localctx, 106, RULE_anyType);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
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
				setState(1104);
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
		enterRule(_localctx, 108, RULE_linkType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(T__25);
			setState(1112);
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
				setState(1108);
				anyType();
				}
				break;
			case CLASS_KEYWORD:
				{
				setState(1109);
				match(CLASS_KEYWORD);
				}
				break;
			case INTERFACE_KEYWORD:
				{
				setState(1110);
				match(INTERFACE_KEYWORD);
				}
				break;
			case ENUM_KEYWORD:
				{
				setState(1111);
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
		enterRule(_localctx, 110, RULE_primitiveType);
		try {
			setState(1124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114);
				match(STR);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				match(BOOL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1116);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1117);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1118);
				match(DOUBLE);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1119);
				match(LONG);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1120);
				match(SHORT);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1121);
				match(BYTE);
				}
				break;
			case OBJ:
				enterOuterAlt(_localctx, 9);
				{
				setState(1122);
				match(OBJ);
				}
				break;
			case VOID:
			case NULL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1123);
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
		enterRule(_localctx, 112, RULE_nullType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
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
		enterRule(_localctx, 114, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			argument();
			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1129);
				match(T__3);
				setState(1130);
				argument();
				}
				}
				setState(1135);
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
		enterRule(_localctx, 116, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
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
		enterRule(_localctx, 118, RULE_methodCall0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1138);
					annotationCall();
					}
					} 
				}
				setState(1143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			setState(1147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1144);
				varAccess();
				setState(1145);
				match(T__7);
				}
				break;
			}
			setState(1149);
			match(NAME0);
			setState(1150);
			match(T__11);
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432574254190448640L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1966081L) != 0)) {
				{
				setState(1151);
				arguments();
				}
			}

			setState(1154);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 120, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			methodCall0();
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(1157);
				match(T__7);
				setState(1158);
				methodCall0();
				}
				}
				setState(1163);
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
	public static class AnnotationCallContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
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
		enterRule(_localctx, 122, RULE_annotationCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			match(T__26);
			setState(1165);
			name();
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(1166);
				match(T__11);
				setState(1167);
				arguments();
				setState(1168);
				match(T__12);
				}
			}

			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(1172);
				match(ENDLINE);
				}
				}
				setState(1177);
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
		enterRule(_localctx, 124, RULE_constructorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			match(T__13);
			setState(1179);
			name();
			setState(1180);
			match(T__11);
			setState(1182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432574254190448640L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1966081L) != 0)) {
				{
				setState(1181);
				arguments();
				}
			}

			setState(1184);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_expression);
		try {
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				primaryExpresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1187);
				logicalOr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1188);
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
		enterRule(_localctx, 128, RULE_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1191);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(1192);
				logicalAnd();
				}
				break;
			}
			setState(1201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(1195);
				match(OR);
				setState(1199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1196);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(1197);
					logicalAnd();
					}
					break;
				case 3:
					{
					setState(1198);
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
		enterRule(_localctx, 130, RULE_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1203);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(1204);
				logicalXor();
				}
				break;
			}
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1207);
				match(AND);
				setState(1211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1208);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(1209);
					logicalXor();
					}
					break;
				case 3:
					{
					setState(1210);
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
		enterRule(_localctx, 132, RULE_logicalXor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1215);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(1216);
				logicalNot();
				}
				break;
			}
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XOR) {
				{
				setState(1219);
				match(XOR);
				setState(1223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1220);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(1221);
					logicalNot();
					}
					break;
				case 3:
					{
					setState(1222);
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
		enterRule(_localctx, 134, RULE_logicalNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1227);
				match(NOT);
				}
			}

			setState(1230);
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
		public VarAccessContext varAccess() {
			return getRuleContext(VarAccessContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
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
		enterRule(_localctx, 136, RULE_primaryExpresion);
		try {
			setState(1242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1232);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1233);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1234);
				varAccess();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1235);
				name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1236);
				match(T__11);
				setState(1237);
				expression();
				setState(1238);
				match(T__12);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1240);
				constructorCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1241);
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
		enterRule(_localctx, 138, RULE_arithCondExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			arithmeticExpression();
			setState(1245);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 119L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1246);
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
		enterRule(_localctx, 140, RULE_arithmeticExpression);
		try {
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1248);
				numberExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249);
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
		enterRule(_localctx, 142, RULE_addSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			modDivExpression();
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1253);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1254);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(1255);
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
		enterRule(_localctx, 144, RULE_modDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			mulDivExpression();
			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIV || _la==MOD) {
				{
				setState(1261);
				_la = _input.LA(1);
				if ( !(_la==DIV || _la==MOD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1262);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(1263);
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
		enterRule(_localctx, 146, RULE_mulDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			powerExpression();
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLY || _la==DIVIDE) {
				{
				setState(1269);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1270);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(1271);
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
		enterRule(_localctx, 148, RULE_powerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			numberExpression();
			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(1277);
				match(POWER);
				setState(1280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1278);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(1279);
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
		enterRule(_localctx, 150, RULE_numberExpression);
		int _la;
		try {
			setState(1297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1284);
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

				setState(1294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1287);
					methodCall();
					}
					break;
				case 2:
					{
					setState(1288);
					name();
					}
					break;
				case 3:
					{
					setState(1289);
					numeric_value();
					}
					break;
				case 4:
					{
					{
					setState(1290);
					match(T__11);
					setState(1291);
					arithmeticExpression();
					setState(1292);
					match(T__12);
					}
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
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
		enterRule(_localctx, 152, RULE_incrExpression);
		try {
			setState(1319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1303);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(1299);
					match(PLUS);
					setState(1300);
					match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(1301);
					match(MINUS);
					setState(1302);
					match(MINUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1305);
					name();
					}
					break;
				case 2:
					{
					setState(1306);
					varAccess();
					}
					break;
				}
				}
				}
				break;
			case T__26:
			case NAME0:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1309);
					name();
					}
					break;
				case 2:
					{
					setState(1310);
					varAccess();
					}
					break;
				}
				setState(1317);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(1313);
					match(PLUS);
					setState(1314);
					match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(1315);
					match(MINUS);
					setState(1316);
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
		enterRule(_localctx, 154, RULE_name);
		try {
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321);
				dot_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1322);
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
		enterRule(_localctx, 156, RULE_dot_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			match(NAME0);
			setState(1328); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1326);
				match(T__7);
				setState(1327);
				match(NAME0);
				}
				}
				setState(1330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 158, RULE_numeric_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExtendsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(KatLanParser.EXTENDS, 0); }
		public TerminalNode COLON() { return getToken(KatLanParser.COLON, 0); }
		public ExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterExtends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitExtends(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitExtends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsContext extends_() throws RecognitionException {
		ExtendsContext _localctx = new ExtendsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_extends);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==EXTENDS) ) {
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
		"\u0004\u0001Y\u0539\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0001\u0000\u0005\u0000\u00a4\b\u0000\n\u0000\f\u0000\u00a7\t"+
		"\u0000\u0001\u0000\u0003\u0000\u00aa\b\u0000\u0001\u0000\u0003\u0000\u00ad"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00b3"+
		"\b\u0000\u0001\u0000\u0005\u0000\u00b6\b\u0000\n\u0000\f\u0000\u00b9\t"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00be\b\u0001\u000b"+
		"\u0001\f\u0001\u00bf\u0001\u0002\u0001\u0002\u0003\u0002\u00c4\b\u0002"+
		"\u0001\u0002\u0005\u0002\u00c7\b\u0002\n\u0002\f\u0002\u00ca\t\u0002\u0004"+
		"\u0002\u00cc\b\u0002\u000b\u0002\f\u0002\u00cd\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00d4\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00da\b\u0004\u0001\u0005\u0003\u0005"+
		"\u00dd\b\u0005\u0001\u0005\u0005\u0005\u00e0\b\u0005\n\u0005\f\u0005\u00e3"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00e9"+
		"\b\u0005\n\u0005\f\u0005\u00ec\t\u0005\u0001\u0005\u0005\u0005\u00ef\b"+
		"\u0005\n\u0005\f\u0005\u00f2\t\u0005\u0003\u0005\u00f4\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00f8\b\u0005\n\u0005\f\u0005\u00fb\t\u0005\u0001"+
		"\u0005\u0003\u0005\u00fe\b\u0005\u0001\u0005\u0005\u0005\u0101\b\u0005"+
		"\n\u0005\f\u0005\u0104\t\u0005\u0001\u0005\u0003\u0005\u0107\b\u0005\u0001"+
		"\u0005\u0005\u0005\u010a\b\u0005\n\u0005\f\u0005\u010d\t\u0005\u0001\u0005"+
		"\u0003\u0005\u0110\b\u0005\u0001\u0006\u0005\u0006\u0113\b\u0006\n\u0006"+
		"\f\u0006\u0116\t\u0006\u0001\u0006\u0003\u0006\u0119\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u011d\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0121\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0128\b\u0006\n\u0006\f\u0006\u012b\t\u0006\u0003\u0006\u012d"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0131\b\u0006\n\u0006\f\u0006"+
		"\u0134\t\u0006\u0001\u0006\u0003\u0006\u0137\b\u0006\u0001\u0006\u0005"+
		"\u0006\u013a\b\u0006\n\u0006\f\u0006\u013d\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0005\u0007\u0142\b\u0007\n\u0007\f\u0007\u0145\t\u0007\u0001"+
		"\u0007\u0003\u0007\u0148\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0151\b\u0007\n"+
		"\u0007\f\u0007\u0154\t\u0007\u0003\u0007\u0156\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u015a\b\u0007\n\u0007\f\u0007\u015d\t\u0007\u0001\u0007"+
		"\u0003\u0007\u0160\b\u0007\u0001\u0007\u0005\u0007\u0163\b\u0007\n\u0007"+
		"\f\u0007\u0166\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0005\b\u016b\b"+
		"\b\n\b\f\b\u016e\t\b\u0001\b\u0003\b\u0171\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u017a\b\b\n\b\f\b\u017d\t\b\u0003"+
		"\b\u017f\b\b\u0001\b\u0001\b\u0005\b\u0183\b\b\n\b\f\b\u0186\t\b\u0001"+
		"\b\u0001\b\u0005\b\u018a\b\b\n\b\f\b\u018d\t\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0196\b\t\u0001\t\u0005\t\u0199"+
		"\b\t\n\t\f\t\u019c\t\t\u0004\t\u019e\b\t\u000b\t\f\t\u019f\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u01a9\b\n\u0001\n\u0005"+
		"\n\u01ac\b\n\n\n\f\n\u01af\t\n\u0004\n\u01b1\b\n\u000b\n\f\n\u01b2\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01b9\b\u000b\u0001"+
		"\u000b\u0005\u000b\u01bc\b\u000b\n\u000b\f\u000b\u01bf\t\u000b\u0004\u000b"+
		"\u01c1\b\u000b\u000b\u000b\f\u000b\u01c2\u0001\f\u0005\f\u01c6\b\f\n\f"+
		"\f\f\u01c9\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u01cf\b\r\u0001"+
		"\r\u0004\r\u01d2\b\r\u000b\r\f\r\u01d3\u0001\r\u0003\r\u01d7\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u01e0\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u01e6\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u01ec\b\u0011\n\u0011\f\u0011\u01ef\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u01f5\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01f9\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0005\u0014\u01fe\b\u0014\n\u0014\f\u0014\u0201\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0208\b\u0014\u0001"+
		"\u0015\u0005\u0015\u020b\b\u0015\n\u0015\f\u0015\u020e\t\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0213\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0004\u0016\u0217\b\u0016\u000b\u0016\f\u0016\u0218\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0005\u0018\u0220\b\u0018\n"+
		"\u0018\f\u0018\u0223\t\u0018\u0001\u0018\u0003\u0018\u0226\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u022d"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0231\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0237\b\u0018\n\u0018"+
		"\f\u0018\u023a\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u023e\b\u0018"+
		"\n\u0018\f\u0018\u0241\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0245"+
		"\b\u0018\n\u0018\f\u0018\u0248\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u024d\b\u0018\u0001\u0019\u0005\u0019\u0250\b\u0019\n\u0019"+
		"\f\u0019\u0253\t\u0019\u0001\u0019\u0003\u0019\u0256\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u025d\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0262\b\u0019\n\u0019"+
		"\f\u0019\u0265\t\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0269\b\u0019"+
		"\n\u0019\f\u0019\u026c\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0005"+
		"\u001a\u0271\b\u001a\n\u001a\f\u001a\u0274\t\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u027d\b\u001a\n\u001a\f\u001a\u0280\t\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u0284\b\u001a\n\u001a\f\u001a\u0287\t\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u028e\b\u001b\n\u001b"+
		"\f\u001b\u0291\t\u001b\u0001\u001c\u0005\u001c\u0294\b\u001c\n\u001c\f"+
		"\u001c\u0297\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u029e\b\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u02a2"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02a7\b\u001e"+
		"\u0001\u001f\u0005\u001f\u02aa\b\u001f\n\u001f\f\u001f\u02ad\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0005 \u02b7\b \n \f \u02ba\t \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0004 \u02c6\b \u000b \f "+
		"\u02c7\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u02d0\b!\u0001"+
		"\"\u0005\"\u02d3\b\"\n\"\f\"\u02d6\t\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0003\"\u02de\b\"\u0001#\u0005#\u02e1\b#\n#\f#\u02e4"+
		"\t#\u0001#\u0001#\u0001#\u0001#\u0004#\u02ea\b#\u000b#\f#\u02eb\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u02fc\b%\u0001&\u0001&\u0003&\u0300\b&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0307\b\'\n\'\f\'\u030a\t\'"+
		"\u0001\'\u0001\'\u0005\'\u030e\b\'\n\'\f\'\u0311\t\'\u0001\'\u0004\'\u0314"+
		"\b\'\u000b\'\f\'\u0315\u0001\'\u0001\'\u0001(\u0001(\u0003(\u031c\b(\u0001"+
		"(\u0001(\u0001(\u0005(\u0321\b(\n(\f(\u0324\t(\u0001(\u0001(\u0005(\u0328"+
		"\b(\n(\f(\u032b\t(\u0001(\u0001(\u0001(\u0005(\u0330\b(\n(\f(\u0333\t"+
		"(\u0001(\u0003(\u0336\b(\u0001(\u0005(\u0339\b(\n(\f(\u033c\t(\u0001)"+
		"\u0001)\u0003)\u0340\b)\u0001)\u0001)\u0005)\u0344\b)\n)\f)\u0347\t)\u0001"+
		")\u0001)\u0005)\u034b\b)\n)\f)\u034e\t)\u0001)\u0001)\u0001)\u0003)\u0353"+
		"\b)\u0001)\u0005)\u0356\b)\n)\f)\u0359\t)\u0001)\u0001)\u0001)\u0001)"+
		"\u0001)\u0001)\u0005)\u0361\b)\n)\f)\u0364\t)\u0001)\u0001)\u0005)\u0368"+
		"\b)\n)\f)\u036b\t)\u0001)\u0001)\u0001)\u0003)\u0370\b)\u0001)\u0005)"+
		"\u0373\b)\n)\f)\u0376\t)\u0001)\u0001)\u0001)\u0005)\u037b\b)\n)\f)\u037e"+
		"\t)\u0001)\u0001)\u0005)\u0382\b)\n)\f)\u0385\t)\u0001)\u0001)\u0001)"+
		"\u0003)\u038a\b)\u0001)\u0001)\u0003)\u038e\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u0397\b*\u0001+\u0005+\u039a\b+\n+\f+\u039d"+
		"\t+\u0001+\u0001+\u0005+\u03a1\b+\n+\f+\u03a4\t+\u0001+\u0001+\u0005+"+
		"\u03a8\b+\n+\f+\u03ab\t+\u0001+\u0001+\u0001+\u0003+\u03b0\b+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0005,\u03b7\b,\n,\f,\u03ba\t,\u0001,\u0001,\u0005"+
		",\u03be\b,\n,\f,\u03c1\t,\u0001,\u0001,\u0005,\u03c5\b,\n,\f,\u03c8\t"+
		",\u0001,\u0001,\u0001,\u0003,\u03cd\b,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u03d5\b-\u0001-\u0001-\u0005-\u03d9\b-\n-\f-\u03dc\t-"+
		"\u0001-\u0001-\u0005-\u03e0\b-\n-\f-\u03e3\t-\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u03e9\b-\u0001.\u0001.\u0001.\u0003.\u03ee\b.\u0001.\u0001.\u0003"+
		".\u03f2\b.\u0001.\u0001.\u0003.\u03f6\b.\u0001.\u0001.\u0005.\u03fa\b"+
		".\n.\f.\u03fd\t.\u0001.\u0001.\u0005.\u0401\b.\n.\f.\u0404\t.\u0001.\u0001"+
		".\u0001.\u0001.\u0003.\u040a\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u0417\b/\n/\f/\u041a\t/\u0001"+
		"/\u0001/\u0005/\u041e\b/\n/\f/\u0421\t/\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u0427\b/\u00010\u00030\u042a\b0\u00010\u00030\u042d\b0\u00010\u0003"+
		"0\u0430\b0\u00011\u00031\u0433\b1\u00011\u00011\u00031\u0437\b1\u0001"+
		"2\u00012\u00052\u043b\b2\n2\f2\u043e\t2\u00013\u00013\u00014\u00014\u0003"+
		"4\u0444\b4\u00014\u00014\u00054\u0448\b4\n4\f4\u044b\t4\u00014\u00034"+
		"\u044e\b4\u00015\u00015\u00035\u0452\b5\u00016\u00016\u00016\u00016\u0001"+
		"6\u00036\u0459\b6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00037\u0465\b7\u00018\u00018\u00019\u00019\u00019\u0005"+
		"9\u046c\b9\n9\f9\u046f\t9\u0001:\u0001:\u0001;\u0005;\u0474\b;\n;\f;\u0477"+
		"\t;\u0001;\u0001;\u0001;\u0003;\u047c\b;\u0001;\u0001;\u0001;\u0003;\u0481"+
		"\b;\u0001;\u0001;\u0001<\u0001<\u0001<\u0005<\u0488\b<\n<\f<\u048b\t<"+
		"\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u0493\b=\u0001=\u0005"+
		"=\u0496\b=\n=\f=\u0499\t=\u0001>\u0001>\u0001>\u0001>\u0003>\u049f\b>"+
		"\u0001>\u0001>\u0001?\u0001?\u0001?\u0003?\u04a6\b?\u0001@\u0001@\u0003"+
		"@\u04aa\b@\u0001@\u0001@\u0001@\u0001@\u0003@\u04b0\b@\u0003@\u04b2\b"+
		"@\u0001A\u0001A\u0003A\u04b6\bA\u0001A\u0001A\u0001A\u0001A\u0003A\u04bc"+
		"\bA\u0003A\u04be\bA\u0001B\u0001B\u0003B\u04c2\bB\u0001B\u0001B\u0001"+
		"B\u0001B\u0003B\u04c8\bB\u0003B\u04ca\bB\u0001C\u0003C\u04cd\bC\u0001"+
		"C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0003D\u04db\bD\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0003"+
		"F\u04e3\bF\u0001G\u0001G\u0001G\u0001G\u0003G\u04e9\bG\u0003G\u04eb\b"+
		"G\u0001H\u0001H\u0001H\u0001H\u0003H\u04f1\bH\u0003H\u04f3\bH\u0001I\u0001"+
		"I\u0001I\u0001I\u0003I\u04f9\bI\u0003I\u04fb\bI\u0001J\u0001J\u0001J\u0001"+
		"J\u0003J\u0501\bJ\u0003J\u0503\bJ\u0001K\u0003K\u0506\bK\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u050f\bK\u0001K\u0003K\u0512"+
		"\bK\u0001L\u0001L\u0001L\u0001L\u0003L\u0518\bL\u0001L\u0001L\u0003L\u051c"+
		"\bL\u0001L\u0001L\u0003L\u0520\bL\u0001L\u0001L\u0001L\u0001L\u0003L\u0526"+
		"\bL\u0003L\u0528\bL\u0001M\u0001M\u0003M\u052c\bM\u0001N\u0001N\u0001"+
		"N\u0004N\u0531\bN\u000bN\fN\u0532\u0001O\u0001O\u0001P\u0001P\u0001P\u0000"+
		"\u0000Q\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u0000\f\u0001\u00009:\u0001\u000035\u0001\u0000"+
		";<\u0001\u0000,2\u0001\u0000>?\u0001\u0000*+\u0002\u0000DFHJ\u0001\u0000"+
		"./\u0001\u0000,-\u0001\u000001\u0001\u0000ST\u0001\u0000LM\u05d6\u0000"+
		"\u00a5\u0001\u0000\u0000\u0000\u0002\u00ba\u0001\u0000\u0000\u0000\u0004"+
		"\u00cb\u0001\u0000\u0000\u0000\u0006\u00cf\u0001\u0000\u0000\u0000\b\u00d5"+
		"\u0001\u0000\u0000\u0000\n\u00dc\u0001\u0000\u0000\u0000\f\u0114\u0001"+
		"\u0000\u0000\u0000\u000e\u0143\u0001\u0000\u0000\u0000\u0010\u016c\u0001"+
		"\u0000\u0000\u0000\u0012\u019d\u0001\u0000\u0000\u0000\u0014\u01b0\u0001"+
		"\u0000\u0000\u0000\u0016\u01c0\u0001\u0000\u0000\u0000\u0018\u01c7\u0001"+
		"\u0000\u0000\u0000\u001a\u01ce\u0001\u0000\u0000\u0000\u001c\u01df\u0001"+
		"\u0000\u0000\u0000\u001e\u01e1\u0001\u0000\u0000\u0000 \u01e5\u0001\u0000"+
		"\u0000\u0000\"\u01e7\u0001\u0000\u0000\u0000$\u01f2\u0001\u0000\u0000"+
		"\u0000&\u01f8\u0001\u0000\u0000\u0000(\u0207\u0001\u0000\u0000\u0000*"+
		"\u020c\u0001\u0000\u0000\u0000,\u0214\u0001\u0000\u0000\u0000.\u021a\u0001"+
		"\u0000\u0000\u00000\u0221\u0001\u0000\u0000\u00002\u0251\u0001\u0000\u0000"+
		"\u00004\u0272\u0001\u0000\u0000\u00006\u028a\u0001\u0000\u0000\u00008"+
		"\u0295\u0001\u0000\u0000\u0000:\u02a1\u0001\u0000\u0000\u0000<\u02a3\u0001"+
		"\u0000\u0000\u0000>\u02ab\u0001\u0000\u0000\u0000@\u02b8\u0001\u0000\u0000"+
		"\u0000B\u02cc\u0001\u0000\u0000\u0000D\u02d4\u0001\u0000\u0000\u0000F"+
		"\u02e2\u0001\u0000\u0000\u0000H\u02f0\u0001\u0000\u0000\u0000J\u02fb\u0001"+
		"\u0000\u0000\u0000L\u02fd\u0001\u0000\u0000\u0000N\u0301\u0001\u0000\u0000"+
		"\u0000P\u031b\u0001\u0000\u0000\u0000R\u033d\u0001\u0000\u0000\u0000T"+
		"\u038f\u0001\u0000\u0000\u0000V\u039b\u0001\u0000\u0000\u0000X\u03b1\u0001"+
		"\u0000\u0000\u0000Z\u03ce\u0001\u0000\u0000\u0000\\\u03ea\u0001\u0000"+
		"\u0000\u0000^\u040b\u0001\u0000\u0000\u0000`\u0429\u0001\u0000\u0000\u0000"+
		"b\u0432\u0001\u0000\u0000\u0000d\u0438\u0001\u0000\u0000\u0000f\u043f"+
		"\u0001\u0000\u0000\u0000h\u0443\u0001\u0000\u0000\u0000j\u0451\u0001\u0000"+
		"\u0000\u0000l\u0453\u0001\u0000\u0000\u0000n\u0464\u0001\u0000\u0000\u0000"+
		"p\u0466\u0001\u0000\u0000\u0000r\u0468\u0001\u0000\u0000\u0000t\u0470"+
		"\u0001\u0000\u0000\u0000v\u0475\u0001\u0000\u0000\u0000x\u0484\u0001\u0000"+
		"\u0000\u0000z\u048c\u0001\u0000\u0000\u0000|\u049a\u0001\u0000\u0000\u0000"+
		"~\u04a5\u0001\u0000\u0000\u0000\u0080\u04a9\u0001\u0000\u0000\u0000\u0082"+
		"\u04b5\u0001\u0000\u0000\u0000\u0084\u04c1\u0001\u0000\u0000\u0000\u0086"+
		"\u04cc\u0001\u0000\u0000\u0000\u0088\u04da\u0001\u0000\u0000\u0000\u008a"+
		"\u04dc\u0001\u0000\u0000\u0000\u008c\u04e2\u0001\u0000\u0000\u0000\u008e"+
		"\u04e4\u0001\u0000\u0000\u0000\u0090\u04ec\u0001\u0000\u0000\u0000\u0092"+
		"\u04f4\u0001\u0000\u0000\u0000\u0094\u04fc\u0001\u0000\u0000\u0000\u0096"+
		"\u0511\u0001\u0000\u0000\u0000\u0098\u0527\u0001\u0000\u0000\u0000\u009a"+
		"\u052b\u0001\u0000\u0000\u0000\u009c\u052d\u0001\u0000\u0000\u0000\u009e"+
		"\u0534\u0001\u0000\u0000\u0000\u00a0\u0536\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a4\u0005W\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003\u0002\u0001\u0000\u00a9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003\u0004\u0002\u0000\u00ac\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b2"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b3\u0003\f\u0006\u0000\u00af\u00b3\u0003"+
		"\u000e\u0007\u0000\u00b0\u00b3\u0003\n\u0005\u0000\u00b1\u00b3\u0003\u0010"+
		"\b\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b7\u0001\u0000\u0000\u0000\u00b4\u00b6\u0005W\u0000\u0000"+
		"\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u0001\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005\u0001\u0000\u0000\u00bb\u00bd\u0003\u009aM\u0000\u00bc"+
		"\u00be\u0005W\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u0003\u0001\u0000\u0000\u0000\u00c1\u00c4"+
		"\u0003\u0006\u0003\u0000\u00c2\u00c4\u0003\b\u0004\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c7\u0005W\u0000\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c3\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u0005\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005\u0002\u0000\u0000\u00d0\u00d3\u0003\u009a"+
		"M\u0000\u00d1\u00d2\u0005\u001c\u0000\u0000\u00d2\u00d4\u0003\u009aM\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u0007\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0003\u0000\u0000"+
		"\u00d6\u00d9\u0003\u009aM\u0000\u00d7\u00d8\u0005\u001c\u0000\u0000\u00d8"+
		"\u00da\u0003\u009aM\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\t\u0001\u0000\u0000\u0000\u00db\u00dd\u0003"+
		"\u0012\t\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e1\u0001\u0000\u0000\u0000\u00de\u00e0\u0005W\u0000"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00f3\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0003\u00a0P\u0000\u00e5\u00ea\u0003\u009aM\u0000\u00e6"+
		"\u00e7\u0005\u0004\u0000\u0000\u00e7\u00e9\u0003\u009aM\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f0"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ef"+
		"\u0005W\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00e4\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u0106\u0001\u0000\u0000\u0000\u00f5\u00f9\u0005"+
		"\u0005\u0000\u0000\u00f6\u00f8\u0005W\u0000\u0000\u00f7\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fe\u0003\u0014"+
		"\n\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe\u0102\u0001\u0000\u0000\u0000\u00ff\u0101\u0005W\u0000\u0000"+
		"\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0105\u0107\u0005\u0006\u0000\u0000\u0106\u00f5\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010b\u0001\u0000\u0000\u0000"+
		"\u0108\u010a\u0005W\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a"+
		"\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010e\u0110\u0003\u0012\t\u0000\u010f\u010e"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u000b"+
		"\u0001\u0000\u0000\u0000\u0111\u0113\u0003z=\u0000\u0112\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000"+
		"\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0119\u0003d2\u0000"+
		"\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u0120\u0003`0\u0000\u011b\u011d"+
		"\u0005O\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0121\u0005"+
		"N\u0000\u0000\u011f\u0121\u0005R\u0000\u0000\u0120\u011c\u0001\u0000\u0000"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u012c\u0003\u009aM\u0000\u0123\u0124\u0003\u00a0P\u0000\u0124"+
		"\u0129\u0003\u009aM\u0000\u0125\u0126\u0005\u0004\u0000\u0000\u0126\u0128"+
		"\u0003\u009aM\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u012b\u0001"+
		"\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001"+
		"\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001"+
		"\u0000\u0000\u0000\u012c\u0123\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0132\u0005"+
		"\u0005\u0000\u0000\u012f\u0131\u0005W\u0000\u0000\u0130\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0137\u0003\u0014"+
		"\n\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"+
		"\u0000\u0137\u013b\u0001\u0000\u0000\u0000\u0138\u013a\u0005W\u0000\u0000"+
		"\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000"+
		"\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000"+
		"\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0005\u0006\u0000\u0000\u013f\r\u0001\u0000\u0000\u0000\u0140"+
		"\u0142\u0003z=\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0145\u0001"+
		"\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0146\u0148\u0003d2\u0000\u0147\u0146\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0003`0\u0000\u014a\u014b\u0005P\u0000\u0000\u014b"+
		"\u0155\u0003\u009aM\u0000\u014c\u014d\u0003\u00a0P\u0000\u014d\u0152\u0003"+
		"\u009aM\u0000\u014e\u014f\u0005\u0004\u0000\u0000\u014f\u0151\u0003\u009a"+
		"M\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000"+
		"\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000"+
		"\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000"+
		"\u0000\u0155\u014c\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u015b\u0005\u0005\u0000"+
		"\u0000\u0158\u015a\u0005W\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000"+
		"\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000"+
		"\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0160\u0003\u0014\n\u0000\u015f"+
		"\u015e\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160"+
		"\u0164\u0001\u0000\u0000\u0000\u0161\u0163\u0005W\u0000\u0000\u0162\u0161"+
		"\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167"+
		"\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0005\u0006\u0000\u0000\u0168\u000f\u0001\u0000\u0000\u0000\u0169\u016b"+
		"\u0003z=\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000"+
		"\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000"+
		"\u0000\u0000\u016f\u0171\u0003d2\u0000\u0170\u016f\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0003`0\u0000\u0173\u0174\u0005Q\u0000\u0000\u0174\u017e"+
		"\u0003\u009aM\u0000\u0175\u0176\u0003\u00a0P\u0000\u0176\u017b\u0003\u009a"+
		"M\u0000\u0177\u0178\u0005\u0004\u0000\u0000\u0178\u017a\u0003\u009aM\u0000"+
		"\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000"+
		"\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000"+
		"\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000"+
		"\u017e\u0175\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0184\u0005\u0005\u0000\u0000"+
		"\u0181\u0183\u0005W\u0000\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0183"+
		"\u0186\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0001\u0000\u0000\u0000\u0186"+
		"\u0184\u0001\u0000\u0000\u0000\u0187\u018b\u0003\u0016\u000b\u0000\u0188"+
		"\u018a\u0005W\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a\u018d"+
		"\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0001\u0000\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u018b"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u0006\u0000\u0000\u018f\u0011"+
		"\u0001\u0000\u0000\u0000\u0190\u0196\u0003:\u001d\u0000\u0191\u0196\u0003"+
		"0\u0018\u0000\u0192\u0196\u0003\f\u0006\u0000\u0193\u0196\u0003\u000e"+
		"\u0007\u0000\u0194\u0196\u0003\u0010\b\u0000\u0195\u0190\u0001\u0000\u0000"+
		"\u0000\u0195\u0191\u0001\u0000\u0000\u0000\u0195\u0192\u0001\u0000\u0000"+
		"\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0194\u0001\u0000\u0000"+
		"\u0000\u0196\u019a\u0001\u0000\u0000\u0000\u0197\u0199\u0005W\u0000\u0000"+
		"\u0198\u0197\u0001\u0000\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000"+
		"\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000"+
		"\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000"+
		"\u019d\u0195\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a0\u0013\u0001\u0000\u0000\u0000\u01a1\u01a9\u0003:\u001d\u0000\u01a2"+
		"\u01a9\u00030\u0018\u0000\u01a3\u01a9\u00032\u0019\u0000\u01a4\u01a9\u0003"+
		"4\u001a\u0000\u01a5\u01a9\u0003\f\u0006\u0000\u01a6\u01a9\u0003\u000e"+
		"\u0007\u0000\u01a7\u01a9\u0003\u0010\b\u0000\u01a8\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a2\u0001\u0000\u0000\u0000\u01a8\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a4\u0001\u0000\u0000\u0000\u01a8\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a9\u01ad\u0001\u0000\u0000\u0000\u01aa\u01ac\u0005W\u0000\u0000"+
		"\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000"+
		"\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000"+
		"\u01b0\u01a8\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b3\u0015\u0001\u0000\u0000\u0000\u01b4\u01b9\u0003:\u001d\u0000\u01b5"+
		"\u01b9\u00030\u0018\u0000\u01b6\u01b9\u0003\f\u0006\u0000\u01b7\u01b9"+
		"\u0003\u000e\u0007\u0000\u01b8\u01b4\u0001\u0000\u0000\u0000\u01b8\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b9\u01bd\u0001\u0000\u0000\u0000\u01ba\u01bc"+
		"\u0005W\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001"+
		"\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001"+
		"\u0000\u0000\u0000\u01c0\u01b8\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c3\u0017\u0001\u0000\u0000\u0000\u01c4\u01c6\u0003"+
		"\u001a\r\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c8\u0019\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cf\u0003:\u001d\u0000\u01cb\u01cf\u0003(\u0014\u0000"+
		"\u01cc\u01cf\u0003x<\u0000\u01cd\u01cf\u0003J%\u0000\u01ce\u01ca\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cb\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d2\u0005W\u0000\u0000\u01d1\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d7\u0005\u0000\u0000\u0001\u01d6\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7\u001b\u0001\u0000"+
		"\u0000\u0000\u01d8\u01e0\u0003\u001e\u000f\u0000\u01d9\u01e0\u0005V\u0000"+
		"\u0000\u01da\u01e0\u0003~?\u0000\u01db\u01e0\u0003\u008cF\u0000\u01dc"+
		"\u01e0\u0003\u009aM\u0000\u01dd\u01e0\u0003j5\u0000\u01de\u01e0\u0003"+
		",\u0016\u0000\u01df\u01d8\u0001\u0000\u0000\u0000\u01df\u01d9\u0001\u0000"+
		"\u0000\u0000\u01df\u01da\u0001\u0000\u0000\u0000\u01df\u01db\u0001\u0000"+
		"\u0000\u0000\u01df\u01dc\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000"+
		"\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0\u001d\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0007\u0000\u0000\u0000\u01e2\u001f\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e6\u0003\u009aM\u0000\u01e4\u01e6\u0005K\u0000\u0000"+
		"\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e6!\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005E\u0000\u0000\u01e8\u01ed"+
		"\u0003$\u0012\u0000\u01e9\u01ea\u0005\u0004\u0000\u0000\u01ea\u01ec\u0003"+
		"$\u0012\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0005D\u0000\u0000\u01f1#\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f4\u0003 \u0010\u0000\u01f3\u01f5\u0003&\u0013\u0000\u01f4\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5%\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f9\u0003\u00a0P\u0000\u01f7\u01f9\u0005L\u0000"+
		"\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0003j5\u0000\u01fb"+
		"\'\u0001\u0000\u0000\u0000\u01fc\u01fe\u0003z=\u0000\u01fd\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001"+
		"\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0202\u0001"+
		"\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u0203\u0003"+
		"*\u0015\u0000\u0203\u0204\u0005\u0007\u0000\u0000\u0204\u0205\u0003\u001c"+
		"\u000e\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0208\u0003\u0098"+
		"L\u0000\u0207\u01ff\u0001\u0000\u0000\u0000\u0207\u0206\u0001\u0000\u0000"+
		"\u0000\u0208)\u0001\u0000\u0000\u0000\u0209\u020b\u0003z=\u0000\u020a"+
		"\u0209\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c"+
		"\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d"+
		"\u020f\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f"+
		"\u0212\u0005U\u0000\u0000\u0210\u0211\u0005\b\u0000\u0000\u0211\u0213"+
		"\u0003*\u0015\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212\u0213\u0001"+
		"\u0000\u0000\u0000\u0213+\u0001\u0000\u0000\u0000\u0214\u0216\u0003*\u0015"+
		"\u0000\u0215\u0217\u0003.\u0017\u0000\u0216\u0215\u0001\u0000\u0000\u0000"+
		"\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0001\u0000\u0000\u0000\u0219-\u0001\u0000\u0000\u0000\u021a"+
		"\u021b\u0005\t\u0000\u0000\u021b\u021c\u0003\u008cF\u0000\u021c\u021d"+
		"\u0005\n\u0000\u0000\u021d/\u0001\u0000\u0000\u0000\u021e\u0220\u0003"+
		"z=\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220\u0223\u0001\u0000\u0000"+
		"\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000"+
		"\u0000\u0222\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000"+
		"\u0000\u0224\u0226\u0003d2\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225"+
		"\u0226\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227"+
		"\u0228\u0003`0\u0000\u0228\u0229\u0003b1\u0000\u0229\u022a\u0005\u000b"+
		"\u0000\u0000\u022a\u022c\u0003\u009aM\u0000\u022b\u022d\u0003\"\u0011"+
		"\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u0230\u0005\f\u0000\u0000"+
		"\u022f\u0231\u00036\u001b\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0005\r\u0000\u0000\u0233\u0234\u0005L\u0000\u0000\u0234\u0238"+
		"\u0003h4\u0000\u0235\u0237\u0005W\u0000\u0000\u0236\u0235\u0001\u0000"+
		"\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000"+
		"\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u024c\u0001\u0000"+
		"\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u023f\u0005\u0005"+
		"\u0000\u0000\u023c\u023e\u0005W\u0000\u0000\u023d\u023c\u0001\u0000\u0000"+
		"\u0000\u023e\u0241\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000\u0000"+
		"\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0242\u0001\u0000\u0000"+
		"\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0242\u0246\u0003\u0018\f\u0000"+
		"\u0243\u0245\u0005W\u0000\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0245"+
		"\u0248\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0246"+
		"\u0247\u0001\u0000\u0000\u0000\u0247\u0249\u0001\u0000\u0000\u0000\u0248"+
		"\u0246\u0001\u0000\u0000\u0000\u0249\u024a\u0005\u0006\u0000\u0000\u024a"+
		"\u024d\u0001\u0000\u0000\u0000\u024b\u024d\u0003\u001a\r\u0000\u024c\u023b"+
		"\u0001\u0000\u0000\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024d1\u0001"+
		"\u0000\u0000\u0000\u024e\u0250\u0003z=\u0000\u024f\u024e\u0001\u0000\u0000"+
		"\u0000\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000"+
		"\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0255\u0001\u0000\u0000"+
		"\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0256\u0003d2\u0000\u0255"+
		"\u0254\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0001\u0000\u0000\u0000\u0257\u0258\u0003`0\u0000\u0258\u0259\u0005"+
		"\u000e\u0000\u0000\u0259\u025a\u0003\u009aM\u0000\u025a\u025c\u0005\f"+
		"\u0000\u0000\u025b\u025d\u00036\u001b\u0000\u025c\u025b\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000"+
		"\u0000\u025e\u025f\u0005\r\u0000\u0000\u025f\u0263\u0005\u0005\u0000\u0000"+
		"\u0260\u0262\u0005W\u0000\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0262"+
		"\u0265\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u0001\u0000\u0000\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265"+
		"\u0263\u0001\u0000\u0000\u0000\u0266\u026a\u0003\u0018\f\u0000\u0267\u0269"+
		"\u0005W\u0000\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0269\u026c\u0001"+
		"\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026a\u026b\u0001"+
		"\u0000\u0000\u0000\u026b\u026d\u0001\u0000\u0000\u0000\u026c\u026a\u0001"+
		"\u0000\u0000\u0000\u026d\u026e\u0005\u0006\u0000\u0000\u026e3\u0001\u0000"+
		"\u0000\u0000\u026f\u0271\u0003z=\u0000\u0270\u026f\u0001\u0000\u0000\u0000"+
		"\u0271\u0274\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000"+
		"\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u0275\u0001\u0000\u0000\u0000"+
		"\u0274\u0272\u0001\u0000\u0000\u0000\u0275\u0276\u0005=\u0000\u0000\u0276"+
		"\u0277\u0003f3\u0000\u0277\u0278\u0005\f\u0000\u0000\u0278\u0279\u0003"+
		"8\u001c\u0000\u0279\u027a\u0005\r\u0000\u0000\u027a\u027e\u0005\u0005"+
		"\u0000\u0000\u027b\u027d\u0005W\u0000\u0000\u027c\u027b\u0001\u0000\u0000"+
		"\u0000\u027d\u0280\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000"+
		"\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0281\u0001\u0000\u0000"+
		"\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0281\u0285\u0003\u0018\f\u0000"+
		"\u0282\u0284\u0005W\u0000\u0000\u0283\u0282\u0001\u0000\u0000\u0000\u0284"+
		"\u0287\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u0001\u0000\u0000\u0000\u0286\u0288\u0001\u0000\u0000\u0000\u0287"+
		"\u0285\u0001\u0000\u0000\u0000\u0288\u0289\u0005\u0006\u0000\u0000\u0289"+
		"5\u0001\u0000\u0000\u0000\u028a\u028f\u00038\u001c\u0000\u028b\u028c\u0005"+
		"\u0004\u0000\u0000\u028c\u028e\u00038\u001c\u0000\u028d\u028b\u0001\u0000"+
		"\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000"+
		"\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u02907\u0001\u0000\u0000"+
		"\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0294\u0003z=\u0000\u0293"+
		"\u0292\u0001\u0000\u0000\u0000\u0294\u0297\u0001\u0000\u0000\u0000\u0295"+
		"\u0293\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296"+
		"\u0298\u0001\u0000\u0000\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0298"+
		"\u0299\u0003\u009aM\u0000\u0299\u029a\u0005L\u0000\u0000\u029a\u029d\u0003"+
		"h4\u0000\u029b\u029c\u0005\u0007\u0000\u0000\u029c\u029e\u0003\u001c\u000e"+
		"\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000"+
		"\u0000\u029e9\u0001\u0000\u0000\u0000\u029f\u02a2\u0003B!\u0000\u02a0"+
		"\u02a2\u0003<\u001e\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1\u02a0"+
		"\u0001\u0000\u0000\u0000\u02a2;\u0001\u0000\u0000\u0000\u02a3\u02a6\u0003"+
		"`0\u0000\u02a4\u02a7\u0003>\u001f\u0000\u02a5\u02a7\u0003@ \u0000\u02a6"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a7"+
		"=\u0001\u0000\u0000\u0000\u02a8\u02aa\u0003z=\u0000\u02a9\u02a8\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ae\u0001"+
		"\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ae\u02af\u0005"+
		"\u000f\u0000\u0000\u02af\u02b0\u0003\u009aM\u0000\u02b0\u02b1\u0005L\u0000"+
		"\u0000\u02b1\u02b2\u0003h4\u0000\u02b2\u02b3\u0005\u0007\u0000\u0000\u02b3"+
		"\u02b4\u0003\u001c\u000e\u0000\u02b4?\u0001\u0000\u0000\u0000\u02b5\u02b7"+
		"\u0003z=\u0000\u02b6\u02b5\u0001\u0000\u0000\u0000\u02b7\u02ba\u0001\u0000"+
		"\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000"+
		"\u0000\u0000\u02b9\u02bb\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001\u0000"+
		"\u0000\u0000\u02bb\u02bc\u0005\u000f\u0000\u0000\u02bc\u02bd\u0003\u009a"+
		"M\u0000\u02bd\u02be\u0005\u0007\u0000\u0000\u02be\u02bf\u0003\u001c\u000e"+
		"\u0000\u02bf\u02c5\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005\u0004\u0000"+
		"\u0000\u02c1\u02c2\u0003\u009aM\u0000\u02c2\u02c3\u0005\u0007\u0000\u0000"+
		"\u02c3\u02c4\u0003\u001c\u000e\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000"+
		"\u02c5\u02c0\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000"+
		"\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005L\u0000\u0000\u02ca"+
		"\u02cb\u0003h4\u0000\u02cbA\u0001\u0000\u0000\u0000\u02cc\u02cf\u0003"+
		"`0\u0000\u02cd\u02d0\u0003D\"\u0000\u02ce\u02d0\u0003F#\u0000\u02cf\u02cd"+
		"\u0001\u0000\u0000\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000\u02d0C\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d3\u0003z=\u0000\u02d2\u02d1\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d8\u0005\u0010\u0000"+
		"\u0000\u02d8\u02d9\u0003\u009aM\u0000\u02d9\u02da\u0005L\u0000\u0000\u02da"+
		"\u02dd\u0003h4\u0000\u02db\u02dc\u0005\u0007\u0000\u0000\u02dc\u02de\u0003"+
		"\u001c\u000e\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001"+
		"\u0000\u0000\u0000\u02deE\u0001\u0000\u0000\u0000\u02df\u02e1\u0003z="+
		"\u0000\u02e0\u02df\u0001\u0000\u0000\u0000\u02e1\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e5\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e5\u02e6\u0005\u0010\u0000\u0000\u02e6\u02e9\u0003H$\u0000\u02e7"+
		"\u02e8\u0005\u0004\u0000\u0000\u02e8\u02ea\u0003H$\u0000\u02e9\u02e7\u0001"+
		"\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001"+
		"\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ee\u0005L\u0000\u0000\u02ee\u02ef\u0003h4"+
		"\u0000\u02efG\u0001\u0000\u0000\u0000\u02f0\u02f1\u0003\u009aM\u0000\u02f1"+
		"\u02f2\u0005\u0007\u0000\u0000\u02f2\u02f3\u0003\u001c\u000e\u0000\u02f3"+
		"I\u0001\u0000\u0000\u0000\u02f4\u02fc\u0003T*\u0000\u02f5\u02fc\u0003"+
		"N\'\u0000\u02f6\u02fc\u0003\\.\u0000\u02f7\u02fc\u0003^/\u0000\u02f8\u02fc"+
		"\u0003L&\u0000\u02f9\u02fc\u0003X,\u0000\u02fa\u02fc\u0003R)\u0000\u02fb"+
		"\u02f4\u0001\u0000\u0000\u0000\u02fb\u02f5\u0001\u0000\u0000\u0000\u02fb"+
		"\u02f6\u0001\u0000\u0000\u0000\u02fb\u02f7\u0001\u0000\u0000\u0000\u02fb"+
		"\u02f8\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fb"+
		"\u02fa\u0001\u0000\u0000\u0000\u02fcK\u0001\u0000\u0000\u0000\u02fd\u02ff"+
		"\u0005\u0011\u0000\u0000\u02fe\u0300\u0003\u001c\u000e\u0000\u02ff\u02fe"+
		"\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300M\u0001"+
		"\u0000\u0000\u0000\u0301\u0302\u0005 \u0000\u0000\u0302\u0303\u0005\f"+
		"\u0000\u0000\u0303\u0304\u0003\u001c\u000e\u0000\u0304\u0308\u0005\r\u0000"+
		"\u0000\u0305\u0307\u0005W\u0000\u0000\u0306\u0305\u0001\u0000\u0000\u0000"+
		"\u0307\u030a\u0001\u0000\u0000\u0000\u0308\u0306\u0001\u0000\u0000\u0000"+
		"\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030b\u0001\u0000\u0000\u0000"+
		"\u030a\u0308\u0001\u0000\u0000\u0000\u030b\u030f\u0005\u0005\u0000\u0000"+
		"\u030c\u030e\u0005W\u0000\u0000\u030d\u030c\u0001\u0000\u0000\u0000\u030e"+
		"\u0311\u0001\u0000\u0000\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u030f"+
		"\u0310\u0001\u0000\u0000\u0000\u0310\u0313\u0001\u0000\u0000\u0000\u0311"+
		"\u030f\u0001\u0000\u0000\u0000\u0312\u0314\u0003P(\u0000\u0313\u0312\u0001"+
		"\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0313\u0001"+
		"\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0317\u0001"+
		"\u0000\u0000\u0000\u0317\u0318\u0005\u0006\u0000\u0000\u0318O\u0001\u0000"+
		"\u0000\u0000\u0319\u031c\u0003\u001c\u000e\u0000\u031a\u031c\u0005\u0012"+
		"\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031b\u031a\u0001\u0000"+
		"\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u0335\u0005\u0013"+
		"\u0000\u0000\u031e\u0322\u0005\u0005\u0000\u0000\u031f\u0321\u0005W\u0000"+
		"\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0321\u0324\u0001\u0000\u0000"+
		"\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000"+
		"\u0000\u0323\u0325\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000"+
		"\u0000\u0325\u0329\u0003\u0018\f\u0000\u0326\u0328\u0005W\u0000\u0000"+
		"\u0327\u0326\u0001\u0000\u0000\u0000\u0328\u032b\u0001\u0000\u0000\u0000"+
		"\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000"+
		"\u032a\u032c\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000\u0000\u0000"+
		"\u032c\u032d\u0005\u0006\u0000\u0000\u032d\u0336\u0001\u0000\u0000\u0000"+
		"\u032e\u0330\u0005W\u0000\u0000\u032f\u032e\u0001\u0000\u0000\u0000\u0330"+
		"\u0333\u0001\u0000\u0000\u0000\u0331\u032f\u0001\u0000\u0000\u0000\u0331"+
		"\u0332\u0001\u0000\u0000\u0000\u0332\u0334\u0001\u0000\u0000\u0000\u0333"+
		"\u0331\u0001\u0000\u0000\u0000\u0334\u0336\u0003\u001a\r\u0000\u0335\u031e"+
		"\u0001\u0000\u0000\u0000\u0335\u0331\u0001\u0000\u0000\u0000\u0336\u033a"+
		"\u0001\u0000\u0000\u0000\u0337\u0339\u0005W\u0000\u0000\u0338\u0337\u0001"+
		"\u0000\u0000\u0000\u0339\u033c\u0001\u0000\u0000\u0000\u033a\u0338\u0001"+
		"\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033bQ\u0001\u0000"+
		"\u0000\u0000\u033c\u033a\u0001\u0000\u0000\u0000\u033d\u033f\u0005\u0014"+
		"\u0000\u0000\u033e\u0340\u0003(\u0014\u0000\u033f\u033e\u0001\u0000\u0000"+
		"\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u0352\u0001\u0000\u0000"+
		"\u0000\u0341\u0345\u0005\u0005\u0000\u0000\u0342\u0344\u0005W\u0000\u0000"+
		"\u0343\u0342\u0001\u0000\u0000\u0000\u0344\u0347\u0001\u0000\u0000\u0000"+
		"\u0345\u0343\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000"+
		"\u0346\u0348\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000"+
		"\u0348\u034c\u0003\u0018\f\u0000\u0349\u034b\u0005W\u0000\u0000\u034a"+
		"\u0349\u0001\u0000\u0000\u0000\u034b\u034e\u0001\u0000\u0000\u0000\u034c"+
		"\u034a\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d"+
		"\u034f\u0001\u0000\u0000\u0000\u034e\u034c\u0001\u0000\u0000\u0000\u034f"+
		"\u0350\u0005\u0006\u0000\u0000\u0350\u0353\u0001\u0000\u0000\u0000\u0351"+
		"\u0353\u0003\u001a\r\u0000\u0352\u0341\u0001\u0000\u0000\u0000\u0352\u0351"+
		"\u0001\u0000\u0000\u0000\u0353\u0357\u0001\u0000\u0000\u0000\u0354\u0356"+
		"\u0005W\u0000\u0000\u0355\u0354\u0001\u0000\u0000\u0000\u0356\u0359\u0001"+
		"\u0000\u0000\u0000\u0357\u0355\u0001\u0000\u0000\u0000\u0357\u0358\u0001"+
		"\u0000\u0000\u0000\u0358\u035a\u0001\u0000\u0000\u0000\u0359\u0357\u0001"+
		"\u0000\u0000\u0000\u035a\u035b\u0005\u0015\u0000\u0000\u035b\u035c\u0005"+
		"\f\u0000\u0000\u035c\u035d\u00038\u001c\u0000\u035d\u036f\u0005\r\u0000"+
		"\u0000\u035e\u0362\u0005\u0005\u0000\u0000\u035f\u0361\u0005W\u0000\u0000"+
		"\u0360\u035f\u0001\u0000\u0000\u0000\u0361\u0364\u0001\u0000\u0000\u0000"+
		"\u0362\u0360\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000"+
		"\u0363\u0365\u0001\u0000\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000"+
		"\u0365\u0369\u0003\u0018\f\u0000\u0366\u0368\u0005W\u0000\u0000\u0367"+
		"\u0366\u0001\u0000\u0000\u0000\u0368\u036b\u0001\u0000\u0000\u0000\u0369"+
		"\u0367\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000\u0000\u0000\u036a"+
		"\u036c\u0001\u0000\u0000\u0000\u036b\u0369\u0001\u0000\u0000\u0000\u036c"+
		"\u036d\u0005\u0006\u0000\u0000\u036d\u0370\u0001\u0000\u0000\u0000\u036e"+
		"\u0370\u0003\u001a\r\u0000\u036f\u035e\u0001\u0000\u0000\u0000\u036f\u036e"+
		"\u0001\u0000\u0000\u0000\u0370\u0374\u0001\u0000\u0000\u0000\u0371\u0373"+
		"\u0005W\u0000\u0000\u0372\u0371\u0001\u0000\u0000\u0000\u0373\u0376\u0001"+
		"\u0000\u0000\u0000\u0374\u0372\u0001\u0000\u0000\u0000\u0374\u0375\u0001"+
		"\u0000\u0000\u0000\u0375\u038d\u0001\u0000\u0000\u0000\u0376\u0374\u0001"+
		"\u0000\u0000\u0000\u0377\u0389\u0005\u0016\u0000\u0000\u0378\u037c\u0005"+
		"\u0005\u0000\u0000\u0379\u037b\u0005W\u0000\u0000\u037a\u0379\u0001\u0000"+
		"\u0000\u0000\u037b\u037e\u0001\u0000\u0000\u0000\u037c\u037a\u0001\u0000"+
		"\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d\u037f\u0001\u0000"+
		"\u0000\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037f\u0383\u0003\u0018"+
		"\f\u0000\u0380\u0382\u0005W\u0000\u0000\u0381\u0380\u0001\u0000\u0000"+
		"\u0000\u0382\u0385\u0001\u0000\u0000\u0000\u0383\u0381\u0001\u0000\u0000"+
		"\u0000\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0386\u0001\u0000\u0000"+
		"\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0386\u0387\u0005\u0006\u0000"+
		"\u0000\u0387\u038a\u0001\u0000\u0000\u0000\u0388\u038a\u0003\u001a\r\u0000"+
		"\u0389\u0378\u0001\u0000\u0000\u0000\u0389\u0388\u0001\u0000\u0000\u0000"+
		"\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u038c\u0005W\u0000\u0000\u038c"+
		"\u038e\u0001\u0000\u0000\u0000\u038d\u0377\u0001\u0000\u0000\u0000\u038d"+
		"\u038e\u0001\u0000\u0000\u0000\u038eS\u0001\u0000\u0000\u0000\u038f\u0390"+
		"\u0005\u001e\u0000\u0000\u0390\u0391\u0005\f\u0000\u0000\u0391\u0392\u0003"+
		"~?\u0000\u0392\u0393\u0005\r\u0000\u0000\u0393\u0396\u0003V+\u0000\u0394"+
		"\u0395\u0005\u001f\u0000\u0000\u0395\u0397\u0003V+\u0000\u0396\u0394\u0001"+
		"\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000\u0000\u0397U\u0001\u0000"+
		"\u0000\u0000\u0398\u039a\u0005W\u0000\u0000\u0399\u0398\u0001\u0000\u0000"+
		"\u0000\u039a\u039d\u0001\u0000\u0000\u0000\u039b\u0399\u0001\u0000\u0000"+
		"\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039c\u03af\u0001\u0000\u0000"+
		"\u0000\u039d\u039b\u0001\u0000\u0000\u0000\u039e\u03a2\u0005\u0005\u0000"+
		"\u0000\u039f\u03a1\u0005W\u0000\u0000\u03a0\u039f\u0001\u0000\u0000\u0000"+
		"\u03a1\u03a4\u0001\u0000\u0000\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3\u03a5\u0001\u0000\u0000\u0000"+
		"\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a5\u03a9\u0003\u0018\f\u0000\u03a6"+
		"\u03a8\u0005W\u0000\u0000\u03a7\u03a6\u0001\u0000\u0000\u0000\u03a8\u03ab"+
		"\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03a9\u03aa"+
		"\u0001\u0000\u0000\u0000\u03aa\u03ac\u0001\u0000\u0000\u0000\u03ab\u03a9"+
		"\u0001\u0000\u0000\u0000\u03ac\u03ad\u0005\u0006\u0000\u0000\u03ad\u03b0"+
		"\u0001\u0000\u0000\u0000\u03ae\u03b0\u0003\u001a\r\u0000\u03af\u039e\u0001"+
		"\u0000\u0000\u0000\u03af\u03ae\u0001\u0000\u0000\u0000\u03b0W\u0001\u0000"+
		"\u0000\u0000\u03b1\u03b2\u0005\u0017\u0000\u0000\u03b2\u03b3\u0005\f\u0000"+
		"\u0000\u03b3\u03b4\u0003~?\u0000\u03b4\u03b8\u0005\r\u0000\u0000\u03b5"+
		"\u03b7\u0005W\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7\u03ba"+
		"\u0001\u0000\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b8\u03b9"+
		"\u0001\u0000\u0000\u0000\u03b9\u03cc\u0001\u0000\u0000\u0000\u03ba\u03b8"+
		"\u0001\u0000\u0000\u0000\u03bb\u03bf\u0005\u0005\u0000\u0000\u03bc\u03be"+
		"\u0005W\u0000\u0000\u03bd\u03bc\u0001\u0000\u0000\u0000\u03be\u03c1\u0001"+
		"\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001"+
		"\u0000\u0000\u0000\u03c0\u03c2\u0001\u0000\u0000\u0000\u03c1\u03bf\u0001"+
		"\u0000\u0000\u0000\u03c2\u03c6\u0003\u0018\f\u0000\u03c3\u03c5\u0005W"+
		"\u0000\u0000\u03c4\u03c3\u0001\u0000\u0000\u0000\u03c5\u03c8\u0001\u0000"+
		"\u0000\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000"+
		"\u0000\u0000\u03c7\u03c9\u0001\u0000\u0000\u0000\u03c8\u03c6\u0001\u0000"+
		"\u0000\u0000\u03c9\u03ca\u0005\u0006\u0000\u0000\u03ca\u03cd\u0001\u0000"+
		"\u0000\u0000\u03cb\u03cd\u0003\u001a\r\u0000\u03cc\u03bb\u0001\u0000\u0000"+
		"\u0000\u03cc\u03cb\u0001\u0000\u0000\u0000\u03cdY\u0001\u0000\u0000\u0000"+
		"\u03ce\u03cf\u0005\u001d\u0000\u0000\u03cf\u03d0\u0005\f\u0000\u0000\u03d0"+
		"\u03d1\u0003B!\u0000\u03d1\u03d4\u0005\u0018\u0000\u0000\u03d2\u03d5\u0003"+
		"*\u0015\u0000\u03d3\u03d5\u0003\u001c\u000e\u0000\u03d4\u03d2\u0001\u0000"+
		"\u0000\u0000\u03d4\u03d3\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000"+
		"\u0000\u0000\u03d6\u03da\u0005\r\u0000\u0000\u03d7\u03d9\u0005W\u0000"+
		"\u0000\u03d8\u03d7\u0001\u0000\u0000\u0000\u03d9\u03dc\u0001\u0000\u0000"+
		"\u0000\u03da\u03d8\u0001\u0000\u0000\u0000\u03da\u03db\u0001\u0000\u0000"+
		"\u0000\u03db\u03e8\u0001\u0000\u0000\u0000\u03dc\u03da\u0001\u0000\u0000"+
		"\u0000\u03dd\u03e1\u0005\u0005\u0000\u0000\u03de\u03e0\u0005W\u0000\u0000"+
		"\u03df\u03de\u0001\u0000\u0000\u0000\u03e0\u03e3\u0001\u0000\u0000\u0000"+
		"\u03e1\u03df\u0001\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000\u0000"+
		"\u03e2\u03e4\u0001\u0000\u0000\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000"+
		"\u03e4\u03e5\u0003\u0018\f\u0000\u03e5\u03e6\u0005\u0006\u0000\u0000\u03e6"+
		"\u03e9\u0001\u0000\u0000\u0000\u03e7\u03e9\u0003\u001a\r\u0000\u03e8\u03dd"+
		"\u0001\u0000\u0000\u0000\u03e8\u03e7\u0001\u0000\u0000\u0000\u03e9[\u0001"+
		"\u0000\u0000\u0000\u03ea\u03eb\u0005\u001d\u0000\u0000\u03eb\u03ed\u0005"+
		"\f\u0000\u0000\u03ec\u03ee\u0003B!\u0000\u03ed\u03ec\u0001\u0000\u0000"+
		"\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000\u0000"+
		"\u0000\u03ef\u03f1\u0005W\u0000\u0000\u03f0\u03f2\u0003~?\u0000\u03f1"+
		"\u03f0\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000\u0000\u0000\u03f2"+
		"\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f5\u0005W\u0000\u0000\u03f4\u03f6"+
		"\u0003(\u0014\u0000\u03f5\u03f4\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001"+
		"\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000\u03f7\u03fb\u0005"+
		"\r\u0000\u0000\u03f8\u03fa\u0005W\u0000\u0000\u03f9\u03f8\u0001\u0000"+
		"\u0000\u0000\u03fa\u03fd\u0001\u0000\u0000\u0000\u03fb\u03f9\u0001\u0000"+
		"\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc\u0409\u0001\u0000"+
		"\u0000\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000\u03fe\u0402\u0005\u0005"+
		"\u0000\u0000\u03ff\u0401\u0005W\u0000\u0000\u0400\u03ff\u0001\u0000\u0000"+
		"\u0000\u0401\u0404\u0001\u0000\u0000\u0000\u0402\u0400\u0001\u0000\u0000"+
		"\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403\u0405\u0001\u0000\u0000"+
		"\u0000\u0404\u0402\u0001\u0000\u0000\u0000\u0405\u0406\u0003\u0018\f\u0000"+
		"\u0406\u0407\u0005\u0006\u0000\u0000\u0407\u040a\u0001\u0000\u0000\u0000"+
		"\u0408\u040a\u0003\u001a\r\u0000\u0409\u03fe\u0001\u0000\u0000\u0000\u0409"+
		"\u0408\u0001\u0000\u0000\u0000\u040a]\u0001\u0000\u0000\u0000\u040b\u040c"+
		"\u0005\u001d\u0000\u0000\u040c\u040d\u0005\f\u0000\u0000\u040d\u040e\u0003"+
		"\u009aM\u0000\u040e\u040f\u0005L\u0000\u0000\u040f\u0410\u0003h4\u0000"+
		"\u0410\u0411\u0005\u0004\u0000\u0000\u0411\u0412\u0003\u001c\u000e\u0000"+
		"\u0412\u0413\u0005\u0019\u0000\u0000\u0413\u0414\u0003\u001c\u000e\u0000"+
		"\u0414\u0418\u0005\r\u0000\u0000\u0415\u0417\u0005W\u0000\u0000\u0416"+
		"\u0415\u0001\u0000\u0000\u0000\u0417\u041a\u0001\u0000\u0000\u0000\u0418"+
		"\u0416\u0001\u0000\u0000\u0000\u0418\u0419\u0001\u0000\u0000\u0000\u0419"+
		"\u0426\u0001\u0000\u0000\u0000\u041a\u0418\u0001\u0000\u0000\u0000\u041b"+
		"\u041f\u0005\u0005\u0000\u0000\u041c\u041e\u0005W\u0000\u0000\u041d\u041c"+
		"\u0001\u0000\u0000\u0000\u041e\u0421\u0001\u0000\u0000\u0000\u041f\u041d"+
		"\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u0422"+
		"\u0001\u0000\u0000\u0000\u0421\u041f\u0001\u0000\u0000\u0000\u0422\u0423"+
		"\u0003\u0018\f\u0000\u0423\u0424\u0005\u0006\u0000\u0000\u0424\u0427\u0001"+
		"\u0000\u0000\u0000\u0425\u0427\u0003\u001a\r\u0000\u0426\u041b\u0001\u0000"+
		"\u0000\u0000\u0426\u0425\u0001\u0000\u0000\u0000\u0427_\u0001\u0000\u0000"+
		"\u0000\u0428\u042a\u0007\u0001\u0000\u0000\u0429\u0428\u0001\u0000\u0000"+
		"\u0000\u0429\u042a\u0001\u0000\u0000\u0000\u042a\u042c\u0001\u0000\u0000"+
		"\u0000\u042b\u042d\u00056\u0000\u0000\u042c\u042b\u0001\u0000\u0000\u0000"+
		"\u042c\u042d\u0001\u0000\u0000\u0000\u042d\u042f\u0001\u0000\u0000\u0000"+
		"\u042e\u0430\u00057\u0000\u0000\u042f\u042e\u0001\u0000\u0000\u0000\u042f"+
		"\u0430\u0001\u0000\u0000\u0000\u0430a\u0001\u0000\u0000\u0000\u0431\u0433"+
		"\u00058\u0000\u0000\u0432\u0431\u0001\u0000\u0000\u0000\u0432\u0433\u0001"+
		"\u0000\u0000\u0000\u0433\u0436\u0001\u0000\u0000\u0000\u0434\u0437\u0005"+
		"O\u0000\u0000\u0435\u0437\u0007\u0002\u0000\u0000\u0436\u0434\u0001\u0000"+
		"\u0000\u0000\u0436\u0435\u0001\u0000\u0000\u0000\u0436\u0437\u0001\u0000"+
		"\u0000\u0000\u0437c\u0001\u0000\u0000\u0000\u0438\u043c\u0003\u009aM\u0000"+
		"\u0439\u043b\u0003\u009aM\u0000\u043a\u0439\u0001\u0000\u0000\u0000\u043b"+
		"\u043e\u0001\u0000\u0000\u0000\u043c\u043a\u0001\u0000\u0000\u0000\u043c"+
		"\u043d\u0001\u0000\u0000\u0000\u043de\u0001\u0000\u0000\u0000\u043e\u043c"+
		"\u0001\u0000\u0000\u0000\u043f\u0440\u0007\u0003\u0000\u0000\u0440g\u0001"+
		"\u0000\u0000\u0000\u0441\u0444\u0003j5\u0000\u0442\u0444\u0003l6\u0000"+
		"\u0443\u0441\u0001\u0000\u0000\u0000\u0443\u0442\u0001\u0000\u0000\u0000"+
		"\u0444\u0449\u0001\u0000\u0000\u0000\u0445\u0446\u0005\t\u0000\u0000\u0446"+
		"\u0448\u0005\n\u0000\u0000\u0447\u0445\u0001\u0000\u0000\u0000\u0448\u044b"+
		"\u0001\u0000\u0000\u0000\u0449\u0447\u0001\u0000\u0000\u0000\u0449\u044a"+
		"\u0001\u0000\u0000\u0000\u044a\u044d\u0001\u0000\u0000\u0000\u044b\u0449"+
		"\u0001\u0000\u0000\u0000\u044c\u044e\u0007\u0004\u0000\u0000\u044d\u044c"+
		"\u0001\u0000\u0000\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044ei\u0001"+
		"\u0000\u0000\u0000\u044f\u0452\u0003\u009aM\u0000\u0450\u0452\u0003n7"+
		"\u0000\u0451\u044f\u0001\u0000\u0000\u0000\u0451\u0450\u0001\u0000\u0000"+
		"\u0000\u0452k\u0001\u0000\u0000\u0000\u0453\u0458\u0005\u001a\u0000\u0000"+
		"\u0454\u0459\u0003j5\u0000\u0455\u0459\u0005N\u0000\u0000\u0456\u0459"+
		"\u0005P\u0000\u0000\u0457\u0459\u0005R\u0000\u0000\u0458\u0454\u0001\u0000"+
		"\u0000\u0000\u0458\u0455\u0001\u0000\u0000\u0000\u0458\u0456\u0001\u0000"+
		"\u0000\u0000\u0458\u0457\u0001\u0000\u0000\u0000\u0459m\u0001\u0000\u0000"+
		"\u0000\u045a\u0465\u0005!\u0000\u0000\u045b\u0465\u0005\"\u0000\u0000"+
		"\u045c\u0465\u0005#\u0000\u0000\u045d\u0465\u0005$\u0000\u0000\u045e\u0465"+
		"\u0005%\u0000\u0000\u045f\u0465\u0005&\u0000\u0000\u0460\u0465\u0005\'"+
		"\u0000\u0000\u0461\u0465\u0005(\u0000\u0000\u0462\u0465\u0005)\u0000\u0000"+
		"\u0463\u0465\u0003p8\u0000\u0464\u045a\u0001\u0000\u0000\u0000\u0464\u045b"+
		"\u0001\u0000\u0000\u0000\u0464\u045c\u0001\u0000\u0000\u0000\u0464\u045d"+
		"\u0001\u0000\u0000\u0000\u0464\u045e\u0001\u0000\u0000\u0000\u0464\u045f"+
		"\u0001\u0000\u0000\u0000\u0464\u0460\u0001\u0000\u0000\u0000\u0464\u0461"+
		"\u0001\u0000\u0000\u0000\u0464\u0462\u0001\u0000\u0000\u0000\u0464\u0463"+
		"\u0001\u0000\u0000\u0000\u0465o\u0001\u0000\u0000\u0000\u0466\u0467\u0007"+
		"\u0005\u0000\u0000\u0467q\u0001\u0000\u0000\u0000\u0468\u046d\u0003t:"+
		"\u0000\u0469\u046a\u0005\u0004\u0000\u0000\u046a\u046c\u0003t:\u0000\u046b"+
		"\u0469\u0001\u0000\u0000\u0000\u046c\u046f\u0001\u0000\u0000\u0000\u046d"+
		"\u046b\u0001\u0000\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000\u046e"+
		"s\u0001\u0000\u0000\u0000\u046f\u046d\u0001\u0000\u0000\u0000\u0470\u0471"+
		"\u0003\u001c\u000e\u0000\u0471u\u0001\u0000\u0000\u0000\u0472\u0474\u0003"+
		"z=\u0000\u0473\u0472\u0001\u0000\u0000\u0000\u0474\u0477\u0001\u0000\u0000"+
		"\u0000\u0475\u0473\u0001\u0000\u0000\u0000\u0475\u0476\u0001\u0000\u0000"+
		"\u0000\u0476\u047b\u0001\u0000\u0000\u0000\u0477\u0475\u0001\u0000\u0000"+
		"\u0000\u0478\u0479\u0003*\u0015\u0000\u0479\u047a\u0005\b\u0000\u0000"+
		"\u047a\u047c\u0001\u0000\u0000\u0000\u047b\u0478\u0001\u0000\u0000\u0000"+
		"\u047b\u047c\u0001\u0000\u0000\u0000\u047c\u047d\u0001\u0000\u0000\u0000"+
		"\u047d\u047e\u0005U\u0000\u0000\u047e\u0480\u0005\f\u0000\u0000\u047f"+
		"\u0481\u0003r9\u0000\u0480\u047f\u0001\u0000\u0000\u0000\u0480\u0481\u0001"+
		"\u0000\u0000\u0000\u0481\u0482\u0001\u0000\u0000\u0000\u0482\u0483\u0005"+
		"\r\u0000\u0000\u0483w\u0001\u0000\u0000\u0000\u0484\u0489\u0003v;\u0000"+
		"\u0485\u0486\u0005\b\u0000\u0000\u0486\u0488\u0003v;\u0000\u0487\u0485"+
		"\u0001\u0000\u0000\u0000\u0488\u048b\u0001\u0000\u0000\u0000\u0489\u0487"+
		"\u0001\u0000\u0000\u0000\u0489\u048a\u0001\u0000\u0000\u0000\u048ay\u0001"+
		"\u0000\u0000\u0000\u048b\u0489\u0001\u0000\u0000\u0000\u048c\u048d\u0005"+
		"\u001b\u0000\u0000\u048d\u0492\u0003\u009aM\u0000\u048e\u048f\u0005\f"+
		"\u0000\u0000\u048f\u0490\u0003r9\u0000\u0490\u0491\u0005\r\u0000\u0000"+
		"\u0491\u0493\u0001\u0000\u0000\u0000\u0492\u048e\u0001\u0000\u0000\u0000"+
		"\u0492\u0493\u0001\u0000\u0000\u0000\u0493\u0497\u0001\u0000\u0000\u0000"+
		"\u0494\u0496\u0005W\u0000\u0000\u0495\u0494\u0001\u0000\u0000\u0000\u0496"+
		"\u0499\u0001\u0000\u0000\u0000\u0497\u0495\u0001\u0000\u0000\u0000\u0497"+
		"\u0498\u0001\u0000\u0000\u0000\u0498{\u0001\u0000\u0000\u0000\u0499\u0497"+
		"\u0001\u0000\u0000\u0000\u049a\u049b\u0005\u000e\u0000\u0000\u049b\u049c"+
		"\u0003\u009aM\u0000\u049c\u049e\u0005\f\u0000\u0000\u049d\u049f\u0003"+
		"r9\u0000\u049e\u049d\u0001\u0000\u0000\u0000\u049e\u049f\u0001\u0000\u0000"+
		"\u0000\u049f\u04a0\u0001\u0000\u0000\u0000\u04a0\u04a1\u0005\r\u0000\u0000"+
		"\u04a1}\u0001\u0000\u0000\u0000\u04a2\u04a6\u0003\u0088D\u0000\u04a3\u04a6"+
		"\u0003\u0080@\u0000\u04a4\u04a6\u0003\u008aE\u0000\u04a5\u04a2\u0001\u0000"+
		"\u0000\u0000\u04a5\u04a3\u0001\u0000\u0000\u0000\u04a5\u04a4\u0001\u0000"+
		"\u0000\u0000\u04a6\u007f\u0001\u0000\u0000\u0000\u04a7\u04aa\u0003\u0088"+
		"D\u0000\u04a8\u04aa\u0003\u0082A\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000"+
		"\u04a9\u04a8\u0001\u0000\u0000\u0000\u04aa\u04b1\u0001\u0000\u0000\u0000"+
		"\u04ab\u04af\u0005A\u0000\u0000\u04ac\u04b0\u0003\u0088D\u0000\u04ad\u04b0"+
		"\u0003\u0082A\u0000\u04ae\u04b0\u0003\u0080@\u0000\u04af\u04ac\u0001\u0000"+
		"\u0000\u0000\u04af\u04ad\u0001\u0000\u0000\u0000\u04af\u04ae\u0001\u0000"+
		"\u0000\u0000\u04b0\u04b2\u0001\u0000\u0000\u0000\u04b1\u04ab\u0001\u0000"+
		"\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2\u0081\u0001\u0000"+
		"\u0000\u0000\u04b3\u04b6\u0003\u0088D\u0000\u04b4\u04b6\u0003\u0084B\u0000"+
		"\u04b5\u04b3\u0001\u0000\u0000\u0000\u04b5\u04b4\u0001\u0000\u0000\u0000"+
		"\u04b6\u04bd\u0001\u0000\u0000\u0000\u04b7\u04bb\u0005@\u0000\u0000\u04b8"+
		"\u04bc\u0003\u0088D\u0000\u04b9\u04bc\u0003\u0084B\u0000\u04ba\u04bc\u0003"+
		"\u0082A\u0000\u04bb\u04b8\u0001\u0000\u0000\u0000\u04bb\u04b9\u0001\u0000"+
		"\u0000\u0000\u04bb\u04ba\u0001\u0000\u0000\u0000\u04bc\u04be\u0001\u0000"+
		"\u0000\u0000\u04bd\u04b7\u0001\u0000\u0000\u0000\u04bd\u04be\u0001\u0000"+
		"\u0000\u0000\u04be\u0083\u0001\u0000\u0000\u0000\u04bf\u04c2\u0003\u0088"+
		"D\u0000\u04c0\u04c2\u0003\u0086C\u0000\u04c1\u04bf\u0001\u0000\u0000\u0000"+
		"\u04c1\u04c0\u0001\u0000\u0000\u0000\u04c2\u04c9\u0001\u0000\u0000\u0000"+
		"\u04c3\u04c7\u0005C\u0000\u0000\u04c4\u04c8\u0003\u0088D\u0000\u04c5\u04c8"+
		"\u0003\u0086C\u0000\u04c6\u04c8\u0003\u0084B\u0000\u04c7\u04c4\u0001\u0000"+
		"\u0000\u0000\u04c7\u04c5\u0001\u0000\u0000\u0000\u04c7\u04c6\u0001\u0000"+
		"\u0000\u0000\u04c8\u04ca\u0001\u0000\u0000\u0000\u04c9\u04c3\u0001\u0000"+
		"\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000\u0000\u04ca\u0085\u0001\u0000"+
		"\u0000\u0000\u04cb\u04cd\u0005B\u0000\u0000\u04cc\u04cb\u0001\u0000\u0000"+
		"\u0000\u04cc\u04cd\u0001\u0000\u0000\u0000\u04cd\u04ce\u0001\u0000\u0000"+
		"\u0000\u04ce\u04cf\u0003\u0088D\u0000\u04cf\u0087\u0001\u0000\u0000\u0000"+
		"\u04d0\u04db\u0003\u001e\u000f\u0000\u04d1\u04db\u0003x<\u0000\u04d2\u04db"+
		"\u0003*\u0015\u0000\u04d3\u04db\u0003\u009aM\u0000\u04d4\u04d5\u0005\f"+
		"\u0000\u0000\u04d5\u04d6\u0003~?\u0000\u04d6\u04d7\u0005\r\u0000\u0000"+
		"\u04d7\u04db\u0001\u0000\u0000\u0000\u04d8\u04db\u0003|>\u0000\u04d9\u04db"+
		"\u0003,\u0016\u0000\u04da\u04d0\u0001\u0000\u0000\u0000\u04da\u04d1\u0001"+
		"\u0000\u0000\u0000\u04da\u04d2\u0001\u0000\u0000\u0000\u04da\u04d3\u0001"+
		"\u0000\u0000\u0000\u04da\u04d4\u0001\u0000\u0000\u0000\u04da\u04d8\u0001"+
		"\u0000\u0000\u0000\u04da\u04d9\u0001\u0000\u0000\u0000\u04db\u0089\u0001"+
		"\u0000\u0000\u0000\u04dc\u04dd\u0003\u008cF\u0000\u04dd\u04de\u0007\u0006"+
		"\u0000\u0000\u04de\u04df\u0003\u008cF\u0000\u04df\u008b\u0001\u0000\u0000"+
		"\u0000\u04e0\u04e3\u0003\u0096K\u0000\u04e1\u04e3\u0003\u008eG\u0000\u04e2"+
		"\u04e0\u0001\u0000\u0000\u0000\u04e2\u04e1\u0001\u0000\u0000\u0000\u04e3"+
		"\u008d\u0001\u0000\u0000\u0000\u04e4\u04ea\u0003\u0090H\u0000\u04e5\u04e8"+
		"\u0007\u0007\u0000\u0000\u04e6\u04e9\u0003\u0096K\u0000\u04e7\u04e9\u0003"+
		"\u008eG\u0000\u04e8\u04e6\u0001\u0000\u0000\u0000\u04e8\u04e7\u0001\u0000"+
		"\u0000\u0000\u04e9\u04eb\u0001\u0000\u0000\u0000\u04ea\u04e5\u0001\u0000"+
		"\u0000\u0000\u04ea\u04eb\u0001\u0000\u0000\u0000\u04eb\u008f\u0001\u0000"+
		"\u0000\u0000\u04ec\u04f2\u0003\u0092I\u0000\u04ed\u04f0\u0007\b\u0000"+
		"\u0000\u04ee\u04f1\u0003\u0096K\u0000\u04ef\u04f1\u0003\u0090H\u0000\u04f0"+
		"\u04ee\u0001\u0000\u0000\u0000\u04f0\u04ef\u0001\u0000\u0000\u0000\u04f1"+
		"\u04f3\u0001\u0000\u0000\u0000\u04f2\u04ed\u0001\u0000\u0000\u0000\u04f2"+
		"\u04f3\u0001\u0000\u0000\u0000\u04f3\u0091\u0001\u0000\u0000\u0000\u04f4"+
		"\u04fa\u0003\u0094J\u0000\u04f5\u04f8\u0007\t\u0000\u0000\u04f6\u04f9"+
		"\u0003\u0096K\u0000\u04f7\u04f9\u0003\u0092I\u0000\u04f8\u04f6\u0001\u0000"+
		"\u0000\u0000\u04f8\u04f7\u0001\u0000\u0000\u0000\u04f9\u04fb\u0001\u0000"+
		"\u0000\u0000\u04fa\u04f5\u0001\u0000\u0000\u0000\u04fa\u04fb\u0001\u0000"+
		"\u0000\u0000\u04fb\u0093\u0001\u0000\u0000\u0000\u04fc\u0502\u0003\u0096"+
		"K\u0000\u04fd\u0500\u00052\u0000\u0000\u04fe\u0501\u0003\u0096K\u0000"+
		"\u04ff\u0501\u0003\u0094J\u0000\u0500\u04fe\u0001\u0000\u0000\u0000\u0500"+
		"\u04ff\u0001\u0000\u0000\u0000\u0501\u0503\u0001\u0000\u0000\u0000\u0502"+
		"\u04fd\u0001\u0000\u0000\u0000\u0502\u0503\u0001\u0000\u0000\u0000\u0503"+
		"\u0095\u0001\u0000\u0000\u0000\u0504\u0506\u0007\u0007\u0000\u0000\u0505"+
		"\u0504\u0001\u0000\u0000\u0000\u0505\u0506\u0001\u0000\u0000\u0000\u0506"+
		"\u050e\u0001\u0000\u0000\u0000\u0507\u050f\u0003x<\u0000\u0508\u050f\u0003"+
		"\u009aM\u0000\u0509\u050f\u0003\u009eO\u0000\u050a\u050b\u0005\f\u0000"+
		"\u0000\u050b\u050c\u0003\u008cF\u0000\u050c\u050d\u0005\r\u0000\u0000"+
		"\u050d\u050f\u0001\u0000\u0000\u0000\u050e\u0507\u0001\u0000\u0000\u0000"+
		"\u050e\u0508\u0001\u0000\u0000\u0000\u050e\u0509\u0001\u0000\u0000\u0000"+
		"\u050e\u050a\u0001\u0000\u0000\u0000\u050f\u0512\u0001\u0000\u0000\u0000"+
		"\u0510\u0512\u0003\u0098L\u0000\u0511\u0505\u0001\u0000\u0000\u0000\u0511"+
		"\u0510\u0001\u0000\u0000\u0000\u0512\u0097\u0001\u0000\u0000\u0000\u0513"+
		"\u0514\u0005.\u0000\u0000\u0514\u0518\u0005.\u0000\u0000\u0515\u0516\u0005"+
		"/\u0000\u0000\u0516\u0518\u0005/\u0000\u0000\u0517\u0513\u0001\u0000\u0000"+
		"\u0000\u0517\u0515\u0001\u0000\u0000\u0000\u0518\u051b\u0001\u0000\u0000"+
		"\u0000\u0519\u051c\u0003\u009aM\u0000\u051a\u051c\u0003*\u0015\u0000\u051b"+
		"\u0519\u0001\u0000\u0000\u0000\u051b\u051a\u0001\u0000\u0000\u0000\u051c"+
		"\u0528\u0001\u0000\u0000\u0000\u051d\u0520\u0003\u009aM\u0000\u051e\u0520"+
		"\u0003*\u0015\u0000\u051f\u051d\u0001\u0000\u0000\u0000\u051f\u051e\u0001"+
		"\u0000\u0000\u0000\u0520\u0525\u0001\u0000\u0000\u0000\u0521\u0522\u0005"+
		".\u0000\u0000\u0522\u0526\u0005.\u0000\u0000\u0523\u0524\u0005/\u0000"+
		"\u0000\u0524\u0526\u0005/\u0000\u0000\u0525\u0521\u0001\u0000\u0000\u0000"+
		"\u0525\u0523\u0001\u0000\u0000\u0000\u0526\u0528\u0001\u0000\u0000\u0000"+
		"\u0527\u0517\u0001\u0000\u0000\u0000\u0527\u051f\u0001\u0000\u0000\u0000"+
		"\u0528\u0099\u0001\u0000\u0000\u0000\u0529\u052c\u0003\u009cN\u0000\u052a"+
		"\u052c\u0005U\u0000\u0000\u052b\u0529\u0001\u0000\u0000\u0000\u052b\u052a"+
		"\u0001\u0000\u0000\u0000\u052c\u009b\u0001\u0000\u0000\u0000\u052d\u0530"+
		"\u0005U\u0000\u0000\u052e\u052f\u0005\b\u0000\u0000\u052f\u0531\u0005"+
		"U\u0000\u0000\u0530\u052e\u0001\u0000\u0000\u0000\u0531\u0532\u0001\u0000"+
		"\u0000\u0000\u0532\u0530\u0001\u0000\u0000\u0000\u0532\u0533\u0001\u0000"+
		"\u0000\u0000\u0533\u009d\u0001\u0000\u0000\u0000\u0534\u0535\u0007\n\u0000"+
		"\u0000\u0535\u009f\u0001\u0000\u0000\u0000\u0536\u0537\u0007\u000b\u0000"+
		"\u0000\u0537\u00a1\u0001\u0000\u0000\u0000\u00c1\u00a5\u00a9\u00ac\u00b2"+
		"\u00b7\u00bf\u00c3\u00c8\u00cd\u00d3\u00d9\u00dc\u00e1\u00ea\u00f0\u00f3"+
		"\u00f9\u00fd\u0102\u0106\u010b\u010f\u0114\u0118\u011c\u0120\u0129\u012c"+
		"\u0132\u0136\u013b\u0143\u0147\u0152\u0155\u015b\u015f\u0164\u016c\u0170"+
		"\u017b\u017e\u0184\u018b\u0195\u019a\u019f\u01a8\u01ad\u01b2\u01b8\u01bd"+
		"\u01c2\u01c7\u01ce\u01d3\u01d6\u01df\u01e5\u01ed\u01f4\u01f8\u01ff\u0207"+
		"\u020c\u0212\u0218\u0221\u0225\u022c\u0230\u0238\u023f\u0246\u024c\u0251"+
		"\u0255\u025c\u0263\u026a\u0272\u027e\u0285\u028f\u0295\u029d\u02a1\u02a6"+
		"\u02ab\u02b8\u02c7\u02cf\u02d4\u02dd\u02e2\u02eb\u02fb\u02ff\u0308\u030f"+
		"\u0315\u031b\u0322\u0329\u0331\u0335\u033a\u033f\u0345\u034c\u0352\u0357"+
		"\u0362\u0369\u036f\u0374\u037c\u0383\u0389\u038d\u0396\u039b\u03a2\u03a9"+
		"\u03af\u03b8\u03bf\u03c6\u03cc\u03d4\u03da\u03e1\u03e8\u03ed\u03f1\u03f5"+
		"\u03fb\u0402\u0409\u0418\u041f\u0426\u0429\u042c\u042f\u0432\u0436\u043c"+
		"\u0443\u0449\u044d\u0451\u0458\u0464\u046d\u0475\u047b\u0480\u0489\u0492"+
		"\u0497\u049e\u04a5\u04a9\u04af\u04b1\u04b5\u04bb\u04bd\u04c1\u04c7\u04c9"+
		"\u04cc\u04da\u04e2\u04e8\u04ea\u04f0\u04f2\u04f8\u04fa\u0500\u0502\u0505"+
		"\u050e\u0511\u0517\u051b\u051f\u0525\u0527\u052b\u0532";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}