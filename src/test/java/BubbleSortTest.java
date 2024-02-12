import nzo.incremental.sorting.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void passTest(){
        int[] actual = { 10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        BubbleSort.bubblesort(actual);
        assertArrayEquals(expected, actual);
    }
}
