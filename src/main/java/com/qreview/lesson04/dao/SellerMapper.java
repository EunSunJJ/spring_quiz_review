package com.qreview.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.qreview.lesson04.model.Seller;

@Repository
public interface SellerMapper {

	public void insertSeller(
			@Param("nickname") String nickname, 
			@Param("profileImageUrl") String profileImageUrl,
			@Param("temperature") Double temperature);
	
	public Seller selectLastSeller();
	
	public Seller selectSellerById(int id);
}
