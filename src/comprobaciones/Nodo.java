
package comprobaciones;

public class Nodo {
    
    private String text;
    private Object valor;

    public Nodo(String text, Object valor) {
        this.text = text;
        this.valor = valor;
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
    
    
    
    
}
