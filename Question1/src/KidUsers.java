//KidUsers class implementing interface LibraryUser
public class KidUsers implements LibraryUser {
	int age;
	String bookType;
	
	public KidUsers(int age,String bookType) {
		this.age=age;
		this.bookType=bookType;
		
	}
	public void registerAccount() {
		if(age<12) 
			System.out.println("You have successfully registered under Kids Account");
		else if(age>12)
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		
	}
	public void requestBook() {
		if(bookType.equalsIgnoreCase("Kids") && age <12)
			System.out.println("Book Issued successfully, please return the book within 10 days");
		else 
			System.out.println("Oops, you are allowed to take only kids books");
		
	}

}
