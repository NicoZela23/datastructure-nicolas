package nzo.incremental.trees;

import nzo.incremental.interfaces.IBinaryTree;

public class BinaryTree implements IBinaryTree {
    BTNode root;
    public BinaryTree(){
        root = null;
    }
    public BinaryTree(int data){
        root = new BTNode(data);
    }
    @Override
    public void insert(int data) {
        root = insert(root, data);
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
        var preOrder = preOrder();
        for (int j : preOrder) {
            System.out.println(j + " ");
        }
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
