package Exception_Handling;

public class Throwable_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[4];
		a[1]=2;
		try {
			a[5]=3;
			//System.out.println(a[5]);
		}
		catch(Throwable e) {
			System.out.println("Exception Hadled by Super Class = Throwable");
		}
		
		System.out.println(a);
	}

}
