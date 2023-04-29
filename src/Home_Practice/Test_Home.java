package Home_Practice;

import java.util.Scanner;

public class Test_Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book bk;
		Book_Implements bi = new Book_Implements();
		bk =new Book(sc.nextInt(),sc.next());
		//bk = bi.addBookname(bk);
		bk.disp();
	}

}
