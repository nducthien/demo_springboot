package com.example.demo.controller;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/product")
	public String index(Model model) {
		model.addAttribute("products", productService.findAll());
		return "list";
	}
}
