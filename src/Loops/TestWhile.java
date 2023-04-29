package Loops;

import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("ENter the digit = ");
		
		n= sc.nextInt();
		
		while(n>0) {
		
			sum += n%10;
			n=n/10;
			
		}
		System.out.println("Sum is = "+sum);

	}

}
