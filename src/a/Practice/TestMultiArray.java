package a.Practice;

//Use long -  Data type
//Implicit Type Casting
//Explicit Type Casting
//Find Average of an given array
//Find Minimum value in array

public class TestMultiArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {9,8,6};
		int sum =0;
		for(int i =0;i<ar.length;i++) {
			sum += ar[i];
			
		}
		
		long n =5; // here in LHS we have taken long == which is of bigger range can occupy small range data  == Implicit type casting
		System.out.println(n);
		// Array +  Explicit type casting int/int = int but in maths it is float how to get in float 
		// we need to type cast
		System.out.println("here length:"+(float)ar.length); 	//Type cast int to float
		float avg= sum/(float)ar.length;
		System.out.println("here avg:"+avg);
		
		//For getting the minimum value from given array --
		int min=ar[0];
		
		for (int varelement : ar) {
			if (min>varelement) {
				min=varelement;
			}
		}
		
		System.out.println("min is:"+min);
	}

}
