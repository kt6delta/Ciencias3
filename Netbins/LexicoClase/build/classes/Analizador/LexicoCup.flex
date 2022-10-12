package Analizador;
import java_cup.runtime.Symbol;  /*diferente*/
%%
%class LexicoCup
%type java_cup.runtime.Symbol
%cup  /*analisis*/
%full   /*retornar cadena*/
%line  /*regresa linea*/
%char  /*regresa columna*/
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
/* Palabra reservada Int */
( int ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Tipos de datos */
( byte | int | char | long | float | double | short | long | const ) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}

/* Tipo de dato String */
( String ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Palabra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palabra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palabra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}



/* Palabra reservada switch*/
( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}

/* Palabra reservada include*/
( include ) {return new Symbol(sym.Include, yychar, yyline, yytext());}

/* Palabra reservada define*/
( define ) {return new Symbol(sym.Define, yychar, yyline, yytext());}

/* Palabra reservada break*/
( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}

/* Palabra reservada case*/
( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());}

/* Palabra reservada continue*/
( continue ) {return new Symbol(sym.Continue, yychar, yyline, yytext());}

/* Palabra reservada default*/
( default ) {return new Symbol(sym.Default, yychar, yyline, yytext());}

/* Palabra reservada register*/
( register ) {return new Symbol(sym.Register, yychar, yyline, yytext());}

/* Palabra reservada return*/
( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}

/* Palabra reservada unsigned */
( unsigned ) {return new Symbol(sym.Unsigned, yychar, yyline, yytext());}

/* Palabra reservada struct */
( struct ) {return new Symbol(sym.Struct, yychar, yyline, yytext());}

/* Palabra reservada typeof */
( typeof ) {return new Symbol(sym.Typeof, yychar, yyline, yytext());}

/* Palabra reservada void */
( void ) {return new Symbol(sym.Void, yychar, yyline, yytext());}

/* Palabra funcion using */
( using ) {return new Symbol(sym.Using, yychar, yyline, yytext());}

/* Palabra funcion cin */
( cin ) {return new Symbol(sym.Cin, yychar, yyline, yytext());}

/* Palabra funcion cout */
( cout ) {return new Symbol(sym.Cout, yychar, yyline, yytext());}

/* Palabra funcion namespace */
( namespace ) {return new Symbol(sym.Namespace, yychar, yyline, yytext());}

/* Palabra funcion std */
( std ) {return new Symbol(sym.Std, yychar, yyline, yytext());}

/* Palabra funcion scanf  */
( scanf ) {return new Symbol(sym.Scanf, yychar, yyline, yytext());}

/* Palabra funcion Printf */
( printf ) {return new Symbol(sym.Printf, yychar, yyline, yytext());}

/* Operador Numeral #*/
( "#" ) {return new Symbol(sym.Numeral, yychar, yyline, yytext());}



/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ("({L}">{D}")") | ("({L}"<{D}")") | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operador Diple_a */
( "<" ) {return new Symbol(sym.Diple_a, yychar, yyline, yytext());}

/* Operador Diple_c */
( ">" ) {return new Symbol(sym.Diple_c, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( true | false ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parent_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parent_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Coma */
( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Punto */
( "." ) {return new Symbol(sym.Punto, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
