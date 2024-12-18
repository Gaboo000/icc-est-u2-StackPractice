package Models;

import Materia.Models.NodeGeneric;

public class LinkedList<T> {
    private NodeGeneric<T> head;  //Referenciia al primer nodo
    private int size = 0; //Controlador del numero de nodo en la 
    
    public void print (){
        if (head == null) { 
            System.out.println("END"); 
            return; 
        } 
        NodeGeneric<T> current = head; 
        while (current != null) { 
            System.out.print(current.getValue() + " --> "); 
            current = current.getNext(); 
        } 
        System.out.println("END");
    }
    public void AppendToTail(T value){
        if(head == null){
            head = new NodeGeneric<>(value);
        }else{
            NodeGeneric<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }current.setNext(new NodeGeneric<>(value));
        }
        size++;

    }


    public NodeGeneric<T> getHead() {
        return head;
    }
    public void setHead(NodeGeneric<T> head) {
        this.head = head;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

}
