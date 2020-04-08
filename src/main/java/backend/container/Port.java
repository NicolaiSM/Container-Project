package backend.container;


import backend.database.DatabaseObjects;

public class Port implements DatabaseObjects {
	
	private String port;
	
	public Port(String port) {
		this.port = port;
	}
	
	public String getPort() {
		return port;
	}

}
