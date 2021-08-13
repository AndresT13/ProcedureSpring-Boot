package com.app.procedureMySql.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "empleados")

//@NamedStoredProcedureQueries({
//	@NamedStoredProcedureQuery(
//			 name = "findEmpById",
//			  procedureName = "FIND_EMP_BY_ID",
//			  resultClasses = {Empleado.class},
//					  parameters = {
//							   @StoredProcedureParameter( name = "idEmpleado", type = Integer.class, mode = ParameterMode.IN),
//							   @StoredProcedureParameter( name = "nombre", type = Integer.class, mode = ParameterMode.IN),
//							   @StoredProcedureParameter( name = "apellido", type = Integer.class, mode = ParameterMode.IN),
//							   @StoredProcedureParameter( name = "area", type = Integer.class, mode = ParameterMode.IN),
//							   @StoredProcedureParameter( name = "cargo", type = Integer.class, mode = ParameterMode.OUT),
//							   @StoredProcedureParameter( name = "fecahIngreso", type = Integer.class, mode = ParameterMode.IN),
//							  }
//			  )
//})
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado")
	private Long idEmpleado;

	private String nombre;

	private String apellido;

	private String area;

	private String cargo;

	// @JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")

	public Empleado(Long idEmpleado, String nombre, String apellido, String area, String cargo) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.area = area;
		this.cargo = cargo;

	}

	public Empleado() {

	}

	public Long getIdEmpleado() {
		return idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getArea() {
		return area;
	}

	public String getCargo() {
		return cargo;
	}

	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
