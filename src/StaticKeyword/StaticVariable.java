package StaticKeyword;

//Static Variable Example

public class StaticVariable {
	int id;
	String name;
	static String clgname = "Galgotias University";
	
	public StaticVariable(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	void display() {
		System.out.println("Student Id : "+id+" Student Name : "+name+" College Name : "+clgname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable s = new StaticVariable(101, "Kartik");
		StaticVariable s1 = new StaticVariable(102, "Rohit");
		s.display();
		s1.display();

	}

}
