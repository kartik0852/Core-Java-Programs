package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Library{
	private String libnm;
	private String booknm;
	
	Library(String libnm,String booknm){
		this.libnm = libnm;
		this.booknm = booknm;
	}
	public String getLibnm() {
		return libnm;
	}
	public void setLibnm(String libnm) {
		this.libnm = libnm;
	}
	public String getBooknm() {
		return booknm;
	}
	public void setBooknm(String booknm) {
		this.booknm = booknm;
	}
	@Override
	public String toString() {
		return "Library [libnm=" + libnm + ", booknm=" + booknm + "]";
	}
	
}

class Bookdetails{
	private int id;
	private String bookname;
	private String authrnm;
	
	Bookdetails(int id,String bookname,String authrnm){
		this.id = id;
		this.bookname = bookname;
		this.authrnm = authrnm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthrnm() {
		return authrnm;
	}
	public void setAuthrnm(String authrnm) {
		this.authrnm = authrnm;
	}
	@Override
	public String toString() {
		return "Bookdetails [id=" + id + ", bookname=" + bookname + ", authrnm=" + authrnm + "]";
	}
	
}

public class TestLibrary {
	public static void main(String[] args) {
	Connection con = null;
	Scanner sc = new Scanner(System.in);

	//List<Library> ll = new ArrayList<Library>();
	//List<Bookdetails> l2 = new ArrayList<Bookdetails>();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestLibrary", "root", "dse27074");
		Statement stmt = con.createStatement(); 
		ResultSet rs = stmt.executeQuery("select * from Library");

		while (rs.next()) 
		 System.out.println("Library Name: "+rs.getString(1) + " Booknm: " + rs.getString(2));
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	Connection conn = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b", "root", "root");
		Statement stmt = con.createStatement(); 
		ResultSet rs = stmt.executeQuery("select * from Bookdetails");

		while (rs.next())
		 System.out.println("Book id :"+rs.getInt(1) + " Booknm : " + rs.getString(2)+" Authornm : "+ rs.getString(3));
		System.out.println();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	

}
