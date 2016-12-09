package com.example.inventoryservice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

	private Map<String, Integer> inventoryMap = new HashMap<String, Integer>();

	@Override
	public Integer findInventory(String isbn) {
		if (inventoryMap.isEmpty()) {
			prepareInventoryMap();
		}
		return inventoryMap.containsKey(isbn) ? inventoryMap.get(isbn) : 0;
	}

	private void prepareInventoryMap() {
		inventoryMap.put("9781932394887", 10);
		inventoryMap.put("9781617292545", 15);
	}
}
