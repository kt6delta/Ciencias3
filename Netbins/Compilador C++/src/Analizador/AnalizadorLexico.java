/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;


/**
 *
 * @author Antonio Escobar
 * Codigo: 20152020120
 * Ciencias de la computacion 3
 */
public class AnalizadorLexico {
    public static void main(String[] args) throws Exception {
        //C:/Personal/Udemy/Java/Lexico/src/Analizador/
        String lexer= "./src/Analizador/Lexer.flex";
        String lexicoCup= "./src/Analizador/LexicoCup.flex";
        String[] Sintaxis={"-parser","Sintaxis","./src/Analizador/Sintaxis.cup"}; 
        generarLex(lexer, lexicoCup, Sintaxis);
    }
    public static void generarLex(String lexer, String lexicoCup, String[] Sintaxis) throws IOException, Exception{
        File arc = new File(lexer);
        JFlex.Main.generate(arc);
        arc = new File(lexicoCup);
        JFlex.Main.generate(arc);
        java_cup.Main.main(Sintaxis);
        
        Path caminoSym = Paths.get("./src/Analizador/sym.java");
        if(Files.exists(caminoSym))
            Files.delete(caminoSym);
        
        Files.move(
                Paths.get("sym.java"),
                Paths.get("./src/Analizador/sym.java")
        );
        
        Path caminoSint = Paths.get("./src/Analizador/Sintaxis.java");
        if(Files.exists(caminoSint))
            Files.delete(caminoSint);
        
        Files.move(
                Paths.get("Sintaxis.java"),
                Paths.get("./src/Analizador/Sintaxis.java")
        );
    }
}
