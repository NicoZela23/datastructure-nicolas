import nzo.incremental.interfaces.IDoubleEndedQueue;
import nzo.incremental.queues.DoubleEndedQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoubleEndedQueueTest {

    @Test
    public void testEmptyQueue() {
        IDoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();
        assertTrue(queue.isEmpty());
        assertNull(queue.removeFirst());
        assertNull(queue.removeLast());
        assertNull(queue.first());
        assertNull(queue.last());
        assertEquals(0, queue.size());
    }

    @Test
    public void testAddFirstAndRemoveFirst() {
        IDoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();
        queue.addFirst(1);
        queue.addFirst(2);
        assertEquals(2, queue.removeFirst());
        assertEquals(1, queue.removeFirst());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testAddLastAndRemoveLast() {
        IDoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();
        queue.addFirst(3);
        queue.addLast(2);
        queue.addLast(1);
        assertEquals(1,queue.removeLast());
        assertEquals(2,queue.removeLast());
        assertEquals(1, queue.size());
    }

    @Test
    public void testFirstAndLast() {
        IDoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();
        queue.addFirst(1);
        queue.addLast(2);
        assertEquals(1, queue.first());
        assertEquals(2, queue.last());
    }

    @Test
    public void testIsEmpty() {
        IDoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();
        assertTrue(queue.isEmpty());
        queue.addFirst(1);
        assertFalse(queue.isEmpty());
        queue.removeFirst();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSize() {
        IDoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();
        assertEquals(0, queue.size());
        queue.addFirst(1);
        assertEquals(1, queue.size());
        queue.removeFirst();
        assertEquals(0, queue.size());
    }
    @Test
    public void testAddFirstNull() {
        IDoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();
        queue.addFirst(null);
        assertNull(queue.first());
        assertEquals(1, queue.size());
    }

    @Test
    public void testAddLastNull() {
        IDoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();
        queue.addLast(null);
        assertNull(queue.last());
        assertEquals(1, queue.size());
    }

    @Test
    public void testAddFirstAndLastMultiple() {
        IDoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                queue.addFirst(i);
            } else {
                queue.addLast(i);
            }
        }
        assertEquals(10, queue.size());
    }

    @Test
    public void testRemoveFirstAndLastMultiple() {
        IDoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.addFirst(i);
        }
        for (int i = 0; i < 5; i++) {
            queue.removeFirst();
            queue.removeLast();
        }
        assertEquals(0, queue.size());
    }

}

