
package arbolbinariobusqueda;

public class Nodo {
    
    private int valor;
    private Nodo nodoIzquierdo;
    private Nodo nodoDerecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.nodoIzquierdo=null;
        this.nodoDerecho=null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(Nodo nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(Nodo nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }
    
    public void insertarNodo (int dato){
        if (dato < this.valor){
            if(this.nodoIzquierdo == null){
                this.nodoIzquierdo = new Nodo(dato);
            }else{
                this.nodoIzquierdo.insertarNodo(dato);
            }
        }else{
            if(this.nodoDerecho == null){
                this.nodoDerecho = new Nodo (dato);
            }else{
                this.nodoDerecho.insertarNodo(dato);
            }
        }
    }
    
    
}
