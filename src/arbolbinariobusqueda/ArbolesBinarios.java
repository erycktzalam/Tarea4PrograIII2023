
package arbolbinariobusqueda;

public class ArbolesBinarios {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creacion del arbol
        Arbol arbol = new Arbol();
        
        //Insertar nodos en el arbol
        arbol.insertarNodo(5);
        arbol.insertarNodo(11);
        arbol.insertarNodo(22);
        arbol.insertarNodo(14);
        arbol.insertarNodo(2);
        arbol.insertarNodo(8);
       
        //Se imprimen los recorridos
        
        System.out.println("Recorrido INORDER");
        arbol.imprimirArbolInOrder();
        System.out.println("");
        
        System.out.println("Recorrido PREORDER");
        arbol.imprimirArbolPreOrder();
        System.out.println("");
        
        System.out.println("Recorrido POSTORDER");
        arbol.imprimirArbolPostOrder();
        System.out.println();
        
        //se realiza la busqueda de un nodo, se busque un nodo que no existe
        //para probar el mensaje de salida, se busca el valor 50
        
        System.out.println("Busqueda de Nodo");
        
        arbol.buscarNodo(50);
        
        //Se realiza otra busqueda con un valor que si existe para comprobar el
        //metodo de busqueda
        
        System.out.println("Busqueda de Nodo 2");
        
        arbol.buscarNodo(14);
        
        //Se elimina un nodo
        
        System.out.println("Eliminar nodo");
        
        arbol.eliminarNodo(5);
        
        //se imprimen de nuevo los recorridos para validar que el dato se
        //elimino y que se mantiene la estructura y orden del arbol.
        
        System.out.println("Recorridos despues de eliminar");
        
        System.out.println("Recorrido INORDER");
        arbol.imprimirArbolInOrder();
        System.out.println("");
        
        System.out.println("Recorrido PREORDER");
        arbol.imprimirArbolPreOrder();
        System.out.println("");
        
        System.out.println("Recorrido POSTORDER");
        arbol.imprimirArbolPostOrder();
    }
    
}
