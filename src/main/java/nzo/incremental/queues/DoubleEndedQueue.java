package nzo.incremental.queues;
import nzo.incremental.interfaces.IDoubleEndedQueue;
import nzo.incremental.interfaces.IDoubleLinkedList;
import nzo.incremental.linkedlists.DoubleEdgeNode;
import nzo.incremental.linkedlists.DoubleLinkedList;
import nzo.incremental.linkedlists.Node;


public class DoubleEndedQueue<D> implements IDoubleEndedQueue<D> {
    private IDoubleLinkedList<D> list = new DoubleLinkedList<>();
    DoubleEdgeNode<D> node;

    @Override
    public void addFirst(D d) {
        list.addFirst(d);
    }

    @Override
    public void addLast(D d) {
        list.addLast(d);
    }

    @Override
    public D removeFirst() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove first.");
            return null;
        }
        D firstDeletedElement = first();
        list.removeFirst();
        return firstDeletedElement;
    }

    @Override
    public D removeLast() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove last.");
            return null;
        }
        D lastDeletedElement = last();
        list.removeLast();
        return lastDeletedElement;
    }

    @Override
    public D first() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No first element.");
            return null;
        }
        return list.first().data;
    }

    @Override
    public D last() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No Last element.");
            return null;
        }
        return list.last().data;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        DoubleEdgeNode<D> current = list.first();
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}