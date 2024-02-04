import nzo.incremental.interfaces.ILinkedList;
import nzo.incremental.linkedlists.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 public class LinkedListsTests {
    @Test
    public void onInitSizeIsZero(){
        ILinkedList<Integer> list = new LinkedList<>();
        Assertions.assertEquals(0, list.size());

    }
    @Test
    public void OnInitIsEmpty(){
        ILinkedList<Integer> list = new LinkedList<>();
            boolean isEmpty = list.isEmpty();
            Assertions.assertTrue(isEmpty);
    }
}
