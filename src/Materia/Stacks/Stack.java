package Materia.Stacks;

import Materia.Models.Node;
import java.util.EmptyStackException;

public class Stack {
    private Node top;


    public Stack (){
        this.top= null;
    }


    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }


    //Metodo que retorna el valor del node en la cima 
    public int peek (){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();

    }

    //Metodo que retira el nodo de la cima
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    public boolean isEmpty (){
        return top == null;
    }


    public void printStack (){
        Node current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current= current.getNext();
            
        }

    }


    public int getSize (){
        Node current = top;
        int cont = 0;
        while(current != null){
            cont ++;
            current= current.getNext();
        }

        return cont;
    }
    
    
}
