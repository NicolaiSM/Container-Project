package backend.database;
import java.util.ArrayList;

import backend.user.User;

public interface SimpelDatabase<T> {
	
	abstract Integer getSize();
	ArrayList<T> getList();
	void AddElement(T databaseobject); 

}
