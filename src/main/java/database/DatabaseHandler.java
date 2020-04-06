package database;
import user.Client;
import user.LogistikClient;

public class DatabaseHandler {

	public static void AddToDatabase(Client company) {
		ClientDatabase.getInstance().AddElement(company);		
	}
	
	public static void AddToDatabase(LogistikClient company) {
		LogistikClientDatabase.getInstance().AddElement(company);		
	}
	
}
