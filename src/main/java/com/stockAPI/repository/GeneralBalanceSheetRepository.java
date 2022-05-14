package com.stockAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockAPI.model.entity.GeneralBalanceSheetEntity;

@Repository
public interface GeneralBalanceSheetRepository extends JpaRepository<GeneralBalanceSheetEntity, Integer>{
	

}
