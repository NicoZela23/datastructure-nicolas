package nzo.incremental.interfaces;

public interface IStack {
    void push(int e);
    void pop();
    int top();
    boolean isEmpty();
    int size();
}