package database;
import java.util.ArrayList;
import java.util.stream.Collectors;

import user.User;

public abstract class UserDatabase implements SimpelDatabase {

	ArrayList<User> userlist = new ArrayList<User>();
	
	// static method to create instance of Singleton class 
	public static UserDatabase getInstance() {
		return null;
	}
		
	
	@Override
	public Integer getSize() {
		Integer size;
		size = userlist.size();
		return size;
	}

	@Override
	public void AddElement(User company) {
		userlist.add(company);
	}
	
	public ArrayList<User> getList() {
		return userlist;
	}
	
}
