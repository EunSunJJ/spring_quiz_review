package com.qreview.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Quiz02Controller {

	@RequestMapping("/lesson01/quiz02")
	//  http://localhost:8080/lesson01/quiz02
	public String quiz02() {
		return "lesson01/quiz02";
	}
}
