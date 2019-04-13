package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${test}")
	private String test;
	
	@GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return test;
    }
}
