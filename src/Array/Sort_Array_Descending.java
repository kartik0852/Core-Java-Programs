package Array;

import java.util.Scanner;

public class Sort_Array_Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[10];
		int temp=0;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter elements of an array: ");
		for(int i = 0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.print("Original Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		//Sort the array in descending
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.print("Array after sorting in Descending order: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
