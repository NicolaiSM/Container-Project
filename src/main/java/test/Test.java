package test;




import java.util.ArrayList;

import backend.database.DatabaseHandler;
import backend.facade.LogisticCompanyFacade;
import backend.objects.CompanyAddress;
import backend.objects.CompanyName;
import backend.objects.SearchAbleObjects;


public class Test {
	public static void main(String[] args) {
		
		
		ArrayList<SearchAbleObjects> searchableobjectlist = new ArrayList<SearchAbleObjects>();
		searchableobjectlist.add(new CompanyName("a"));
		searchableobjectlist.add(new CompanyAddress("a"));
		
		System.out.println(searchableobjectlist);
		
		
//	System.out.println("testcfjsnlkæb");
//		
//	LogisticCompanyFacade logisticCompany = new	LogisticCompanyFacade();
//		
//	logisticCompany.CreatePort("Oslo");
//	System.out.println(DatabaseHandler.getPortList().getList());
//	
//	logisticCompany.RegisterClient("a", "a", "a", "a");
//	System.out.println(DatabaseHandler.getClientList().getList());
//	
//	System.out.println(logisticCompany.RegisterClient("a", "a", "a", "a"));
//	System.out.println(DatabaseHandler.getClientList().getList());
	

	
	
//	logisticCompany.CreatePort("Oslo");
//	System.out.println(DatabaseHandler.getPortList().getList());
//	logisticCompany.CreatePort("København");
//	System.out.println(DatabaseHandler.getPortList().getList());
	
		
//	Client newClient = new Client("Nettoo","Langesvej22","a","a");
//	ArrayList<SearchAbleObjects> searchableobjectlist = new ArrayList<SearchAbleObjects>();
//	
//	DatabaseHandler.getClientlist().AddElement(new Client("a","a","a","a"));
//	DatabaseHandler.getClientlist().AddElement(new Client("Netto", "Langesvej2", "Hanspeder", "HP@netto.dk"));
//	DatabaseHandler.getClientlist().AddElement(new Client("Topsil", "VEJ 1", "Oliver", "O@Topsil.dk"));
//    
//    
//	searchableobjectlist = new ArrayList<SearchAbleObjects>();
//	searchableobjectlist.add(newClient.getCompanyName());
//	searchableobjectlist.add(newClient.getCompanyAddress());
//	
//	DatabaseHandler.getClientlist().AddUniqueElement(newClient, searchableobjectlist);
//	
//	DatabaseHandler.getClientlist().AddUniqueElement(newClient, searchableobjectlist);
//	
	
	
	
	
	
	}
}
