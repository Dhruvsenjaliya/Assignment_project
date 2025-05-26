package Module_6_Core_Java;
/*
 *    * * * * 1 * * * *
 *    * * * 2 * 2 * * *
 *    * * 3 * 3 * 3 * *   (*) means space
 *    * 4 * 4 * 4 * 4 *
 *    5 * 5 * 5 * 5 * 5 
 * 
 */

public class Pattern_Peramid {
	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			for (int k = 4; k>=i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		
	}

}
