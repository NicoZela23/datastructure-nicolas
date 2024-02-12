package nzo.incremental.interfaces;

/**
 * A queue follows the First-In-First-Out (FIFO) principle where elements
 * are added at the rear and removed from the front of the queue.
 *
 * @param <Q> the type of elements stored in the queue
 */
public interface IQueue<Q> {

    /**
     * Adds an element to the rear of the queue.
     *
     * @param q the element to be added to the queue
     */
    void enqueue(Q q);

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return the element removed from the front of the queue
     */
    Q dequeue();

    /**
     * Returns the element at the front of the queue without removing it.
     *
     * @return the element at the front of the queue
     */
    Q first();

    /**
     * Checks whether the queue is empty or not.
     *
     * @return true if the queue is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements currently stored in the queue.
     *
     * @return the number of elements in the queue
     */
    int size();

    /**
     * Prints all elements in the queue.
     * The order of printing is from the front of the queue to the rear.
     * The queue remains unchanged after printing.
     * This method is primarily for debugging purposes.
     */
    void print();
}

