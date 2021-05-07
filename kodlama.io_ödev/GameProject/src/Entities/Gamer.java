package Entities;

public class Gamer {
	
	private int gamerId;
	private long identityNumber;
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Gamer(){
		
	}
	
	
	public Gamer(int gamerId, long identityNumber, String firstName, String lastName, int birthYear) {
		this.gamerId = gamerId;
		this.identityNumber = identityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	
	
	public int getGamerId() {
		return gamerId;
	}


	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}


	public long getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(long identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
