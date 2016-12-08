package com.example.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventoryservice.service.InventoryService;

@RestController
@RequestMapping({ "/api/v1", "" })
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;

	@RequestMapping(value="/books/{isbn}/inventory")
	public Integer bookAvailablity(@PathVariable("isbn") String isbn) {
		return inventoryService.findInventory(isbn);
	}

}
