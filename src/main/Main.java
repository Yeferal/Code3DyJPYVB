
package main;

import analisis.cpp.AnalizadorLexicoCPP;
import analisis.cpp.AnalizadorSintacticoCPP;
import analisis.java.AnalizadorLexicoJAVA;
import analisis.java.AnalizadorSintacticoJAVA;
import analisis.py.AnalizadorLexicoPY;
import analisis.py.AnalizadorSintacticoPY;
import analisis.vb.AnalizadorLexicoVB;
import analisis.vb.AnalizadorSintacticoVB;
import archivos.Archivo;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanas.VentanaPrincipal; 


public class Main {

    
    public static void main(String[] args) {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        Archivo ar = new Archivo();
//        String texto = "while";
        String texto = ar.leerArchivo("src/prueba.mlg");
        
        //System.out.println(texto);
        
        
        float d = (float) 55.23;
        //char ds = "d";
        char dsd = 'd';
        
        AnalizadorLexicoVB analizadorLexicoVB = new AnalizadorLexicoVB(new StringReader(texto));
        AnalizadorSintacticoVB analizadorSintacticoVB = new AnalizadorSintacticoVB(analizadorLexicoVB);
        
        AnalizadorLexicoJAVA analizadorLexicoJAVA = new AnalizadorLexicoJAVA(new StringReader(texto));
        AnalizadorSintacticoJAVA analizadorSintacticoJAVA = new AnalizadorSintacticoJAVA(analizadorLexicoJAVA);
        
        AnalizadorLexicoPY analizadorLexicoPY = new AnalizadorLexicoPY(new StringReader(texto));
        AnalizadorSintacticoPY analizadorSintacticoPY = new AnalizadorSintacticoPY(analizadorLexicoPY);
        
        AnalizadorLexicoCPP analizadorLexicoCPP = new AnalizadorLexicoCPP(new StringReader(texto));
        AnalizadorSintacticoCPP analizadorSintacticoCPP = new AnalizadorSintacticoCPP(analizadorLexicoCPP);
        try {
            //analizadorSintacticoVB.parse();
            //analizadorSintacticoJAVA.parse();
            //analizadorSintacticoPY.parse();
            analizadorSintacticoCPP.parse();
            System.out.println("\n==>TERMINO<==\n\n");
        } catch (Exception ex) {
            //ex.printStackTrace();
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }
    
}
