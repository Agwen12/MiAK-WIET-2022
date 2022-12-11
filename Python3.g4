grammar Python3; // tiny version

tokens { INDENT, DEDENT }


// this embedded code section will be copied to the generated file: Python3Lexer.java
@lexer::header {
package org.example;

import org.antlr.v4.runtime.misc.Interval;
import java.util.*;

}


// this embedded code section will be copied to the generated file: Python3Lexer.java
@lexer::members {

}

/*
 * parser rules
 */

@parser::header {                                                     //*** https://github.com/antlr/antlr4/blob/master/doc/grammars.md#actions-at-the-grammar-level
package org.example;
}


// startRules:


EQUAL : '=' ;
BREAK : 'break' ;
CONTINUE : 'continue' ;
IF : 'if' ;
COLON : ':' ;
ELIF : 'elif' ;
ELSE : 'else' ;
WHILE : 'while' ;
MUL : '*' ;
DIV : '/' ;
MOD : '%' ;
ADD : '+' ;
SUB : '-' ;
LT : '<' ;
GT : '>' ;
LE : '<=' ;
GE : '>=' ;
EQUAL_EQUAL : '==' ;
NOT_EQUAL : '!=' ;
PRINT : 'print' ;

file_input: (NEWLINE | stmt)* EOF #FileInput
          ;

stmt: assignment_stmt
    | expr
//    | compound_stmt #CompuntStmt
    ;

//small_stmt: assignment_stmt # Assignment
//          | flow_stmt #FlowStms
//          | print_stmt #Print
//          | expr #
//          ;

assignment_stmt: TYPE NAME '=' expr # Assignment
               | 'string' NAME '=' STRING # AssignmentString
               ;
//flow_stmt: break_stmt
//         | continue_stmt
//         ;

//break_stmt: 'break'
//          ;

//continue_stmt: 'continue'
//             ;

print_stmt: 'print' (STRING | expr) # Print
          ;

expr: OPEN_PAREN expr CLOSE_PAREN # ExprParen
    | expr MUL expr # Multiplication
    | expr DIV expr # Division
    | expr ADD expr # Addition
    | expr SUB expr # Subtraction
    | NAME          # Variable
    | NUMBER        # Number
    | FLOAT_NUMBER  # FloatNumber
    | BOOLEAN       # Boolean
    ;

//compound_stmt: if_stmt | while_stmt;
//if_stmt: 'if' OPEN_PAREN cond_expression CLOSE_PAREN ':' suite ('elif' OPEN_PAREN cond_expression CLOSE_PAREN ':' suite)* ('else'  ':' suite)? END;
//while_stmt: 'while' OPEN_PAREN cond_expression CLOSE_PAREN ':' suite END;
//suite:  NEWLINE stmt+;

//cond_expression: logicalOrExpression;
//
//multiplicativeExpression
// :   expr (('*'|'/'|'%') expr)*
// ;
//
//additiveExpression
// :   multiplicativeExpression (('+'|'-') multiplicativeExpression)*
// ;
//relationalExpression
// :   additiveExpression (('<'|'>'|'<='|'>=') additiveExpression)*
// |   NOT OPEN_PAREN  additiveExpression (('<'|'>'|'<='|'>=') additiveExpression)* CLOSE_PAREN
// ;
//
//equalityExpression
// :  relationalExpression (('=='| '!=') relationalExpression)*
// |  NOT OPEN_PAREN relationalExpression (('=='| '!=') relationalExpression)* CLOSE_PAREN
// ;
//
//logicalAndExpression
// :  equalityExpression (AND equalityExpression)*
// |  NOT OPEN_PAREN  equalityExpression (AND  equalityExpression)* CLOSE_PAREN
// ;
//
//logicalOrExpression
// :   logicalAndExpression ( OR logicalAndExpression)*
// |   NOT OPEN_PAREN logicalAndExpression ( OR logicalAndExpression)* CLOSE_PAREN
// ;

//  ( type ) expr
//castExpression
// :  OPEN_PAREN TYPE CLOSE_PAREN expr
// ;



/*
 * lexer rules
 */

TYPE
 : 'string'
 | 'int'
 | 'long'
 | 'float'
 | 'double'
 | 'boolean'
 ;

STRING
 : STRING_LITERAL
 ;

NUMBER
 : INTEGER
 ;

INTEGER
 : DECIMAL_INTEGER
 ;

BOOLEAN
 : 'Yass'
 | 'Nyet'
 ;

NEWLINE
 : ( '\r'? '\n' | '\r' | '\f' ) SPACES?
 ;

END
 : 'end'
 ;
//
//LOGICAL_OP
// : 'and'
// | 'or'
// ;

AND
 : 'and'
 ;

OR
 : 'or'
 ;

NOT
 : '!'
 ;

NAME
 : ID_START ID_CONTINUE*
 ;

STRING_LITERAL
 : '"' .*? '"'
 ;

DECIMAL_INTEGER
 : NON_ZERO_DIGIT DIGIT*
 | '0'+
 ;

FLOAT_NUMBER
 : DIGIT* '.' DIGIT*
 ;

OPEN_PAREN : '(';
CLOSE_PAREN : ')';
OPEN_BRACK : '[';
CLOSE_BRACK : ']';
OPEN_BRACE : '{';
CLOSE_BRACE : '}';

SKIP_
 : ( SPACES | COMMENT | LINE_JOINING ) -> skip
 ;

UNKNOWN_CHAR
 : .
 ;


/*
 * fragments
 */

fragment NON_ZERO_DIGIT
 : [1-9]
 ;

fragment DIGIT
 : [0-9]
 ;

fragment SPACES
 : [ \t]+
 ;

fragment COMMENT
 : '#' ~[\r\n\f]*
 ;

fragment LINE_JOINING
 : '\\' SPACES? ( '\r'? '\n' | '\r' | '\f' )
 ;

fragment ID_START
 : '_'
 | [A-Z]
 | [a-z]
 ;

fragment ID_CONTINUE
 : ID_START
 | [0-9]
 ;
