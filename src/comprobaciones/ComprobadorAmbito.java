
package comprobaciones;

import java.util.ArrayList;
import simbolos.Simbolo;

public class ComprobadorAmbito {
    
    public ArrayList<Integer> ambitosCamino = new ArrayList<>();
    int ambitoBandera=0, ambitoPivote=0;
    
    public void agregarAmbito(int ambitoNuevo){
        ambitosCamino.add(ambitoNuevo);
    }
    
    public void sacarAmbito(){
        if(ambitosCamino.size()!=0){
            ambitosCamino.remove(ambitosCamino.size()-1);
        }
    }
    
    public int getAmbitoActual(){
        if(ambitosCamino.size()!=0){
            return ambitosCamino.get(ambitosCamino.size()-1);
        }
        return 0;
    }
    
    /*busca que no existe una variable en el mismo ambito o que pertenezca al conjunto de ambitos*/
    public boolean verificarVariable(ArrayList<Simbolo> listaSimbolos, Simbolo s){
        System.out.println("-----------------------------"+ambitosCamino+"--entre--: "+s.getNombre()+"---ambito: "+s.getAmbito());
        for (int i = 0; i < listaSimbolos.size(); i++) {
            //si el simbolo es del mismo nombre
            if(listaSimbolos.get(i).getNombre().equalsIgnoreCase(s.getNombre())){
                if(listaSimbolos.get(i).getAmbito()==s.getAmbito()){
                    //si el ambitoy el nombre son iguales retorna falso
                    return false;
                }else{
                    //en caso que el ambito sea deferente se analiza que no sean del mismo conjunto
                    for (int j = 0; j < ambitosCamino.size(); j++) {
                        //si encuentra el ambito dentro del conjunto de ambitos
                        if(listaSimbolos.get(i).getAmbito()==ambitosCamino.get(j)){
                            for (int k = 0; k < ambitosCamino.size(); k++) {
                                //si el ambito tambien es del conjunto
                                if (s.getAmbito()==ambitosCamino.get(k)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public void verificarAmbito(int ambitoFlag, int ambitoActual, int tabs){
        //int contadorAmbito = ambitoFlag;
        /*if(ambitosCamino.size()==tabs){
            
        }else if(ambitosCamino.size()<tabs){
            int sumar = tabs-ambitosCamino.size();
            sumarAmbito(sumar);
        }else if(ambitosCamino.size()>tabs){
            int restar = ambitosCamino.size()-tabs;
            restarAmbito(restar);
        }*/
        sacarAmbito();
        sumarAmbito(1);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>AmbitoLista : "+ambitosCamino);
        //return contadorAmbito;
    }
    
    public void sumarAmbito(int sumar){
        for (int i = 0; i < sumar; i++) {
            ambitoBandera++;
            agregarAmbito(ambitoBandera);  
        }
        ambitoPivote = getAmbitoActual();
    }
    
    public void restarAmbito(int restar){
        for (int i = 0; i < restar; i++) {
            sacarAmbito();
        }
        ambitoPivote = getAmbitoActual();
    }

    public int getAmbitoBandera() {
        return ambitoBandera;
    }

    public int getAmbitoPivote() {
        return ambitoPivote;
    }
    
    
}
