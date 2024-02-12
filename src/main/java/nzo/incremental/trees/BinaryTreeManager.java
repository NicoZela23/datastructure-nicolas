package nzo.incremental.trees;

import nzo.incremental.interfaces.IBinaryTree;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.BinaryTreeMenu;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;

import java.util.Scanner;

public class BinaryTreeManager implements IStructureManager {

    private final Scanner scannerValues;
    private IBinaryTree binaryTree;
    private MenuFactory menuFactory;
    private final ConsoleMenu currentMenu;

    public BinaryTreeManager() {
        scannerValues = new Scanner(System.in);
        binaryTree = new BinaryTree();
        menuFactory = new BinaryTreeMenu();
        currentMenu = menuFactory.createMenu();
    }
    @Override
    public void run() {
        int userChoice;
        System.out.println("\u001B[32m" + "Do you want to start with a initial root?");
        System.out.println("1.- Yes");
        System.out.println("2.- No");
        System.out.print("> ");
        int constructorValue = scannerValues.nextInt();
        if (constructorValue == 1){
            System.out.println("The root of your tree will be?");
            System.out.print("> ");
            constructorValue = scannerValues.nextInt();
            binaryTree = new BinaryTree(constructorValue);
        }
        else{
            System.out.println("Binary Tree started without root");
            binaryTree = new BinaryTree();
        }
        do {
            currentMenu.displayMenu();
            userChoice = currentMenu.getUserChoiceInteger();
            processUserChoice(userChoice);
        } while (userChoice != 12);
    }
    private void processUserChoice(int choice) {
        switch (choice) {
            case 1:
                insertNode();
                break;
            case 2:
                deleteNode();
                break;
            case 3:
                displayRoot();
                break;
            case 4:
                displayNode();
                break;
            case 5:
                displayHeight();
                break;
            case 6:
                displaySize();
                break;
            case 7:
                search();
                break;
            case 8:
                displayUnorderedTree();
                break;
            case 9:
                displayInOrderTree();
                break;
            case 10:
                displayPreOrderTree();
                break;
            case 11:
                displayPostOrderTree();
                break;
        }
    }
    private void insertNode(){
        System.out.println("\u001B[33m" + "Insert an element to the Tree:");
        System.out.print("> ");
        int value = scannerValues.nextInt();
        binaryTree.insert(value);
    }
    private void deleteNode(){
        if (binaryTree.getRoot() == null){
            System.out.println("\u001B[33m" + "Tree is empty. Nothing to delete");
        }
        else {
        System.out.println("\u001B[33m" + "You have this values to delete: ");
        binaryTree.print();
        System.out.println("\u001B[33m" + "Enter value to delete of the Tree: ");
        System.out.print("> ");
        int value = scannerValues.nextInt();
        binaryTree.delete(value);
        }
    }
    private void displayRoot(){
        BTNode root = binaryTree.getRoot();
        if (root != null) {
            System.out.print("\u001B[33m" + "Root value is: ");
            System.out.println("\u001B[32m" + root.data);
        } else {
            System.out.println("Tree is empty.");
        }
    }
    private void displayNode(){
        System.out.println("\u001B[33m" + "Enter value to display: ");
        System.out.print("> ");
        int value = scannerValues.nextInt();
        BTNode node = binaryTree.getNode(value);
        if (node != null) {
            System.out.print("\u001B[33m" + "Node found with value: ");
            System.out.println("\u001B[32m" + node.data);
        } else {
            System.out.println("\u001B[33m" + "Node not found.");
        }
    }
    private void displayHeight(){
        System.out.print("\u001B[33m" + "The height of the Tree is: ");
        System.out.println("\u001B[32m" + binaryTree.height());
    }
    private void displaySize(){
        System.out.print("\u001B[33m" + "The size of the Tree is: ");
        System.out.println("\u001B[32m" + binaryTree.size());
    }
    private void search(){
        System.out.println("\u001B[33m" + "Enter value to search: ");
        System.out.print("> ");
        int value = scannerValues.nextInt();
        if (binaryTree.search(value)) {
            System.out.println("\u001B[32m" + "Value found in the Tree.");
        } else {
            System.out.println("\u001B[32m" + "Value not found in the Tree.");
        }
    }
    private void displayUnorderedTree(){
        if (binaryTree.getRoot() == null){
            System.out.println("\u001B[33m" + "Tree is empty. Nothing to show");
        }
        else {
        System.out.println("\u001B[33m" + "Unordered Tree:");
        binaryTree.print();
        }
    }
    private void displayInOrderTree(){
        if (binaryTree.getRoot() == null){
            System.out.println("\u001B[33m" + "Tree is empty. Nothing to show");
        }
        else {
            System.out.println("\u001B[33m" + "In-Order Tree:");
            int[] inOrder = binaryTree.inOrder();
            for (int value : inOrder) {
                System.out.print("\u001B[32m" + value + " ");
            }
            System.out.println();
        }
    }
    private void displayPreOrderTree(){
        if (binaryTree.getRoot() == null){
            System.out.println("\u001B[33m" + "Tree is empty. Nothing to show");
        }
        else {
            System.out.println("\u001B[33m" + "Pre-Order Tree:");
            int[] preOrder = binaryTree.preOrder();
            for (int value : preOrder) {
                System.out.print("\u001B[32m" + value + " ");
            }
            System.out.println();
        }
    }
    private void displayPostOrderTree(){
        if (binaryTree.getRoot() == null){
            System.out.println("\u001B[33m" + "Tree is empty. Nothing to show");
        }
        else {
            System.out.println("\u001B[33m" + "Post-Order Tree:");
            int[] postOrder = binaryTree.postOrder();
            for (int value : postOrder) {
                System.out.print("\u001B[32m" + value + " ");
            }
            System.out.println();
        }
    }

}
