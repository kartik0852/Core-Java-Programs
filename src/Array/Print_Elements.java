package Array;

import java.util.Scanner;

public class Print_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initial Array
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements: ");
		for(int i = 0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		//Loop through the array by incrementing value of i
		System.out.print("Elements of array: ");
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
