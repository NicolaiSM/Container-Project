package backend.container;

import backend.objects.*;
import backend.database.*;

public class Container extends DatabaseObject implements SearchAbleObjects {

	private ID id;
	private Port port;
	
	
	public Container(Port port) {
		this.id = new ContainerID();
		this.port = port;
	}


	public String get() {
		return id.getID();
	}

}
