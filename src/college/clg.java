package college;

public class clg {
	public int id;
	public String nm;
	static String clgname="Galgotias University";
	
	public clg(int id, String nm) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.nm=nm;
	}

	@Override
	public String toString() {
		return "clg [id=" + id + ", nm=" + nm + "]";
	}
	
	void disp() {
		System.out.println(this.id+" "+this.nm+" "+clgname);
	}
}
