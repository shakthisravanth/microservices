package com.shakthi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakthi.dto.Customer;
import com.shakthi.dto.Product;
import com.shakthi.entity.OrderData;
import com.shakthi.feign.CustomerFeign;
import com.shakthi.feign.ProductFeign;
import com.shakthi.repo.OrderRepo;

@Service
public class OrderServiceImplementation implements OrderService {

	@Autowired
	OrderRepo repo;

	@Autowired
	CustomerFeign cf;

	@Autowired
	ProductFeign pf;

	@Override
	public OrderData place(OrderData od) {
		Integer cId = od.getCustomerId();
		Integer pId = od.getProductId();
		Customer c = cf.getById(cId); // inter service communication call
		Product p = pf.findById(pId); // inter service communication call
		if (c == null || p == null) {
			throw new RuntimeException("Customer or product not found");
		}
		return repo.save(od);

	}

	@Override
	public List<OrderData> all() {
		return repo.findAll();
	}

	@Override
	public OrderData findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

}
