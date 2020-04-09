package backend.facade;

import java.util.ArrayList;

import backend.database.DatabaseHandler;
import backend.objects.CompanyName;
import backend.objects.SearchAbleObjects;
import backend.user.*;

public class ClientFacade {
	private Client client;
	private ArrayList<SearchAbleObjects> searchcriterialist;
	
	
	public boolean setClientName(String companyName) {
		searchcriterialist = new ArrayList<SearchAbleObjects>();
		searchcriterialist.add(new CompanyName(companyName));
		if (DatabaseHandler.getClientList().anyMatch(searchcriterialist)) {
			return false;
		}
		else {
			client.setCompanyNameString(companyName);

			return true;
			
		}
	}

	public void setClient(String clientName) {
		searchcriterialist = new ArrayList<SearchAbleObjects>();
		searchcriterialist.add(new CompanyName(clientName));
		this.client = DatabaseHandler.getClientList().newQuery2(searchcriterialist);
	
	}
	public void setClient(Client client) {
		this.client = client;
	}
}
