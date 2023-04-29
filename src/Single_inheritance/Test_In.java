package Single_inheritance;

public class Test_In {

	private String name;
	private String pwd;
	protected String code="GU";
	int a = 100;
	public String gvar="India";
	
	public Test_In() {
		// TODO Auto-generated constructor stub
	}
	
	public Test_In(String name, String pwd) {
		super();
		this.name=name;
		this.pwd=pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Test_In [name=" + name + ", pwd=" + pwd + "]";
	}
	
	protected void disp() {
		System.out.println("hi");
	}
	

}
