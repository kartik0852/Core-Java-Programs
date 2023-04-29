package Array;

import java.util.Scanner;

public class SumAvgOfArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg1 = sum/a.length;
		System.out.println(avg1);
	}

}
