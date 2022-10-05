package Analizador;
import java_cup.runtime.Symbol;/*Cup utiliza Simbolos*/
%%
%class LexicoCup
%type java_cup.runtime.Symbol
%cup /*regresa el analisis*/
%full /*retornar toda la cadena*/
%line /*retorna la linea en la que se encuentra*/
%char /*regresa la columna en la que se encuentra*/
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){/*type es el tipo que se esta analizando y object value que analiza la cadena y es muy util para el manejo de errores*/
        return new Symbol(type, yyline, yycolumn, value);/*yyline es para la linea, yycolumn columna de lo que se esta analizando*/
    }
    /*Cadena sin analizar*/
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%% /*palabras reservadas*/

/* Palabra reservada Int */
( int ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Tipo de dato byte */
( byte ) {return new Symbol(sym.Byte, yychar, yyline, yytext());}

/* Tipo de dato int */
( "int" ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

/* Tipo de dato char */
( char ) {return new Symbol(sym.Char, yychar, yyline, yytext());}

/* Tipo de dato long */
( long ) {return new Symbol(sym.Long, yychar, yyline, yytext());}

/* Tipo de dato float */
( float ) {return new Symbol(sym.Float, yychar, yyline, yytext());}

/* Tipo de dato double */
( double ) {return new Symbol(sym.Double, yychar, yyline, yytext());}

/* Tipo de dato String */
( String ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Palabra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palabra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Palabra reservada Auto */
( auto ) {return new Symbol(sym.Auto, yychar, yyline, yytext());}

/* Palabra reservada Break */
( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}

/* Palabra reservada Case */
( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());}

/* Palabra reservada Const */
( const ) {return new Symbol(sym.Const, yychar, yyline, yytext());}

/* Palabra reservada Continue */
( continue ) {return new Symbol(sym.Continue, yychar, yyline, yytext());}

/* Palabra reservada Default */
( default ) {return new Symbol(sym.Default, yychar, yyline, yytext());}

/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palabra reservada Enum */
( enum ) {return new Symbol(sym.Enum, yychar, yyline, yytext());}

/* Palabra reservada Extern */
( extern ) {return new Symbol(sym.Extern, yychar, yyline, yytext());}

/* Palabra reservada Goto */
( goto ) {return new Symbol(sym.Goto, yychar, yyline, yytext());}

/* Palabra reservada Register */
( register ) {return new Symbol(sym.Register, yychar, yyline, yytext());}

/* Palabra reservada Return */
( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}

/* Palabra reservada Short */
( short ) {return new Symbol(sym.Short, yychar, yyline, yytext());}

/* Palabra reservada Signed */
( signed ) {return new Symbol(sym.Signed, yychar, yyline, yytext());}

/* Palabra reservada Sizeof */
( sizeof ) {return new Symbol(sym.Sizeof, yychar, yyline, yytext());}

/* Palabra reservada Static */
( static ) {return new Symbol(sym.Static, yychar, yyline, yytext());}

/* Palabra reservada Struct */
( struct ) {return new Symbol(sym.Struct, yychar, yyline, yytext());}

/* Palabra reservada Switch */
( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}

/* Palabra reservada Typedef */
( typedef ) {return new Symbol(sym.Typedef, yychar, yyline, yytext());}

/* Palabra reservada Union */
( union ) {return new Symbol(sym.Union, yychar, yyline, yytext());}

/* Palabra reservada Unsigned */
( unsigned ) {return new Symbol(sym.Unsigned, yychar, yyline, yytext());}

/* Palabra reservada Void */
( void ) {return new Symbol(sym.Void, yychar, yyline, yytext());}

/* Palabra reservada Volatile */
( volatile ) {return new Symbol(sym.Volatile, yychar, yyline, yytext());}

/* Palabra reservada Try */
( try ) {return new Symbol(sym.Try, yychar, yyline, yytext());}

/* Palabra reservada Catch */
( catch ) {return new Symbol(sym.Catch, yychar, yyline, yytext());}

/* Palabra reservada include */
( include ) {return new Symbol(sym.Include, yychar, yyline, yytext());}

/* Palabra reservada using */
( using ) {return new Symbol(sym.Using, yychar, yyline, yytext());}

/* Palabra reservada namespace */
( namespace ) {return new Symbol(sym.Namespace, yychar, yyline, yytext());}

/* Palabra reservada std */
( std ) {return new Symbol(sym.Std, yychar, yyline, yytext());}

/* Palabra reservada cin */
( cin ) {return new Symbol(sym.Cin, yychar, yyline, yytext());}

/* Palabra reservada cout */
( cout ) {return new Symbol(sym.Cout, yychar, yyline, yytext());}

/* Palabra reservada define */
( define ) {return new Symbol(sym.Define, yychar, yyline, yytext());}

/* Palabra reservada scanf */
( scanf ) {return new Symbol(sym.Scanf, yychar, yyline, yytext());}

/* Palabra reservada Gets */
( gets ) {return new Symbol(sym.Gets, yychar, yyline, yytext());}

/* Palabra reservada Fgets */
( fgets ) {return new Symbol(sym.Fgets, yychar, yyline, yytext());}

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

/* Operador Modulo */
( "%" ) {return new Symbol(sym.Modulo, yychar, yyline, yytext());}

/* Operador Numeral */
( "#" ) {return new Symbol(sym.Numeral, yychar, yyline, yytext());}

/* Operador logico And */
( "&&" ) {return new Symbol(sym.Operador_Logico_And, yychar, yyline, yytext());}

/* Operador logico Or */
( "||" ) {return new Symbol(sym.Operador_Logico_Or, yychar, yyline, yytext());}

/* OOperador logico Not */
( "!" ) {return new Symbol(sym.Operador_Logico_Not, yychar, yyline, yytext());}

/* Operador bit a bit And */
( "&" ) {return new Symbol(sym.Operador_bit_a_bit_And, yychar, yyline, yytext());}

/* Operador bit a bit Or */
( "|" ) {return new Symbol(sym.Operador_bit_a_bit_Or, yychar, yyline, yytext());}

/* Operador relacional mayor */
( ">" ) {return new Symbol(sym.Operador_relacional_Mayor, yychar, yyline, yytext());}

/* Operador relacional menor */
( "<" ) {return new Symbol(sym.Operador_relacional_Menor, yychar, yyline, yytext());}

/* Operador relacional igual */
( "==" ) {return new Symbol(sym.Operador_relacional_Igual, yychar, yyline, yytext());}

/* Operador relacional diferente */
( "!=" ) {return new Symbol(sym.Operador_relacional_Diferente, yychar, yyline, yytext());}

/* Operador relacional mayor o igual */
( ">=" ) {return new Symbol(sym.Operador_relacional_mayoroIgual, yychar, yyline, yytext());}

/* Operador relacional menor o igual */
( "<=" ) {return new Symbol(sym.Operador_relacional_menoroIgual, yychar, yyline, yytext());}

/* Operador relacional Desplazamiento Izquierda*/
( "<<" ) {return new Symbol(sym.Operador_relacional_DesplazamientoI, yychar, yyline, yytext());}

/* Operador relacional Desplazamiento Derecha */
( ">>" ) {return new Symbol(sym.Operador_relacional_DesplazamientoD, yychar, yyline, yytext());}

/* Operador de atribucion mas igual*/
( "+=" ) {return new Symbol(sym.Operador_atribucion_masIgual, yychar, yyline, yytext());}

/* Operador de atribucion menos igual*/
( "-=" ) {return new Symbol(sym.Operador_atribucion_menosIgual, yychar, yyline, yytext());}

/* Operador de atribucion por igual*/
( "*=" ) {return new Symbol(sym.Operador_atribucion_porIgual, yychar, yyline, yytext());}

/* Operador de atribucion division igual*/
( "/=" ) {return new Symbol(sym.Operador_atribucion_divisionIgual, yychar, yyline, yytext());}

/* Operador de atribucion porcentaje igual*/
( "%=" ) {return new Symbol(sym.Operador_atribucion_porcentajeIgual, yychar, yyline, yytext());}

/* Operador incremento */
( "++" ) {return new Symbol(sym.Operador_incremento, yychar, yyline, yytext());}

/* Operadores decremento */
( "--" ) {return new Symbol(sym.Operador_decremento, yychar, yyline, yytext());}

/*Operador booleano true*/
(true) {return new Symbol(sym.Operador_booleano_True, yychar, yyline, yytext());}

/*Operadores booleano false*/
(false) {return new Symbol(sym.Operador_booleano_False, yychar, yyline, yytext());}

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

/* Palabra reservada System */ 
( system ) {return new Symbol(sym.Sistema, yychar, yyline, yytext());}

/* Palabra reservada Throw */ 
( "throw" ) {return new Symbol(sym.Throw, yychar, yyline, yytext());}

/* Marcador de inicio de impresion en pantalla */
( "printf" ) {return new Symbol(sym.Printf, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Punto */
( "." ) {return new Symbol(sym.Punto, yychar, yyline, yytext());}

/* Dos puntos */
( ":" ) {return new Symbol(sym.Dos_P, yychar, yyline, yytext());}

/* Coma */
( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* Concatenacion de Cadena */
( "\"".*"\"" ) {return new Symbol(sym.Cont_Cadena, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}


