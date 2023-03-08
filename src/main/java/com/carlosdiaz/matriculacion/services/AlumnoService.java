package com.carlosdiaz.matriculacion.services;

import java.util.List;

import com.carlosdiaz.matriculacion.models.Alumno;

public interface AlumnoService {
    public List<Alumno> findAll();
    public Alumno findById(int id);
    public void save(Alumno alumno);
    public void update(int id, Alumno alumno);
    public void deleteById(int id);
    public void deleteAll();
}
