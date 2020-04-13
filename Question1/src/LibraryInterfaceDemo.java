//class LibraryInterfaceDemo to test functionalities
public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers k1=new KidUsers(18, "kids");
		KidUsers k2=new KidUsers(11,"kids");
		AdultUser a1=new AdultUser(21, "fiction");
		AdultUser a2=new AdultUser(10, "fiction");
		//accessing methods using k1 object of KidUsers class
		k1.registerAccount();
		k1.requestBook();
		//accessing methods using k2 object of KidUsers class
		k2.registerAccount();
		k2.requestBook();
		//accessing methods using a1 object of AdultUser class
		a1.registerAccount();
		a1.requestBook();
		//accessing methods using a2 object of AdultUser class
		a2.registerAccount();
		a2.requestBook();
		
	}

}
