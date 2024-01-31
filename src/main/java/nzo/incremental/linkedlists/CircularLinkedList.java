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
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            newNode.next = newNode;
            trailer = newNode;
        } else {
            newNode.next = trailer.next;
            trailer.next = newNode;
        }
    }

    @Override
    public void addLast(T data) {
        Node<T> lastNode = last();

        if (lastNode == null) {
            Node<T> newNode = new Node<T>(data);
            newNode.next = newNode;
            trailer.next = newNode;
            return;
        }
        lastNode.next = new Node<T>(data);
    }


    @Override
    public void removeFirst() {
        if(isEmpty()){
            return;
        }
        Node<T> firstNode = trailer.next;
        Node<T> secondNode = firstNode.next;

        if(firstNode == secondNode){
            trailer.next = null;
        } else {
            trailer.next = secondNode;
        }
    }
}
