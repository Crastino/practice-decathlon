package com.decathlon.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.decathlon.test.pojo.Product;

@Service
public class PracticeService {
	
private static final Logger LOG = LoggerFactory.getLogger(PracticeService.class);
	
	
	public Product getById(long id) {
		return new Product();
	}
	
	public Product create(Product product) {
		return new Product();
	}

	public Product update(long id, Product product) {
		return new Product();
	}
	
	public void delete(long id) {
		
	}
}
