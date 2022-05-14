package com.stockAPI.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TWSIOpenSeviceException extends BaseException {

	public TWSIOpenSeviceException(Integer code,String message) {
		this.code=code;
		this.message=message;
	}
	
	private static final long serialVersionUID = 7475984669441482478L;
	
	

}
