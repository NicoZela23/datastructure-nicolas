package nzo.incremental.menu;

public class QueueMenu extends MenuFactory{
    @Override
    public ConsoleMenu createMenu() {
        String[] queueMenuOptions = {"Enqueue Element", "Dequeue Element", "First Element", "Queue Is Empty", "Queue Size", "Print", "Exit"};
        return new ConsoleMenu("Queue implementation Menu", queueMenuOptions);
    }
}
