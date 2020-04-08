package backend.database;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import java.lang.reflect.Field;


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
	
	
	
	public boolean AddUniqueElement(T databaseobject, ArrayList<Pair<?,?>> searchableobjectslist) {
		
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
	
	public List<T> newQuery(String query) {
		return this.list.stream().filter((databaseobject) -> fieldAnyMatch(databaseobject, query)).collect(Collectors.toList());
	}
	
	public List<T> newQuery(ArrayList<Pair<?,?>> query) {
		return this.list.stream().filter((databaseobject) -> fieldAnyMatch(databaseobject, query)).collect(Collectors.toList());
	}
	
	public boolean fieldAnyMatch(T databaseobject, String value) {
		for(Field attribute: databaseobject.getClass().getDeclaredFields()) {
			if(attribute.equals(value)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean fieldAnyMatch(T databaseobject, ArrayList<Pair<?,?>> value) {
		for(Field attribute: databaseobject.getClass().getDeclaredFields()) {
			if(attribute.equals(value)) {
				return true;
			}
		}
		
		return false;
	}

	
	public boolean anyMatch(String value) {
		
		if(newQuery(value).size() > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean anyMatch(ArrayList<Pair<?,?>> value) {
		
		if(newQuery(value).size() > 0) {
			return true;
		} else {
			return false;
		}
	}
	

	
	
	
	

	
}
