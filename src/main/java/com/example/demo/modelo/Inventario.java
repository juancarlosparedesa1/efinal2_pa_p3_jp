package com.example.demo.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name ="Inventario")
@Table(name = "inventario")
public class Inventario {

	@Column(name = "inv_numero")
	private Integer numero;

	@ManyToOne
	@JoinColumn(name = "prod_inv_id")
	public List<Producto> productos;

	@ManyToOne
	@JoinColumn(name = "bod_inv_id")
	public List<Bodega> bodegas;

	// get and set

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public List<Bodega> getBodegas() {
		return bodegas;
	}

	public void setBodegas(List<Bodega> bodegas) {
		this.bodegas = bodegas;
	}

	@Override
	public String toString() {
		return "Inventario [numero=" + numero + ", productos=" + productos + ", bodegas=" + bodegas + "]";
	}

}
