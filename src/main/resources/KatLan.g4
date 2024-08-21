grammar KatLan;

class: ENDLINE* package? importBlock? (classDef | interfaceDef | unnamedClassDef | annotationDef) ENDLINE*;

package: 'package' name ENDLINE+;
importBlock: ((importStatement | importStatic) ENDLINE*)+;
importStatement: 'import' name ('as' name)?;
importStatic: 'import static' name ('as' name)?;

unnamedClassDef: packageBlock? ENDLINE* (extends name (',' name)* ENDLINE*)? ('{' ENDLINE* classBlock? ENDLINE* '}')? ENDLINE* packageBlock?;

classDef: annotationCall* modifier? access ((ABSTRACT_KEYWORD? CLASS_KEYWORD) | ENUM_KEYWORD) name (extends name (',' name)*)?
        '{' ENDLINE* classBlock? ENDLINE* '}';
interfaceDef: annotationCall* modifier? access INTERFACE_KEYWORD name (extends name (',' name)*)?
        '{' ENDLINE* classBlock? ENDLINE* '}';
annotationDef: annotationCall* modifier? access ANNOTATION_KEYWORD name (extends name (',' name)*)?
        '{' ENDLINE* annotationClassBlock ENDLINE* '}';

packageBlock: (
    (var            |
    methodDef       |
    classDef        |
    interfaceDef    |
    annotationDef
    )
    ENDLINE*
    )+
;

classBlock: (
    (var            |
    methodDef       |
    constructorDef  |
    operatorOverDef |
    classDef        |
    interfaceDef    |
    annotationDef
    )
    ENDLINE*
    )+
;

annotationClassBlock: (
    (var            |
    methodDef       |
    classDef        |
    interfaceDef)
    ENDLINE*
    )+
;

block: lineBlock*;
lineBlock: ((var | varAssignment | methodCall | statement) (ENDLINE+ | EOF));

value: bool | STRING_VAL | expression | arithmeticExpression | name | anyType | arrayAccess;
bool: TRUE | FALSE;

genericTypeName: name | '?'; //todo
genericDef: ('<' genericTypeUse (',' genericTypeUse)* '>');
genericTypeUse: genericTypeName genericExtendsStatement?;
genericExtendsStatement: (extends | ':') anyType;

varAssignment: annotationCall* (varAccess '=' value) | incrExpression;

varAccess : annotationCall* NAME0 ('.' varAccess)?;
arrayAccess: varAccess arrayAccess0+;
arrayAccess0: ('[' arithmeticExpression ']');

methodDef: annotationCall* modifier? access methodModifier 'def' name genericDef? '(' parameters? ')' COLON type ENDLINE* (('{' ENDLINE* block ENDLINE* '}') | lineBlock);
constructorDef: annotationCall* modifier? access 'new' name '(' parameters? ')' '{' ENDLINE* block ENDLINE* '}';
operatorOverDef: annotationCall* OP_OV_MOD operator '(' parameter ')' '{' ENDLINE* block ENDLINE* '}';

parameters: (parameter) (',' parameter)*;
parameter: annotationCall* name COLON type ('=' value)?;

var: varDef | constDef;

constDef: access (constDef0 | constDef1);
constDef0: annotationCall* 'const' name COLON type '=' value;
constDef1: annotationCall* 'const' (name '=' value) (',' name '=' value)+ COLON type;

varDef: access (varDef0 | varDef1);
varDef0: annotationCall* 'var' name COLON type ('=' value)?     ;
varDef1: annotationCall* 'var' subVD1 (',' subVD1)+ COLON type  ;
subVD1 : name ('=' value)                                     ;

statement: ifStatement | switchStatement | foriLoop | foriLoop0 | returnStatement | whileLoopStatement | tryCatchFinally;

returnStatement: 'return' value?;

switchStatement: 'switch' '(' value ')' ENDLINE*
    '{' ENDLINE*
        subSwitch0+
    '}';
subSwitch0: ((value | 'default') '->' (('{' ENDLINE* block ENDLINE* '}') | ENDLINE* lineBlock) ENDLINE*);

tryCatchFinally: 'try' (varAssignment)? (('{' ENDLINE* block ENDLINE* '}') | lineBlock) ENDLINE*
                 'catch' '(' parameter ')' (('{' ENDLINE* block ENDLINE* '}') | lineBlock) ENDLINE*
                 ('finally' (('{' ENDLINE* block ENDLINE* '}') | lineBlock) ENDLINE)?;

ifStatement: 'if' '(' expression ')' ifStatement0
             ('else' ifStatement0)?
             ;
ifStatement0: ENDLINE* (('{' ENDLINE* block ENDLINE* '}') | lineBlock);


whileLoopStatement: 'while' '(' expression ')' ENDLINE* (('{' ENDLINE* block ENDLINE* '}') | lineBlock);

forEachLoop: 'for' '(' varDef 'in' (varAccess | value) ')' ENDLINE* (('{' ENDLINE* block '}') | lineBlock);

foriLoop: 'for' '(' varDef? ENDLINE expression? ENDLINE varAssignment?')' ENDLINE* (('{' ENDLINE* block '}') | lineBlock);
foriLoop0: 'for' '(' name COLON type ',' value '..' value ')' ENDLINE* (('{' ENDLINE* block '}') | lineBlock);

access: (PUBLIC | PROTECTED | PRIVATE)? STATIC? FINAL?;
methodModifier: OVERRIDE? (ABSTRACT_KEYWORD | (PRE_MOD | POST_MOD))?;
modifier: name (name)*;
operator: PLUS | MINUS | DIV | DIVIDE | MULTIPLY | POWER | MOD;

type: (anyType | linkType) ('['']')* (NNULL_OP | NULL_OP)?;
anyType: name | primitiveType;
linkType: '@' (
    anyType           |
    CLASS_KEYWORD     |
    INTERFACE_KEYWORD |
    ENUM_KEYWORD
);

primitiveType:
    'str'      |
    'bool'     |
    'int'      |
    'float'    |
    'double'   |
    'long'     |
    'short'    |
    'byte'     |
    'obj'      |
    nullType
    ;

nullType:
    'void'     |
    'null'
    ;

arguments: argument (',' argument)*;
argument : value;

methodCall0: annotationCall* (varAccess '.')? NAME0 '(' arguments? ')';
methodCall : methodCall0 ('.' methodCall0)*;

annotationCall: '$' name ('(' arguments ')')? ENDLINE*;

constructorCall: 'new' name '(' arguments? ')';

expression       : primaryExpresion  | logicalOr | arithCondExpression                                                ;
logicalOr        : (primaryExpresion | logicalAnd) (OR  (primaryExpresion | logicalAnd | logicalOr ))?                ;
logicalAnd       : (primaryExpresion | logicalXor) (AND (primaryExpresion | logicalXor | logicalAnd))?                ;
logicalXor       : (primaryExpresion | logicalNot) (XOR (primaryExpresion | logicalNot | logicalXor))?                ;
logicalNot       : NOT? primaryExpresion                                                                              ;
primaryExpresion : bool | methodCall | varAccess | name | ( '(' expression ')' ) | constructorCall | arrayAccess      ;

arithCondExpression: arithmeticExpression (BT | LT | EQ | NE | LE | BE) arithmeticExpression                          ;

arithmeticExpression: numberExpression | addSubExpression                                                             ;
addSubExpression : modDivExpression ((PLUS | MINUS)      (numberExpression | addSubExpression))?                      ;
modDivExpression : mulDivExpression ((MOD | DIV)         (numberExpression | modDivExpression))?                      ;
mulDivExpression : powerExpression  ((MULTIPLY | DIVIDE) (numberExpression | mulDivExpression))?                      ;
powerExpression  : numberExpression (POWER               (numberExpression | powerExpression)) ?                      ;
numberExpression : (MINUS|PLUS)? (methodCall | name | numeric_value | ('(' arithmeticExpression ')')) | incrExpression;

incrExpression   : (((PLUS PLUS) | (MINUS MINUS)) (name | varAccess)) |
                   ((name | varAccess) ((PLUS PLUS) | (MINUS MINUS)))
                 ;

name      : dot_name | NAME0   ;
dot_name  : NAME0 ('.' NAME0)+ ;


numeric_value: FLOAT_VAL | INT_VAL ;

extends: EXTENDS | ':';

AS_KEYWORD     : 'as'    ;
FOR_KEYWORD    : 'for'   ;
IF_KEYWORD     : 'if'    ;
ELSE_KEYWORD   : 'else'  ;
SWITCH_KEYWORD : 'switch';

STR    : 'str'    ;
BOOL   : 'bool'   ;
INT    : 'int'    ;
FLOAT  : 'float'  ;
DOUBLE : 'double' ;
LONG   : 'long'   ;
SHORT  : 'short'  ;
BYTE   : 'byte'   ;
OBJ    : 'obj'    ;
VOID   : 'void'   ;
NULL   : 'null'   ;

DIV     : 'div';
MOD     : '%'  ;
PLUS    : '+'  ;
MINUS   : '-'  ;
MULTIPLY: '*'  ;
DIVIDE  : '/'  ;
POWER   : '**' ;

PUBLIC     : 'pub'    | 'public'   ;
PRIVATE    : 'priv'   | 'private'  ;
PROTECTED  : 'prot'   | 'protected';
STATIC     : 'static'              ;
FINAL      : 'fin'    | 'final'    ;
OVERRIDE   : 'override'            ;

TRUE : 'true'    ;
FALSE: 'false'   ;

POST_MOD  : 'post'     ;
PRE_MOD   : 'pre'      ;
OP_OV_MOD : 'operator'
    | 'op'             ;

NNULL_OP : '!!' ;
NULL_OP  : '??' ;

AND: 'and' | '&&' ;
OR:  'or'  | '||' ;
NOT: 'not' | '!'  ;
XOR: 'xor' | '^^' ;
BT : '>'          ;
LT : '<'          ;
EQ : '=='         ;
NEQ: '==='        ;
NE : '!='         ;
LE : '<='         ;
BE : '>='         ;

QUESTION_MARK : '?' ;
COLON         : ':' ;

EXTENDS: 'extends' | COLON;

CLASS_KEYWORD      : 'class'      ;
ABSTRACT_KEYWORD   : 'abstract'   ;
INTERFACE_KEYWORD  : 'interface'  ;
ANNOTATION_KEYWORD : 'annotation' ;
ENUM_KEYWORD       : 'enum'       ;
// NAMESPACE_KEYWORD  : 'namespace'  ;

INT_VAL   : [0-9]+                            ;
FLOAT_VAL : INT_VAL('.'INT_VAL)? ('f' | 'd')? ;
NAME0     : ([a-zA-Z]+ [0-9]*)+               ;
STRING_VAL: ('"' .*? '"') | ('\'' .*? '\'')   ;

ENDLINE: [\n;]                                      ;
WS: [ \t\r] -> skip                                 ;
COMMENT: (('//' .*? '\n') | ('/*' .*? '*/')) -> skip;
