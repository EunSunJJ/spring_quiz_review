package com.qreview.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qreview.lesson04.dao.SellerMapper;
import com.qreview.lesson04.model.Seller;

@Service
public class SellerBO {

	@Autowired
	private SellerMapper sellerMapper;
	
	public void addSeller(String nickname, String profileImageUrl, Double temperature){
	}
	
	public Seller getLastSeller() {
		return sellerMapper.selectLastSeller();
	}
	
	public Seller getSellerById(int id) {
		return sellerMapper.selectSellerById(id);
	}
}
