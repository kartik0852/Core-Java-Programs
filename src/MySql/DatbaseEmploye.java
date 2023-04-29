package MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatbaseEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		Connection con =null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe", "root", "root");
			
			Statement stmt = con.createStatement();
			int res= stmt.executeUpdate("select * from emp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
