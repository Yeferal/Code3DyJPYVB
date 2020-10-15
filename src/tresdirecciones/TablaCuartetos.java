
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
    11.MOD
    12.FUNCTION
    13.PROCEDIMIENTO
    14.CLOSE
    15.SCANF
    16.GETCH
    17.CLRS
    18.OBJETO
    19.LLAMADA
    */
    
    
    private ArrayList<Cuarteto> listaCuartetos = new ArrayList<>();
    private Stack<Integer> pila = new Stack();
    private Stack<Integer> pilaAnd = new Stack<>();
    private Stack<Integer> pilaOr = new Stack<>();
    private Stack<String> pilaSelec = new Stack<>();
    private int operRealizada = 0;
    private String textoCuartetos = "";
    private TablaCuartetosB auxClase = new TablaCuartetosB();

    public TablaCuartetosB getAuxClase() {
        return auxClase;
    }
    
    public void limpiarAux(){
        auxClase = new TablaCuartetosB();
    }
    
    public void agregarCuarteto(Cuarteto cuarteto){
        if(cuarteto!=null && !cuarteto.getValor1().equals("et") && !cuarteto.getValor2().equals("et")){
            listaCuartetos.add(cuarteto);
            auxClase.agregarCuarteto(cuarteto);
        }
        
    }
    
    public void agregarLista(ArrayList<Cuarteto> listaC){
        for (int i = 0; i < listaC.size(); i++) {
            agregarCuarteto(listaC.get(i));
        }
        
    }

    public ArrayList<Cuarteto> getListaCuartetos() {
        return listaCuartetos;
    }

    public void setListaCuartetos(ArrayList<Cuarteto> listaCuartetos) {
        this.listaCuartetos = listaCuartetos;
    }
    
    public void generarTexto(){
        textoCuartetos = "";
        for (int i = 0; i < listaCuartetos.size(); i++) {
            switch(listaCuartetos.get(i).getTipo()){
                case 0:
                    textoCuartetos += listaCuartetos.get(i).getValorP()+" = "+listaCuartetos.get(i).getValor1()+"\n";
                    break;
                case 1:
                    agregarTextoIf(listaCuartetos.get(i));
                    break;
                case 2:
                    textoCuartetos += "goto "+listaCuartetos.get(i).getValorP()+":"+"\n";
                    break;
                case 3:
                    textoCuartetos += listaCuartetos.get(i).getValor1()+":"+"\n";
                    break;
                case 4:
                    textoCuartetos += listaCuartetos.get(i).getValorP()+" = "+listaCuartetos.get(i).getValor1()+" + "+listaCuartetos.get(i).getValor2()+"\n";
                    break;
                case 5:
                    textoCuartetos += listaCuartetos.get(i).getValorP()+" = "+listaCuartetos.get(i).getValor1()+" - "+listaCuartetos.get(i).getValor2()+"\n";
                    break;
                case 6:
                    textoCuartetos += listaCuartetos.get(i).getValorP()+" = "+listaCuartetos.get(i).getValor1()+" * "+listaCuartetos.get(i).getValor2()+"\n";
                    break;
                case 7:
                    textoCuartetos += listaCuartetos.get(i).getValorP()+" = "+listaCuartetos.get(i).getValor1()+" / "+listaCuartetos.get(i).getValor2()+"\n";
                    break;
                case 8:
                    textoCuartetos += "printf ("+listaCuartetos.get(i).getValor1()+")"+"\n";
                    break;
                case 9:
                    textoCuartetos += listaCuartetos.get(i).getValorP()+" = "+listaCuartetos.get(i).getValor1()+" + "+listaCuartetos.get(i).getValor2()+"\n";
                    break;
                case 10:
                    textoCuartetos += listaCuartetos.get(i).getValorP()+""+"\n";
                    break;
                case 11:
                    textoCuartetos += listaCuartetos.get(i).getValorP()+" = "+listaCuartetos.get(i).getValor1()+" % "+listaCuartetos.get(i).getValor2()+"\n";
                    break;
                case 12:
                    textoCuartetos += listaCuartetos.get(i).getValorP()+"{"+"\n";
                    break;
                case 13:
                    textoCuartetos += listaCuartetos.get(i).getValorP()+"{"+"\n";
                    break;
                case 14:
                    textoCuartetos += "}"+"\n";
                    break;
                case 15:
                    textoCuartetos += "scanf("+listaCuartetos.get(i).getValor1()+", "+listaCuartetos.get(i).getValorP()+")"+"\n";
                    break;
                case 16:
                    textoCuartetos += "getch();"+"\n";
                    break;
                case 17:
                    textoCuartetos += "clrscr();"+"\n";
                    break;
                case 18:
                    textoCuartetos += listaCuartetos.get(i).getValor1()+" = "+listaCuartetos.get(i).getValorP()+"\n";
                    break;
                case 19:
                    textoCuartetos += listaCuartetos.get(i).getValorP()+"\n";
                    break;
            }
        }
        
    }
    
    public void agregarTextoIf(Cuarteto cuarteto){
        switch(cuarteto.getOperacion()){
            case "IF<":
                textoCuartetos += "if "+cuarteto.getValor1()+" < "+cuarteto.getValor2()+" "+cuarteto.getValorP()+":"+"\n";
                break;
            case "IF>":
                textoCuartetos += "if "+cuarteto.getValor1()+" > "+cuarteto.getValor2()+" "+cuarteto.getValorP()+":"+"\n";
                break;
            case "IF==":
                textoCuartetos += "if "+cuarteto.getValor1()+" == "+cuarteto.getValor2()+" "+cuarteto.getValorP()+":"+"\n";
                break;
            case "IF<=":
                textoCuartetos += "if "+cuarteto.getValor1()+" <= "+cuarteto.getValor2()+" "+cuarteto.getValorP()+":"+"\n";
                break;
            case "IF>=":
                textoCuartetos += "if "+cuarteto.getValor1()+" >= "+cuarteto.getValor2()+" "+cuarteto.getValorP()+":"+"\n";
                break;
            case "IF<>":
                textoCuartetos += "if "+cuarteto.getValor1()+" <> "+cuarteto.getValor2()+" "+cuarteto.getValorP()+":"+"\n";
                break;
        }
    }

    public String getTextoCuartetos() {
        return textoCuartetos;
    }

    public void setTextoCuartetos(String textoCuartetos) {
        this.textoCuartetos = textoCuartetos;
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
