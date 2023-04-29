package Array;

import java.util.Scanner;

public class IdenticalMetrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[3][3];

		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==j)
					System.out.print("1");
				else
					System.out.print("0");
				
			}
			System.out.println();
			
		}
	}

}
