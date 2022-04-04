package com.stockAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockAPI.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByAccount(String account);
}
