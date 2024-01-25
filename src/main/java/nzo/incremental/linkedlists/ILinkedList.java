package nzo.incremental.linkedlists;

public interface ILinkedList {
    int size();
    Boolean isEmpty();
    Node first();
    Node last();
    void addFirst(int data);
    void addLast(int data);
    void removeFirts();
}
