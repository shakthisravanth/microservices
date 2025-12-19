package com.shakthi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.shakthi.dto.Product;

@FeignClient(name = "product-service")
public interface ProductFeign {
	
	@GetMapping("products/findById/{id}")
	public Product findById(@PathVariable Integer id);
	
}