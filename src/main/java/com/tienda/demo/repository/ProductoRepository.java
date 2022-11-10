package com.tienda.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.demo.model.Producto;
//la clase en donde se van a hacer los metodos.
public interface ProductoRepository extends JpaRepository<Producto,Integer> {
     
}
