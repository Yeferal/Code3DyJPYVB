
package tresdirecciones;

public class Cuarteto {
    
    private String operacion, valor1, valor2, valorP;
    private int tipo;

    public Cuarteto(String operacion, String valor1, String valor2, String valorP, int tipo) {
        this.operacion = operacion;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valorP = valorP;
        this.tipo = tipo;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public String getValorP() {
        return valorP;
    }

    public void setValorP(String valorP) {
        this.valorP = valorP;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public String toString(){
        return ".\t"+getOperacion()+"\t\t"+getValor1()+"\t\t"+getValor2()+"\t"+getValorP();
    }
    
}
