package Constructor;

public class Student4 {
	
	String nm;
	int id;
	
	//Creating a Default constructor
	Student4(){
		
	}
	static String cname="CTH"; // Static can be used to refer to the common property of all objects 
	
	
	//method to display the value of id, name and company name 
	void print() {
		System.out.println(nm+id+"\t"+cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Multiple objects are creating like s1, s2, s3
		Student4 s1 =new Student4(); //s1, s2, s3 is the reference variable of the type class Student
		s1.nm="Kartik\t";
		s1.id=101;
		
		Student4 s2 =new Student4();
		s2.nm="Rohit\t";
		s2.id=102;
		
		Student4 s3 =new Student4();
		s3.nm="Ravi\t";
		s3.id=103;
		
		//Printing all objects s1, s2, s3
		s1.print();
		s2.print();
		s3.print();

	}

}
