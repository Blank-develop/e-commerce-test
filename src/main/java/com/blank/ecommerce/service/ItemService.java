package com.blank.ecommerce.service;

import com.blank.ecommerce.entity.Item;
import com.blank.ecommerce.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

}
