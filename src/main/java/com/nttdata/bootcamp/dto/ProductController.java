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
	public Product getProduct(@PathVariable Integer id) {
		Product product = new Product();
		
		product = productService.getProduct(id);
		return product;
	}
	
	@PostMapping("{id}")
	public Product postProduct(@PathVariable Integer id) {
		Product product = new Product();
		
		product = productService.postProduct(id);
		return product;
	}
}
