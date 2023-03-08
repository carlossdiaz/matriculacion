package com.carlosdiaz.matriculacion.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosdiaz.matriculacion.models.Alumno;
import com.carlosdiaz.matriculacion.repositories.AlumnoRepository;
import com.carlosdiaz.matriculacion.services.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService{

    @Autowired
    AlumnoRepository repository;
    @Override
    public List<Alumno> findAll() {
        return repository.findAll();
    }

    @Override
    public Alumno findById(int id) {
        Optional<Alumno> findById = repository.findById(id);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public void save(Alumno alumno) {
        repository.save(alumno);
    }

    @Override
    public void update(int codigo, Alumno alumno) {
        this.findById(codigo);
        alumno.setCodigo(codigo);
        repository.save(alumno);
    }

    @Override
    public void deleteById(int codigo) {
        repository.deleteById(codigo);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
    
}
