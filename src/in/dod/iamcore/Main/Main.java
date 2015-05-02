

package in.dod.iamcore.Main;

import in.dod.iamcore.authentication.Authenticator;
import in.dod.iamcore.dao.IdentityDAO;
import in.dod.iamcore.dao.IdentityFileDAO;
import in.dod.iamcore.identity.Identity;
import in.dod.iamcore.logging.IamLog;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//IamLog logger = new IamLog("Main");

		IdentityDAO identityDAO = new IdentityFileDAO();
		
		//logger.log("Beginning of the program", "INFO");
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the database management application, please enter your User name and Password");
		System.out.println("User name:");

		String userName = scan.next();

		System.out.println("Password:");

		String password = scan.next();
		int choice;
		Authenticator authenticator = new Authenticator();

		/*logger.log("try to authenticate the user with this couple " + userName
				+ " / " + password);*/
		boolean isAuthenticated = authenticator
				.authenticate(userName, password);

		if (isAuthenticated) {
			System.out.println("You are logged in");
		} else {
			System.out.println("Unknown User name or password");
			return;
		}

		//logger.log("The user was successfully authenticated, continuing the program");
do{
	System.out.println("*******EMPLOYEE DATABASE*******");
	System.out.println("1.Create");
	System.out.println("2.Update");
	System.out.println("3.Delete");
	System.out.println("PLEASE SELECT YOUR OPTION");
		 choice=scan.nextInt();
	
		/* Switch cases can be based on integer values, chars, or enums. Since its java
		 it can even be based on Strings*/
		switch (choice) {
		case 1:
			 System.out.println("1.You picked option Create; Enter the information");
			 Scanner scn = new Scanner(System.in);
			 System.out.print("Enter name: ");
		        String name = scn.nextLine();

		        System.out.print("Enter emailid: ");
		        String emailid = scn.nextLine();

		        System.out.print("Enter id: ");
		         String id = scn.nextLine();
		         identityDAO.store(new Identity(name,id,emailid ));

			break; // put this break so the case stops
		case 2:
			System.out.println("2.You picked option Update; Select the identity to Update");
			Scanner scn1= new Scanner(System.in);
			System.out.print("Enter old name: ");
	        String name2 = scn1.nextLine();

		        Scanner scn2 = new Scanner(System.in);
				 System.out.print("Enter new name: ");
			        String name3 = scn2.nextLine();

		        System.out.print("Enter emailid: ");
		        String emailid1 = scn1.nextLine();

		        System.out.print("Enter id: ");
		         String id1 = scn1.nextLine();
		         identityDAO.update(new Identity(name3,id1,emailid1,name2 ));
			
			// in this example, this is the case we pass into
			break;
		case 3:
			System.out.println("3.You picked option Delete; Select the identity to Delete");
			Scanner scn3= new Scanner(System.in);
			System.out.println("select identity to Delete");
			String name4 = scn3.nextLine();
			identityDAO.delete(new Identity(name4));
			
		default:
			System.out.println("Unrecognised Option");
			
			// this is the instruction to perform if no cases were satisfied

		}
			
		
		
		
}
while(choice!=4);
}}



		// Continue proceed to the next step
		//Usage of the dao
		//identityDAO.store(new Identity("id-01","testid","test@test.com" ));
		
		// Get Identities information from the console, create a new object with that
		
