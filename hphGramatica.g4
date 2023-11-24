grammar hphGramatica;

exp: TIPO ' ' ID ' ' ATR ' ' NUM;

TIPO: 'coletado' | 'dolar' | 'distancia' | 'juiz';
ATR: '<-';
AB: '(';
FB: ')';
OPA: '+' | '-' | '*' | '|' | '%';
OPL: '><' | '<>' | '>' | '<' | '=?';
ENDL: '::'; 
IF: 'aah';
ELSE:'colecao';
WHILE:'quando?';
ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+(','DIGITO+)?;
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];