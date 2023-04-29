package Loops;

import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); //Use scanner to take user input
		
		System.out.println("Choose no b/w 1 to 3");
		int clgyr;
		String branches;
		
		do {                                             //Starting of DO WHILE LOOP , it iterate a part of program repeatedly until the specified condition is true
			clgyr = sc.nextInt();
		switch (clgyr) {                                 //Starting switch case , It execute one statement from multiple conditions
		case 1:                                          //Here using "Cases" to write multiple statements
			
			System.out.println("Welcome 1st Year");
			System.out.println("Select Brranch CSE OR ME");
			
			branches = sc.next();                       // Here we execute nested switch or another switch statement in "Case 1".
			switch(branches){
			case "CSE":
				System.out.println("Welcome to Computer Science Engineering branch");
				break;
			case "ME":
				System.out.println("It is a Mechanical Engineering branch");
				break;
			default:
				System.out.println("Wrong Choice Please choose b/w Cse or ME");
			}
			break;
		case 2: 
			System.out.println("2nd Year");
			break;
		case 3:
			System.out.println("3rd Year");
			break;
		default:
			System.out.println("Wrong choice"+clgyr);
			break;
		}
	}while(clgyr!=4);                                   //Ending of DoWhile Loop , Here in "while" we pass the condition.

}
}
