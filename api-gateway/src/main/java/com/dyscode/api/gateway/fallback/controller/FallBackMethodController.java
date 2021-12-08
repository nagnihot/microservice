package com.dyscode.api.gateway.fallback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "Users server is taking too much time or down this time";
	}
	
	@GetMapping("/bookServiceFallBack")
	public String bookServiceFallBackMethod() {
		return "book server is taking too much time or down this time";
	}

}
