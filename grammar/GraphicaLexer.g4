lexer grammar GraphicaLexer;

//Initial Keywords
Graphica            : 'Graphica';
Begin               : 'begin';
Graph               : 'graph';

//Figures
Circle              : 'circle';
Rectangle           : 'rectangle';
Square              : 'square';
Line                : 'line';

//Actions
Draw                : 'draw';

//Punctuation
L_Paren             : '(';
R_Paren             : ')';
L_Curly             : '{';
R_Curly             : '}';
Comma               : ',';
Period              : '.';
Semicolon           : ';';

//Comments, newLines
NL                  : [\r\n]+        -> channel(HIDDEN);
WS                  : [ \t]+         -> channel(HIDDEN);
COMMENT             : '/*' .*? '*/'  -> channel(HIDDEN);
LINE_COMMENT        : '//' ~[\r\n]*      -> channel(HIDDEN);

//Data fragments
fragment Digit      : [0-9];

//Data Values
Integer             : Digit+;
