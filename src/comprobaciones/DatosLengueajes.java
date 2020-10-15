/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprobaciones;

import java.util.ArrayList;
import simbolos.NodoClase;
import simbolos.NodoFuncionP;
import tresdirecciones.TablaCuartetos;
import tresdirecciones.TablaCuartetosB;

/**
 *
 * @author LENOVO-PC
 */
public class DatosLengueajes {
    
    private TablaCuartetos tablaCVB;
    private ArrayList<NodoFuncionP> listaFVB;
    private ArrayList<NodoClase> listaCls;
    private TablaCuartetos tablaCPY;
    private ArrayList<NodoFuncionP> listaFPY;
    int indice;

    public DatosLengueajes(TablaCuartetos tablaCVB, ArrayList<NodoFuncionP> listaFVB, ArrayList<NodoClase> listaCls, TablaCuartetos tablaCPY, ArrayList<NodoFuncionP> listaFPY) {
        this.tablaCVB = tablaCVB;
        this.listaFVB = listaFVB;
        this.listaCls = listaCls;
        this.tablaCPY = tablaCPY;
        this.listaFPY = listaFPY;
    }

    public TablaCuartetos getTablaCVB() {
        return tablaCVB;
    }

    public void setTablaCVB(TablaCuartetos tablaCVB) {
        this.tablaCVB = tablaCVB;
    }

    public ArrayList<NodoFuncionP> getListaFVB() {
        return listaFVB;
    }

    public void setListaFVB(ArrayList<NodoFuncionP> listaFVB) {
        this.listaFVB = listaFVB;
    }

    public ArrayList<NodoClase> getListaCls() {
        return listaCls;
    }

    public void setListaCls(ArrayList<NodoClase> listaCls) {
        this.listaCls = listaCls;
    }

    public TablaCuartetos getTablaCPY() {
        return tablaCPY;
    }

    public void setTablaCPY(TablaCuartetos tablaCPY) {
        this.tablaCPY = tablaCPY;
    }

    public ArrayList<NodoFuncionP> getListaFPY() {
        return listaFPY;
    }

    public void setListaFPY(ArrayList<NodoFuncionP> listaFPY) {
        this.listaFPY = listaFPY;
    }
    
    public boolean buscarClase(String nombre){
        if(listaCls!=null){
            for (int i = 0; i < listaCls.size(); i++) {
                if (listaCls.get(i).getNombre().equals(nombre)) {
                    indice = i;
                    return true;
                }
            }
        }
        return false;
    }
    public NodoClase getTB(){
        return listaCls.get(indice);
    }
    
    public boolean buscarFPY(String nombre){
        if(listaFPY!=null){
            for (int i = 0; i < listaFPY.size(); i++) {
                if(listaFPY.get(i).getNombre().equals(nombre)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean buscarFVB(String nombre){
        if(listaFVB!=null){
            for (int i = 0; i < listaFVB.size(); i++) {
                if(listaFVB.get(i).getNombre().equals(nombre)){
                    return true;
                }
            }
        }
        return false;
    }
}
