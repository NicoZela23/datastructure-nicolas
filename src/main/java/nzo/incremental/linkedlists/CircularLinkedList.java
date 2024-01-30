package nzo.incremental.linkedlists;

public class CircularLinkedList<T> implements ILinkedList<T>{
    Node<T> trailer;
    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }
        Node<T> current = trailer.next;
        int size = 1;
        while (current != trailer){
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return trailer == null;
    }

    @Override
    public Node<T> first() {
        return trailer.next;
    }

    @Override
    public Node<T> last() {
        return trailer;
    }

    @Override
    public void addFirst(T data) {

    }

    @Override
    public void addLast(T data) {

    }

    @Override
    public void removeFirst() {

    }
}
