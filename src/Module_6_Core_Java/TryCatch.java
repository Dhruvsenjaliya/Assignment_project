package Module_6_Core_Java;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

        try {
            // Input two numbers
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();

            // Division operation that may throw an exception
            int result = numerator / denominator;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch block to handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues after try-catch block.");
	}
}
