package backend.database;

import backend.objects.CompanyAddress;
import backend.objects.CompanyName;
import backend.objects.PersonEmail;
import backend.objects.PersonName;
import backend.objects.StringObjects;

public class UserObjectFactory {
	
	public static StringObjects UserObjectFactoryMethod(String stringobjecttype, String stringinobject) {
		
		if(stringobjecttype == "COMPANYNAME") {
			return new CompanyName(stringinobject);
		} else if (stringobjecttype == "COMPANYADDRESS") {
			return new CompanyAddress(stringinobject);
		} else if (stringobjecttype == "PERSONNAME") {
			return new PersonName(stringinobject);
		} else if (stringobjecttype == "PERSONEMAIL") {
			return new PersonEmail(stringinobject);
		} else {
			return null;
		}
		
	}
	
	
}
