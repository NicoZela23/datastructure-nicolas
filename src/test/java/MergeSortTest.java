import nzo.incremental.sorting.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void positiveTest() {
        int[] actual = { 10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        MergeSort.mergeSorting(actual, actual.length);
        assertArrayEquals(expected, actual);
    }
}