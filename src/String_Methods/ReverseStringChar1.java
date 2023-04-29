package String_Methods;

import java.util.Scanner;

public class ReverseStringChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Original string : ");
	 
	    String originalStr = sc.nextLine();
	    sc.close();
	 
	    String words[] = originalStr.split(" ");
	    String reversedString = "";
	 
	    //Reverse each word's position
	    for (int i = 0; i < words.length; i++) { 
	            if (i == words.length - 1) 
	              reversedString = words[i] + reversedString; 
	            else
	              reversedString = " " + words[i] + reversedString; 
	        } 
	 
	    // Displaying the string after reverse
	    System.out.print("Reversed string : " + reversedString);

	}

}
