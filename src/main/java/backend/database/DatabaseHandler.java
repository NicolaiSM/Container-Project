package backend.database;

import backend.container.*;
import backend.user.Client;
public class DatabaseHandler {
	
	private static GeneralSimpelDatabase<Client> clientlist = null;
	
	public static GeneralSimpelDatabase<Client> getClientList() {
		if (clientlist == null) {
			clientlist = new GeneralSimpelDatabase<Client>();
		}
		return clientlist;
	}
	
	private static GeneralSimpelDatabase<Port> portlist = null;
	
	public static GeneralSimpelDatabase<Port> getPortList() {
		if (portlist == null) {
			portlist = new GeneralSimpelDatabase<Port>();
		}
		return portlist;
	}
	
	private static GeneralSimpelDatabase<Container> containerlist = null;
	
	public static GeneralSimpelDatabase<Container> getContainerList() {
		if (containerlist == null) {
			containerlist = new GeneralSimpelDatabase<Container>();
		}
		return containerlist;
	}
	
	
	
	
	
	
}

