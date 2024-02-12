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
        if (isEmpty()){
            return 0;
        }
        int size = 0;
        DoubleEdgeNode<D> current = head.next;
        while (current != tail) {
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
        if (isEmpty()) {
            return null;
        }
        return head.next;
    }

    @Override
    public DoubleEdgeNode<D> last() {
        if (isEmpty()) {
            return null;
        }
        return tail.prev;
    }

    @Override
    public void addFirst(D data) {
        DoubleEdgeNode<D> newNode = new DoubleEdgeNode<>(data);
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
    }

    @Override
    public void addLast(D data) {
        DoubleEdgeNode<D> newNode = new DoubleEdgeNode<>(data);
        newNode.prev = tail.prev;
        newNode.next = tail;
        tail.prev.next = newNode;
        tail.prev = newNode;
    }

    @Override
    public void removeFirst() {
        if (!isEmpty()) {
            head.next = head.next.next;
            head.next.prev = head;
        }
    }

    @Override
    public void removeLast() {
        if (!isEmpty()) {
            tail.prev = tail.prev.prev;
            tail.prev.next = tail;
        }
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("\u001B[33m" + "List is empty. Nothing to show");
            return;
        }
        DoubleEdgeNode<D> current = head.next;
        while (current != tail) {
            System.out.print("\u001B[33m" + current.data);
            if (current.next != tail) {
                System.out.print("\u001B[32m" + " <-> ");
            }
            current = current.next;
        }
        System.out.println();
    }

}
