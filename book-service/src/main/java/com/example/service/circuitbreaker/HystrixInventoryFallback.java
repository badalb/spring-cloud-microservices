package com.example.service.circuitbreaker;

import org.springframework.stereotype.Component;

@Component
public class HystrixInventoryFallback implements InventoryServiceClient{

	public Integer getInventory(String isbn) {
		return 0;
	}

}
