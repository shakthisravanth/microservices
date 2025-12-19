package com.shakthi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shakthi.entity.OrderData;
import com.shakthi.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService os;

	@PostMapping("/place")
	public OrderData placeOrder(@RequestBody OrderData od) {
		return os.place(od);
	}

	@GetMapping("/all")
	public List<OrderData> getAllOrders() {
		return os.all();
	}

	@GetMapping("/findById/{id}")
	public OrderData findById(@PathVariable Integer id) {
		return os.findById(id);
	}

}
