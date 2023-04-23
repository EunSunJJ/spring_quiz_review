package com.qreview.lesson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qreview.lesson02.model.Store;

@Repository
public interface StoreMapper {
	
	public List<Store> selectStoreList();
}