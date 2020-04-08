package backend.objects;

import java.util.UUID;

public class ID {
	
	private String id;
	
	public ID(String identifier) {
		this.id = identifier + "-" + UUID.randomUUID().toString();
	}	

	public String getID() {
		return id;
	}
}





