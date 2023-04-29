package Break_continue_switch;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose no b/w 1 to 3");
		int clgyr;

		clgyr = sc.nextInt();
		switch (clgyr) {                                  //Starting switch case , It execute one statement from multiple conditions
		case 1:                                           //Here using "Cases" to write multiple statements
			
			System.out.println("Welcome to 1st Year");
			break;
		case 2: 
			System.out.println("Welcome to 2nd Year");
			break;
		case 3:
			System.out.println("Welcome 3rd Year");
			break;
		case 4:
			System.out.println("Welcome 4th Year");
			break;      
		default:                                          //It is use bcz if the statement is not in the switch or we enter wrong choice so it shows the You select wrong choice 
			System.out.println("Wrong choice"+clgyr);
			break;
		}
}
}
