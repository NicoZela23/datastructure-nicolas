package nzo.incremental.linkedlists;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.LinkedListMenu;
import nzo.incremental.menu.MenuFactory;

public class LinkedListManager implements IStructureManager {
    @Override
    public void run() {
        LinkedList list = new LinkedList();
        printMenu();
        list.addFirst(12);
        list.addLast(13);
        System.out.println("1------");
        list.print();
        list.removeFirst();
        list.addLast(15);
        list.addFirst(16);
        System.out.println("2------");
        list.print();
    }
    public static void printMenu(){
        MenuFactory menuFactory = new LinkedListMenu();
        ConsoleMenu currentMenu = menuFactory.createMenu();
        currentMenu.displayMenu();
    }
}
