package String_Methods;

import java.util.Scanner;

public class ReverseStringChar {

	public static void main(String args[]) {
		
		String s = "Java is platform independent, roburst and pltform independnt";
		String a[] = s.split("");
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter elements of array: "); for(int i=0;i<a.length;i++)
		 * { a[i] = sc.next(); }
		 */
		
		//Printing elements of array
		System.out.print("Original Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.print("Array after reverse order: ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+"");
		}
		
	}
}
