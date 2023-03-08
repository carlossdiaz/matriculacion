package com.carlosdiaz.matriculacion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carlosdiaz.matriculacion.models.Alumno;
import com.carlosdiaz.matriculacion.services.AlumnoService;

@RestController
public class AlumnoController {
    @Autowired
    AlumnoService service;

    @GetMapping("/listar")
    List<Alumno> all(){
        return service.findAll();
    }

    @GetMapping("/listar/{codigo}")
    Alumno findAlumno(@PathVariable int codigo){
        return service.findById(codigo);
    }

    @DeleteMapping("/borrar/{codigo}")
    void deleteAlumno(@PathVariable int codigo){
        service.deleteById(codigo);
    }

    @PostMapping("/nuevo")
    Alumno guardar(@RequestBody Alumno alumno){
        service.save(alumno);
        return alumno;
    }

    @PutMapping("/modificar/{id}")
    void modificar(@PathVariable int id, @RequestBody Alumno alumno){
       
        service.update(id, alumno);
    

    }
    
}
