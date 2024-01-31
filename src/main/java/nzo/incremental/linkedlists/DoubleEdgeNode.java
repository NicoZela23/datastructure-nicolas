package nzo.incremental.linkedlists;

public class DoubleEdgeNode<D>{
    D data;
    DoubleEdgeNode<D>prev;
    DoubleEdgeNode<D>next;

    public DoubleEdgeNode(D data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
