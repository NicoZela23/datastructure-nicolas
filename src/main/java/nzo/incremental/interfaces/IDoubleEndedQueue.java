package nzo.incremental.interfaces;

public interface IDoubleEndedQueue<D>{
    void addFirst(D d);
    void addLast(D d);
    D removeFirst();
    D removeLast();
    D first();
    D last();
    int size();
    boolean isEmpty();
}
