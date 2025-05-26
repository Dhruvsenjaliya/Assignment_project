package Module_6_Core_Java;

public class SecondLargest {
	public static void main(String[] args) {
        int[] numbers = {10, 25, 35, 15, 50, 45};

        // Check if array has at least two elements
        if (numbers.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find largest and second largest
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements may be equal).");
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }
    }
}


