package Module_6_Core_Java;
/*
 * WAP to sum values of an array.
 */

public class Arrey_Sum {
	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		
		int sum=0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum+=numbers[i];
		
	}
	
System.out.println("sum of Arrey is :"+sum);
}
}