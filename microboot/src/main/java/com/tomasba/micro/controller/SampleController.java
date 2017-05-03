package com.tomasba.micro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@RequestMapping("/")
	public String sampleHelloEndpoint() {
		return "hello";
	}
	
}