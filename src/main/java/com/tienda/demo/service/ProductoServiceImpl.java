package com.tienda.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.demo.model.Producto;
import com.tienda.demo.repository.ProductoRepository;


@Service
public class ProductoServiceImpl implements ProductoService {
	
	//se esta inyectando a esta clase un objeto.
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		productoRepository.save(producto);
	}

	@Override
	public void delete(Integer id) {
	   productoRepository.deleteById(id);
	}

	@Override
	//mostrar todos los productos
	public List<Producto> mostrarTodo() {
		return productoRepository.findAll();
	}

}
