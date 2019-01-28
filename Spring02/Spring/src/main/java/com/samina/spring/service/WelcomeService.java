package com.samina.spring.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

	public String retrieveWelcomeMessage() {
		//Complex Method
		return "Good Morning updated";
	}
}