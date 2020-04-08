package backend.database;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import backend.objects.SearchAbleObjects;


public class GeneralSimpelDatabase<T extends DatabaseObjects> implements SimpelDatabase<T> {

	private ArrayList<T> list = new ArrayList<T>();
	
	@Override
	public Integer getSize() {
		Integer size;
		size = list.size();
		return size;
	}

	@Override
	public void AddElement(T databaseobject) {
		list.add(databaseobject);
	}
	
	
	
	public boolean AddUniqueElement(T databaseobject, ArrayList<SearchAbleObjects> searchableobjectslist) {
		
		if (anyMatch(searchableobjectslist)) {
			return false;
		} else {
			 AddElement(databaseobject);
			 return true;
		}
	}
	
	
	public ArrayList<T> getList() {
		return list;
	}
	
	public List<T> newQuery( ArrayList<SearchAbleObjects> userobjectlist) {
		return this.list.stream().filter((databaseobject) -> IsEqual(databaseobject, userobjectlist)).collect(Collectors.toList());
	}
	

	
	
	public boolean IsEqual(T databaseobject, ArrayList<SearchAbleObjects> searchableobjectlist) {
		
		for (SearchAbleObjects object : searchableobjectlist) {
			if (IsEqual(databaseobject, object)) {
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean IsEqual(T databaseobject, SearchAbleObjects object) {
		return databaseobject.universelGet(object).equal(object);
	}
	
	public boolean anyMatch(ArrayList<SearchAbleObjects> userobjectlist) {
		
		if(newQuery(userobjectlist).size() > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	

	
}
