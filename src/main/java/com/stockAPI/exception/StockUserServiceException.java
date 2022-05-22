package com.stockAPI.exception;

public class StockUserServiceException extends BaseException{

	private static final long serialVersionUID = 4716124842197423297L;
	
	public StockUserServiceException(Integer code,String message) {
		super(code,message);
	}
}
