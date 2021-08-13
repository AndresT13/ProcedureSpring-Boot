package com.app.procedureMySql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.procedureMySql.model.entity.Empleado;
import com.app.procedureMySql.service.IEmpleadoService;

@RestController
@RequestMapping("api")
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService empleadoService;	
	

	@GetMapping("/list")
	public List<Empleado> findAll() {
		return this.empleadoService.findAll();
		
	}
	@GetMapping("/list/{id}")
	public Optional<Empleado> findById(@PathVariable Long id) {		
		return this.empleadoService.findById(id);
		
	}
	
	
	@GetMapping("/list/{marca}")
	public List<Empleado> findByCargo(@PathVariable String marca) {
		return this.empleadoService.findByCargo(marca);
	}
	
	
	@PostMapping("/list/save")
	public void saveEmpleado(@RequestBody Empleado empleado) {
		this.empleadoService.save(empleado);
	}
	
	
	@DeleteMapping("/list/{id}")
	public void deleteEmpleado(@PathVariable Long id) {
		this.empleadoService.delete(id);
	}
	
	
}
