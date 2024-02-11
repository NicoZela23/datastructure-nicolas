import nzo.incremental.interfaces.ILinkedList;
import nzo.incremental.linkedlists.CircularLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircularLinkedListTest {

    @Test
    public void testEmptyList() {
        ILinkedList<Integer> list = new CircularLinkedList<>();
        assertTrue(list.isEmpty());
        assertNull(list.first());
        assertNull(list.last());
        assertEquals(0, list.size());
    }

    @Test
    public void testAddFirstToEmptyList() {
        ILinkedList<Integer> list = new CircularLinkedList<>();
        list.addFirst(1);
        assertEquals(1, list.first().data);
        assertEquals(1, list.last().data);
        assertEquals(1, list.size());
    }

    @Test
    public void testAddLastToEmptyList() {
        ILinkedList<Integer> list = new CircularLinkedList<>();
        list.addLast(1);
        assertEquals(1, list.first().data);
        assertEquals(1, list.last().data);
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveFirstFromSingleItemList() {
        ILinkedList<Integer> list = new CircularLinkedList<>();
        list.addFirst(1);
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testSizeAfterAddingAndRemovingElements() {
        ILinkedList<Integer> list = new CircularLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.removeFirst();
        assertEquals(1, list.size());
    }

    @Test
    public void testAddingAndRemovingAlternately() {
        ILinkedList<Integer> list = new CircularLinkedList<>();
        list.addFirst(1);
        list.removeFirst();
        assertTrue(list.isEmpty());
        list.addLast(2);
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testRemoveFirstFromEmptyList() {
        ILinkedList<Integer> list = new CircularLinkedList<>();
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testPrint() {
        ILinkedList<Integer> list = new CircularLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.print();
    }

    @Test
    public void testAddFirstNull() {
        ILinkedList<Integer> list = new CircularLinkedList<>();
        list.addFirst(null);
        assertNull(list.first().data);
        assertEquals(1, list.size());
    }

    @Test
    public void testAddLastNull() {
        ILinkedList<Integer> list = new CircularLinkedList<>();
        list.addLast(null);
        assertNull(list.last().data);
        assertEquals(1, list.size());
    }

    @Test
    public void testAddFirstAndLastMultiple() {
        ILinkedList<Integer> list = new CircularLinkedList<>();
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
    public void testRemoveFirstMultiple() {
        ILinkedList<Integer> list = new CircularLinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.addFirst(i);
        }
        for (int i = 0; i < 5; i++) {
            list.removeFirst();
        }
        assertEquals(5, list.size());
    }
}

