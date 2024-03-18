
package listaenlazadasimple;

/**
 *
 * @author geron
 */
public class Lista {

    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }

    // Método para insertar un elemento al principio de la lista
    public void insertarAlPrincipio(int dato) {
        Nodo newNodo = new Nodo(dato); /*creamos un nuevo nodo llamado `newNode` con el valor `data` proporcionado.
        - Este nodo representa el elemento que deseamos insertar al principio de la lista*/

        newNodo.next = cabeza; /* Luego, establecemos el puntero `next` del nuevo nodo (`newNodo.next`) 
        para que apunte al nodo actual que estaba al principio de la lista (es decir, `cabeza`).
        - Esto significa que el nuevo nodo ahora apunta al nodo que antes era el primero en la lista.*/

        cabeza = newNodo; /* actualizamos la referencia `cabeza` para que apunte al nuevo nodo (`newNode`).
        - Ahora, el nuevo nodo se convierte en el primer elemento de la lista.*/
    }

    // Método para insertar un elemento al final de la lista
    public void insertarAlFinal(int dato) { 
        Nodo  NewNodo = new Nodo(dato); /* Se crea un nuevo nodo (Nodo nuevoNodo = new Nodo(dato);) con el valor pasado como parámetro (dato),
        que será el dato que contendrá el nuevo nodo. */
        if (cabeza == null) { //Comprobamos si la lista está vacía
            cabeza = NewNodo;//Si está vacía entonces el dato se establece como el principal de la lista
            return;
        }

        /*Si la lista no está vacía, se necesita encontrar el último nodo en la lista para insertar el nuevo nodo después de él. */
        Nodo actual = cabeza; /*Se crea un puntero actual y se inicializa con la cabeza de la lista (Nodo actual = cabeza;). */
        while (actual.next != null) { /*Se usa este bucle para iterar sobre la lista hasta que se llegue al último nodo 
                (es decir, hasta que actual.siguiente sea null). */

            actual = actual.next; /*n cada iteración, se avanza actual al siguiente nodo (actual = actual.siguiente;)
             hasta que actual apunte al último nodo en la lista. */
        }
        actual.next = NewNodo; /*Una vez que se llega al último nodo, se asigna el nuevo nodo como el siguiente nodo del último nodo en la lista. */
    }

    // Método para retirar el primer elemento de la lista
    public int retirarAlPrincipio() {
        if (cabeza == null) { //Se verifica si la lista está vacía
            System.out.println("La lista está vacía"); //Si la lista está vacía, se imprime el mensaje
            return -1; // Se devuelve -1 como valor especial para indicar que la lista está vacía y no se pudo retirar ningún elemento.
        }
        //Si la lista no está vacía, significa que hay al menos un elemento en ella.
        int dato = cabeza.dato; //Se guarda el valor del dato del primer nodo en la variable dato.
        cabeza = cabeza.next; /*Luego, se mueve el puntero cabeza al siguiente nodo en la lista. 
        Esto se logra asignando cabeza.siguiente a cabeza, lo que efectivamente "salta" al siguiente nodo de la lista.*/
        return dato; //se devuelve el valor de dato, que es el dato del nodo que se retiró al principio de la lista.
    }

    // Método para retirar el último elemento de la lista
    public int retirarAlFinal() {
        if (cabeza == null) { //se verifica si la lista está vacía 
            System.out.println("La lista está vacía");
            return -1; //indicando que la lista está vacía
        }
        if (cabeza.next == null) { //Si la lista tiene un solo nodo ( cabeza.siguiente == null),
            int dato = cabeza.dato; // se guarda el valor del dato del nodo en dato
            cabeza = null; //se establece cabeza como null, luego la lista estará vacía después de retirar este nodo
            return dato; //se devuelve el valor del dato del nodo retirado.
        }
        Nodo actual = cabeza; //Si la lista tiene más de un nodo, se utiliza un bucle para encontrar el penúltimo nodo de la lista. 
        while (actual.next.next != null) { /*se hace moviendo un puntero actual a través de la lista hasta que actual.siguiente.siguiente 
                                            sea null, lo que significa que actual apunta al penúltimo nodo.*/
            actual = actual.next;
        }
        int dato = actual.next.dato; //Una vez que se encuentra el penúltimo nodo, se guarda el valor del dato del último nodo en dato
        actual.next = null; /*se establece que el siguiente nodo del penúltimo nodo sea null, 
        lo que elimina el último nodo de la lista, y se devuelve el valor del dato del nodo retirado.*/
        return dato;
    }

    // Método para consultar la lista
    public void imprimirLista() {
        //Aqui simplemente se itera sobre cada nodo y se imprime el valor que contiene hasta que llegue al ultimo el cual se valida como "null"
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }

    // Método para obtener la longitud de la lista
    public int longitud() {
        int longitud = 0; //contador 
        Nodo actual = cabeza; //copia de la lista
        while (actual != null) {
            longitud++; // se va acumulando la cantidad de nodos que contiene la lista si el ciclo es true
            actual = actual.next; //cada que itera se apunta al siguiente nodo
        }
        return longitud; //se devuelve el tamaño de la lista
    }

    // Método para verificar si la lista está vacía
    public boolean esVacia() {
        return cabeza == null;
    }
}

