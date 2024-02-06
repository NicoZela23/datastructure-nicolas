package nzo.incremental.trees;

public class BTNode {
    public int data;
    BTNode left;
    BTNode right;

    public BTNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public boolean isLeafNode(){
        return left == null && right == null;
    }
}
