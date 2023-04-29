package Exception_Handling;

public class Throw_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		throw new ArithmeticException("10/0");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		System.out.println("Hey Flow of is continue...");

	}

}
