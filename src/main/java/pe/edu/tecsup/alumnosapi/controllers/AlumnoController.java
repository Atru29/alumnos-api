package pe.edu.tecsup.alumnosapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.tecsup.alumnosapi.entity.Alumno;
import pe.edu.tecsup.alumnosapi.service.AlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;

	@GetMapping("/listarAlumnos")
	public List<Alumno> listarRegistrosAlumnos() {
		return alumnoService.findAllAlumno();
	}
	@PostMapping("/guardarAlumno")
    public Alumno saveAlumno(@RequestBody Alumno alumno) {
        return alumnoService.save(alumno);
    }

    @PutMapping("/editLibro")
    public Alumno editAlumno(@RequestBody Alumno alumno) {
        return alumnoService.editAlumno(alumno);
    }

    @DeleteMapping("/elminarAlumno/{id}")
    public void deleteAlumno(@PathVariable("id") Integer id) {
    	alumnoService.eliminarAlumno(id);
    }

    @GetMapping("/buscarAlumnoId/{id}")
    public Alumno alumnoPorId(@PathVariable("id") Integer id) {
        return alumnoService.findByAlumnoId(id);
    }
	
}
