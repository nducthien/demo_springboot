package com.example.demo.controller;

import com.example.demo.model.New;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewController {

	@PostMapping(value = "/new")
	public New createNew(@RequestBody New model) {
		return model;
	}

	@PutMapping(value = "/new")
	public New updateNew(@RequestBody New model) {
		return model;
	}
}
