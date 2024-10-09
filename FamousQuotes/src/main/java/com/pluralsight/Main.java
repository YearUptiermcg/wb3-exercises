import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {
        // Array of quotes from The Beatles
        String[] quotes = {
                "All you need is love. - John Lennon",
                "In the end, the love you take is equal to the love you make. - Paul McCartney",
                "Life is very short, and there’s no time for fussing and fighting, my friend. - Paul McCartney",
                "You may say I'm a dreamer, but I'm not the only one. - John Lennon",
                "Yesterday, all my troubles seemed so far away. - Paul McCartney",
                "We can work it out. - Paul McCartney",
                "The sun is up, the sky is blue, it’s beautiful and so are you. - John Lennon",
                "I get by with a little help from my friends. - Ringo Starr",
                "There's nowhere you can be that isn't where you're meant to be. - John Lennon",
                "And in the end, the love you take is equal to the love you make. - Paul McCartney"
        };

        Scanner scanner = new Scanner(System.in); // Create a scanner to read user input
        boolean continueViewing = true; // Variable to control the loop

        // Loop to keep asking the user for input
        while (continueViewing) {
            System.out.print("Select a quote number between 1 and 10 (or 0 for a random quote): ");
            int choice = scanner.nextInt(); // Get user choice

            if (choice == 0) {
                // Display a random quote
                displayRandomQuote(quotes);
            } else {
                // Try to display the selected quote
                if (choice >= 1 && choice <= 10) {
                    System.out.println(quotes[choice - 1]); // Display the quote
                } else {
                    System.out.println("Invalid selection! Please select a number between 1 and 10."); // Handle invalid input
                }
            }

            // Ask if the user wants to see another quote
            System.out.print("Would you like to see another quote? (yes/no): ");
            String response = scanner.next(); // Read user response
            if (!response.equalsIgnoreCase("yes")) {
                continueViewing = false; // Exit loop if the user doesn't want to continue
            }
        }

        System.out.println("Thank you for using the Famous Quotes application!"); // Thank the user
        scanner.close(); // Close the scanner
    }

    // Method to display a random quote
    private static void displayRandomQuote(String[] quotes) {
        Random random = new Random(); // Create a Random object
        int randomIndex = random.nextInt(quotes.length); // Get a random index
        System.out.println(quotes[randomIndex]); // Display the random quote
    }
}
