import nzo.incremental.interfaces.IDoubleEndedQueue;
import nzo.incremental.interfaces.IDoubleLinkedList;
import nzo.incremental.linkedlists.DoubleLinkedList;
import nzo.incremental.queues.DoubleEndedQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoubleLinkedListTest {

    @Test
    public void testEmptyList() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
        assertNull(list.first());
        assertNull(list.last());
        assertEquals(0, list.size());
    }

    @Test
    public void testAddFirstToEmptyList() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addFirst(1);
        assertEquals(1, list.first().data);
        assertEquals(1, list.last().data);
        assertEquals(1, list.size());
    }

    @Test
    public void testAddLastToEmptyList() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addLast(1);
        assertEquals(1, list.first().data);
        assertEquals(1, list.last().data);
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveFirstFromSingleItemList() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addFirst(1);
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testRemoveLastFromSingleItemList() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addLast(1);
        list.removeLast();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testSizeAfterAddingAndRemovingElements() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.removeFirst();
        assertEquals(1, list.size());
        list.removeLast();
        assertEquals(0, list.size());
    }

    @Test
    public void testAddingAndRemovingAlternately() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addFirst(1);
        list.removeFirst();
        assertTrue(list.isEmpty());
        list.addLast(2);
        list.removeLast();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testRemoveFirstFromEmptyList() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testRemoveLastFromEmptyList() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.removeLast();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAddFirstAndAddLastTogether() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        assertEquals(1, list.first().data);
        assertEquals(2, list.last().data);
        assertEquals(2, list.size());
    }

    @Test
    public void testRemoveFirstAndRemoveLastTogether() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.removeFirst();
        list.removeLast();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAddFirstMultipleElements() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        for (int i = 0; i < 10; i++){
            list.addFirst(i*2);
        }
        assertEquals(10, list.size());
        assertEquals(0,list.last().data);
        assertEquals(18, list.first().data);
    }

    @Test
    public void testAddLastMultipleElements() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        for (int i = 0; i < 10; i++){
            list.addLast(i*3);
        }
        assertEquals(10, list.size());
        assertEquals(0,list.first().data);
        assertEquals(27, list.last().data);
    }

    @Test
    public void testAddFirstAndLastMultiple() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                list.addFirst(i);
            } else {
                list.addLast(i);
            }
        }
        assertEquals(10, list.size());
    }

    @Test
    public void testRemoveFirstAndLastMultiple() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.addFirst(i);
        }
        for (int i = 0; i < 5; i++) {
            list.removeFirst();
            list.removeLast();
        }
        assertEquals(0, list.size());
    }
}
