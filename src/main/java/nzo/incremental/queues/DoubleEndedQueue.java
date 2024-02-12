package nzo.incremental.queues;
import nzo.incremental.interfaces.IDoubleEndedQueue;
import nzo.incremental.interfaces.IDoubleLinkedList;
import nzo.incremental.linkedlists.DoubleLinkedList;

public class DoubleEndedQueue<D> implements IDoubleEndedQueue<D> {
    private IDoubleLinkedList<D> list = new DoubleLinkedList<>();
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
            return null;
        }
        D firstDeletedElement = first();
        list.removeFirst();
        return firstDeletedElement;
    }

    @Override
    public D removeLast() {
        if (isEmpty()) {
            return null;
        }
        D lastDeletedElement = last();
        list.removeLast();
        return lastDeletedElement;
    }

    @Override
    public D first() {
        if (isEmpty()) {
            return null;
        }
        return list.first().data;
    }

    @Override
    public D last() {
        if (isEmpty()) {
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

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("\u001B[33m" + "Queue is empty. Nothing to show.");
            return;
        }
        System.out.print("\u001B[36m" + "First ");
        list.print();
        System.out.println("\u001B[36m" + " Last");
    }
}