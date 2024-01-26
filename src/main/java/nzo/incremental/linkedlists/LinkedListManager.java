package nzo.incremental.linkedlists;

import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;

public class LinkedListManager implements IStructureManager {
    @Override
    public void run() {
        LinkedList list = new LinkedList();
        printMenu();
    }

    public static void printMenu(){
        MenuFactory menuFactory = new LinkedListMenu();
        ConsoleMenu currentMenu = menuFactory.createMenu();
        currentMenu.displayMenu();
    }
}