package nzo.incremental.interfaces;

import nzo.incremental.linkedlists.Node;

/**
 * A linked list is a linear collection of elements where each element
 * points to the next element in the list.
 *
 * @param <T> the type of elements stored in the linked list
 */
public interface ILinkedList<T> {

    /**
     * Returns the number of elements currently stored in the linked list.
     *
     * @return the number of elements in the linked list
     */
    int size();

    /**
     * Checks whether the linked list is empty or not.
     *
     * @return true if the linked list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the first node of the linked list.
     *
     * @return the first node of the linked list, or null if the list is empty
     */
    Node<T> first();

    /**
     * Returns the last node of the linked list.
     *
     * @return the last node of the linked list, or null if the list is empty
     */
    Node<T> last();

    /**
     * Adds a new node containing the specified data to the beginning of the linked list.
     *
     * @param data the data to be added to the beginning of the linked list
     */
    void addFirst(T data);

    /**
     * Adds a new node containing the specified data to the end of the linked list.
     *
     * @param data the data to be added to the end of the linked list
     */
    void addLast(T data);

    /**
     * Removes the first node from the linked list.
     * If the linked list is empty, this method does nothing.
     */
    void removeFirst();

    /**
     * Prints all elements in the linked list.
     * The order of printing is from the first node to the last node.
     * The linked list remains unchanged after printing.
     * This method is primarily for debugging purposes.
     */
    void print();
}

