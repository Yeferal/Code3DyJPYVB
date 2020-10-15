/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresdirecciones;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author LENOVO-PC
 */
public class TablaCuartetosB {
    
    
    private ArrayList<Cuarteto> listaCuartetos = new ArrayList<>();
    private String textoCuartetos = "";
    
    
    public void agregarCuarteto(Cuarteto cuarteto){
        if(cuarteto!=null && !cuarteto.getValor1().equals("et") && !cuarteto.getValor2().equals("et")){
            listaCuartetos.add(cuarteto);
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
    
}
