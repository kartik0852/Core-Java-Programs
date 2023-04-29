package File_Handling_Byte;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Ex1 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		
		//It write the one alphabet or char using byte
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\file.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success......");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
