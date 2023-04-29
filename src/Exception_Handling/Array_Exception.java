package Exception_Handling;

public class Array_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= new int[5];
		a[4] = 3;
		
		try {
		a[6] = 5;						//In try block only Exception thrown method enclosed and there is no any other statement work
		System.out.println("Hello");    //So this line is  unreachable               
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.err.println(e);		//It print the which type of error is thrown it helps to find out what type of error is coming
		}
		
		for(int var:a) {
		System.out.println(var);
		}
		System.out.println();
		
	}

}
