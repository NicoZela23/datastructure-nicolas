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
                case 'D':
                    structureManager = StructureManagerFactory.getManager("D");
                    structureManager.run();
                    break;
                case 'E':
                    structureManager = StructureManagerFactory.getManager("E");
                    structureManager.run();
                    break;
                case 'F':
                    structureManager = StructureManagerFactory.getManager("F");
                    structureManager.run();
                    break;
                case 'G':
                    structureManager = StructureManagerFactory.getManager("G");
                    structureManager.run();
                    break;
                case 'H':
                    structureManager = StructureManagerFactory.getManager("H");
                    structureManager.run();
                    break;
                case 'I':
                    structureManager = StructureManagerFactory.getManager("I");
                    structureManager.run();
                    break;
                case 'J':
                    structureManager = StructureManagerFactory.getManager("J");
                    structureManager.run();
                    break;
                case 'K':
                    structureManager = StructureManagerFactory.getManager("K");
                    structureManager.run();
                    break;
                case 'L':
                    structureManager = StructureManagerFactory.getManager("L");
                    structureManager.run();
                    break;
            }
        } while (userChoiceMain != 'M');

    }
}