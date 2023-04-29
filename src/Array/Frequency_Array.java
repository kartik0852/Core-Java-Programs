package Array;

//Program to find the frequency of each element in the array

import java.util.Scanner;

public class Frequency_Array {
	
	int a[] = new int[10];
	int i,key;
	
	void getdata() {	//Creating method to take input from user
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element: ");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the no to find frequency: ");
		key=sc.nextInt();
	}
	
	void disp() {
		
		int count = 0;
		
		for(i=0;i<a.length;i++) {
			if(a[i]==key)
				count++;
		}
		System.out.println("Frequency of "+key+ " is: "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frequency_Array f = new Frequency_Array();
		f.getdata();
		f.disp();
	}

}
