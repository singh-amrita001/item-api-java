package com.amrita.itemapi.service;

import com.amrita.itemapi.model.Item;
import com.amrita.itemapi.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public Item addItem(Item item) {
        return repository.save(item);
    }

    public Item getItem(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }

    public List<Item> getAllItems() {
        return repository.findAll();
    }
}
