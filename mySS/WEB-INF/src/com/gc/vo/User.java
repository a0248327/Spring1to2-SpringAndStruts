package com.gc.vo;

import java.io.Serializable;

/** @author Hibernate CodeGenerator */
public class User implements Serializable {

	/** identifier field */
	private String id;

	/** persistent field */
	private String username;

	/** persistent field */
	private String password;

	/** full constructor */
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/** default constructor */
	public User() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

}
