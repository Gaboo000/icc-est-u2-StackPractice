import Materia.Queues.Queue;
import Materia.Stacks.Stack;
import Materia.Stacks.StackGeneric;
import  Models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        run();
    }

    public static void run (){
        //Instanciar clase
        Stack stack = new Stack();


        //Agregar elementos a la pila 
        stack.push(5);
        stack.push(7);
        stack.push(20);
        stack.push(9);
        stack.push(7);
        stack.push(0);
        stack.push(8);

        //Mostrar valores 
        System.out.println("Cima        --->"+ stack.peek());
        System.out.println("Retirar     --->"+stack.pop());
        System.out.println("Cima        --->"+stack.peek());
        System.out.println("Retirar     --->"+stack.pop());
        System.out.println("Cima        --->"+stack.peek());


        System.out.println("Getting Stack Size.... "+stack.getSize());

    }



    public static void runStackGeneric(){

        
        StackGeneric <Pantalla> router = new StackGeneric<>();
        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "Users Page", "/home/menu/users"));

        System.out.println("Estoy en "+router.peek().getRuta());
        System.out.println("Regreso a "+router.pop());
        System.out.println("Estoy en "+router.peek().getRuta());

        router.push(new Pantalla(1, "Settings Page", "/home/menu/settings"));

        System.out.println("Pantalla = "+router.getSize());
        System.out.println("Estoy en "+router.peek().getRuta());

        


    }

    public static void runQueue(){
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());
    }

    public static void runQueueGeneric(){
        
    }
}


