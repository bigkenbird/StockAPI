package com.stockAPI.exception;


public class BaseException extends RuntimeException {
	

	private static final long serialVersionUID = 250218130170482890L;
	
	public Integer code;
	public String message;
	

}
