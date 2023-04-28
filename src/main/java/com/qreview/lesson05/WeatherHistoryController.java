package com.qreview.lesson05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("lesson05/quiz")
@Controller
public class WeatherHistoryController {

	@GetMapping("/weather_history_view")
	//  http://localhost:8080/lesson05/quiz/weather_history_view
	public String weatherHistoryView() {
		return "weatherHistory/weatherHistory";
	}
	
	@GetMapping("/add_weather_view")
	//  http://localhost:8080/lesson05/quiz/add_weather_view
	public String addWeatherView() {
		return "weatherHistory/addWeather";
	}
	
	@PostMapping("/add_weather")
	public String addWeather() {
		
		// DB insert
		return "redirect:";
		
	}
}
