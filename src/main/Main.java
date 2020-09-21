
package main;

import analisis.vb.AnalizadorLexicoVB;
import analisis.vb.AnalizadorSintacticoVB;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanas.VentanaPrincipal; 


public class Main {

    
    public static void main(String[] args) {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        
        String texto = "while";
        
        AnalizadorLexicoVB analizadorLexicoVB = new AnalizadorLexicoVB(new StringReader(texto));
        AnalizadorSintacticoVB analizadorSintacticoVB = new AnalizadorSintacticoVB(analizadorLexicoVB);
        
        try {
            analizadorSintacticoVB.parse();
        } catch (Exception ex) {
            //ex.printStackTrace();
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
