
package comprobaciones;

public class Nodo {
    
    private String text;
    private Object valor;
    private int tipo;

    public Nodo(String text, Object valor, int tipo) {
        this.text = text;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Nodo(String text, Object valor) {
        this.text = text;
        this.valor = valor;
        tipo = 0;
    }
    
    

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
