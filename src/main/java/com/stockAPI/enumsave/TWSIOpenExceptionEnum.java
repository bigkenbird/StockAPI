package com.stockAPI.enumsave;

public enum TWSIOpenExceptionEnum {
	
	FINANCE_GENERAL_BALANCE_SHEET_SEARCH_NO_DATA(1,"查詢一般業公發公司資產負債表 無資料"),
	FINANCE_GENERAL_BALANCE_SHEET_INSERT_FAIL(2,"一般業公發公司資產負債表 寫入資料庫錯誤");
	
	private  Integer code;
	private String message;
	
	
	private TWSIOpenExceptionEnum( Integer code, String message) {
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
