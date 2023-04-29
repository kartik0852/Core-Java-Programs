package StaticKeyword;

//Static Method Example

public class StaticMethod {
	int id;
	String name;
	static String clgname = "GU";
	
	static void change() {
		clgname = "Galgotias University";
	}

	public StaticMethod(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	void display() {
		System.out.println("Student Id : "+id+" Student Name : "+name+" College Name : "+clgname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod.change();
		StaticMethod s = new StaticMethod(101, "Kartik");
		s.display();

	}

}
