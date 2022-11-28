package com.example.ShoppingDirect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexControllor {

	@GetMapping("/index.html")
	public String Index(Model model) {
		return "index";
	 }

   }