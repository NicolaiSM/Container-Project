package backend.user;

import backend.database.DatabaseObjects;
import backend.objects.CompanyAddress;
import backend.objects.CompanyName;
import backend.objects.ID;
import backend.objects.PersonEmail;
import backend.objects.PersonName;
import backend.objects.SearchAbleObjects;

public interface User extends SearchAbleObjects, DatabaseObjects {
	
	Person getContactperson();
	void setContactperson(Person contactperson);
	CompanyName getCompanyName(); 
	void setCompanyName(CompanyName companyname);
	CompanyAddress getCompanyAddress();
	void setCompanyAddress(CompanyAddress companyaddress);
	
	ID getID();	
	
	String getContactPersonNameString();
	void setContactPersonNameString(String name);
	String getContactPersonEmailString();
	void setContactPersonEmailString(String email);
	
	PersonName getContactPersonName();
	void setContactPersonName(PersonName name);
	PersonEmail getContactPersonEmail();
	void setContactPersonEmail(PersonEmail email);
	
	SearchAbleObjects universelGet(SearchAbleObjects anotherSearchAbleUserObjects);
	
	void setCompanyAddressString(String companyaddress);
	String getCompanyAddressString();
	
	
}
