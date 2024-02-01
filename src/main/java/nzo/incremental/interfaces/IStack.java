package nzo.incremental.interfaces;

public interface IStack<E>{
    void push(E e);
    E pop();
    E top();
    boolean isEmpty();
    int size();
    void print();
}