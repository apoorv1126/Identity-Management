package in.dod.iamcore.dao;

import in.dod.iamcore.identity.Identity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdentityFileDAO implements IdentityDAO{

	
		
	public String name;
	public String emailid;
	public String id;


	@Override
	// Allows to store the given identity
	 
	public boolean store(Identity identity){
		try {
			  
			  Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost/identity?" 
			  +"user=root&password=admin");
			  Statement stmt = conn1.createStatement();
			  String sql = "insert into database(name,emailid,id) VALUES ('"+identity.getName()+"','"+identity.getEmailid()+"','"+identity.getId()+"')";
	        stmt.execute(sql);
	       System.out.println(" Successful\n");}
		 catch (Exception e) {
			  e.printStackTrace();
			  }
		return true;
		
	}
	
	//  Allows to update the given identity
	 
	public boolean update(Identity identity){
		try {
			  
			  Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost/identity?" 
			  +"user=root&password=admin");
			  Statement stmt = conn1.createStatement();
			  String sql2="update database='"+identity.getName()+"',id='"+identity.getId()+"',emailid='"+identity.getEmailid()+"' WHERE  name='"+identity.getName1()+"'";
		      stmt.execute(sql2);
		      System.out.println(" Update Successful\n");}
		catch (Exception e) {
			  e.printStackTrace();
			  }
		return true;
	}
	
	// Allows to delete the given identity
	
	public boolean delete(Identity identity){
		try {
			  
			  Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost/identity?" 
			  +"user=root&password=admin");
			  Statement stmt = conn1.createStatement();
			  String sql3="delete from database where name='"+identity.getName()+"'";
		       stmt.execute(sql3);
		        System.out.println(" Deleted data\n");  
			  } catch (Exception e) {
			  e.printStackTrace();
			  }
		return true;
			  
	
	}


	
}


