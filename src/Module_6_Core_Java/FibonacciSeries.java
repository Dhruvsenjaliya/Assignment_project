package Module_6_Core_Java;

import java.util.Scanner;

public class FibonacciSeries {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user how many terms to display
	        System.out.print("Enter the number of terms for Fibonacci series: ");
	        int n = scanner.nextInt();

	        // First two terms
	        int first = 0;
	        int second = 1;

	        System.out.println("Fibonacci Series up to " + n + " terms:");

	        if (n <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else if (n == 1) {
	            System.out.print(first);
	        } else {
	            System.out.print(first + " " + second + " ");

	            // Generate remaining terms
	            for (int i = 3; i <= n; i++) {
	                int next = first + second;
	                System.out.print(next + " ");
	                first = second;
	                second = next;
	            }
	        }
	 }
}


