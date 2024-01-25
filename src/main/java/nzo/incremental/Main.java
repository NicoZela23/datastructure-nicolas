package nzo.incremental;

import nzo.incremental.interfaces.IStructureManager;

public class Main {
    public static void main(String[] args) {
        prinMenu();
        IStructureManager structureManager = StructureManagerFactory.getManager("A");
        structureManager.run();
    }

    private static void prinMenu(){
        System.out.println("Choosa a data structure");
        System.out.println("A - Linked List");
    }
} 