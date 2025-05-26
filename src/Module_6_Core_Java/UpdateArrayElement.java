package Module_6_Core_Java;

import java.util.Scanner;

public class UpdateArrayElement {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define and initialize the array
        int[] numbers = {10, 20, 30, 40, 50};

        // Display original array using traditional for loop
        System.out.println("Original Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // Ask user for index and new value
        System.out.print("Enter the index (0 to " + (numbers.length - 1) + ") to update: ");
        int index = scanner.nextInt();

        // Validate index
        if (index < 0 || index >= numbers.length) {
            System.out.println("Invalid index! Please run the program again.");
        } else {
            System.out.print("Enter the new value: ");
            int newValue = scanner.nextInt();

            // Update the array
            numbers[index] = newValue;

            // Display updated array
            System.out.println("Updated Array:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
	}
}


