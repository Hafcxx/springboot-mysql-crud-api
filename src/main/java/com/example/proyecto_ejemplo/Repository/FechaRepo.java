package com.example.proyecto_ejemplo.Repository;

import com.example.proyecto_ejemplo.Entity.Fecha;
import org.springframework.data.repository.CrudRepository;

public interface FechaRepo extends CrudRepository <Fecha, Integer> {
    
}
