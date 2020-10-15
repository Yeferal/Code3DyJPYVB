/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simbolos;

import java.util.ArrayList;
import tresdirecciones.TablaCuartetos;
import tresdirecciones.TablaCuartetosB;

/**
 *
 * @author LENOVO-PC
 */
public class NodoClase {
    
    ArrayList<NodoFuncionP> listaF = new ArrayList<>();
    String nombre;
    TablaCuartetosB tablaCuartetos;

    public NodoClase(String nombre, TablaCuartetosB tablaCuartetos) {
        this.nombre = nombre;
        this.tablaCuartetos = tablaCuartetos;
    }

    
    public NodoClase(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<NodoFuncionP> getListaF() {
        return listaF;
    }

    public void setListaF(ArrayList<NodoFuncionP> listaF) {
        this.listaF = listaF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TablaCuartetosB getTablaCuartetos() {
        return tablaCuartetos;
    }

    public void setTablaCuartetos(TablaCuartetosB tablaCuartetos) {
        this.tablaCuartetos = tablaCuartetos;
    }
    
    
    
}
