package nzo.incremental.linkedlists;

import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.DoubleLinkedListMenu;
import nzo.incremental.menu.MenuFactory;

public class DoubleLinkedListManager implements IStructureManager {
    @Override
    public void run() {
        DoubleLinkedList doublelist = new DoubleLinkedList();
        printMenu();
        System.out.println(doublelist.size());
        doublelist.addFirst(15);
        doublelist.addLast(65);
        doublelist.addLast(30);
        doublelist.addLast(11);
        doublelist.addFirst(10);
        doublelist.print();

    }
    public static void printMenu(){
        MenuFactory menuFactory = new DoubleLinkedListMenu();
        ConsoleMenu currentMenu = menuFactory.createMenu();
        currentMenu.displayMenu();
    }
}
