package nzo.incremental.stacks;

public interface IStack {
    void push(int e);
    void pop();
    int top();
    boolean isEmpty();
    int size();
}