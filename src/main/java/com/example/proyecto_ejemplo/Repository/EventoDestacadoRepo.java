package com.example.proyecto_ejemplo.Repository;

import com.example.proyecto_ejemplo.Entity.EventoDestacado;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventoDestacadoRepo extends CrudRepository <EventoDestacado, Integer> {

    List<EventoDestacado> findByMesId(int mes_id);
}
