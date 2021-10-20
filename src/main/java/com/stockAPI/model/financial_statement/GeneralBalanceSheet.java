package com.stockAPI.model.financial_statement;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GeneralBalanceSheet {
	
	@JsonAlias("出表日期")
	private String release_date;
	
	@JsonAlias("年度")
	private String year;
	
	@JsonAlias("季別")
	private String season;
	
	@JsonAlias("公司代號")
	private String companyCode;
	
	@JsonAlias("公司名稱")
	private String companyName;
	
	@JsonAlias("流動資產")
	private String current_assets;
	
	@JsonAlias("非流動資產")
	private String nonCurrent_assets;
	
	@JsonAlias("資產總計")
	private String total_assets;
	
	@JsonAlias("流動負債")
	private String current_liabilities;
	
	@JsonAlias("非流動負債")
	private String nonCurrent_liabilities;
	
	@JsonAlias("負債總計")
	private String total_liabilities;
	
	@JsonAlias("股本")
	private String capital;
	
	@JsonAlias("權益─具證券性質之虛擬通貨")
	private String security_token_offering;
	
	@JsonAlias("資本公積")
	private String additional_paid_in_capital;
	
	@JsonAlias("保留盈餘")
	private String retained_earnings;
	
	@JsonAlias("其他權益")
	private String other_rights;
	
	@JsonAlias("庫藏股票")
	private String treasury_stock;
	
	@JsonAlias("歸屬於母公司業主之權益合計")
	private String owners_equity_attributable_to_parent_company;
	
	@JsonAlias("共同控制下前手權益")
	private String rights_in_same_controller;
	
	@JsonAlias("合併前非屬共同控制股權")
	private String rights_in_different_controller;
	
	@JsonAlias("非控制權益")
	private String noncontrolling_interests;
	
	@JsonAlias("權益總計")
	private String total_equity;
	
	@JsonAlias("待註銷股本股數（單位：股）")
	private String wait_to_cancel_capital;
	
	@JsonAlias("預收股款（權益項下）之約當發行股數（單位：股）")
	private String unIssues_shares;
	
	@JsonAlias("母公司暨子公司所持有之母公司庫藏股股數（單位：股）")
	private String total_handle_treasury_stock ;
	
	@JsonAlias("每股參考淨值")
	private String book_value_per_share;
	


}
