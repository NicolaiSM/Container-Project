package backend.objects;

import java.util.UUID;

public class ID extends StringObjects {
	
	public ID(String identifier) {
		super(identifier + "-" + UUID.randomUUID().toString());
	}	

}





