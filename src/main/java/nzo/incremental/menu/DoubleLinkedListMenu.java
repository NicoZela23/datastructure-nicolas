package nzo.incremental.menu;
public class DoubleLinkedListMenu extends MenuFactory{
    @Override
    public ConsoleMenu createMenu() {
        String[] doubleLinkedListMenuOptions = {"Add First", "Add Last", "First Element", "Last Element", "List Is Empty", "List Size", "Remove First", "Remove Last", "Print", "Exit"};
        return new ConsoleMenu("Double Linked list implementation Menu", doubleLinkedListMenuOptions);
    }
}
