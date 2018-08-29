package simulacioncolaimpresion;

import java.util.Iterator;
import java.util.Objects;

public class Cola <E> implements Iterable<E>{
    private Nodo top;
    private Nodo end;
    private int size;
    
    public Cola() {
        this.top = null;
        this.size = 0;
    }

    public Nodo getTop() {
        return top;
    }

    public void setTop(Nodo top) {
        this.top = top;
    }

    public Nodo getEnd() {
        return end;
    }

    public void setEnd(Nodo end) {
        this.end = end;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * insertar nodo a la cola
     * @param valor
     * @return nodo agregado
     **/
    public Nodo<E> enqueue(E valor){
        Nodo<E> nodoNuevo = new Nodo(valor);
        if(this.isEmpty()){
            this.setTop(nodoNuevo);
            this.setEnd(nodoNuevo);
        }else{
            if(this.getTop().getLink()==null){
                this.getTop().setLink(nodoNuevo);
            }else{
                this.getEnd().setLink(nodoNuevo);
            }
            this.setEnd(nodoNuevo);
        }
        this.setSize(this.getSize()+1);
        return nodoNuevo;
    }
    
    /**
     * Sacar nodos de la cola
     * @return nodo resultante
     **/
    public Nodo<E> dequeue(){
        if(isEmpty()){return null;}
        Nodo<E> nodo = this.getTop();
        if(this.getTop().equals(this.getEnd())){
            this.setTop(null);
            this.setEnd(null);
        }else{
            this.setTop(nodo.getLink());
        }
        this.setSize(this.getSize()-1);
        return nodo;
    }
    
    /**
     * Obtener el objeto del top sin sacarlo
     * @return nodo resultante
     **/
    public Nodo<E> peek(){
        return this.getTop();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.getTop());
        hash = 83 * hash + Objects.hashCode(this.getEnd());
        hash = 83 * hash + this.getSize();
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
        final Cola<?> other = (Cola<?>) obj;
        if (!Objects.equals(this.getTop(), other.getTop())) {
            return false;
        }
        if (!Objects.equals(this.getEnd(), other.getEnd())) {
            return false;
        }
        return this.getSize() == other.getSize();
    }

    
    
    @Override
    public String toString() {
        String retorno = "Cola: ";
        int index = 0;
        Iterator<E> it = this.iterator();
        while (it.hasNext()){
            E dato = it.next();
            retorno += "["+index+"]:" + dato.toString() + ", ";
            index++;
        }
        retorno = (retorno.length()==0) ? "" : retorno.substring(0,retorno.length()-2);
        return retorno;
    }
    
    public void display(){
        String retorno = "";
        int index = 0;
        Iterator<E> it = this.iterator();
        while (it.hasNext()){
            E dato = it.next();
            retorno += "["+index+"]:" + dato.toString() + ", ";
            index++;
        }
        retorno = (retorno.length()==0) ? "" : retorno.substring(0,retorno.length()-2);
        System.out.println("Tamaño:" + this.getSize() + "\nDatos: " + retorno + "\n");
    }
    
    public boolean isEmpty(){
        return (this.getTop() == null);
    }
    
    @Override
    public Iterator<E> iterator() {
        Iterator<E> it = new Iterator<E>() {
            Nodo<E> currentNode = top;
            
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public E next() {
                if (hasNext()) {
                    E dato = currentNode.getValor();
                    currentNode = currentNode.getLink();
                    return dato;
                } else {
                    return null;
                }
            }
        };
        return it;
    }
}
