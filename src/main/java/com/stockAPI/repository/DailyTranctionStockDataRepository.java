package com.stockAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockAPI.model.DailyTranctionStockData;

@Repository
public interface DailyTranctionStockDataRepository extends JpaRepository<DailyTranctionStockData, Integer> {
	

 
}
