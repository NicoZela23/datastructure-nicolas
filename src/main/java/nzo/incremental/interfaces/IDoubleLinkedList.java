package nzo.incremental.interfaces;

import nzo.incremental.linkedlists.DoubleEdgeNode;

/**
 * A doubly linked list is a linear collection of elements where each element
 * points to the next and previous elements in the list.
 *
 * @param <D> the type of elements stored in the doubly linked list
 */
public interface IDoubleLinkedList<D> {

    /**
     * Returns the number of elements currently stored in the doubly linked list.
     *
     * @return the number of elements in the doubly linked list
     */
    int size();

    /**
     * Checks whether the doubly linked list is empty or not.
     *
     * @return true if the doubly linked list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the first node of the doubly linked list.
     *
     * @return the first node of the doubly linked list, or null if the list is empty
     */
    DoubleEdgeNode<D> first();

    /**
     * Returns the last node of the doubly linked list.
     *
     * @return the last node of the doubly linked list, or null if the list is empty
     */
    DoubleEdgeNode<D> last();

    /**
     * Adds a new node containing the specified data to the beginning of the doubly linked list.
     *
     * @param data the data to be added to the beginning of the doubly linked list
     */
    void addFirst(D data);

    /**
     * Adds a new node containing the specified data to the end of the doubly linked list.
     *
     * @param data the data to be added to the end of the doubly linked list
     */
    void addLast(D data);

    /**
     * Removes the first node from the doubly linked list.
     * If the doubly linked list is empty, this method does nothing.
     */
    void removeFirst();

    /**
     * Removes the last node from the doubly linked list.
     * If the doubly linked list is empty, this method does nothing.
     */
    void removeLast();

    /**
     * Prints all elements in the doubly linked list.
     * The order of printing is from the first node to the last node.
     * The doubly linked list remains unchanged after printing.
     * This method is primarily for debugging purposes.
     */
    void print();
}

