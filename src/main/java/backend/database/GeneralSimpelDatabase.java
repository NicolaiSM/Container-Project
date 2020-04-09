package backend.database;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import java.lang.reflect.Field;


public class GeneralSimpelDatabase<DatabaseObject> {

	private ArrayList<DatabaseObject> list = new ArrayList<DatabaseObject>();
	
	
	public Integer getSize() {
		Integer size;
		size = list.size();
		return size;
	}

	
	public void AddElement(DatabaseObject databaseobject) {
		list.add(databaseobject);
	}
	
	
	
	public boolean AddUniqueElement(DatabaseObject databaseobject, ArrayList<Pair> searchableobjectslist) {
		
		if (anyMatch(searchableobjectslist)) {
			return false;
		} else {
			 AddElement(databaseobject);
			 return true;
		}
	}
	
	
	public ArrayList<DatabaseObject> getList() {
		return list;
	}
	
	public List<DatabaseObject> newQuery(String query) {
		return this.list.stream().filter((databaseobject) -> fieldAnyMatch(databaseobject, query)).collect(Collectors.toList());
	}
	
	public List<DatabaseObject> newQuery(ArrayList<Pair> query) {
		return this.list.stream().filter((databaseobject) -> fieldAnyMatch(databaseobject, query)).collect(Collectors.toList());
	}
	
	public boolean fieldAnyMatch(DatabaseObject databaseobject, String value) {
		for(Field attribute: databaseobject.getClass().getDeclaredFields()) {
			if(attribute.equals(value)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean fieldAnyMatch(DatabaseObject databaseobject, ArrayList<Pair> value) {
		for(Pair pair : value) {
			try {
				if(databaseobject.getClass().getField(pair.getFirst()).toString().equals(pair.getSecond())) {
					return true;
				} 
			} catch (NoSuchFieldException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
	
	public boolean anyMatch(ArrayList<Pair> value) {
		
		if(newQuery(value).size() > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	

	
}
