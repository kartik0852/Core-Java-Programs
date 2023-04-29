package Access_modifiers;

//util, lang in built packages...

//importing | Same Class  |  Same Package | Outside the packages
//----------|-------------|-------------- |-----------------------------------
//public -- |     Y 	  |		Y		  |		y
//          |             |               |
//private   |     Y		  |		N		  |		N
//          |             |               |
//Protected |	  Y   	  |		Y		  |		(subclass-- parent->child)
//          |             |               | 
//default   |     Y		  |		Y		  |		N

public class TestAccess {
	
	static private int a;         // non static data member are at the object level so we need to create the object first then we can access
	public int b;                //static data member are the the class level,don't need to create the object
	protected int c;
	int d;                       // d is having default access specifier
	
	
	public void printdata() {
		System.out.println("a:" + a + "\t" + "b:" + b + "\t" + "c:" + c + "\t" + "d:" + d);
	}

	protected void disp() {
		System.out.println("a:" + a + "\t" + "b:" + b + "\t" + "c:" + c + "\t" + "d:" + d);

	}

	static void show() {
		System.out.println("----");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAccess ob = new TestAccess();

		a = 10;
		ob.b = 20;
		ob.c = 30;
		ob.d = 50;

		ob.disp();
		// TestAccees. disp() is tatic non accessible vai class..
		show(); // l42 l43 are similar goal achieving
		// TestAccees.show();
		// ob.show();

	}

}
