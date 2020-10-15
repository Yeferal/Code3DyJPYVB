/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import analisis.cpp.AnalizadorLexicoCPP;
import analisis.cpp.AnalizadorSintacticoCPP;
import analisis.java.AnalizadorLexicoJAVA;
import analisis.java.AnalizadorSintacticoJAVA;
import analisis.py.AnalizadorLexicoPY;
import analisis.py.AnalizadorSintacticoPY;
import analisis.vb.AnalizadorLexicoVB;
import analisis.vb.AnalizadorSintacticoVB;
import archivos.ArchivoExtension;
import comprobaciones.DatosLengueajes;
import errores.ErrorG;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tresdirecciones.Generado3D;
import tresdirecciones.TablaCuartetos;

/**
 *
 * @author LENOVO-PC
 */
public class ManejadorLenguajes {
    
    VentanaPrincipal ventanaPrincipal;
    String texto = "";
    String texto3D = "";
    
    public ManejadorLenguajes(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    public void analizarTexto(String texto){
        AnalizadorLexicoVB analizadorLexicoVB = new AnalizadorLexicoVB(new StringReader(texto));
        AnalizadorSintacticoVB analizadorSintacticoVB = new AnalizadorSintacticoVB(analizadorLexicoVB);
        
        AnalizadorLexicoJAVA analizadorLexicoJAVA = new AnalizadorLexicoJAVA(new StringReader(texto));
        AnalizadorSintacticoJAVA analizadorSintacticoJAVA = new AnalizadorSintacticoJAVA(analizadorLexicoJAVA);
        
        AnalizadorLexicoPY analizadorLexicoPY = new AnalizadorLexicoPY(new StringReader(texto));
        AnalizadorSintacticoPY analizadorSintacticoPY = new AnalizadorSintacticoPY(analizadorLexicoPY);
        
        AnalizadorLexicoCPP analizadorLexicoCPP = new AnalizadorLexicoCPP(new StringReader(texto));
        AnalizadorSintacticoCPP analizadorSintacticoCPP = new AnalizadorSintacticoCPP(analizadorLexicoCPP);
        
        try {
            analizadorSintacticoVB.parse();
            analizadorSintacticoJAVA.contadorET = analizadorSintacticoVB.contadorET;
            analizadorSintacticoJAVA.contadorEVT = analizadorSintacticoVB.contadorEVT;
            
            if(analizadorLexicoVB.listaErrores.size()==0 && analizadorSintacticoVB.erroresSintactico.size()==0 && analizadorSintacticoVB.erroresSemanticos.size()==0){
                analizadorSintacticoJAVA.parse();
                analizadorSintacticoPY.contadorET = analizadorSintacticoJAVA.contadorET;
                analizadorSintacticoPY.contadorEVT = analizadorSintacticoJAVA.contadorEVT;
                if(analizadorLexicoJAVA.listaErrores.size()==0 && analizadorSintacticoJAVA.erroresSintactico.size()==0 && analizadorSintacticoJAVA.erroresSemanticos.size()==0){
                    analizadorSintacticoPY.parse();
                    analizadorSintacticoCPP.contadorET = analizadorSintacticoPY.contadorET;
                    analizadorSintacticoCPP.contadorEVT = analizadorSintacticoPY.contadorEVT;
                    if(analizadorLexicoPY.listaErrores.size()==0 && analizadorSintacticoPY.erroresSintactico.size()==0 && analizadorSintacticoPY.erroresSemanticos.size()==0){
                        DatosLengueajes datosLengueajes = new DatosLengueajes(analizadorSintacticoVB.tablaCuartetos, analizadorSintacticoVB.listaF, analizadorSintacticoJAVA.listaCls, analizadorSintacticoPY.tablaCuartetos, analizadorSintacticoPY.listaF);
                        analizadorSintacticoCPP.setDatos(datosLengueajes);
                        analizadorSintacticoCPP.parse();
                        if(analizadorLexicoCPP.listaErrores.size()==0 && analizadorSintacticoCPP.erroresSintactico.size()==0 && analizadorSintacticoCPP.erroresSemanticos.size()==0){
                            JOptionPane.showMessageDialog(null, "Archivo de entrada es Correcto");
                            generarTexto3D(analizadorSintacticoCPP.generado3D, analizadorSintacticoCPP.tablaCuartetos);
                        }else{
                            JOptionPane.showMessageDialog(null, "SE encontraron errores en el archivo de entrada");
                            texto = "";
                            generarErroress(analizadorLexicoCPP.listaErrores, analizadorSintacticoCPP.erroresSintactico, analizadorSintacticoCPP.erroresSemanticos);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "SE encontraron errores en el archivo de entrada");
                        texto = "";
                        generarErroress(analizadorLexicoPY.listaErrores, analizadorSintacticoPY.erroresSintactico, analizadorSintacticoPY.erroresSemanticos);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "SE encontraron errores en el archivo de entrada");
                    texto = "";
                    generarErroress(analizadorLexicoJAVA.listaErrores, analizadorSintacticoJAVA.erroresSintactico, analizadorSintacticoJAVA.erroresSemanticos);
                }
            }else{
                JOptionPane.showMessageDialog(null, "SE encontraron errores en el archivo de entrada");
                texto = "";
                generarErroress(analizadorLexicoVB.listaErrores, analizadorSintacticoVB.erroresSintactico, analizadorSintacticoVB.erroresSemanticos);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "SE encontraron errores en el archivo de entrada");
            texto = "\n======>Errores VB<======\n";
            generarErrores(analizadorLexicoVB.listaErrores, analizadorSintacticoVB.erroresSintactico, analizadorSintacticoVB.erroresSemanticos);
            texto += "\n======>Errores JAVA<======\n";
            generarErrores(analizadorLexicoJAVA.listaErrores, analizadorSintacticoJAVA.erroresSintactico, analizadorSintacticoJAVA.erroresSemanticos);
            texto += "\n======>Errores PY<======\n";
            generarErrores(analizadorLexicoPY.listaErrores, analizadorSintacticoPY.erroresSintactico, analizadorSintacticoPY.erroresSemanticos);
            texto += "\n======>Errores CPP<======\n";
            generarErrores(analizadorLexicoCPP.listaErrores, analizadorSintacticoCPP.erroresSintactico, analizadorSintacticoCPP.erroresSemanticos);
            ventanaPrincipal.ventanaErrores.setTexto(texto);
            ventanaPrincipal.ventanaErrores.setVisible(true);
            Logger.getLogger(ManejadorLenguajes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void generarErroress(ArrayList<ErrorG> listaLexico, ArrayList<ErrorG> listaSintax, ArrayList<ErrorG> listaSemantico){
        
        texto += "----->Errores Lexicos<-----\n";
        for (int i = 0; i < listaLexico.size(); i++) {
            texto += listaLexico.get(i).toString()+"\n";
        }
        texto += "\n----->Errores Sintactios<-----\n";
        for (int i = 0; i < listaSintax.size(); i++) {
            texto += listaSintax.get(i).toString()+"\n";
        }
        texto += "\n----->Errores Semanticos<-----\n";
        for (int i = 0; i < listaSemantico.size(); i++) {
            texto += listaSemantico.get(i).toString()+"\n";
        }
        ventanaPrincipal.ventanaErrores.setTexto(texto);
        ventanaPrincipal.ventanaErrores.setVisible(true);
    }
    public void generarErrores(ArrayList<ErrorG> listaLexico, ArrayList<ErrorG> listaSintax, ArrayList<ErrorG> listaSemantico){
        
        texto += "----->Errores Lexicos<-----\n";
        for (int i = 0; i < listaLexico.size(); i++) {
            texto += listaLexico.get(i).toString()+"\n";
        }
        texto += "\n----->Errores Sintactios<-----\n";
        for (int i = 0; i < listaSintax.size(); i++) {
            texto += listaSintax.get(i).toString()+"\n";
        }
        texto += "\n----->Errores Semanticos<-----\n";
        for (int i = 0; i < listaSemantico.size(); i++) {
            texto += listaSemantico.get(i).toString()+"\n";
        }
        
    }
    
    public void generarTexto3D(Generado3D generado3D, TablaCuartetos tablaCuartetos){
        texto3D = "";
        if(generado3D.isVb()){
            texto3D += "//CODIGO VB";
            generado3D.getIncludeVB().generarTexto();
            texto3D += generado3D.getIncludeVB().getTextoCuartetos();
        }
        if(generado3D.isJv()){
            texto3D += "//CODIGO JAVA";
            for (int i = 0; i < generado3D.getIncludeClJV().size(); i++) {
                generado3D.getIncludeClJV().get(i).getTablaCuartetos().generarTexto();
                texto3D += generado3D.getIncludeClJV().get(i).getTablaCuartetos().getTextoCuartetos();
            }
        }else{
            texto3D += "//CODIGO JAVA";
            for (int i = 0; i < generado3D.getIncludeJV().size(); i++) {
                generado3D.getIncludeJV().get(i).getTablaCuartetos().generarTexto();
                texto3D += generado3D.getIncludeJV().get(i).getTablaCuartetos().getTextoCuartetos();
            }
        }
        if(generado3D.isPy()){
            texto3D += "//CODIGO PY";
            generado3D.getIncludePY().generarTexto();
            texto3D += generado3D.getIncludePY().getTextoCuartetos();
        }
        texto3D += "//CODIGO CPP";
        tablaCuartetos.generarTexto();
        texto3D += tablaCuartetos.getTextoCuartetos();
        //System.out.println(texto3D);
        ventanaPrincipal.agregarPestania3D(new ArchivoExtension(null, null, "3D", "codigo 3d"),texto3D);
    }
    
}
