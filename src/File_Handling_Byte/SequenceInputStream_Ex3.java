package File_Handling_Byte;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

//SequenceInputStream example that reads data using enumeration

public class SequenceInputStream_Ex3 {
	public static void main(String[] args) {
		
		try {
			//Creating the FileInputStream objects for all the files
			FileInputStream fin = new FileInputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\a.txt");
			FileInputStream fin1 = new FileInputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\b.txt");
			FileInputStream fin2 = new FileInputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\c.txt");
			FileInputStream fin3 = new FileInputStream("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling_Byte\\d.txt");
			
			//Creating Vector objects to all stream
			Vector v = new Vector();
			v.add(fin);
			v.add(fin1);
			v.add(fin2);
			v.add(fin3);

			//Creating enumeration object by calling the elements method
			Enumeration e = v.elements();

			//Passing the enumeration object in tha constructor
			SequenceInputStream sis = new SequenceInputStream(e);
			int i;
			while((i=sis.read())!=-1) {
				System.out.print((char)i);
			}
			sis.close();
			fin3.close();
			fin2.close();
			fin1.close();
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
