package nzo.incremental.menu;
public class DoubleLinkedListMenu extends MenuFactory{
    @Override
    public ConsoleMenu createMenu() {
        String[] doubleLinkedListMenuOptions = {"Add First", "Add Last", "First Node", "Last Node", "Is Empty", "List Size", "Remove First", "Remove Last"};
        return new ConsoleMenu("Double Linked list implementation Menu", doubleLinkedListMenuOptions);
    }
}
