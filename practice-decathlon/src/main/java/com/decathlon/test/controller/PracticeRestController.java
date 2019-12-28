package com.decathlon.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decathlon.test.pojo.Product;
import com.decathlon.test.service.PracticeService;

@RestController
@RequestMapping("/product")
public class PracticeRestController {

	private static final Logger LOG = LoggerFactory.getLogger(PracticeRestController.class);
	
	@Autowired
	private PracticeService service;
	
	@GetMapping
	public List<Product> getAll() {
		return new ArrayList<Product>();
	}
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable("id") long id) {
		return service.getById(id);
	}
	
	@PostMapping
    public Product create(@RequestBody Product product) {
        return service.create(product);
    }
	
	@PutMapping("/{id}")
    public Product update(@PathVariable("id") long id, @RequestBody Product product) {
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        service.delete(id);
    }
    
    // TODO implementare Patch?
}
