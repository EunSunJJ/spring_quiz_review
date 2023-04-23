package com.qreview.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qreview.lesson03.dao.RealEstateMapper;
import com.qreview.lesson03.model.RealEstate;

@Service
public class RealEstateBO {

	@Autowired
	private RealEstateMapper realEstateMapper;
	
	// input : id
	// output : RealEstate
	public RealEstate getRealEstateById(int id) {
		return realEstateMapper.selectRealEstateById(id);
	}
	
	// input : rentPrice
	// output : List<RealEstate>
	public List<RealEstate> getRealEstateByRentPrice(int rentPrice) {
		return realEstateMapper.selectRealEstateByRentPrice(rentPrice);
	}

	// input : area price
	// output : List<RealEstate>
	public List<RealEstate> getRealEstateByAreaPrice (int area, int price) {
		return realEstateMapper.selectRealEstateByAreaPrice(area, price);
	}
}
