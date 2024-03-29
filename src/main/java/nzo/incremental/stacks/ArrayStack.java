package nzo.incremental.stacks;

import nzo.incremental.interfaces.IStack;

public class ArrayStack<E> implements IStack<E> {

    private final E[] array;
    private static final int CAPACITY = 1000;

    private int size = -1;

    public ArrayStack(){
        array = (E[])new Object[CAPACITY];
    }
    public ArrayStack(int capacity){
        array = (E[])new Object[capacity];
    }
    @Override
    public void push(E e) {
        if (size() == array.length){
            return;
        }
        array[++size] = e;
    }

    @Override
    public E pop() {
        if (isEmpty()){
            return null;
        }
        E e = array[size];
        array[size] = null;
        size--;
        return e;
    }

    @Override
    public E top() {
        if (isEmpty()){
            return null;
        }
        return array[size];
    }

    @Override
    public boolean isEmpty() {
        return size == -1;
    }

    @Override
    public int size() {
        return size + 1;
    }

    @Override
    public void print() {
        if (isEmpty()){
            System.out.println("\u001B[33m" + "Stack is empty. Nothing to show.");
            return;
        }
        System.out.print("\u001B[33m" + "Top ");
        for (int i = size() - 1; i >= 0; i--){
            System.out.print("\u001B[32m" + array[i] + " ");
        }
        System.out.println("\u001B[33m" + "Bottom");
    }

}
