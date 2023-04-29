package a.Practice;

public class User1 {
	private String un;
	private String pwd;
	protected String code="GU";
	int nm=100;
	public String gvar="india";
	
	public User1(){}
	public User1(String un, String pwd) {
		super();
		this.un = un;
		this.pwd = pwd;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [un=" + un + ", pwd=" + pwd + "]";
	}
	public void disp() {
		// TODO Auto-generated method stub
		
	}

}
