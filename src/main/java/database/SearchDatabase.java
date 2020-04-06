package database;

import java.util.ArrayList;
import java.util.stream.Collectors;

import user.SearchAbleObjects;
import user.StringSearchAbleObjects;
import user.User;

public class SearchDatabase {
	
	
	public static SearchDatabase newSearch() {
		return new SearchDatabase();
	}
	
	public Match Search(UserDatabase list,StringSearchAbleObjects userobject) {
		return new Match(new ArrayList<User>(list.getList().stream().filter((user) -> IsEqual(user, userobject)).collect(Collectors.toList())));
	}
	

	public Match Search(ArrayList<User> list,StringSearchAbleObjects userobject) {
		return new Match(new ArrayList<User>(list.stream().filter((user) -> IsEqual(user, userobject)).collect(Collectors.toList())));
	}
	
	
	public Match Search(ArrayList<User> list,ArrayList<StringSearchAbleObjects> userobjectlist) {
		return new Match(new ArrayList<User>(list.stream().filter((user) -> IsEqual(user, userobjectlist)).collect(Collectors.toList())));
	}
	
	
	public Match Search(UserDatabase list,ArrayList<StringSearchAbleObjects> userobjectlist) {
		return new Match(new ArrayList<User> (list.getList().stream().filter((user) -> IsEqual(user, userobjectlist)).collect(Collectors.toList())));
		
	}
	
	public Match Search(UserDatabase list, User anotheruser) {
		return new Match(new ArrayList<User>(list.getList().stream().filter((user) -> IsEqual(user, anotheruser)).collect(Collectors.toList())));
		
	}
	
	public Match Search(ArrayList<User> list, User anotheruser) {
		return new Match(new ArrayList<User>(list.stream().filter((user) -> IsEqual(user, anotheruser)).collect(Collectors.toList())));
		
	}
	
	
	public boolean IsEqual(User user, StringSearchAbleObjects userobject) {
		return ((StringSearchAbleObjects) user.universelGet(userobject)).equal(userobject);
	}
	
	
	
	public boolean IsEqual(User user, ArrayList<StringSearchAbleObjects> userobjectlist) {
		return userobjectlist.stream().allMatch( (userobject) -> IsEqual(user, userobject));
	}
	
	public boolean IsEqual(User user, User anotheruser) {
		return user.equal(anotheruser);
	}
	
	

	
	
}
