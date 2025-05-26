package Module_6_Core_Java;

import java.util.Scanner;

public class GradeCalc {
	public static void displayGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade: AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade: BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade: BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade: CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade: DD");
        } else if (marks >= 0 && marks <= 40) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        }
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
        // Ask user to enter marks
        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        // Call method to display grade
        displayGrade(marks);
        
        } catch (Exception e) {
			System.out.println("Invalid input! Please enter numeric marks only.");
		}
        }
        }

