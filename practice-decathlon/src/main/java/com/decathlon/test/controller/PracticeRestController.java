package com.decathlon.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.decathlon.test.pojo.Product;
import com.decathlon.test.service.PracticeService;


@Controller
//@RequestMapping("/product")
public class PracticeRestController {

	private static final Logger LOG = LoggerFactory.getLogger(PracticeRestController.class);
	
	@Autowired
	private PracticeService service;
	
	@GetMapping("/product")
	public List<Product> getAll(HttpServletRequest request) {
		return service.getAll(request.getSession());
	}
	
	@GetMapping("/product/{id}")
	public Product getById(@PathVariable("id") long id, HttpServletRequest request) {
		return service.getById(id, request.getSession());
	}
	
	@PostMapping("/product")
    public Product create(@RequestBody Product product, HttpServletRequest request) {
        return service.create(product, request.getSession());
    }
	
	@PutMapping("/product/{id}")
    public Product update(@PathVariable("id") long id, @RequestBody Product product, HttpServletRequest request) {
        return service.update(id, product, request.getSession());
    }

    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable("id") long id, HttpServletRequest request) {
        service.delete(id, request.getSession());
    }
    
    // TODO implementare Patch?
}
