package a.Practice;

import java.util.Scanner;

public class OddEven {

	public void oddEven(int a) {
		if(a % 2==0) {
			System.out.println("No is Even"+a);
		}
		else {
			System.out.println("No is odd"+a);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OddEven a = new OddEven();
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		
		a.oddEven(num);
	}
}
