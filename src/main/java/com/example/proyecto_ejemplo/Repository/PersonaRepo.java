package com.example.proyecto_ejemplo.Repository;

import com.example.proyecto_ejemplo.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepo extends CrudRepository <Persona, Integer> {
    
}
