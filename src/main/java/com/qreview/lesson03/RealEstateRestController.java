package com.qreview.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qreview.lesson03.bo.RealEstateBO;
import com.qreview.lesson03.model.RealEstate;

@RestController
public class RealEstateRestController {

	@Autowired
	private RealEstateBO realEstateBO;
	
	@RequestMapping("/lesson03/quiz01_1")
	//  http://localhost:8080/lesson03/quiz01_1?id=20
	
	public RealEstate quiz01_1(
			@RequestParam("id") int id) {
		return realEstateBO.getRealEstateById(id);
	}
	
	@RequestMapping("/lesson03/quiz01_2")
	//  http://localhost:8080/lesson03/quiz01_2?rentPrice=90
	
	public List<RealEstate> quiz01_2(
			@RequestParam("rentPrice") int rentPrice) {
		return realEstateBO.getRealEstateByRentPrice(rentPrice);
	}
	
	
	@RequestMapping("/lesson03/quiz01_3")
	//  http://localhost:8080/lesson03/quiz01_3?area=90&price=130000
	
	public List<RealEstate> quiz01_3(
			@RequestParam("area") int area,
			@RequestParam("price") int price) {
		return realEstateBO.getRealEstateByAreaPrice(area, price);
	}	
	
}
