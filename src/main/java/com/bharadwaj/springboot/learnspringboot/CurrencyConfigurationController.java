package com.bharadwaj.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
 
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")//("/courses") is a link, when it was clicked it displays all courses
	public CurrencyServiceConfiguration retrieveAllCourses(){
		return configuration;
	}
}
