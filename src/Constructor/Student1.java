//Default Constructor 
//It is initialize automatically whenever we creating an object and it prints the default values

package Constructor;

public class Student1 {

	int id;
	String name;

	//method to print the value of id and name 
	void print() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s = new Student1(); //Creating Objects
		
		//Printing values of the object  
		s.print(); //object print
	}

}
