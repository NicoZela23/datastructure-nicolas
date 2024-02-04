import nzo.incremental.interfaces.ILinkedList;
import nzo.incremental.linkedlists.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class LinkedListsTests {
    @Test
     void onInitSizeIsZero(){
        ILinkedList<Integer> list = new LinkedList<>();

        Assertions.assertEquals(0, list.size());

    }
}
