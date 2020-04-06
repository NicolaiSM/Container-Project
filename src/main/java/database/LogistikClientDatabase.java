package database;
import java.util.ArrayList;

public class LogistikClientDatabase extends UserDatabase {
	
    private static LogistikClientDatabase single_instance = null; 

    
    // static method to create instance of Singleton class 
    public static LogistikClientDatabase getInstance()  { 
        if (single_instance == null) { single_instance = new LogistikClientDatabase(); }
  
        return single_instance; 
    } 

}
