package com.example.demo.controller;import com.example.demo.model.Book;import com.example.demo.service.BookService;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.PathVariable;import java.util.List;@Controllerpublic class BookController {    @Autowired    BookService bookService;    @GetMapping("/book")    public List<Book> findAll() {        return (List<Book>) bookService.findAll();    }    @GetMapping("/{id}")    public List<Book> findOne(@PathVariable(value = "id") Long id) {        return (List<Book>) bookService.findOne(id);    }}