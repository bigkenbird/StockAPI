package com.stockAPI.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	
	private Integer id;
	
	private String account;
	
	private String name;
	
	private String password;
	
	private String authority;
	
	public User() {
		
	}
	
	
	public User(String account,String name,String password,String authority) {
		this.account=account;
		this.name=name;
		this.password=password;
		this.authority=authority;
	}

}
