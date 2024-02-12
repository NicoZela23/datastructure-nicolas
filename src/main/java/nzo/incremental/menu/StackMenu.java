package nzo.incremental.menu;

public class StackMenu extends MenuFactory{
    @Override
    public ConsoleMenu createMenu() {
        String[] ArrayStackMenuOptions = {"Push Element", "Pop Element", "Top Element", "Stack Is Empty", "Stack Size", "Print", "Exit"};
        return new ConsoleMenu("Array Stack implementation Menu", ArrayStackMenuOptions);
    }
}
