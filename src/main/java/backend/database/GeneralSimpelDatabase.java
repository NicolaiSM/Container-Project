package backend.database;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import backend.objects.StringSearchAbleObjects;


public class GeneralSimpelDatabase<T extends DatabaseObjects> implements SimpelDatabase<T> {

	ArrayList<T> list = new ArrayList<T>();
	
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
	
	
	
	public void AddUniqueElement(T databaseobject, ArrayList<StringSearchAbleObjects> searchableobjectslist) {
		
		if (anyMatch(searchableobjectslist)) {
			
		} else {
			 AddElement(databaseobject);
			 System.out.println("Result from addElement");
			 System.out.println(getList());
			 
		}
	}
	
	
	public ArrayList<T> getList() {
		return list;
	}
	
	public List<T> newQuery( ArrayList<StringSearchAbleObjects> userobjectlist) {
		return this.list.stream().filter((databaseobject) -> IsEqual(databaseobject, userobjectlist)).collect(Collectors.toList());
	}
	

	
	
	public boolean IsEqual(T databaseobject, ArrayList<StringSearchAbleObjects> searchableobjectlist) {
		
		for (StringSearchAbleObjects object : searchableobjectlist) {
			if (IsEqual(databaseobject, object)) {
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean IsEqual(T databaseobject, StringSearchAbleObjects object) {
		return databaseobject.universelGet(object).equal(object);
	}
	
	public boolean anyMatch(ArrayList<StringSearchAbleObjects> userobjectlist) {
		
		System.out.println("Database to search in");
		System.out.println(list);
		System.out.println("Search criteria to search in");
		System.out.println(userobjectlist);
		System.out.println("Resukt from query");
		System.out.println(newQuery(userobjectlist));
		
		if(newQuery(userobjectlist).size() > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	

	
}
