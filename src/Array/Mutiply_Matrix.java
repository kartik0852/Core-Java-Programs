package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Mutiply_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Matrix elements:");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("Enter 2nd Matrix elements:");
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j]=sc.nextInt();
				
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("Multiplication of two matrix:\n");
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int k = 0; k < c[i].length; k++) {
					c[i][j] += a[i][k]*b[k][j];                           //Here we Multiply two Matrix (Matrix-a X Matrix b) And the output store in Matrix -c
				}

				
			}
		}
		
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
			
		}
		/*
		 * System.out.println(Arrays.toString(c[0]));
		 * System.out.println(Arrays.toString(c[1]));
		 * System.out.println(Arrays.toString(c[2]));
		 */
	}

}
