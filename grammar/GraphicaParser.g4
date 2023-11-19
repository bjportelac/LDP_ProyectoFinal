parser grammar GraphicaParser;

options {
    tokenVocab = GraphicaLexer;
}

sourceFile: Graphica Begin Period Graph canva L_Curly sentences R_Curly;

canva : L_Paren (Integer Comma Integer)? R_Paren;

sentences : sentence*;

sentence: Draw Period(drawCircle | drawSquare)* NL*;

//Figures
drawCircle: Circle L_Paren (Integer Comma Integer Comma Integer) R_Paren Semicolon;
drawSquare: Square L_Paren (Integer Comma Integer Comma Integer) R_Paren Semicolon;

