package com.stockAPI.exception;

public class TWSIOpenSeviceException extends BaseException {

	public TWSIOpenSeviceException(Integer code,String message) {
		super(code, message);
	}
	
	private static final long serialVersionUID = 7475984669441482478L;
}
