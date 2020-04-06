package user;

public class PersonName implements StringSearchAbleObjects {
	private String personname;
	
	PersonName(String personname) {
		this.personname = personname;
	}
	
	public String get() {
		return personname;
	}
	
	public void set(String personname) {
		this.personname = personname;
	}

	@Override
	public boolean equal(StringSearchAbleObjects anotherSearchAbleUserObjects) {
		if (personname == anotherSearchAbleUserObjects.get()) {
			return true;
		} else {
			return false;
		}
	}


	
	
}
