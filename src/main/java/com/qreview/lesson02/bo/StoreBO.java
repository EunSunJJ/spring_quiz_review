package com.qreview.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qreview.lesson02.dao.StoreMapper;
import com.qreview.lesson02.model.Store;

@Service
public class StoreBO {

	@Autowired
	private StoreMapper storeMapper;
	
	// input : x
	// output : list<store>
	public List<Store> getStoreList() {
		return storeMapper.selectStoreList();
	}
}
