package user;

public class GeneralUser implements User {

	
	private Person contactperson;
	private CompanyName companyname;
	private CompanyAddress companyaddress;
	private ID id;
	
	
	public GeneralUser(String companyname, String companyaddress, String contactperonsname, String contactperonsemail) {
		contactperson = new Person(contactperonsemail, contactperonsemail);
		this.companyname = new CompanyName(companyname);
		this.companyaddress = new CompanyAddress(companyaddress);	
		this.id = new clientID();
	}
	
	
	public Person getContactperson() {
		return contactperson;
	}
	public void setContactperson(Person contactperson) {
		this.contactperson = contactperson;
	}
	
	
	public String getCompanyNameString() {
		return companyname.get();
	}
	
	public void setCompanyNameString(String companyname) {
		this.companyname.set(companyname);
	}


	@Override
	public String getCompanyAddressString() {
		return companyaddress.get();
	}


	@Override
	public void setCompanyAddressString(String companyaddress) {
		this.companyaddress.set(companyaddress);
		
	}
	
	@Override
	public CompanyName getCompanyName() {
		return companyname;
	}


	@Override
	public void setCompanyName(CompanyName companyname) {
		this.companyname = companyname;
		
	}


	@Override
	public CompanyAddress getCompanyAddress() {
		return companyaddress;
	}


	@Override
	public void setCompanyAddress(CompanyAddress companyaddress) {
		this.companyaddress = companyaddress;
		
	}


	@Override
	public String getId() {
		return id.get();
	}


	@Override
	public String getContactPersonNameString() {
		return contactperson.getNameString();
	}


	@Override
	public void setContactPersonNameString(String name) {
		contactperson.setNameString(name);
		
	}


	@Override
	public String getContactPersonEmailString() {
		return contactperson.getEmailString();
	}


	@Override
	public void setContactPersonEmailString(String email) {
		contactperson.setEmailString(email);
		
	}


	@Override
	public PersonName getContactPersonName() {
		return contactperson.getName();
	}


	@Override
	public void setContactPersonName(PersonName name) {
		contactperson.setName(name);
		
	}


	@Override
	public PersonEmail getContactPersonEmail() {
		return contactperson.getEmail();
	}


	@Override
	public void setContactPersonEmail(PersonEmail email) {
		contactperson.setEmail(email);
		
	}


	@Override
	public SearchAbleObjects universelGet(SearchAbleObjects anotherSearchAbleUserObjects) {
		
		if (anotherSearchAbleUserObjects instanceof PersonEmail) {
			return contactperson.getEmail();
		} else if (anotherSearchAbleUserObjects instanceof PersonName) {
			return contactperson.getName();
		} else if (anotherSearchAbleUserObjects instanceof CompanyAddress) {
			return companyaddress;
		} else if (anotherSearchAbleUserObjects instanceof CompanyName) {
			return companyname;
		} else if (anotherSearchAbleUserObjects instanceof ID) {
			return id;
		} else {
			return null;
		}

	}


	@Override
	public boolean equal(User anotheruser) {
		if (contactperson.equal(anotheruser.getContactperson()) && 
				companyname.equal(anotheruser.getCompanyName()) && 
				companyaddress.equal(anotheruser.getCompanyAddress()) ) {
			return true;
		} else {
			return false;
		}

	}

	
	
}
