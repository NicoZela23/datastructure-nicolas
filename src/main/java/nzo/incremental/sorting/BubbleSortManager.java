package nzo.incremental.sorting;

import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.*;

import java.util.Scanner;

public class BubbleSortManager implements IStructureManager {

    private BubbleSort bubbleSort;
    private MenuFactory menuFactory;
    private final ConsoleMenu currentMenu;
    public BubbleSortManager() {
        bubbleSort = new BubbleSort();
        menuFactory = new BubbleMenu();
        currentMenu = menuFactory.createMenu();
    }
    @Override
    public void run() {
        int userChoice;
        do {
            currentMenu.displayMenu();
            userChoice = currentMenu.getUserChoiceInteger();
            processUserChoice(userChoice);
        } while (userChoice != 2);
    }
    private void processUserChoice(int choice) {
        switch (choice) {
            case 1:
                performSort();
                break;
        }
    }
    private void performSort(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\u001B[33m" + "Enter the capacity of the array:");
        System.out.print("> ");
        int capacity = scan.nextInt();

        System.out.println("\u001B[33m" + "Enter the values:");
        System.out.print("> ");
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = scan.nextInt();
        }
        BubbleSort.bubblesort(array);
        for (int i : array){
            System.out.print("\u001B[32m" + i + " ");
        }
        System.out.println();
    }
}
