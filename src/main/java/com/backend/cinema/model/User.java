package com.backend.cinema.model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 
	 private String email;
	 
	 private String lastName;
	 
	 private String firstName;
	 
	 private String password;
	 
	 /*
	  * @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
	  * */

	public User() {}

	public User(String email, String lastName, String firstName, String password) {
		super();
		this.email = email;
		this.lastName = lastName;
		this.firstName = firstName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	 
}
