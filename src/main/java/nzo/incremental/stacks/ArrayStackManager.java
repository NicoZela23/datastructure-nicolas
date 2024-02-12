package nzo.incremental.stacks;
import nzo.incremental.interfaces.IStack;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.StackMenu;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;

import java.util.Scanner;

public class ArrayStackManager implements IStructureManager {
    private final Scanner scannerValues;
    private  IStack arrayStack;
    private MenuFactory menuFactory;
    private final ConsoleMenu currentMenu;
    private int sizeValue;

    public ArrayStackManager() {
        scannerValues = new Scanner(System.in);
        arrayStack = new ArrayStack();
        menuFactory = new StackMenu();
        currentMenu = menuFactory.createMenu();
        sizeValue = 0;
    }

    @Override
    public void run() {
        int userChoice;
        System.out.println("\u001B[32m" + "Do you want to set a Capacity or use Default for the Stack?");
        System.out.println("1.- Set Capacity");
        System.out.println("2.- Set Default");
        System.out.print("> ");
        int constructorValue = scannerValues.nextInt();
        if (constructorValue == 1){
            System.out.println("The size of your Stack will be?");
            System.out.print("> ");
            constructorValue = scannerValues.nextInt();
            arrayStack = new ArrayStack(constructorValue);
            sizeValue = constructorValue;
        }
        else{
            System.out.println("Capacity set to Default");
            arrayStack = new ArrayStack();
            sizeValue = 1000;
        }
        do {
            currentMenu.displayMenu();
            userChoice = currentMenu.getUserChoiceInteger();
            processUserChoice(userChoice);
        } while (userChoice != 7);
    }

    private void processUserChoice(int choice) {
        switch (choice) {
            case 1:
                pushElement();
                break;
            case 2:
                popElement();
                break;
            case 3:
                displayTopElement();
                break;
            case 4:
                displayIsEmpty();
                break;
            case 5:
                displaySize();
                break;
            case 6:
                printStack();
                break;
        }
    }

    private void pushElement() {
        if (arrayStack.size() == sizeValue){
            System.out.println("\u001B[33m" + "Stack is full. Cannot push more elements.");
            return;
        }
        System.out.println("\u001B[33m" + "Enter the element to be pushed:");
        System.out.print("> ");
        int value = scannerValues.nextInt();
        arrayStack.push(value);
    }

    private void popElement() {
        if (!arrayStack.isEmpty()) {
            System.out.println("\u001B[33m" + "Top element removed");
            arrayStack.pop();
        } else {
            System.out.println("\u001B[33m" + "Stack is empty. Nothing to remove");
        }
    }

    private void displayTopElement() {
        if (!arrayStack.isEmpty()) {
            System.out.print("\u001B[33m" + "The first element in the Stack is: ");
            System.out.println("\u001B[32m" + arrayStack.top());
        } else {
            System.out.println("\u001B[33m" + "Stack is empty. Nothing to show");
        }
    }

    private void displayIsEmpty() {
        if (arrayStack.isEmpty()) {
            System.out.println("\u001B[33m" + "Stack is empty.");
        } else {
            System.out.println("\u001B[33m" + "Stack is not empty.");
        }
    }

    private void displaySize() {
        System.out.print("\u001B[33m" + "The size of the Stack is: ");
        System.out.println("\u001B[32m" + arrayStack.size());
    }

    private void printStack() {
        arrayStack.print();
    }
}
