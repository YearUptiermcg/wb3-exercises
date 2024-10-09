import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Read a bedtime story");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = inputScanner.nextInt();
            inputScanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of a story (e.g., goldilocks.txt): ");
                    String fileName = inputScanner.nextLine();
                    readStory(fileName);
                    break;

                case 2:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 2);
    }

    private static void readStory(String fileName) {
        try {
            Scanner fileScanner = new Scanner(new java.io.File(fileName));
            int lineNumber = 1;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }
        } catch (Exception e) {
            System.out.println("Story file not found: " + fileName);
        }
    }
}
