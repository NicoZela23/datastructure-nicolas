import nzo.incremental.interfaces.IDoubleLinkedList;
import nzo.incremental.interfaces.ILinkedList;
import nzo.incremental.linkedlists.DoubleLinkedList;
import nzo.incremental.linkedlists.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    public void testAddFirstToEmptyList() {
        ILinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        assertEquals(1, list.first().data);
        assertEquals(1, list.last().data);
    }

    @Test
    public void testAddLastToEmptyList() {
        ILinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        assertEquals(1, list.first().data);
        assertEquals(1, list.last().data);
    }

    @Test
    public void testRemoveFirstFromSingleItemList() {
        ILinkedList<Integer>  list = new LinkedList<>();
        list.addFirst(1);
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testSizeAfterAddingAndRemovingElements() {
        ILinkedList<Integer>  list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.removeFirst();
        assertEquals(1, list.size());
        list.removeFirst();
        assertEquals(0, list.size());
    }

    @Test
    public void testAddingAndRemovingAlternately() {
        ILinkedList<Integer>  list = new LinkedList<>();
        list.addFirst(1);
        list.removeFirst();
        assertTrue(list.isEmpty());
        list.addLast(2);
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testRemovingFromEmptyList() {
        ILinkedList<Integer>  list = new LinkedList<>();
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAdditionAndRemovalWithLargeData() {
        ILinkedList<Integer>  list = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            list.addLast(i);
        }
        assertEquals(1000, list.size());
        for (int i = 0; i < 1000; i++) {
            list.removeFirst();
        }
        assertTrue(list.isEmpty());
    }
    @Test
    public void testAddFirstMultipleElements() {
        ILinkedList<Integer>  list = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            list.addFirst(i*2);
        }
        assertEquals(10, list.size());
        assertEquals(0,list.last().data);
        assertEquals(18, list.first().data);
    }

    @Test
    public void testAddLastMultipleElements() {
        ILinkedList<Integer>  list = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            list.addLast(i*3);
        }
        assertEquals(10, list.size());
        assertEquals(0,list.first().data);
        assertEquals(27, list.last().data);
    }

    @Test
    public void testAddFirstAndLastMultiple() {
        ILinkedList<Integer>  list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                list.addFirst(i);
            } else {
                list.addLast(i);
            }
        }
        assertEquals(10, list.size());
        assertEquals(8, list.first().data);
        assertEquals(9, list.last().data);
    }

    @Test
    public void testRemoveFirstMultiple() {
        ILinkedList<Integer>  list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.addFirst(i);
        }
        for (int i = 0; i < 5; i++) {
            list.removeFirst();
        }
        assertEquals(5, list.size());
    }
}
