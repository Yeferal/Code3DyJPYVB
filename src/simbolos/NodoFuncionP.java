
package simbolos;

import java.util.ArrayList;

public class NodoFuncionP {
    /*
    1. Int
    2. Float
    3. Char
    */
    
    private String nombre;
    private ArrayList<Integer> listaParametros = new ArrayList<>();
    private boolean constructo;
    private boolean clase;

    public NodoFuncionP(String nombre, boolean constructo, boolean clase) {
        this.nombre = nombre;
        this.constructo = constructo;
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListaParametros() {
        return listaParametros;
    }

    public void setListaParametros(ArrayList<Integer> listaParametros) {
        this.listaParametros = listaParametros;
    }

    public boolean isConstructo() {
        return constructo;
    }

    public void setConstructo(boolean constructo) {
        this.constructo = constructo;
    }

    public boolean isClase() {
        return clase;
    }

    public void setClase(boolean clase) {
        this.clase = clase;
    }
    
    
    
    
}
