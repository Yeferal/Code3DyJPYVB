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
public class Simbolo {
    /*
    1. INTEGER
    2. DECIMAL
    3. CHAR
    12.FUNCTION
    13.PROCEDIMIENTO
    14.CLASE
    */
    
    private String nombre, tipo;
    int ambito;
    private Object objeto;

    public Simbolo(String nombre, String tipo, int ambito, Object objeto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ambito = ambito;
        this.objeto = objeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAmbito() {
        return ambito;
    }

    public void setAmbito(int ambito) {
        this.ambito = ambito;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
    
    public String toString(){
        if(objeto==null){
            return nombre+"\t\t"+tipo+"\t\t"+ambito+"\t\t"+"---";
        }
        return nombre+"\t\t"+tipo+"\t\t"+ambito+"\t\t"+objeto;
    }
    
    
    
}
