package nzo.incremental.queues;

import nzo.incremental.interfaces.IQueue;

public class ArrayQueue<Q> implements IQueue<Q> {
    private final Q[] array;
    private static final int CAPACITY = 1000;

    private int size = -1;

    public ArrayQueue(){
        array = (Q[])new Object[CAPACITY];
    }
    public ArrayQueue(int capacity){
        array = (Q[])new Object[capacity];
    }
    @Override
    public void enqueue(Q q) {
        if(size() == array.length){
            System.out.println("Queue is full");
            return;
        }
        array[++size] = q;
    }

    @Override
    public Q dequeue() {
        if (isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        var element = array[0];

        for (int i = 0; i < size() - 1; i++){
            array[i] = array[i + 1];
        }
        size--;
        return element;
    }

    @Override
    public Q first() {
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        return array[0];
    }

    @Override
    public boolean isEmpty() {
        return size == -1;
    }

    @Override
    public int size() {
        return size + 1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i <= size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
