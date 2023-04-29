package Array;

//Program to find the frequency of each element in the array

import java.util.Scanner;

public class Frequency_Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[] {1,2,3,1,2,3,1,2,3,1};
		
		int fr[] = new int[a.length];
		
		int visited = -1;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter elements in array: ");
		for(int i = 0;i<a.length;i++) {
			//a[i]=sc.nextInt();
			int count =0;
			for(int j= i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited)
				fr[i] = count;
		}
		
		System.out.println("------------------------");
		System.out.println("Element  |  Frequency");
		System.out.println("------------------------");
		
		for(int i = 0;i<a.length;i++) {
			if(fr[i]!=visited)
				System.out.println("    "+a[i]+"    |    "+fr[i]);
				
		}
		
		System.out.println("------------------------");

	}

}
