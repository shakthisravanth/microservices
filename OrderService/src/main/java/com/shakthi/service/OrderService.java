package com.shakthi.service;

import java.util.List;

import com.shakthi.entity.OrderData;

public interface OrderService {
	OrderData place(OrderData od);

	List<OrderData> all();

	OrderData findById(Integer id);
}
