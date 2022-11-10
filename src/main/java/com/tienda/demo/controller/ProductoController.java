package com.tienda.demo.controller;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tienda.demo.model.Producto;
import com.tienda.demo.model.Usuario;
import com.tienda.demo.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
    
	private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);
	
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping
	//model lleva informacion desde el backend hacia la vista.
	public String mostrar(Model model) {
		model.addAttribute("productos",productoService.mostrarTodo());
		return "productos/mostrarProductos";
	}
	
	
	//metodo para redireccionar a nueva vista crear prodctos
	@GetMapping("/create")
	public String create() {
		return "productos/crearProductos";
	}
	
	//metodo para mapear la informacion desde el boton guardar para que se guarde en la BD
	@PostMapping("/guardar")
	public String save(Producto producto) {
		//se utiliza para brindar informacion acerca del objeto agregado
		LOGGER.info("Este es el objeto producto {}",producto);
		//peticion al controlador productos que carga la vista mostrar
	    Usuario u = new Usuario(1, "", "", "", "", "", "", "");
	
	    producto.setUsuario(u);
	   
		
		productoService.save(producto);
		return "redirect:/productos";
	}
}
