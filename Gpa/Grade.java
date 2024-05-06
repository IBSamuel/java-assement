package Gpa;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User name
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        // Read scores for 5 courses
        double totalGradePoints = 0;
        int totalCreditUnits = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter score for Course " + i + ":");
            double score = scanner.nextDouble();

            // Normalize score to be within 100
            if (score > 100) {
                System.out.println("Score is over 100. Setting to 100.");
                score = 100;
            }

            // Assign grade points based on score
            double gradePoints;
            if (score >= 90) {
                gradePoints = 4.0;
            } else if (score >= 80) {
                gradePoints = 3.0;
            } else if (score >= 70) {
                gradePoints = 2.0;
            } else if (score >= 60) {
                gradePoints = 1.0;
            } else {
                gradePoints = 0.0;
            }

            // Assuming each course has equal weight (credit units)
            totalGradePoints += gradePoints;
            totalCreditUnits += 1; // Assuming each course has 1 credit unit
        }

        // Calculate CGPA
        double cgpa = totalGradePoints / totalCreditUnits;

        // Output
        System.out.println("Hello " + name + ", your CGPA is: " + cgpa);

        // Close the Scanner object
        scanner.close();
}
}
