import java.util.Scanner;
import java.lang.Math;

public class Love {
    static Scanner inputs = new Scanner(System.in);

    public static void main(String[] args) {
        FirstUserName();
    }

    public static void FirstUserName() {
        System.out.println("Enter your Name:");
        String firstName = inputs.nextLine();
        String loverName = LoversName(); // Get lover's name
        randomNumber(firstName, loverName); // Generate random number and proceed
    }

    public static String LoversName() {
        System.out.println("Enter your lover's Name:");
        String loverName = inputs.nextLine();
        return loverName;
    }

    public static void randomNumber(String firstName, String loverName) {
        long loveRange = Math.round(Math.random() * 100);

        if (loveRange >= 0 && loveRange <= 10) {
            System.out.println("Your Love Percentage is: " + loveRange + "% - Very low compatibility or connection\n" +
                               "Little to no shared interests or chemistry with " + loverName);
        } else if (loveRange >= 11 && loveRange <= 20) {
            System.out.println("Your Love Percentage is: " + loveRange + "% - Chilly");
        } else if (loveRange >= 21 && loveRange <= 30) {
            System.out.println("Your Love Percentage is: " + loveRange + "% - Lukewarm");
        } else if (loveRange >= 31 && loveRange <= 50) {
            System.out.println("Your Love Percentage is: " + loveRange + "% - Moderate");
        } else if (loveRange >= 51 && loveRange <= 60) {
            System.out.println("Your Love Percentage is: " + loveRange + "% - Warm");
        } else if (loveRange >= 61 && loveRange <= 70) {
            System.out.println("Your Love Percentage is: " + loveRange + "% - Hot");
        } else if (loveRange >= 71 && loveRange <= 100) {
            System.out.println("Your Love Percentage is: " + loveRange + "% - Fireworks");
        } else {
            System.out.println("Invalid love range"); // Handle invalid ranges if needed
        }

        retry(); // Ask user if they want to try again
    }

    public static void retry() {
        System.out.println("Do you want to try again?\n1. Yes\n2. No");
        int retry = inputs.nextInt();

        if (retry == 1) {
            inputs.nextLine(); // Consume newline character
            FirstUserName(); // Restart the process
        } else {
            System.out.println("Thank you for using the Love Calculator");
            inputs.close(); // Close scanner to prevent resource leak
        }
    }
}
