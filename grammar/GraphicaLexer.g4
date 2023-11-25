lexer grammar GraphicaLexer;

//Reverved words
From                : 'from';
Import              : 'import';
Graphica            : 'Graphica';
New                 : 'new';

//libraries
Basic               : 'Basic';
Objects             : 'Objects';

//Initial Keywords
Begin               : 'begin';
Graph               : 'graph';

//Objects lib
Coordinates         : 'Coordinate';
Obj_Circle          : 'Circle';
Obj_Square          : 'Square';
Obj_Rect            : 'Rect';
Obj_Ellipse         : 'Ellipse';
Obj_Line            : 'Line';
Obj_Polyline        : 'Polyline';
Obj_Polygon         : 'Polygon';

Fill                : 'Fill';
RGB                 : 'RGB';
Stroke              : 'Stroke';
FillType            : 'butt' | Square | 'round';
IStyle              : 'IStyle';


//Figures
Circle              : 'circle';
Rectangle           : 'rectangle';
Square              : 'square';
Ellipse             : 'ellipse';
Line                : 'line';
Polyline            : 'polyline';

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
Assign              : '=';
Quote               : '"';

//Comments, newLines
NL                  : [\r\n]+        -> channel(HIDDEN);
WS                  : [ \t]+         -> channel(HIDDEN);
COMMENT             : '/*' .*? '*/'  -> channel(HIDDEN);
LINE_COMMENT        : '//' ~[\r\n]*      -> channel(HIDDEN);

//Data fragments
fragment Digit      : [0-9];

//Data Values
Integer             : Digit+;
Double              : Digit+ Period Digit* | Period Digit+ ;

//Identifiers
ID                  : [a-zA-Z$_][a-zA-Z0-9$_]*;
