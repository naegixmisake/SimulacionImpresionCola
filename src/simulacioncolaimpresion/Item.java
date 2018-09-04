package simulacioncolaimpresion;

import java.util.Objects;

public class Item {
    
    private String index;
    private String archivo;
    private String tiempo;

    public Item(String index, String archivo, String tiempo) {
        this.index = index;
        this.archivo = archivo;
        this.tiempo = tiempo;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Item{" + "index=" + index + ", archivo=" + archivo + ", tiempo=" + tiempo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.index);
        hash = 31 * hash + Objects.hashCode(this.archivo);
        hash = 31 * hash + Objects.hashCode(this.tiempo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.index, other.index)) {
            return false;
        }
        if (!Objects.equals(this.archivo, other.archivo)) {
            return false;
        }
        return Objects.equals(this.tiempo, other.tiempo);
    }
    
    
            
}
