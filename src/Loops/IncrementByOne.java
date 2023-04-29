package Loops;

import java.util.Scanner;

public class IncrementByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t,n;
		System.out.print("Enter length of t : ");
		t= sc.nextInt();
		
		System.out.println("Enter numbers : ");
		
		for(int i=0;i<t;i++) {
			n=sc.nextInt();
			System.out.println(n+1);
		}
	
	}

}
