/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Estefania
 */

public class PrincipalAnalizadores {
    
    public static void main(String[] args) throws Exception {
        //C:/Users/Estefania/Documents/NetBeansProjects/Compilador/src/Analizador/Lexico.flex
        String rutaLexicoFlex= "../Compilador/src/Analizador/Lexico.flex";
        String rutaLexicoCup= "../Compilador/src/Analizador/LexicoCup.flex";
        //Matriz para generar el cup que requiere unas instrucciones especificas
        String[] rutaSintaxis= {"-parser","Sintaxis","../Compilador/src/Analizador/Sintaxis.cup"};//Sintactico
        
        generar(rutaLexicoFlex, rutaLexicoCup, rutaSintaxis);
    }
    //Generar la parte de lexico y la parte de sintaxis
    public static void generar(String rutaLexicoFlex, String rutaLexicoCup, String[] rutaSintaxis) throws IOException, Exception {
        File archivo; 
        archivo = new File(rutaLexicoFlex);
        JFlex.Main.generate(archivo);
        archivo = new File(rutaLexicoCup);
        JFlex.Main.generate(archivo);
        //Generar parte sintactica
        java_cup.Main.main(rutaSintaxis);
        //Mover los documentos y enncontrar un archivo con el mismo nombre no lo modifica
        Path pathSymbol = Paths.get("../Compilador/src/Analizador/sym.java");
        //Si el archivo existe en el paquete elimnarlo para generar el nuevo ducmento generado
        if (Files.exists(pathSymbol)) { 
            Files.delete(pathSymbol);
        }
        //Se genera la tabla de simbolos y el sintax pero se generan fuera del paquete del codigo por lo que se debe mover
        Files.move(
        Paths.get("../Compilador/sym.java"), //Ubicación donde se encuentra el documento
        Paths.get("../Compilador/src/Analizador/sym.java") //Ubicación de destino
        );
        Path pathSintaxis1 = Paths.get("../Compilador/src/Analizador/Sintaxis.java");
        if (Files.exists(pathSintaxis1)) {
            Files.delete(pathSintaxis1);
        }
        Files.move(
                Paths.get("../Compilador/Sintaxis.java"), 
                Paths.get("../Compilador/src/Analizador/Sintaxis.java")
        );     
    }
}
