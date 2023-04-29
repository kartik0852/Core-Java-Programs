package college;

import java.util.Scanner;

public class clgData {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		clg c;
		Scanner sc = new Scanner(System.in);
		clgImpl ci = new clgImpl();
		do {
		c = new clg(sc.nextInt(),sc.next());
		clg c1=null;
		try {
			c1 = ci.add(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c1.disp();
		}while(ci.equals(ci));
	}

}
