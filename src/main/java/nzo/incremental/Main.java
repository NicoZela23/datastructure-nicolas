package nzo.incremental;

import nzo.incremental.interfaces.IStructureManager;

public class Main {
    public static void main(String[] args) {
        printMenu();
        // Input Reader
        IStructureManager structureManager = StructureManagerFactory.getManager("A");
        structureManager.run();
    }

    private static void printMenu(){
        System.out.println("Chose a data structure");
        System.out.println("A - Linked List");
    }
} 