package com.example.proyecto_ejemplo.Repository;

import com.example.proyecto_ejemplo.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepo extends CrudRepository <Persona, Integer> {
    
}
