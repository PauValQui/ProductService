package com.nttdata.bootcamp.service;

import org.springframework.beans.factory.annotation.Value;

public class ProductServiceImpl implements ProductServiceI {
	
	@Value("${server.port}")
	private int puerto;
	
	public void getProduct(int id) {
		System.out.println("Id : " + id + "\nChannel: GET \nPort: "+puerto);
	}
	public void postProduct(int id) {
		System.out.println("Id : " + id + "\nChannel: POST \nPort "+puerto);
	}
}
