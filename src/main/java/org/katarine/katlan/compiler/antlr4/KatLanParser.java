// Generated from C:/Users/Egor/Documents/Java/gdx/KatLan/src/main/resources/KatLan.g4 by ANTLR 4.13.1
package org.katarine.katlan.compiler.antlr4;
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
		STATIC=53, FINAL=54, TRUE=55, FALSE=56, POST_MOD=57, PRE_MOD=58, OP_OV_MOD=59, 
		NNULL_OP=60, NULL_OP=61, AND=62, OR=63, NOT=64, XOR=65, BT=66, LT=67, 
		EQ=68, NEQ=69, NE=70, LE=71, BE=72, QUESTION_MARK=73, COLON=74, EXTENDS=75, 
		CLASS_KEYWORD=76, ABSTRACT_KEYWORD=77, INTERFACE_KEYWORD=78, ANNOTATION_KEYWORD=79, 
		ENUM_KEYWORD=80, INT_VAL=81, FLOAT_VAL=82, NAME0=83, STRING_VAL=84, ENDLINE=85, 
		WS=86, COMMENT=87;
	public static final int
		RULE_class = 0, RULE_package = 1, RULE_importBlock = 2, RULE_importStatement = 3, 
		RULE_unnamedClassDef = 4, RULE_classDef = 5, RULE_interfaceDef = 6, RULE_annotationDef = 7, 
		RULE_namespaceBlock = 8, RULE_classBlock = 9, RULE_annotationClassBlock = 10, 
		RULE_block = 11, RULE_lineBlock = 12, RULE_value = 13, RULE_bool = 14, 
		RULE_genericTypeName = 15, RULE_genericDef = 16, RULE_genericTypeUse = 17, 
		RULE_extendsStatement = 18, RULE_varAssignment = 19, RULE_varAccess = 20, 
		RULE_arrayAccess = 21, RULE_arrayAccess0 = 22, RULE_methodDef = 23, RULE_constructorDef = 24, 
		RULE_operatorOverDef = 25, RULE_parameters = 26, RULE_parameter = 27, 
		RULE_var = 28, RULE_constDef = 29, RULE_constDef0 = 30, RULE_constDef1 = 31, 
		RULE_varDef = 32, RULE_varDef0 = 33, RULE_varDef1 = 34, RULE_subVD1 = 35, 
		RULE_statement = 36, RULE_returnStatement = 37, RULE_switchStatement = 38, 
		RULE_subSwitch0 = 39, RULE_tryCatchFinally = 40, RULE_ifStatement = 41, 
		RULE_ifStatement0 = 42, RULE_whileLoopStatement = 43, RULE_forEachLoop = 44, 
		RULE_foriLoop = 45, RULE_foriLoop0 = 46, RULE_access = 47, RULE_methodModifier = 48, 
		RULE_operator = 49, RULE_type = 50, RULE_anyType = 51, RULE_linkType = 52, 
		RULE_primitiveType = 53, RULE_nullType = 54, RULE_arguments = 55, RULE_argument = 56, 
		RULE_methodCall0 = 57, RULE_methodCall = 58, RULE_annotationCall = 59, 
		RULE_constructorCall = 60, RULE_expression = 61, RULE_logicalOr = 62, 
		RULE_logicalAnd = 63, RULE_logicalXor = 64, RULE_logicalNot = 65, RULE_primaryExpresion = 66, 
		RULE_arithCondExpression = 67, RULE_arithmeticExpression = 68, RULE_addSubExpression = 69, 
		RULE_modDivExpression = 70, RULE_mulDivExpression = 71, RULE_powerExpression = 72, 
		RULE_numberExpression = 73, RULE_incrExpression = 74, RULE_name = 75, 
		RULE_dot_name = 76, RULE_numeric_value = 77;
	private static String[] makeRuleNames() {
		return new String[] {
			"class", "package", "importBlock", "importStatement", "unnamedClassDef", 
			"classDef", "interfaceDef", "annotationDef", "namespaceBlock", "classBlock", 
			"annotationClassBlock", "block", "lineBlock", "value", "bool", "genericTypeName", 
			"genericDef", "genericTypeUse", "extendsStatement", "varAssignment", 
			"varAccess", "arrayAccess", "arrayAccess0", "methodDef", "constructorDef", 
			"operatorOverDef", "parameters", "parameter", "var", "constDef", "constDef0", 
			"constDef1", "varDef", "varDef0", "varDef1", "subVD1", "statement", "returnStatement", 
			"switchStatement", "subSwitch0", "tryCatchFinally", "ifStatement", "ifStatement0", 
			"whileLoopStatement", "forEachLoop", "foriLoop", "foriLoop0", "access", 
			"methodModifier", "operator", "type", "anyType", "linkType", "primitiveType", 
			"nullType", "arguments", "argument", "methodCall0", "methodCall", "annotationCall", 
			"constructorCall", "expression", "logicalOr", "logicalAnd", "logicalXor", 
			"logicalNot", "primaryExpresion", "arithCondExpression", "arithmeticExpression", 
			"addSubExpression", "modDivExpression", "mulDivExpression", "powerExpression", 
			"numberExpression", "incrExpression", "name", "dot_name", "numeric_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'import'", "','", "'{'", "'}'", "'='", "'.'", "'['", 
			"']'", "'def'", "'('", "')'", "'new'", "'const'", "'var'", "'return'", 
			"'default'", "'->'", "'try'", "'catch'", "'finally'", "'while'", "'in'", 
			"'..'", "'@'", "'$'", "'as'", "'for'", "'if'", "'else'", "'switch'", 
			"'str'", "'bool'", "'int'", "'float'", "'double'", "'long'", "'short'", 
			"'byte'", "'obj'", "'void'", "'null'", "'div'", "'%'", "'+'", "'-'", 
			"'*'", "'/'", "'**'", null, null, null, "'static'", null, "'true'", "'false'", 
			"'post'", "'pre'", null, "'!!'", "'??'", null, null, null, null, "'>'", 
			"'<'", "'=='", "'==='", "'!='", "'<='", "'>='", "'?'", "':'", null, "'class'", 
			"'abstract'", "'interface'", "'annotation'", "'enum'"
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
			"TRUE", "FALSE", "POST_MOD", "PRE_MOD", "OP_OV_MOD", "NNULL_OP", "NULL_OP", 
			"AND", "OR", "NOT", "XOR", "BT", "LT", "EQ", "NEQ", "NE", "LE", "BE", 
			"QUESTION_MARK", "COLON", "EXTENDS", "CLASS_KEYWORD", "ABSTRACT_KEYWORD", 
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
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(156);
					match(ENDLINE);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(162);
				package_();
				}
			}

			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(165);
				importBlock();
				}
			}

			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(168);
				classDef();
				}
				break;
			case 2:
				{
				setState(169);
				interfaceDef();
				}
				break;
			case 3:
				{
				setState(170);
				unnamedClassDef();
				}
				break;
			case 4:
				{
				setState(171);
				annotationDef();
				}
				break;
			}
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(174);
				match(ENDLINE);
				}
				}
				setState(179);
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
			setState(180);
			match(T__0);
			setState(181);
			name();
			setState(183); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(182);
					match(ENDLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185); 
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
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				importStatement();
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__1);
			setState(193);
			name();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_KEYWORD) {
				{
				setState(194);
				match(AS_KEYWORD);
				setState(195);
				name();
				}
			}

			setState(199); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(198);
					match(ENDLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(201); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class UnnamedClassDefContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(KatLanParser.EXTENDS, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<NamespaceBlockContext> namespaceBlock() {
			return getRuleContexts(NamespaceBlockContext.class);
		}
		public NamespaceBlockContext namespaceBlock(int i) {
			return getRuleContext(NamespaceBlockContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(KatLanParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(KatLanParser.ENDLINE, i);
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
		enterRule(_localctx, 8, RULE_unnamedClassDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(203);
				match(EXTENDS);
				setState(204);
				name();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(205);
					match(T__2);
					setState(206);
					name();
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(212);
						match(ENDLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(215); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 467248461406848000L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0)) {
				{
				setState(219);
				namespaceBlock();
				}
			}

			setState(223); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(222);
					match(ENDLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(225); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(227);
				match(T__3);
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(228);
						match(ENDLINE);
						}
						} 
					}
					setState(233);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1043709213710279680L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0)) {
					{
					setState(234);
					classBlock();
					}
				}

				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(237);
					match(ENDLINE);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				match(T__4);
				}
			}

			setState(247); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(246);
					match(ENDLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(249); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 467248461406848000L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0)) {
				{
				setState(251);
				namespaceBlock();
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
		public TerminalNode EXTENDS() { return getToken(KatLanParser.EXTENDS, 0); }
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
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(254);
				annotationCall();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			access();
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_KEYWORD:
			case ABSTRACT_KEYWORD:
				{
				{
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABSTRACT_KEYWORD) {
					{
					setState(261);
					match(ABSTRACT_KEYWORD);
					}
				}

				setState(264);
				match(CLASS_KEYWORD);
				}
				}
				break;
			case ENUM_KEYWORD:
				{
				setState(265);
				match(ENUM_KEYWORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(268);
			name();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(269);
				match(EXTENDS);
				setState(270);
				name();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(271);
					match(T__2);
					setState(272);
					name();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(280);
			match(T__3);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					match(ENDLINE);
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1043709213710279680L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0)) {
				{
				setState(287);
				classBlock();
				}
			}

			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(290);
				match(ENDLINE);
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode EXTENDS() { return getToken(KatLanParser.EXTENDS, 0); }
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
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(298);
				annotationCall();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			access();
			setState(305);
			match(INTERFACE_KEYWORD);
			setState(306);
			name();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(307);
				match(EXTENDS);
				setState(308);
				name();
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(309);
					match(T__2);
					setState(310);
					name();
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(318);
			match(T__3);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(319);
					match(ENDLINE);
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1043709213710279680L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0)) {
				{
				setState(325);
				classBlock();
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(328);
				match(ENDLINE);
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode EXTENDS() { return getToken(KatLanParser.EXTENDS, 0); }
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
		enterRule(_localctx, 14, RULE_annotationDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(336);
				annotationCall();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			access();
			setState(343);
			match(ANNOTATION_KEYWORD);
			setState(344);
			name();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(345);
				match(EXTENDS);
				setState(346);
				name();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(347);
					match(T__2);
					setState(348);
					name();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(356);
			match(T__3);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(357);
				match(ENDLINE);
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			annotationClassBlock();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(364);
				match(ENDLINE);
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceBlockContext extends ParserRuleContext {
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
		public NamespaceBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterNamespaceBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitNamespaceBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitNamespaceBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceBlockContext namespaceBlock() throws RecognitionException {
		NamespaceBlockContext _localctx = new NamespaceBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_namespaceBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(372);
					var();
					}
					break;
				case 2:
					{
					setState(373);
					methodDef();
					}
					break;
				case 3:
					{
					setState(374);
					classDef();
					}
					break;
				case 4:
					{
					setState(375);
					interfaceDef();
					}
					break;
				case 5:
					{
					setState(376);
					annotationDef();
					}
					break;
				}
				setState(380); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(379);
						match(ENDLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(382); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(386); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 467248461406848000L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 18, RULE_classBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(388);
					var();
					}
					break;
				case 2:
					{
					setState(389);
					methodDef();
					}
					break;
				case 3:
					{
					setState(390);
					constructorDef();
					}
					break;
				case 4:
					{
					setState(391);
					operatorOverDef();
					}
					break;
				case 5:
					{
					setState(392);
					classDef();
					}
					break;
				case 6:
					{
					setState(393);
					interfaceDef();
					}
					break;
				case 7:
					{
					setState(394);
					annotationDef();
					}
					break;
				}
				setState(398); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(397);
						match(ENDLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(400); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1043709213710279680L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 20, RULE_annotationClassBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(406);
					var();
					}
					break;
				case 2:
					{
					setState(407);
					methodDef();
					}
					break;
				case 3:
					{
					setState(408);
					classDef();
					}
					break;
				case 4:
					{
					setState(409);
					interfaceDef();
					}
					break;
				}
				setState(413); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(412);
						match(ENDLINE);
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
				setState(419); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 467248461406848000L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 23L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35008453253120000L) != 0) || _la==NAME0) {
				{
				{
				setState(421);
				lineBlock();
				}
				}
				setState(426);
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
		enterRule(_localctx, 24, RULE_lineBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(427);
				var();
				}
				break;
			case 2:
				{
				setState(428);
				varAssignment();
				}
				break;
			case 3:
				{
				setState(429);
				methodCall();
				}
				break;
			case 4:
				{
				setState(430);
				statement();
				}
				break;
			}
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDLINE:
				{
				setState(434); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(433);
						match(ENDLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(436); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				{
				setState(438);
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
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(STRING_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				arithmeticExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(445);
				name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(446);
				anyType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(447);
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
		enterRule(_localctx, 28, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
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
		enterRule(_localctx, 30, RULE_genericTypeName);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME0:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				name();
				}
				break;
			case QUESTION_MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
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
		enterRule(_localctx, 32, RULE_genericDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(456);
			match(LT);
			setState(457);
			genericTypeUse();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(458);
				match(T__2);
				setState(459);
				genericTypeUse();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
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
		public ExtendsStatementContext extendsStatement() {
			return getRuleContext(ExtendsStatementContext.class,0);
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
		enterRule(_localctx, 34, RULE_genericTypeUse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			genericTypeName();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(468);
				extendsStatement();
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
	public static class ExtendsStatementContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(KatLanParser.EXTENDS, 0); }
		public AnyTypeContext anyType() {
			return getRuleContext(AnyTypeContext.class,0);
		}
		public ExtendsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).enterExtendsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KatLanListener ) ((KatLanListener)listener).exitExtendsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KatLanVisitor ) return ((KatLanVisitor<? extends T>)visitor).visitExtendsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsStatementContext extendsStatement() throws RecognitionException {
		ExtendsStatementContext _localctx = new ExtendsStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_extendsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(EXTENDS);
			setState(472);
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
		enterRule(_localctx, 38, RULE_varAssignment);
		try {
			int _alt;
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(474);
						annotationCall();
						}
						} 
					}
					setState(479);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				{
				setState(480);
				varAccess();
				setState(481);
				match(T__5);
				setState(482);
				value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
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
		enterRule(_localctx, 40, RULE_varAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(487);
				annotationCall();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			match(NAME0);
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(494);
				match(T__6);
				setState(495);
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
		enterRule(_localctx, 42, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			varAccess();
			setState(500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(499);
				arrayAccess0();
				}
				}
				setState(502); 
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
		enterRule(_localctx, 44, RULE_arrayAccess0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(504);
			match(T__7);
			setState(505);
			arithmeticExpression();
			setState(506);
			match(T__8);
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
		enterRule(_localctx, 46, RULE_methodDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(508);
				annotationCall();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
			access();
			setState(515);
			methodModifier();
			setState(516);
			match(T__9);
			setState(517);
			name();
			setState(518);
			match(T__10);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25 || _la==NAME0) {
				{
				setState(519);
				parameters();
				}
			}

			setState(522);
			match(T__11);
			setState(523);
			match(COLON);
			setState(524);
			type();
			setState(525);
			match(T__3);
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(526);
					match(ENDLINE);
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(532);
			block();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(533);
				match(ENDLINE);
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(539);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 48, RULE_constructorDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(541);
				annotationCall();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			access();
			setState(548);
			match(T__12);
			setState(549);
			name();
			setState(550);
			match(T__10);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25 || _la==NAME0) {
				{
				setState(551);
				parameters();
				}
			}

			setState(554);
			match(T__11);
			setState(555);
			match(T__3);
			setState(559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(556);
					match(ENDLINE);
					}
					} 
				}
				setState(561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(562);
			block();
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(563);
				match(ENDLINE);
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(569);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 50, RULE_operatorOverDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(571);
				annotationCall();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577);
			match(OP_OV_MOD);
			setState(578);
			operator();
			setState(579);
			match(T__10);
			setState(580);
			parameter();
			setState(581);
			match(T__11);
			setState(582);
			match(T__3);
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(583);
					match(ENDLINE);
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(589);
			block();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(590);
				match(ENDLINE);
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 52, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(598);
			parameter();
			}
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(599);
				match(T__2);
				setState(600);
				parameter();
				}
				}
				setState(605);
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
		enterRule(_localctx, 54, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(606);
				annotationCall();
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
			name();
			setState(613);
			match(COLON);
			setState(614);
			type();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(615);
				match(T__5);
				setState(616);
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
		enterRule(_localctx, 56, RULE_var);
		try {
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
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
		enterRule(_localctx, 58, RULE_constDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			access();
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(624);
				constDef0();
				}
				break;
			case 2:
				{
				setState(625);
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
		enterRule(_localctx, 60, RULE_constDef0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(628);
				annotationCall();
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(634);
			match(T__13);
			setState(635);
			name();
			setState(636);
			match(COLON);
			setState(637);
			type();
			setState(638);
			match(T__5);
			setState(639);
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
		enterRule(_localctx, 62, RULE_constDef1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(641);
				annotationCall();
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(647);
			match(T__13);
			{
			setState(648);
			name();
			setState(649);
			match(T__5);
			setState(650);
			value();
			}
			setState(657); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(652);
				match(T__2);
				setState(653);
				name();
				setState(654);
				match(T__5);
				setState(655);
				value();
				}
				}
				setState(659); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(661);
			match(COLON);
			setState(662);
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
		enterRule(_localctx, 64, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			access();
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(665);
				varDef0();
				}
				break;
			case 2:
				{
				setState(666);
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
		enterRule(_localctx, 66, RULE_varDef0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(669);
				annotationCall();
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
			match(T__14);
			setState(676);
			name();
			setState(677);
			match(COLON);
			setState(678);
			type();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(679);
				match(T__5);
				setState(680);
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
		enterRule(_localctx, 68, RULE_varDef1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(683);
				annotationCall();
				}
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(689);
			match(T__14);
			setState(690);
			subVD1();
			setState(693); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(691);
				match(T__2);
				setState(692);
				subVD1();
				}
				}
				setState(695); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(697);
			match(COLON);
			setState(698);
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
		enterRule(_localctx, 70, RULE_subVD1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			name();
			{
			setState(701);
			match(T__5);
			setState(702);
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
		enterRule(_localctx, 72, RULE_statement);
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				switchStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				foriLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(707);
				foriLoop0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(708);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(709);
				whileLoopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(710);
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
		enterRule(_localctx, 74, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(T__15);
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 108200736038332416L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1966081L) != 0)) {
				{
				setState(714);
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
		enterRule(_localctx, 76, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(SWITCH_KEYWORD);
			setState(718);
			match(T__10);
			setState(719);
			value();
			setState(720);
			match(T__11);
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
			match(T__3);
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(728);
				match(ENDLINE);
				}
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(735); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(734);
				subSwitch0();
				}
				}
				setState(737); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 108200736038463488L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1966081L) != 0) );
			setState(739);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 78, RULE_subSwitch0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__12:
			case T__25:
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
				setState(741);
				value();
				}
				break;
			case T__16:
				{
				setState(742);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(745);
			match(T__17);
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				{
				setState(746);
				match(T__3);
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(747);
						match(ENDLINE);
						}
						} 
					}
					setState(752);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				setState(753);
				block();
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(754);
					match(ENDLINE);
					}
					}
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(760);
				match(T__4);
				}
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__18:
			case T__21:
			case T__25:
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
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(762);
					match(ENDLINE);
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(768);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(771);
				match(ENDLINE);
				}
				}
				setState(776);
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
		enterRule(_localctx, 80, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(T__18);
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(778);
				varAssignment();
				}
				break;
			}
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				{
				setState(781);
				match(T__3);
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(782);
						match(ENDLINE);
						}
						} 
					}
					setState(787);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				setState(788);
				block();
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(789);
					match(ENDLINE);
					}
					}
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(795);
				match(T__4);
				}
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__18:
			case T__21:
			case T__25:
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
				setState(797);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(800);
				match(ENDLINE);
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
			match(T__19);
			setState(807);
			match(T__10);
			setState(808);
			parameter();
			setState(809);
			match(T__11);
			setState(827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				{
				setState(810);
				match(T__3);
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(811);
						match(ENDLINE);
						}
						} 
					}
					setState(816);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				setState(817);
				block();
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(818);
					match(ENDLINE);
					}
					}
					setState(823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(824);
				match(T__4);
				}
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__18:
			case T__21:
			case T__25:
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
				setState(826);
				lineBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(832);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(829);
					match(ENDLINE);
					}
					} 
				}
				setState(834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(835);
				match(T__20);
				setState(853);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					{
					setState(836);
					match(T__3);
					setState(840);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(837);
							match(ENDLINE);
							}
							} 
						}
						setState(842);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					}
					setState(843);
					block();
					setState(847);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ENDLINE) {
						{
						{
						setState(844);
						match(ENDLINE);
						}
						}
						setState(849);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(850);
					match(T__4);
					}
					}
					break;
				case T__13:
				case T__14:
				case T__15:
				case T__18:
				case T__21:
				case T__25:
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
					setState(852);
					lineBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(855);
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
		enterRule(_localctx, 82, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(IF_KEYWORD);
			setState(860);
			match(T__10);
			setState(861);
			expression();
			setState(862);
			match(T__11);
			setState(863);
			ifStatement0();
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KEYWORD) {
				{
				setState(864);
				match(ELSE_KEYWORD);
				setState(865);
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
		enterRule(_localctx, 84, RULE_ifStatement0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(868);
				match(ENDLINE);
				}
				}
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				{
				setState(874);
				match(T__3);
				setState(878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(875);
						match(ENDLINE);
						}
						} 
					}
					setState(880);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				setState(881);
				block();
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(882);
					match(ENDLINE);
					}
					}
					setState(887);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(888);
				match(T__4);
				}
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__18:
			case T__21:
			case T__25:
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
				setState(890);
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
		enterRule(_localctx, 86, RULE_whileLoopStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(T__21);
			setState(894);
			match(T__10);
			setState(895);
			expression();
			setState(896);
			match(T__11);
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(897);
				match(ENDLINE);
				}
				}
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				{
				setState(903);
				match(T__3);
				setState(907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(904);
						match(ENDLINE);
						}
						} 
					}
					setState(909);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				setState(910);
				block();
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(911);
					match(ENDLINE);
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(917);
				match(T__4);
				}
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__18:
			case T__21:
			case T__25:
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
				setState(919);
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
		enterRule(_localctx, 88, RULE_forEachLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(FOR_KEYWORD);
			setState(923);
			match(T__10);
			setState(924);
			varDef();
			setState(925);
			match(T__22);
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(926);
				varAccess();
				}
				break;
			case 2:
				{
				setState(927);
				value();
				}
				break;
			}
			setState(930);
			match(T__11);
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(931);
				match(ENDLINE);
				}
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				{
				setState(937);
				match(T__3);
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(938);
					match(ENDLINE);
					}
					}
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(944);
				block();
				setState(945);
				match(T__4);
				}
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__18:
			case T__21:
			case T__25:
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
				setState(947);
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
		enterRule(_localctx, 90, RULE_foriLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(FOR_KEYWORD);
			setState(951);
			match(T__10);
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902897179262976L) != 0)) {
				{
				setState(952);
				varDef();
				}
			}

			setState(955);
			match(ENDLINE);
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 108191944240277504L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 917505L) != 0)) {
				{
				setState(956);
				expression();
				}
			}

			setState(959);
			match(ENDLINE);
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 144115188077428737L) != 0)) {
				{
				setState(960);
				varAssignment();
				}
			}

			setState(963);
			match(T__11);
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(964);
				match(ENDLINE);
				}
				}
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				{
				setState(970);
				match(T__3);
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(971);
					match(ENDLINE);
					}
					}
					setState(976);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(977);
				block();
				setState(978);
				match(T__4);
				}
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__18:
			case T__21:
			case T__25:
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
				setState(980);
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
		enterRule(_localctx, 92, RULE_foriLoop0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(FOR_KEYWORD);
			setState(984);
			match(T__10);
			setState(985);
			name();
			setState(986);
			match(COLON);
			setState(987);
			type();
			setState(988);
			match(T__2);
			setState(989);
			value();
			setState(990);
			match(T__23);
			setState(991);
			value();
			setState(992);
			match(T__11);
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(993);
				match(ENDLINE);
				}
				}
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1010);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				{
				setState(999);
				match(T__3);
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(1000);
					match(ENDLINE);
					}
					}
					setState(1005);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1006);
				block();
				setState(1007);
				match(T__4);
				}
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__18:
			case T__21:
			case T__25:
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
				setState(1009);
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
		enterRule(_localctx, 94, RULE_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) {
				{
				setState(1012);
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

			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(1015);
				match(STATIC);
				}
			}

			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(1018);
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
		enterRule(_localctx, 96, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT_KEYWORD:
				{
				setState(1021);
				match(ABSTRACT_KEYWORD);
				}
				break;
			case POST_MOD:
			case PRE_MOD:
				{
				setState(1022);
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
			case T__9:
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
		enterRule(_localctx, 98, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1117103813820416L) != 0)) ) {
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
		enterRule(_localctx, 100, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
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
				setState(1027);
				anyType();
				}
				break;
			case T__24:
				{
				setState(1028);
				linkType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(1031);
				match(T__7);
				setState(1032);
				match(T__8);
				}
				}
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NNULL_OP || _la==NULL_OP) {
				{
				setState(1038);
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
		enterRule(_localctx, 102, RULE_anyType);
		try {
			setState(1043);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
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
				setState(1042);
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
		enterRule(_localctx, 104, RULE_linkType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(T__24);
			setState(1050);
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
				setState(1046);
				anyType();
				}
				break;
			case CLASS_KEYWORD:
				{
				setState(1047);
				match(CLASS_KEYWORD);
				}
				break;
			case INTERFACE_KEYWORD:
				{
				setState(1048);
				match(INTERFACE_KEYWORD);
				}
				break;
			case ENUM_KEYWORD:
				{
				setState(1049);
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
		enterRule(_localctx, 106, RULE_primitiveType);
		try {
			setState(1062);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				match(STR);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				match(BOOL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1054);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1055);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1056);
				match(DOUBLE);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1057);
				match(LONG);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1058);
				match(SHORT);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1059);
				match(BYTE);
				}
				break;
			case OBJ:
				enterOuterAlt(_localctx, 9);
				{
				setState(1060);
				match(OBJ);
				}
				break;
			case VOID:
			case NULL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1061);
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
		enterRule(_localctx, 108, RULE_nullType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
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
		enterRule(_localctx, 110, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			argument();
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1067);
				match(T__2);
				setState(1068);
				argument();
				}
				}
				setState(1073);
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
		enterRule(_localctx, 112, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
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
		enterRule(_localctx, 114, RULE_methodCall0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1076);
					annotationCall();
					}
					} 
				}
				setState(1081);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1082);
				varAccess();
				setState(1083);
				match(T__6);
				}
				break;
			}
			setState(1087);
			match(NAME0);
			setState(1088);
			match(T__10);
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 108200736038332416L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1966081L) != 0)) {
				{
				setState(1089);
				arguments();
				}
			}

			setState(1092);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 116, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			methodCall0();
			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1095);
				match(T__6);
				setState(1096);
				methodCall0();
				}
				}
				setState(1101);
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
		enterRule(_localctx, 118, RULE_annotationCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			match(T__25);
			setState(1103);
			name();
			setState(1108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(1104);
				match(T__10);
				setState(1105);
				arguments();
				setState(1106);
				match(T__11);
				}
			}

			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(1110);
				match(ENDLINE);
				}
				}
				setState(1115);
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
		enterRule(_localctx, 120, RULE_constructorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			match(T__12);
			setState(1117);
			name();
			setState(1118);
			match(T__10);
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 108200736038332416L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1966081L) != 0)) {
				{
				setState(1119);
				arguments();
				}
			}

			setState(1122);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 122, RULE_expression);
		try {
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1124);
				primaryExpresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1125);
				logicalOr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1126);
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
		enterRule(_localctx, 124, RULE_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1129);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(1130);
				logicalAnd();
				}
				break;
			}
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(1133);
				match(OR);
				setState(1137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1134);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(1135);
					logicalAnd();
					}
					break;
				case 3:
					{
					setState(1136);
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
		enterRule(_localctx, 126, RULE_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1141);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(1142);
				logicalXor();
				}
				break;
			}
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1145);
				match(AND);
				setState(1149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1146);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(1147);
					logicalXor();
					}
					break;
				case 3:
					{
					setState(1148);
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
		enterRule(_localctx, 128, RULE_logicalXor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1153);
				primaryExpresion();
				}
				break;
			case 2:
				{
				setState(1154);
				logicalNot();
				}
				break;
			}
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XOR) {
				{
				setState(1157);
				match(XOR);
				setState(1161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1158);
					primaryExpresion();
					}
					break;
				case 2:
					{
					setState(1159);
					logicalNot();
					}
					break;
				case 3:
					{
					setState(1160);
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
		enterRule(_localctx, 130, RULE_logicalNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1165);
				match(NOT);
				}
			}

			setState(1168);
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
		enterRule(_localctx, 132, RULE_primaryExpresion);
		try {
			setState(1180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1170);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1171);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1172);
				varAccess();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1173);
				name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1174);
				match(T__10);
				setState(1175);
				expression();
				setState(1176);
				match(T__11);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1178);
				constructorCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1179);
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
		enterRule(_localctx, 134, RULE_arithCondExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			arithmeticExpression();
			setState(1183);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 119L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1184);
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
		enterRule(_localctx, 136, RULE_arithmeticExpression);
		try {
			setState(1188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				numberExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1187);
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
		enterRule(_localctx, 138, RULE_addSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			modDivExpression();
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1191);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1192);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(1193);
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
		enterRule(_localctx, 140, RULE_modDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			mulDivExpression();
			setState(1204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIV || _la==MOD) {
				{
				setState(1199);
				_la = _input.LA(1);
				if ( !(_la==DIV || _la==MOD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1200);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(1201);
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
		enterRule(_localctx, 142, RULE_mulDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			powerExpression();
			setState(1212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLY || _la==DIVIDE) {
				{
				setState(1207);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1208);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(1209);
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
		enterRule(_localctx, 144, RULE_powerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			numberExpression();
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(1215);
				match(POWER);
				setState(1218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1216);
					numberExpression();
					}
					break;
				case 2:
					{
					setState(1217);
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
		enterRule(_localctx, 146, RULE_numberExpression);
		int _la;
		try {
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1222);
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

				setState(1232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1225);
					methodCall();
					}
					break;
				case 2:
					{
					setState(1226);
					name();
					}
					break;
				case 3:
					{
					setState(1227);
					numeric_value();
					}
					break;
				case 4:
					{
					{
					setState(1228);
					match(T__10);
					setState(1229);
					arithmeticExpression();
					setState(1230);
					match(T__11);
					}
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
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
		enterRule(_localctx, 148, RULE_incrExpression);
		try {
			setState(1257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1241);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(1237);
					match(PLUS);
					setState(1238);
					match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(1239);
					match(MINUS);
					setState(1240);
					match(MINUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1243);
					name();
					}
					break;
				case 2:
					{
					setState(1244);
					varAccess();
					}
					break;
				}
				}
				}
				break;
			case T__25:
			case NAME0:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1247);
					name();
					}
					break;
				case 2:
					{
					setState(1248);
					varAccess();
					}
					break;
				}
				setState(1255);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(1251);
					match(PLUS);
					setState(1252);
					match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(1253);
					match(MINUS);
					setState(1254);
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
		enterRule(_localctx, 150, RULE_name);
		try {
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259);
				dot_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
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
		enterRule(_localctx, 152, RULE_dot_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(NAME0);
			setState(1266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1264);
				match(T__6);
				setState(1265);
				match(NAME0);
				}
				}
				setState(1268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 154, RULE_numeric_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
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
		"\u0004\u0001W\u04f9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0001\u0000\u0005\u0000\u009e\b\u0000"+
		"\n\u0000\f\u0000\u00a1\t\u0000\u0001\u0000\u0003\u0000\u00a4\b\u0000\u0001"+
		"\u0000\u0003\u0000\u00a7\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u00ad\b\u0000\u0001\u0000\u0005\u0000\u00b0\b\u0000"+
		"\n\u0000\f\u0000\u00b3\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001\u00b8\b\u0001\u000b\u0001\f\u0001\u00b9\u0001\u0002\u0004\u0002"+
		"\u00bd\b\u0002\u000b\u0002\f\u0002\u00be\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00c5\b\u0003\u0001\u0003\u0004\u0003\u00c8"+
		"\b\u0003\u000b\u0003\f\u0003\u00c9\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00d0\b\u0004\n\u0004\f\u0004\u00d3\t\u0004\u0001"+
		"\u0004\u0004\u0004\u00d6\b\u0004\u000b\u0004\f\u0004\u00d7\u0003\u0004"+
		"\u00da\b\u0004\u0001\u0004\u0003\u0004\u00dd\b\u0004\u0001\u0004\u0004"+
		"\u0004\u00e0\b\u0004\u000b\u0004\f\u0004\u00e1\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u00e6\b\u0004\n\u0004\f\u0004\u00e9\t\u0004\u0001\u0004\u0003"+
		"\u0004\u00ec\b\u0004\u0001\u0004\u0005\u0004\u00ef\b\u0004\n\u0004\f\u0004"+
		"\u00f2\t\u0004\u0001\u0004\u0003\u0004\u00f5\b\u0004\u0001\u0004\u0004"+
		"\u0004\u00f8\b\u0004\u000b\u0004\f\u0004\u00f9\u0001\u0004\u0003\u0004"+
		"\u00fd\b\u0004\u0001\u0005\u0005\u0005\u0100\b\u0005\n\u0005\f\u0005\u0103"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0107\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u010b\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u0112\b\u0005\n\u0005\f\u0005\u0115"+
		"\t\u0005\u0003\u0005\u0117\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u011b\b\u0005\n\u0005\f\u0005\u011e\t\u0005\u0001\u0005\u0003\u0005\u0121"+
		"\b\u0005\u0001\u0005\u0005\u0005\u0124\b\u0005\n\u0005\f\u0005\u0127\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0005\u0006\u012c\b\u0006\n"+
		"\u0006\f\u0006\u012f\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0138\b\u0006\n"+
		"\u0006\f\u0006\u013b\t\u0006\u0003\u0006\u013d\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0141\b\u0006\n\u0006\f\u0006\u0144\t\u0006\u0001\u0006"+
		"\u0003\u0006\u0147\b\u0006\u0001\u0006\u0005\u0006\u014a\b\u0006\n\u0006"+
		"\f\u0006\u014d\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0005\u0007"+
		"\u0152\b\u0007\n\u0007\f\u0007\u0155\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u015e"+
		"\b\u0007\n\u0007\f\u0007\u0161\t\u0007\u0003\u0007\u0163\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0167\b\u0007\n\u0007\f\u0007\u016a\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u016e\b\u0007\n\u0007\f\u0007\u0171"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u017a\b\b\u0001\b\u0004\b\u017d\b\b\u000b\b\f\b\u017e\u0004"+
		"\b\u0181\b\b\u000b\b\f\b\u0182\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u018c\b\t\u0001\t\u0004\t\u018f\b\t\u000b\t\f"+
		"\t\u0190\u0004\t\u0193\b\t\u000b\t\f\t\u0194\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u019b\b\n\u0001\n\u0004\n\u019e\b\n\u000b\n\f\n\u019f\u0004"+
		"\n\u01a2\b\n\u000b\n\f\n\u01a3\u0001\u000b\u0005\u000b\u01a7\b\u000b\n"+
		"\u000b\f\u000b\u01aa\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u01b0"+
		"\b\f\u0001\f\u0004\f\u01b3\b\f\u000b\f\f\f\u01b4\u0001\f\u0003\f\u01b8"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u01c1"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u01c7"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u01cd"+
		"\b\u0010\n\u0010\f\u0010\u01d0\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u01d6\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0005\u0013\u01dc\b\u0013\n\u0013\f\u0013\u01df\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01e6"+
		"\b\u0013\u0001\u0014\u0005\u0014\u01e9\b\u0014\n\u0014\f\u0014\u01ec\t"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01f1\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0004\u0015\u01f5\b\u0015\u000b\u0015\f\u0015\u01f6"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0005\u0017"+
		"\u01fe\b\u0017\n\u0017\f\u0017\u0201\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0209\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0210"+
		"\b\u0017\n\u0017\f\u0017\u0213\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0217\b\u0017\n\u0017\f\u0017\u021a\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0005\u0018\u021f\b\u0018\n\u0018\f\u0018\u0222\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0229\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u022e\b\u0018\n\u0018"+
		"\f\u0018\u0231\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0235\b\u0018"+
		"\n\u0018\f\u0018\u0238\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0005"+
		"\u0019\u023d\b\u0019\n\u0019\f\u0019\u0240\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0249\b\u0019\n\u0019\f\u0019\u024c\t\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0250\b\u0019\n\u0019\f\u0019\u0253\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u025a\b\u001a\n\u001a"+
		"\f\u001a\u025d\t\u001a\u0001\u001b\u0005\u001b\u0260\b\u001b\n\u001b\f"+
		"\u001b\u0263\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u026a\b\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u026e"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0273\b\u001d"+
		"\u0001\u001e\u0005\u001e\u0276\b\u001e\n\u001e\f\u001e\u0279\t\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0005\u001f\u0283\b\u001f\n\u001f\f\u001f\u0286\t\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u0292\b\u001f"+
		"\u000b\u001f\f\u001f\u0293\u0001\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0001 \u0001 \u0003 \u029c\b \u0001!\u0005!\u029f\b!\n!\f!\u02a2\t!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u02aa\b!\u0001\"\u0005\"\u02ad"+
		"\b\"\n\"\f\"\u02b0\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0004\"\u02b6\b"+
		"\"\u000b\"\f\"\u02b7\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u02c8\b$\u0001"+
		"%\u0001%\u0003%\u02cc\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u02d3"+
		"\b&\n&\f&\u02d6\t&\u0001&\u0001&\u0005&\u02da\b&\n&\f&\u02dd\t&\u0001"+
		"&\u0004&\u02e0\b&\u000b&\f&\u02e1\u0001&\u0001&\u0001\'\u0001\'\u0003"+
		"\'\u02e8\b\'\u0001\'\u0001\'\u0001\'\u0005\'\u02ed\b\'\n\'\f\'\u02f0\t"+
		"\'\u0001\'\u0001\'\u0005\'\u02f4\b\'\n\'\f\'\u02f7\t\'\u0001\'\u0001\'"+
		"\u0001\'\u0005\'\u02fc\b\'\n\'\f\'\u02ff\t\'\u0001\'\u0003\'\u0302\b\'"+
		"\u0001\'\u0005\'\u0305\b\'\n\'\f\'\u0308\t\'\u0001(\u0001(\u0003(\u030c"+
		"\b(\u0001(\u0001(\u0005(\u0310\b(\n(\f(\u0313\t(\u0001(\u0001(\u0005("+
		"\u0317\b(\n(\f(\u031a\t(\u0001(\u0001(\u0001(\u0003(\u031f\b(\u0001(\u0005"+
		"(\u0322\b(\n(\f(\u0325\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005"+
		"(\u032d\b(\n(\f(\u0330\t(\u0001(\u0001(\u0005(\u0334\b(\n(\f(\u0337\t"+
		"(\u0001(\u0001(\u0001(\u0003(\u033c\b(\u0001(\u0005(\u033f\b(\n(\f(\u0342"+
		"\t(\u0001(\u0001(\u0001(\u0005(\u0347\b(\n(\f(\u034a\t(\u0001(\u0001("+
		"\u0005(\u034e\b(\n(\f(\u0351\t(\u0001(\u0001(\u0001(\u0003(\u0356\b(\u0001"+
		"(\u0001(\u0003(\u035a\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u0363\b)\u0001*\u0005*\u0366\b*\n*\f*\u0369\t*\u0001*\u0001*"+
		"\u0005*\u036d\b*\n*\f*\u0370\t*\u0001*\u0001*\u0005*\u0374\b*\n*\f*\u0377"+
		"\t*\u0001*\u0001*\u0001*\u0003*\u037c\b*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0005+\u0383\b+\n+\f+\u0386\t+\u0001+\u0001+\u0005+\u038a\b+\n+\f+\u038d"+
		"\t+\u0001+\u0001+\u0005+\u0391\b+\n+\f+\u0394\t+\u0001+\u0001+\u0001+"+
		"\u0003+\u0399\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u03a1"+
		"\b,\u0001,\u0001,\u0005,\u03a5\b,\n,\f,\u03a8\t,\u0001,\u0001,\u0005,"+
		"\u03ac\b,\n,\f,\u03af\t,\u0001,\u0001,\u0001,\u0001,\u0003,\u03b5\b,\u0001"+
		"-\u0001-\u0001-\u0003-\u03ba\b-\u0001-\u0001-\u0003-\u03be\b-\u0001-\u0001"+
		"-\u0003-\u03c2\b-\u0001-\u0001-\u0005-\u03c6\b-\n-\f-\u03c9\t-\u0001-"+
		"\u0001-\u0005-\u03cd\b-\n-\f-\u03d0\t-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u03d6\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0005.\u03e3\b.\n.\f.\u03e6\t.\u0001.\u0001.\u0005.\u03ea"+
		"\b.\n.\f.\u03ed\t.\u0001.\u0001.\u0001.\u0001.\u0003.\u03f3\b.\u0001/"+
		"\u0003/\u03f6\b/\u0001/\u0003/\u03f9\b/\u0001/\u0003/\u03fc\b/\u00010"+
		"\u00010\u00030\u0400\b0\u00011\u00011\u00012\u00012\u00032\u0406\b2\u0001"+
		"2\u00012\u00052\u040a\b2\n2\f2\u040d\t2\u00012\u00032\u0410\b2\u00013"+
		"\u00013\u00033\u0414\b3\u00014\u00014\u00014\u00014\u00014\u00034\u041b"+
		"\b4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00035\u0427\b5\u00016\u00016\u00017\u00017\u00017\u00057\u042e\b7\n"+
		"7\f7\u0431\t7\u00018\u00018\u00019\u00059\u0436\b9\n9\f9\u0439\t9\u0001"+
		"9\u00019\u00019\u00039\u043e\b9\u00019\u00019\u00019\u00039\u0443\b9\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0005:\u044a\b:\n:\f:\u044d\t:\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u0455\b;\u0001;\u0005;\u0458\b;\n"+
		";\f;\u045b\t;\u0001<\u0001<\u0001<\u0001<\u0003<\u0461\b<\u0001<\u0001"+
		"<\u0001=\u0001=\u0001=\u0003=\u0468\b=\u0001>\u0001>\u0003>\u046c\b>\u0001"+
		">\u0001>\u0001>\u0001>\u0003>\u0472\b>\u0003>\u0474\b>\u0001?\u0001?\u0003"+
		"?\u0478\b?\u0001?\u0001?\u0001?\u0001?\u0003?\u047e\b?\u0003?\u0480\b"+
		"?\u0001@\u0001@\u0003@\u0484\b@\u0001@\u0001@\u0001@\u0001@\u0003@\u048a"+
		"\b@\u0003@\u048c\b@\u0001A\u0003A\u048f\bA\u0001A\u0001A\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u049d"+
		"\bB\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0003D\u04a5\bD\u0001E\u0001"+
		"E\u0001E\u0001E\u0003E\u04ab\bE\u0003E\u04ad\bE\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u04b3\bF\u0003F\u04b5\bF\u0001G\u0001G\u0001G\u0001G\u0003G\u04bb"+
		"\bG\u0003G\u04bd\bG\u0001H\u0001H\u0001H\u0001H\u0003H\u04c3\bH\u0003"+
		"H\u04c5\bH\u0001I\u0003I\u04c8\bI\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0003I\u04d1\bI\u0001I\u0003I\u04d4\bI\u0001J\u0001J\u0001J\u0001"+
		"J\u0003J\u04da\bJ\u0001J\u0001J\u0003J\u04de\bJ\u0001J\u0001J\u0003J\u04e2"+
		"\bJ\u0001J\u0001J\u0001J\u0001J\u0003J\u04e8\bJ\u0003J\u04ea\bJ\u0001"+
		"K\u0001K\u0003K\u04ee\bK\u0001L\u0001L\u0001L\u0004L\u04f3\bL\u000bL\f"+
		"L\u04f4\u0001M\u0001M\u0001M\u0000\u0000N\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u0000\u000b\u0001\u0000"+
		"78\u0001\u000024\u0001\u00009:\u0001\u0000+1\u0001\u0000<=\u0001\u0000"+
		")*\u0002\u0000BDFH\u0001\u0000-.\u0001\u0000+,\u0001\u0000/0\u0001\u0000"+
		"QR\u058c\u0000\u009f\u0001\u0000\u0000\u0000\u0002\u00b4\u0001\u0000\u0000"+
		"\u0000\u0004\u00bc\u0001\u0000\u0000\u0000\u0006\u00c0\u0001\u0000\u0000"+
		"\u0000\b\u00d9\u0001\u0000\u0000\u0000\n\u0101\u0001\u0000\u0000\u0000"+
		"\f\u012d\u0001\u0000\u0000\u0000\u000e\u0153\u0001\u0000\u0000\u0000\u0010"+
		"\u0180\u0001\u0000\u0000\u0000\u0012\u0192\u0001\u0000\u0000\u0000\u0014"+
		"\u01a1\u0001\u0000\u0000\u0000\u0016\u01a8\u0001\u0000\u0000\u0000\u0018"+
		"\u01af\u0001\u0000\u0000\u0000\u001a\u01c0\u0001\u0000\u0000\u0000\u001c"+
		"\u01c2\u0001\u0000\u0000\u0000\u001e\u01c6\u0001\u0000\u0000\u0000 \u01c8"+
		"\u0001\u0000\u0000\u0000\"\u01d3\u0001\u0000\u0000\u0000$\u01d7\u0001"+
		"\u0000\u0000\u0000&\u01e5\u0001\u0000\u0000\u0000(\u01ea\u0001\u0000\u0000"+
		"\u0000*\u01f2\u0001\u0000\u0000\u0000,\u01f8\u0001\u0000\u0000\u0000."+
		"\u01ff\u0001\u0000\u0000\u00000\u0220\u0001\u0000\u0000\u00002\u023e\u0001"+
		"\u0000\u0000\u00004\u0256\u0001\u0000\u0000\u00006\u0261\u0001\u0000\u0000"+
		"\u00008\u026d\u0001\u0000\u0000\u0000:\u026f\u0001\u0000\u0000\u0000<"+
		"\u0277\u0001\u0000\u0000\u0000>\u0284\u0001\u0000\u0000\u0000@\u0298\u0001"+
		"\u0000\u0000\u0000B\u02a0\u0001\u0000\u0000\u0000D\u02ae\u0001\u0000\u0000"+
		"\u0000F\u02bc\u0001\u0000\u0000\u0000H\u02c7\u0001\u0000\u0000\u0000J"+
		"\u02c9\u0001\u0000\u0000\u0000L\u02cd\u0001\u0000\u0000\u0000N\u02e7\u0001"+
		"\u0000\u0000\u0000P\u0309\u0001\u0000\u0000\u0000R\u035b\u0001\u0000\u0000"+
		"\u0000T\u0367\u0001\u0000\u0000\u0000V\u037d\u0001\u0000\u0000\u0000X"+
		"\u039a\u0001\u0000\u0000\u0000Z\u03b6\u0001\u0000\u0000\u0000\\\u03d7"+
		"\u0001\u0000\u0000\u0000^\u03f5\u0001\u0000\u0000\u0000`\u03ff\u0001\u0000"+
		"\u0000\u0000b\u0401\u0001\u0000\u0000\u0000d\u0405\u0001\u0000\u0000\u0000"+
		"f\u0413\u0001\u0000\u0000\u0000h\u0415\u0001\u0000\u0000\u0000j\u0426"+
		"\u0001\u0000\u0000\u0000l\u0428\u0001\u0000\u0000\u0000n\u042a\u0001\u0000"+
		"\u0000\u0000p\u0432\u0001\u0000\u0000\u0000r\u0437\u0001\u0000\u0000\u0000"+
		"t\u0446\u0001\u0000\u0000\u0000v\u044e\u0001\u0000\u0000\u0000x\u045c"+
		"\u0001\u0000\u0000\u0000z\u0467\u0001\u0000\u0000\u0000|\u046b\u0001\u0000"+
		"\u0000\u0000~\u0477\u0001\u0000\u0000\u0000\u0080\u0483\u0001\u0000\u0000"+
		"\u0000\u0082\u048e\u0001\u0000\u0000\u0000\u0084\u049c\u0001\u0000\u0000"+
		"\u0000\u0086\u049e\u0001\u0000\u0000\u0000\u0088\u04a4\u0001\u0000\u0000"+
		"\u0000\u008a\u04a6\u0001\u0000\u0000\u0000\u008c\u04ae\u0001\u0000\u0000"+
		"\u0000\u008e\u04b6\u0001\u0000\u0000\u0000\u0090\u04be\u0001\u0000\u0000"+
		"\u0000\u0092\u04d3\u0001\u0000\u0000\u0000\u0094\u04e9\u0001\u0000\u0000"+
		"\u0000\u0096\u04ed\u0001\u0000\u0000\u0000\u0098\u04ef\u0001\u0000\u0000"+
		"\u0000\u009a\u04f6\u0001\u0000\u0000\u0000\u009c\u009e\u0005U\u0000\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a4\u0003\u0002\u0001\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0003\u0004\u0002\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00ac\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ad\u0003\n\u0005\u0000\u00a9\u00ad\u0003\f\u0006\u0000\u00aa"+
		"\u00ad\u0003\b\u0004\u0000\u00ab\u00ad\u0003\u000e\u0007\u0000\u00ac\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b1"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005U\u0000\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u0001\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"\u0001\u0000\u0000\u00b5\u00b7\u0003\u0096K\u0000\u00b6\u00b8\u0005U\u0000"+
		"\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u0003\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003\u0006\u0003"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u0005\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0002\u0000"+
		"\u0000\u00c1\u00c4\u0003\u0096K\u0000\u00c2\u00c3\u0005\u001b\u0000\u0000"+
		"\u00c3\u00c5\u0003\u0096K\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c8\u0005U\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ca\u0007\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005K\u0000\u0000\u00cc\u00d1\u0003\u0096K\u0000\u00cd\u00ce\u0005\u0003"+
		"\u0000\u0000\u00ce\u00d0\u0003\u0096K\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d6\u0005U\u0000\u0000"+
		"\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00cb\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000"+
		"\u00db\u00dd\u0003\u0010\b\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de"+
		"\u00e0\u0005U\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u00f4\u0001\u0000\u0000\u0000\u00e3\u00e7"+
		"\u0005\u0004\u0000\u0000\u00e4\u00e6\u0005U\u0000\u0000\u00e5\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003"+
		"\u0012\t\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00f0\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005U\u0000"+
		"\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f5\u0005\u0005\u0000\u0000\u00f4\u00e3\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f8\u0005U\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fd\u0003\u0010\b\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\t\u0001\u0000\u0000\u0000\u00fe\u0100"+
		"\u0003v;\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0104\u010a\u0003^/\u0000\u0105\u0107\u0005M\u0000\u0000"+
		"\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010b\u0005L\u0000\u0000\u0109"+
		"\u010b\u0005P\u0000\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0116"+
		"\u0003\u0096K\u0000\u010d\u010e\u0005K\u0000\u0000\u010e\u0113\u0003\u0096"+
		"K\u0000\u010f\u0110\u0005\u0003\u0000\u0000\u0110\u0112\u0003\u0096K\u0000"+
		"\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000"+
		"\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000"+
		"\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0116\u010d\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011c\u0005\u0004\u0000\u0000"+
		"\u0119\u011b\u0005U\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b"+
		"\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e"+
		"\u011c\u0001\u0000\u0000\u0000\u011f\u0121\u0003\u0012\t\u0000\u0120\u011f"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0125"+
		"\u0001\u0000\u0000\u0000\u0122\u0124\u0005U\u0000\u0000\u0123\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0128\u0001"+
		"\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u0129\u0005"+
		"\u0005\u0000\u0000\u0129\u000b\u0001\u0000\u0000\u0000\u012a\u012c\u0003"+
		"v;\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0003^/\u0000\u0131\u0132\u0005N\u0000\u0000\u0132"+
		"\u013c\u0003\u0096K\u0000\u0133\u0134\u0005K\u0000\u0000\u0134\u0139\u0003"+
		"\u0096K\u0000\u0135\u0136\u0005\u0003\u0000\u0000\u0136\u0138\u0003\u0096"+
		"K\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000"+
		"\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000"+
		"\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000"+
		"\u0000\u013c\u0133\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0142\u0005\u0004\u0000"+
		"\u0000\u013f\u0141\u0005U\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000"+
		"\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0147\u0003\u0012\t\u0000\u0146"+
		"\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u014b\u0001\u0000\u0000\u0000\u0148\u014a\u0005U\u0000\u0000\u0149\u0148"+
		"\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014e"+
		"\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0005\u0005\u0000\u0000\u014f\r\u0001\u0000\u0000\u0000\u0150\u0152\u0003"+
		"v;\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000"+
		"\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0003^/\u0000\u0157\u0158\u0005O\u0000\u0000\u0158"+
		"\u0162\u0003\u0096K\u0000\u0159\u015a\u0005K\u0000\u0000\u015a\u015f\u0003"+
		"\u0096K\u0000\u015b\u015c\u0005\u0003\u0000\u0000\u015c\u015e\u0003\u0096"+
		"K\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"+
		"\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0162\u0159\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0168\u0005\u0004\u0000"+
		"\u0000\u0165\u0167\u0005U\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000"+
		"\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000"+
		"\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016f\u0003\u0014\n\u0000\u016c"+
		"\u016e\u0005U\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u0171"+
		"\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0001\u0000\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u016f"+
		"\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0005\u0000\u0000\u0173\u000f"+
		"\u0001\u0000\u0000\u0000\u0174\u017a\u00038\u001c\u0000\u0175\u017a\u0003"+
		".\u0017\u0000\u0176\u017a\u0003\n\u0005\u0000\u0177\u017a\u0003\f\u0006"+
		"\u0000\u0178\u017a\u0003\u000e\u0007\u0000\u0179\u0174\u0001\u0000\u0000"+
		"\u0000\u0179\u0175\u0001\u0000\u0000\u0000\u0179\u0176\u0001\u0000\u0000"+
		"\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000"+
		"\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u017d\u0005U\u0000\u0000"+
		"\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000"+
		"\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000"+
		"\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u0179\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0011\u0001\u0000\u0000\u0000"+
		"\u0184\u018c\u00038\u001c\u0000\u0185\u018c\u0003.\u0017\u0000\u0186\u018c"+
		"\u00030\u0018\u0000\u0187\u018c\u00032\u0019\u0000\u0188\u018c\u0003\n"+
		"\u0005\u0000\u0189\u018c\u0003\f\u0006\u0000\u018a\u018c\u0003\u000e\u0007"+
		"\u0000\u018b\u0184\u0001\u0000\u0000\u0000\u018b\u0185\u0001\u0000\u0000"+
		"\u0000\u018b\u0186\u0001\u0000\u0000\u0000\u018b\u0187\u0001\u0000\u0000"+
		"\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000"+
		"\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018e\u0001\u0000\u0000"+
		"\u0000\u018d\u018f\u0005U\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000"+
		"\u0192\u018b\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000"+
		"\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195\u0013\u0001\u0000\u0000\u0000\u0196\u019b\u00038\u001c\u0000\u0197"+
		"\u019b\u0003.\u0017\u0000\u0198\u019b\u0003\n\u0005\u0000\u0199\u019b"+
		"\u0003\f\u0006\u0000\u019a\u0196\u0001\u0000\u0000\u0000\u019a\u0197\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u0199\u0001"+
		"\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u019e\u0005"+
		"U\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000"+
		"\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u019a\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u0015\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a7\u0003\u0018\f\u0000\u01a6\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u0017\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01b0\u00038\u001c\u0000"+
		"\u01ac\u01b0\u0003&\u0013\u0000\u01ad\u01b0\u0003t:\u0000\u01ae\u01b0"+
		"\u0003H$\u0000\u01af\u01ab\u0001\u0000\u0000\u0000\u01af\u01ac\u0001\u0000"+
		"\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b7\u0001\u0000\u0000\u0000\u01b1\u01b3\u0005U\u0000"+
		"\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b8\u0005\u0000\u0000"+
		"\u0001\u01b7\u01b2\u0001\u0000\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b8\u0019\u0001\u0000\u0000\u0000\u01b9\u01c1\u0003\u001c\u000e"+
		"\u0000\u01ba\u01c1\u0005T\u0000\u0000\u01bb\u01c1\u0003z=\u0000\u01bc"+
		"\u01c1\u0003\u0088D\u0000\u01bd\u01c1\u0003\u0096K\u0000\u01be\u01c1\u0003"+
		"f3\u0000\u01bf\u01c1\u0003*\u0015\u0000\u01c0\u01b9\u0001\u0000\u0000"+
		"\u0000\u01c0\u01ba\u0001\u0000\u0000\u0000\u01c0\u01bb\u0001\u0000\u0000"+
		"\u0000\u01c0\u01bc\u0001\u0000\u0000\u0000\u01c0\u01bd\u0001\u0000\u0000"+
		"\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c1\u001b\u0001\u0000\u0000\u0000\u01c2\u01c3\u0007\u0000\u0000"+
		"\u0000\u01c3\u001d\u0001\u0000\u0000\u0000\u01c4\u01c7\u0003\u0096K\u0000"+
		"\u01c5\u01c7\u0005I\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c7\u001f\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c9\u0005C\u0000\u0000\u01c9\u01ce\u0003\"\u0011\u0000\u01ca\u01cb"+
		"\u0005\u0003\u0000\u0000\u01cb\u01cd\u0003\"\u0011\u0000\u01cc\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005"+
		"B\u0000\u0000\u01d2!\u0001\u0000\u0000\u0000\u01d3\u01d5\u0003\u001e\u000f"+
		"\u0000\u01d4\u01d6\u0003$\u0012\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6#\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0005K\u0000\u0000\u01d8\u01d9\u0003f3\u0000\u01d9%\u0001\u0000"+
		"\u0000\u0000\u01da\u01dc\u0003v;\u0000\u01db\u01da\u0001\u0000\u0000\u0000"+
		"\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0001\u0000\u0000\u0000"+
		"\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e1\u0003(\u0014\u0000\u01e1"+
		"\u01e2\u0005\u0006\u0000\u0000\u01e2\u01e3\u0003\u001a\r\u0000\u01e3\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e6\u0003\u0094J\u0000\u01e5\u01dd\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6\'\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e9\u0003v;\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e9\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01f0\u0005S\u0000\u0000\u01ee"+
		"\u01ef\u0005\u0007\u0000\u0000\u01ef\u01f1\u0003(\u0014\u0000\u01f0\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1)\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f4\u0003(\u0014\u0000\u01f3\u01f5\u0003,\u0016"+
		"\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f7+\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005\b\u0000\u0000"+
		"\u01f9\u01fa\u0003\u0088D\u0000\u01fa\u01fb\u0005\t\u0000\u0000\u01fb"+
		"-\u0001\u0000\u0000\u0000\u01fc\u01fe\u0003v;\u0000\u01fd\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001"+
		"\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0202\u0001"+
		"\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u0203\u0003"+
		"^/\u0000\u0203\u0204\u0003`0\u0000\u0204\u0205\u0005\n\u0000\u0000\u0205"+
		"\u0206\u0003\u0096K\u0000\u0206\u0208\u0005\u000b\u0000\u0000\u0207\u0209"+
		"\u00034\u001a\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001"+
		"\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0005"+
		"\f\u0000\u0000\u020b\u020c\u0005J\u0000\u0000\u020c\u020d\u0003d2\u0000"+
		"\u020d\u0211\u0005\u0004\u0000\u0000\u020e\u0210\u0005U\u0000\u0000\u020f"+
		"\u020e\u0001\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211"+
		"\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212"+
		"\u0214\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214"+
		"\u0218\u0003\u0016\u000b\u0000\u0215\u0217\u0005U\u0000\u0000\u0216\u0215"+
		"\u0001\u0000\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218\u0216"+
		"\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021b"+
		"\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0005\u0005\u0000\u0000\u021c/\u0001\u0000\u0000\u0000\u021d\u021f\u0003"+
		"v;\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021f\u0222\u0001\u0000\u0000"+
		"\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000"+
		"\u0000\u0221\u0223\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000"+
		"\u0000\u0223\u0224\u0003^/\u0000\u0224\u0225\u0005\r\u0000\u0000\u0225"+
		"\u0226\u0003\u0096K\u0000\u0226\u0228\u0005\u000b\u0000\u0000\u0227\u0229"+
		"\u00034\u001a\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0228\u0229\u0001"+
		"\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0005"+
		"\f\u0000\u0000\u022b\u022f\u0005\u0004\u0000\u0000\u022c\u022e\u0005U"+
		"\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022e\u0231\u0001\u0000"+
		"\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000"+
		"\u0000\u0000\u0230\u0232\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000"+
		"\u0000\u0000\u0232\u0236\u0003\u0016\u000b\u0000\u0233\u0235\u0005U\u0000"+
		"\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0235\u0238\u0001\u0000\u0000"+
		"\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000"+
		"\u0000\u0237\u0239\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000\u0000"+
		"\u0000\u0239\u023a\u0005\u0005\u0000\u0000\u023a1\u0001\u0000\u0000\u0000"+
		"\u023b\u023d\u0003v;\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023d\u0240"+
		"\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0001\u0000\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u023e"+
		"\u0001\u0000\u0000\u0000\u0241\u0242\u0005;\u0000\u0000\u0242\u0243\u0003"+
		"b1\u0000\u0243\u0244\u0005\u000b\u0000\u0000\u0244\u0245\u00036\u001b"+
		"\u0000\u0245\u0246\u0005\f\u0000\u0000\u0246\u024a\u0005\u0004\u0000\u0000"+
		"\u0247\u0249\u0005U\u0000\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0249"+
		"\u024c\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024a"+
		"\u024b\u0001\u0000\u0000\u0000\u024b\u024d\u0001\u0000\u0000\u0000\u024c"+
		"\u024a\u0001\u0000\u0000\u0000\u024d\u0251\u0003\u0016\u000b\u0000\u024e"+
		"\u0250\u0005U\u0000\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u0250\u0253"+
		"\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0251\u0252"+
		"\u0001\u0000\u0000\u0000\u0252\u0254\u0001\u0000\u0000\u0000\u0253\u0251"+
		"\u0001\u0000\u0000\u0000\u0254\u0255\u0005\u0005\u0000\u0000\u02553\u0001"+
		"\u0000\u0000\u0000\u0256\u025b\u00036\u001b\u0000\u0257\u0258\u0005\u0003"+
		"\u0000\u0000\u0258\u025a\u00036\u001b\u0000\u0259\u0257\u0001\u0000\u0000"+
		"\u0000\u025a\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000"+
		"\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c5\u0001\u0000\u0000\u0000"+
		"\u025d\u025b\u0001\u0000\u0000\u0000\u025e\u0260\u0003v;\u0000\u025f\u025e"+
		"\u0001\u0000\u0000\u0000\u0260\u0263\u0001\u0000\u0000\u0000\u0261\u025f"+
		"\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0264"+
		"\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0264\u0265"+
		"\u0003\u0096K\u0000\u0265\u0266\u0005J\u0000\u0000\u0266\u0269\u0003d"+
		"2\u0000\u0267\u0268\u0005\u0006\u0000\u0000\u0268\u026a\u0003\u001a\r"+
		"\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000"+
		"\u0000\u026a7\u0001\u0000\u0000\u0000\u026b\u026e\u0003@ \u0000\u026c"+
		"\u026e\u0003:\u001d\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d\u026c"+
		"\u0001\u0000\u0000\u0000\u026e9\u0001\u0000\u0000\u0000\u026f\u0272\u0003"+
		"^/\u0000\u0270\u0273\u0003<\u001e\u0000\u0271\u0273\u0003>\u001f\u0000"+
		"\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000"+
		"\u0273;\u0001\u0000\u0000\u0000\u0274\u0276\u0003v;\u0000\u0275\u0274"+
		"\u0001\u0000\u0000\u0000\u0276\u0279\u0001\u0000\u0000\u0000\u0277\u0275"+
		"\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027a"+
		"\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a\u027b"+
		"\u0005\u000e\u0000\u0000\u027b\u027c\u0003\u0096K\u0000\u027c\u027d\u0005"+
		"J\u0000\u0000\u027d\u027e\u0003d2\u0000\u027e\u027f\u0005\u0006\u0000"+
		"\u0000\u027f\u0280\u0003\u001a\r\u0000\u0280=\u0001\u0000\u0000\u0000"+
		"\u0281\u0283\u0003v;\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0283\u0286"+
		"\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0285"+
		"\u0001\u0000\u0000\u0000\u0285\u0287\u0001\u0000\u0000\u0000\u0286\u0284"+
		"\u0001\u0000\u0000\u0000\u0287\u0288\u0005\u000e\u0000\u0000\u0288\u0289"+
		"\u0003\u0096K\u0000\u0289\u028a\u0005\u0006\u0000\u0000\u028a\u028b\u0003"+
		"\u001a\r\u0000\u028b\u0291\u0001\u0000\u0000\u0000\u028c\u028d\u0005\u0003"+
		"\u0000\u0000\u028d\u028e\u0003\u0096K\u0000\u028e\u028f\u0005\u0006\u0000"+
		"\u0000\u028f\u0290\u0003\u001a\r\u0000\u0290\u0292\u0001\u0000\u0000\u0000"+
		"\u0291\u028c\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000"+
		"\u0293\u0291\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000"+
		"\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0296\u0005J\u0000\u0000\u0296"+
		"\u0297\u0003d2\u0000\u0297?\u0001\u0000\u0000\u0000\u0298\u029b\u0003"+
		"^/\u0000\u0299\u029c\u0003B!\u0000\u029a\u029c\u0003D\"\u0000\u029b\u0299"+
		"\u0001\u0000\u0000\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029cA\u0001"+
		"\u0000\u0000\u0000\u029d\u029f\u0003v;\u0000\u029e\u029d\u0001\u0000\u0000"+
		"\u0000\u029f\u02a2\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005\u000f\u0000"+
		"\u0000\u02a4\u02a5\u0003\u0096K\u0000\u02a5\u02a6\u0005J\u0000\u0000\u02a6"+
		"\u02a9\u0003d2\u0000\u02a7\u02a8\u0005\u0006\u0000\u0000\u02a8\u02aa\u0003"+
		"\u001a\r\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000"+
		"\u0000\u0000\u02aaC\u0001\u0000\u0000\u0000\u02ab\u02ad\u0003v;\u0000"+
		"\u02ac\u02ab\u0001\u0000\u0000\u0000\u02ad\u02b0\u0001\u0000\u0000\u0000"+
		"\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000"+
		"\u02af\u02b1\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b2\u0005\u000f\u0000\u0000\u02b2\u02b5\u0003F#\u0000\u02b3\u02b4"+
		"\u0005\u0003\u0000\u0000\u02b4\u02b6\u0003F#\u0000\u02b5\u02b3\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000"+
		"\u0000\u0000\u02b9\u02ba\u0005J\u0000\u0000\u02ba\u02bb\u0003d2\u0000"+
		"\u02bbE\u0001\u0000\u0000\u0000\u02bc\u02bd\u0003\u0096K\u0000\u02bd\u02be"+
		"\u0005\u0006\u0000\u0000\u02be\u02bf\u0003\u001a\r\u0000\u02bfG\u0001"+
		"\u0000\u0000\u0000\u02c0\u02c8\u0003R)\u0000\u02c1\u02c8\u0003L&\u0000"+
		"\u02c2\u02c8\u0003Z-\u0000\u02c3\u02c8\u0003\\.\u0000\u02c4\u02c8\u0003"+
		"J%\u0000\u02c5\u02c8\u0003V+\u0000\u02c6\u02c8\u0003P(\u0000\u02c7\u02c0"+
		"\u0001\u0000\u0000\u0000\u02c7\u02c1\u0001\u0000\u0000\u0000\u02c7\u02c2"+
		"\u0001\u0000\u0000\u0000\u02c7\u02c3\u0001\u0000\u0000\u0000\u02c7\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c8I\u0001\u0000\u0000\u0000\u02c9\u02cb\u0005"+
		"\u0010\u0000\u0000\u02ca\u02cc\u0003\u001a\r\u0000\u02cb\u02ca\u0001\u0000"+
		"\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02ccK\u0001\u0000\u0000"+
		"\u0000\u02cd\u02ce\u0005\u001f\u0000\u0000\u02ce\u02cf\u0005\u000b\u0000"+
		"\u0000\u02cf\u02d0\u0003\u001a\r\u0000\u02d0\u02d4\u0005\f\u0000\u0000"+
		"\u02d1\u02d3\u0005U\u0000\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d7\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d7\u02db\u0005\u0004\u0000\u0000\u02d8"+
		"\u02da\u0005U\u0000\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02da\u02dd"+
		"\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02dc"+
		"\u0001\u0000\u0000\u0000\u02dc\u02df\u0001\u0000\u0000\u0000\u02dd\u02db"+
		"\u0001\u0000\u0000\u0000\u02de\u02e0\u0003N\'\u0000\u02df\u02de\u0001"+
		"\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u02df\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e4\u0005\u0005\u0000\u0000\u02e4M\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e8\u0003\u001a\r\u0000\u02e6\u02e8\u0005\u0011\u0000"+
		"\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e6\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u0301\u0005\u0012\u0000"+
		"\u0000\u02ea\u02ee\u0005\u0004\u0000\u0000\u02eb\u02ed\u0005U\u0000\u0000"+
		"\u02ec\u02eb\u0001\u0000\u0000\u0000\u02ed\u02f0\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f1\u0001\u0000\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f5\u0003\u0016\u000b\u0000\u02f2\u02f4\u0005U\u0000\u0000\u02f3"+
		"\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f7\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6"+
		"\u02f8\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f8"+
		"\u02f9\u0005\u0005\u0000\u0000\u02f9\u0302\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fc\u0005U\u0000\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fc\u02ff"+
		"\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fe"+
		"\u0001\u0000\u0000\u0000\u02fe\u0300\u0001\u0000\u0000\u0000\u02ff\u02fd"+
		"\u0001\u0000\u0000\u0000\u0300\u0302\u0003\u0018\f\u0000\u0301\u02ea\u0001"+
		"\u0000\u0000\u0000\u0301\u02fd\u0001\u0000\u0000\u0000\u0302\u0306\u0001"+
		"\u0000\u0000\u0000\u0303\u0305\u0005U\u0000\u0000\u0304\u0303\u0001\u0000"+
		"\u0000\u0000\u0305\u0308\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000"+
		"\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307O\u0001\u0000\u0000"+
		"\u0000\u0308\u0306\u0001\u0000\u0000\u0000\u0309\u030b\u0005\u0013\u0000"+
		"\u0000\u030a\u030c\u0003&\u0013\u0000\u030b\u030a\u0001\u0000\u0000\u0000"+
		"\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u031e\u0001\u0000\u0000\u0000"+
		"\u030d\u0311\u0005\u0004\u0000\u0000\u030e\u0310\u0005U\u0000\u0000\u030f"+
		"\u030e\u0001\u0000\u0000\u0000\u0310\u0313\u0001\u0000\u0000\u0000\u0311"+
		"\u030f\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312"+
		"\u0314\u0001\u0000\u0000\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0314"+
		"\u0318\u0003\u0016\u000b\u0000\u0315\u0317\u0005U\u0000\u0000\u0316\u0315"+
		"\u0001\u0000\u0000\u0000\u0317\u031a\u0001\u0000\u0000\u0000\u0318\u0316"+
		"\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u031b"+
		"\u0001\u0000\u0000\u0000\u031a\u0318\u0001\u0000\u0000\u0000\u031b\u031c"+
		"\u0005\u0005\u0000\u0000\u031c\u031f\u0001\u0000\u0000\u0000\u031d\u031f"+
		"\u0003\u0018\f\u0000\u031e\u030d\u0001\u0000\u0000\u0000\u031e\u031d\u0001"+
		"\u0000\u0000\u0000\u031f\u0323\u0001\u0000\u0000\u0000\u0320\u0322\u0005"+
		"U\u0000\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0322\u0325\u0001\u0000"+
		"\u0000\u0000\u0323\u0321\u0001\u0000\u0000\u0000\u0323\u0324\u0001\u0000"+
		"\u0000\u0000\u0324\u0326\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000"+
		"\u0000\u0000\u0326\u0327\u0005\u0014\u0000\u0000\u0327\u0328\u0005\u000b"+
		"\u0000\u0000\u0328\u0329\u00036\u001b\u0000\u0329\u033b\u0005\f\u0000"+
		"\u0000\u032a\u032e\u0005\u0004\u0000\u0000\u032b\u032d\u0005U\u0000\u0000"+
		"\u032c\u032b\u0001\u0000\u0000\u0000\u032d\u0330\u0001\u0000\u0000\u0000"+
		"\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000"+
		"\u032f\u0331\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000"+
		"\u0331\u0335\u0003\u0016\u000b\u0000\u0332\u0334\u0005U\u0000\u0000\u0333"+
		"\u0332\u0001\u0000\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000\u0335"+
		"\u0333\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336"+
		"\u0338\u0001\u0000\u0000\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338"+
		"\u0339\u0005\u0005\u0000\u0000\u0339\u033c\u0001\u0000\u0000\u0000\u033a"+
		"\u033c\u0003\u0018\f\u0000\u033b\u032a\u0001\u0000\u0000\u0000\u033b\u033a"+
		"\u0001\u0000\u0000\u0000\u033c\u0340\u0001\u0000\u0000\u0000\u033d\u033f"+
		"\u0005U\u0000\u0000\u033e\u033d\u0001\u0000\u0000\u0000\u033f\u0342\u0001"+
		"\u0000\u0000\u0000\u0340\u033e\u0001\u0000\u0000\u0000\u0340\u0341\u0001"+
		"\u0000\u0000\u0000\u0341\u0359\u0001\u0000\u0000\u0000\u0342\u0340\u0001"+
		"\u0000\u0000\u0000\u0343\u0355\u0005\u0015\u0000\u0000\u0344\u0348\u0005"+
		"\u0004\u0000\u0000\u0345\u0347\u0005U\u0000\u0000\u0346\u0345\u0001\u0000"+
		"\u0000\u0000\u0347\u034a\u0001\u0000\u0000\u0000\u0348\u0346\u0001\u0000"+
		"\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u034b\u0001\u0000"+
		"\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034b\u034f\u0003\u0016"+
		"\u000b\u0000\u034c\u034e\u0005U\u0000\u0000\u034d\u034c\u0001\u0000\u0000"+
		"\u0000\u034e\u0351\u0001\u0000\u0000\u0000\u034f\u034d\u0001\u0000\u0000"+
		"\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0352\u0001\u0000\u0000"+
		"\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0352\u0353\u0005\u0005\u0000"+
		"\u0000\u0353\u0356\u0001\u0000\u0000\u0000\u0354\u0356\u0003\u0018\f\u0000"+
		"\u0355\u0344\u0001\u0000\u0000\u0000\u0355\u0354\u0001\u0000\u0000\u0000"+
		"\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0358\u0005U\u0000\u0000\u0358"+
		"\u035a\u0001\u0000\u0000\u0000\u0359\u0343\u0001\u0000\u0000\u0000\u0359"+
		"\u035a\u0001\u0000\u0000\u0000\u035aQ\u0001\u0000\u0000\u0000\u035b\u035c"+
		"\u0005\u001d\u0000\u0000\u035c\u035d\u0005\u000b\u0000\u0000\u035d\u035e"+
		"\u0003z=\u0000\u035e\u035f\u0005\f\u0000\u0000\u035f\u0362\u0003T*\u0000"+
		"\u0360\u0361\u0005\u001e\u0000\u0000\u0361\u0363\u0003T*\u0000\u0362\u0360"+
		"\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363S\u0001"+
		"\u0000\u0000\u0000\u0364\u0366\u0005U\u0000\u0000\u0365\u0364\u0001\u0000"+
		"\u0000\u0000\u0366\u0369\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000"+
		"\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368\u037b\u0001\u0000"+
		"\u0000\u0000\u0369\u0367\u0001\u0000\u0000\u0000\u036a\u036e\u0005\u0004"+
		"\u0000\u0000\u036b\u036d\u0005U\u0000\u0000\u036c\u036b\u0001\u0000\u0000"+
		"\u0000\u036d\u0370\u0001\u0000\u0000\u0000\u036e\u036c\u0001\u0000\u0000"+
		"\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f\u0371\u0001\u0000\u0000"+
		"\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0371\u0375\u0003\u0016\u000b"+
		"\u0000\u0372\u0374\u0005U\u0000\u0000\u0373\u0372\u0001\u0000\u0000\u0000"+
		"\u0374\u0377\u0001\u0000\u0000\u0000\u0375\u0373\u0001\u0000\u0000\u0000"+
		"\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0378\u0001\u0000\u0000\u0000"+
		"\u0377\u0375\u0001\u0000\u0000\u0000\u0378\u0379\u0005\u0005\u0000\u0000"+
		"\u0379\u037c\u0001\u0000\u0000\u0000\u037a\u037c\u0003\u0018\f\u0000\u037b"+
		"\u036a\u0001\u0000\u0000\u0000\u037b\u037a\u0001\u0000\u0000\u0000\u037c"+
		"U\u0001\u0000\u0000\u0000\u037d\u037e\u0005\u0016\u0000\u0000\u037e\u037f"+
		"\u0005\u000b\u0000\u0000\u037f\u0380\u0003z=\u0000\u0380\u0384\u0005\f"+
		"\u0000\u0000\u0381\u0383\u0005U\u0000\u0000\u0382\u0381\u0001\u0000\u0000"+
		"\u0000\u0383\u0386\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000\u0000"+
		"\u0000\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0398\u0001\u0000\u0000"+
		"\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0387\u038b\u0005\u0004\u0000"+
		"\u0000\u0388\u038a\u0005U\u0000\u0000\u0389\u0388\u0001\u0000\u0000\u0000"+
		"\u038a\u038d\u0001\u0000\u0000\u0000\u038b\u0389\u0001\u0000\u0000\u0000"+
		"\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038e\u0001\u0000\u0000\u0000"+
		"\u038d\u038b\u0001\u0000\u0000\u0000\u038e\u0392\u0003\u0016\u000b\u0000"+
		"\u038f\u0391\u0005U\u0000\u0000\u0390\u038f\u0001\u0000\u0000\u0000\u0391"+
		"\u0394\u0001\u0000\u0000\u0000\u0392\u0390\u0001\u0000\u0000\u0000\u0392"+
		"\u0393\u0001\u0000\u0000\u0000\u0393\u0395\u0001\u0000\u0000\u0000\u0394"+
		"\u0392\u0001\u0000\u0000\u0000\u0395\u0396\u0005\u0005\u0000\u0000\u0396"+
		"\u0399\u0001\u0000\u0000\u0000\u0397\u0399\u0003\u0018\f\u0000\u0398\u0387"+
		"\u0001\u0000\u0000\u0000\u0398\u0397\u0001\u0000\u0000\u0000\u0399W\u0001"+
		"\u0000\u0000\u0000\u039a\u039b\u0005\u001c\u0000\u0000\u039b\u039c\u0005"+
		"\u000b\u0000\u0000\u039c\u039d\u0003@ \u0000\u039d\u03a0\u0005\u0017\u0000"+
		"\u0000\u039e\u03a1\u0003(\u0014\u0000\u039f\u03a1\u0003\u001a\r\u0000"+
		"\u03a0\u039e\u0001\u0000\u0000\u0000\u03a0\u039f\u0001\u0000\u0000\u0000"+
		"\u03a1\u03a2\u0001\u0000\u0000\u0000\u03a2\u03a6\u0005\f\u0000\u0000\u03a3"+
		"\u03a5\u0005U\u0000\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a5\u03a8"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001\u0000\u0000\u0000\u03a6\u03a7"+
		"\u0001\u0000\u0000\u0000\u03a7\u03b4\u0001\u0000\u0000\u0000\u03a8\u03a6"+
		"\u0001\u0000\u0000\u0000\u03a9\u03ad\u0005\u0004\u0000\u0000\u03aa\u03ac"+
		"\u0005U\u0000\u0000\u03ab\u03aa\u0001\u0000\u0000\u0000\u03ac\u03af\u0001"+
		"\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001"+
		"\u0000\u0000\u0000\u03ae\u03b0\u0001\u0000\u0000\u0000\u03af\u03ad\u0001"+
		"\u0000\u0000\u0000\u03b0\u03b1\u0003\u0016\u000b\u0000\u03b1\u03b2\u0005"+
		"\u0005\u0000\u0000\u03b2\u03b5\u0001\u0000\u0000\u0000\u03b3\u03b5\u0003"+
		"\u0018\f\u0000\u03b4\u03a9\u0001\u0000\u0000\u0000\u03b4\u03b3\u0001\u0000"+
		"\u0000\u0000\u03b5Y\u0001\u0000\u0000\u0000\u03b6\u03b7\u0005\u001c\u0000"+
		"\u0000\u03b7\u03b9\u0005\u000b\u0000\u0000\u03b8\u03ba\u0003@ \u0000\u03b9"+
		"\u03b8\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000\u03ba"+
		"\u03bb\u0001\u0000\u0000\u0000\u03bb\u03bd\u0005U\u0000\u0000\u03bc\u03be"+
		"\u0003z=\u0000\u03bd\u03bc\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000"+
		"\u0000\u0000\u03be\u03bf\u0001\u0000\u0000\u0000\u03bf\u03c1\u0005U\u0000"+
		"\u0000\u03c0\u03c2\u0003&\u0013\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000"+
		"\u03c1\u03c2\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000"+
		"\u03c3\u03c7\u0005\f\u0000\u0000\u03c4\u03c6\u0005U\u0000\u0000\u03c5"+
		"\u03c4\u0001\u0000\u0000\u0000\u03c6\u03c9\u0001\u0000\u0000\u0000\u03c7"+
		"\u03c5\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8"+
		"\u03d5\u0001\u0000\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000\u03ca"+
		"\u03ce\u0005\u0004\u0000\u0000\u03cb\u03cd\u0005U\u0000\u0000\u03cc\u03cb"+
		"\u0001\u0000\u0000\u0000\u03cd\u03d0\u0001\u0000\u0000\u0000\u03ce\u03cc"+
		"\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d1"+
		"\u0001\u0000\u0000\u0000\u03d0\u03ce\u0001\u0000\u0000\u0000\u03d1\u03d2"+
		"\u0003\u0016\u000b\u0000\u03d2\u03d3\u0005\u0005\u0000\u0000\u03d3\u03d6"+
		"\u0001\u0000\u0000\u0000\u03d4\u03d6\u0003\u0018\f\u0000\u03d5\u03ca\u0001"+
		"\u0000\u0000\u0000\u03d5\u03d4\u0001\u0000\u0000\u0000\u03d6[\u0001\u0000"+
		"\u0000\u0000\u03d7\u03d8\u0005\u001c\u0000\u0000\u03d8\u03d9\u0005\u000b"+
		"\u0000\u0000\u03d9\u03da\u0003\u0096K\u0000\u03da\u03db\u0005J\u0000\u0000"+
		"\u03db\u03dc\u0003d2\u0000\u03dc\u03dd\u0005\u0003\u0000\u0000\u03dd\u03de"+
		"\u0003\u001a\r\u0000\u03de\u03df\u0005\u0018\u0000\u0000\u03df\u03e0\u0003"+
		"\u001a\r\u0000\u03e0\u03e4\u0005\f\u0000\u0000\u03e1\u03e3\u0005U\u0000"+
		"\u0000\u03e2\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e6\u0001\u0000\u0000"+
		"\u0000\u03e4\u03e2\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000"+
		"\u0000\u03e5\u03f2\u0001\u0000\u0000\u0000\u03e6\u03e4\u0001\u0000\u0000"+
		"\u0000\u03e7\u03eb\u0005\u0004\u0000\u0000\u03e8\u03ea\u0005U\u0000\u0000"+
		"\u03e9\u03e8\u0001\u0000\u0000\u0000\u03ea\u03ed\u0001\u0000\u0000\u0000"+
		"\u03eb\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000"+
		"\u03ec\u03ee\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000"+
		"\u03ee\u03ef\u0003\u0016\u000b\u0000\u03ef\u03f0\u0005\u0005\u0000\u0000"+
		"\u03f0\u03f3\u0001\u0000\u0000\u0000\u03f1\u03f3\u0003\u0018\f\u0000\u03f2"+
		"\u03e7\u0001\u0000\u0000\u0000\u03f2\u03f1\u0001\u0000\u0000\u0000\u03f3"+
		"]\u0001\u0000\u0000\u0000\u03f4\u03f6\u0007\u0001\u0000\u0000\u03f5\u03f4"+
		"\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6\u03f8"+
		"\u0001\u0000\u0000\u0000\u03f7\u03f9\u00055\u0000\u0000\u03f8\u03f7\u0001"+
		"\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fb\u0001"+
		"\u0000\u0000\u0000\u03fa\u03fc\u00056\u0000\u0000\u03fb\u03fa\u0001\u0000"+
		"\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc_\u0001\u0000\u0000"+
		"\u0000\u03fd\u0400\u0005M\u0000\u0000\u03fe\u0400\u0007\u0002\u0000\u0000"+
		"\u03ff\u03fd\u0001\u0000\u0000\u0000\u03ff\u03fe\u0001\u0000\u0000\u0000"+
		"\u03ff\u0400\u0001\u0000\u0000\u0000\u0400a\u0001\u0000\u0000\u0000\u0401"+
		"\u0402\u0007\u0003\u0000\u0000\u0402c\u0001\u0000\u0000\u0000\u0403\u0406"+
		"\u0003f3\u0000\u0404\u0406\u0003h4\u0000\u0405\u0403\u0001\u0000\u0000"+
		"\u0000\u0405\u0404\u0001\u0000\u0000\u0000\u0406\u040b\u0001\u0000\u0000"+
		"\u0000\u0407\u0408\u0005\b\u0000\u0000\u0408\u040a\u0005\t\u0000\u0000"+
		"\u0409\u0407\u0001\u0000\u0000\u0000\u040a\u040d\u0001\u0000\u0000\u0000"+
		"\u040b\u0409\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000"+
		"\u040c\u040f\u0001\u0000\u0000\u0000\u040d\u040b\u0001\u0000\u0000\u0000"+
		"\u040e\u0410\u0007\u0004\u0000\u0000\u040f\u040e\u0001\u0000\u0000\u0000"+
		"\u040f\u0410\u0001\u0000\u0000\u0000\u0410e\u0001\u0000\u0000\u0000\u0411"+
		"\u0414\u0003\u0096K\u0000\u0412\u0414\u0003j5\u0000\u0413\u0411\u0001"+
		"\u0000\u0000\u0000\u0413\u0412\u0001\u0000\u0000\u0000\u0414g\u0001\u0000"+
		"\u0000\u0000\u0415\u041a\u0005\u0019\u0000\u0000\u0416\u041b\u0003f3\u0000"+
		"\u0417\u041b\u0005L\u0000\u0000\u0418\u041b\u0005N\u0000\u0000\u0419\u041b"+
		"\u0005P\u0000\u0000\u041a\u0416\u0001\u0000\u0000\u0000\u041a\u0417\u0001"+
		"\u0000\u0000\u0000\u041a\u0418\u0001\u0000\u0000\u0000\u041a\u0419\u0001"+
		"\u0000\u0000\u0000\u041bi\u0001\u0000\u0000\u0000\u041c\u0427\u0005 \u0000"+
		"\u0000\u041d\u0427\u0005!\u0000\u0000\u041e\u0427\u0005\"\u0000\u0000"+
		"\u041f\u0427\u0005#\u0000\u0000\u0420\u0427\u0005$\u0000\u0000\u0421\u0427"+
		"\u0005%\u0000\u0000\u0422\u0427\u0005&\u0000\u0000\u0423\u0427\u0005\'"+
		"\u0000\u0000\u0424\u0427\u0005(\u0000\u0000\u0425\u0427\u0003l6\u0000"+
		"\u0426\u041c\u0001\u0000\u0000\u0000\u0426\u041d\u0001\u0000\u0000\u0000"+
		"\u0426\u041e\u0001\u0000\u0000\u0000\u0426\u041f\u0001\u0000\u0000\u0000"+
		"\u0426\u0420\u0001\u0000\u0000\u0000\u0426\u0421\u0001\u0000\u0000\u0000"+
		"\u0426\u0422\u0001\u0000\u0000\u0000\u0426\u0423\u0001\u0000\u0000\u0000"+
		"\u0426\u0424\u0001\u0000\u0000\u0000\u0426\u0425\u0001\u0000\u0000\u0000"+
		"\u0427k\u0001\u0000\u0000\u0000\u0428\u0429\u0007\u0005\u0000\u0000\u0429"+
		"m\u0001\u0000\u0000\u0000\u042a\u042f\u0003p8\u0000\u042b\u042c\u0005"+
		"\u0003\u0000\u0000\u042c\u042e\u0003p8\u0000\u042d\u042b\u0001\u0000\u0000"+
		"\u0000\u042e\u0431\u0001\u0000\u0000\u0000\u042f\u042d\u0001\u0000\u0000"+
		"\u0000\u042f\u0430\u0001\u0000\u0000\u0000\u0430o\u0001\u0000\u0000\u0000"+
		"\u0431\u042f\u0001\u0000\u0000\u0000\u0432\u0433\u0003\u001a\r\u0000\u0433"+
		"q\u0001\u0000\u0000\u0000\u0434\u0436\u0003v;\u0000\u0435\u0434\u0001"+
		"\u0000\u0000\u0000\u0436\u0439\u0001\u0000\u0000\u0000\u0437\u0435\u0001"+
		"\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000\u0000\u0438\u043d\u0001"+
		"\u0000\u0000\u0000\u0439\u0437\u0001\u0000\u0000\u0000\u043a\u043b\u0003"+
		"(\u0014\u0000\u043b\u043c\u0005\u0007\u0000\u0000\u043c\u043e\u0001\u0000"+
		"\u0000\u0000\u043d\u043a\u0001\u0000\u0000\u0000\u043d\u043e\u0001\u0000"+
		"\u0000\u0000\u043e\u043f\u0001\u0000\u0000\u0000\u043f\u0440\u0005S\u0000"+
		"\u0000\u0440\u0442\u0005\u000b\u0000\u0000\u0441\u0443\u0003n7\u0000\u0442"+
		"\u0441\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000\u0000\u0443"+
		"\u0444\u0001\u0000\u0000\u0000\u0444\u0445\u0005\f\u0000\u0000\u0445s"+
		"\u0001\u0000\u0000\u0000\u0446\u044b\u0003r9\u0000\u0447\u0448\u0005\u0007"+
		"\u0000\u0000\u0448\u044a\u0003r9\u0000\u0449\u0447\u0001\u0000\u0000\u0000"+
		"\u044a\u044d\u0001\u0000\u0000\u0000\u044b\u0449\u0001\u0000\u0000\u0000"+
		"\u044b\u044c\u0001\u0000\u0000\u0000\u044cu\u0001\u0000\u0000\u0000\u044d"+
		"\u044b\u0001\u0000\u0000\u0000\u044e\u044f\u0005\u001a\u0000\u0000\u044f"+
		"\u0454\u0003\u0096K\u0000\u0450\u0451\u0005\u000b\u0000\u0000\u0451\u0452"+
		"\u0003n7\u0000\u0452\u0453\u0005\f\u0000\u0000\u0453\u0455\u0001\u0000"+
		"\u0000\u0000\u0454\u0450\u0001\u0000\u0000\u0000\u0454\u0455\u0001\u0000"+
		"\u0000\u0000\u0455\u0459\u0001\u0000\u0000\u0000\u0456\u0458\u0005U\u0000"+
		"\u0000\u0457\u0456\u0001\u0000\u0000\u0000\u0458\u045b\u0001\u0000\u0000"+
		"\u0000\u0459\u0457\u0001\u0000\u0000\u0000\u0459\u045a\u0001\u0000\u0000"+
		"\u0000\u045aw\u0001\u0000\u0000\u0000\u045b\u0459\u0001\u0000\u0000\u0000"+
		"\u045c\u045d\u0005\r\u0000\u0000\u045d\u045e\u0003\u0096K\u0000\u045e"+
		"\u0460\u0005\u000b\u0000\u0000\u045f\u0461\u0003n7\u0000\u0460\u045f\u0001"+
		"\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u0462\u0001"+
		"\u0000\u0000\u0000\u0462\u0463\u0005\f\u0000\u0000\u0463y\u0001\u0000"+
		"\u0000\u0000\u0464\u0468\u0003\u0084B\u0000\u0465\u0468\u0003|>\u0000"+
		"\u0466\u0468\u0003\u0086C\u0000\u0467\u0464\u0001\u0000\u0000\u0000\u0467"+
		"\u0465\u0001\u0000\u0000\u0000\u0467\u0466\u0001\u0000\u0000\u0000\u0468"+
		"{\u0001\u0000\u0000\u0000\u0469\u046c\u0003\u0084B\u0000\u046a\u046c\u0003"+
		"~?\u0000\u046b\u0469\u0001\u0000\u0000\u0000\u046b\u046a\u0001\u0000\u0000"+
		"\u0000\u046c\u0473\u0001\u0000\u0000\u0000\u046d\u0471\u0005?\u0000\u0000"+
		"\u046e\u0472\u0003\u0084B\u0000\u046f\u0472\u0003~?\u0000\u0470\u0472"+
		"\u0003|>\u0000\u0471\u046e\u0001\u0000\u0000\u0000\u0471\u046f\u0001\u0000"+
		"\u0000\u0000\u0471\u0470\u0001\u0000\u0000\u0000\u0472\u0474\u0001\u0000"+
		"\u0000\u0000\u0473\u046d\u0001\u0000\u0000\u0000\u0473\u0474\u0001\u0000"+
		"\u0000\u0000\u0474}\u0001\u0000\u0000\u0000\u0475\u0478\u0003\u0084B\u0000"+
		"\u0476\u0478\u0003\u0080@\u0000\u0477\u0475\u0001\u0000\u0000\u0000\u0477"+
		"\u0476\u0001\u0000\u0000\u0000\u0478\u047f\u0001\u0000\u0000\u0000\u0479"+
		"\u047d\u0005>\u0000\u0000\u047a\u047e\u0003\u0084B\u0000\u047b\u047e\u0003"+
		"\u0080@\u0000\u047c\u047e\u0003~?\u0000\u047d\u047a\u0001\u0000\u0000"+
		"\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047d\u047c\u0001\u0000\u0000"+
		"\u0000\u047e\u0480\u0001\u0000\u0000\u0000\u047f\u0479\u0001\u0000\u0000"+
		"\u0000\u047f\u0480\u0001\u0000\u0000\u0000\u0480\u007f\u0001\u0000\u0000"+
		"\u0000\u0481\u0484\u0003\u0084B\u0000\u0482\u0484\u0003\u0082A\u0000\u0483"+
		"\u0481\u0001\u0000\u0000\u0000\u0483\u0482\u0001\u0000\u0000\u0000\u0484"+
		"\u048b\u0001\u0000\u0000\u0000\u0485\u0489\u0005A\u0000\u0000\u0486\u048a"+
		"\u0003\u0084B\u0000\u0487\u048a\u0003\u0082A\u0000\u0488\u048a\u0003\u0080"+
		"@\u0000\u0489\u0486\u0001\u0000\u0000\u0000\u0489\u0487\u0001\u0000\u0000"+
		"\u0000\u0489\u0488\u0001\u0000\u0000\u0000\u048a\u048c\u0001\u0000\u0000"+
		"\u0000\u048b\u0485\u0001\u0000\u0000\u0000\u048b\u048c\u0001\u0000\u0000"+
		"\u0000\u048c\u0081\u0001\u0000\u0000\u0000\u048d\u048f\u0005@\u0000\u0000"+
		"\u048e\u048d\u0001\u0000\u0000\u0000\u048e\u048f\u0001\u0000\u0000\u0000"+
		"\u048f\u0490\u0001\u0000\u0000\u0000\u0490\u0491\u0003\u0084B\u0000\u0491"+
		"\u0083\u0001\u0000\u0000\u0000\u0492\u049d\u0003\u001c\u000e\u0000\u0493"+
		"\u049d\u0003t:\u0000\u0494\u049d\u0003(\u0014\u0000\u0495\u049d\u0003"+
		"\u0096K\u0000\u0496\u0497\u0005\u000b\u0000\u0000\u0497\u0498\u0003z="+
		"\u0000\u0498\u0499\u0005\f\u0000\u0000\u0499\u049d\u0001\u0000\u0000\u0000"+
		"\u049a\u049d\u0003x<\u0000\u049b\u049d\u0003*\u0015\u0000\u049c\u0492"+
		"\u0001\u0000\u0000\u0000\u049c\u0493\u0001\u0000\u0000\u0000\u049c\u0494"+
		"\u0001\u0000\u0000\u0000\u049c\u0495\u0001\u0000\u0000\u0000\u049c\u0496"+
		"\u0001\u0000\u0000\u0000\u049c\u049a\u0001\u0000\u0000\u0000\u049c\u049b"+
		"\u0001\u0000\u0000\u0000\u049d\u0085\u0001\u0000\u0000\u0000\u049e\u049f"+
		"\u0003\u0088D\u0000\u049f\u04a0\u0007\u0006\u0000\u0000\u04a0\u04a1\u0003"+
		"\u0088D\u0000\u04a1\u0087\u0001\u0000\u0000\u0000\u04a2\u04a5\u0003\u0092"+
		"I\u0000\u04a3\u04a5\u0003\u008aE\u0000\u04a4\u04a2\u0001\u0000\u0000\u0000"+
		"\u04a4\u04a3\u0001\u0000\u0000\u0000\u04a5\u0089\u0001\u0000\u0000\u0000"+
		"\u04a6\u04ac\u0003\u008cF\u0000\u04a7\u04aa\u0007\u0007\u0000\u0000\u04a8"+
		"\u04ab\u0003\u0092I\u0000\u04a9\u04ab\u0003\u008aE\u0000\u04aa\u04a8\u0001"+
		"\u0000\u0000\u0000\u04aa\u04a9\u0001\u0000\u0000\u0000\u04ab\u04ad\u0001"+
		"\u0000\u0000\u0000\u04ac\u04a7\u0001\u0000\u0000\u0000\u04ac\u04ad\u0001"+
		"\u0000\u0000\u0000\u04ad\u008b\u0001\u0000\u0000\u0000\u04ae\u04b4\u0003"+
		"\u008eG\u0000\u04af\u04b2\u0007\b\u0000\u0000\u04b0\u04b3\u0003\u0092"+
		"I\u0000\u04b1\u04b3\u0003\u008cF\u0000\u04b2\u04b0\u0001\u0000\u0000\u0000"+
		"\u04b2\u04b1\u0001\u0000\u0000\u0000\u04b3\u04b5\u0001\u0000\u0000\u0000"+
		"\u04b4\u04af\u0001\u0000\u0000\u0000\u04b4\u04b5\u0001\u0000\u0000\u0000"+
		"\u04b5\u008d\u0001\u0000\u0000\u0000\u04b6\u04bc\u0003\u0090H\u0000\u04b7"+
		"\u04ba\u0007\t\u0000\u0000\u04b8\u04bb\u0003\u0092I\u0000\u04b9\u04bb"+
		"\u0003\u008eG\u0000\u04ba\u04b8\u0001\u0000\u0000\u0000\u04ba\u04b9\u0001"+
		"\u0000\u0000\u0000\u04bb\u04bd\u0001\u0000\u0000\u0000\u04bc\u04b7\u0001"+
		"\u0000\u0000\u0000\u04bc\u04bd\u0001\u0000\u0000\u0000\u04bd\u008f\u0001"+
		"\u0000\u0000\u0000\u04be\u04c4\u0003\u0092I\u0000\u04bf\u04c2\u00051\u0000"+
		"\u0000\u04c0\u04c3\u0003\u0092I\u0000\u04c1\u04c3\u0003\u0090H\u0000\u04c2"+
		"\u04c0\u0001\u0000\u0000\u0000\u04c2\u04c1\u0001\u0000\u0000\u0000\u04c3"+
		"\u04c5\u0001\u0000\u0000\u0000\u04c4\u04bf\u0001\u0000\u0000\u0000\u04c4"+
		"\u04c5\u0001\u0000\u0000\u0000\u04c5\u0091\u0001\u0000\u0000\u0000\u04c6"+
		"\u04c8\u0007\u0007\u0000\u0000\u04c7\u04c6\u0001\u0000\u0000\u0000\u04c7"+
		"\u04c8\u0001\u0000\u0000\u0000\u04c8\u04d0\u0001\u0000\u0000\u0000\u04c9"+
		"\u04d1\u0003t:\u0000\u04ca\u04d1\u0003\u0096K\u0000\u04cb\u04d1\u0003"+
		"\u009aM\u0000\u04cc\u04cd\u0005\u000b\u0000\u0000\u04cd\u04ce\u0003\u0088"+
		"D\u0000\u04ce\u04cf\u0005\f\u0000\u0000\u04cf\u04d1\u0001\u0000\u0000"+
		"\u0000\u04d0\u04c9\u0001\u0000\u0000\u0000\u04d0\u04ca\u0001\u0000\u0000"+
		"\u0000\u04d0\u04cb\u0001\u0000\u0000\u0000\u04d0\u04cc\u0001\u0000\u0000"+
		"\u0000\u04d1\u04d4\u0001\u0000\u0000\u0000\u04d2\u04d4\u0003\u0094J\u0000"+
		"\u04d3\u04c7\u0001\u0000\u0000\u0000\u04d3\u04d2\u0001\u0000\u0000\u0000"+
		"\u04d4\u0093\u0001\u0000\u0000\u0000\u04d5\u04d6\u0005-\u0000\u0000\u04d6"+
		"\u04da\u0005-\u0000\u0000\u04d7\u04d8\u0005.\u0000\u0000\u04d8\u04da\u0005"+
		".\u0000\u0000\u04d9\u04d5\u0001\u0000\u0000\u0000\u04d9\u04d7\u0001\u0000"+
		"\u0000\u0000\u04da\u04dd\u0001\u0000\u0000\u0000\u04db\u04de\u0003\u0096"+
		"K\u0000\u04dc\u04de\u0003(\u0014\u0000\u04dd\u04db\u0001\u0000\u0000\u0000"+
		"\u04dd\u04dc\u0001\u0000\u0000\u0000\u04de\u04ea\u0001\u0000\u0000\u0000"+
		"\u04df\u04e2\u0003\u0096K\u0000\u04e0\u04e2\u0003(\u0014\u0000\u04e1\u04df"+
		"\u0001\u0000\u0000\u0000\u04e1\u04e0\u0001\u0000\u0000\u0000\u04e2\u04e7"+
		"\u0001\u0000\u0000\u0000\u04e3\u04e4\u0005-\u0000\u0000\u04e4\u04e8\u0005"+
		"-\u0000\u0000\u04e5\u04e6\u0005.\u0000\u0000\u04e6\u04e8\u0005.\u0000"+
		"\u0000\u04e7\u04e3\u0001\u0000\u0000\u0000\u04e7\u04e5\u0001\u0000\u0000"+
		"\u0000\u04e8\u04ea\u0001\u0000\u0000\u0000\u04e9\u04d9\u0001\u0000\u0000"+
		"\u0000\u04e9\u04e1\u0001\u0000\u0000\u0000\u04ea\u0095\u0001\u0000\u0000"+
		"\u0000\u04eb\u04ee\u0003\u0098L\u0000\u04ec\u04ee\u0005S\u0000\u0000\u04ed"+
		"\u04eb\u0001\u0000\u0000\u0000\u04ed\u04ec\u0001\u0000\u0000\u0000\u04ee"+
		"\u0097\u0001\u0000\u0000\u0000\u04ef\u04f2\u0005S\u0000\u0000\u04f0\u04f1"+
		"\u0005\u0007\u0000\u0000\u04f1\u04f3\u0005S\u0000\u0000\u04f2\u04f0\u0001"+
		"\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f2\u0001"+
		"\u0000\u0000\u0000\u04f4\u04f5\u0001\u0000\u0000\u0000\u04f5\u0099\u0001"+
		"\u0000\u0000\u0000\u04f6\u04f7\u0007\n\u0000\u0000\u04f7\u009b\u0001\u0000"+
		"\u0000\u0000\u00b4\u009f\u00a3\u00a6\u00ac\u00b1\u00b9\u00be\u00c4\u00c9"+
		"\u00d1\u00d7\u00d9\u00dc\u00e1\u00e7\u00eb\u00f0\u00f4\u00f9\u00fc\u0101"+
		"\u0106\u010a\u0113\u0116\u011c\u0120\u0125\u012d\u0139\u013c\u0142\u0146"+
		"\u014b\u0153\u015f\u0162\u0168\u016f\u0179\u017e\u0182\u018b\u0190\u0194"+
		"\u019a\u019f\u01a3\u01a8\u01af\u01b4\u01b7\u01c0\u01c6\u01ce\u01d5\u01dd"+
		"\u01e5\u01ea\u01f0\u01f6\u01ff\u0208\u0211\u0218\u0220\u0228\u022f\u0236"+
		"\u023e\u024a\u0251\u025b\u0261\u0269\u026d\u0272\u0277\u0284\u0293\u029b"+
		"\u02a0\u02a9\u02ae\u02b7\u02c7\u02cb\u02d4\u02db\u02e1\u02e7\u02ee\u02f5"+
		"\u02fd\u0301\u0306\u030b\u0311\u0318\u031e\u0323\u032e\u0335\u033b\u0340"+
		"\u0348\u034f\u0355\u0359\u0362\u0367\u036e\u0375\u037b\u0384\u038b\u0392"+
		"\u0398\u03a0\u03a6\u03ad\u03b4\u03b9\u03bd\u03c1\u03c7\u03ce\u03d5\u03e4"+
		"\u03eb\u03f2\u03f5\u03f8\u03fb\u03ff\u0405\u040b\u040f\u0413\u041a\u0426"+
		"\u042f\u0437\u043d\u0442\u044b\u0454\u0459\u0460\u0467\u046b\u0471\u0473"+
		"\u0477\u047d\u047f\u0483\u0489\u048b\u048e\u049c\u04a4\u04aa\u04ac\u04b2"+
		"\u04b4\u04ba\u04bc\u04c2\u04c4\u04c7\u04d0\u04d3\u04d9\u04dd\u04e1\u04e7"+
		"\u04e9\u04ed\u04f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}