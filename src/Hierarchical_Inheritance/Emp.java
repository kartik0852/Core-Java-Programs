package Hierarchical_Inheritance;

public class Emp {           //WE use this parent class use in any other child class it is known as hirerical Inheritence
	public int id;
	public String name;
	static String cname = "HCL";
	
	Emp(int id, String name){
		super();
		this.id=id;
		this.name=name;
	}
	
	
	  void display() { 
		  System.out.println("Id = "+id+"\tEmp_Name = "+name+"\tCompany Name = "+cname); 
		  }

	public static void main(String args[]) {
		Emp e = new Emp(101,"Kartik");
		e.display();
	}
}
