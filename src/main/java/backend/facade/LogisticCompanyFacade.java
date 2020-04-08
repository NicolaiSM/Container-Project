package backend.facade;

import backend.user.*;

import java.util.ArrayList;

import backend.container.*;
import backend.database.*;
import backend.objects.*;

public class LogisticCompanyFacade {
	
	ArrayList<SearchAbleObjects> searchcriterialist;
	
	public void CreatePort(String portName) {
		DatabaseHandler.getPortList().AddUniqueElement(new Port(portName), QueryGenerator.startQuery().addQuery("port", portName).finishQuery());
	}
	
	public boolean RegisterClient(String clientName, String clientaddress, String contactpersonname, String contactpersonemail) {
		return DatabaseHandler.getClientList().AddUniqueElement(new Client(clientName, clientaddress, contactpersonname, contactpersonemail), QueryGenerator.startQuery().addQuery("companyname", clientName).finishQuery());
	}
	
	public boolean CreateContainer(Port port) {
		if (DatabaseHandler.getPortList().anyMatch(QueryGenerator.startQuery().addQuery("companyname", port.getPort()).finishQuery())) {
			DatabaseHandler.getContainerList().AddElement(new Container(port));
			return true;
		}
		else {
			return false;
		}
		
	}
	
 }
