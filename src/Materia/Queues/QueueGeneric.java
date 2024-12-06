package Materia.Queues;


import java.util.NoSuchElementException;

import Materia.Models.Node;

public class QueueGeneric<T> {
    private Node<T> front;
    private Node<T> rear;

    public QueueGeneric() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public Node<T> dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        Node<T> node = front;
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return node;
    }

    public Node<T> peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return front; 
    }

    public int size() {
        int size = 0;
        Node<T> current = front;
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
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return front == null;
    }
}

