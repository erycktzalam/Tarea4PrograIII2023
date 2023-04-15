package arbolbinariobusqueda;

public class Arbol {

    Nodo root;

    public Arbol() {
        this.root = null;
    }

    public void insertarNodo(int dato) {
        if (this.root == null) {
            this.root = new Nodo(dato);
        } else {
            this.root.insertarNodo(dato);
        }
    }

    public void buscarNodo(int dato) {

        Nodo aux = root;
        boolean encontrado = false;
        if (root == null) {
            System.out.println("El arbo esta vacio");
            encontrado = true;
        }

        while (!encontrado && aux != null) {
            if (aux.getValor() == dato) {
                encontrado = true;
            } else if (dato < aux.getValor()) {
                aux = aux.getNodoIzquierdo();
            } else {
                aux = aux.getNodoDerecho();
            }
        }

        if (encontrado) {
            System.out.println("El valor encontrado es:");
            System.out.println(aux.getValor());
        } else {
            System.out.println("El dato no fue encontrado");
        }
    }
    
    public void eliminarNodo (int dato){
        this.root = this.eliminarNodo(this.root, dato);
    }

    public void imprimirArbolPreOrder() {
        this.recorrerArbolPreOrder(this.root);
    }
    
    public Nodo eliminarNodo (Nodo nodo, int dato){
        if (nodo == null){
            return nodo;
        }
        
        if (dato > nodo.getValor()){
            nodo.setNodoDerecho(this.eliminarNodo(nodo.getNodoDerecho(), dato));
        }else if (dato < nodo.getValor()){
            nodo.setNodoIzquierdo(this.eliminarNodo(nodo.getNodoIzquierdo(), dato));
        }else {
            if (nodo.getNodoIzquierdo() == null && nodo.getNodoDerecho() == null){
                nodo = null;
            }else if (nodo.getNodoDerecho() != null){
                nodo.setValor(this.sucesor(nodo));
                nodo.setNodoDerecho(this.eliminarNodo(nodo.getNodoDerecho(), nodo.getValor()));
            }else {
                nodo.setValor(this.predecesor(nodo));
                nodo.setNodoIzquierdo(this.eliminarNodo(nodo.getNodoIzquierdo(), nodo.getValor()));
            }
        }
        return nodo;
    }
    
    private int sucesor (Nodo nodo){
        nodo = nodo.getNodoDerecho();
        while (nodo.getNodoIzquierdo() != null){
            nodo = nodo.getNodoIzquierdo();
        }
        return nodo.getValor();
    }
    
    private int predecesor (Nodo nodo){
        nodo = nodo.getNodoIzquierdo();
        while (nodo.getNodoDerecho() != null){
            nodo = nodo.getNodoDerecho();
        }
        return nodo.getValor();
    }

    public void recorrerArbolPreOrder(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            System.out.print(nodo.getValor() + ",");
            recorrerArbolPreOrder(nodo.getNodoIzquierdo());
            recorrerArbolPreOrder(nodo.getNodoDerecho());
        }
    }

    public void imprimirArbolInOrder() {
        this.recorrerArbolInOrder(this.root);
    }

    public void recorrerArbolInOrder(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            recorrerArbolInOrder(nodo.getNodoIzquierdo());
            System.out.print(nodo.getValor() + ",");
            recorrerArbolInOrder(nodo.getNodoDerecho());
        }
    }

    public void imprimirArbolPostOrder() {
        this.recorrerArbolPostOrder(this.root);
    }

    public void recorrerArbolPostOrder(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            recorrerArbolPostOrder(nodo.getNodoIzquierdo());
            recorrerArbolPostOrder(nodo.getNodoDerecho());
            System.out.print(nodo.getValor() + ",");
        }
    }
}
