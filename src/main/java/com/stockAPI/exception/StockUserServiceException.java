package com.stockAPI.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class StockUserServiceException extends BaseException{

	private static final long serialVersionUID = 4716124842197423297L;
	
	public StockUserServiceException(Integer code,String message) {
		this.code=code;
		this.message=message;
	}
	

}
