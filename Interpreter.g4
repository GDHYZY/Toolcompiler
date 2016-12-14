/**
 * Define a grammar called Interpreter
 */
grammar Interpreter;


Whitespace :  [ \t]+ -> skip;
Newline :   (   '\r' '\n'? |  '\n' ) -> skip ;
    
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
BCMT : '/*' .*? '*/' -> skip;
LCMT: '//' (~('\n'|'\r'))* '\r'? '\n' -> skip;     
CODING : .*? ;

expr : NUM								# Number
|expr '[' expr ']'                		# Subscript
|expr '(' expr? (',' expr )* ')' 		# FunctionCall
|expr '.' ID                    		# MemberAccess
|expr '->' ID							# MemberAccess
|expr op=('++'|'--')					# PostfixIncDec
|<assoc=right> op=('++'|'--') expr      # UnaryExpr        
|<assoc=right> op=('&' | '*' | '+' | '-' | '~' | '!') (NUM|expr)		# UnaryExpr
//|'sizeof' '(' type ')'					#sizeofexpr
|expr op=('*'|'/'|'%') expr				# BinaryExpr
|expr op=('+'|'-') (NUM|expr)			# BinaryExpr
|expr op=('<<'|'>>') expr        		# BinaryExpr       
|expr op=('<' | '>') expr         		# BinaryExpr       
|expr op=('<='|'>=') expr         		# BinaryExpr
|expr op=('=='|'!=') expr         		# BinaryExpr       
|expr op='&' expr                		# BinaryExpr       
|expr op='^' expr                 		# BinaryExpr       
|expr op='|' expr                 		# BinaryExpr       
|expr op='&&' expr                		# BinaryExpr       
|expr op='||' expr                		# BinaryExpr       
|expr op='=' expr   					# BinaryExpr       
|id										# Identify
|'(' expr ')'							# SubExpression	
|apos CODING apos						# String
|dquo CODING dquo						# String
;	

apos: '\'';
dquo: '"'; 

comment: BCMT
	| LCMT
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
statement : if_statement 		#IfStatement
	| while_statement 			#WhileStatement
	| '{' statement* '}' 		#BlockStatement
	| 'return' expr? ';'		#ReturnStatement
	| expr ';'					#ExprStatement
	| ';'+						#EmptyStatement
	;

if_statement : 'if' '(' expr ')' statement ('else' statement)*;
while_statement : 'while' '(' expr ')' statement ;

