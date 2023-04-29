//Parameterized Constructor

package Constructor;

public class Student2{  
	
	int id;  
	String name;
	
	//Creating Parameterized constructor
	Student2(int i, String n){
		id = i;
		name = n;
	}
	
	//method to print the value of id and name  
	void print(){System.out.println(id+" "+name);}  
	  
	public static void main(String args[]){  
		
	//creating objects  and passing values
	Student2 s1=new Student2(1001,"Kartik");  
	Student2 s2=new Student2(1002,"Singh");
	
	//Calling method to printing values of the object  
	s1.print();  
	s2.print();  
	}  
	}  