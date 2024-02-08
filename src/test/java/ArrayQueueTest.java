import nzo.incremental.interfaces.IQueue;
import nzo.incremental.queues.ArrayQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayQueueTest {

    @Test
    public void testEmptyQueue() {
        IQueue<Integer> queue = new ArrayQueue<>();
        assertTrue(queue.isEmpty());
        assertNull(queue.dequeue());
        assertNull(queue.first());
        assertEquals(0, queue.size());
    }

    @Test
    public void testEnqueueAndDequeue() {
        IQueue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testFirst() {
        IQueue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.first());
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.first());
    }

    @Test
    public void testIsEmpty() {
        IQueue<Integer> queue = new ArrayQueue<>();
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSize() {
        IQueue<Integer> queue = new ArrayQueue<>();
        assertEquals(0, queue.size());
        queue.enqueue(1);
        assertEquals(1, queue.size());
        queue.dequeue();
        assertEquals(0, queue.size());
    }
}

