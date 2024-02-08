import nzo.incremental.interfaces.IDoubleLinkedList;
import nzo.incremental.linkedlists.DoubleLinkedList;
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
    public void testPrint() {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.print();
    }
}
