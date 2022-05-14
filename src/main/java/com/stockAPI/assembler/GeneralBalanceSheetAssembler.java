package com.stockAPI.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.stockAPI.model.entity.GeneralBalanceSheetEntity;
import com.stockAPI.model.financial_statement.GeneralBalanceSheet;

public class GeneralBalanceSheetAssembler {
	
	public static GeneralBalanceSheetEntity toEntity(GeneralBalanceSheet generalBalanceSheet) {
		GeneralBalanceSheetEntity generalBalanceSheetEntity = new GeneralBalanceSheetEntity();
		BeanUtils.copyProperties(generalBalanceSheet, generalBalanceSheetEntity);
		return generalBalanceSheetEntity;
	}
	
	public static List<GeneralBalanceSheetEntity> toEntity(List<GeneralBalanceSheet> generalBalanceSheets) {
		List<GeneralBalanceSheetEntity> generalBalanceSheetEntitys = generalBalanceSheets.stream().map(
				data->{
					GeneralBalanceSheetEntity generalBalanceSheetEntity = new GeneralBalanceSheetEntity();
					BeanUtils.copyProperties(generalBalanceSheetEntity, data);
					return generalBalanceSheetEntity;
				}).collect(Collectors.toList());
		return generalBalanceSheetEntitys;
	}

}
