package Exception_Handling;

//NULL POINTER EXCEPTION
public class Null_Pointer_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = null;				//So here it give Null Pointer Exception because the value of string is null....
										//so if we find the length of string so it give an exception and it is know as NULL POINTER EXCEPTION....
		
		//Therefore here we use try and catch block
		try {
			System.out.println(s.length());
		} 
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello World");
		
	}

}
