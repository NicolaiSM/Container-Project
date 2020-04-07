package backend.database;

import java.util.ArrayList;

import backend.objects.SearchAbleObjects;
import backend.user.Client;
import backend.user.LogistikClient;
import backend.user.User;

public class DatabaseObjectsFactory {

	private static void addToDatabase((User company) {
		ClientDatabase.getInstance().AddElement(company);		
	}
	
	private static void addToDatabase(LogistikClient company) {
		LogistikClientDatabase.getInstance().AddElement(company);		
	}
	
	
	private static User UserFactory(String usertype, String companyname, String companyaddress, String contactperonsname, String contactperonsemail) {
		if (usertype == "CLIENT") {
			return new Client(companyname, companyaddress, contactperonsname, contactperonsemail);
		} else if (usertype == "LOGISTIKCLIENT") {
			return new LogistikClient(companyname, companyaddress, contactperonsname, contactperonsemail);
		} else {
			return null;
		}
	}
	
	public static SimpelDatabase getDatabaseBasedOnInput(DatabaseObjects databaseobject) {
		if (databaseobject instanceof Client) {
			return ClientDatabase.getInstance();
		} else if (databaseobject instanceof LogistikClient) {
			return LogistikClientDatabase.getInstance();
		} else {
			return null;
		}

		
		
	}
	
	public void isCompanyNameAndAddressUnique(String usertype, String companyname, String companyaddress, String contactperonsname, String contactperonsemail) {
		User newuser = UserFactory(usertype, companyname, companyaddress, contactperonsname, contactperonsemail);
		SimpelDatabase database = getDatabaseBasedOnInput(newuser);
		ArrayList<SearchAbleObjects> searchableobjectslist = new ArrayList<SearchAbleObjects>(UserObjectFactoryMethod("COMPANYNAME",companyaddress));
				
		if (QueryDatabase.newQuery(database, searchableobjectslist).anyResult()) {
			addToDatabase(newuser);
		}
	}
	
}
