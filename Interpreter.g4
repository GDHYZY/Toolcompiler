/**
 * Define a grammar called Interpreter
 */
grammar Interpreter;

ID : [a-zA-Z_][a-zA-Z0-9_]*	;             		// match lower-case identifiers
NUM: [0-9]+;									//match integers
Eq : '==';					
Assign: '=';				
Mul : '*';
Div : '/';
Add : '+';
Sub : '-';
Inc : '++';
Dec : '--';
Ne  : '!=';
Le  : '<=';
Shl : '<<';
Lt  : '<';
Ge  : '>=';
Shr : '>>';
Gt  : '>';
Lor : '||';
Or  : '|';
Lan : '&&';
And : '&';
Xor : '^';
Mod : '%';
Brak: '[';
Cond: '?';
Til : '~';
Not : '!';          

apos: '\'';
dquo: '"'; 
    
expression : NUM						# Number
|id										# Identify
|Constant								# String
|StringLiteral							# String
|'(' expression ')'														# Subexpression	
|expression '[' expression ']'                							# Subscript
|expression '(' expression? (',' expression )* ')' 						# FunctionCall
|expression '.' ID                    									# MemberAccess
|expression '->' ID														# MemberAccess
|expression op=('++'|'--')												# PostfixIncDec
|<assoc=right> op=('++'|'--') expression      							# UnaryExpr        
|<assoc=right> op=('&' | '*' | '+' | '-' | '~' | '!') expression		# UnaryExpr
//'sizeof' '(' type ')'					#sizeofexpr
|'(' type ')' expression							# CastExpr
|expression op=('*'|'/'|'%') expression				# BinaryExpr
|expression op=('+'|'-') expression					# BinaryExpr
|expression op=('<<'|'>>') expression        		# BinaryExpr       
|expression op=('<' | '>') expression         		# BinaryExpr       
|expression op=('<='|'>=') expression         		# BinaryExpr
|expression op=('=='|'!=') expression         		# BinaryExpr       
|expression op='&' expression                		# BinaryExpr       
|expression op='^' expression                 		# BinaryExpr       
|expression op='|' expression                 		# BinaryExpr       
|expression op='&&' expression                		# BinaryExpr       
|expression op='||' expression                		# BinaryExpr     
|expression '?' expression ':' expression			# ConditionalExpr 		  
|expression op=('='|'*='|'/='|'%='|'+='|'-='|'<<='|'>>='|'&='|'^='|'|=') expression			# BinaryExpr       
;	


comment: BlockComment
	| LineComment
	;

type : 'int'  			#Int
	| 'char'			#Char
	| 'int' '*'+		#Intptr
	| 'char' '*'+		#Charptr
	;

program : global_declaration+ ;

global_declaration : enum_decl 				
	| variable_decl 						
	| function_decl 
	| comment						
	;

id : ID					# SingleIdentify 
	| Mul* ID			# PtrIdentify
	; 

enum_decl : 'enum' (id)? '{' id ('=' NUM)? (',' id ('=' NUM)? )* '}' ';';			
variable_decl : type id (',' id )* ';' ;	
function_decl : type id '(' parameter_decl ')' '{' body_decl '}' ;

parameter_decl : type id (',' type id)* 
	| comment* 
	;

body_decl : variable_decl* statement* 
	| comment*
	;
//statement : if_statement 		#IfStatement
//	| while_statement 			#WhileStatement
//	| for_statement				#ForStatement
//	| dowhile_statement			#DoWhileStatement
//	| '{' statement* '}' 		#BlockStatement
//	| 'return' expression? ';'		#ReturnStatement
//	| expression ';'					#ExprStatement
//	| ';'+						#EmptyStatement
//	;
//
//if_statement : 'if' '(' expr ')' statement ('else' statement)*;
//while_statement : 'while' '(' expr ')' statement ;
//for_statement : 'for' '(' expr? ';' expr? ';' expr?  ')' statement ;
//dowhile_statement : 'do' statement 'while' '(' expr ')' ';';
//switch_statement : 'switch' '(' expr ')' statement;


statement
    :   labeledStatement
    |   compoundStatement
    |   expressionStatement
    |   selectionStatement
    |   iterationStatement
    |   jumpStatement
    ;
labeledStatement
    :   Identifier ':' statement
    |   'case' expression ':' statement
    |   'default' ':' statement
    ;

compoundStatement
    :   '{' blockItemList? '}'
    ;
    
blockItemList
    :   blockItem
    |   blockItemList blockItem
    ;

blockItem
    :   variable_decl
    |   statement
    ;
    
expressionStatement
    :   expression? ';'
    ;
    
selectionStatement
    : 'if' '(' expression ')' statement ('else' statement)?		#IfStatement
    | 'switch' '(' expression ')' statement						#SwitchStatement
    ;

iterationStatement
    : 'while' '(' expression ')' statement						#WhileStatement
    | 'do' statement 'while' '(' expression ')' ';'				#DoWhileStatement
    | 'for' '(' expression? ';' expression? ';' expression? ')' statement		#ForStatement
    ;

jumpStatement
    : 'goto' Identifier ';'									#GotoStatement
    | 'continue' ';'										#ContinueStatement
    | 'break' ';'											#BreakStatement
    | 'return' expression? ';'									#ReturnStatement
    ;
    
    

Identifier : IdentifierNondigit ( IdentifierNondigit | Digit )* ;

fragment
IdentifierNondigit : Nondigit | UniversalCharacterName ;

fragment
Nondigit : [a-zA-Z_] ;

fragment
Digit : [0-9] ;

fragment
UniversalCharacterName : '\\u' HexQuad
    | '\\U' HexQuad HexQuad
    ;

fragment
HexQuad : HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit ;

Constant : IntegerConstant
    | FloatingConstant
    | CharacterConstant
    ;

fragment
IntegerConstant : DecimalConstant IntegerSuffix?
    | OctalConstant IntegerSuffix?
    | HexadecimalConstant IntegerSuffix?
    | BinaryConstant
    ;

fragment
BinaryConstant : '0' [bB] [0-1]+ ;

fragment
DecimalConstant : NonzeroDigit Digit* ;

fragment
OctalConstant : '0' OctalDigit* ;

fragment
HexadecimalConstant : HexadecimalPrefix HexadecimalDigit+ ;

fragment
HexadecimalPrefix : '0' [xX] ;

fragment
NonzeroDigit : [1-9] ;

fragment
OctalDigit : [0-7] ;

fragment
HexadecimalDigit : [0-9a-fA-F] ;

fragment
IntegerSuffix : UnsignedSuffix LongSuffix?
    | UnsignedSuffix LongLongSuffix
    | LongSuffix UnsignedSuffix?
    | LongLongSuffix UnsignedSuffix?
    ;

fragment
UnsignedSuffix : [uU] ;

fragment
LongSuffix : [lL] ;

fragment
LongLongSuffix : 'll' | 'LL' ;

fragment
FloatingConstant : DecimalFloatingConstant 
	| HexadecimalFloatingConstant
    ;

fragment
DecimalFloatingConstant : FractionalConstant ExponentPart? FloatingSuffix?
    | DigitSequence ExponentPart FloatingSuffix?
    ;

fragment
HexadecimalFloatingConstant
    : HexadecimalPrefix HexadecimalFractionalConstant BinaryExponentPart FloatingSuffix?
    | HexadecimalPrefix HexadecimalDigitSequence BinaryExponentPart FloatingSuffix?
    ;

fragment
FractionalConstant : DigitSequence? '.' DigitSequence
    | DigitSequence '.'
    ;

fragment
ExponentPart : 'e' Sign? DigitSequence
    | 'E' Sign? DigitSequence
    ;

fragment
Sign : '+' | '-' ;

fragment
DigitSequence : Digit+ ;

fragment
HexadecimalFractionalConstant
    : HexadecimalDigitSequence? '.' HexadecimalDigitSequence
    | HexadecimalDigitSequence '.'
    ;

fragment
BinaryExponentPart
    : 'p' Sign? DigitSequence
    | 'P' Sign? DigitSequence
    ;

fragment
HexadecimalDigitSequence : HexadecimalDigit+ ;

fragment
FloatingSuffix : 'f' | 'l' | 'F' | 'L' ;

fragment
CharacterConstant
    :   '\'' CCharSequence '\''
    |   'L\'' CCharSequence '\''
    |   'u\'' CCharSequence '\''
    |   'U\'' CCharSequence '\''
    ;

fragment
CCharSequence
    :   CChar+
    ;

fragment
CChar
    :   ~[\'\\\r\n]
    |   EscapeSequence
    ;

fragment
EscapeSequence
    :   SimpleEscapeSequence
    |   OctalEscapeSequence
    |   HexadecimalEscapeSequence
    |   UniversalCharacterName
    ;

fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;

fragment
OctalEscapeSequence
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' OctalDigit OctalDigit OctalDigit
    ;

fragment
HexadecimalEscapeSequence
    :   '\\x' HexadecimalDigit+
    ;

StringLiteral
    :   EncodingPrefix? '"' SCharSequence? '"'
    ;

fragment
EncodingPrefix
    :   'u8'
    |   'u'
    |   'U'
    |   'L'
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;
    
Whitespace : [ \t]+ -> skip ;

Newline : (   '\r' '\n'? | '\n' ) -> skip ;

BlockComment : '/*' .*? '*/' -> skip ;

LineComment : '//' ~[\r\n]* -> skip ;