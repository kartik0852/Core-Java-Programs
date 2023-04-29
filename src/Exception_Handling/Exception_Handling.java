package Exception_Handling;

public class Exception_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		try {
			System.out.println(s=10/0);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Hello World");
		}
		
		System.out.println("Hello India");
		

	}

}
