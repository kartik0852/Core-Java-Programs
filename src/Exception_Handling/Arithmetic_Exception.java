package Exception_Handling;
//Arithmetic Exception
//Exception Handling using try and catch block......
public class Arithmetic_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int d = 10/0; */								//So here it is showing an exception so the rest of code is not executed......
		
		
		
		//We can use "try - catch block" to execute the rest of code after the exception is occur.....
		try {
			int d = 10/0;
			System.out.println("Hello World");
		} 
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}									
		System.out.println("Rest of code!!!");

		
		//Null pointer Exception
		
		
		
	}

}
