package nzo.incremental.menu;
public class CircularLinkedListMenu extends MenuFactory {
    @Override
    public ConsoleMenu createMenu() {
        String[] CircularLinkedListMenuOptions = {"Add First", "Add Last", "First Node", "Last Node", "Is Empty", "List Size", "Remove First"};
        return new ConsoleMenu("Circular Linked list implementation Menu", CircularLinkedListMenuOptions);
    }
}