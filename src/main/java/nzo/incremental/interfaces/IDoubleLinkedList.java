package nzo.incremental.interfaces;

import nzo.incremental.linkedlists.DoubleEdgeNode;

public interface IDoubleLinkedList<T> {
    int size();
    boolean isEmpty();
    DoubleEdgeNode<T> first();
    DoubleEdgeNode<T> last();
    void addFirst(T data);
    void addLast(T data);
    void removeFirst();
    void removeLast();
}
