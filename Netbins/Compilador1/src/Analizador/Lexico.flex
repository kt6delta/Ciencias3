package Analizador; 
import static Analizador.Tokens.*; /*clase que incluira todos los Tokens del analizador Lexico*/
%% /*Declaraciones que se utilizan*/
%class Lexico /*cambio al nombre de la clase*/
%type Tokens
L=[a-zA-Z_ñÑáéíóúÁÉÍÓÚ]+ /* Caracteres alfabeticos que va a aceptar, se recibiran de la A - Z en Mayusculas y minusculas, guión bajo, el más es para que lea la palabra hasta que se en cuentre un espacio*/                  
D=[0-9]+ /*Acepta e identifica como digitos o numeros el del 0 al 9 incluidas todas sus combinaciones*/        
espacio=[ , \t, \r,\t,\r]+ /* El analizador ignorara estos espacios y el + es para el caso de que se encuentre más de uno */
%{
    public String lexemas;
%}
%% /*palabras reservadas*/
/* yytext analiza la cadena*/

(int) {lexemas=yytext(); return Int;} /*las palabras que retorna son las que se utilizaran en los tokens*/

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}

/* Comillas simples*/
( "\'" ) {lexemas=yytext(); return Comillas_S;}

/* Back Slash*/
( "\\" ) {lexemas=yytext(); return B_Slash;}

/* Tipo de dato byte */
( byte ) {lexemas=yytext(); return Byte;}

/* Tipo de dato int */
( int ) {lexemas=yytext(); return Int;}

/* Tipo de dato char */
( char ) {lexemas=yytext(); return Char;}

/* Tipo de dato long */
( long ) {lexemas=yytext(); return Long;}

/* Tipo de dato float */
( float ) {lexemas=yytext(); return Float;}

/* Tipo de dato double */
( double ) {lexemas=yytext(); return Double;}

/* Tipo de dato String */
( string ) {lexemas=yytext(); return Cadena;}

/* Tipo de dato Vacio */
( void ) {lexemas=yytext(); return Vacio;}

/* Tipo de dato Nulo */
( null ) {lexemas=yytext(); return Nulo;}

/* Palabra reservada If */
( if ) {lexemas=yytext(); return If;} /*En mayusculas para que Java no lo confunda con sus propias palabras*/

/* Palabra reservada Else */
( else ) {lexemas=yytext(); return Else;}

/* Palabra reservada While */
( while ) {lexemas=yytext(); return While;}

/* Palabra reservada For */
( for ) {lexemas=yytext(); return For;}

/* Palabra reservada Auto */
( auto ) {lexemas=yytext(); return Auto;}

/* Palabra reservada Break */
( break ) {lexemas=yytext(); return Break;}

/* Palabra reservada Case */
( case ) {lexemas=yytext(); return Case;}

/* Palabra reservada Const */
( const ) {lexemas=yytext(); return Const;}

/* Palabra reservada Continue */
( continue ) {lexemas=yytext(); return Continue;}

/* Palabra reservada Default */
( default ) {lexemas=yytext(); return Default;}

/* Palabra reservada Do */
( do ) {lexemas=yytext(); return Do;}

/* Palabra reservada Enum */
( enum ) {lexemas=yytext(); return Enum;}

/* Palabra reservada Extern */
( extern ) {lexemas=yytext(); return Extern;}

/* Palabra reservada Goto */
( goto ) {lexemas=yytext(); return Goto;}

/* Palabra reservada Register */
( register ) {lexemas=yytext(); return Register;}

/* Palabra reservada Return */
( return ) {lexemas=yytext(); return Return;}

/* Palabra reservada Short */
( short ) {lexemas=yytext(); return Short;}

/* Palabra reservada Signed */
( signed ) {lexemas=yytext(); return Signed;}

/* Palabra reservada Sizeof */
( sizeof ) {lexemas=yytext(); return Sizeof;}

/* Palabra reservada Static */
( static ) {lexemas=yytext(); return Static;}

/* Palabra reservada Struct */
( struct ) {lexemas=yytext(); return Struct;}

/* Palabra reservada Switch */
( switch ) {lexemas=yytext(); return Switch;}

/* Palabra reservada Typedef */
( typedef ) {lexemas=yytext(); return Typedef;}

/* Palabra reservada Union */
( union ) {lexemas=yytext(); return Union;}

/* Palabra reservada Unsigned */
( unsigned ) {lexemas=yytext(); return Unsigned;}

/* Palabra reservada Void */
( void ) {lexemas=yytext(); return Void;}

/* Palabra reservada Volatile */
( volatile ) {lexemas=yytext(); return Volatile;}

/* Palabra reservada Try */
( try ) {lexemas=yytext(); return Try;}

/* Palabra reservada Catch */
( catch ) {lexemas=yytext(); return Catch;}

/* Palabra reservada Include */
( include ) {lexemas=yytext(); return Include;}

/* Palabra reservada Using */
( using ) {lexemas=yytext(); return Using;}

/* Palabra reservada namespace */
( namespace ) {lexemas=yytext(); return Namespace;}

/* Palabra reservada std */
( std ) {lexemas=yytext(); return Std;}

/* Palabra reservada cin */
( cin ) {lexemas=yytext(); return Cin;}

/* Palabra reservada cout */
( cout ) {lexemas=yytext(); return Cout;}

/* Palabra reservada define */
( define ) {lexemas=yytext(); return Define;}

/* Palabra reservada scanf */
( scanf ) {lexemas=yytext(); return Scanf;}

/* Palabra reservada Gets */ 
( gets ) {lexemas=yytext(); return Gets;}

/* Palabra reservada Fgets */ 
( fgets ) {lexemas=yytext(); return Fgets;}

/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexemas=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexemas=yytext(); return Division;}

/* Operador Modulo */
( "%" ) {lexemas=yytext(); return Modulo;}

/* Numeral */
( "#" ) {lexemas=yytext(); return Numeral;}

/* Operador logico And */
( "&&" ) {lexemas=yytext(); return Operador_Logico_And;}

/* Operador logico Or */
( "||" ) {lexemas=yytext(); return Operador_Logico_Or;}

/* OOperador logico Not */
( "!" ) {lexemas=yytext(); return Operador_Logico_Not;}

/* Operador bit a bit And */
( "&" ) {lexemas=yytext(); return Operador_bit_a_bit_And;}

/* Operador bit a bit Or */
( "|" ) {lexemas=yytext(); return Operador_bit_a_bit_Or;}

/* Operador relacional mayor */
( ">" ) {lexemas=yytext(); return Operador_relacional_Mayor;}

/* Operador relacional menor */
( "<" ) {lexemas=yytext(); return Operador_relacional_Menor;}

/* Operador relacional igual */
( "==" ) {lexemas=yytext(); return Operador_relacional_Igual;}

/* Operador relacional diferente */
( "!=" ) {lexemas=yytext(); return Operador_relacional_Diferente;}

/* Operador relacional mayor o igual */
( ">=" ) {lexemas=yytext(); return Operador_relacional_mayoroIgual;}

/* Operador relacional menor o igual */
( "<=" ) {lexemas=yytext(); return Operador_relacional_menoroIgual;}

/* Operador relacional Desplazamiento Izquierda*/
( "<<" ) {lexemas=yytext(); return Operador_relacional_DesplazamientoI;}

/* Operador relacional Desplazamiento Derecha */
( ">>" ) {lexemas=yytext(); return Operador_relacional_DesplazamientoD;}

/* Operador de atribucion mas igual*/
( "+=" ) {lexemas = yytext(); return Operador_atribucion_masIgual;}

/* Operador de atribucion menos igual*/
( "-=" ) {lexemas = yytext(); return Operador_atribucion_menosIgual;}

/* Operador de atribucion por igual*/
( "*=" ) {lexemas = yytext(); return Operador_atribucion_porIgual;}

/* Operador de atribucion division igual*/
( "/=" ) {lexemas = yytext(); return Operador_atribucion_divisionIgual;}

/* Operador de atribucion porcentaje igual*/
( "%=" ) {lexemas = yytext(); return Operador_atribucion_porcentajeIgual;}

/* Operador incremento */
( "++" ) {lexemas = yytext(); return Operador_incremento;}

/* Operadores decremento */
( "--" ) {lexemas = yytext(); return Operador_decremento;}

/*Operador booleano true*/
(true) {lexemas = yytext(); return Operador_booleano_True;}

/*Operadores booleano false*/
(false) {lexemas = yytext(); return Operador_booleano_False;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parent_a;}

/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parent_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexemas = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexemas = yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

/* Palabra reservada System */ 
( system ) {lexemas=yytext(); return Sistema;}

/* Palabra reservada Throw */ 
( "throw" ) {lexemas=yytext(); return Throw;}

/* Marcador de inicio de impresion en pantalla */
( "printf" ) {lexemas=yytext(); return Printf;}

/* Punto y coma */
( ";" ) {lexemas=yytext(); return P_coma;}

/* Punto */
( "." ) {lexemas=yytext(); return Punto;}

/* Dos puntos */
( ":" ) {lexemas=yytext(); return Dos_P;}

/* Coma */
( "," ) {lexemas=yytext(); return Coma;}

/* Concatenar cadena */
( "\"".*"\"" ) {lexemas=yytext(); return Cont_Cadena;}

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;} /*iniciar por una letra y acontinuación una letra o un número */

/* Numero */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;} /*digito seguido por otro digito o un más o menos*/

/* Error de analisis */
 . {return ERROR;} /*Error en caso de que no se encuentre dentro de las reglas especificadas anteriormente*/


