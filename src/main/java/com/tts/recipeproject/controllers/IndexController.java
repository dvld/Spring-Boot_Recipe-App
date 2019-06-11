package com.tts.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

//	@RequestMapping({"/", "", "/index"})
	@GetMapping({"/", "", "/index"})
	public String getIndexPage() {
		return "index";
	}
}
