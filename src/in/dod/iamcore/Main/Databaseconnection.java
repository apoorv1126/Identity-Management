package in.dod.iamcore.Main;

import java.sql.*;
import java.util.Scanner;

public class Databaseconnection {
	public static void main(String[] args) {
		 
		    Scanner scn = new Scanner(System.in);
			  try {
			  
			  Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost/identity?" 
			  +"user=root&password=admin");
			  
			  System.out.println("Welcome");
			  System.out.print("select the name: ");
		        String name = scn.nextLine();
			
		        System.out.print("Enter name: ");
		        String name1 = scn.nextLine();

		        System.out.print("Enter emailid: ");
		        String emailid = scn.nextLine();

		        System.out.print("Enter id: ");
		         String id = scn.nextLine();

		        Statement stmt = conn1.createStatement();
               //insert into table
		        String sql = "insert into Database " +
		            "VALUES ('"+name+"','"+emailid+"','"+id+"')";
		        stmt.executeUpdate(sql);
		       System.out.println(" Successful!\n");
		       
		       //update table
		      String sql2="update Identity; set  name='"+name1+"', emailid='"+emailid+"',id='"+id+"' WHERE  name='"+name+"'";
		      stmt.executeUpdate(sql2);
		      System.out.println(" Update Successful\n");
		       
		       //delete table
		     String sql3="delete from Identity where name='"+name+"'";
		       stmt.executeUpdate(sql3);
		        System.out.println(" Deleted data\n");  
			  } catch (Exception e) {
			  e.printStackTrace();
			  }
			  }
	}


