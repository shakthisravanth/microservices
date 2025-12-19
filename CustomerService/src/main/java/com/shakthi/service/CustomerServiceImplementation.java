package com.shakthi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakthi.entity.Customer;
import com.shakthi.repo.CustomerRepo;

@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	CustomerRepo repo;

	@Override
	public Customer save(Customer c) {
		return repo.save(c);
	}

	@Override
	public List<Customer> getAllCustomers() {

		return repo.findAll();
	}

	@Override
	public Customer findById(Integer id) {
		
		return repo.findById(id).orElse(null);
	}

}
