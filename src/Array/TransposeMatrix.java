package Array;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[3][3];
		int trans[][] = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements of a 3X3 matrix:");
		
		for (int i = 0; i < a.length; i++) {                    //Here we creating and store the value from user 3X3 Matrix 
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]= sc.nextInt();
			}
			
		}
		
		/*
		 * //Generating transpose of "a" matrix for(int i = 0; i < trans.length; i++) {
		 * for (int j = 0; j < trans[i].length; j++) { trans[i][j] = a[i][j]; }
		 * 
		 * }
		 */
		
		System.out.println("Before Transpose\n");             // Here we creating a logic to show output of our matrix elements
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		
		//Printing transpose matrix
		System.out.println("After Transpose\n");
		for (int i = 0; i < trans.length; i++) {
			for (int j = 0; j < trans[i].length; j++) {
				System.out.print(a[j][i]+" ");          //Here we change the index to each other (in place of "i" we put "j" and in place of "j" we put "i") so the output give us the TRANSPOSE of a matrix
			}
			System.out.println("\n");
		}
		

	}

}
