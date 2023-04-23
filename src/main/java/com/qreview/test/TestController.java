package com.qreview.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@ResponseBody
	@RequestMapping("/test")
	
	//  http://localhost:8080/test
	public String test() {
		return "Hello World";
	}
}
