package Collection;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a Vector
		Vector<String> v = new Vector<String>();
		
		//Adding elements using add() method of List
		v.add("Java");
		v.add("Is");
		v.add("Platform");
		v.add("Independent");
		
		//Adding elements using addElement() method of Vector
		v.addElement("Rbust");
		v.addElement("and");
		v.addElement("Secure");
		
		System.out.println("Elements are : "+v);
		
	}

}
