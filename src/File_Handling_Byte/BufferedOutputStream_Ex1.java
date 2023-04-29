package File_Handling_Byte;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\d.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "Independent";
			byte [] b=s.getBytes();
			bout.write(b);
			System.out.println("Data added successfully");
			bout.flush();
			bout.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
