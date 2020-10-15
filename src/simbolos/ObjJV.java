/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simbolos;

/**
 *
 * @author LENOVO-PC
 */
public class ObjJV {
    
    private String nombre;
    private NodoClase nodoClase;

    public ObjJV(String nombre, NodoClase nodoClase) {
        this.nombre = nombre;
        this.nodoClase = nodoClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoClase getNodoClase() {
        return nodoClase;
    }

    public void setNodoClase(NodoClase nodoClase) {
        this.nodoClase = nodoClase;
    }
    
    
    
}
