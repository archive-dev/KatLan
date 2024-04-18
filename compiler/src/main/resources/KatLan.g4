grammar KatLan;


class: package? importBlock (classDef | interfaceDef | unnamedClassDef);

package: 'package' name ENDLINE+;
importBlock: (importStatement)*;
importStatement: 'import' name ('as' name)? ENDLINE+;

unnamedClassDef: ('extends' name (',' name)* ENDLINE+)? classBlock? block?;

classDef: access ((ABSTRACT_KEYWORD? CLASS_KEYWORD) | ENUM_KEYWORD) name (':' name (',' name)*)?
        '{' ENDLINE* classBlock? ENDLINE* '}';
interfaceDef: access INTERFACE_KEYWORD name (':' name (',' name)*)?
        '{' ENDLINE* classBlock? ENDLINE* '}';

classBlock: (
    (var |
    methodDef |
    constructorDef)
    ENDLINE+
    )+
;

block: lineBlock*;
lineBlock: ((var | varAssignment | methodCall | statement) (ENDLINE+ | EOF));

value: bool | expression | arithmeticExpression | name | STRING_VAL | anyType | arrayAccess;
bool: TRUE | FALSE;

varAssignment: (varAccess '=' value) | incrExpression;

varAccess : NAME0 ('.' varAccess)?;
arrayAccess: varAccess arrayAccess0+;
arrayAccess0: ('[' arithmeticExpression ']');

methodDef: access ABSTRACT_KEYWORD? 'def' name '(' parameters? ')' ':' type '{' ENDLINE* block ENDLINE* '}';
constructorDef: access 'def' name '(' parameters? ')' '{' block '}';
parameters: (parameter) (',' parameter)*;
parameter: name ':' type ('=' value)?;

var: varDef | constDef;

constDef: access (constDef0 | constDef1);
constDef0: 'const' name ':' type '=' value;
constDef1: 'const' (name '=' value) (',' name '=' value)+ ':' type;

varDef: access (varDef0 | varDef1);
varDef0: 'var' name ':' type ('=' value)?     ;
varDef1: 'var' subVD1 (',' subVD1)+ ':' type  ;
subVD1 : name ('=' value)                     ;

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

foriLoop: 'for' '(' varDef? ENDLINE expression? ENDLINE varAssignment?')' ENDLINE* (('{' ENDLINE* block '}') | lineBlock);
foriLoop0: 'for' '(' name ':' type ',' value '..' value ')' ENDLINE* (('{' ENDLINE* block '}') | lineBlock);

access: (PUBLIC | PROTECTED | PRIVATE)? STATIC? FINAL?;

type: (anyType | linkType) ('['']')*;
anyType: name | primitiveType;
linkType: '@' (
    anyType |
    CLASS_KEYWORD |
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
    'void'               |
    'null'
    ;

arguments: argument (',' argument)*;
argument : value;

methodCall0: (varAccess '.')? NAME0 '(' arguments? ')';
methodCall : methodCall0 ('.' methodCall0)*;

constructorCall: 'new' name '(' arguments? ')';

expression       : primaryExpresion  | logicalOr | arithCondExpression                                                ;
logicalOr        : (primaryExpresion | logicalAnd) (OR  (primaryExpresion | logicalAnd | logicalOr ))?                ;
logicalAnd       : (primaryExpresion | logicalXor) (AND (primaryExpresion | logicalXor | logicalAnd))?                ;
logicalXor       : (primaryExpresion | logicalNot) (XOR (primaryExpresion | logicalNot | logicalXor))?                ;
logicalNot       : NOT? primaryExpresion                                                                              ;
primaryExpresion : bool | methodCall | name | varAccess | ( '(' expression ')' ) | constructorCall | arrayAccess      ;

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

AS_KEYWORD    : 'as'    ;
FOR_KEYWORD   : 'for'   ;
IF_KEYWORD    : 'if'    ;
ELSE_KEYWORD  : 'else'  ;
SWITCH_KEYWORD: 'switch';

STR:    'str'    ;
BOOL:   'bool'   ;
INT:    'int'    ;
FLOAT:  'float'  ;
DOUBLE: 'double' ;
LONG:   'long'   ;
SHORT:  'short'  ;
BYTE:   'byte'   ;
OBJ:    'obj'    ;
VOID:   'void'   ;
NULL:   'null'   ;

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

TRUE : 'true'    ;
FALSE: 'false'   ;

AND: 'and' | '&&';
OR:  'or'  | '||';
NOT: 'not' | '!' ;
XOR: 'xor' | '^^';
BT : '>'         ;
LT : '<'         ;
EQ : '=='        ;
NE : '!='        ;
LE : '<='        ;
BE : '>='        ;

CLASS_KEYWORD     : 'class'    ;
ABSTRACT_KEYWORD  : 'abstract' ;
INTERFACE_KEYWORD : 'interface';
ENUM_KEYWORD      : 'enum'     ;

INT_VAL   : [0-9]+                            ;
FLOAT_VAL : INT_VAL('.'INT_VAL)? ('f' | 'd')? ;
NAME0     : ([a-zA-Z]+ [0-9]*)+               ;
STRING_VAL: ('"' .*? '"') | ('\'' .*? '\'')   ;

ENDLINE: [\n;]                                      ;
WS: [ \t\r] -> skip                                 ;
COMMENT: (('//' .*? '\n') | ('/*' .*? '*/')) -> skip;
