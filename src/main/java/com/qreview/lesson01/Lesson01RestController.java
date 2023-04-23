package com.qreview.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz01")
@RestController
public class Lesson01RestController {


	@RequestMapping("/3")
	//  http://localhost:8080/lesson01/quiz01/3

	public List<Map<String, Object>> quiz02_1() {
		List<Map<String, Object>> movies = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("rate", 15);
		map.put("director", "봉준호");
		map.put("time", 131);
		map.put("title", "기생충");
		movies.add(map);
		
		map.put("rate", 0);
		map.put("director", "로베르토 베니니");
		map.put("time", 116);
		map.put("title", "인생은 아름다워");
		movies.add(map);
		
		map.put("rate", 12);
		map.put("director", "크리스토퍼 놀란");
		map.put("time", "147");
		map.put("title", "인셉션");
		movies.add(map);
		
		map.put("rate", 19);
		map.put("director", "윤종빈");
		map.put("time", 133);
		map.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		movies.add(map);
		
		map.put("rate", 15);
		map.put("director", "프란시스 로렌스");
		map.put("time", 137);
		map.put("title", "헝거게임");
		movies.add(map);
		
		return movies;
	}
	

	@RequestMapping("/4")
	//  http://localhost:8080/lesson01/quiz01/4

	public List<Data> quiz02_2() {
		List<Data> result = new ArrayList<>();
		
		Data data = new Data();
		data.setTitle("안녕하세요 가입인사 드립니다.");
		data.setUser("hagulu");
		data.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		result.add(data);
		
		Data data1 = new Data();
		data1.setTitle("헐 대박");
		data1.setUser("bada");
		data1.setContent("오늘 목요일이었어... 금요일인줄");
		result.add(data1);
		
		Data data2 = new Data();
		data.setTitle("오늘 데이트 한 이야기 해드릴게요.");
		data.setUser("dulumary");
		data.setContent("...");
		result.add(data);
		
		return result;
	}
	
	@RequestMapping("/5")
	//  http://localhost:8080/lesson01/quiz01/5
	public ResponseEntity<Data> quiz02_3() {
		Data data = new Data();
		data.setTitle("안녕하세요 가입인사 드립니다.");
		data.setUser("hagulu");
		data.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
