package Array;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,r1,r2,c1,c2;
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int sum[][]=new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows and columns of 1st Matrix= ");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		
		System.out.println("Enter elements of 1st Matrix: ");
		for (i = 0; i < r1; i++) {
			for (j = 0; j < c1; j++) {
				a[i][j]=sc.nextInt();
				
			}
			
		}
		
		System.out.println("Enter rows and columns of 2nd Matrix= ");
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		
		System.out.println("Enter elements of 2nd Matrix: ");
		for (i = 0; i < r2; i++) {
			for (j = 0; j < c2; j++) {
				b[i][j]=sc.nextInt();
				
			}
			
		}
		
		System.out.println("Sum of two matrix is: ");
		for (i = 0; i < r2; i++) {
			for (j = 0; j < c2; j++) {
				//sum[i][j] = sum[i][j]+a[i][j]+b[i][j];            L1              //For sum we add array-a and array-b
				
							//Or
				sum[i][j] += a[i][j]+b[i][j];                       //L2      (L1,L2 Both work same , there is two expression for +,-,*,/  
				
				System.out.print(sum[i][j]+" ");
				
			}
			System.out.println();
			
		}
	}

}
