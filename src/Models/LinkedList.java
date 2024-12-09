package Models;

import Materia.Models.NodeGeneric;

public class LinkedList<T> {
    private NodeGeneric<T> head;  //Referenciia al primer nodo
    private int size = 0; //Controlador del numero de nodo en la 
    

    public void print (){
        if(head == null){
            System.out.println("END");
            return;
        }
        NodeGeneric<T> current = head;
        while(current.getNext() != null){
            System.out.println(current.getValue()+" --> ");
            current = current.getNext();
        }
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
}
