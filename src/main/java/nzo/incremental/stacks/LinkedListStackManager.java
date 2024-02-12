package nzo.incremental.stacks;

import nzo.incremental.interfaces.IStack;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.StackMenu;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;

import java.util.Scanner;

public class LinkedListStackManager implements IStructureManager {
    private final Scanner scannerValues;
    private final IStack linkedListStack;
    private MenuFactory menuFactory;
    private final ConsoleMenu currentMenu;

    public LinkedListStackManager() {
        scannerValues = new Scanner(System.in);
        linkedListStack = new LinkedListStack();
        menuFactory = new StackMenu();
        currentMenu = menuFactory.createMenu();
    }

    @Override
    public void run() {
        int userChoice;
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
        System.out.println("\u001B[33m" + "Enter the element to be pushed:");
        System.out.print("> ");
        int value = scannerValues.nextInt();
        linkedListStack.push(value);
    }

    private void popElement() {
        if (!linkedListStack.isEmpty()) {
            System.out.println("\u001B[33m" + "Top element removed");
            linkedListStack.pop();
        } else {
            System.out.println("\u001B[33m" + "Stack is empty. Nothing to remove");
        }
    }

    private void displayTopElement() {
        if (!linkedListStack.isEmpty()) {
            System.out.print("\u001B[33m" + "The first element in the Stack is: ");
            System.out.println("\u001B[32m" + linkedListStack.top());
        } else {
            System.out.println("\u001B[33m" + "Stack is empty. Nothing to show");
        }
    }

    private void displayIsEmpty() {
        if (linkedListStack.isEmpty()) {
            System.out.println("\u001B[33m" + "Stack is empty.");
        } else {
            System.out.println("\u001B[33m" + "Stack is not empty.");
        }
    }

    private void displaySize() {
        System.out.print("\u001B[33m" + "The size of the Stack is: ");
        System.out.println("\u001B[32m" + linkedListStack.size());
    }

    private void printStack() {
        linkedListStack.print();
    }
}
