package com.yoonshop.shop.repository;

import java.util.List;

import com.yoonshop.shop.model.Product;
import com.yoonshop.shop.model.Sale;

public interface SaleRepository {
	//ADMIN
	List<Sale> findAll();
	List<Product> findByProduct(String categoryCd,String today);
	int save(Sale sale);
	int update(Sale sale);
	
	//USER
	List<Product> saleList(String today);
}