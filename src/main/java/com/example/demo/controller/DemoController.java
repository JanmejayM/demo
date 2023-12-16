package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping(value = "/hello")
	public static String hello()
	{
		return "hi Janmejay  .You are the best :)";
	}

}
