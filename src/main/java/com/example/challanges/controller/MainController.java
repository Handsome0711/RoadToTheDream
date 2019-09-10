package com.example.challanges.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/RD")
	public String start() {
		return "start";
	}
	
	@GetMapping("/")
		public String home(){
			return "home";
		}
		
	}

