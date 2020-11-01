package com.empresa.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empresa.entity.Alumno;
import com.empresa.service.AlumnoService;

@Controller
public class AlumnoController {

	@Autowired
	private AlumnoService service;
	
	@RequestMapping("/")
	public String verInicio() {
		return "crudAlumno";
	}
	
	@RequestMapping("/verCrudAlumno")
	public String ver() {
		return "crudAlumno";
	}
	
	@RequestMapping("/consultaCrudAlumno")
	public String consulta(String filtro, HttpSession session) {
		List<Alumno> data = service.buscaPorNombre(filtro +"%");
		session.setAttribute("alumnos", data);
		return "crudAlumno";
	}
	
	@RequestMapping("/registraActualizaCrudAlumno")
	public String registra(Alumno obj, HttpSession session) {
		service.registraActualizaAlumno(obj);
		return "redirect:salida";
	}
	
	@RequestMapping("/eliminaCrudAlumno")
	public String elimina(Integer id, HttpSession session) {
		service.eliminaAlumno(id);
		return "redirect:salida";
	}
	
	@RequestMapping("/salida")
	public String listarTodos(HttpSession session) {
		List<Alumno> data = service.listarTodos();
		session.setAttribute("alumnos", data);
		return "crudAlumno";
	}

	
	
}






