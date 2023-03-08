package com.carlosdiaz.matriculacion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.carlosdiaz.matriculacion.models.Asignatura;
import com.carlosdiaz.matriculacion.repositories.AlumnoRepository;
import com.carlosdiaz.matriculacion.repositories.AsignaturaRepository;

@SpringBootTest
class MatriculacionApplicationTests {

	@Autowired
	AlumnoRepository alumnoRepository;
	@Autowired
	AsignaturaRepository asignaturaRepository;

	@Test
	void crearAsignaturaTest(){
		Asignatura a1 = new Asignatura();
		a1.setCodigo("MAT");
		a1.setDescripcion("Matematicas");
		Asignatura a2 = new Asignatura();
		a2.setCodigo("LEN");
		a2.setDescripcion("Lengua");
		Asignatura a3 = new Asignatura();
		a3.setCodigo("ING");
		a3.setDescripcion("Ingles");
		Asignatura a4 = new Asignatura();
		a4.setCodigo("REL");
		a4.setDescripcion("Religion");
		Asignatura a5 = new Asignatura();
		a5.setCodigo("FIS");
		a5.setDescripcion("Fisica");
		Asignatura a6 = new Asignatura();
		a6.setCodigo("QUI");
		a6.setDescripcion("Quimica");

		a1= asignaturaRepository.save(a1);
		a2= asignaturaRepository.save(a2);
		a3= asignaturaRepository.save(a3);
		a4= asignaturaRepository.save(a4);
		a5= asignaturaRepository.save(a5);
		a6= asignaturaRepository.save(a6);
	}
}
