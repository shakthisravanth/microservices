package com.shakthi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakthi.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
