package Module_6_Core_Java;

import java.util.Iterator;
import java.util.Scanner;

public class Find_Factorial_of_Number {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=scanner.nextInt();
		
		
		long factorial=1;
		
		
		for (int i = 1; i <=num; i++) {
			factorial *= i;
		}
			System.out.println("Factorial of "+num + " value is :"+factorial);
		}
		
		
	}


