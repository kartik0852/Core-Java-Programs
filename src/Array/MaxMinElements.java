package Array;

//Program to print the max and min element present in an array

import java.util.Scanner;

public class MaxMinElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find max elements in the array
		//Initialize array
		int a[] = new int[10];
		
		//Initialize max with first elements of array
		int max = a[0];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println();
		
		
		  //Loop through the array 
		for(int i=0;i<a.length;i++) { 
			if(a[i]>max) 
				max = a[i]; 
		} 
		System.out.print("Max Element present in the array: "+max);
		 
		
		//Find the minimum array in the array

		int min = a[0];
		//Loop through the array
		for(int i=0;i<a.length;i++) {
			if(min > a[i])
				min = a[i];
		}
		System.out.print("Small Element present in the array: "+min);
		
		

	}

}
