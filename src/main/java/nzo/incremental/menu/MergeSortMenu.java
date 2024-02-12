package nzo.incremental.menu;

public class MergeSortMenu extends MenuFactory{
    @Override
    public ConsoleMenu createMenu() {
        String[] MergeSortMenuOptions = {"Try Merge Sort", "Exit"};
        return new ConsoleMenu("Merge Sort implementation Menu", MergeSortMenuOptions);
    }
}
