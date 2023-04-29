package Multilevel_Inheritance;

// Multivelel inheritance
import java.util.Arrays;

class Student{
	private int id;
	public String nm;
	public Student(int id, String nm) {
		super();
		this.id = id;
		this.nm = nm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", nm=" + nm + "]";
	}
	
}
class Btech extends Student{
	public String t[]=new String[2];// dm
	public Btech(int id, String nm,String []v) {
		super(id, nm);
		this.t=v;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Btech [sub=" + Arrays.toString(t) + ", nm=" + nm + "]";
	}
	
}
class Result extends Btech{
	public boolean resultstatus=true;
	@Override
	public String toString() {
		return "Result [resultstatus=" + resultstatus + ", sub=" + Arrays.toString(t) + ", nm=" + nm + "]";
	}
	public Result(int id, String nm, String[] v) {
		super(id, nm, v);
		
		// TODO Auto-generated constructor stub
	}
	public void disp() {
		System.out.println(super.nm);
		
	}
	
}
public class TestInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result r = new Result(10,"arti",new String[] {"DAA","CN"} );
		System.out.println(r);
		

	}

}
