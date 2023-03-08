package com.carlosdiaz.matriculacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlosdiaz.matriculacion.models.Asignatura;
@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, String>{
    
} 
