package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

	
	@Query("Select a from Alumno a where nombre like :fil")
	public abstract List<Alumno> buscarPorNombre(@Param("fil") String filtro);
	
	
	
}
