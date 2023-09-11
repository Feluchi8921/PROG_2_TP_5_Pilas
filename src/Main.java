import java.util.Arrays;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        //creo una pila de usuarios
        Stack<Usuario> pilaUsuarios = new Stack<>();

        //Creo usuarios
        Usuario usuario1 = new Usuario("Juan", "Perez", 65321456);
        Usuario usuario2 = new Usuario("Maria", "Suarez", 32569872);
        Usuario usuario3 = new Usuario("Sara", "Sosa", 36523123);
        Usuario usuario4 = new Usuario("Juana", "De Arco", 31226532);
        Usuario usuario5 = new Usuario("Tomás", "Torres", 623512252);

        //Push: Agregar un objeto
        pilaUsuarios.push(usuario1);
        pilaUsuarios.push(usuario2);
        pilaUsuarios.push(usuario3);
        pilaUsuarios.push(usuario4);
        pilaUsuarios.push(usuario5);

        //Pop: Duvuelve y elimina el elemento superior de la pila
        System.out.println("Usuario eliminado: "+pilaUsuarios.pop());

        //Peek: Devuelve el primer elemento pero no lo elimina
        System.out.println("El primer elemento de la pila es; "+pilaUsuarios.peek());

        //Empty: Retorna true or false si está vacía
        System.out.println("¿La pila está vacía?"+pilaUsuarios.empty());

        //Search: Buscar un elemento. Devuelve la posicion
        System.out.println("Search usuario 4: "+pilaUsuarios.search(usuario4));

        //Top: consultar el tope de la lista sin eliminarlo
        //pilaUsuarios.pop();

        //Size: cantidad de elementos almacenados
        System.out.println("El tamaño de la pila es: "+pilaUsuarios.size());

        //Copy: una copia de la pila
        //Creo una arreglo de objetos
        Usuario[] copia = new Usuario[pilaUsuarios.size()];
        pilaUsuarios.copyInto(copia);
        System.out.println("CopyInto: \n"+Arrays.toString(copia));

        //Reverse: devuelve la pila en el orden inverso
        //Stack<Usuario> reverseStack = reverse(pilaUsuarios);


        //Recorrer una pila
        do{
            System.out.println("Valor: "+pilaUsuarios.peek());
        }
        while(pilaUsuarios.pop()!= null && !pilaUsuarios.empty());
    }
}