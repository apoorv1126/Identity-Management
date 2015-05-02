package in.dod.iamcore.identity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Identity {
	

	 String name;
	 String id;
	 String emailid;
	private String name1;
	
	// this constructs an Identity with a specified name,id,emailid
	 
		public String getName() {
		return name;
	}
		
		/**
		 * @return the Name
		 */	

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the id
	 */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the email
	 */

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getName1() {
		// TODO Auto-generated method stub
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}


	
	
}
