import java.util.Scanner;

// This program is a simple fitness tracker that calculates
// whether a user is in a calorie surplus, deficit, or balanced
public class FitnessTracker {

    public static void main(String[] args) {

        // Create Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Ask user for their name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Ask user for calories consumed
        System.out.print("Enter calories consumed today: ");
        int caloriesIn = input.nextInt();

        // Ask user for calories burned
        System.out.print("Enter calories burned today: ");
        int caloriesOut = input.nextInt();

        // Display greeting message
        System.out.println("\nHello " + name + "!");

        // Call method to determine calorie result and display message
        System.out.println(getCalorieMessage(caloriesIn, caloriesOut));

        // Close the scanner to prevent resource leaks
        input.close();
    }

    // This method calculates whether the user is in a surplus,
    // deficit, or balanced based on calorie input
    public static String getCalorieMessage(int caloriesIn, int caloriesOut) {

        // Calculate the difference between calories consumed and burned
        int result = caloriesIn - caloriesOut;

        // If result is positive, user is in a calorie surplus
        if (result > 0) {
            return "You are in a calorie surplus of " + result + " calories.";

        // If result is negative, user is in a calorie deficit
        } else if (result < 0) {
            return "You are in a calorie deficit of " + Math.abs(result) + " calories.";

        // If result is zero, user is balanced
        } else {
            return "You are perfectly balanced today!";
        }
    }
}
