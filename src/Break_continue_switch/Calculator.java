package Break_continue_switch;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Select 1 for Addition!");
		System.out.println("Select 2 for Subtraction!");
		System.out.println("Select 3 for Multiplication!");
		System.out.println("Select 4 for Division!");

		int cal, a, b, c;

		do {
			cal = sc.nextInt();
			switch (cal) {
			case 1:
				System.out.print("Enter the value of a = ");
				a = sc.nextInt();

				System.out.print("Enter the value of b = ");
				b = sc.nextInt();

				c = a + b;
				System.out.println("Sum of a + b = " + c+"\n");
				break;

			case 2:
				System.out.print("Enter the value of a = ");
				a = sc.nextInt();

				System.out.print("Enter the value of b = ");
				b = sc.nextInt();

				c = a - b;
				System.out.println("Substration of a - b = " + c+"\n");
				break;

			case 3:
				System.out.print("Enter the value of a = ");
				a = sc.nextInt();

				System.out.print("Enter the value of b = ");
				b = sc.nextInt();

				c = a * b;
				System.out.println("Multiplication of a * b = " + c+"\n");

				break;

			case 4:
				System.out.print("Enter the value of a = ");
				a = sc.nextInt();

				System.out.print("Enter the value of b = ");
				b = sc.nextInt();

				c = a / b;
				System.out.println("Division of a / b = " + c+"\n");

				break;

			default:
				System.out.println("You Chose wrong no, Select from (1,2,3,4)!!");
				break;
			}
		} while (cal != 5);

	}

}
