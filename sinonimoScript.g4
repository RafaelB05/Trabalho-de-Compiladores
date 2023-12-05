grammar sinonimoScript;

// Definição da GLC para a linguagem
// ------------------------------------------------------

program: statement+ EOF #NProgram;

statement: (atr ENDL | dec ENDL | cond | repet | print ENDL) #NStatement;

expl: (((ID | NUM) OPC (ID | NUM)) | (ID | BOOL)) (OPL expl)? #NExpressaoLogica;

exp: (ID | NUM) (OPA exp)? #NExpressao;

atr: (dec | ID) ATR (exp | expl | STRING) #NAtribuicao;

dec: TIPO ID #NDeclaracao;

cond: IF AP expl FP AC statement* FC (ELSE AC statement* FC)? #Condicional;

repet: WHILE AP expl FP AC statement* FC #Repeticao;

print: PRINT AP (ID | NUM) FP #NPrint;

// Definição dos Tokens e Lexemas aceitos pela linguagem
// -------------------------------------------------------

TIPO: 'cheio' | 'exato' | 'risca' | 'loob'; // tipos permitidos na linguagem
ATR: '<-'; // atribuição
AP: '('; // abre parenteses antecede condição do if e while
FP: ')'; // sucede parenteses antecede condição do if e while
AC: '{'; // abre bloco de codigo
FC: '}'; // fecha bloco de codigo
OPA: '+' | '-' | '*' | '/' | '%'; // operadores aritiméticos
OPL: '||' | '&&'; // operadores lógicos
OPC: '>' | '<' | '><' | '<>'; // operadores de comparação
ENDL: '::'; // fim de linha
BOOL: 'gg' | 'ff'; // valores aceitos no boolean

IF: 'assumindo';
ELSE: 'entretanto';
WHILE: 'durante';
PRINT: 'registre';
ID: LETRA (DIGITO | LETRA)*;
NUM: DIGITO+ (',' DIGITO+)?;
STRING: '"' (LETRA | NUM)* '"';
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
WS: [ \r\t\n]+ -> skip;
