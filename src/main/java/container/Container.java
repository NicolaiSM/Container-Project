package container;

import backend.objects.*;
import backend.database.*;

public class Container implements DatabaseObjects {

	private ID id;

	
	public Container() {
		this.id = new ContainerID();
	}


	@Override
	public SearchAbleObjects universelGet(SearchAbleObjects searchableobject) {
		// TODO Auto-generated method stub
		return null;
	}

}
