package main.StacksInQueue;

public class TwoStacksInQueue<T> {

    private MyStack<T> input;
    private MyStack<T> output;
    private int size;

    TwoStacksInQueue() {
        input = new MyStack<>();
        output = new MyStack<>();
    }

    public void insert(T t) {
        input.push(t);
        size++;
    }

    public T remove() {
        if(output.isEmpty())
            while(!input.isEmpty())
                output.push(input.pop());

        T element = null;
        if(!output.isEmpty()) {
            element = output.pop();
            size--;
        }

        return element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
