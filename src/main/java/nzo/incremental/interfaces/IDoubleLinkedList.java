package nzo.incremental.interfaces;

import nzo.incremental.linkedlists.DoubleEdgeNode;

public interface IDoubleLinkedList<D> {
    int size();
    boolean isEmpty();
    DoubleEdgeNode<D> first();
    DoubleEdgeNode<D> last();
    void addFirst(D data);
    void addLast(D data);
    void removeFirst();
    void removeLast();
    void print();
}
