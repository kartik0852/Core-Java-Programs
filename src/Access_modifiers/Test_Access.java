package Access_modifiers;

public class Test_Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		TestAccess ta = new TestAccess();                //Here we "ACCESS OBJECT" from the other class but "SAME PACKAGE" and pass the new values and displayed
		
		//ta.a=10										 //In Other class "a is Private" that's why it ACCESS the value in SAME CLASS not any OTHER CLASS 
		ta.b=10;                                         //In Other class "b is Public"
		ta.c=20;										 //In Other class "c is protected"
		ta.d=30;										 //In Other class "d is Default"
		ta.disp();										 //In  other class "display is Public" if we change disp public to private so it also not access in other classes  
		
	}

}
