parser grammar GraphicaParser;

options {
    tokenVocab = GraphicaLexer;
}

sourceFile: (importStatements)+ (coordinate)* initialize;

//Libraries Import
importStatements: From Graphica Import L_Curly libraries R_Curly;
libraries: lib (Comma lib)*;
lib: Basic | (Objects)?;

//Initialization
initialize : Begin Period Graph canvas L_Curly sentences R_Curly;

//Canvas Setting
canvas : L_Paren (Integer Comma Integer)? R_Paren;

//Coordinates objects:
coordinate: Coordinates ID Assign New Coordinates L_Paren(Integer (Comma Integer)?)R_Paren Semicolon;
point : L_Paren Integer Comma Integer R_Paren;

//Code Sentences
sentences : sentence*;
sentence: Draw Period(basicFigures)+;

basicFigures : drawSquare | drawCircle | drawEllipse | drawRect | drawLine | drawPolyline;
//Figures
drawCircle: Circle L_Paren ( (Integer Comma Integer Comma Integer)
                           | (ID Comma Integer)
                           | (point Comma Integer)
                           ) R_Paren Semicolon;

drawSquare: Square L_Paren ((Integer Comma Integer Comma Integer)
                           | (ID Comma Integer)
                           | (point Comma Integer)
                           ) R_Paren Semicolon;

drawEllipse: Ellipse L_Paren (Integer (Comma Integer)+
                             | (point (Comma Integer)+)
                             | (ID (Comma Integer)+)
                             ) R_Paren Semicolon;

drawRect: Rectangle L_Paren ( (Integer(Comma Integer)+)
                            | ID Comma (Integer (Comma Integer)+)
                            | point Comma (Integer (Comma Integer)+)
                            ) R_Paren Semicolon;

drawLine: Line L_Paren ( (Integer(Comma Integer)+)
                         | (point Comma (Integer Comma Integer))
                         | (point (Comma point)+)
                         | (ID (Comma ID)+)
                         | (ID Comma (Integer Comma Integer)) ) R_Paren Semicolon;

drawPolyline: Polyline L_Paren (point (Comma point)+) R_Paren Semicolon;