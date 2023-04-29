package a.Practice;

//util, lang in built packages...
//importing  ..sameclass   samepackage    outside the packages
//public --    Y 			y				y
//private       Y			N				N
//Protected 	Y   		Y				(subclass-- parent->child)

//default       y			y				N
public class TestAccees {
	static private int a; // static dm are the the class level,don't need to create the object
	public int b;// non static dm are at the object level so we need to craere the object first
					// then we can access
	protected int c;
	int d; // d is having default access specifier

	public void printdata() {
		System.out.println("a:" + a + "\t" + "b:" + b +"\t" + "c:" + c + "\t" +"d:" + d);
	}

	protected void disp() {
		System.out.println("a:" + a + "\t" + "b:" + b +"\t" + "c:" + c +"\t" + "d:" + d);

	}

	static void show() {
		System.out.println("----");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAccees ob = new TestAccees();

		a = 10;
		ob.b = 20;
		ob.c = 30;
		ob.d = 50;

		ob.disp();
		ob.printdata();
		// TestAccees. disp() is tatic non accessible vai class..
		show(); // l42 l43 are similar goal achieving
		// TestAccees.show();
		// ob.show();

	}

}
