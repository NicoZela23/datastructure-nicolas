package nzo.incremental.linkedlists;

import nzo.incremental.interfaces.IDoubleLinkedList;

public class DoubleLinkedList<D> implements IDoubleLinkedList<D> {
    private DoubleEdgeNode<D> head;
    private DoubleEdgeNode<D> tail;

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
        DoubleEdgeNode<D> current = head.next;
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
    public DoubleEdgeNode<D> first() {
        return head;
    }

    @Override
    public DoubleEdgeNode<D> last() {
        return tail;
    }

    @Override
    public void addFirst(D data) {
        DoubleEdgeNode<D> newNode = new DoubleEdgeNode<>(data);
        if (isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    @Override
    public void addLast(D data) {
        DoubleEdgeNode<D> newNode = new DoubleEdgeNode<>(data);
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

    @Override
    public void print() {

    }
}
