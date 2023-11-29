grammar hphGramatica;

// Definição da GLC para a linguagem
// ------------------------------------------------------

program: statement+ EOF;

statement: atr ENDL
         | dec ENDL
         | cond 
         | repet
         | print ENDL
         ;
expl: (ID | NUM) (OPC (ID | NUM))+ | (ID | BOOL) (OPL (ID | BOOL))+;
exp: (ID | NUM) (OPA (ID | NUM))*; 
dec: TIPO (ID | atr);
atr: ID ATR (exp | expl | STRING); //

cond: IF AP expl FP AC statement* FC (ELSE AC statement* FC)?;
repet: WHILE AP expl FP AC statement* FC;
print: PRINT AP (ID | NUM) FP;

// Definição dos Tokens e Lexemas aceitos pela linguagem
// -------------------------------------------------------

TIPO: 'int' | 'real' | 'string' | 'bool'; // tipos permitidos na linguagem
ATR: '='; // atribuição
AP: '('; // abre parenteses antecede condição do if e while
FP: ')'; // sucede parenteses antecede condição do if e while
AC: '{'; // abre bloco de codigo
FC: '}'; // fecha bloco de codigo
OPA: '+' | '-' | '*' | '/' | '%'; // operadores aritiméticos
OPL: '||' | '&&'; // operadores lógicos
OPC: '>' | '<' | '=='; // operadores de comparação
ENDL: ';'; // fim de linha
BOOL: 'true' | 'false'; // valores aceitos no boolean

IF: 'if';
ELSE: 'else';
WHILE: 'while';
PRINT: 'print';
ID: LETRA (DIGITO | LETRA)*;
NUM: DIGITO+ (',' DIGITO+)?;
STRING: '\'' (LETRA | NUM)* '\'';
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
WS: [ \r\t\n]+ -> skip;
