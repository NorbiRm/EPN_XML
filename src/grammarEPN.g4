grammar grammarEPN;
expr:
    | statement
    ;
statement:
    | if_statement 'and' if_statement
    | if_statement
    ;
if_statement:
    | 'if' condition
    | 'if' condition ( 'and' | 'or') condition
    | 'if' condition ( 'and' | 'or') if_statement
    ;
condition:
    | ('any of' | 'any') any
    | 'having' having
    | 'within' within
    ;
any:
    | (LETRA+' ')+
    ;
having:
    ('different' | 'same' | 'equals') value
    ;
campo:
    | LETRA+
    ;
within:
    | time operador value condition
    | time value condition
    | time condition
    | time
    ;
operador:
    | 'greater than' | 'greater' | 'less than'
    | 'for' | 'than' | 'as' | 'earlier than' |
    ;
value:
    | DIGIT LETRA+
    | LETRA+
    ;
time:
    | DIGIT tipo
    ;
tipo:
    |('minutes' | 'hours')
    ;

DIGIT: [0-9];
LETRA: ('-'|[A-Za-z])+;
WS: (' '
    | '\t'
    | '\n'
    | '\r')+ ->skip;