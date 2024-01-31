package nzo.incremental.linkedlists;

public class DoubleEdgeNode<T>{
    T data;
    DoubleEdgeNode<T>prev;
    DoubleEdgeNode<T>next;

    public DoubleEdgeNode(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
