package nzo.incremental.stacks;

import nzo.incremental.interfaces.IStack;

import java.util.SplittableRandom;

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
            System.out.println("Stack is full");
            return;
        }
        array[++size] = e;
    }

    @Override
    public E pop() {
        if (isEmpty()){
            System.out.println("Stack is empty");
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
            System.out.println("Stack is empty");
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
            System.out.println("Stack is empty");
            return;
        }
        for (int i = size() - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
