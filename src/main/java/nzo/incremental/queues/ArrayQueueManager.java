package nzo.incremental.queues;

import nzo.incremental.interfaces.IQueue;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;
import nzo.incremental.menu.QueueMenu;

import java.util.Scanner;

public class ArrayQueueManager implements IStructureManager {
    private final Scanner scannerValues;
    private IQueue arrayQueue;
    private MenuFactory menuFactory;
    private final ConsoleMenu currentMenu;
    private int sizeValue;

    public ArrayQueueManager() {
        scannerValues = new Scanner(System.in);
        arrayQueue = new ArrayQueue();
        menuFactory = new QueueMenu();
        currentMenu = menuFactory.createMenu();
        sizeValue = 0;
    }

    @Override
    public void run() {
        int userChoice;
        System.out.println("\u001B[32m" + "Do you want to set a Capacity or use Default for the Queue?");
        System.out.println("1.- Set Capacity");
        System.out.println("2.- Set Default");
        System.out.print("> ");
        int constructorValue = scannerValues.nextInt();
        if (constructorValue == 1){
            System.out.println("The size of your Queue will be?");
            System.out.print("> ");
            constructorValue = scannerValues.nextInt();
            arrayQueue = new ArrayQueue(constructorValue);
            sizeValue = constructorValue;
        }
        else{
            System.out.println("Capacity set to Default");
            arrayQueue = new ArrayQueue();
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
        if (arrayQueue.size() == sizeValue){
            System.out.println("\u001B[33m" + "Queue is full. Cannot push more elements.");
            return;
        }
        System.out.println("\u001B[33m" + "Enter the element to be pushed:");
        System.out.print("> ");
        int value = scannerValues.nextInt();
        arrayQueue.enqueue(value);
    }

    private void dequeueElement() {
        if (!arrayQueue.isEmpty()) {
            System.out.println("\u001B[33m" + "Top element removed");
            arrayQueue.dequeue();
        } else {
            System.out.println("\u001B[33m" + "Queue is empty. Nothing to remove");
        }
    }

    private void displayFirstElement() {
        if (!arrayQueue.isEmpty()) {
            System.out.print("\u001B[33m" + "The first element in the Queue is: ");
            System.out.println("\u001B[32m" + arrayQueue.first());
        } else {
            System.out.println("\u001B[33m" + "Queue is empty. Nothing to show");
        }
    }

    private void displayIsEmpty() {
        if (arrayQueue.isEmpty()) {
            System.out.println("\u001B[33m" + "Queue is empty.");
        } else {
            System.out.println("\u001B[33m" + "Queue is not empty.");
        }
    }

    private void displaySize() {
        System.out.print("\u001B[33m" + "The size of the Queue is: ");
        System.out.println("\u001B[32m" + arrayQueue.size());
    }

    private void printQueue() {
        arrayQueue.print();
    }
}
