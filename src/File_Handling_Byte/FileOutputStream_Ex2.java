package File_Handling_Byte;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Ex2 {
	public static void main(String[] args) {
		
		//Write String data in file ,converting string into byte
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\file.txt");
			String s="Welcome to java";
			byte b[] = s.getBytes();	//Converting string into byte array
			fout.write(b);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
