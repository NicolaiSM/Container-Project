package backend.database;

import java.util.ArrayList;

public interface SimpelDatabase<T> {
	
	abstract Integer getSize();
	ArrayList<T> getList();
	void AddElement(T databaseobject); 

}
