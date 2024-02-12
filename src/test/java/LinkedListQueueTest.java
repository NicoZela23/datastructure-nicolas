import nzo.incremental.interfaces.IDoubleLinkedList;
import nzo.incremental.interfaces.IQueue;
import nzo.incremental.linkedlists.DoubleLinkedList;
import nzo.incremental.queues.LinkedListQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListQueueTest {

    @Test
    public void testEmptyQueue() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        assertTrue(queue.isEmpty());
        assertNull(queue.dequeue());
        assertNull(queue.first());
        assertEquals(0, queue.size());
    }

    @Test
    public void testEnqueueAndDequeue() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testFirst() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.first());
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.first());
    }

    @Test
    public void testIsEmpty() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSize() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        assertEquals(0, queue.size());
        queue.enqueue(1);
        assertEquals(1, queue.size());
        queue.dequeue();
        assertEquals(0, queue.size());
    }

    @Test
    public void testAddFirstMultipleElements() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i * 2);
        }
        assertEquals(10, queue.size());
        assertEquals(0, queue.first());
    }

    @Test
    public void testRemoveFirstAndLastMultiple() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        for (int i = 0; i < 5; i++) {
            queue.dequeue();
        }
        assertEquals(5, queue.size());
    }
}

