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
	
	
	@RequestMapping("/lesson03/quiz02_1")
	//  http://localhost:8080/lesson03/quiz02_1
	
	public String quiz02_1() {
		RealEstate realEstate = new RealEstate();
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int row = realEstateBO.addRealEstate(realEstate);
		return "입력 성공 : " + row;
	}
	
	
	@RequestMapping("/lesson03/quiz02_2")
	//  http://localhost:8080/lesson03/quiz02_2?realtorId=5
	public String quiz02_2(
			@RequestParam("realtorId") int realtorId) {
		int row = realEstateBO.addRealEstateAsField(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120 );
		return "입력 성공 : " + row ;
	}
	
	@RequestMapping("/lesson03/quiz03")
	//  http://localhost:8080/lesson03/quiz03?id=8&type=전세&price=70000
	
	public String quiz03(
			@RequestParam("id") int id,
			@RequestParam("type") String type,
			@RequestParam("price") int price) {
		int row = realEstateBO.updateRealEstateById(id, type, price);
		return "수정 성공 : " + row;
	}
	
	@RequestMapping("/lesson03/quiz04")
	//  http://localhost:8080/lesson03/quiz04?id=21
	
	public String quiz04(
			@RequestParam("id") int id) {
		int row = realEstateBO.deleteRealEstateById(id);
		return "삭제 성공 : " + row;
	}
	
}
