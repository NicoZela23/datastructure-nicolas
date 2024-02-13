package nzo.incremental.sorting;

import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;
import nzo.incremental.menu.MergeMenu;

import java.util.Scanner;

public class MergeSortManager implements IStructureManager {
    private MergeSort mergeSort;
    private MenuFactory menuFactory;
    private final ConsoleMenu currentMenu;
    public MergeSortManager() {
        mergeSort = new MergeSort();
        menuFactory = new MergeMenu();
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
        int capacity = scan.nextInt();

        System.out.println("\u001B[33m" + "Enter the values:");
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = scan.nextInt();
        }
        MergeSort.mergeSorting(array, array.length);
        for (int i : array){
            System.out.print("\u001B[32m" + i + " ");
        }
        System.out.println();
    }
}
