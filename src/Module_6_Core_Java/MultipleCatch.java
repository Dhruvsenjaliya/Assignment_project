package Module_6_Core_Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input two numbers
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Division that may throw ArithmeticException
            int result = numerator / denominator;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // Catch block for divide by zero
            System.out.println("Error: Cannot divide by zero.");
            
        } catch (InputMismatchException e) {
            // Catch block for wrong input type
            System.out.println("Error: Please enter valid integers.");
            
        } catch (Exception e) {
            // General catch block for any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("Program continues after multiple catch blocks.");
	}
}
