package File_Handling_Char;

import java.io.File;
import java.io.IOException;

public class CreateTxtFile_Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a new text file
		File myFile = new File("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling\\fil1.txt");
		try {
			if(myFile.createNewFile()) {
				System.out.println("File Created : "+myFile.getName());
			}
			else {
				System.out.println("File Already created............");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to create file");
			e.printStackTrace();
		} 

	}

}
