package nzo.incremental;

import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.MenuFactory;

public class Main {
    public static void main(String[] args) {
        char userChoiceMain;
        IStructureManager structureManager;
        //menu
        MenuFactory menuFactory = new MainMenu();
        ConsoleMenu currentMenu = menuFactory.createMenu();

        do {
            currentMenu.displayMenuCharacters();
            userChoiceMain = currentMenu.getUserChoiceChar();
            switch (userChoiceMain){
                case 'A':
                    structureManager = StructureManagerFactory.getManager("A");
                    structureManager.run();
                    break;
                case 'B':
                    structureManager = StructureManagerFactory.getManager("B");
                    structureManager.run();
                    break;
                case 'C':
                    structureManager = StructureManagerFactory.getManager("C");
                    structureManager.run();
                    break;
            }
        } while (userChoiceMain != 'M');

    }
}