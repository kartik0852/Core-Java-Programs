package Method;

//Constructor/ Constructor Overloading
//Method/ Method Overloading
//2=2
//x=2
//x==2
//2==2
//() function, class name ,return type-none//constructor can be overloaded
public class Student {
	String nm;
	int id;
	//scenario of constructor overloading +method overloading
	
	
	
	Student(){ // default constructor if we don't write default constructor then JVM 
		//will add default constructor
		
	}
	//Creating Constructor and pass argument 
	Student(String a, int b){
	this.nm=a;
	this.id=b;
	}
	
	//Creating a another constructor which has some argument but differ from 1st constructor arguments
	//because of By changing the sequence of data type so it is called CONSTRUCTOR OVERLOADING
	Student(int id, String y){
	this.id=id;// RHS from the argument
	this.nm=y;
	}
	
	//Creating a Static variable
	static String cname="CTH";
	
	//Creating a method 
	void print() {	
		System.out.println(nm+"\t"+cname+"\t"+id);
	}
	
	//Creating Method and pass argument and return x+y
	int add(int x,int y) 
	{
		return x+y;
	}
	
	//Creating a another Method which has some argument but differ from 1st Method
	//because of By changing the sequence of data type so it is called METHOD OVERLOADING
	float add(float x, int y,int z) 
	{
		return x+y+z;
	// System.out.println("---"); //unreachable code here
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an Object and give the value of arguments
		Student s1 = new Student(10,"Kartik");
		//s1.nm="a";
		Student s2 = new Student(11,"Harsh");
		//s2.nm="b";
		Student s3 = new Student();
		//s3.nm="c";
		s1.print();		//Print the object using print() method
		s2.print();
			
	int res= s3.add(2, 4);	//Call the method and give the value
	float s = s3.add(2.1f, 4,6);
	System.out.println(res);	//Print the method 
	System.out.println(s);
		
		

	}

}
