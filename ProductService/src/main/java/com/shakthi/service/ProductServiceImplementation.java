package com.shakthi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakthi.entity.Product;
import com.shakthi.repo.ProductRepo;

@Service
public class ProductServiceImplementation implements ProductService {

	@Autowired
	ProductRepo repo;
	
	@Override
	public Product save(Product p) {
		
		return repo.save(p);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return repo.findAll();
	}

	@Override
	public Product findById(Integer id) {
		
		return repo.findById(id).orElse(null);
	}

}
