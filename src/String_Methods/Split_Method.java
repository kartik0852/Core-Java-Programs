package String_Methods;

public class Split_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s = "Java is Object oriented programming";
		
		//Split()  method breaks a given string around matches of the given regular expression.
		String s1[]= s.split(" ");                      //Here it break the string on the basis of white spaces between the string = " "
		
		
		String s2[]= s.split("Object ");				//Here it break the string after the "Object " split function find in string where the object are located so it break the string 
		
		
		for (String aa : s1) {							//Here we use for each loop to print an array
			System.out.println(aa);
		}
		System.out.println();							//It give the space between the two line 
		
		for(String aa:s2) {
			System.out.println(aa);
		}
		
	}

}
