package Java_8_Features;

//Lambda Expression
interface Add{
	void add(int x,int y); //
}

interface Sub{
	void sub(int x, int y);
}

public class Lambda_Exp_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add A = (a,b)-> {
			System.out.println(a+b);
		};
		
		Sub S = (a,b)->{
			System.out.println(a-b);
		};
		A.add(5, 6);
		S.sub(10, 7);

	}

}
