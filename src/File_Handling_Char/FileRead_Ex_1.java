package File_Handling_Char;

import java.io.FileReader;
import java.io.Reader;

public class FileRead_Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//It read the file data and shows as a output
		try {
		Reader fileReader = new FileReader("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling\\file.txt");
			int data = fileReader.read();
			while(data!= -1) {
				System.out.print((char) data);
				data = fileReader.read();
			}
			fileReader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
