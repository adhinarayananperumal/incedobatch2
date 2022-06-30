package com.icici.sharemarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/showEmployeeRegistrationForm", method = RequestMethod.GET)
	public String employeeReg(ModelMap model) {
		
		System.out.println("inside ..........emp reg form show ");

		return "employeeRegistrationform";
	}
	
	
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String aaafffaaa(ModelMap model) {
		
		System.out.println("inside ..........emp reg form show ");

		return "bbbb";
	}
}
