package nzo.incremental.interfaces;

/**
 * A stack follows the Last-In-First-Out (LIFO) principle where elements
 * are added and removed from the top of the stack.
 *
 * @param <E> the type of elements stored in the stack
 */
public interface IStack<E> {

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param e the element to be pushed onto the stack
     */
    void push(E e);

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return the element removed from the top of the stack
     */
    E pop();

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return the element at the top of the stack
     */
    E top();

    /**
     * Checks whether the stack is empty or not.
     *
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements currently stored in the stack.
     *
     * @return the number of elements in the stack
     */
    int size();

    /**
     * Prints all elements in the stack from top to bottom.
     * The order of printing is from the topmost element to the bottommost element.
     * The stack remains unchanged after printing.
     * This method is primarily for debugging purposes.
     */
    void print();
}

