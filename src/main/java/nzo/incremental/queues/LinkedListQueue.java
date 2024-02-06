package nzo.incremental.queues;

import nzo.incremental.interfaces.ILinkedList;
import nzo.incremental.interfaces.IQueue;
import nzo.incremental.linkedlists.LinkedList;
import nzo.incremental.linkedlists.Node;

public class LinkedListQueue<Q> implements IQueue<Q> {
    Node<Q> head;
    private ILinkedList<Q> list = new LinkedList<>();
    @Override
    public void enqueue(Q q) {
        list.addLast(q);
    }
    @Override
    public Q dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        Q deletedElement = first();
        list.removeFirst();
        return deletedElement;
    }

    @Override
    public Q first() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No first element.");
            return null;
        }
        return list.first().data;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }
        return list.size();
    }
}
