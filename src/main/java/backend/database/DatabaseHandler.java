package backend.database;

import backend.user.Client;

public class DatabaseHandler {
	
	private static GeneralSimpelDatabase<Client> clientlist = null;
	
	public static GeneralSimpelDatabase<Client> getClientlist() {
		if (clientlist == null) {
			clientlist = new GeneralSimpelDatabase<Client>();
		}
		return clientlist;
	}
	
}

