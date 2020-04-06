package database;

import java.util.ArrayList;

import user.User;

public class Match {
	
	ArrayList<User> searchresult;
	
	Match(ArrayList<User> searchresult) {
		this.searchresult = new ArrayList<User>(searchresult);
	}
	
	public boolean noMatch() {
		if (searchresult.size()==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean anyMatch() {
		if (searchresult.size()>0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean oneMatch() {
		if (searchresult.size()==1) {
			return true;
		} else {
			return false;
		}
	}
	
	public Integer countMatch() {
		return searchresult.size();
	}
	
	public ArrayList<User> getResult() {
		return searchresult;
	}
}
