package Module_6_Core_Java;

import java.util.Scanner;

public class Check_Given_Number_Armstrong_Number {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a number :");
		int num=sc.nextInt();
		
		int originalNumber = num;
        int result = 0;

        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, 3);  
            num /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
		}
		
	}


