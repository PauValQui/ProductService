package com.nttdata.bootcamp.service;

import org.springframework.beans.factory.annotation.Value;

import com.nttdata.bootcamp.dto.Product;

public class ProductServiceImpl implements ProductServiceI {
	
	@Value("${server.port}")
	private int puerto;
	
	public Product getProduct(int id) {
		Product product = new Product();
		
		product.setProductId(id);
		product.setChannel("GET");
		product.setPort(puerto);
		return product;
	}
	public Product postProduct(int id) {
		Product product = new Product();
		
		product.setProductId(id);
		product.setChannel("POST");
		product.setPort(puerto);
		return product;
	}
}
