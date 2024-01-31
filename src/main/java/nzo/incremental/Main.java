package nzo.incremental;

import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;

public class Main {
    public static void main(String[] args) {
        MenuFactory menuFactory = new MainMenu();
        char userChoiceMain;
        ConsoleMenu currentMenu = menuFactory.createMenu();
        currentMenu.displayMenuCharacters();
        IStructureManager structureManager;

        do {
            userChoiceMain = currentMenu.getUserChoiceChar();
            switch (userChoiceMain){
                case 'A':
                    structureManager = StructureManagerFactory.getManager("A");
                    structureManager.run();
                    break;
            }
        } while (userChoiceMain != 'z');

    }


}