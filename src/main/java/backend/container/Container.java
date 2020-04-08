package backend.container;

import backend.objects.*;
import backend.database.*;

public class Container implements DatabaseObjects, SearchAbleObjects {

	private ID id;
	private Port port;
	
	
	public Container(Port port) {
		this.id = new ContainerID();
		this.port = port;
	}


	@Override
	public SearchAbleObjects universelGet(SearchAbleObjects searchableobject) {
		// TODO Auto-generated method stub
		if (searchableobject instanceof Port) {
			return port;
		}
		else if (searchableobject instanceof ID) {
			return id;
		} 
		else {
			return null;
		}
	}


	@Override
	public boolean equal(SearchAbleObjects anotherSearchAbleUserObjects) {
		if (anotherSearchAbleUserObjects.equal(id)) {
			return true;
		}
		else {
			return false;
		}	
	}

	@Override
	public String get() {
		return id.get();
	}

}
