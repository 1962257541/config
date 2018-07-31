package com.ps.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope  //用于当配置修改后自动刷新
public class TestController {
	@Value("${name}")
	String name;
	@GetMapping("/test")
	public String test(){
		return name;
	}
}
