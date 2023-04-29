package a.Practice;

//User1 , Test Driver , 
import java.util.Arrays;

public class Emp extends User1{
	//public String code;
	Emp() {
		super();
		this.code=super.code+"CSE22";
		// TODO Auto-generated constructor stub
	}

public String ph[];

public Emp(String a, String b, String []m) {
	
	super(a, b);
	this.ph=m;
	
}

public void hi() {
	super.disp();
	System.out.println(this.code);
	
}

	/*public Emp(String un, String pwd, String []m) {
		super(un, pwd);
		this.ph=m;
		
		// TODO Auto-generated constructor stub
	}*/
	
	public void print() {
	System.out.println(super.code+"\t"+super.gvar);
	//System.out.println(super.n);
	}

	@Override
	public String toString() {
		return "Emp [ph=" + Arrays.toString(ph) + ", code=" + code + ",  gvar=" + gvar + "]";
	}
	
}