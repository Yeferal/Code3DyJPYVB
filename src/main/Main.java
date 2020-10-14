
package main;

import analisis.cpp.AnalizadorLexicoCPP;
import analisis.cpp.AnalizadorSintacticoCPP;
import analisis.cpp.importaciones.AnalizadorLexicoIm;
import analisis.cpp.importaciones.AnalizadorSintacticoIm;
import analisis.java.AnalizadorLexicoJAVA;
import analisis.java.AnalizadorSintacticoJAVA;
import analisis.py.AnalizadorLexicoPY;
import analisis.py.AnalizadorSintacticoPY;
import analisis.vb.AnalizadorLexicoVB;
import analisis.vb.AnalizadorSintacticoVB;
import archivos.Archivo;
import comprobaciones.ComprobadorAmbito;
import comprobaciones.ComprobadorTipos;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanas.VentanaPrincipal; 


public class Main {

    
    public static void main(String[] args) {
        //VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        //ventanaPrincipal.setVisible(true);
        Archivo ar = new Archivo();
//        String texto = "while";
//        String texto = ar.leerArchivo("src/prueba2.mlg");
        String texto = ar.leerArchivo("src/prueba3.mlg");
        //String texto = ar.leerArchivo("src/pruebaErrores.mlg");
        System.out.println("\"");
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
        
        AnalizadorLexicoIm analizadorLexicoIm = new AnalizadorLexicoIm(new StringReader("\"JAVA.*\""));
        AnalizadorSintacticoIm analizadorSintacticoIm = new AnalizadorSintacticoIm(analizadorLexicoIm);
        try {
            analizadorSintacticoVB.parse();
            analizadorSintacticoJAVA.parse();
            analizadorSintacticoPY.parse();
            analizadorSintacticoCPP.parse();
            
            //analizadorSintacticoIm.parse();
            
            System.out.println("\n==>TERMINO<==\n\n");
            //System.out.println("Tabla Simbolos VB");
            //analizadorSintacticoVB.tablaSimbolos.pintar();
            /*System.out.println("\nTabla Simbolos JAVA");
            analizadorSintacticoJAVA.tablaSimbolos.pintar();*/
            //System.out.println("\nTabla Simbolos PY");
            //analizadorSintacticoPY.tablaSimbolos.pintar();
            //System.out.println("\nTabla Simbolos CPP");
            //analizadorSintacticoCPP.tablaSimbolos.pintar();
        } catch (Exception ex) {
            //ex.printStackTrace();
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\nErrores VB");
        for (int i = 0; i < analizadorSintacticoVB.erroresSintactico.size(); i++) {
            System.out.println(analizadorSintacticoVB.erroresSintactico.get(i).toString());
        }
        for (int i = 0; i < analizadorSintacticoVB.erroresSemanticos.size(); i++) {
            System.out.println(analizadorSintacticoVB.erroresSemanticos.get(i).toString());
        }
        /*System.out.println("\nErrores JAVA");
        for (int i = 0; i < analizadorSintacticoJAVA.erroresSintactico.size(); i++) {
            System.out.println(analizadorSintacticoJAVA.erroresSintactico.get(i).toString());
        }
        for (int i = 0; i < analizadorSintacticoJAVA.erroresSemanticos.size(); i++) {
            System.out.println(analizadorSintacticoJAVA.erroresSemanticos.get(i).toString());
        }
        System.out.println("\nErrores PY");
        for (int i = 0; i < analizadorSintacticoPY.erroresSintactico.size(); i++) {
            System.out.println(analizadorSintacticoPY.erroresSintactico.get(i).toString());
        }
        for (int i = 0; i < analizadorSintacticoPY.erroresSemanticos.size(); i++) {
            System.out.println(analizadorSintacticoPY.erroresSemanticos.get(i).toString());
        }
        System.out.println("\nErrores PROGRAMA PRINCIPAL");
        for (int i = 0; i < analizadorSintacticoCPP.erroresSintactico.size(); i++) {
            System.out.println(analizadorSintacticoCPP.erroresSintactico.get(i).toString());
        }
        for (int i = 0; i < analizadorSintacticoCPP.erroresSemanticos.size(); i++) {
            System.out.println(analizadorSintacticoCPP.erroresSemanticos.get(i).toString());
        }*/
        System.out.println("");
        //String h = "'c'";
        //System.out.println("SUB: "+h.substring(1, 2));
        
        System.out.println("\nCuartetos VB");
        analizadorSintacticoVB.tablaCuartetos.pintar();
        System.out.println("\nCuartetos JAVA");
        analizadorSintacticoJAVA.tablaCuartetos.pintar();
        /*System.out.println("\nCuartetos PY");
        analizadorSintacticoPY.tablaCuartetos.pintar();
        System.out.println("\nCuartetos CPP");
        analizadorSintacticoCPP.tablaCuartetos.pintar();*/
        
        //System.out.println(codigo3D);
        ComprobadorTipos c = new ComprobadorTipos();
        ComprobadorAmbito ca = new ComprobadorAmbito();
        //c.isNumero("55.00");
        //c.isFloat("555");
        //c.isFloat("5.3");
       // c.isInteger("33");
        //c.isInteger("56.5");
        
        //Object o = 5.5/2;
        //Object o1 = (float) 5.2;
        //Integer i = (Integer) o;
        //int in = 5/2;
        //float g = (float) o1;
        //System.out.println("Hola2: "+g+"\n");
        //int t = (int) 2.5;
        //c.tiparObjeto((float)5/2);
        //int ambitoFlag = 2;
        //ca.verificarAmbito(ambitoFlag, 10, 2);
        
        //System.out.println("Ambito Nuevo: "+ambitoFlag);
        //float dx = (float) c.sumar((float)2.2,3);
        //double xd = (float) dx;
        //System.out.println("Hola: "+c.dividir(5,2));
        //System.out.println("NUMERO: "+c.getTipoSimbolo(o));
        /*
        if (!(5<=4)) {
            System.out.println("\nhLLLL: "+((float)5/(float)2)+", MODULO: "+((float)2.5%(float)2));
        }*/
        
    }
    
}
