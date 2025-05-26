package Module_6_Core_Java;

import java.util.Iterator;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class Find_ArrayElementOfIndex {
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 
		 
		 //input array size
		 System.out.println("Enter the size of Arrey :");
		 int size=scanner.nextInt();
		 int[]array=new int[size];
		 
		 
		 //input array elements
		 System.out.println("Enter the Elements of Array :");
		 for (int i = 0; i <size; i++) {
			 array[i]=scanner.nextInt();	
			}
			 
			 //input Element to find
			 System.out.print("Enter Element to find it's indenx : ");
			 int element=scanner.nextInt();
			 
			 //search for the element
			 int index= -1;
			 for (int i = 0; i < size; i++) {
		            if (array[i] == element) {
		                index = i;
		                break; 
		            }
		        }
			 // Output result
		        if (index != -1) {
		            System.out.println("Element found at index: " + index);
		        } else {
		            System.out.println("Element not found in the array.");
		        }
			
		}
		 
		 
	}


