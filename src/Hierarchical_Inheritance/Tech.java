package Hierarchical_Inheritance;

public class Tech extends Emp{

	public String TechId;
	Tech(int id, String name, String Tid) {
		super(id, name);
		this.TechId=Tid;
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Tech [TechId=" + TechId + ", id=" + id + ", name=" + name + "]";
	}


	public static void main(String args[]) {
		Tech t = new Tech(101, "Kartik", "Kartik_12345");
		System.out.println(t);
	}

	
}
