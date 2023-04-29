package a.Practice;

public class Singleton {

	private static Singleton singleInsatance = null;
	
	public String s;
	
	private Singleton() {
		s = "Java is High Level programming Language";
	}
	
	public static synchronized Singleton getInstance() {
		if (singleInsatance == null) {
			singleInsatance = new Singleton();
		}
		return singleInsatance;
	}
	
}

class ABC{
	
	public static void main(String[] args) {
		
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		Singleton c = Singleton.getInstance();
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());

		
		if (a==b && b == c) {
			System.out.println("three object pint to the same memory location");
		}
		else {
			System.out.println("not pointing");
		}
		
	}
}

