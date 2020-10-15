/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresdirecciones;

import java.util.ArrayList;
import simbolos.NodoClase;

/**
 *
 * @author LENOVO-PC
 */
public class Generado3D {
    
    public boolean vb = false , jv = false, py = false;
    private TablaCuartetos includeVB;
    private TablaCuartetos includePY;
    private ArrayList<NodoClase> includeClJV = new ArrayList<NodoClase>();
    private ArrayList<NodoClase> includeJV = new ArrayList<NodoClase>();
    int indice ;
    
    public boolean isVb() {
        return vb;
    }

    public void setVb(boolean vb) {
        this.vb = vb;
    }

    public boolean isJv() {
        return jv;
    }

    public void setJv(boolean jv) {
        this.jv = jv;
    }

    public boolean isPy() {
        return py;
    }

    public void setPy(boolean py) {
        this.py = py;
    }

    public ArrayList<NodoClase> getIncludeJV() {
        return includeJV;
    }

    public void setIncludeJV(ArrayList<NodoClase> includeJV) {
        this.includeJV = includeJV;
    }
    
    

    public TablaCuartetos getIncludeVB() {
        return includeVB;
    }

    public void setIncludeVB(TablaCuartetos includeVB) {
        this.includeVB = includeVB;
    }

    public TablaCuartetos getIncludePY() {
        return includePY;
    }

    public void setIncludePY(TablaCuartetos includePY) {
        this.includePY = includePY;
    }

    public NodoClase buscarClase(String nombre){
        if (jv) {
            for (int i = 0; i < includeClJV.size(); i++) {
                if (includeClJV.get(i).getNombre().equals(nombre)) {
                    indice = i;
                    return includeClJV.get(i);
                }
            }
        }else{
            for (int i = 0; i < includeJV.size(); i++) {
                if (includeJV.get(i).getNombre().equals(nombre)) {
                    indice = i;
                    return includeJV.get(i);
                }
            }
        }
        return null;
    }

    public ArrayList<NodoClase> getIncludeClJV() {
        return includeClJV;
    }

    public void setIncludeClJV(ArrayList<NodoClase> includeClJV) {
        this.includeClJV = includeClJV;
    }
    public void agregarNodoClase(NodoClase t){
        includeJV.add(t);
    }
    
    
}
