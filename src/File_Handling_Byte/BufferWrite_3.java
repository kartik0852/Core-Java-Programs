package File_Handling_Byte;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWrite_3 {

	public static void main(String[] args)throws Exception,Throwable {
		// TODO Auto-generated method stub
		FileWriter fr;
		try {

		BufferedWriter bfr = new BufferedWriter(new FileWriter("C:\\Users\\Kartik Kumar\\eclipse-workspace1\\Core_Java\\src\\File_Handling_Byte\\a.txt"));
		bfr.write("Hello World");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
