import java.util.Scanner;
public class FitnessTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter calories consumed today: ");
        int caloriesIn = input.nextInt();
        System.out.print("Enter calories burned today: ");
        int caloriesOut = input.nextInt();
        System.out.println("Hello " + name + "!");
        System.out.println(getCalorieMessage(caloriesIn, caloriesOut));
        input.close();
    }
    public static String getCalorieMessage(int caloriesIn, int caloriesOut) {
        int result = caloriesIn - caloriesOut;
        if (result > 0) {
            return "You are in a calorie surplus of " + result + " calories.";
        } else if (result < 0) {
            return "You are in a calorie deficit of " + Math.abs(result) + " calories.";
        } else {
            return "You are perfectly balanced today!";
        }
    }
}