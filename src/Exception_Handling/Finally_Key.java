package Exception_Handling;

public class Finally_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * try { System.out.println(10/0); } finally {
		 * System.out.println("Rest code will executed!!"); }
		 */
		
		
		  try 
		  { 
			  int data =25/0; System.out.println(data); 
			  } 
		  catch(ArithmeticException e) 
		  { 
			  e.printStackTrace(); 
		  } 
		  
		  //It will executed whether an exception is handle or not
		  finally {
		  System.out.println("Rest code the code....."); }
		  
		  System.out.println("All code executed!!");
		 
		
		/*
		 * try { throw new ArithmeticException("10 is not divide by 0..... "); }
		 * catch(ArithmeticException e) { e.printStackTrace(); }
		 * System.out.println("Rest of code..");
		 */
		
	}

}
