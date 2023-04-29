package File_Handling_Byte;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\file.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while((i=bin.read())!=-1) {
				System.out.print((char)i);
			}
			bin.close();
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
