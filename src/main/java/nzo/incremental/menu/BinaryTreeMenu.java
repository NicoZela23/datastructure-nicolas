package nzo.incremental.menu;

public class BinaryTreeMenu extends MenuFactory{
    @Override
    public ConsoleMenu createMenu() {
        String[] BinaryTreeMenuOptions = {"Insert Node", "Delete Node", "Get Root", "Get Node", "Tree Height", "Tree Size", "Search", "Print Unordered Tree", "Print inOrder Tree", "Print preOrder Tree", "Print postOrder Tree", "Exit"};
        return new ConsoleMenu("Binary Tree implementation Menu", BinaryTreeMenuOptions);
    }
}
