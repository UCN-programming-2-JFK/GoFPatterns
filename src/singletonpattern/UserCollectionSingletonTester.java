package singletonpattern;

public class UserCollectionSingletonTester {

	public static void main(String[] args) {
		
		//Create two singelton references
		UserCollectionSingleton users1 = UserCollectionSingleton.getInstance();
		UserCollectionSingleton users2 = UserCollectionSingleton.getInstance();

		//add names to the two object references
		System.out.println("Adding Anna and Bob to object reference 'users1'");
		users1.addUsername("Anna");
		users1.addUsername("Bob");
		
		System.out.println("Adding Claire and Dennis to object reference 'users2'");
		users2.addUsername("Claire");
		users2.addUsername("Dennis");
		
		//print the names via the two object references
		System.out.println();
		System.out.println("Printing contents of object reference 'users1'");
		for(String username : users1.getUsernameList()){
			System.out.println(username);
		}
		
		System.out.println();
		System.out.println("Printing contents of object reference 'users2'");
		for(String username : users2.getUsernameList()){
			System.out.println(username);
		}
	}
}