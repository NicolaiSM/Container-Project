package user;



public interface User extends SearchAbleObjects {
	
	Person getContactperson();
	void setContactperson(Person contactperson);
	CompanyName getCompanyName(); 
	void setCompanyName(CompanyName companyname);
	CompanyAddress getCompanyAddress();
	void setCompanyAddress(CompanyAddress companyaddress);
	
	String getId();	
	
	String getContactPersonNameString();
	void setContactPersonNameString(String name);
	String getContactPersonEmailString();
	void setContactPersonEmailString(String email);
	
	PersonName getContactPersonName();
	void setContactPersonName(PersonName name);
	PersonEmail getContactPersonEmail();
	void setContactPersonEmail(PersonEmail email);
	
	SearchAbleObjects universelGet(SearchAbleObjects anotherSearchAbleUserObjects);
	
	boolean equal(User anotheruser);
	void setCompanyAddressString(String companyaddress);
	String getCompanyAddressString();
	
	
}
