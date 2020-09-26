package com.yoonshop.shop.repository;

import java.util.List;

import com.yoonshop.shop.model.Cart;

public interface CartRepository {
	//USER
	int save(Cart cart);
	int delete(int id);
	List<Cart> findAll(int insId,String today);
	int update(Cart cart);
	int CountByid(int insId);
}