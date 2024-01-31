package nzo.incremental.linkedlists;

import nzo.incremental.interfaces.IDoubleLinkedList;

public class DoubleLinkedList<T> implements IDoubleLinkedList<T> {
    private DoubleEdgeNode<T> head;
    private DoubleEdgeNode<T> tail;

    public DoubleLinkedList() {
        head = new DoubleEdgeNode<>(null);
        tail = new DoubleEdgeNode<>(null);
        head.next = tail;
        tail.prev = head;
    }


    @Override
    public int size() {
        if(isEmpty()){
            return 0;
        }

        int size = 0;
        DoubleEdgeNode<T> current = head.next;
        while (current != tail){
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head.next == tail;
    }

    @Override
    public DoubleEdgeNode<T> first() {
        return head;
    }

    @Override
    public DoubleEdgeNode<T> last() {
        return tail;
    }

    @Override
    public void addFirst(T data) {
        DoubleEdgeNode<T> newNode = new DoubleEdgeNode<>(data);
        if (isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    @Override
    public void addLast(T data) {
        DoubleEdgeNode<T> newNode = new DoubleEdgeNode<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }


    @Override
    public void removeFirst() {
        if (isEmpty()){
            return;
        }
        head = head.next;
        head.prev = null;
    }

    @Override
    public void removeLast() {
        if (isEmpty()){
            return;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
    }
}
