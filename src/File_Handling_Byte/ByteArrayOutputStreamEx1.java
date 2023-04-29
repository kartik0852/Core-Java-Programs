package File_Handling_Byte;

//ByteArrayOutputStream is used to write a common data in multiple files

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamEx1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fout1 = new FileOutputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace1\\Core_Java\\src\\File_Handling_Byte\\file.txt");
		FileOutputStream fout2 = new FileOutputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace1\\Core_Java\\src\\File_Handling_Byte\\file1.txt");
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String s = "KArtik";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.close();
		fout1.close();
		fout2.close();
		System.out.println("Successfully Write data in the file");

	}

}
