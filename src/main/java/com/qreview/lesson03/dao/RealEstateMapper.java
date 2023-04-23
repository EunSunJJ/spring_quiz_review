package com.qreview.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.qreview.lesson03.model.RealEstate;

@Repository
public interface RealEstateMapper {

	public RealEstate selectRealEstateById(int id);

	public List<RealEstate> selectRealEstateByRentPrice(int rentPrice);
	
	public List<RealEstate> selectRealEstateByAreaPrice (
			@Param("area") int area, 
			@Param("price") int price);
}
