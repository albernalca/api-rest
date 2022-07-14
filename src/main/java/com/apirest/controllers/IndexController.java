package com.apirest.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index","/","/home"})
	public String index(Map<String, Object> map) {
		map.put("titulo", "Spring Framework");
		return "index";
		
	}
}
