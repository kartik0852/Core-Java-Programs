package If_else;

import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		//Printing +ve and -ve no using if else condition
		if(n>0)
			System.out.println("No is Positive = "+n);
		else if(n<0)
			System.out.println("No is Negative = "+n);
		else 
			System.out.println("No is Zero = "+n);
		
		
		//Printing odd and even no using if else condition
		if(n%2==0)
			System.out.println("No is even = "+n);
		else
			System.out.println("No is odd = "+n);
	}

}
