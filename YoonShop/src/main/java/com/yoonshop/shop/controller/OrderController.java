package com.yoonshop.shop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yoonshop.shop.model.Order;
import com.yoonshop.shop.security.UserDetail;
import com.yoonshop.shop.service.OrderService;
import com.yoonshop.shop.utils.Util;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderSvc;
	
	@GetMapping("")
	public String orderPathRedirect() {
		return "redirect:/order/";
	}
	
	@GetMapping("/")
	public String order() {
		return "/order/order";
	}

	@GetMapping("/cart/list")
	public @ResponseBody Map<String, Object> orderCartList(@AuthenticationPrincipal UserDetail userDetail) {
		List<Order> orderCartList = orderSvc.orderCartList(userDetail.getUser().getId());
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", orderCartList);
		
		return map;
	}
	
	@PostMapping("/coupon")
	public @ResponseBody Map<String, Object> orderCoupon(@RequestParam String code) {
		String resultStr = orderSvc.orderCoupon(code);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", resultStr);
		
		return map;
	}
	
	@GetMapping("/check")
	public @ResponseBody Map<String, Object> orderCheck() {
		String today = Util.getToday().replace("-", "");
		String resultStr = orderSvc.orderCheck(today);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", resultStr);
		
		return map;
	}
	
	@PostMapping("/insert")
	public @ResponseBody Map<String, Object> orderInsert(@AuthenticationPrincipal UserDetail userDetail, Order order) {
		order.setInsId(userDetail.getUser().getId());
		String resultStr = orderSvc.orderInsert(order);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", resultStr);
		
		return map;
	}
	
	@PostMapping("/update")
	public @ResponseBody Map<String, Object> orderUpdate(@AuthenticationPrincipal UserDetail userDetail, Order order) {
		order.setInsId(userDetail.getUser().getId());
		String resultStr = orderSvc.orderUpdate(order);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", resultStr);
		
		return map;
	}
	
	@GetMapping("/result/{orderNo}")
	public String orderResult(Model model, @PathVariable String orderNo) {
		model.addAttribute("orderNo", orderNo);
		return "/order/result";
	}
	
	@GetMapping("/result/view")
	public @ResponseBody Map<String, Object> orderResultView(@RequestParam String orderNo) {
		List<Order> orderList = orderSvc.orderResultView(orderNo);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", orderList);
		
		return map;
	}
	
	@GetMapping("/view/{orderNo}")
	public String orderView(Model model, @PathVariable String orderNo) {
		model.addAttribute("orderNo", orderNo);
		return "/order/view";
	}
	
	@GetMapping("/list")
	public String orderList() {
		return "/order/list";
	}
	
	@GetMapping("/list/all")
	public @ResponseBody Map<String, Object> orderResultView(@AuthenticationPrincipal UserDetail userDetail) {
		List<Order> orderList = orderSvc.orderListAll(userDetail.getUser().getId());
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", orderList);
		
		return map;
	}
}
