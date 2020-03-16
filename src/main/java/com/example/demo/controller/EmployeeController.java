package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee")
	public String index(Model model) {
		model.addAttribute("employees", employeeService.findAll());
		return "list";
	}

	@PostMapping("/employee/create")
	public String create(Model model) {
		model.addAttribute("employee", new Employee());
		return "form";
	}

	@GetMapping("/employee/{id}/edit")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("employee", employeeService.findOne(id));
		return "form";
	}

	@PutMapping("/employee/save")
	public String save(@Valid Employee employee, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "form";
		}
		employeeService.save(employee);
		redirect.addFlashAttribute("success", "Saved employee successfully!");
		return "redirect:/employee";
	}

	@DeleteMapping("/employee/{id}/delete")
	public String delete(@PathVariable long id, RedirectAttributes redirect) {
		Employee emp = employeeService.findOne(id);
		employeeService.delete(emp);
		redirect.addFlashAttribute("success", "Deleted employee successfully!");
		return "redirect:/employee";
	}

	@GetMapping("/employee/search")
	public String search(@RequestParam("s") String s, Model model) {
		if (s.equals("")) {
			return "redirect:/employee";
		}

		model.addAttribute("employees", employeeService.search(s));
		return "list";
	}
}
