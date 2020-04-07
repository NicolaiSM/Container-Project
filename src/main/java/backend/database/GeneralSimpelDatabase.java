package backend.database;
import java.util.ArrayList;
import java.util.stream.Collectors;

import backend.objects.SearchAbleObjects;

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
	
	public ArrayList<T> getList() {
		return list;
	}
	
	public void newQuery(ArrayList<SearchAbleObjects> userobjectlist) {
		QueryDatabase.newQuery(list, userobjectlist);
	}
	
	public class QueryDatabase<T extends DatabaseObjects> {
		
		public static QueryDatabase<T> newQuery(ArrayList<T> list,ArrayList<SearchAbleObjects> userobjectlist) {
			return new QueryDatabase(list, userobjectlist);
		}
		
		private QueryDatabase(ArrayList<T> list,ArrayList<SearchAbleObjects> userobjectlist) {
			SearchInDatabase(list, userobjectlist);
		}
		
		public void SearchInDatabase(ArrayList<T> list,ArrayList<SearchAbleObjects> userobjectlist) {
			list.stream().filter( (object) -> IsEqual(object, userobjectlist)).collect(Collectors.toList());
		}
		
		public boolean IsEqual(T databaseobject, ArrayList<SearchAbleObjects> searchableobjectlist) {
			return searchableobjectlist.stream().allMatch( (searchableobject) -> IsEqual(databaseobject, searchableobject));
		}
		
		public boolean IsEqual(T object, SearchAbleObjects userobject) {
			return object.universelGet(userobject).equal(userobject);
		}
		
		
		
	}

	
}
