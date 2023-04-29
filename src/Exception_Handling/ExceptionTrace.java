package Exception_Handling;

import java.util.Scanner;

public class ExceptionTrace {
	
	
	void f2() {
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void f1() {
		
		f2();
	}

	public static void main(String[] args) {
		ExceptionTrace ob = new ExceptionTrace();
		
		// TODO Auto-generated method stub
		ob.f1();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter here = "+sc.next()+" "+sc.next());
		

	}

}
