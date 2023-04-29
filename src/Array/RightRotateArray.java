package Array;

//Program to left rotate the elements of an array

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize Array
		int a[] = new int [10];
		
		//n determine the number of times an array should be rotated
		int n;
		
		Scanner sc = new Scanner(System.in);
		//Store Elements in array
		System.out.println("Enter elements in array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		//Printing Original array
		System.out.print("Original Array: ");
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		
		//Rotate the given array by n times towards left
		System.out.println();
		System.out.print("Enter value of n: ");
		n=sc.nextInt();
		for(int i = 0;i<n;i++) {
			int j,last;
			
			//Store first element of the array
			last=a[a.length-1];
			for(j=a.length-1;j>0;j--) {
				
				//Shift element of array by one
				a[j]=a[j-1];
			}
			
			//First element of array will be added to the end
			a[j]=last;
		}
		System.out.println();
		
		//Display resulting array after rotation
		
		System.out.print("Array after right rotation: ");
		for(int i = 0;i<a.length;i++) {
			//System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		
	}

}
