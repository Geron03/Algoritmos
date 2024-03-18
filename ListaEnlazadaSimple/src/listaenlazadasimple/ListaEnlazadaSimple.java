package listaenlazadasimple;

/**
 *
 * @author geron
 */
public class ListaEnlazadaSimple {

    public static void main(String[] args) {
        Lista lista = new Lista();
        
        // Insertar elementos
        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(2005);
        lista.insertarAlFinal(1000);
        lista.insertarAlPrincipio(5);
        lista.insertarAlPrincipio(20);


        // Consultar lista
        System.out.println("Lista:");
        lista.imprimirLista();

        // Retirar elementos
        System.out.println("Elemento retirado al principio: " + lista.retirarAlPrincipio());
        System.out.println("Elemento retirado al final: " + lista.retirarAlFinal());

        // Consultar lista actualizada
        System.out.println("Lista actualizada:");
        lista.imprimirLista();

        // Longitud de la lista
        System.out.println("Longitud de la lista: " + lista.longitud());

        // Verificar si la lista está vacía
        System.out.println("¿La lista está vacía? " + lista.esVacia());


    }

}
