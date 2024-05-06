package Todo;
import java.util.Scanner;

public class Todo {
    static Scanner inputs = new Scanner(System.in);
    static String[] tasks;
    static String[] times;
    static int num;

    public static void main(String[] args) {
        dashBoard();
    }

    public static void dashBoard() {
        System.out.println("Welcome to my Todo App");
        System.out.println("How many tasks would you like to schedule for today?");
        num = inputs.nextInt();
        inputs.nextLine(); // Consume newline character

        tasks = new String[num];
        times = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter the task you want to do:");
            tasks[i] = inputs.nextLine();

            System.out.println("Enter the time you want to do it:");
            times[i] = inputs.nextLine();
        }

        System.out.println("Tasks added successfully!");

 
        System.out.println("\nOptions:");
        System.out.println("1. View all tasks");
        System.out.println("2. Exit");

        int choice = inputs.nextInt();
        inputs.nextLine(); 

        if (choice == 1) {
            displayTasks();
        } else if (choice == 2) {
            System.out.println("Exiting Todo App. Goodbye!");
        } else {
            System.out.println("Invalid choice. Exiting Todo App.");
        }
    }

    public static void displayTasks() {
        System.out.println("\n--- All Tasks ---");
        for (int i = 0; i < num; i++) {
            System.out.println("Task " + (i + 1) + ": " + tasks[i]);
            System.out.println("Time: " + times[i]);
            System.out.println(); // Blank line for separation
        }
    }
}
