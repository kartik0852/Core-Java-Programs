package File_Handling_Byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Read all characters
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\file.txt");
			int i = 0;
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
