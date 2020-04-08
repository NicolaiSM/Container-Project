package backend.facade;

import backend.user.*;

import java.util.ArrayList;

import backend.container.*;
import backend.database.*;
import backend.objects.*;

public class LogisticCompanyFacade {
	
	public void CreatePort(String portName) {
		DatabaseHandler.getPortList().AddUniqueElement(new Port(portName), (new ArrayList<SearchAbleObjects>(){{add(new Port(portName));}} ));
	}
	
	public void RegisterClient(String clientName, String clientaddress, String contactpersonname, String contactpersonemail) {
		
		DatabaseHandler.getClientlist().AddUniqueElement(new Client(clientName, clientaddress, contactpersonname, contactpersonemail), (new ArrayList<SearchAbleObjects>(){{add(new CompanyName(clientName));}} ));

	}
	
	public boolean CreateContainer(Port port) {
		if (DatabaseHandler.getPortList().anyMatch(new ArrayList<SearchAbleObjects>(){{add(port);}})) {
			DatabaseHandler.getContainerList().AddElement(new Container(port));
			return true;
		}
		else {
			return false;
		}
		
	}
	
 }
