package File_Handling_Byte;

//Example that reads the data from two files and writes into another file

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStream_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileInputStream fin1 = new FileInputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\file.txt");
			FileInputStream fin2 = new FileInputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\file1.txt");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\file2.txt");
			
			SequenceInputStream sis = new SequenceInputStream(fin1,fin2);
			int i;
			while((i=sis.read())!=-1) {
				fout.write(i);
			}
			System.out.println("Read Data from file and file1 and write in file2 completed.....");
			sis.close();
			fout.close();
			fin2.close();
			fin1.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
