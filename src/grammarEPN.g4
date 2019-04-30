grammar grammarEPN;
input
    :conition+;

condition:
    |'if' '(' expr operand expr ')' 'then'
    | 'if' expr 'then'
    ;
expr:
    | 'IP security' 'DDOs Attacks'
    ;
operand:
    | 'AND' 'OR' 'NOT'
    | ' ' //quise poner epsilon
    ;
DIGIT: [0-9];
WS
    : (' '
    | '\t'
    | '\n'
    | '\r')+ ->skip