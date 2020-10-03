
package simbolos;

import java.util.ArrayList;

public class TablaSimbolos {
    /*
    1. INTEGER
    2. DECIMAL
    3. CHAR
    */
    
    public int posicionSimbolo;
    private ArrayList<Simbolo> listaSimbolos = new ArrayList<>();
    
    public ArrayList<Simbolo> getListaSimbolos(){
        return listaSimbolos;
    }
    
    public void agregarSimbolo(Simbolo s){
        listaSimbolos.add(s);
    }
    
    public void setSimbolo(Object valor){
        listaSimbolos.get(posicionSimbolo).setObjeto(valor);
    }
    
    
    public void pintar(){
        System.out.println("No.\tNombre\t\tTipo\t\tAmbito\t\tObjeto");
        for (int i = 0; i < listaSimbolos.size(); i++) {
            System.out.println((i+1)+".\t"+listaSimbolos.get(i).toString());
        }
    }
    
    public boolean isExistSimbolo(ArrayList<Integer> ambitosCamino, String nombre){
        System.out.println("-----------------------------"+ambitosCamino+"--entre--: "+nombre+"---ambito: ");
        for (int i = 0; i < listaSimbolos.size(); i++) {
            if(listaSimbolos.get(i).getNombre().equalsIgnoreCase(nombre)){
                System.out.println(listaSimbolos.get(i).getNombre()+" |==| "+nombre);
                for (int j = 0; j < ambitosCamino.size(); j++) {
                    if(listaSimbolos.get(i).getAmbito()==ambitosCamino.get(j)){
                        posicionSimbolo = i;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public Object getSimboloValor(){
        Object o = listaSimbolos.get(posicionSimbolo).getObjeto();
        return o;
    }
    
    public Simbolo getSimbolo(){
        Simbolo o = listaSimbolos.get(posicionSimbolo);
        return o;
    }
    
}
