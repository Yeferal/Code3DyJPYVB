
package comprobaciones;

public class ComprobadorTipos {
    /*
    1. INTEGER
    2. DECIMAL
    3. CHAR
    */
    
    
    public boolean isNumero(String numeroTxt){
        try{
            Integer integer = new Integer(numeroTxt);
            System.out.println("Numero: ");
            return true;
        }catch(NumberFormatException e ){
            System.out.println("NO ES NUMERO");
            return false;
        }
        
    }
    public boolean isInteger(String numeroTxt){
        try{
            Integer integer = new Integer(numeroTxt);
            System.out.println("Integer: "+ integer);
            return true;
        }catch(NumberFormatException e ){
            System.out.println("NO ES NUMERO");
            return false;
        }
        
    }
    public boolean isFloat(String numeroTxt){
        try{
            Float f = new Float(numeroTxt);
            System.out.println("Float: "+ f);
            return true;
        }catch(NumberFormatException e ){
            System.out.println("NO ES NUMERO");
            return false;
        }
        
    }
    public boolean isChar(String txt){
        if(txt.length()==1){
           return true;
        }
        return false;
    }
    
}
