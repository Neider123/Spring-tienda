package com.tienda.demo.service;

import java.util.Optional;

import com.tienda.demo.model.Producto;

//interfaz donde se define todos los metodos

public interface ProductoService {
	
	public Producto save(Producto producto);
	//se utilizar para validar si el objeto que traemos de la BD existe metodo buscar
	public Optional<Producto> get(Integer id);
	//metodo actualizar
	public void update(Producto producto);
	//metodo eliminar
	public void delete(Integer id);

}
