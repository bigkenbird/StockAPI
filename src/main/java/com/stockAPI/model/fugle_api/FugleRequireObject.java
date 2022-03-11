package com.stockAPI.model.fugle_api;

import lombok.Data;

@Data
public class FugleRequireObject {
	
	private String symbolId; //個股、指數識別代碼
	private String apiToken; //personal api token
	private String oddLot; //設置 true 回傳零股行情。預設值：false
}
