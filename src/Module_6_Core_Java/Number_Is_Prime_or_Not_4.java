package Module_6_Core_Java;

import java.util.Scanner;

public class Number_Is_Prime_or_Not_4 {
	public static void main(String[] args) {
		int n=1;
		int count = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		n=sc.nextInt();	
		
	
		int i=1;
		
		while (i <= n) {
			if (n % i == 0) {
				count=count+1;
			}	
			i=i+1;
		}
		
		if (count == 2) {
			System.out.println("Number is Prime");
			
		} else {
			System.out.println("Number is not a prime");
		}
		}
	}

		
	
		
		
