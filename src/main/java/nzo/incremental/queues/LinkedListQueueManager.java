package nzo.incremental.queues;

import nzo.incremental.interfaces.IQueue;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;
import nzo.incremental.menu.QueueMenu;

import java.util.Scanner;

public class LinkedListQueueManager implements IStructureManager {
    private final Scanner scannerValues;
    private IQueue linkedListQueue;
    private MenuFactory menuFactory;
    private final ConsoleMenu currentMenu;

    public LinkedListQueueManager() {
        scannerValues = new Scanner(System.in);
        linkedListQueue = new LinkedListQueue();
        menuFactory = new QueueMenu();
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
                enqueueElement();
                break;
            case 2:
                dequeueElement();
                break;
            case 3:
                displayFirstElement();
                break;
            case 4:
                displayIsEmpty();
                break;
            case 5:
                displaySize();
                break;
            case 6:
                printQueue();
                break;
        }
    }

    private void enqueueElement() {
        System.out.println("\u001B[33m" + "Enter the element to be pushed:");
        System.out.print("> ");
        int value = scannerValues.nextInt();
        linkedListQueue.enqueue(value);
    }

    private void dequeueElement() {
        if (!linkedListQueue.isEmpty()) {
            System.out.println("\u001B[33m" + "Top element removed");
            linkedListQueue.dequeue();
        } else {
            System.out.println("\u001B[33m" + "Queue is empty. Nothing to remove");
        }
    }

    private void displayFirstElement() {
        if (!linkedListQueue.isEmpty()) {
            System.out.print("\u001B[33m" + "The first element in the Queue is: ");
            System.out.println("\u001B[32m" + linkedListQueue.first());
        } else {
            System.out.println("\u001B[33m" + "Queue is empty. Nothing to show");
        }
    }

    private void displayIsEmpty() {
        if (linkedListQueue.isEmpty()) {
            System.out.println("\u001B[33m" + "Queue is empty.");
        } else {
            System.out.println("\u001B[33m" + "Queue is not empty.");
        }
    }

    private void displaySize() {
        System.out.print("\u001B[33m" + "The size of the Queue is: ");
        System.out.println("\u001B[32m" + linkedListQueue.size());
    }

    private void printQueue() {
        linkedListQueue.print();
    }
}
