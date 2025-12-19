package com.shakthi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class OrderData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	Integer customerId;
	Integer productId;
}
