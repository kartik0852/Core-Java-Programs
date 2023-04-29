package Array;

//Program to print the elements of an array in reverse order

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements of array: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		//Printing elements of array
		System.out.print("Original Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Array after reverse order: ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
		
	}

}
