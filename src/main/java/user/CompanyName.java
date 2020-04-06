package user;

public class CompanyName implements StringSearchAbleObjects {
	
	private String companyname;
	
	public CompanyName(String companyname) {
		super();
		this.companyname = companyname;
	}

	public String get() {
		return companyname;
	}

	public void set(String companyname) {
		this.companyname = companyname;
	}

	@Override
	public boolean equal(StringSearchAbleObjects anotherSearchAbleUserObjects) {
		if (companyname == anotherSearchAbleUserObjects.get()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
