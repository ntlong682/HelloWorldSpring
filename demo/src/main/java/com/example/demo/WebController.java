package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("hello")
	public String hello(
			//Request param "name" sẽ được gán  trí vào biến String
			@RequestParam(name = "name", required = false, defaultValue = "") String 
			name,
			//Model là một obj của Spring Boot, được gắn vào mọi request
			Model model) {
		//Gắn vào model giá trị name nhận được
		model.addAttribute("name",name);
		return "hello";
	}
}
