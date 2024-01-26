package nzo.incremental;

import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.linkedlists.LinkedListMenu;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;

public class Main {
    public static void main(String[] args) {
        printMenu();
        IStructureManager structureManager = StructureManagerFactory.getManager("A");
        structureManager.run();
    }

    private static void printMenu(){
        MenuFactory menuFactory = new MainMenu();
        ConsoleMenu currentMenu = menuFactory.createMenu();
        currentMenu.displayMenuCharacters();
    }
} 