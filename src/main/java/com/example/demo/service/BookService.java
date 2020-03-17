package com.example.demo.service;

import com.example.demo.model.Book;

public interface BookService {
	Iterable<Book> findAll();

	Book findOne(long id);

	void save(Book book);

	void delete(Book book);
}
