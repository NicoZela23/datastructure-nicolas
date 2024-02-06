package nzo.incremental.queues;

import nzo.incremental.interfaces.IDoubleEndedQueue;
import nzo.incremental.interfaces.ILinkedList;
import nzo.incremental.linkedlists.CircularLinkedList;
import nzo.incremental.linkedlists.LinkedList;
import nzo.incremental.linkedlists.Node;

public class DoubleEndedQueue<D> implements IDoubleEndedQueue<D> {
    Node<D> trailer;
    private ILinkedList<D> list = new CircularLinkedList<>();
    @Override
    public void addFirst(D d) {
        list.addFirst(d);
    }
    @Override
    public void addLast(D d) {
        list.addLast(d);
    }
    @Override
    public D removeFirst() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove first.");
            return null;
        }
        D firstDeletedElement = first();
        list.removeFirst();
        return firstDeletedElement;
    }

    @Override
    public D removeLast() {
        if (isEmpty()) {
            System.out.println("Circular Linked List is empty");
            return null;
        }
        D lastDeletedElement = last();
        Node<D> current = trailer.next;
        Node<D> prev = trailer;

        while (current.next != trailer) {
            prev = current;
            current = current.next;
        }

        if (prev == trailer) {
            trailer = null;
        } else {
            prev.next = trailer.next;
            trailer = prev;
        }
        return lastDeletedElement;
    }

    @Override
    public D first() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No first element.");
            return null;
        }
        return list.first().data;
    }

    @Override
    public D last() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No Last element.");
            return null;
        }
        return list.last().data;
    }

    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
