package com.stockAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockAPI.model.entity.Bwibbu;

@Repository
public interface BwibbuRepository extends JpaRepository<Bwibbu, Integer> {
	
	

	
}
