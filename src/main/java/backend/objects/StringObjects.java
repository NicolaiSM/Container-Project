package backend.objects;

public class StringObjects implements StringSearchAbleObjects {
	
	private String stringrepresentationofobject;
	
	public StringObjects(String stringrepresentationofobject) {
		this.stringrepresentationofobject = stringrepresentationofobject;
	}
	
	public String get() {
		return stringrepresentationofobject;
	}
	
	public void set(String stringrepresentationofobject) {
		this.stringrepresentationofobject = stringrepresentationofobject;
	}
	
	public boolean equal(SearchAbleObjects  anotherSearchAbleUserObjects) {
		if (stringrepresentationofobject == anotherSearchAbleUserObjects.get()) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
