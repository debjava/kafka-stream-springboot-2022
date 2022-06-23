package com.ddlab.rnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ddlab.rnd.model.Item;
import com.ddlab.rnd.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;

    @GetMapping("/item")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greetings(@RequestParam("message") String message) {
    	Item item = new Item();
    	item.setMessage(message);
    	item.setTimestamp(System.currentTimeMillis());

        itemService.sendMessage(item);
    }
}
