package pe.edu.tecsup.alumnosapi.service;

import java.util.List;

import pe.edu.tecsup.alumnosapi.entity.Alumno;


public interface AlumnoService {

	public List<Alumno> findAllAlumno();
	
	public Alumno save(Alumno alumno);
	
	public Alumno editAlumno(Alumno alumno);
	
	void eliminarAlumno(Integer id);
	
	public Alumno findByAlumnoId(Integer id);
}
