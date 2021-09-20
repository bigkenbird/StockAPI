package com.stockAPI.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	
	private String account;
	
	private String name;
	
	private String password;
	
	
	public User(String account,String name,String password) {
		this.account=account;
		this.name=name;
		this.password=password;
	}

}
