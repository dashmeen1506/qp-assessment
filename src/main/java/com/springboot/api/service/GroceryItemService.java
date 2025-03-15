package com.springboot.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.api.model.GroceryItem;
import com.springboot.api.repository.GroceryItemRepository;

@Service
public class GroceryItemService {

	@Autowired
	private GroceryItemRepository repository;

	public List<GroceryItem> getAllItems() {
		return repository.findAll();
	}

	public Optional<GroceryItem> getItemById(Long id) {
		return repository.findById(id);
	}

	public GroceryItem addItem(GroceryItem item) {
		return repository.save(item);
	}

	public GroceryItem updateItem(Long id, GroceryItem newItem) {
		return repository.findById(id).map(item -> {
			item.setName(newItem.getName());
			item.setPrice(newItem.getPrice());
			item.setQuantity(newItem.getQuantity());
			return repository.save(item);
		}).orElse(null);
	}

	public void deleteItem(Long id) {
		repository.deleteById(id);
	}
}
