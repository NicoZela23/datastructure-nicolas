package nzo.incremental.linkedlists;
import nzo.incremental.interfaces.ILinkedList;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.LinkedListMenu;
import nzo.incremental.menu.MenuFactory;
import java.util.Scanner;

public class LinkedListManager implements IStructureManager {
    private final Scanner scannerValues;
    private final ILinkedList linkedList;
    private MenuFactory menuFactory;
    private final ConsoleMenu currentMenu;

    public LinkedListManager() {
        scannerValues = new Scanner(System.in);
        linkedList = new LinkedList();
        menuFactory = new LinkedListMenu();
        currentMenu = menuFactory.createMenu();
    }

    @Override
    public void run() {
        int userChoice;
        do {
            currentMenu.displayMenu();
            userChoice = currentMenu.getUserChoiceInteger();
            processUserChoice(userChoice);
        } while (userChoice != 9);
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
                printLinkedList();
                break;
        }
    }

    private void addFirstElement() {
        System.out.println("\u001B[33m" + "Enter the first element of the List:");
        int value = scannerValues.nextInt();
        linkedList.addFirst(value);
    }

    private void addLastElement() {
        System.out.println("\u001B[33m" + "Enter the last element of the List:");
        int value = scannerValues.nextInt();
        linkedList.addLast(value);
    }

    private void displayFirstElement() {
        if (!linkedList.isEmpty()) {
            System.out.print("\u001B[33m" + "The first element in the list is: ");
            System.out.println("\u001B[32m" + linkedList.first().data);
        } else {
            System.out.println("\u001B[33m" + "List is empty. Nothing to show");
        }
    }

    private void displayLastElement() {
        if (!linkedList.isEmpty()) {
            System.out.print("\u001B[33m" + "The last element in the list is: ");
            System.out.println("\u001B[32m" + linkedList.last().data);
        } else {
            System.out.println("\u001B[33m" + "List is empty. Nothing to show");
        }
    }

    private void displayIsEmpty() {
        if (linkedList.isEmpty()) {
            System.out.println("\u001B[33m" + "List is empty.");
        } else {
            System.out.println("\u001B[33m" + "List is not empty.");
        }
    }

    private void displaySize() {
        System.out.print("\u001B[33m" + "The size of the list is: ");
        System.out.println("\u001B[32m" + linkedList.size());
    }

    private void removeFirstElement() {
        if (!linkedList.isEmpty()) {
            System.out.println("\u001B[33m" + "First element of the list removed");
            linkedList.removeFirst();
        } else {
            System.out.println("\u001B[33m" + "List is empty. Nothing to remove");
        }
    }

    private void printLinkedList() {
        linkedList.print();
    }
}
