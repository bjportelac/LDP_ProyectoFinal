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

point : L_Paren Integer Comma Integer R_Paren;

//Code Sentences
sentences : sentence* objectsLibElem*;
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

//Objects Lib
coordinate: Coordinates ID Assign New Coordinates L_Paren(Integer (Comma Integer)?)R_Paren Semicolon;

objectsLibElem : rgbColor | fill | stroke | istyle | shape | objsectsLibFunctions;

rgbColor:  RGB ID Assign New RGB L_Paren((Integer (Comma Integer)+)?)R_Paren Semicolon;
fill: Fill ID Assign New Fill L_Paren ( ( ( (L_Paren(Integer (Comma Integer)+) R_Paren) | ID) Comma Double)? )R_Paren Semicolon;
stroke: Stroke ID Assign New Stroke L_Paren ( ( ( (L_Paren(Integer (Comma Integer)+) R_Paren) | ID) Comma Double Comma Double Comma (Quote FillType Quote) )? )R_Paren Semicolon;
istyle: IStyle ID Assign New IStyle L_Paren (ID Comma ID Comma Double) R_Paren Semicolon;

shape : circle | square | rect | ellipse | line | polyline | polygon ;

circle : Obj_Circle ID Assign New Obj_Circle  L_Paren( Integer (Comma Integer)* Comma ID )R_Paren Semicolon;
square : Obj_Square ID Assign New Obj_Square  L_Paren( Integer (Comma Integer)* Comma ID )R_Paren Semicolon;
rect : Obj_Rect ID Assign New Obj_Rect L_Paren( Integer (Comma Integer)* Comma ID )R_Paren Semicolon;
ellipse: Obj_Ellipse ID Assign New Obj_Ellipse L_Paren( Integer (Comma Integer)* Comma ID )R_Paren Semicolon;
line: Obj_Line ID Assign New Obj_Line L_Paren( point (Comma point)* Comma ID )R_Paren Semicolon;
polyline: Obj_Polyline ID Assign New Obj_Polyline L_Paren( point (Comma point)* Comma ID )R_Paren Semicolon;
polygon: Obj_Polygon ID Assign New Obj_Polygon L_Paren( point (Comma point)* Comma ID )R_Paren Semicolon;

//ObjsectsLibFunctions
objsectsLibFunctions : dotDraw;
dotDraw: ID Period Draw Semicolon ;
