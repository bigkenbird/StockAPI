package com.stockAPI.enumsave;

public enum StockUserServiceExceptionEnum {
	
	
	CREATE_USER_ACCOUNT_EMPTY(1,"新增會員時，帳號為空值"),
	CREATE_USER_NAME_EMPTY(2,"新增會員時，姓名為空值"),
	CREATE_USER_PASSWORD_EMPTY(3,"新增會員時，密碼為空值"),
	CREATE_USER_ACCOUNT_ILLEGAL(4,"新增會員時，帳號不合法"),
	CREATE_USER_NAME_ILLEGAL(5,"新增會員時，姓名不合法"),
	CREATE_USER_PASSWORD_ILLEGAL(6,"新增會員時，密碼不合法");
	
	private  Integer code;
	private String message;
	
	
	private StockUserServiceExceptionEnum( Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
