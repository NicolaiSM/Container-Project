package database;
import java.util.ArrayList;

import user.User;

public interface SimpelDatabase {
	
	abstract Integer getSize();
	void AddElement(User company);
	ArrayList<User> getList(); 

}
