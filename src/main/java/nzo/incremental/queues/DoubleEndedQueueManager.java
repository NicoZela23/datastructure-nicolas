package nzo.incremental.queues;

import nzo.incremental.interfaces.IDoubleEndedQueue;
import nzo.incremental.interfaces.IDoubleLinkedList;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.linkedlists.DoubleLinkedList;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.DoubleEndedQueueMenu;
import nzo.incremental.menu.DoubleLinkedListMenu;
import nzo.incremental.menu.MenuFactory;

import java.util.Scanner;

public class DoubleEndedQueueManager implements IStructureManager {
    private final Scanner scannerValues;
    private final IDoubleEndedQueue doubleEndedQueue;
    private MenuFactory menuFactory;
    private final ConsoleMenu currentMenu;

    public DoubleEndedQueueManager() {
        scannerValues = new Scanner(System.in);
        doubleEndedQueue = new DoubleEndedQueue();
        menuFactory = new DoubleEndedQueueMenu();
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
                enqueueFirstElement();
                break;
            case 2:
                enqueueLastElement();
                break;
            case 3:
                dequeueFirstElement();
                break;
            case 4:
                dequeueLastElement();
                break;
            case 5:
                displayFirstElement();
                break;
            case 6:
                displayLastElement();
                break;
            case 7:
                displayIsEmpty();
                break;
            case 8:
                displaySize();
                break;
            case 9:
                printQueue();
                break;
        }
    }

    private void enqueueFirstElement() {
    System.out.println("\u001B[33m" + "Enter the first element of the Queue:");
        System.out.print("> ");
        int value = scannerValues.nextInt();
        doubleEndedQueue.addFirst(value);
    }

    private void enqueueLastElement() {
        System.out.println("\u001B[33m" + "Enter the last element of the Queue:");
        System.out.print("> ");
        int value = scannerValues.nextInt();
        doubleEndedQueue.addLast(value);
    }
    private void dequeueFirstElement() {
        if (!doubleEndedQueue.isEmpty()) {
            System.out.println("\u001B[33m" + "First element of the Queue removed");
            doubleEndedQueue.removeFirst();
        } else {
            System.out.println("\u001B[33m" + "Queue is empty. Nothing to remove");
        }
    }
    private void dequeueLastElement() {
        if (!doubleEndedQueue.isEmpty()) {
            System.out.println("\u001B[33m" + "Last element of the Queue removed");
            doubleEndedQueue.removeLast();
        } else {
            System.out.println("\u001B[33m" + "Queue is empty. Nothing to remove");
        }
    }

    private void displayFirstElement() {
        if (!doubleEndedQueue.isEmpty()) {
            System.out.print("\u001B[33m" + "The first element in the Queue is: ");
            System.out.println("\u001B[32m" + doubleEndedQueue.first());
        } else {
            System.out.println("\u001B[33m" + "Queue is empty. Nothing to show");
        }
    }

    private void displayLastElement() {
        if (!doubleEndedQueue.isEmpty()) {
            System.out.print("\u001B[33m" + "The last element in the Queue is: ");
            System.out.println("\u001B[32m" + doubleEndedQueue.last());
        } else {
            System.out.println("\u001B[33m" + "Queue is empty. Nothing to show");
        }
    }

    private void displayIsEmpty() {
        if (doubleEndedQueue.isEmpty()) {
            System.out.println("\u001B[33m" + "Queue is empty.");
        } else {
            System.out.println("\u001B[33m" + "Queue is not empty.");
        }
    }

    private void displaySize() {
        System.out.print("\u001B[33m" + "The size of the Queue is: ");
        System.out.println("\u001B[32m" + doubleEndedQueue.size());
    }
    private void printQueue() {
        doubleEndedQueue.print();
    }

}
