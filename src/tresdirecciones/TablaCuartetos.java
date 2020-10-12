
package tresdirecciones;

import java.util.ArrayList;
import java.util.Stack;

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
    10.VAR
    */
    
    
    private ArrayList<Cuarteto> listaCuartetos = new ArrayList<>();
    private Stack<Integer> pila = new Stack();
    private Stack<Integer> pilaAnd = new Stack<>();
    private Stack<Integer> pilaOr = new Stack<>();
    private Stack<String> pilaSelec = new Stack<>();
    private int operRealizada = 0;
    
    
    public void agregarCuarteto(Cuarteto cuarteto){
        if(cuarteto!=null && !cuarteto.getValor1().equals("et")){
            listaCuartetos.add(cuarteto);
        }
        
    }
    
    public void pintar(){
        System.out.println("No.\tOperacion\tVAL_1\t\tVAL_2\tValor");
        for (int i = 0; i < listaCuartetos.size(); i++) {
            System.out.println((i+1)+listaCuartetos.get(i).toString());
        }
        
    }
    public void escribir(){
        System.out.println("No.\tOperacion\tVAL_1\t\tVAL_2\tValor");
        for (int i = 0; i < listaCuartetos.size(); i++) {
            System.out.println((i+1)+listaCuartetos.get(i).toString());
        }
        
    }
    
    public void apilar(int bandera){
        pila.push(bandera);
    }
    
    public void apilarSelec(String bandera){
        pilaSelec.push(bandera);
    }
    
    public void desempilarSelect(){
        if(!pilaSelec.isEmpty()){
            pilaSelec.pop();
        }
    }
    public String getUltimoSelect(){
        String nombre = "";
        if(!pilaSelec.isEmpty()){
            nombre = pilaSelec.peek();
        }
        return nombre;
    }
    
    public int getUltimo(){
        int val =0;
        if(!pila.isEmpty()){
            val = (int) pila.peek();
        }
        return val; 
    }
    
    public int obtenerUltimo(){
        int val =0;
        if(!pila.isEmpty()){
            val = (int) pila.pop();
        }
        return val;
    }
    
    public void generarSigVerdaero(){
        switch(operRealizada){
            case 1://and
                generarEtiquetasOr();
                
                break;
            case 2://or
                
                break;
        }
    }
    
    public void generarEtiquetasOr(){
        while (!pilaOr.isEmpty()) {            
            Cuarteto cuarteto = new Cuarteto("ETIQUETA", "et:"+pilaOr.pop(), "", "", 3);
            listaCuartetos.add(cuarteto);
        }
    }
    
    
    public void generarEtiquetasAnd(){
        while (!pilaAnd.isEmpty()) {            
            Cuarteto cuarteto = new Cuarteto("ETIQUETA", "et:"+pilaAnd.pop(), "", "", 3);
            listaCuartetos.add(cuarteto);
        }
    }
    
    public void and(Cuarteto primero, Cuarteto segundo, int gToIf1,int gToIf2, int gTo1,int gTo2){
        Cuarteto if1 = primero;
        Cuarteto gt1 = null;
        Cuarteto etiqueta = null;
        gt1 = new Cuarteto("GOTO", "", "", "et"+gTo1, 2);
        if(primero.getTipo()==0){
            
            etiqueta = new Cuarteto("ETIQUETA", "et"+gToIf1, "", "", 3);
            pilaOr.push(gToIf1);
            primero.setTipo(1);
        }else{
            etiqueta = new Cuarteto("ETIQUETA", "et"+gTo1, "", "", 3);
            pilaOr.push(gTo1);
            primero.setTipo(1);
        }
        
        Cuarteto if2 = segundo;
        Cuarteto gt2 = null;
        if(segundo.getTipo()==0){
            gt2 = new Cuarteto("GOTO", "", "", "et"+gTo2, 2);
            segundo.setTipo(1);
            pilaOr.push(gToIf2);
            pilaAnd.push(gTo2);
        }else{
            gt2 = new Cuarteto("GOTO", "", "", "et"+gToIf2, 2);
            segundo.setTipo(1);
            pilaOr.push(gTo2);
            pilaAnd.push(gToIf1);
        }
        
        
        
        
        agregarCuarteto(if1);
        agregarCuarteto(gt1);
        agregarCuarteto(etiqueta);
        agregarCuarteto(if2);
        agregarCuarteto(gt2);
    }
    
    public void or(Cuarteto primero, Cuarteto segundo, int gToIf1,int gToIf2, int gTo1,int gTo2){
        
        Cuarteto if1 = primero;
        Cuarteto gt1 = null;
        Cuarteto etiqueta = null;
        
        gt1 = new Cuarteto("GOTO", "", "", "et"+gTo1, 2);
        if(primero.getTipo()==0){
            
            etiqueta = new Cuarteto("ETIQUETA", "et"+gTo1, "", "", 3);
            pilaAnd.push(gTo1);
            primero.setTipo(1);
        }else{
            etiqueta = new Cuarteto("ETIQUETA", "et"+gToIf1, "", "", 3);
            pilaAnd.push(gToIf1);
            primero.setTipo(1);
        }
        
        
        Cuarteto if2 = segundo;
        Cuarteto gt2 = null;
        if(segundo.getTipo()==0){
            gt2 = new Cuarteto("GOTO", "", "", "et"+gTo2, 2);
            segundo.setTipo(1);
            pilaAnd.push(gTo2);
            pilaOr.push(gToIf2);
        }else{
            gt2 = new Cuarteto("GOTO", "", "", "et"+gToIf2, 2);
            segundo.setTipo(1);
            pilaAnd.push(gToIf2);
            pilaOr.push(gTo2);
        }
        
        
        
        agregarCuarteto(if1);
        agregarCuarteto(gt1);
        agregarCuarteto(etiqueta);
        agregarCuarteto(if2);
        agregarCuarteto(gt2);
    }
//    public void agregarPila
    
}
