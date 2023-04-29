 package Loops;

public class TestForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Printing counting 1 to 10 using for loop
		for(int i=1; i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("*************************");
		
		//Printing Table of 3 using for loop
		for(int i=3; i<=3;i = i+3) {
			for(int j=1;j<=10;j++)
			System.out.println(i+" X "+j+" = "+(i*j));
		}
		System.out.println("*************************");
		
		//Printing Table 2, 4 and 6 but in this we use "Break" and 'Continue' and print table 2 up to 10 and table 4,6 up to 8 using if condition 
		for(int i = 2; i<= 6;i = i+2) {
			for(int j=1;j<=10;j++) {
				if((i==4 && j>8)||(i==6 && j>8)) {
					break;
				}
				if(j==7)
					continue;
				System.out.println(i+" X "+j+" = "+(i*j));
			}
		System.out.println("*************************");
		}
	}
}
