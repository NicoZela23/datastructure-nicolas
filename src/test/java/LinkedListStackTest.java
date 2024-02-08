import nzo.incremental.interfaces.IStack;
import nzo.incremental.stacks.LinkedListStack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListStackTest {

    @Test
    public void testEmptyStack() {
        IStack<Integer> stack = new LinkedListStack<>();
        assertTrue(stack.isEmpty());
        assertNull(stack.pop());
        assertNull(stack.top());
        assertEquals(0, stack.size());
    }

    @Test
    public void testPushAndPop() {
        IStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testTop() {
        IStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.top());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.top());
    }

    @Test
    public void testIsEmpty() {
        IStack<Integer> stack = new LinkedListStack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSize() {
        IStack<Integer> stack = new LinkedListStack<>();
        assertEquals(0, stack.size());
        stack.push(1);
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    public void testPrint() {
        IStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
    }
}

