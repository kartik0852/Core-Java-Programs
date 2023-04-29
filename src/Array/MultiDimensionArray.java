package Array;

import java.util.Scanner;
import java.util.Arrays;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][4];                   //Creating an array and we store the length of array is 3

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter elements in array: ");
		for (int i = 0; i < a.length; i++) {           //Here we creating and store the value from user 3X3 Matrix 
			for (int j = 0; j < a[i].length; j++) {   // Here we use "a[i].length show it takes columns of 1st row and we assign 3 columns in array
				a[i][j] = sc.nextInt();

			}

		}
		for (int i = 0; i < 3; i++) {                // Here we creating a logic to show output of our matrix elements
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " ");     //Here we use "print" not "println" because if we use println then the cursor goes to next line but if we use only print then it print just next to the element
			}
			System.out.println();

		}

		System.out.println(Arrays.toString(a[1]));    //If we use "Arrays.toString" and we pass the value "a[0]" so It print the first row of matrix or multidimensional array 
	}

}