package com.shakthi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakthi.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
