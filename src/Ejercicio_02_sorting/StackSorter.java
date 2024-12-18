package Ejercicio_02_sorting;


import Materia.Stacks.StackGeneric;

public class StackSorter {
    public static <T extends Comparable<T>> void sort(StackGeneric<T> stack) {
        StackGeneric<T> tempStack = new StackGeneric<>();
        while (!stack.isEmpty()) {
            T current = stack.pop();
            // Mueve los elementos de tempStack a stack para hacer espacio para current
            while (!tempStack.isEmpty() && tempStack.peek().compareTo(current) > 0) {
                stack.push(tempStack.pop());
            }
            // Coloca el current en tempStack
            tempStack.push(current);
        }
        // Transferir los elementos de tempStack a la pila original
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}

