package File_Handling_Char;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//It use to write some data in the file
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling\\file.txt");
			fileWriter.write("Java is platform independent , roburst");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
