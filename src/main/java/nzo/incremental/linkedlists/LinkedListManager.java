package nzo.incremental.linkedlists;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.LinkedListMenu;
import nzo.incremental.menu.MenuFactory;
import nzo.incremental.stacks.ArrayStack;
import nzo.incremental.stacks.LinkedListStack;

import javax.swing.*;

public class LinkedListManager implements IStructureManager {
    @Override
    public void run() {
    }
    public static void printMenu(){
        MenuFactory menuFactory = new LinkedListMenu();
        ConsoleMenu currentMenu = menuFactory.createMenu();
        currentMenu.displayMenu();
    }
}
