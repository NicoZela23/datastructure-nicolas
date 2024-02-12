package nzo.incremental.menu;

import java.util.Scanner;

public class ConsoleMenu {
    private final String title;
    private final String[] options;

    public ConsoleMenu(String title, String[] options) {
        this.title = title;
        this.options = options;
    }

    public void displayMenu(){
        System.out.println("\u001B[97m" + "***************************************");
        System.out.println("*   " + title);
        System.out.println("***************************************");

        for(int i = 0; i<options.length; i++){
            System.out.println("* " + (i + 1) + ". " + options[i]);
        }
        System.out.println("*********************************");
    }
    public void displayMenuCharacters() {
        System.out.println("\u001B[97m" + "***************************************");
        System.out.println("*   " + title);
        System.out.println("***************************************");

        for (int i = 0; i < options.length; i++) {
            char optionChar = (char) ('A' + i);
            System.out.println("* " + optionChar + ". " + options[i]);
        }

        System.out.println("***************************************");
    }

    public int getUserChoiceInteger(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter your choice (1-" + options.length + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < 1 || choice > options.length);

        return choice;
    }
    public char getUserChoiceChar() {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter your choice (A - " + (char)('A' + options.length - 1) + "): ");
            choice = scanner.next().toUpperCase().charAt(0);

            if (choice < 'A' || choice > (char)('A' + options.length - 1)) {
                System.out.println("Invalid input. Please enter a valid character.");
            }

        } while (choice < 'A' || choice > (char)('A' + options.length - 1));

        return choice;
    }

}
