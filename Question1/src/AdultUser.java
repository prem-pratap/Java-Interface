//AdultUser class implementing LibraryUser interface
public class AdultUser implements LibraryUser {
	int age;
	String bookType;
	
	public AdultUser(int age,String bookType) {
		this.age=age;
		this.bookType=bookType;
	}
	public void registerAccount() {
		if(age>12) 
			System.out.println("You have successfully registered under an Adult Account");
		else if(age<12)
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		
	}
	public void requestBook() {
		if(bookType.equalsIgnoreCase("Fiction")&& age>12)
			System.out.println("Book Issued successfully, please return the book within 7 days");
		else 
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		
	}
	
}
