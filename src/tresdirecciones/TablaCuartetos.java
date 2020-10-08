
package tresdirecciones;

import java.util.ArrayList;

public class TablaCuartetos {
    /*-->Operacion<--
    1. IF (<,>,=,<=,>=,<>)
    2. GOTO
    3. ETIQUETA
    4. SUMA
    5. RESTAR
    6. POR
    7. DIV
    8. PRINT
    9. CONCAT
    */
    
    
    private ArrayList<Cuarteto> listaCuartetos = new ArrayList<>();
    
    public void agregarCuarteto(Cuarteto cuarteto){
        listaCuartetos.add(cuarteto);
    }
    
    public void pintar(){
        System.out.println("No.\tOperacion\tVAL_1\t\tVAL_2\tValor");
        for (int i = 0; i < listaCuartetos.size(); i++) {
            System.out.println((i+1)+listaCuartetos.get(i).toString());
        }
        
    }
    
}
