package Basic_Programs;


//Fibonacci Series program take input from user.
import java.util.Scanner;

public class Fibonacci_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3,count;	//Create a local variable
		
		Scanner sc = new Scanner(System.in);	//Create a object of Scanner to take input from user
		System.out.print("Enter coount = ");
		count = sc.nextInt();
		
		System.out.print("Enter First no of fibonacci series = ");
		n1=sc.nextInt();
		System.out.print("Enter Second no of fibonacci series = ");
		n2=sc.nextInt();
		
		System.out.print("Fibonacci Series of "+count+" is : ");
		System.out.print(n1+" "+n2);
		
		for(int i = 0;i<=count;i++) {	
			n3=n1+n2;
			
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
		}
		
		
	}

}
