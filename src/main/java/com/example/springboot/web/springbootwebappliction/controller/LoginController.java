package com.example.springboot.web.springbootwebappliction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//  /login => "Hello World"

@Controller
public class LoginController {
		
	@RequestMapping("/login")

	public String loginMessage(@RequestParam String name, ModelMap model )
	{
		model.put("name", name);
	System.out.println("name is " + name);
		return "login";
	}

}