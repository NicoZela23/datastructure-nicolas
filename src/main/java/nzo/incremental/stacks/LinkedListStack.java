package nzo.incremental.stacks;

import nzo.incremental.interfaces.IStack;
import nzo.incremental.linkedlists.LinkedList;

public class LinkedListStack<E> implements IStack<E> {

    private LinkedList<E> list = new LinkedList<>();
    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E top() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void print() {
        list.print();
    }
}
