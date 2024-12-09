package Materia.Queues;

import java.util.NoSuchElementException;
import Materia.Models.NodeGeneric;

public class QueueGeneric<T> {
    private NodeGeneric<T> front;
    private NodeGeneric<T> rear;

    public QueueGeneric() {
        this.front = null;
        this.rear = null;
    }

    // Método para encolar nodos
    public void enqueue(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    // Método para desencolar nodos
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T value = front.getValue();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return value;
    }

    // Devuelve el primer elemento sin eliminarlo
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return front.getValue();
    }

    // Verifica si la cola está vacía
    public boolean isEmpty() {
        return front == null;
    }

    // Obtiene el tamaño de la cola
    public int getSize() {
        int size = 0;
        NodeGeneric<T> current = front;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    // Imprime los valores de la cola
    public void printQueue() {
        NodeGeneric<T> current = front;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}