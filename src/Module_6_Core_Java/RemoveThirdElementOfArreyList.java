package Module_6_Core_Java;

import java.util.ArrayList;

public class RemoveThirdElementOfArreyList {
	public static void main(String[] args) {
        // Create an ArrayList
        ArrayList fruits = new ArrayList();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Iterating using for-each loop:");
        System.out.println(fruits);
        
        
        fruits.remove(3);
        System.out.println("Iterating using for-each loop:");
        System.out.println(fruits);
	}
}

