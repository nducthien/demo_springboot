package com.example.demo.controller;

import com.example.demo.model.New;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class NewController {
	@RequestMapping(value = "/new", method = RequestMethod.POST)

	@ResponseBody
	public New createNew(@RequestBody New model) {
		return model;
	}
}