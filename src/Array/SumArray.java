package Array;

//Java Program to print the sum of all the items of the array

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter elements in array-->");
		for(int i = 0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0;i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println("Sum of an array: "+sum);
	}

}
