package nzo.incremental;

import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;

public class MainMenu extends MenuFactory {
    @Override
    public ConsoleMenu createMenu() {
        String[] mainMenuOptions = {"Linked List", "Test 1", "Test 2"};
        return new ConsoleMenu("Main Menu", mainMenuOptions);
    }
}
