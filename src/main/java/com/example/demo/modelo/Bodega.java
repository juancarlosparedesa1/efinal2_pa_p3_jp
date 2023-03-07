package com.example.demo.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name ="Bodega")
@Table(name = "bodega")

public class Bodega {

	@Column(name = "bod_nombre")
	private String nombre;

	@Column(name = "bod_numero_bodega")
	private Integer numeroBodega;
//	private String codigoBarrasMaestro;
//	private Integer cantidad

	@Column(name = "bod_direccion")
	private String direccion;

	@Column(name = "bod_telefono")
	private String telefono;

	@OneToMany(mappedBy = "bodega", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Inventario inventario;

	
	// get and set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumeroBodega() {
		return numeroBodega;
	}

	public void setNumeroBodega(Integer numeroBodega) {
		this.numeroBodega = numeroBodega;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	@Override
	public String toString() {
		return "Bodega [nombre=" + nombre + ", numeroBodega=" + numeroBodega + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", inventario=" + inventario + "]";
	}

	

	
	

}
