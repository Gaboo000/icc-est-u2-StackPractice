package Materia.Models;


public class NodeGeneric<T> {
    private T value;
    private NodeGeneric<T> next;

    public NodeGeneric(T value) {
        this.value = value;
        //this.next = next;
    }

    public T getValue() {
        return value;
    }

    public NodeGeneric<T> getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(NodeGeneric<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeGeneric [value=" + value +"]";
    }
}