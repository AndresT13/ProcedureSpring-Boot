package com.app.procedureMySql.service;

import java.util.List;
import java.util.Optional;

import com.app.procedureMySql.model.entity.Empleado;

public interface IEmpleadoService {

	public List<Empleado> findAll();

	public void save(Empleado empleado);

	public Optional<Empleado> findById(Long id);
	
	public List<Empleado> findByCargo(String cargo);
	

	public void delete(Long id);

	

}
