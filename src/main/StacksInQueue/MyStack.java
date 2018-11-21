package main.StacksInQueue;

public class MyStack<T> {

    private class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private int size;

    public void push(T t) {
        Node<T> newElem = new Node<>(t);

        if(head == null) {
            head = newElem;
        } else {
            newElem.next = head;
            head = newElem;
        }

        size++;
    }

    public T pop() {
        if(head == null)
            return null;

        T elem = head.data;
        head = head.next;

        size--;

        return elem;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printStack() {
        System.out.print("Стек: ");

        if(size == 0)
            System.out.print("Пустой");
        else
            for(Node<T> element = head; element != null; element = element.next)
                System.out.print(" " + element.data);
    }
}
