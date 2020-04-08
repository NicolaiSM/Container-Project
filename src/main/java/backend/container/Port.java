package backend.container;


import backend.database.DatabaseObjects;
import backend.objects.SearchAbleObjects;
import backend.objects.StringObjects;

public class Port extends StringObjects implements DatabaseObjects {

	public Port(String port) {
		super(port);
	}

	@Override
	public SearchAbleObjects universelGet(SearchAbleObjects searchableobject) {
		// TODO Auto-generated method stub
		return null;
	}

}
