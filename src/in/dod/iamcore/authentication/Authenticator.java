package in.dod.iamcore.authentication;

import java.sql.*;


// This class allows to perform an authentication for a user 
 
public class Authenticator {
private String login;
private boolean authenticated;
// This method allows to check if the user is granted according to its couple (login/pwd)

public boolean authenticate(String userLogin, String userPassword){
try{
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/identity?" + 
                "user=root&password=admin");
Statement stmt = conn.createStatement();
String sql = "Select security from Identity where username = '"+userLogin+"' and password = '"+userPassword+"'";
ResultSet rs= stmt.executeQuery(sql);
while (rs.next() == true){	
authenticated = rs.getString("security").equals("1") ;
if (authenticated){
System.out.println("Access is granted !");
this.login = userLogin; //stores the login for further use
}else{
System.out.println("Access is denied ...");
}	
}
return authenticated;
}
catch (SQLException ex) {
            // handle the error
        System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
return authenticated;
}
public String getLogin() {
return login;
}

public boolean isAuthenticated() {
return authenticated;
}

private String getUserPassword(String user){
//Should be implemented later, it should check against a database for instance or in a file.
return user;
}

}