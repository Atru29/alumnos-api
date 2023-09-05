package pe.edu.tecsup.alumnosapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.alumnosapi.entity.Alumno;
import pe.edu.tecsup.alumnosapi.repository.AlumnoRepository;
import pe.edu.tecsup.alumnosapi.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public List<Alumno> findAllAlumno() {
		return alumnoRepository.findAll();
	}

	@Override
	public Alumno save(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	@Override
	public Alumno editAlumno(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	@Override
	public void eliminarAlumno(Integer id) {
		alumnoRepository.deleteById(id);
	}

	@Override
	public Alumno findByAlumnoId(Integer id) {
		Optional<Alumno> alumnoOptional = alumnoRepository.findById(id);
		Alumno alumno = new Alumno();
		if (alumnoOptional.isPresent()) {
			return alumnoOptional.get();
		}else {
			throw new RuntimeException("No existe un Libro con el Id " + id);
		}
	}

}
