package Module_6_Core_Java;

public class ReverseArray {
	 public static void main(String[] args) {
	        // Define and initialize the array
	        int[] numbers = {10, 20, 30, 40, 50};

	        // Display original array
	        System.out.println("Original Array:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i] + " ");
	        }

	        System.out.println();

	        // Reverse the array in-place
	        int start = 0;
	        int end = numbers.length - 1;
	        while (start < end) {
	            // Swap elements at start and end
	            int temp = numbers[start];
	            numbers[start] = numbers[end];
	            numbers[end] = temp;

	            // Move pointers
	            start++;
	            end--;
	        }

	        // Display reversed array
	        System.out.println("Reversed Array:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	    }
	}


