package com.carlosdiaz.matriculacion.repositories;

import org.springframework.stereotype.Repository;

import com.carlosdiaz.matriculacion.models.Alumno;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
    
}
