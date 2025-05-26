package Module_6_Core_Java;


import java.util.Scanner;

/*
 * WAP to calculate the average value of array elements.
 */
public class Average_of_Arrey_Elements {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr number of elements :");
		int n=sc.nextInt();
		
		double []arr = new double[n];
		double sum =0;
		
	System.out.println("Enter " +n+ " elements :");
	
		for (int i = 0; i <n; i++) {
			System.out.println("Elements"+(i+1)+ ":");
			
			arr[i]=sc.nextDouble();
			sum += arr[i];
			
		}
		
		double average= sum/n;
		System.out.println("Average value of elements is :"+average);
	}

}
