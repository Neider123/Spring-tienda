package com.tienda.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mostrar")
public class AdministradorController {
	
	
	@GetMapping("")
	public String home() {
		return "administrador/home";
	}
	


}
