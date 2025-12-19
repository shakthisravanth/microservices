package com.shakthi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakthi.entity.OrderData;

public interface OrderRepo extends JpaRepository<OrderData, Integer> {

}
