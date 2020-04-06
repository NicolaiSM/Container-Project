package user;

public class Person {
	
	private PersonName name;
	private PersonEmail email;
	
	
	
	public Person(String name, String email) {
		super();
		this.name = new PersonName(name);
		this.email = new PersonEmail(email);
	}
	public String getNameString() {
		return name.get();
	}
	public void setNameString(String name) {
		this.name.set(name);;
	}
	public String getEmailString() {
		return email.get();
	}
	public void setEmailString(String email) {
		this.email.set(email);
	}
	public PersonName getName() {
		return name;
	}
	public void setName(PersonName name) {
		this.name = name;
	}
	public PersonEmail getEmail() {
		return email;
	}
	public void setEmail(PersonEmail email) {
		this.email = email;
	}
	
	public boolean equal(Person anotherperson) {
		if (name.equal(anotherperson.getName()) && email.equal(anotherperson.getEmail()) ) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
