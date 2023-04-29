package File_Handling_Byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

//Java SequenceInputStream class is used to read data from multiple streams. It reads data sequentially (one by one).

public class SequenceInputStream_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin1 = new FileInputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\file.txt");
			FileInputStream fin2 = new FileInputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\file1.txt");
			
			SequenceInputStream sin = new SequenceInputStream(fin1,fin2);
			int i;
			while((i=sin.read())!=-1) {
				System.out.print((char)i);
			}
			sin.close();
			fin2.close();
			fin1.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
