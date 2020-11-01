package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Alumno;
import com.empresa.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository repository;

	@Override
	public List<Alumno> listarTodos() {
		return repository.findAll();
	}

	@Override
	public void registraActualizaAlumno(Alumno obj) {
		repository.save(obj);
	}

	@Override
	public void eliminaAlumno(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<Alumno> buscaPorNombre(String filtro) {
		return repository.buscarPorNombre(filtro);
	}


}
