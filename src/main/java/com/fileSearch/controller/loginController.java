package com.fileSearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

	@RequestMapping(value="/login")
	public String moveLoginPage() {
		return "main_body";
	}
}
