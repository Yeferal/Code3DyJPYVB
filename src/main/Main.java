
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
        
//        String texto = "while";
        String texto = "%%VB\nPublic Module thisModule\n" +
"    Sub main()\n" +
"        Dim userName As Integer = intInput(\"What is your name?\")\n" +
"        MsgBox(\"User name is \")\n" +
"    End Sub\n"+
"    ' Insert variable, property, procedure, and event declarations.\n" +
"End Module\n"+
                "%%JAVA\n5F5*Public Module thisModu-+\n"
                + "%%PY\n Public Module thisModu"
                + "%%PROGRAMA\n Public Module thisModu";
        
        //System.out.println("");
        
        
        float d = (float) 55.23;
        //char ds = "d";
        char dsd = 'd';
        
        AnalizadorLexicoVB analizadorLexicoVB = new AnalizadorLexicoVB(new StringReader(texto));
        AnalizadorSintacticoVB analizadorSintacticoVB = new AnalizadorSintacticoVB(analizadorLexicoVB);
        
        try {
            analizadorSintacticoVB.parse();
        } catch (Exception ex) {
            //ex.printStackTrace();
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        int j=0;
        for ( j=0 ; j < 10; j = j+1) {
            
        }
    }
    
}
