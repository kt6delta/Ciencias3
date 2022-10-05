package Analizador;
import static Analizador.Tokens.*;
%%
%class Lexico
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexemas;
%}
%%
(int) {lexemas=yytext(); return Int;}
/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}

/* Tipos de datos */
( byte | int | char | long | float | double | short | long | const ) {lexemas=yytext(); return T_dato;}

/* Tipo de dato String */
( String ) {lexemas=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexemas=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexemas=yytext(); return Else;}

/* Palabra reservada While */
( while ) {lexemas=yytext(); return While;}

/* Palabra reservada do*/
( do ) {lexemas=yytext(); return Do;}

/* Palabra reservada for*/
( for ) {lexemas=yytext(); return For;}



/* Palabra reservada switch*/
( switch ) {lexemas=yytext(); return Switch;}

/* Palabra reservada include*/
( include ) {lexemas=yytext(); return Include;}

/* Palabra reservada define*/
( define ) {lexemas=yytext(); return Define;}

/* Palabra reservada break*/
( break ) {lexemas=yytext(); return Break;}

/* Palabra reservada case*/
( case ) {lexemas=yytext(); return Case;}

/* Palabra reservada continue*/
( continue ) {lexemas=yytext(); return Continue;}

/* Palabra reservada default*/
( default ) {lexemas=yytext(); return Default;}

/* Palabra reservada register*/
( register ) {lexemas=yytext(); return Register;}

/* Palabra reservada return*/
( return ) {lexemas=yytext(); return Return;}

/* Palabra reservada unsigned */
( unsigned ) {lexemas=yytext(); return Unsigned ;}

/* Palabra reservada struct */
( struct ) {lexemas=yytext(); return Struct ;} 

/* Palabra reservada typeof */
( typeof ) {lexemas=yytext(); return Typeof ;}

/* Palabra reservada void */
( void ) {lexemas=yytext(); return Void;}

/* Llave de #*/
( "#" ) {lexemas=yytext(); return Numeral;}



/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexemas=yytext(); return Op_logico;}

/* Operador Division */
( "/" ) {lexemas=yytext(); return Division;}

/* Operador Diple_a */
( "<" ) {lexemas=yytext(); return Diple_a ;}

/* Operador Diple_c */
( ">" ) {lexemas=yytext(); return Diple_c;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexemas = yytext(); return Op_atribucion;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parent_a;}

/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parent_c;}

/* Corchete de apertura */
( "[" ) {lexemas=yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexemas=yytext(); return Corchete_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

/* Punto y Coma */
( ";" ) {lexemas=yytext(); return P_coma;}

/* Dos puntos*/
( ":" ) {lexemas=yytext(); return P_puntos;}

/* Punto */
( "." ) {lexemas=yytext(); return Punto;}

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;}

/*Operadores Relacionales */
( ("({L}">{D}")") | ("({L}"<{D}")") | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexemas = yytext(); return Op_relacional;}

/* Error de analisis */
 . {return ERROR;}

