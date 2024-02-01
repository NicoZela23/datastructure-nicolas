package nzo.incremental.linkedlists;

import nzo.incremental.interfaces.ILinkedList;

public class CircularLinkedList<T> implements ILinkedList<T> {
    Node<T> trailer;

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        Node<T> current = trailer.next;
        int size = 1;
        while (current != trailer) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return trailer == null;
    }

    @Override
    public Node<T> first() {
        return trailer != null ? trailer.next : null;
    }

    @Override
    public Node<T> last() {
        return trailer;
    }

    @Override
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            newNode.next = newNode;
            trailer = newNode;
        } else {
            newNode.next = trailer.next;
            trailer.next = newNode;
        }
    }

    @Override
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            newNode.next = newNode;
            trailer = newNode;
        } else {
            newNode.next = trailer.next;
            trailer.next = newNode;
            trailer = newNode;
        }
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Circular Linked List is empty");
            return;
        }

        Node<T> firstNode = trailer.next;
        Node<T> secondNode = firstNode.next;

        if (firstNode == secondNode) {
            trailer = null;
        } else {
            trailer.next = secondNode;
        }
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Circular Linked List is empty.");
            return;
        }
        Node<T> current = trailer.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != trailer.next); // Include the last node in the loop

        System.out.println();
    }


}
