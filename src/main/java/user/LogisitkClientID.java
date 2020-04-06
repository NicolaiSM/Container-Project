package user;
import database.LogistikClientDatabase;

public class LogisitkClientID extends ID {
	
	private String identifier = "LOG";
	private Integer number;
	
	public LogisitkClientID() {
		this.number = LogistikClientDatabase.getInstance().getSize();
	}	
	
}
