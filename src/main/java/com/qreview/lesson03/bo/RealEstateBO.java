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
	
	// input : realEstate
	// output : int
	public int addRealEstate(RealEstate realEstate) {
		return realEstateMapper.insertRealEstate(realEstate);
	}
	
	// input : realtorId address area type price rentPrice
	// output : int
	public int addRealEstateAsField(int realtorId, String address, int area, String type, int price, int rentPrice) {
		return realEstateMapper.insertRealEstateAsField(realtorId, address, area, type, price, rentPrice);
	}
	
	// input : id type price
	// output : int
	public int updateRealEstateById(int id, String type, int price) {
		return realEstateMapper.updateRealEstateById(id, type, price);
	}
	
	// input : id
	// output : int
	public int deleteRealEstateById(int id) {
		return realEstateMapper.deleteRealEstateById(id);
	}
}
