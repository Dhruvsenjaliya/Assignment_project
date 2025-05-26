package Module_6_Core_Java;
/*
 *       *
 *      * *
 *     * * *
 *    * * * *
 *   * * * * *
 *    * * * *
 *     * * *
 *      * *
 *       *
 */

import java.util.Iterator;

public class Diamond_Shape_Pattern_Using_Star {
	public static void main(String[] args) {
		
		
	 for (int i = 1; i <=5; i++) {
		 for (int k = 5; k >=i; k--) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print("* ");
			
		}
		System.out.println();
	}
	for (int i = 1; i <=5; i++) {
		for (int k = 0; k <=i; k++) {
			System.out.print(" ");
		}
		for (int j = 0; j <5-i; j++) {
			System.out.print("* ");
			
		}
		System.out.println();
	}	
	}

}
