package If_else;

import java.util.Scanner;

//user input via Scanner class
//conditional statement if-else-ladder
//iteration statement for,while,do while
public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("number is even:" + num);
		} else {
			System.out.println("num is odd:" + num);
		}
		
		for (int i =2;i<=6;i=i+2) {
			for (int j = 1; j <=10; j++) {
				if ((i==4&&j>=8)||(i==6&&j>=8)) {
					break; 
				}
				if (j==7) {
					continue; //Skip the value of 7 and continue the loops
				}
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println("****************************");
		}

	}

}
