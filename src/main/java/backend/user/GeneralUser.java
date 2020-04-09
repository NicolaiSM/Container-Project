package backend.user;

import backend.database.DatabaseObject;
import backend.objects.*;


public class GeneralUser extends DatabaseObject {

	
	private String contactperonsname;
	private String contactperonsemail;
	private String companyname;
	private String companyaddress;
	private ID id;
	
	
	public GeneralUser(String companyname, String companyaddress, String contactperonsname, String contactperonsemail) {
		this.contactperonsname = contactperonsname;
		this.contactperonsemail = contactperonsemail;
		this.companyname = companyname;
		this.companyaddress = companyaddress;	
		this.id = new clientID();
		
		
	}
	
	public String getContactperonsname() {
		return contactperonsname;
	}


	public void setContactperonsname(String contactperonsname) {
		this.contactperonsname = contactperonsname;
	}


	public String getContactperonsemail() {
		return contactperonsemail;
	}


	public void setContactperonsemail(String contactperonsemail) {
		this.contactperonsemail = contactperonsemail;
	}


	public String getCompanyname() {
		return companyname;
	}


	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}


	public String getCompanyaddress() {
		return companyaddress;
	}


	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}


	public String getIdString() {
		return id.getID();
	}








	
	
	






	
	
}
