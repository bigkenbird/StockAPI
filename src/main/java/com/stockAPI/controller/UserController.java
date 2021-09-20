package com.stockAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	
	@GetMapping("testBlock")
	public String testBlock() {
		return "testBlock";
	}
	
	@GetMapping("testUnblock")
	public String testUnblock() {
		return "testUnblock";
	}

}
