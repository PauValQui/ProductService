package com.nttdata.bootcamp.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.service.ProductServiceI;

@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceI productService;
	
	public ProductController(ProductServiceI productService) {
		this.productService = productService;
	}
	
	@GetMapping("{id}")
	public void getProduct(@PathVariable Integer id) {
		productService.getProduct(id);
	}
	
	@PostMapping("{id}")
	public void postProduct(@PathVariable Integer id) {
		productService.postProduct(id);
	}
}
