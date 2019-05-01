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
    | 'if' condition 'and' condition
    | 'if' condition 'or' condition
    | 'if' condition 'and' if_statement
    | 'if' condition 'or' if_statement
    ;
condition:
    | 'any of' any
    | 'having' having
    | 'within' within
    ;
any:
    | LETRA+
    ;

having:
    | different
    | same
    ;
different:
    | 'different' LETRA+
    ;
same:
    | 'same' LETRA+
    ;

within:
    | time operador
    | time
    ;
operador:
    | 'greater than'
    ;
time:
    | DIGIT tipo
    ;
tipo:
    |'minutes'
    | 'hours'
    ;

DIGIT: [0-9];
LETRA: ('-'|[A-Za-z])+;
WS: (' '
    | '\t'
    | '\n'
    | '\r')+ ->skip;