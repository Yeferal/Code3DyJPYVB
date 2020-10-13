/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprobaciones;

import tresdirecciones.Condicional;
import tresdirecciones.Cuarteto;

/**
 *
 * @author LENOVO-PC
 */
public class NodoPY {
    
    /*TIPOS
    1. if
    2. while
    3. for
    4. 
    5.
    6.
    */
    
    private Cuarteto cuarteto;
    private int valor;
    private int tipo;
    private Condicional condi;

    public NodoPY(Cuarteto cuarteto, int valor, int tipo) {
        this.cuarteto = cuarteto;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Cuarteto getCuarteto() {
        return cuarteto;
    }

    public void setCuarteto(Cuarteto cuarteto) {
        this.cuarteto = cuarteto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Condicional getCondi() {
        return condi;
    }

    public void setCondi(Condicional condi) {
        this.condi = condi;
    }
    
    
    
    
}
