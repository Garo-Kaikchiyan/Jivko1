package model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class User {
	
	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String password;
	private ArrayList<Picture> picturesOwned;
	
	public User(String firstName, String lastName, String username, String password, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		picturesOwned = new ArrayList<>();
	}

	public String getEmail() {
		return email;
	}

	public ArrayList<Picture> getPicturesOwned() {
		return picturesOwned;
	}

	public void setPicturesOwned(ArrayList<Picture> picturesOwned) {
		this.picturesOwned = picturesOwned;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public String getPassword() {
		return password;
	}


	public String getUsername() {
		return username;
	}

}
	
	
	


