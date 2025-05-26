package Module_6_Core_Java;

public class CopyArray {
	 public static void main(String[] args) {
	        // Original array
	        int[] originalArray = {10, 20, 30, 40, 50};

	        // Create a new array of the same size
	        int[] copiedArray = new int[originalArray.length];

	        // Copy elements using traditional for loop
	        for (int i = 0; i < originalArray.length; i++) {
	            copiedArray[i] = originalArray[i];
	        }

	        // Display original array
	        System.out.println("Original Array:");
	        for (int i = 0; i < originalArray.length; i++) {
	            System.out.print(originalArray[i] + " ");
	        }

	        System.out.println();

	        // Display copied array
	        System.out.println("Copied Array:");
	        for (int i = 0; i < copiedArray.length; i++) {
	            System.out.print(copiedArray[i] + " ");
	        }
	    }
	}

