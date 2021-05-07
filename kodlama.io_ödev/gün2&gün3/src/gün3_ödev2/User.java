package gün3_ödev2;

public class User {
	
	int id;
	String firstName;
	String lastName;
	String email;
	String Password;
	
	public User(){
		
	}
	
	public User(int id, String firstName, String lastName, String email, String Password){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.Password = Password;
	}
}
