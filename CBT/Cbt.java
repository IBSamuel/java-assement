package CBT;
import java.util.Scanner;
public class Cbt {
    static Scanner inputScanner = new Scanner(System.in);
    static int firstNumber;
    static int secondNumber;

    public static void main(String[] args) {
        dashBoard();
    }

    public static void dashBoard() {
        System.out.println("What would you like to do today?");
        System.out.println("1. CBT Test");
        System.out.println("2. Work on a Simple Calculator");

        int decide = 0;
        try {
            decide = Integer.parseInt(inputScanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid option (1 or 2).");
            dashBoard();
            return;
        }

        if (decide == 1) {
            Cbt();
        } else if (decide == 2) {
            simpleCalculator();
        } else {
            System.out.println("Invalid input. Please enter a valid option (1 or 2).");
            dashBoard();
        }
    }

    public static void simpleCalculator() {
        System.out.println("Enter any Number from 1-10:");
        firstNumber = readIntegerInput();

        System.out.println("Enter another Number from 1-10:");
        secondNumber = readIntegerInput();

        operations(); // Call method to select operation
    }

    public static void operations() {
        System.out.println("Which Arithmetic Operation do you want to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");

        int operator = readIntegerInput();

        if (operator == 1) {
            System.out.println("The result of addition is: " + addition());
        } else if (operator == 2) {
            System.out.println("The result of subtraction is: " + subtraction());
        } else {
            System.out.println("Invalid choice. Please select from the given options.");
            operations();
        }
    }

    public static int addition() {
        return firstNumber + secondNumber;
    }

    public static int subtraction() {
        return firstNumber - secondNumber;
    }

    public static void Cbt() {
        System.out.println("Welcome to the CBT Exam!");

        System.out.print("Enter the number of students: ");
        int numStudents = readIntegerInput();

        String[] firstNames = new String[numStudents];
        String[] lastNames = new String[numStudents];
        String[] matricNumbers = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " Registration:");
            System.out.print("Enter first name: ");
            firstNames[i] = inputScanner.nextLine();
            System.out.print("Enter last name: ");
            lastNames[i] = inputScanner.nextLine();
            System.out.print("Enter matriculation number: ");
            matricNumbers[i] = inputScanner.nextLine();
        }

        System.out.println("--- CBT Exam ---");
        String[] questions = { "What is 1 + 0?", "What is 1 + 1?", "What is 6 - 3?", "What is 8 - 4?", "What is 5 - 4?",
                "What is 2 * 1?", "What is 7 - 4?", "What is 2 + 2?", "What is 2 - 1?", "What is 8 / 4?" };
        String[][] options = {
                { "a) 0", "b) 1", "c) 2", "d) 3" },
                { "a) 1", "b) 2", "c) 3", "d) 4" },
                { "a) 1", "b) 2", "c) 3", "d) 4" },
                { "a) 1", "b) 2", "c) 3", "d) 4" },
                { "a) 1", "b) 2", "c) 3", "d) 4" },
                { "a) 1", "b) 2", "c) 3", "d) 4" },
                { "a) 1", "b) 2", "c) 3", "d) 4" },
                { "a) 1", "b) 2", "c) 3", "d) 4" },
                { "a) 1", "b) 2", "c) 3", "d) 4" },
                { "a) 1", "b) 2", "c) 3", "d) 4" }
        };
        String[] answers = { "b", "a", "b", "b", "a", "b", "c", "d", "b", "a" };

        int[] scores = new int[numStudents];

        for (int s = 0; s < numStudents; s++) {
            System.out.println("Student " + (s + 1) + ": " + firstNames[s] + " " + lastNames[s]);
            int score = 0;
            for (int q = 0; q < 10; q++) {
                System.out.println("Question " + (q + 1) + ": " + questions[q]);
                for (String option : options[q]) {
                    System.out.println(option);
                }
                String studentAnswer = inputScanner.nextLine();
                if (studentAnswer.equalsIgnoreCase(answers[q])) {
                    score++;
                }
            }
            scores[s] = score;
            System.out.println("Score: " + score + "/10\n");
        }

        System.out.println("\n--- Winner ---");
        int highestScore = scores[0];
        int winnerIndex = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
                winnerIndex = i;
            }
        }
        System.out.println("Congratulations to the winner:");
        System.out.println("Name: " + firstNames[winnerIndex] + " " + lastNames[winnerIndex]);
        System.out.println("Matriculation Number: " + matricNumbers[winnerIndex]);
        System.out.println("Score: " + highestScore);
    }

    private static int readIntegerInput() {
        int input = 0;
        try {
            input = Integer.parseInt(inputScanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            input = readIntegerInput(); // Recursive call to handle invalid input
        }
        return input;
    }
}
