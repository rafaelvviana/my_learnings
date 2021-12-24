package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;

@RestController
@RequestMapping("/api")
public class HomeController {

	@Autowired
	private MyService myService;
	
	@GetMapping
	public List<String> hello(Model model) {
		System.out.println("3 ...");
		List<String> lista = new ArrayList<>();
		lista.add("nome1");
		lista.add("nome2");		
		
		myService.send();
		return lista;
	}
}
