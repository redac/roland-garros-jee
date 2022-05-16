package org.garros;

public class User {
	private int uid;
	private String username;
	private String accountType;
	private String password;

	/**
	 * @param uid
	 * @param username
	 * @param accountType
	 * @param password
	 */
	public User(int uid, String username, String accountType, String password) {
		this.uid = uid;
		this.username = username;
		this.accountType = accountType;
		this.password = password;
	}
	
	public User() {
		
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
