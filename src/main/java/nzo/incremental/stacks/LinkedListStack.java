package nzo.incremental.stacks;

import nzo.incremental.interfaces.ILinkedList;
import nzo.incremental.interfaces.IStack;
import nzo.incremental.linkedlists.LinkedList;
import nzo.incremental.linkedlists.Node;

public class LinkedListStack<E> implements IStack<E> {
    Node<E> head;
    private ILinkedList<E> list = new LinkedList<>();
    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E topElement = top();
        list.removeFirst();
        return topElement;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return list.first().data;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }
        return list.size();
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to show");
            return;
        }
        System.out.print("\u001B[36m" + "Top ");
        list.print();
        System.out.println("\u001B[36m" + " Bottom");
    }
    public E get(int index) {
        int size = list.size();
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> current = list.first();
        for (int i = 0; i < size - index - 1; i++) {
            current = current.next;
        }
        return current.data;
    }
}
