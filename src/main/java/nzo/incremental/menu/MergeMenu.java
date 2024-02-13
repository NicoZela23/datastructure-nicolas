package nzo.incremental.menu;

public class MergeMenu extends MenuFactory{
    @Override
    public ConsoleMenu createMenu() {
        String[] sortMenuOptions = {"Try Merge Sort", "Exit"};
        return new ConsoleMenu("Merge Sort implementation Menu", sortMenuOptions);
    }
}
