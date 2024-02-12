package nzo.incremental.menu;

public class GraphMenu extends MenuFactory{
    @Override
    public ConsoleMenu createMenu() {
        String[] GraphMenuOptions = {"Add Node", "Add Edge", "Remove Node", "Remove Edge", "Number of Nodes", "Get Nodes", "Number of Edges", "Get Edges", "Get Edge", "Out Degree", "In Degree", "Out Going Edges", "In Coming Edges", "Exit"};
        return new ConsoleMenu("Binary Tree implementation Menu", GraphMenuOptions);
    }
}
