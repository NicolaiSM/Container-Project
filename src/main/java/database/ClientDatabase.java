package database;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientDatabase extends UserDatabase {
	
	private static ClientDatabase single_instance = null; 
	
    public static ClientDatabase getInstance()  { 
        if (single_instance == null) { single_instance = new ClientDatabase(); }
  
        return single_instance; 
    } 
    

}
