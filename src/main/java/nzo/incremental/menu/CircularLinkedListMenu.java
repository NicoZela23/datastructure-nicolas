package nzo.incremental.menu;
public class CircularLinkedListMenu extends MenuFactory {
    @Override
    public ConsoleMenu createMenu() {
        String[] CircularLinkedListMenuOptions = {"Add First", "Add Last", "First Node", "Last Node", "List Is Empty", "List Size", "Remove First", "Print", "Exit"};
        return new ConsoleMenu("Circular Linked list implementation Menu", CircularLinkedListMenuOptions);
    }
}