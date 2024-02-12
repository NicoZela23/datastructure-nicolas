package nzo.incremental.linkedlists;

public class DoubleEdgeNode<D>{
    public D data;
    public DoubleEdgeNode<D>prev;
    public DoubleEdgeNode<D>next;

    public DoubleEdgeNode(D data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
