package Module_6_Core_Java;

public class Sum_Of_100_Prime_Numbers {
	public static void main(String[] args) {
		
		int Flag=1;
		  int j;
		  int count=0; 
				int sum=0;
		  for (j = 2; j <=1000; j++) {
			Flag=1;
			for (int i = 2; i < j; i++) {
			  if (j%i == 0) {
			 Flag=0;
			  }
		}	
			if (Flag == 1) {
				System.out.println(j);
				sum += j;
				count++;
				 
			}		
				if  (count ==100) {
					break;
				}		
				}
		  System.out.println("sum of first 100 prime number is :"+sum);
	        }
			}