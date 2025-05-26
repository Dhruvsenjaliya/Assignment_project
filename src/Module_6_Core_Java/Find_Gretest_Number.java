package Module_6_Core_Java;

import java.util.Scanner;

public class Find_Gretest_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second Number :");
		int num2=sc.nextInt();
		
		System.out.println("Enter Third Number :");
		int num3=sc.nextInt();
		
		
		if (num1>num2) {
			System.out.println("Gretest Number is :"+num1);
		
		} else if (num2>num3) {
		System.out.println("Gretest Number is :"+num2);
				
			} else {
				System.out.println("Gretest Number is :"+num3);

	
			}
	}
}
		
		



