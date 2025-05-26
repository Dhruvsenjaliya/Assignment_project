package Module_6_Core_Java;

import java.util.Scanner;

public class CompaireStrings {
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);

	        // Input first string
	        System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();

	        // Input second string
	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();

	        // Compare using equals() - content comparison
	        if (str1.equals(str2)) {
	            System.out.println("Both strings are equal (using equals()).");
	        } else {
	            System.out.println("Strings are not equal (using equals()).");
	        }

	        // Compare == - reference comparison
	        if (str1 == str2) {
	            System.out.println("Both strings are the same object (using ==).");
	        } else {
	            System.out.println("Strings are different objects (using ==).");
	        }
	}

}
