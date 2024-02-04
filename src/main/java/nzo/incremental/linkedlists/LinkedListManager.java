package nzo.incremental.linkedlists;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.LinkedListMenu;
import nzo.incremental.menu.MenuFactory;

public class LinkedListManager implements IStructureManager {
    @Override
    public void run() {
        LinkedList list = new LinkedList();
        System.out.println(list.size());
        list.addFirst(15);
        list.addLast(17);
        list.addFirst(20);
        list.print();
        printMenu();
    }
    public static void printMenu(){
        MenuFactory menuFactory = new LinkedListMenu();
        ConsoleMenu currentMenu = menuFactory.createMenu();
        currentMenu.displayMenu();
    }
}
