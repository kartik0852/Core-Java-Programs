package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nm[] = new String[2];                 //Single Dimensional Array
		
		Scanner sc =new Scanner(System.in);
		for (int i=0;i<2;i++)
		{
			nm[i] = sc.next() + " - CTH";
		}
		for(String var:nm) {
			System.out.println(var); //It store the value from nm variable
		}
		
		float n=3.3f;
		int cnt = 0;
		int sum = 0;
		
		int ar[]= {1,2,3,4,5,6,7,8,9};
		float w[]= {1.1f,2.2f,3.3f,4.4f,3.3f,50.5f};     //Give array
		
	
		for (int i=0;i<w.length;i++)                       //Find  to count of repeated elements in array 
		{  
			sum += w[i];                                  // it gives sum of array
			
			if(w[i] == n)                                 // It means if Value of i = value of n so increment the value of counter unless we find duplicate elements     
				cnt++;
		}
		double avg = sum/(float)w.length;                   //It give average of the given array or user input array
		System.out.println("Duplicate values count : "+cnt+"\n");   
		System.out.println("Average of array : "+avg+"\n");
		System.out.println("Array 1 = "+Arrays.toString(w)+"\n");
		
		Arrays.sort(w); // Sorting elements in array  smaller to greater
		System.out.println("Array 1 after sorting elements = "+Arrays.toString(w)+"\n");
		
		int min=ar[0];
		float mini=w[0];
		
		for (int varelement : ar) {  //Method to find the minimum value from the array
			if(min>varelement) {
				min=varelement;
			}
		}
		
		for (float minvalue: w) {  //Method to find the minimum value from the array
			if(mini>minvalue) {
				mini=minvalue;
			}
		}
		System.out.println("Min value of w[] array = "+mini+"\n");
		System.out.println(Arrays.toString(ar)+"\n");
		System.out.println("Min value of arr[]  array = "+min+"\n"); //Find Minimum Value from the array

	}

}
