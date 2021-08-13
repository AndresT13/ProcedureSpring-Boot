package com.app.procedureMySql.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.procedureMySql.model.entity.Empleado;

@Repository
public interface IEmpleadoDao extends JpaRepository<Empleado, Long> {

	@Query(value = "{call list_procedure()}", nativeQuery = true)
	List<Empleado> listprocedure();

	@Query(value = "{call findById_procedure(:idIn) }", nativeQuery = true)
	Optional<Empleado> findByIdprocedure(@Param("idIn") Long idIN);

	@Query(value = "{call findByCargo_procedure(:cargoIn) }", nativeQuery = true)
	List<Empleado> findByCargoProcedure(@Param("cargoIn") String cargoIN);

	@Query(value = "{call save_procedure(:idIn, :apellidoIn, :areaIn, :cargoIn, :nombreIn) }", nativeQuery = true)
	void saveProcedure(@Param("idIn") Long idIN, @Param("apellidoIn") String apellidoIN, @Param("areaIn") String areaIN,
			@Param("cargoIn") String cargoIN, @Param("nombreIn") String nombreIN);


	@Query(value = "{call delete_procedure(:idIn) }", nativeQuery = true)
	void deleteProcedure(@Param("idIn") Long idIN);

}

