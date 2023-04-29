package Custom_Exception;

import java.util.Scanner;

public class Test_Custom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestImpl ti = new TestImpl();
		Scanner sc = new Scanner(System.in);
		int choice;
		Test t;
		
		do {
			System.out.println("Enter your choice no. = ");
			choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter id and name = ");
				t=new Test(sc.nextInt(), sc.next());
				Test tmp = null;
				try {
				tmp = ti.addTest(t);
				}
				catch(TestException e) {
					e.printStackTrace();
				}
				System.out.println(tmp);
				break;
				
			}
			
		}while(choice!=2);
	}

}
