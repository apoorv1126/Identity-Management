package in.dod.iamcore.dao;

import in.dod.iamcore.identity.Identity;

import java.util.List;


// Handles the storage of Identity objects
 
public interface IdentityDAO {
	
	// Allows to store the given identity
	
	public boolean store(Identity identity);
	// Allows to update the given identity
	
    public boolean update(Identity identity);
    
    // Allows to delete the given identity
	
	public boolean delete(Identity identity);
	
}
