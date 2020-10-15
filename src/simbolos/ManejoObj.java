/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simbolos;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author LENOVO-PC
 */
public class ManejoObj {
    
    ArrayList<ObjJV> listaObj = new ArrayList<>();
    int indice;
    
    public void agregarObj(ObjJV objJV){
        listaObj.add(objJV);
    }
    
    public boolean buscar(ObjJV objJV){
        for (int i = 0; i < listaObj.size(); i++) {
            if(listaObj.get(i).equals(objJV.getNombre())){
                
                return true;
            }
        }
        listaObj.add(objJV);
        return false;
    }
    
    public boolean buscarName(String nombre){
        for (int i = 0; i < listaObj.size(); i++) {
            if(listaObj.get(i).getNombre().equals(nombre)){
                indice = i;
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarFuncion(String nombre){
        for (int i = 0; i < listaObj.get(indice).getNodoClase().getListaF().size(); i++) {
            if(listaObj.get(indice).getNodoClase().getListaF().get(i).getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }
    
}
