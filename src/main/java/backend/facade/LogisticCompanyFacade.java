package backend.facade;

import backend.user.*;

import java.util.ArrayList;

import backend.container.*;
import backend.database.*;
import backend.objects.*;

public class LogisticCompanyFacade {
	
	ArrayList<SearchAbleObjects> searchcriterialist;
	
	public void CreatePort(String portName) {
		searchcriterialist = new ArrayList<SearchAbleObjects>();
		searchcriterialist.add(new Port(portName));
		
		DatabaseHandler.getPortList().AddUniqueElement(new Port(portName), searchcriterialist);
	}
	
	public boolean RegisterClient(String clientName, String clientaddress, String contactpersonname, String contactpersonemail) {
		searchcriterialist = new ArrayList<SearchAbleObjects>();
		searchcriterialist.add(new CompanyName(clientName));
		
		return DatabaseHandler.getClientList().AddUniqueElement(new Client(clientName, clientaddress, contactpersonname, contactpersonemail),searchcriterialist);

	}
	
	public boolean CreateContainer(Port port) {
		
		searchcriterialist = new ArrayList<SearchAbleObjects>();
		searchcriterialist.add(port);
		
		if (DatabaseHandler.getPortList().anyMatch(searchcriterialist)) {
			DatabaseHandler.getContainerList().AddElement(new Container(port));
			return true;
		}
		else {
			return false;
		}
		
	}
	
 }
