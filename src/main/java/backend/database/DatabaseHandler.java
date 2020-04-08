package backend.database;

import backend.user.Client;
import backend.user.LogistikClient;

public class DatabaseHandler {
	
	private static GeneralSimpelDatabase<Client> clientlist = null;
	
	private static GeneralSimpelDatabase<LogistikClient> logistikclientlist = null;
	
	public static GeneralSimpelDatabase<Client> getClientlist() {
		if (clientlist == null) {
			clientlist = new GeneralSimpelDatabase<Client>();
		}
		return clientlist;
	}
	
	public static GeneralSimpelDatabase<LogistikClient> getLogistikClientlist() {
		if (logistikclientlist == null) {
			logistikclientlist = new GeneralSimpelDatabase<LogistikClient>();
		}
		return logistikclientlist;
	}
	
}

