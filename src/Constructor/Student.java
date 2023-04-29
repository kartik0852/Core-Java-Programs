//Constructor Overloading
		//In this there are 3 constructor are called and all in these three are different argument
		//Changing of no. , Changing of sequence that's why it is called constructor overloading

package Constructor;

public class Student {

	
		String nm;
		int id;
		float a;
		//Default Constructor
		Student() // No. of argument = 0
		{
			
		}
		
		//Parameterized constructor 
		Student(int x, String y) //No of argument = 2
		{
			this.id=x;
			this.nm=y;
		}
		
		Student(int x, String y, float z) //No of argument = 3 and Changing sequence of argument
		{
			this.id=x; // use "this" to call the constructor arguments
			this.nm=y;
			this.a=z;
		}

		//Method to print or display the values
		void print() {
			System.out.println(nm+" "+id+" "+a);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Student s = new Student(); // 0 argument call
			s.print();					//Printing the value of constructor
			
			Student s1 = new Student(101,"KArtik"); // In this object we call a argument in and string
			s1.print();
			
			Student s2 = new Student(102,"Singh",5.1f); // 3 arguments are called
			s2.print();
		}

}
