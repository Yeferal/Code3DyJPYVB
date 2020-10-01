/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresdirecciones;

import java.util.ArrayList;

/**
 *
 * @author LENOVO-PC
 */
public class TablaCuartetos {
    
    private ArrayList<Cuarteto> listaCuartetos = new ArrayList<>();
    
    public void agregarCuarteto(Cuarteto cuarteto){
        listaCuartetos.add(cuarteto);
    }
    
    public void pintar(){
        System.out.println("No.\tOperacion\t\tVAL_1\tVAL_2\tValor");
        for (int i = 0; i < listaCuartetos.size(); i++) {
            System.out.println((i+1)+listaCuartetos.get(i).toString());
        }
        
    }
    
}
