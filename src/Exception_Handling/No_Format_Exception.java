package Exception_Handling;

//NUMBER FORMAT EXCEPTION
public class No_Format_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s = "0987654321";
	String a = "Kartik";
			
	try {
		System.out.println(Integer.parseInt(a));
	}
	
	catch(NumberFormatException e){
		e.printStackTrace();					//printStackTrace() will pinpoint the exact line in which the method raised the exception.
		System.out.println("Exception is handled....Rest of code is execute without any disturbance");
	}
	System.out.println(Integer.parseInt(s));
		

	}

}
