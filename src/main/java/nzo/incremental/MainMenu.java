package nzo.incremental;

import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;

public class MainMenu extends MenuFactory {
    @Override
    public ConsoleMenu createMenu() {
        String[] mainMenuOptions = {"Linked List", "Double Linked List", "Circular Linked List", "Array Stack", "Linked List Stack", "Array Queue", "Linked List Queue", "Double Ended Queue", "Binary Tree", "Graph" , "Merge sort", "Bubble sort", "Exit"};
        return new ConsoleMenu("Main Menu", mainMenuOptions);
    }
}
