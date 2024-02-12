package nzo.incremental.linkedlists;

import nzo.incremental.interfaces.IDoubleLinkedList;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.DoubleLinkedListMenu;
import nzo.incremental.menu.MenuFactory;

import java.util.Scanner;

public class DoubleLinkedListManager implements IStructureManager {
    private final Scanner scannerValues;
    private final IDoubleLinkedList doubleLinkedList;
    private MenuFactory menuFactory;
    private final ConsoleMenu currentMenu;

    public DoubleLinkedListManager() {
        scannerValues = new Scanner(System.in);
        doubleLinkedList = new DoubleLinkedList();
        menuFactory = new DoubleLinkedListMenu();
        currentMenu = menuFactory.createMenu();
    }

    @Override
    public void run() {
        int userChoice;
        do {
            currentMenu.displayMenu();
            userChoice = currentMenu.getUserChoiceInteger();
            processUserChoice(userChoice);
        } while (userChoice != 10);
    }

    private void processUserChoice(int choice) {
        switch (choice) {
            case 1:
                addFirstElement();
                break;
            case 2:
                addLastElement();
                break;
            case 3:
                displayFirstElement();
                break;
            case 4:
                displayLastElement();
                break;
            case 5:
                displayIsEmpty();
                break;
            case 6:
                displaySize();
                break;
            case 7:
                removeFirstElement();
                break;
            case 8:
                removeLastElement();
                break;
            case 9:
                printDoubleLinkedList();
                break;
        }
    }

    private void addFirstElement() {
        System.out.println("\u001B[33m" + "Enter the first element of the List:");
        System.out.print("> ");
        int value = scannerValues.nextInt();
        doubleLinkedList.addFirst(value);
    }

    private void addLastElement() {
        System.out.println("\u001B[33m" + "Enter the last element of the List:");
        System.out.print("> ");
        int value = scannerValues.nextInt();
        doubleLinkedList.addLast(value);
    }

    private void displayFirstElement() {
        if (!doubleLinkedList.isEmpty()) {
            System.out.print("\u001B[33m" + "The first element in the List is: ");
            System.out.println("\u001B[32m" + doubleLinkedList.first().data);
        } else {
            System.out.println("\u001B[33m" + "List is empty. Nothing to show");
        }
    }

    private void displayLastElement() {
        if (!doubleLinkedList.isEmpty()) {
            System.out.print("\u001B[33m" + "The last element in the List is: ");
            System.out.println("\u001B[32m" + doubleLinkedList.last().data);
        } else {
            System.out.println("\u001B[33m" + "List is empty. Nothing to show");
        }
    }

    private void displayIsEmpty() {
        if (doubleLinkedList.isEmpty()) {
            System.out.println("\u001B[33m" + "List is empty.");
        } else {
            System.out.println("\u001B[33m" + "List is not empty.");
        }
    }

    private void displaySize() {
        System.out.print("\u001B[33m" + "The size of the List is: ");
        System.out.println("\u001B[32m" + doubleLinkedList.size());
    }

    private void removeFirstElement() {
        if (!doubleLinkedList.isEmpty()) {
            System.out.println("\u001B[33m" + "First element of the List removed");
            doubleLinkedList.removeFirst();
        } else {
            System.out.println("\u001B[33m" + "List is empty. Nothing to remove");
        }
    }
    private void removeLastElement() {
        if (!doubleLinkedList.isEmpty()) {
            System.out.println("\u001B[33m" + "Last element of the List removed");
            doubleLinkedList.removeLast();
        } else {
            System.out.println("\u001B[33m" + "List is empty. Nothing to remove");
        }
    }

    private void printDoubleLinkedList() {
        doubleLinkedList.print();
    }

}
