
package comprobaciones;

public class ComprobadorTipos {
    /*
    1. INTEGER
    2. FLOAT
    3. CHAR
    4. ARRAY_INT
    5. ARRAY_FLOAT
    6. ARRAY_CHAR
    7. CONST_INT
    8. CONST_FLOAT
    9. CONST_CHAR
    10. FUNCTION
    11. CLASE
    0. 
    */
    
    
    public boolean isNumero(Object objeto){
        try {
            Integer integer = (Integer) objeto;
            return true;
        } catch (ClassCastException e) {
            try {
                float f = (float) objeto;
                return true;
            } catch (ClassCastException ex) {
                return false;
            }
        }
    }
    public boolean isInteger(Object objeto){
        try{
            Integer integer = (Integer) objeto;
            System.out.println("Integer: "+ integer);
            return true;
        }catch(ClassCastException e ){
            System.out.println("NO ES NUMERO");
            return false;
        }
        
    }
    public boolean isFloat(Object objeto){
        try{
            float f = (float) objeto;
            System.out.println("Float: "+ f);
            return true;
        }catch(ClassCastException e ){
            if(isInteger(objeto)){
                return true;
            }
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
    
    public int getTipoSimbolo(Object objeto){
        try {
            Integer integer = (Integer) objeto;
            return 1;
        } catch (ClassCastException e) {
            try {
                float f = (float) objeto;
                //double dx = (double) objeto;
                return 2;
            } catch (ClassCastException ex) {
                try {
                    String s = (String) objeto;
                    return 3;
                } catch (ClassCastException el) {
                    return 0;
                }
                
            }
        }
    }
    
    public boolean isValorCorrecto(String tipoDato, Object valor){
        switch (tipoDato){
            case "Integer":
                if(isInteger(valor)){
                    return true;
                }
                break;
            case "Float":
                if(isFloat(valor)){
                    return true;
                }
                break;
            case "Char":
                if(isChar(valor+"")){
                    return true;
                }
                break;
        }
        return false;
    }
    
    public int getValorTipo(Object valor){
        if(isInteger(valor)){
            return 1;
        }
        if(isFloat(valor)){
            return 2;
        }
        if(isChar(valor+"")){
            return 3;
        }
        return 0;
    }
    public String determinarTipo(Object valor){
                if(isInteger(valor)){
                    return "Integer";
                }
                if(isFloat(valor)){
                    return "Float";
                }
                if(isChar(valor+"")){
                    return "Char";
                }
        return null;
    }
    
    
    
    public Object tiparObjeto(Object operacion){
        Object objeto = null;
        System.out.println("Valor: "+operacion);
        float residuo = (float) operacion % 2;
        System.out.println("Residuo: "+residuo);
        if(isInteger(operacion)){
            //System.out.println("Tipo Int");
            objeto = (Integer) operacion;
        }else{
            //System.out.println("Tipo Float");
            objeto = (float) operacion;
        }
        return objeto;
    }
    
    public String convertirTipoTexto(String tipo){
        String tipoC = "";
        switch(tipo){
            case "Integer":
                return "int";
            case "Char":
                return "char";
            case "Float":
                return "float";
        }
        return tipoC;
    }
    
    
    
    
    
    
    public float convertirFlotante(Object objeto){
        float f = 0;
        try {
            Integer i = (Integer) objeto;
            f = (int) objeto;
        } catch (ClassCastException e) {
            f = (float)objeto;
        }
        return f;
    }
    
    public Object sumar(Object o1, Object o2){
        Object objeto = null;
        if(isInteger(o1) && isInteger(o2)){
            objeto = tiparObjeto((int)o1+(int)o2);
        }else{
            float f = (float)(convertirFlotante(o1) + convertirFlotante(o2));
            objeto = f;
            
        }
        return objeto;
    }
    
    public Object restar(Object o1, Object o2){
        Object objeto = null;
        
        return objeto;
    }
    
    public Object multiplicar(Object o1, Object o2){
        Object objeto = null;
        
        return objeto;
    }
    
    public Object dividir(Object o1, Object o2){
        Object objeto = null;
        if(isInteger(o1) && isInteger(o2)){
            objeto = tiparObjeto((int)o1/(int)o2);
        }else{
            float f = (float)(convertirFlotante(o1) / convertirFlotante(o2));
            objeto = f;
            
        }
        return objeto;
    }
    
    public Object divirEntero(Object o1, Object o2){
        Object objeto = null;
        
        return objeto;
    }
    
    public Object potencia(Object o1, Object o2){
        Object objeto = null;
        
        return objeto;
    }
    
    
}
