package Array;

//Program to copy all elements of one array into another array

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[4];
		int b[] = new int[4];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array --> ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		
		System.out.println("Elements of original array: "); //Printing elements using for loop
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		System.out.println("Elements of Copied array: ");
		for(int i =0;i<a.length;i++) {
			System.out.println(b[i]);
		}
		
		System.out.println();
		System.out.println("Original Array: "+Arrays.toString(a));	//Printing an array using ".to string method"
		System.out.println("Copied Array: "+Arrays.toString(b));
	}

}
