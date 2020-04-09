package backend.container;


import backend.database.DatabaseObject;

public class Port extends DatabaseObject {
	
	private String port;
	
	public Port(String port) {
		this.port = port;
	}
	
	public String getPort() {
		return port;
	}

}
