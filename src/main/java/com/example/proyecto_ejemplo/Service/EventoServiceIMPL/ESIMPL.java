package com.example.proyecto_ejemplo.Service.EventoServiceIMPL;

import com.example.proyecto_ejemplo.Entity.Evento;
import com.example.proyecto_ejemplo.Entity.EventoDestacado;
import com.example.proyecto_ejemplo.Repository.EventoRepo;
import com.example.proyecto_ejemplo.Repository.EventoDestacadoRepo;
import com.example.proyecto_ejemplo.Service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ESIMPL implements EventoService{

    @Autowired
    private EventoRepo repo;

    @Autowired
    private EventoDestacadoRepo destacadoRepo;
    @Override
    public List<Evento> consultarEvento(int centroId, int mesId) {
        return (List<Evento>) this.repo.findByCentroIdAndMesId(centroId, mesId);
    }

    @Override
    public List<EventoDestacado> consultarEventoDestacado(int mesId) {
        return (List<EventoDestacado>) this.destacadoRepo.findByMesId(mesId);
    }

    @Override
    public Evento crearEvento(Evento evento) {
        return this.repo.save(evento);
    }

    @Override
    public Evento modificarEvento(Evento evento) {
        return this.repo.save(evento);
    }

    @Override
    public void eliminarEvento(int id) {
        this.repo.deleteById(id);
    }

}
