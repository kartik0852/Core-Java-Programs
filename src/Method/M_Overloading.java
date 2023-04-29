//Method Overloading

package Method;

public class M_Overloading {

		//Changing no of arguments 
		int add() //No of arguments = 0 
		{ 
			return 5;
		}
		
		int add(int x, int y) //No of arguments = 2 (x and y)
		{
			return x+y;
		}
		
		
		//Changing sequence of arguments
		float add(int a, float b) // Argument sequence = 1st - int and 2nd - float  
		{
			return a+b;
		}
		
		float add(float a, int b) // Argument sequence = 1st - float and 2nd - int  
		{
			return a+b;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			M_Overloading obj = new M_Overloading();
			

			int result = obj.add(); //Passing 0 argument
			System.out.println(result);
			
			result =obj.add(4, 6); //Passing 2 arguments
			System.out.println(result);
			
			float res =obj.add(4, 11);
			System.out.println(res);
			
			res =obj.add(4, 10);
			System.out.println(res);
			
			

		}

}
