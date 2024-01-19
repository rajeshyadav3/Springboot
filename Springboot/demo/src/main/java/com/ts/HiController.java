package com.ts;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
	
	@RequestMapping("sayHi")
	public String sayHi(){
		return "Hi Everyone!!!";
	}
	
	@RequestMapping("sayHello")
	public String sayHello(){
		return "Hello Everyone!!!";
	}

}
