package com.shakthi.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shakthi.entity.Product;
import com.shakthi.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService ps;

	@PostMapping("/add")
	public Product add(@RequestBody Product p) {
		return ps.save(p);
	}

	@GetMapping("/all")
	public List<Product> getAll() {
		return ps.getAllProducts();
	}
	
	@GetMapping("/findById/{id}")
	public Product findById(@PathVariable Integer id) {
		return ps.findById(id);
	}
	
}
