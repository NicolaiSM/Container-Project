package test;



import java.util.ArrayList;

import backend.database.DatabaseHandler;
import backend.objects.SearchAbleObjects;
import backend.user.Client;

public class Test {
	public static void main(String[] args) {
	Client newClient = new Client("Nettoo","Langesvej22","a","a");
	ArrayList<SearchAbleObjects> searchableobjectlist = new ArrayList<SearchAbleObjects>();
	
	DatabaseHandler.getClientlist().AddElement(new Client("a","a","a","a"));
	DatabaseHandler.getClientlist().AddElement(new Client("Netto", "Langesvej2", "Hanspeder", "HP@netto.dk"));
	DatabaseHandler.getClientlist().AddElement(new Client("Topsil", "VEJ 1", "Oliver", "O@Topsil.dk"));
    
    
	searchableobjectlist = new ArrayList<SearchAbleObjects>();
	searchableobjectlist.add(newClient.getCompanyName());
	searchableobjectlist.add(newClient.getCompanyAddress());
	
	DatabaseHandler.getClientlist().AddUniqueElement(newClient, searchableobjectlist);
	
	DatabaseHandler.getClientlist().AddUniqueElement(newClient, searchableobjectlist);
	
	}
}
