package com.qreview.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.qreview.lesson04.bo.SellerBO;
import com.qreview.lesson04.model.Seller;

@RequestMapping("/lesson04/quiz01")
@Controller
public class SellerController {

	@Autowired
	public SellerBO sellerBO;
	
	@GetMapping("/add_seller_view")
	//  http://localhost:8080/lesson04/quiz01/add_seller_view
	public String addSellerView() {
		return "lesson04/addSeller";
	}
	
	@PostMapping("/add_seller")
	public String addSeller(
			@RequestParam("nickname") String nickname,
			@RequestParam(value="profileImageUrl", required=false) String profileImageUrl,
			@RequestParam("temperature") Double temperature) {
		
		// DB insert
		sellerBO.addSeller(nickname, profileImageUrl, temperature);
		return "lesson04/afterAddSeller";
	}
	
	@GetMapping("/seller_info")
	//  http://localhost:8080/lesson04/quiz01/seller_info
	//  http://localhost:8080/lesson04/quiz01/seller_info?id=1
	
	public String sellerInfo(
			@RequestParam(value="id", required=false) Integer id,
			Model model) {
		// DB select
		Seller seller = null;
		if(id == null) {
			seller = sellerBO.getLastSeller();
		} else {
			seller = sellerBO.getSellerById(id);
		}
		
		model.addAttribute("seller", seller);
		return "lesson04/sellerInfo";
	}
}
