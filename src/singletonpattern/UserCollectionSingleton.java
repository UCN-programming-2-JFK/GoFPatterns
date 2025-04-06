package singletonpattern;

import java.util.*;

public class UserCollectionSingleton {

	//  SINGLETON CODE	///////////////////////////////
	private static UserCollectionSingleton instance;

	private UserCollectionSingleton() {}

	public static synchronized UserCollectionSingleton getInstance() {
		if (instance == null) {
			instance = new UserCollectionSingleton();
		}

		return instance;
	}
	
	//  FUNCTIONALITY	///////////////////////
	private List<String> users = new ArrayList<String>();
	public void addUsername(String username) {
		users.add(username);
	}

	public List<String> getUsernameList(){
		return new ArrayList<String>(users);
	}
}