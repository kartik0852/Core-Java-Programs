package Hierarchical_Inheritance;

public class Admin extends Emp {

	public String AdminId;
	Admin(int id, String name, String AdminId) {
		super(id, name);
		this.AdminId=AdminId;
		// TODO Auto-generated constructor stub
	}
	
	



	@Override
	public String toString() {
		return "Admin [AdminId=" + AdminId + ", id=" + id + ", name=" + name + "]";
	}





	public static void main(String args[]) {
		Admin a = new Admin(101,"Kartik", "Admin1234");
		System.out.println(a);
	}

}
