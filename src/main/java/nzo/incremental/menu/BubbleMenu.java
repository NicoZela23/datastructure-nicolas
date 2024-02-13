package nzo.incremental.menu;

public class BubbleMenu extends MenuFactory{
    @Override
    public ConsoleMenu createMenu() {
        String[] sortMenuOptions = {"Try Bubble Sort", "Exit"};
        return new ConsoleMenu("Bubble Sort implementation Menu", sortMenuOptions);
    }
}
