package Module_6_Core_Java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
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
	}
}