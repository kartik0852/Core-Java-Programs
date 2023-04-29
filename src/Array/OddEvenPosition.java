package Array;

//Program to print the elements of an array present on even and odd position

import java.util.Scanner;

public class OddEvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements in array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		//Elements of array present on odd position
		System.out.println();
		System.out.print("Elements of array present on odd position: ");
		for(int i=0;i<a.length;i=i+2) {
			System.out.print(a[i]+" ");
		}
		
		//Elements of array present on even position
		System.out.println();
		System.out.print("Elements of array present on even positon: ");
		for(int i=1;i<a.length;i=i+2) {
			System.out.print(a[i]+" ");
		}
		
		
	}

}
