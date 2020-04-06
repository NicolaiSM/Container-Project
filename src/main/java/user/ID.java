package user;

import java.util.UUID;

public class ID implements StringSearchAbleObjects {
	
	private String identifier;
	private String unique;
	private String id = identifier + "-" + unique;
	
	ID() {unique = UUID.randomUUID().toString();}
	
	public String get() {
		return id;
	}

	@Override
	public boolean equal(StringSearchAbleObjects anotherSearchAbleUserObjects) {
		if (id == anotherSearchAbleUserObjects.get()) {
			return true;
		} else {
			return false;
		}
	}


	


}





