import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import database.ClientDatabase;
import database.DatabaseHandler;
import database.SearchDatabase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import user.Client;

public class test {

	public static void main(String[] args) {
		Client newClient = new Client("Netto","a","a","a");
		
		
		DatabaseHandler.AddToDatabase(new Client("a","a","a","a"));
		DatabaseHandler.AddToDatabase(new Client("Netto", "Langesvej2", "Hanspeder", "HP@netto.dk"));
	    DatabaseHandler.AddToDatabase(new Client("Topsil", "VEJ 1", "Oliver", "O@Topsil.dk"));
	    
	    
		System.out.println(SearchDatabase.newSearch().Search(ClientDatabase.getInstance(), newClient.getCompanyName()).anyMatch());
		System.out.println(SearchDatabase.newSearch().Search(ClientDatabase.getInstance(), newClient.getCompanyName()).countMatch());
	}
	
	

}
