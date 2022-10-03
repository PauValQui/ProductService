package com.nttdata.bootcamp.service;

import com.nttdata.bootcamp.dto.Product;

public interface ProductServiceI {
	
	public Product getProduct(int id);
	public Product postProduct(int id);
}
