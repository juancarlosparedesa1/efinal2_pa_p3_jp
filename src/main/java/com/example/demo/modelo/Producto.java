package com.example.demo.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name ="Producto")
@Table(name="producto")
public class Producto {

	@Column(name="prod_nombre")
	private String nombre;
	
	@Column(name="prod_strock")
	private Integer stock;
	
	@Column(name="prod_codigo_barras_maestro")
	private String codigoBarrasMaestro;
	
	@Column(name="prod_categoria")
	public String categoria;
	
	
	@OneToMany(mappedBy = "producto",cascade =CascadeType.ALL,fetch = FetchType.EAGER)
	public Inventario inventario;


	//get and set
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public String getCodigoBarrasMaestro() {
		return codigoBarrasMaestro;
	}


	public void setCodigoBarrasMaestro(String codigoBarrasMaestro) {
		this.codigoBarrasMaestro = codigoBarrasMaestro;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Inventario getInventario() {
		return inventario;
	}


	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", stock=" + stock + ", codigoBarrasMaestro=" + codigoBarrasMaestro
				+ ", categoria=" + categoria + ", inventario=" + inventario + "]";
	}
	
	
	
}
