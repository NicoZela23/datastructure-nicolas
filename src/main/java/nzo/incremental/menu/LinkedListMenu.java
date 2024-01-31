package nzo.incremental.menu;
public class LinkedListMenu extends MenuFactory {
    @Override
    public ConsoleMenu createMenu() {
        String[] linkedListMenuOptions = {"Add First", "Add Last", "First Node", "Last Node", "Is Empty", "List Size", "Remove First"};
        return new ConsoleMenu("Linked list implementation Menu", linkedListMenuOptions);
    }
}
