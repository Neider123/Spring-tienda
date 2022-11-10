package com.tienda.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {
    
	
	@GetMapping
	public String mostrar() {
		return "productos/mostrarProductos";
	}
	
	
	//metodo para redireccionar a nueva vista crear prodctos
	@GetMapping("/create")
	public String create() {
		return "productos/crearProductos";
	}
}
