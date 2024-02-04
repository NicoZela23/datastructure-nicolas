package nzo.incremental.interfaces;

public interface IQueue <Q> {
    void enqueue(Q q);
    Q dequeue();
    Q first();
    boolean isEmpty();
    int size();
}
