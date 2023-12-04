package com.example.proyecto_ejemplo.Repository;

import com.example.proyecto_ejemplo.Entity.Evento;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface EventoRepo extends CrudRepository <Evento, Integer> {

    List<Evento> findByCentroIdAndMesId(int centro_id, int mes_id);
}
