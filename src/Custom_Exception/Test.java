package Custom_Exception;

public class Test {

	public int id;
	private String nm;
	
	public Test(int id, String nm) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.nm=nm;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", nm=" + nm + "]";
	}
}
