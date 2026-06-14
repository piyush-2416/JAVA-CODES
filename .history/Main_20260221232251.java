import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered!");
        } 
        else {
            System.out.println("\nStudent Name: " + name);
            System.out.println("Marks: " + marks);

            // Result Check
            if (marks >= 33) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }

            // Grade Check
            if (marks >= 90) {
                System.out.println("Grade: A+");
            } 
            else if (marks >= 80) {
                System.out.println("Grade: A");
            } 
            else if (marks >= 70) {
                System.out.println("Grade: B");
            } 
            else if (marks >= 60) {
                System.out.println("Grade: C");
            } 
            else if (marks >= 50) {
                System.out.println("Grade: D");
            } 
            else if (marks >= 33) {
                System.out.println("Grade: E");
            } 
            else {
                System.out.println("Grade: F");
            }

            // Division Check
            if (marks >= 60) {
                System.out.println("Division: First Division");
            } 
            else if (marks >= 45) {
                System.out.println("Division: Second Division");
            } 
            else if (marks >= 33) {
                System.out.println("Division: Third Division");
            } 
            else {
                System.out.println("No Division");
            }

            // Scholarship Check
            if (marks >= 85) {
                System.out.println("Congratulations! You got a Scholarship 🎉");
            } 
            else {
                System.out.println("No Scholarship");
            }
        }

        sc.close();
    }
}