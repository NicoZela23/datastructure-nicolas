package nzo.incremental.menu;
public class LinkedListMenu extends MenuFactory {
    @Override
    public ConsoleMenu createMenu() {
        String[] linkedListMenuOptions = {"Add First", "Add Last", "First Element", "Last Element", "List Is Empty", "List Size", "Remove First", "Print", "Exit"};
        return new ConsoleMenu("Linked list implementation Menu", linkedListMenuOptions);
    }
}
