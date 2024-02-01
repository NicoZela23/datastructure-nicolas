package nzo.incremental.stacks;

import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;

public class StackMenu extends MenuFactory {
    @Override
    public ConsoleMenu createMenu() {
        String[] stackMenuOptions = {"Push", "Pop", "Top", "Is Empty", "Stack Size", "Print"};
        return new ConsoleMenu("Stack implementation Menu", stackMenuOptions);
    }
}
