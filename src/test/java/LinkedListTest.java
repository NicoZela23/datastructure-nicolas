import nzo.incremental.interfaces.ILinkedList;
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
}
