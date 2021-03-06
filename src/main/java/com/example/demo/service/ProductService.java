package com.example.demo.service;

import com.example.demo.model.Product;

public interface ProductService {
	Iterable<Product> findAll();

	Product findOne(long id);

	void save(Product product);

	void delete(Product product);
}
