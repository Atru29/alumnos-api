package pe.edu.tecsup.alumnosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.tecsup.alumnosapi.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{

}
