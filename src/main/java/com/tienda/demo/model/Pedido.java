package com.tienda.demo.model;

import java.util.Date;

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
@Table(name = "ordenes")
public class Pedido {
    
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	
	private double cantidad;
	
	@ManyToOne
	private Usuario usuario;
	
	
	@OneToOne(mappedBy="pedido")
	private DetallePedido detalle;

	public Pedido(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, double cantidad, Usuario usuario) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.cantidad = cantidad;
		this.usuario = usuario;
	}
	
	
	
    

}
