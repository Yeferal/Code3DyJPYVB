/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresdirecciones;

/**
 *
 * @author LENOVO-PC
 */
public class Condicional {
    
    /*Tipo
    0. p, UNO
    1. p AND p
    2. p OR p
    3. NOT p
    4.
    5.
    */
    
    private Cuarteto c1, c2;
    private int tipo;
    private String pilaAnd, pilaOr;

    public Condicional(Cuarteto c1, Cuarteto c2, int tipo, String pilaAnd, String pilaOr) {
        this.c1 = c1;
        this.c2 = c2;
        this.tipo = tipo;
        this.pilaAnd = pilaAnd;
        this.pilaOr = pilaOr;
    }

    

    public Cuarteto getC1() {
        return c1;
    }

    public void setC1(Cuarteto c1) {
        this.c1 = c1;
    }

    public Cuarteto getC2() {
        return c2;
    }

    public void setC2(Cuarteto c2) {
        this.c2 = c2;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPilaAnd() {
        return pilaAnd;
    }

    public void setPilaAnd(String pilaAnd) {
        this.pilaAnd = pilaAnd;
    }

    public String getPilaOr() {
        return pilaOr;
    }

    public void setPilaOr(String pilaOr) {
        this.pilaOr = pilaOr;
    }

    
    
    
    
    
}
