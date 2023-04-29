package z.mini_Project;

public class Emp {

	public int id;
	private String nm;
	private static String cname = "CTH";
	
	Emp(int id, String nm){
		this.id=id;
		this.nm=nm;
		
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
		return "Emp [id=" + id + ", nm=" + nm + ", cname="+cname+"]";
	}


	void disp() {
		System.out.println(this.id+"\t"+this.nm+"\t\t"+cname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
