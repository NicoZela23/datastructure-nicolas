import nzo.incremental.interfaces.IBinaryTree;
import nzo.incremental.trees.BinaryTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    void testInsertion() {
        IBinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        assertEquals(7, tree.size());
        assertTrue(tree.search(4));
        assertFalse(tree.search(9));
    }

    @Test
    void testDeletion() {
        IBinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        tree.delete(4);
        assertFalse(tree.search(4));
        assertEquals(6, tree.size());
    }

    @Test
    void testTraversal() {
        IBinaryTree tree = new BinaryTree(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        int[] expectedInOrder = {2, 3, 4, 5, 6, 7, 8};
        int[] expectedPreOrder = {5, 3, 2, 4, 7, 6, 8};
        int[] expectedPostOrder = {2, 4, 3, 6, 8, 7, 5};

        assertArrayEquals(expectedInOrder, tree.inOrder());
        assertArrayEquals(expectedPreOrder, tree.preOrder());
        assertArrayEquals(expectedPostOrder, tree.postOrder());
    }

    @Test
    void testHeightAndSize() {
        IBinaryTree tree = new BinaryTree();
        assertEquals(0, tree.height());
        assertEquals(0, tree.size());

        tree.insert(5);
        assertEquals(1, tree.height());
        assertEquals(1, tree.size());

        tree.insert(3);
        tree.insert(7);
        assertEquals(2, tree.height());
        assertEquals(3, tree.size());
    }
    @Test
    void testInsertZero() {
        IBinaryTree tree = new BinaryTree();
        tree.insert(0);
        assertTrue(tree.search(0));
        assertEquals(1, tree.size());
    }

    @Test
    void testInsertAndDeleteMultiple() {
        IBinaryTree tree = new BinaryTree();
        for (int i = 0; i < 10; i++) {
            tree.insert(i);
        }
        for (int i = 0; i < 10; i++) {
            assertTrue(tree.search(i));
            tree.delete(i);
            assertFalse(tree.search(i));
        }
        assertEquals(0, tree.size());
    }

    @Test
    void testHeightAfterInsertAndDelete() {
        IBinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        assertEquals(2, tree.height());
        tree.delete(7);
        assertEquals(2, tree.height());
        tree.delete(3);
        assertEquals(1, tree.height());
    }

    @Test
    void testSizeAfterInsertAndDelete() {
        IBinaryTree tree = new BinaryTree();
        for (int i = 0; i < 5; i++) {
            tree.insert(i);
        }
        for (int i = 0; i < 3; i++) {
            tree.delete(i);
        }
        assertEquals(2, tree.size());
    }

}

