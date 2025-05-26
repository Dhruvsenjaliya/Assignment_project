package Module_6_Core_Java;

import java.util.Iterator;
import java.util.Scanner;

/*
 * WAP to find the maximum and minimum value of an array. 
 */
public class Find_Min_Max_Value_Of_Arrey {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input Arrey Size :");
		int n=sc.nextInt();
		
		int [] arr= new int[n];
		
		System.out.println("Enter "+n+" Elements :");
		
		for (int i = 0; i < n; i++) {
			System.out.println("Element "+(i+1)+ ": ");
			arr[i]=sc.nextInt();
		}
			
			int max =arr[0];
			int min = arr[0];
			
			for (int i = 1; i < n; i++) {
				if (arr[i]>max) {
					max=arr[i];
				}
				if (arr[i]<min) {
					min=arr[i];
				}
			}
			System.out.println("Maximum Value : "+max);
			System.out.println("Minimum Value : "+min);
			}
		
		
		
	}


