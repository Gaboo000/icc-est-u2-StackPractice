package Materia.Queues;


import Materia.Models.Node;
import java.util.NoSuchElementException;

public class Queue {
    private Node front;
    private Node rear;


    public Queue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }



    public void enqueue(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            rear.setNext(newNode); 
            rear = newNode;
        }
    }

    public Node dequeue(){
        if(isEmpty()){
            throw  new NoSuchElementException("La cola esta vacia");
        }
        Node node = front;
        front = front.getNext();
        if(front == null){
            rear = null;
        }
        return node;
        

    }

    public Node peek(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        return front;
    }

    public int getSize() {
        int size = 0;
        Node current = front;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }



    
    private boolean isEmpty() {
        return front ==null;
    }




    
    
    
}
