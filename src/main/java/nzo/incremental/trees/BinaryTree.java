package nzo.incremental.trees;

import nzo.incremental.interfaces.IBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree implements IBinaryTree {
    private List<Integer> insertionOrder;
    public BTNode root;
    public BinaryTree(){
        insertionOrder = new ArrayList<>();
        root = null;
    }
    public BinaryTree(int data){
        root = new BTNode(data);
        insertionOrder = new ArrayList<>();
        insertionOrder.add(data);
    }
    @Override
    public void insert(int data) {
        root = insert(root, data);
        insertionOrder.add(data);
    }

    @Override
    public boolean search(int data) {
        return search(root,data);
    }

    @Override
    public BTNode getRoot() {
        return root;
    }

    @Override
    public BTNode getNode(int data) {
        return getNode(root, data);
    }

    @Override
    public void delete(int data) {
        root = deleteNode(root, data);
    }

    @Override
    public int[] inOrder() {
        int [] result = new int[size()];
        inOrder(root,result,0);

        return result;
    }

    @Override
    public int[] preOrder() {
        int [] result = new int[size()];
        preOrder(root,result,0);

        return result;
    }

    @Override
    public int[] postOrder() {
        int [] result = new int[size()];
        postOrder(root,result,0);

        return result;
    }

    @Override
    public int height() {
        return height(root);
    }

    @Override
    public int size() {
        return size(root);
    }

    @Override
    public void print() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        for (int value : insertionOrder) {
            System.out.print("\u001B[32m" + value + " ");
        }
        System.out.println();
    }

    private BTNode deleteNode(BTNode root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }

        return root;
    }

    private int minValue(BTNode node) {
        int minVal = node.data;
        while (node.left != null) {
            minVal = node.left.data;
            node = node.left;
        }
        return minVal;
    }

    private static int preOrder(BTNode root, int[] result, int index){
        if (root == null){
            return index;
        }
        result[index++] = root.data;
        var i = preOrder(root.left, result, index);
        i = preOrder(root.right, result, i);

        return i;
    }

    private static int inOrder(BTNode root, int[] result, int index){
        if (root == null){
            return index;
        }
        var i = inOrder(root.left, result, index);
        result[i++] = root.data;
        i = inOrder(root.right, result, i);

        return i;
    }

    private static int postOrder(BTNode root, int[] result, int index){
        if (root == null){
            return index;
        }
        var i = postOrder(root.left, result, index);
        i = postOrder(root.right, result, i);
        result[i++] = root.data;

        return i;

    }

    private static BTNode insert(BTNode root, int data){
        if(root == null){
            return new BTNode(data);
        }
        if (data < root.data){
            root.left = insert(root.left, data);
        }
        else if (data > root.data){
            root.right = insert(root.right, data);
        }
        return root;
    }
    private static boolean search (BTNode root, int data){
        if (root == null){
            return false;
        }
        if (root.data == data){
            return true;
        }
        if (data < root.data){
            return search(root.left, data);
        }
        else {
            return search(root.right, data);
        }

    }
    private static BTNode getNode(BTNode root, int data){
        if (root == null){
            return null;
        }
        if (root.data == data){
            return root;
        }
        if (data < root.data){
            return getNode(root.left, data);
        }
        else {
            return getNode(root.right, data);
        }

    }
    private static int size(BTNode root){
        if (root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }
    private static int height(BTNode root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
