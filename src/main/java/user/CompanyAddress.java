package user;

public class CompanyAddress implements StringSearchAbleObjects {
	
	private String companyaddress;

	public CompanyAddress(String companyaddress) {
		super();
		this.companyaddress = companyaddress;
	}

	public String get() {
		return companyaddress;
	}

	public void set(String companyaddress) {
		this.companyaddress = companyaddress;
		
	}

	@Override
	public boolean equal(StringSearchAbleObjects anotherSearchAbleUserObjects) {
		if (companyaddress == anotherSearchAbleUserObjects.get()) {
			return true;
		} else {
			return false;
		}
	}
	
}
