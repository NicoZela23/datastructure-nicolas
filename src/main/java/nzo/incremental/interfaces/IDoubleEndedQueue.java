package nzo.incremental.interfaces;

/**
 * A deque supports adding and removing elements from both ends.
 *
 * @param <D> the type of elements stored in the deque
 */
public interface IDoubleEndedQueue<D> {

    /**
     * Adds an element to the front of the deque.
     *
     * @param d the element to be added to the front of the deque
     */
    void addFirst(D d);

    /**
     * Adds an element to the end of the deque.
     *
     * @param d the element to be added to the end of the deque
     */
    void addLast(D d);

    /**
     * Removes and returns the element at the front of the deque.
     *
     * @return the element removed from the front of the deque
     */
    D removeFirst();

    /**
     * Removes and returns the element at the end of the deque.
     *
     * @return the element removed from the end of the deque
     */
    D removeLast();

    /**
     * Returns the element at the front of the deque without removing it.
     *
     * @return the element at the front of the deque
     */
    D first();

    /**
     * Returns the element at the end of the deque without removing it.
     *
     * @return the element at the end of the deque
     */
    D last();

    /**
     * Returns the number of elements currently stored in the deque.
     *
     * @return the number of elements in the deque
     */
    int size();

    /**
     * Checks whether the deque is empty or not.
     *
     * @return true if the deque is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Prints all elements in the double-ended queue.
     * The order of printing is from the front of the deque to the rear.
     * The deque remains unchanged after printing.
     * This method is primarily for debugging purposes.
     */
    void print();
}

