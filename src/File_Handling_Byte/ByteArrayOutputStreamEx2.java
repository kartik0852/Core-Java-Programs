package File_Handling_Byte;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamEx2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		FileOutputStream fout1 = new FileOutputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\file.txt");
		FileOutputStream fout2 = new FileOutputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\file1.txt");
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		String s = "Java is platform independent, robust and secure language";
		byte[] b = s.getBytes();
		bout.write(b);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.close();
		fout1.close();
		fout2.close();
		System.out.println("Data Successfully write in the file................");
		
	}

}
