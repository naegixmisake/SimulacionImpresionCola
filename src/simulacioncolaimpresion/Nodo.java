package simulacioncolaimpresion;


import java.util.Objects;

public class Nodo<E>{
    private E valor;
    private Nodo link;

    public Nodo(){}
    
    public Nodo(E nodo) {
        this.valor = nodo;
        this.link = null;
    }

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.valor);
        hash = 67 * hash + Objects.hashCode(this.link);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nodo other = (Nodo) obj;
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        return Objects.equals(this.link, other.link);
    }

    @Override
    public String toString() {
        return "" + valor;
    }
    
    
}
