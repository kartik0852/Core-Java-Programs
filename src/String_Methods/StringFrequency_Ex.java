package String_Methods;

public class StringFrequency_Ex{
	
	  public static void main(String args[])
	  {
		   // given string
		   String str = "kartik";
		   // counter array to store frequency of each character.
		   int frequency[] = new int [256];
			
		   // iterate through the string
	           for (int i = 0; i < str.length(); i++) 
	           {

	        	    frequency[(int) str.charAt(i)]++;
	           }
	        
	           // traverse through the counter array 
	           for (int i = 0; i < frequency.length; i++)
	           {
	        	    // if frequency of the character is not 0
	        	    if (frequency[i] != 0) 
	        	    {
	        		   // print the character along with its frequency
	        		   System.out.println((char) i + " - " + frequency[i]);               
	        	    }
	           }		
	     }
	}
