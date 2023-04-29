package Array;

//Program to print the duplicate elements of an array

import java.util.Scanner;

public class Duplicate_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);

		//Input the elements of the array
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		//Search for duplicate elements
		System.out.println("Duplicate elements are: ");
		for(int i=0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]==a[j])
					System.out.println(a[j]);
			}
		}
	} 
}