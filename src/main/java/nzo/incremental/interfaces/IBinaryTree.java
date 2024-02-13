package nzo.incremental.interfaces;

import nzo.incremental.trees.BTNode;

/**
 * A binary tree is a hierarchical data structure in which each node has at most two children,
 * referred to as the left child and the right child.
 */
public interface IBinaryTree {

    /**
     * Inserts a new node containing the specified data into the binary tree.
     *
     * @param data the data to be inserted into the binary tree
     */
    void insert(int data);

    /**
     * Searches for the specified data in the binary tree.
     *
     * @param data the data to search for in the binary tree
     * @return true if the data is found in the binary tree, false otherwise
     */
    boolean search(int data);

    /**
     * Returns the root node of the binary tree.
     *
     * @return the root node of the binary tree
     */
    BTNode getRoot();

    /**
     * Returns a reference to a specific node in the binary tree.
     *
     * @return a reference to a specific node in the binary tree
     */
    BTNode getNode(int data);

    /**
     * Deletes the node containing the specified data from the binary tree.
     * If the data is not found in the tree, this method does nothing.
     *
     * @param data the data to be deleted from the binary tree
     */
    void delete(int data);

    /**
     * Performs an in-order traversal of the binary tree and returns an array containing the
     * data of all nodes visited in the traversal.
     *
     * @return an array containing the data of all nodes visited in an in-order traversal
     */
    int[] inOrder();

    /**
     * Performs a pre-order traversal of the binary tree and returns an array containing the
     * data of all nodes visited in the traversal.
     *
     * @return an array containing the data of all nodes visited in a pre-order traversal
     */
    int[] preOrder();

    /**
     * Performs a post-order traversal of the binary tree and returns an array containing the
     * data of all nodes visited in the traversal.
     *
     * @return an array containing the data of all nodes visited in a post-order traversal
     */
    int[] postOrder();

    /**
     * Calculates the height of the binary tree.
     * The height of a binary tree is the maximum number of edges in any path from the root
     * node to a leaf node.
     *
     * @return the height of the binary tree
     */
    int height();

    /**
     * Returns the number of nodes currently stored in the binary tree.
     *
     * @return the number of nodes in the binary tree
     */
    int size();

    /**
     * Prints all elements in the binary tree.
     * The order of printing depends on the specific traversal algorithm used.
     * This method is primarily for debugging purposes.
     */
    void print();
}

