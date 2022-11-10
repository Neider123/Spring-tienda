package com.tienda.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.demo.model.Producto;
//la clase en donde se van a hacer los metodos.


@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {
	
	
     
}
