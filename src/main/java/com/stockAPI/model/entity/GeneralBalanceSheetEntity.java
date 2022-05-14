package com.stockAPI.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "general_balance_sheet")
public class GeneralBalanceSheetEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="RELEASE_DATE")
	private String release_date; //出表日期
	
	@Column(name="YEAR")
	private String year; //年度
	
	@Column(name="SEASON")
	private String season; //季別
	
	@Column(name="COMPANYCODE")
	private String companyCode; //公司代號
	
	@Column(name="COMPANYNAME")
	private String companyName; //公司名稱
	
	@Column(name="CURRENT_ASSETS")
	private String current_assets; //流動資產
	
	@Column(name="NONCURRENT_ASSETS")
	private String nonCurrent_assets; //非流動資產
	
	@Column(name="TOTAL_ASSETS")
	private String total_assets; //資產總計
	
	@Column(name="CURRENT_LIABILITIES")
	private String current_liabilities; //流動負債
	
	@Column(name="NONCURRENT_LIABILITIES")
	private String nonCurrent_liabilities; //非流動負債
	
	@Column(name="TOTAL_LIABILITIES")
	private String total_liabilities; //負債總計
	
	@Column(name="CAPITAL")
	private String capital; //股本
	
	@Column(name="SECURITY_TOKEN_OFFERING")
	private String security_token_offering; //權益─具證券性質之虛擬通貨
	
	@Column(name="ADDITIONAL_PAID_IN_CAPITAL")
	private String additional_paid_in_capital; //資本公積
	
	@Column(name="RETAINED_EARNINGS")
	private String retained_earnings; //保留盈餘
	
	@Column(name="OTHER_RIGHTS")
	private String other_rights; //其他權益
	
	@Column(name="TREASURY_STOCK")
	private String treasury_stock; //庫藏股票
	
	@Column(name="OWNERS_EQUITY_ATTRIBUTABLE_TO_PARENT_COMPANY")
	private String owners_equity_attributable_to_parent_company; //歸屬於母公司業主之權益合計
	
	@Column(name="RIGHTS_IN_SAME_CONTROLLER")
	private String rights_in_same_controller; //共同控制下前手權益
	
	@Column(name="RIGHTS_IN_DIFFERENT_CONTROLLER")
	private String rights_in_different_controller; //合併前非屬共同控制股權
	
	@Column(name="NONCONTROLLING_INTERESTS")
	private String noncontrolling_interests; //非控制權益
	
	@Column(name="TOTAL_EQUITY")
	private String total_equity; //權益總計
	
	@Column(name="WAIT_TO_CANCEL_CAPITAL")
	private String wait_to_cancel_capital; //待註銷股本股數（單位：股）
	
	@Column(name="UNISSUES_SHARES")
	private String unIssues_shares; //預收股款（權益項下）之約當發行股數（單位：股）
	
	@Column(name="TOTAL_HANDLE_TREASURY_STOCK")
	private String total_handle_treasury_stock ; //母公司暨子公司所持有之母公司庫藏股股數（單位：股）
	
	@Column(name="BOOK_VALUE_PER_SHARE")
	private String book_value_per_share; //每股參考淨值
}
