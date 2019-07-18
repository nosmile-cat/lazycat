package com.ellis.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/index/{info}")
	public String index(@PathVariable("info") String info){
		return "hello:"+info;
	}
	
	@RequestMapping("/member")
	public String getMember(){
		return "member!!!-"+port;
	}
}
