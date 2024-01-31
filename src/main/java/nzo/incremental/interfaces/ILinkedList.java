package nzo.incremental.interfaces;

import nzo.incremental.linkedlists.Node;

public interface ILinkedList<T> {
    int size();
    boolean isEmpty();
    Node<T> first();
    Node<T> last();
    void addFirst(T data);
    void addLast(T data);
    void removeFirst();
    void print();
}
