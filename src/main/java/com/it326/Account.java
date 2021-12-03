package com.it326;

public class Account {

    ScheduleManager manager;
    String lastName;
    String firstName;
    String username;
    String password;
	String notes;

// Constructor
    public Account()
    {
        manager = new ScheduleManager();
        firstName = "";
        lastName = "";
        username = "";
        password = "";
    }

	public Account(String fname, String lname, String uname, String pwd){
		manager = new ScheduleManager();
		firstName = fname.trim();
		lastName = lname.trim();
		username = uname.trim();
		password = pwd.trim();
	}

    // Getters and Setters
	public ScheduleManager getManager() {
		return this.manager;
	}

	public void setManager(ScheduleManager manager) {
		this.manager = manager;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void saveNotes(String notes){
		this.notes = notes;
	}

	public String getNotes(){
		return this.notes;
	}



}