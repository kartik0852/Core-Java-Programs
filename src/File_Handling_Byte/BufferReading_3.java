package File_Handling_Byte;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferReading_3 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Kartik Kumar\\eclipse-workspace\\Core_Java\\src\\File_Handling\\file.txt");
			InputStreamReader r=new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			String name = "";
			
			while(!name.contains("exit")) {
					System.out.println("Enter data : ");
					name=br.readLine();
					System.out.println("Data is : "+name);
					fw.write(name);
			}
			r.close();
			br.close();
			fw.close();
		}
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
