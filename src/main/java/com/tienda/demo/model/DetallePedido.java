package com.tienda.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name = "detalles")
public class DetallePedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;
	
	
	@ManyToOne
	private Pedido pedido;
	
	@OneToOne
	private Producto producto;
	

}
