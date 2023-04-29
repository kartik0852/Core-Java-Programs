package z.MiniProject_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CollegeData {
	
	private int bookid;
	private String bookname;
	private String authorname;
	
	public CollegeData(int bookid, String bookname,String authorname) {
		
		this.bookid=bookid;
		this.bookname=bookname;
		this.authorname=authorname;
	}

	@Override
	public String toString() {
		return "Insert_Query_1 [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname + "]";
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Connection con = null; //Create the connection object and take reference variable ......
		Statement stmt; 
		
		//Using try and catch block
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//Register the driver class using ".forName()" method
			
			//The getConnection() method of DriverManager class is used to establish connection with the database.
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b", "root", "root");		//Database name = b
			
			//The createStatement() method of Connection interface is used to create statement. 
			//The object of statement is responsible to execute queries with the database.
			stmt = con.createStatement(); 
			
			//Create variables before the case so we can use this variable in every cases....
			int insert;
			int update;
			int query;
			int delete;
			int alter;
			int alldata;
			
			//Starting of main do while loop
			do {
				System.out.println("\nSelect 1 for update new row:");
				System.out.println("Select 2 for update the query:");
				System.out.println("Select 3 for delete the query:");
				System.out.println("Select 4 for alter cmnd:");
				System.out.println("Select 5 for all data from the table");
				System.out.println("For Exit select 7---------------------------------->");
				
				query = sc.nextInt();
				
				//Create variable of objects
				
				ResultSet rs;
				String q;
				int res;
				switch(query) {
				
				//Insert data in the table..................................................
				case 1:
					do {
					System.out.println("\nSelect 1 for Insert data in Library: ");
					System.out.println("Select 2 for Insert data in book");
					System.out.println("For Exit select 3----------------->");
					insert = sc.nextInt();
					
					//Using nested switch
					switch(insert) {
					case 1:
						  System.out.println("\nEnter Library name and books name: ");
						  //Insert_Query_1 iq = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());

						  q = "insert into lib values ('"+sc.next()+"','"+sc.next()+"')";
						  
						  ////The executeUpdate() method of Statement interface is used to execute Update the queries to the database.
						  res = stmt.executeUpdate(q); 
						  
						  //Using if else , if any data insert successfully so 
						  if(res>0)
							  System.out.println("Insert data successfully............");
						  else
							  throw new DataException("Data insertion failed please try again: ");
						  break;
						
					case 2:
						  System.out.println("\nEnter id of book, name of book, author of book: ");
						  //Insert_Query_1 iq = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());
						  q = "insert into book1 values ('"+sc.nextInt()+"','"+sc.next()+"','"+sc.next()+"','"+sc.next()+"')"; 
						  res = stmt.executeUpdate(q); 
						  if(res>0)
							  System.out.println("Insert data successfully............");
						  else
							  System.out.println("Insert data failes please try again");
						  break;
						}
					}while(insert!=3);
					break;
					 
				//Update data in the table.....................................
				case 2:
					do {
						
					System.out.println("\nSelect 1 for Update name: ");
					System.out.println("Select 2 for Update authrname: ");
					System.out.println("Select 3 for Update library name: ");
					System.out.println("Select 4 for Update name and authrname: ");
					System.out.println("Select 5 for Update name, authrname and library name: ");
					System.out.println("For Exit select 6------------------------------------->");
					
					update = sc.nextInt();
					
					switch(update) {
					case 1:
						System.out.println("\nEnter Book name and where bookid is: ");
						//Insert_Query_1 iq1 = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());
						q = "update book1 set bookname='"+sc.next()+"' where bookid='"+sc.nextInt()+"'";
						res = stmt.executeUpdate(q);
						if(res>0)
							  System.out.println("Update data successfully............");
						  else
							  throw new DataException("Data not updated please try again........");
						break;
						
					case 2:
						System.out.println("\nEnter Author name: ");
						//Insert_Query_1 iq1 = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());
						q = "update book1 set authorname ='"+sc.next()+"' where bookid='"+sc.nextInt()+"'";
						res = stmt.executeUpdate(q);
						if(res>0)
							  System.out.println("Update data successfully............");
						  else
							  throw new DataException("Data not updated please try again........");
						break;
						
					case 3:
						System.out.println("\nEnter Library name: ");
						//Insert_Query_1 iq1 = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());
						q = "update book1 set librarynm ='"+sc.next()+"' where bookid='"+sc.nextInt()+"'";
						res = stmt.executeUpdate(q);
						if(res>0)
							  System.out.println("Update data successfully............");
						  else
							  throw new DataException("Data not updated please try again........");
						break;
					
					case 4:
						System.out.println("\nEnter Book name and author name: ");
						//Insert_Query_1 iq1 = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());
						q = "update book1 set bookname='"+sc.next()+"', authorname ='"+sc.next()+"' where bookid='"+sc.nextInt()+"'";
						res = stmt.executeUpdate(q);
						if(res>0)
							  System.out.println("Update data successfully............");
						  else
							  throw new DataException("Data not updated please try again........");
						break;
					
					case 5:
						System.out.println("\nEnter Book name, author name and library name: ");
						//Insert_Query_1 iq1 = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());
						q = "update book1 set bookname='"+sc.next()+"', authorname ='"+sc.next()+"', librarynm ='"+sc.next()+"' where bookid='"+sc.nextInt()+"'";
						res = stmt.executeUpdate(q);
						if(res>0)
							  System.out.println("Update data successfully............");
						  else
							  throw new DataException("Data not updated please try again........");
						break;
					}	
					}while(update!=6);
					break;
					
				//Deleting row or entire record..........
				case 3:
					do {
						System.out.println("\nSelect 1 to delete all records of book1: ");
						System.out.println("Select 2 for delete one row of book1:");
						System.out.println("Select 3 for delete one row of library: ");
						System.out.println("For Exit select 4--------------->");
						
						delete = sc.nextInt();
						switch(delete) {
						
						case 1:
							System.out.println("\nEnter book name to delete : ");
							//Insert_Query_1 iq2 = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());
							q = "delete from='"+sc.next()+"'";
							res = stmt.executeUpdate(q);
							if(res>0)
								  System.out.println("Delete all records from the table successfully............");
							  else
								  throw new DataException("Data not deleted please try again........");
							break;
						
						case 2:
							System.out.println("\nEnter book name to delete : ");
							//Insert_Query_1 iq2 = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());
							q = "delete from book1 where bookname='"+sc.next()+"'";
							res = stmt.executeUpdate(q);
							if(res>0)
								  System.out.println("Delete data successfully............");
							  else
								  throw new DataException("Data not deleted please try again........");
							break;
						
						case 3:
							System.out.println("\nEnter book name to delete : ");
							//Insert_Query_1 iq2 = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());
							q = "delete from lib where booksnm='"+sc.next()+"'";
							res = stmt.executeUpdate(q);
							if(res>0)
								  System.out.println("Delete data successfully............");
							  else
								  throw new DataException("Data not deleted please try again........");
							break;
						
						}
					}while(delete!=4);
					break;
					
				//Alter........................................................
				case 4:
					do {
					System.out.println("\nSelect 1 for add primary key: ");
					System.out.println("Select 2 for add new column: ");
					System.out.println("Select 3 for drop column: ");
					System.out.println("For Exit select 4 ------------>");
					
					alter = sc.nextInt();
					
					switch(alter) {
					case 1:
						System.out.println("\nUpdate primary key : ");
						//Insert_Query_1 iq2 = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());
						q = "alter table book1 add primary key(bookid)";
						res = stmt.executeUpdate(q);
						if(res>0)
							  System.out.println("Update successfully............");
						  else
							  throw new DataException("Not updated please try again........");
						break;
					
						
					//Add new column in the table------------------------------------------------------------------------------------------------------------------------ 
					case 2:
						System.out.println("\nAdd column using alter : ");
						//Insert_Query_1 iq2 = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());
						q = "alter table book1 add column ";
						res = stmt.executeUpdate(q);
						if(res>0)
							  System.out.println("Add Column successfully............");
						  else
							  throw new DataException("Add new column failed!! please try again........");
						break;
						//-------------------------------------------------------------------------------------------------------------------------------------------	
						
					case 3:
						System.out.println("\nDrop column using alter : ");
						//Insert_Query_1 iq2 = new Insert_Query_1(sc.nextInt(), sc.next(), sc.next());
						q = "alter table book1 drop column='"+sc.next()+"'";
						res = stmt.executeUpdate(q);
						if(res>0)
							  System.out.println("Drop column successfully............");
						  else
							  throw new DataException("Column is not drop please try again........");
						break;
					
					}
				}while(alter!=4);
				break;	
					
				//print all data
				case 5:
					do {
						System.out.println();
					System.out.println("\nSelect 1 to print all library data: ");
					System.out.println("Select 2 to print all book data: ");
					System.out.println("Select 3 for print id from book: ");
					System.out.println("Select 4 for print name from book: ");
					System.out.println("Select 5 for print author names from book: ");
					System.out.println("Select 6 for print Library names from book: ");
					System.out.println("Select 7 for print name and authorname from from book: ");
					System.out.println("Select 8 for Exit: ");
					System.out.println("For Exit select 3------------------>");
					
					alldata = sc.nextInt();
					switch(alldata) {
					case 1:
						rs = stmt.executeQuery("select * from lib");
	
						while (rs.next())
						 System.out.println("Library Name: "+rs.getString(1) + " Booknm: " + rs.getString(2));
						break;
					case 2:
						rs = stmt.executeQuery("select * from book1");
	
						while (rs.next())
						 System.out.println("Book id :"+rs.getInt(1) + " Booknm : " + rs.getString(2)+" Authornm : "+ rs.getString(3)+" Library name : "+rs.getString(4));
						break;
						
					case 3:
						rs = stmt.executeQuery("select bookid from book1");
	
						while (rs.next())
						 System.out.println("Book id :"+rs.getInt(1));
						break;
						
					case 4:
						rs = stmt.executeQuery("select bookname from book1");
	
						while (rs.next())
						 System.out.println("Book Name :"+rs.getString(1));
						break;
						
					case 5:
						rs = stmt.executeQuery("select authorname from book1");
	
						while (rs.next())
						 System.out.println("Book Author Name :"+rs.getString(1));
						break;
						
					case 6: 
						rs = stmt.executeQuery("select librarynm from book1");
	
						while (rs.next())
						 System.out.println("Library Name :"+rs.getString(1));
						break;
						
					case 7:
						rs = stmt.executeQuery("select bookname,authorname from book1");
	
						while (rs.next())
						 System.out.println("Book Name :"+rs.getString(1)+" 	Author Name:"+rs.getString(2));
						break;
					}
					}while(alldata!=8);
					break;
					
				}
			}while(query!=6);
		}
				
			catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}