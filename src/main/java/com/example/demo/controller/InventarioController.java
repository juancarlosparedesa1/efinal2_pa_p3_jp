package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Producto;
import com.example.demo.service.IBodegaService;
import com.example.demo.service.IInventarioService;
import com.example.demo.service.IProductoService;
//import com.example.demo.service.IPersonaService;

@Controller
@RequestMapping("/Inventario") // URL: http://localhost:8080/personas
public class InventarioController {

	@Autowired
	private IBodegaService ibodegaService;

	@Autowired
	private IProductoService iProductoService;

	@Autowired
	private IInventarioService iInventarioService;

	@GetMapping("/nuevaBodega")
	public String paginaNuevaBodega(Bodega bodega) {
		return "vistaCrearBodega";
	}

	@PostMapping("/insertar") // Página intermedia, si la llamo desde la url en el navegador, no funcionará.
	public String insertarBodega(Bodega bodega) {
//		this.ibodegaService.insertar("bodega sur", 1, "Quto,sur", "0987654321");
		return "guardado";
	}

	@GetMapping("/nuevProducto")
	public String paginaNuevoProducto(Producto producto) {
		return "vistaCrearProducto";
	}

	@PostMapping("/insertar") // Página intermedia, si la llamo desde la url en el navegador, no funcionará.
	public String insertarProducto(Producto producto) {
//		this.iProductoService.crear("coca cola","001CC", "comestible");
		//..............................................
//		Stream<Producto> cocacola = new Stream<Producto>
//		int secuencia = producto.stream()
//                .filter(w -> w.getColor() == RED)
//                .mapToInt(w -> w.getWeight())
//                .sum();		
		return "guardado";

//	@GetMapping("/buscar")
//	public String buscarTodos(Model modelo) {
//		List<Persona> lista = this.iPersonaService.buscarTodos();
//		modelo.addAttribute("personas", lista);
//		return "vistaListaPersonas";
//	}
//
//	@DeleteMapping("/borrar/{id}")
//	public String borrarPersona(@PathVariable("id") Integer id) {
//		this.iPersonaService.eliminar(id);
//		return "redirect:/personas/buscar";
//	}
//
//	@GetMapping("/buscarPorId/{id}") // Editar
//	public String buscarPorId(@PathVariable("id") Integer id, Model modelo) {
//		Persona persona = this.iPersonaService.buscarPorId(id);
//		modelo.addAttribute("persona", persona);
//		return "vistaPersona";
//	}
//
//	@PutMapping("/actualizar/{id}") // Actualizar
//	public String actualizarPorId(@PathVariable("id") Integer id, Persona persona) {
//		persona.setId(id);
//		this.iPersonaService.actualizar(persona);
//		return "redirect:/personas/buscar";
	}
}