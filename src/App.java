import Stacks.Stack;

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
}
