package com.blank.ecommerce.controller;

import com.blank.ecommerce.entity.Item;
import com.blank.ecommerce.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @GetMapping("")
    public List<Item> getAllProducts() {
        return itemService.findAll();
    }
}
