package nzo.incremental.linkedlists;

import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;

public class LinkedListMenu extends MenuFactory {
    @Override
    public ConsoleMenu createMenu() {
        String[] linkedListMenuOptions = {"Add First", "Add Last", "First Node", "Last Node", "Is Empty", "List Size", "Remove First"};
        return new ConsoleMenu("Linked list implementation Menu", linkedListMenuOptions);
    }
}
