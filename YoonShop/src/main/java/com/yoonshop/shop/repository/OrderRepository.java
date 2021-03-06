package com.yoonshop.shop.repository;

import java.util.List;

import com.yoonshop.shop.model.Coupon;
import com.yoonshop.shop.model.Order;
import com.yoonshop.shop.model.Sale;

public interface OrderRepository {
	//ADMIN
	List<Order> orderList();
	List<Order> orderView(String orderNo);
	int orderUpdate(Order order);
	
	//USER
	List<Order> orderCartList(int id);
	List<Sale> orderSaleList(int id);
	Coupon orderCoupon(String code);
	String orderCheck(String today);
	int orderInsert(Order order);
	int orderUpdatePayment(Order order);
	int orderCartDelete(int id);
	List<Order> orderResultView(String orderNo);
	List<Order> orderListAll(int id);
	List<Order> orderListDetail(String orderNo);
}