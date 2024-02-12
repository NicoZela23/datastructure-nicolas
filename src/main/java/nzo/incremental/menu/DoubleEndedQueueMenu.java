package nzo.incremental.menu;

public class DoubleEndedQueueMenu extends MenuFactory{
    @Override
    public ConsoleMenu createMenu() {
        String[] doubleEndedQueueMenuOptions = {"Enqueue first Element", "Enqueue last Element", "Dequeue first Element", "Dequeue last Element", "First Element", "Last Element", "Queue Is Empty", "Queue Size", "Print", "Exit"};
        return new ConsoleMenu("Double Ended Queue implementation Menu", doubleEndedQueueMenuOptions);
    }
}
