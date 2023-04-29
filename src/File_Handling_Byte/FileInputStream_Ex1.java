package File_Handling_Byte;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//It read just one char from the text file
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\file.txt");
			int i=fin.read();
			System.out.println((char)i);
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
