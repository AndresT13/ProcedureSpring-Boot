package com.app.procedureMySql.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.procedureMySql.model.dao.IEmpleadoDao;
import com.app.procedureMySql.model.entity.Empleado;
import com.app.procedureMySql.service.IEmpleadoService;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoDao empleadoDao;

	@Override
	public List<Empleado> findAll() {
		return empleadoDao.listprocedure();
	}

	@Override
	public void save(Empleado empleado) {
		this.empleadoDao.saveProcedure(empleado.getIdEmpleado(), empleado.getApellido(), empleado.getArea(),
				empleado.getCargo(), empleado.getNombre());
	}

	@Override
	public Optional<Empleado> findById(Long id) {
		return this.empleadoDao.findByIdprocedure(id);
	}

	@Override
	public List<Empleado> findByCargo(String cargo) {
		return this.empleadoDao.findByCargoProcedure(cargo);
	}

	@Override
	public void delete(Long id) {
		this.empleadoDao.deleteProcedure(id);

	}

}
