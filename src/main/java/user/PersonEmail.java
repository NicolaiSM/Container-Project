package user;

public class PersonEmail implements StringSearchAbleObjects {
	
	private String personemail;
	
	PersonEmail(String personemail) {
		this.personemail = personemail;
	}
	
	public String get() {
		return personemail;
	}
	
	public void set(String personemail) {
		this.personemail = personemail;
	}
	
	public boolean equal(PersonEmail anotherpersonemail) {
		if (personemail == anotherpersonemail.get()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean equal(StringSearchAbleObjects anotherSearchAbleUserObjects) {
		if (personemail == anotherSearchAbleUserObjects.get()) {
			return true;
		} else {
			return false;
		}
	}

}
