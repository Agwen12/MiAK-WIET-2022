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
NOT : '!';
AND : 'and';
OR : 'or';

file_input: (NEWLINE | stmt)* EOF #FileInput
          ;

stmt: assignment_stmt
    | expr
    | logical_expr
    | condition
    | print_stmt
    ;

//small_stmt: assignment_stmt # Assignment
//          | flow_stmt #FlowStms
//          | print_stmt #Print
//          | expr #
//          ;

assignment_stmt: TYPE NAME '=' expr # Assignment
               ;
//flow_stmt: break_stmt
//         | continue_stmt
//         ;

//break_stmt: 'break'
//          ;

//continue_stmt: 'continue'
//             ;

print_stmt: PRINT (STRING | expr) # Print
          ;

expr: OPEN_PAREN expr CLOSE_PAREN # ExprParen
    | expr MUL expr # Multiplication
    | expr DIV expr # Division
    | expr ADD expr # Addition
    | expr SUB expr # Subtraction
    | NAME          # Variable
    | NUMBER        # Number
    | FLOAT_NUMBER  # FloatNumber
    | BOOLEAN       # Bool
    | STRING        # StringWord
    ;

logical_expr: NOT OPEN_PAREN logical_expr CLOSE_PAREN  # Not
            | OPEN_PAREN logical_expr CLOSE_PAREN # ExprParenLog
            | logical_expr AND logical_expr # And
            | logical_expr OR logical_expr # Or
            | expr GT expr   # Gt
            | expr LT expr   # Lt
            | expr GE expr  # Get
            | expr LE expr  # Let
            | expr EQUAL_EQUAL expr  # Eq
            | expr NOT_EQUAL expr  # Neq
            ;

condition: IF condition_block (ELIF condition_block)* (ELSE block)?
         ;

condition_block: OPEN_PAREN logical_expr CLOSE_PAREN block
               ;

block: COLON NEWLINE (stmt NEWLINE)* END NEWLINE?
     ;

/*
 * lexer rules
 */

//todo:castowanie

TYPE
 : 'string'
 | 'int'
 | 'float'
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
 : 'true'
 | 'false'
 ;

NEWLINE
 : ( '\r'? '\n' | '\r' | '\f' ) SPACES?
 ;

END
 : 'end'
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
