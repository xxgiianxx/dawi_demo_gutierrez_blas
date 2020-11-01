package com.empresa.service;

import java.util.List;

import com.empresa.entity.Alumno;

public interface AlumnoService {

	public abstract List<Alumno> listarTodos();
	public abstract void registraActualizaAlumno(Alumno obj);
	public abstract void eliminaAlumno(int id);
	public abstract List<Alumno> buscaPorNombre(String filtro);

}
