package Materia.Stacks;

import java.util.EmptyStackException;

import Materia.Models.NodeGeneric;

public class StackGeneric<T> {
    private NodeGeneric<T> top; // Nodo generico
    private int size; // Variable del tamaño O(1)

    // Crea/Instancia una pila vacio. Top: "Nulo" ; Size: 0
    public StackGeneric() {
        this.top = null;
        this.size = 0;
    }

    public void push(T data) {
        NodeGeneric<T> newNode = new NodeGeneric<>(data);
        newNode.setNext(top);
        top = newNode;
        size++;
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        int size = 0;
        NodeGeneric<T> current = top;
        while(current != null){
            size++;
            current = current.getNext();
        }
        return size;
    }

    public NodeGeneric<T> popNode(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        NodeGeneric<T> value = top;
        top = top.getNext();
        size--;
        return value;
    }
    public void printStack() {
        NodeGeneric<T> current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}